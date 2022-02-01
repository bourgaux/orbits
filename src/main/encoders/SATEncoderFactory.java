package main.encoders;

import java.util.Set;

import main.Parameters.EncodingTypeContradictionPart;
import main.Parameters.RepairType;
import main.filters.AnswersFilter;

public abstract class SATEncoderFactory {
	protected AnswersFilter answersFilter;
	protected Set<String> setOfAnswersToCheck;
	protected RepairType repairType;
	protected EncodingTypeContradictionPart encodingContradiction;

	public SATEncoderFactory(RepairType repair,  EncodingTypeContradictionPart encoding) {
		repairType=repair;
		encodingContradiction=encoding;
	}
	
	public void setFilter(AnswersFilter filter) {
		answersFilter=filter;
	}

	public abstract SATEncoder createEncoder();
	
}
