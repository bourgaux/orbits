package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Main;

public class TestPrioScoreStructured {

	String[] argsARScroreStructuredSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredSatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredMaxsatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredMusesCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_muses_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARScroreStructuredAssumpCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_all_reachable_encoding", "generic_assumptions_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsIARScroreStructuredSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_all_reachable_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredCauseByCauseCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "cause_by_cause", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredCauseByAssertionCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "iar_cause_checking_each_assertion", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredAllAssertionCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "iar_assertions_maxsat", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredSatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR","pareto_all_reachable_encoding", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredMaxsatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredMusesCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "generic_muses_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredAssumpCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "generic_assumptions_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredCauseByCauseCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "cause_by_cause", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredCauseByAssertionCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "iar_cause_checking_each_assertion", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARScroreStructuredAllAssertionCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding", "iar_assertions_maxsat", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsBraveScroreStructuredSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_all_reachable_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveScroreStructuredMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_all_reachable_encoding", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveScroreStructuredMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_all_reachable_encoding", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveScroreStructuredAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_all_reachable_encoding", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveScroreStructuredCauseByCauseCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_all_reachable_encoding", "cause_by_cause", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};

	String[] argsARParetoSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoSatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMaxsatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoMusesCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_muses_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARParetoAssumpCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "pareto_conf_of_conf_encoding", "generic_assumptions_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsIARParetoSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByCauseCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "cause_by_cause", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByAssertionCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "iar_cause_checking_each_assertion", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAllAssertionCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "iar_assertions_maxsat", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoSatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMaxsatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoMusesCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_muses_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAssumpCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "generic_assumptions_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByCauseCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "cause_by_cause", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoCauseByAssertionCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "iar_cause_checking_each_assertion", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARParetoAllAssertionCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "pareto_conf_of_conf_encoding", "iar_assertions_maxsat", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsBraveParetoSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveParetoMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_conf_of_conf_encoding", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveParetoMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_conf_of_conf_encoding", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveParetoAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_conf_of_conf_encoding", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveParetoCauseByCauseCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "pareto_conf_of_conf_encoding", "cause_by_cause", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsARCompletionSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionSatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMaxsatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionMusesCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_muses_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsARCompletionAssumpCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","AR", "completion", "generic_assumptions_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsIARCompletionSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByCauseCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "cause_by_cause", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByAssertionCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "iar_cause_checking_each_assertion", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAllAssertionCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "iar_assertions_maxsat", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionSatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMaxsatCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionMusesCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_muses_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAssumpCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "generic_assumptions_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByCauseCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "cause_by_cause", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionCauseByAssertionCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "iar_cause_checking_each_assertion", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsIARCompletionAllAssertionCavsat= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","IAR", "completion", "iar_assertions_maxsat", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsBraveCompletionSatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "completion", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionMaxsatCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "completion", "generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionMusesCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "completion", "generic_muses_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionAssumpCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "completion", "generic_assumptions_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBraveCompletionCauseByCauseCqapri= {"testInput/testPriorityScoreStructured_conflictgraph.json","testInput/testPriorityScoreStructured_answers_causes.json","testOutput/testPriorityScoreStructured_output.json", "testOutput/test_log.txt","brave", "completion", "cause_by_cause", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	

	@Test
	public void notBraveIncons() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
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
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionAssumpCqapri);
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
	
				
		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));

		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARParetoAssumpCavsat);
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
		

		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans1"));
		Main.main(argsARCompletionAssumpCavsat);
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
	}
	
	@Test
	public void notBraveCons1() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));

		
		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));

		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
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

		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
	}
	
	@Test
	public void notBraveCons2() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
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
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));

		
		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));

		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
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

		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
	}
	
	@Test
	public void braveNotAR1() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
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
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoAssumpCqapri);
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
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionAssumpCqapri);
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

		
		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));

		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARParetoAssumpCavsat);
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

		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans4"));
		Main.main(argsARCompletionAssumpCavsat);
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
	}
	
	@Test
	public void braveNotAR2() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
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
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoAssumpCqapri);
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
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionAssumpCqapri);
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
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));

		
		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARParetoAssumpCavsat);
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
		

		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsARCompletionAssumpCavsat);
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
	}
	
	@Test
	public void braveNotAR3() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
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
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoAssumpCqapri);
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
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionAssumpCqapri);
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
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		

		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARParetoAssumpCavsat);
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

		
		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsARCompletionAssumpCavsat);
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
	}
	
	@Test
	public void braveNotAR4() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans15"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		

		Main.main(argsARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		

		Main.main(argsARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans15"));
	}
	
	@Test
	public void ARnotIAR1() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		
		
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
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoAssumpCqapri);
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
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARParetoAssumpCavsat);
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
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
	}
	
	@Test
	public void ARnotIAR2() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
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
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
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
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
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
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans8"));
		
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
	}
	
	@Test
	public void ARnotIAR3() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsIARParetoSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionMusesCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertFalse(Main.outputAnswers.contains("ans14"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsIARParetoSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans14"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionMusesCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertFalse(Main.outputAnswers.contains("ans14"));
	}
	
	@Test
	public void IAR1() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsIARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsIARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
	}
	
	@Test
	public void IAR2() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
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
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoAssumpCqapri);
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
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionAssumpCqapri);
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
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARParetoAssumpCavsat);
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
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans10"));
		Main.main(argsARCompletionAssumpCavsat);
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
	}
	
	@Test
	public void IAR3() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsIARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		

		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans11"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsIARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans11"));
	}
	
	@Test
	public void IAR4() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsIARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans12"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsIARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans12"));
	}
	
	@Test
	public void IAR5() {	
		Main.main(argsBraveScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsIARScroreStructuredSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		
		Main.main(argsBraveParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsIARParetoSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		
		Main.main(argsBraveCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsBraveCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsIARCompletionSatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionMaxsatCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionMusesCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionAssumpCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionCauseByCauseCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionCauseByAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionAllAssertionCqapri);
		assertTrue(Main.outputAnswers.contains("ans13"));
		

		Main.main(argsARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsIARScroreStructuredSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARScroreStructuredAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		

		Main.main(argsARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsIARParetoSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARParetoAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		

		Main.main(argsARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		
		Main.main(argsIARCompletionSatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionMaxsatCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionMusesCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionAssumpCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionCauseByCauseCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionCauseByAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
		Main.main(argsIARCompletionAllAssertionCavsat);
		assertTrue(Main.outputAnswers.contains("ans13"));
	}

}
