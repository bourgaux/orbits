package main.encoders.iar;

import main.encoders.ContradictionEncoder.SingleCauseContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class IARScoreStructuredOptiCavsatEncoder extends IAREncoder {	
	
	public IARScoreStructuredOptiCavsatEncoder(AnswersFilter answersFilter) {
		super(answersFilter);		
	}

	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructScoreStructuredOptiMaximalityPart;
    }

	protected SingleCauseContradictionClausesBuilder returnConstructCauseContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingIARCauseBySelectingMissingAssertion;
	}
}
