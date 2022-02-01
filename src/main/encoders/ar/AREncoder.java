package main.encoders.ar;

import main.encoders.ConsistencyEncoder;
import main.encoders.ContradictionEncoder;
import main.encoders.SATEncoder;
import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.filters.AnswersFilter;

public abstract class AREncoder extends SATEncoder {
	
	protected ConsistencyEncoder consistencyEncoder;
	protected ContradictionEncoder queryContradictionEncoder;

	public AREncoder(AnswersFilter answersFilter) {
		super(answersFilter);
		consistencyEncoder= new ConsistencyEncoder(this, this.filter);		
		queryContradictionEncoder= new ContradictionEncoder(this, this.filter, encodingForSeveralElem);	
	}
	
	abstract ContradictionClausesBuilder returnConstructContradictionPart();	
	
}
