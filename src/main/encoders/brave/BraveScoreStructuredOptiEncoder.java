package main.encoders.brave;

import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class BraveScoreStructuredOptiEncoder extends BraveEncoder {
	
	public BraveScoreStructuredOptiEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}
		
	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructScoreStructuredOptiMaximalityPart;
    }
}
