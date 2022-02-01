package main.encoders.brave;

import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class BraveParetoEncoder extends BraveEncoder {

	public BraveParetoEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}

	protected MaximalityClausesBuilder returnConstructMaxPart() {
		return maximalityEncoder::constructParetoMaximalityPart;
	}
}
