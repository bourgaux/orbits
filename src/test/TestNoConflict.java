package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Main;

public class TestNoConflict {
	String[] argsIAR= {"testInput/testNoConflict_conflictgraph.json","testInput/testNoConflict_answers_causes.json","testOutput/testNoConflict_output.json","testOutput/test_log.txt", "IAR", "standard", "generic_sat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsBrave= {"testInput/testNoConflict_conflictgraph.json","testInput/testNoConflict_answers_causes.json","testOutput/testNoConflict_output.json","testOutput/test_log.txt", "brave", "standard", "generic_sat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	
	String[] argsNoPrio= {"testInput/testNoConflict_conflictgraph.json","testInput/testNoConflict_answers_causes.json","testOutput/testNoConflict_output.json","testOutput/test_log.txt", "AR", "standard", "generic_sat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioPareto= {"testInput/testNoConflict_conflictgraph.json","testInput/testNoConflict_answers_causes.json","testOutput/testNoConflict_output.json","testOutput/test_log.txt", "AR", "pareto_conf_of_conf_encoding", "generic_sat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	String[] argsPrioCompletion= {"testInput/testNoConflict_conflictgraph.json","testInput/testNoConflict_answers_causes.json","testOutput/testNoConflict_output.json","testOutput/test_log.txt", "AR","completion", "generic_sat_based","cqapri_encoding", "FALSE", "FALSE", "sat4j"};
	
	@Test
	public void answerWithTwoCauses() {		
		Main.main(argsIAR);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsNoPrio);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsPrioPareto);
		assertTrue(Main.outputAnswers.contains("ans1"));
		Main.main(argsPrioCompletion);
		assertTrue(Main.outputAnswers.contains("ans1"));
	}
	
	@Test
	public void answerWithEmptyCause() {
		Main.main(argsIAR);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsBrave);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsNoPrio);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioPareto);
		assertTrue(Main.outputAnswers.contains("ans2"));
		Main.main(argsPrioCompletion);
		assertTrue(Main.outputAnswers.contains("ans2"));
	}
	
	@Test
	public void answerWithoutCause() {
		Main.main(argsIAR);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsBrave);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsNoPrio);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioPareto);
		assertFalse(Main.outputAnswers.contains("ans3"));
		Main.main(argsPrioCompletion);
		assertFalse(Main.outputAnswers.contains("ans3"));
	}

}
