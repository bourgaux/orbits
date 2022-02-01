package main.encoders.ar;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class ARCompletionCqapriEncoder extends ARPrioEncoder {

	public ARCompletionCqapriEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}
	
	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructCompletionMaximalityPart;
    }

	protected ContradictionClausesBuilder returnConstructContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingCausesWithConflicts;
	}
	
}
