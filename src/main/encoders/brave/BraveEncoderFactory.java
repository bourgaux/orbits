package main.encoders.brave;

import main.Parameters.EncodingTypeContradictionPart;
import main.Parameters.RepairType;
import main.Parameters.Semantics;
import main.encoders.SATEncoder;
import main.encoders.SATEncoderFactory;


public class BraveEncoderFactory extends SATEncoderFactory {

	public BraveEncoderFactory(RepairType repair, EncodingTypeContradictionPart encoding) {
		super(repair, encoding);
	}

	@Override
	public SATEncoder createEncoder() {
		switch(encodingContradiction) {
		case cqapri_encoding:
			switch(repairType) {
			case standard:
				System.out.println(RepairType.standard.toString() + " is not compatible with semantics " + Semantics.brave.toString());
				break;
			case pareto_all_reachable_encoding:			
				return new BraveScoreStructuredOptiEncoder(answersFilter);						
			case pareto_conf_of_conf_encoding:
				return new BraveParetoEncoder(answersFilter);
			case completion:
				return new BraveCompletionEncoder(answersFilter);
			default:
				System.out.println("unsupported repair type");
				break;
			}
			break;
		case cavsat_encoding:
			System.out.println(EncodingTypeContradictionPart.cavsat_encoding.toString() + " is not compatible with semantics "+ Semantics.brave.toString());
			break;
		default:
			System.out.println("unsupported encoding");
			break;
		}
		return null;
	}	
}
