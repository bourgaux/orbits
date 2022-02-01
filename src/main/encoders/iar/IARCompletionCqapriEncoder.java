package main.encoders.iar;

import main.encoders.ContradictionEncoder.SingleCauseContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class IARCompletionCqapriEncoder extends IAREncoder {	
	
	public IARCompletionCqapriEncoder(AnswersFilter answersFilter) {
		super(answersFilter);		
	}

	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructCompletionMaximalityPart;
    }
	
	protected SingleCauseContradictionClausesBuilder returnConstructCauseContradictionPart() {
		return queryContradictionEncoder::contradictCauseWithConflicts;
	}

}
