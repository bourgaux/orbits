package main.encoders.iar;

import main.Parameters.EncodingTypeContradictionPart;
import main.Parameters.RepairType;
import main.Parameters.Semantics;
import main.encoders.SATEncoder;
import main.encoders.SATEncoderFactory;


public class IAREncoderFactory extends SATEncoderFactory {

	public IAREncoderFactory(RepairType repair, EncodingTypeContradictionPart encoding) {
		super(repair, encoding);
	}

	@Override
	public SATEncoder createEncoder() {
		switch(repairType) {
		case standard:
			System.out.println(RepairType.standard.toString() + " is not compatible with semantics " + Semantics.IAR.toString());
			break;
		case pareto_all_reachable_encoding:			
			switch(encodingContradiction) {
			case cqapri_encoding:
				return new IARScoreStructuredOptiCqapriEncoder(answersFilter);
			case cavsat_encoding:
				return new IARScoreStructuredOptiCavsatEncoder(answersFilter);
			default:
				System.out.println("unsupported encoding type");
				break;
			}
			break;
		case pareto_conf_of_conf_encoding:
			switch(encodingContradiction) {
			case cqapri_encoding:
				return new IARParetoCqapriEncoder(answersFilter);
			case cavsat_encoding:
				return new IARParetoCavsatEncoder(answersFilter);
			default:
				System.out.println("unsupported encoding type");
				break;
			}
			break;
		case completion:
			switch(encodingContradiction) {
			case cqapri_encoding:
				return new IARCompletionCqapriEncoder(answersFilter);
			case cavsat_encoding:
				return new IARCompletionCavsatEncoder(answersFilter);
			default:
				System.out.println("unsupported encoding type");
				break;
			}
			break;
		default:
			System.out.println("unsupported repair type");
			break;
		}
		return null;
	}	
}
