package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Main;

public class TestNoPriority {
	String[] argsStandardIAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "IAR", "standard","generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsStandardBrave= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "brave", "standard","generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsNoPrioCqapri= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "standard","generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsNoPrioCqapriMaxsat= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "standard","generic_maxsat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsNoPrioCavsat= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "standard","generic_sat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsNoPrioCavsatMaxsat= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "standard","generic_maxsat_based", "cavsat_encoding", "FALSE", "FALSE", "sat4j"};
			
	String[] argsPrioScroreStructuredAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "pareto_all_reachable_encoding","generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioScroreStructuredIAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "IAR", "pareto_all_reachable_encoding","generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioScroreStructuredBrave= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "brave", "pareto_all_reachable_encoding","generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsPrioParetoAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioParetoIAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "IAR", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioParetoBrave= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "brave", "pareto_conf_of_conf_encoding", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};

	String[] argsPrioCompletionAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "AR", "completion", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioCompletionIAR= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "IAR", "completion", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioCompletionBrave= {"testInput/testNoPriority_conflictgraph.json","testInput/testNoPriority_answers_causes.json","testOutput/testNoPriority_output.json","testOutput/test_log.txt", "brave", "completion", "generic_sat_based", "cqapri_encoding", "FALSE", "FALSE", "sat4j"};

	
	@Test
	public void IAR() {	
		Main.main(argsStandardIAR);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsNoPrioCqapri);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsNoPrioCavsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertTrue(Main.outputAnswers.contains("ans1"));		
		Main.main(argsPrioParetoAR);
		assertTrue(Main.outputAnswers.contains("ans1"));		
		Main.main(argsPrioCompletionAR);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsPrioParetoIAR);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans1"));
		
		Main.main(argsPrioCompletionIAR);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans1"));
	}
	
	@Test
	public void notBrave() {		
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsStandardBrave);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		
		Main.main(argsNoPrioCqapri);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsNoPrioCavsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioParetoAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioCompletionAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioScroreStructuredBrave);
		assertFalse(Main.outputAnswers.contains("ans2"));
				
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioParetoBrave);
		assertFalse(Main.outputAnswers.contains("ans2"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioCompletionBrave);
		assertFalse(Main.outputAnswers.contains("ans2"));
	}
	
	@Test
	public void braveNotARWithOneInconsCause() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsNoPrioCqapri);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsNoPrioCavsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioParetoAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioCompletionAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans3"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans3"));
	}
	
	@Test
	public void IARThanksToSelfInconsistentConflict() {
		Main.main(argsStandardIAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsNoPrioCqapri);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsNoPrioCavsat);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsPrioParetoAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsPrioCompletionAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsPrioParetoIAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans4"));
		
		Main.main(argsPrioCompletionIAR);
		assertTrue(Main.outputAnswers.contains("ans4"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans4"));
	}
	
	@Test
	public void AR1() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsNoPrioCqapri);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsNoPrioCavsat);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsPrioParetoAR);
		assertTrue(Main.outputAnswers.contains("ans5"));
		Main.main(argsPrioCompletionAR);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans5"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans5"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans5"));
	}
	
	@Test
	public void AR2() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsNoPrioCqapri);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsNoPrioCavsat);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsPrioParetoAR);
		assertTrue(Main.outputAnswers.contains("ans6"));
		Main.main(argsPrioCompletionAR);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans6"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans6"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans6"));
	}
	
	@Test
	public void AR3() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsNoPrioCqapri);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsNoPrioCavsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsPrioParetoAR);
		assertTrue(Main.outputAnswers.contains("ans9"));
		Main.main(argsPrioCompletionAR);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans9"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans9"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans9"));
	}

	@Test
	public void braveNotAR() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsNoPrioCqapri);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsNoPrioCavsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertFalse(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsPrioParetoAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsPrioCompletionAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans7"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans7"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans7"));
	}
	
	@Test
	public void notBraveWithOnlyCausesWithSelfIncons() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsStandardBrave);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsNoPrioCqapri);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsNoPrioCavsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsPrioParetoAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsPrioCompletionAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsPrioScroreStructuredBrave);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsPrioParetoBrave);
		assertFalse(Main.outputAnswers.contains("ans8"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans8"));
		Main.main(argsPrioCompletionBrave);
		assertFalse(Main.outputAnswers.contains("ans8"));
	}
	
	@Test
	public void BraveNotARForSeveralIterationMaxSat() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsNoPrioCqapri);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsNoPrioCavsat);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertFalse(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsPrioParetoAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsPrioCompletionAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans10"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans10"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans10"));
	}
	
	@Test
	public void BraveNotARForSeveralIterationMaxSat2() {
		Main.main(argsStandardIAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsStandardBrave);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsNoPrioCqapri);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsNoPrioCqapriMaxsat);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsNoPrioCavsat);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsNoPrioCavsatMaxsat);
		assertFalse(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsPrioScroreStructuredAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsPrioParetoAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsPrioCompletionAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsPrioScroreStructuredIAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsPrioScroreStructuredBrave);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsPrioParetoIAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsPrioParetoBrave);
		assertTrue(Main.outputAnswers.contains("ans11"));
		
		Main.main(argsPrioCompletionIAR);
		assertFalse(Main.outputAnswers.contains("ans11"));
		Main.main(argsPrioCompletionBrave);
		assertTrue(Main.outputAnswers.contains("ans11"));
	}


}
