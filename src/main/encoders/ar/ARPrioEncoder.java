package main.encoders.ar;

import java.util.HashSet;
import java.util.Set;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.encoders.MaximalityEncoder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public abstract class ARPrioEncoder extends AREncoder {
		
	protected MaximalityEncoder maximalityEncoder;

	public ARPrioEncoder(AnswersFilter answersFilter) {
		super(answersFilter);		
		maximalityEncoder= new MaximalityEncoder(this, this.filter);		
	}

	protected void buildClauses() {	
		buildClauses(returnConstructMaxPart(), returnConstructContradictionPart());
	}

	private void buildClauses(MaximalityClausesBuilder maximalityClausesBuilder, ContradictionClausesBuilder contradictionClausesBuilder) {	
		contradictionClausesBuilder.constructContradictionPart();
		Set<String> assertionsToConsider=new HashSet<String>();
		assertionsToConsider.addAll(assertionToDimac.keySet());
		maximalityClausesBuilder.constructMaximalityPart(assertionsToConsider);
		consistencyEncoder.buildConsistencyClauses();	
	}
	
	abstract MaximalityClausesBuilder returnConstructMaxPart();
}
