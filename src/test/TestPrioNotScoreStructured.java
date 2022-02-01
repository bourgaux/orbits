package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Main;

public class TestPrioNotScoreStructured {
	
	String[] argsIAR= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "standard", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBrave= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "standard", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	
	
	String[] argsARParetoSatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMaxsatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_maxsat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMusesCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_muses_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoAssumpCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_assumptions_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoSatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMaxsatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_maxsat_based","cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMusesCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_muses_based","cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoAssumpCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_assumptions_based","cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsIARParetoSatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_sat_based","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMaxsatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_maxsat_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMusesCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_muses_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAssumpCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_assumptions_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByCauseCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "cause_by_cause","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByAssertionCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "iar_cause_checking_each_assertion","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAllAssertionCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "iar_assertions_maxsat","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoSatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_sat_based","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMaxsatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_maxsat_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMusesCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_muses_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAssumpCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "generic_assumptions_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByCauseCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "cause_by_cause","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByAssertionCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "iar_cause_checking_each_assertion","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAllAssertionCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_conf_of_conf_encoding", "iar_assertions_maxsat","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	
	String[] argsBraveParetoSatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "pareto_conf_of_conf_encoding", "generic_sat_based","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsBraveParetoMaxsatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "pareto_conf_of_conf_encoding", "generic_maxsat_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};	
	String[] argsBraveParetoMusesCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "pareto_conf_of_conf_encoding", "generic_muses_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};	
	String[] argsBraveParetoAssumpCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "pareto_conf_of_conf_encoding", "generic_assumptions_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};	
	String[] argsBraveParetoCauseByCauseCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "pareto_conf_of_conf_encoding", "cause_by_cause","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	
	
	String[] argsARCompletionSatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion","generic_sat_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMaxsatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion", "generic_maxsat_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMusesCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion", "generic_muses_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionAssumpCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion", "generic_assumptions_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionSatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion","generic_sat_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMaxsatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion", "generic_maxsat_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMusesCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion", "generic_muses_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionAssumpCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "AR", "completion", "generic_assumptions_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	
	String[] argsIARCompletionSatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_sat_based","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMaxsatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_maxsat_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMusesCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_muses_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAssumpCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_assumptions_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByCauseCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "cause_by_cause","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByAssertionCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "iar_cause_checking_each_assertion","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAllAssertionCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "iar_assertions_maxsat","cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionSatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_sat_based","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMaxsatCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_maxsat_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMusesCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_muses_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAssumpCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_assumptions_based", "cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByCauseCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "cause_by_cause","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByAssertionCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "iar_cause_checking_each_assertion","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAllAssertionCavsat= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "IAR", "completion", "iar_assertions_maxsat","cavsat_encoding","FALSE", "FALSE", "sat4j"};
	
	String[] argsBraveCompletionSatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "completion","generic_sat_based", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionMaxsatCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "completion", "generic_maxsat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionMusesCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "completion", "generic_muses_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionAssumpCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "completion", "generic_assumptions_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionCauseByCauseCqapri= {"testInput/testPriorityNotScoreStructured_conflictgraph.json","testInput/testPriorityNotScoreStructured_answers_causes.json","testOutput/testPriorityNotScoreStructured_output.json","testOutput/test_log.txt", "brave", "completion", "cause_by_cause", "cqapri_encoding","FALSE", "FALSE", "sat4j"};
	
	@Test
	public void CompletionAR_ParetoBrave() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
				
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
					
		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
						
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
	}
	
	@Test
	public void CompletionIAR_ParetoBrave() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
			
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));

		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans2"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans2"));
	}
	
	@Test
	public void CompletionIAR_ParetoBrave_2() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
				
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
	
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
				
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
				
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans3"));
	}
	
	@Test
	public void CompletionNotBrave_ParetoBrave_1() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));

		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));

		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));

		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
	
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
				
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
	}
	
	@Test
	public void CompletionNotBrave_ParetoBrave_2() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
				
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
				
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
				
		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
	}
	
	@Test
	public void CompletionBrave_ParetoBrave() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
				
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));

		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));

		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));

		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
	}
	
	@Test
	public void CompletionIAR_ParetoAR() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));	
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));	
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));

		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));

		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));

		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
	}
	
	@Test
	public void CompletionNotBrave_ParetoNotBrave() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));	
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));	
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));

		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));

		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));

		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
	}
	
	@Test
	public void NotBraveIncons() {	
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBrave);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));

		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));

		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));

		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans9"));
	}
	
	@Test
	public void CompletionIAR_ParetoIAR() {
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));	
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));	
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
				
		Main.main(argsIARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
	
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsIARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
	}

}
