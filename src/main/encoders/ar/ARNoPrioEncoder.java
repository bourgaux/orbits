package main.encoders.ar;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.filters.AnswersFilter;

public abstract class ARNoPrioEncoder extends AREncoder {

	public ARNoPrioEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}

	protected void buildClauses() {	
		buildClauses(returnConstructContradictionPart());
	}

	protected void buildClauses(ContradictionClausesBuilder contradictionClausesBuilder) {	
		contradictionClausesBuilder.constructContradictionPart();
		consistencyEncoder.buildConsistencyClauses();	
	}	
}
