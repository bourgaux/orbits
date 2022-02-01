package main.encoders.brave;

import java.util.HashSet;
import java.util.Set;

import main.encoders.ConsistencyEncoder;
import main.encoders.MaximalityEncoder;
import main.encoders.SATEncoder;
import main.encoders.SomeCauseEncoder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;
import main.filters.CauseByCauseFilter;

public abstract class BraveEncoder extends SATEncoder{
	private ConsistencyEncoder consistencyEncoder;
	protected SomeCauseEncoder someCauseEncoder;
	protected MaximalityEncoder maximalityEncoder;
	
	public BraveEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
		consistencyEncoder= new ConsistencyEncoder(this, this.filter);
		maximalityEncoder= new MaximalityEncoder(this, this.filter);
		someCauseEncoder = new SomeCauseEncoder(this, this.filter, 
				encodingForSeveralElem, answersFilter instanceof CauseByCauseFilter);
	}
	
	protected void buildClauses() {	
		buildClauses(returnConstructMaxPart());
	}
	
	private void buildClauses(MaximalityClausesBuilder maximalityClausesBuilder) {
		someCauseEncoder.buildSomeCauseClauses();
		Set<String> assertionsToConsider=new HashSet<String>();		
		assertionsToConsider.addAll(assertionToDimac.keySet());
		maximalityClausesBuilder.constructMaximalityPart(assertionsToConsider);
		consistencyEncoder.buildConsistencyClauses();	
	}
	
	abstract MaximalityClausesBuilder returnConstructMaxPart();
	
}
