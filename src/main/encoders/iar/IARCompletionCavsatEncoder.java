package main.encoders.iar;

import main.encoders.ContradictionEncoder.SingleCauseContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class IARCompletionCavsatEncoder extends IAREncoder {	
	
	public IARCompletionCavsatEncoder(AnswersFilter answersFilter) {
		super(answersFilter);			
	}

	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructCompletionMaximalityPart;
    }
	
	protected SingleCauseContradictionClausesBuilder returnConstructCauseContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingIARCauseBySelectingMissingAssertion;
	}

}
