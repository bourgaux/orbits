package main.encoders.ar;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.filters.AnswersFilter;

public class ARNoPrioCqapriEncoder extends ARNoPrioEncoder {
	
	public ARNoPrioCqapriEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}

	protected ContradictionClausesBuilder returnConstructContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingCausesWithConflicts;
	}

}
