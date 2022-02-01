package main.encoders.ar;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.filters.AnswersFilter;

public class ARNoPrioCavsatEncoder extends ARNoPrioEncoder {

	public ARNoPrioCavsatEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}
	
	protected ContradictionClausesBuilder returnConstructContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingCausesBySelectingMissingAssertion;
	}

}
