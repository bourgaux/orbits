package main.encoders.ar;

import main.encoders.ContradictionEncoder.ContradictionClausesBuilder;
import main.encoders.MaximalityEncoder.MaximalityClausesBuilder;
import main.filters.AnswersFilter;

public class ARParetoCqapriEncoder extends ARPrioEncoder {
	
	public ARParetoCqapriEncoder(AnswersFilter answersFilter) {
		super(answersFilter);
	}
	
	protected MaximalityClausesBuilder returnConstructMaxPart() {
        return maximalityEncoder::constructParetoMaximalityPart;
    }

	protected ContradictionClausesBuilder returnConstructContradictionPart() {
		return queryContradictionEncoder::buildClausesContradictingCausesWithConflicts;
	}
	
}
