package main.encoders.ar;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class ARScoreStructuredOptiCavsatEncoder extends ARPrioEncoder {

	public ARScoreStructuredOptiCavsatEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}

	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructScoreStructuredOptiMaximalityPart;
    }

	protected ContradictionClausesBuilder returnConstructContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingCausesBySelectingMissingAssertion;
	}

}
