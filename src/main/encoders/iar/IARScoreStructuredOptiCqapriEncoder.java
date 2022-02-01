package main.encoders.iar;

import main.encoders.ContradictionEncoder.SingleCauseContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class IARScoreStructuredOptiCqapriEncoder extends IAREncoder {	
	
	public IARScoreStructuredOptiCqapriEncoder(AnswersFilter answersFilter) {
		super(answersFilter);		
	}

	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructScoreStructuredOptiMaximalityPart;
    }

	protected SingleCauseContradictionClausesBuilder returnConstructCauseContradictionPart() {
		return queryContradictionEncoder::contradictCauseWithConflicts;
	}
}
