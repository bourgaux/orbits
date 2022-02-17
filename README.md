# ORBITS - Optimal Repair-Based Inconsistency-Tolerant Semantics

ORBITS is a standalone tool for filtering answers that hold under a given inconsistency-tolerant semantics among AR, IAR and brave with standard repairs or Pareto- or completion-optimal repairs in the case where a priority relation between the conflicting facts is given. 
ORBITS implements a variety of algorithms and propositional encoding variants for each semantics and type of repairs. 
The description of the semantics, repair types, encoding variants and algorithms are given in a technical report available on [arXiv](https://arxiv.org/abs/2202.07980). 
Data used in the experimental evaluation of ORBITS is available on [Zenodo](https://zenodo.org/record/5947125) (DOI 10.5281/zenodo.5946827).

ORBITS takes as input two JSON files containing respectively the conflict graph (directed by the priority relation) and the candidate answers associated to their causes. Examples of such files can be found in the directory `testInput`. 
Conflict graph files contain lists of directed edges stored as follows: 

`fact : [ list of facts of greater or same priority ]` 

Maps of answers to causes contain lists of answers mapped to their causes as follows:

`answer : [ list of causes ]` with causes of the form `[list of cause facts]`

Note that for plain AR semantics, the conflict graph has to be without priority relationship (i.e. for all facts `a` and `b`, if the conflict graph contains `a:[...b...]`, it also contains `b:[...a...]` ). 

ORBITS outputs a JSON file containing the answers that hold under the required semantics. 


## Installation

**Prerequisites:** java with JDK 1.8 or greater and Maven (or Eclipse IDE supporting Maven). 

** If you want to test ORBITS without installing Maven, you can use the runnable jar `orbits.jar` available in this directory **

Clone this repository: 

`$ git clone https://github.com/bourgaux/orbits.git`

Then either directly build a runnable jar file with Maven or import the Maven project in Eclipse.

### To build runnable jar file through command line

Go to the root of the project and launch:

`$ mvn install`

A jar named `orbits-1.1.jar` will be generated in directory `target`.

### To import and run the project with Eclipse

Select `File>Import>Maven>Existing Maven Projects` and select the `orbits` directory and the `pom.xml` file.

Update (Right-click the project and select `Maven>Update Project`) then run class `main.Main`.

## Use 

There are two ways of passing the input files and choosing the semantics and algorithms to use: either directly write the arguments in `src/main/Parameters.java`, or pass them through the command line. If the number of arguments given in the command line is different from 11, they are disregarded and those in `src/main/Parameters.java` are used.

The arguments are the following:

- *conflictGraphFile*: path to conflict graph file. 
- *potentialAnswersAndCausesFile*: path to file containing map of answers to their causes. 
- *outputFile*: path to file where answers true under the required semantics will be written if parameter *printAnswers* is set to true. 
- *statLogFile*: path to file where statistic (number of answers, run times, possibly statistics about encodings sizes) will be written. 
- *semantics*: among `AR`, `IAR` and `brave`.
- *repairType*: among `standard`, `pareto_all_reachable_encoding`, `pareto_conf_of_conf_encoding` and `completion`. 
- *algo*: choose an algorithm compatible with the chosen semantics and repair type among `generic_sat_based`, `generic_maxsat_based`, `generic_muses_based`, `generic_assumptions_based`, `cause_by_cause` (for IAR or brave semantics only), `iar_cause_checking_each_fact` (for IAR semantics only), `iar_facts_maxsat` (for IAR semantics only). 
- *encodingContradiction*: `cqapri_encoding` or `cavsat_encoding` (for AR or IAR semantics only). 
- *printAnswers*: `TRUE` to print the answers that hold under the required semantics, `FALSE` to only print statistics (see *outputFile* and *statLogFile*). 
- *printDetails*: `TRUE` to print details about sizes of encodings and times to encode and solve the problems. 
- *solver*: use `sat4j` by default. It is possible to use a standalone Maxsat solver (`sat4j_standalone` or `maxhs`) for `generic_maxsat_based` algorithm, provided this Maxsat solver is installed.

### Passing arguments through the command line

`$ java -jar orbits-1.1.jar <conflictGraphFile> <potentialAnswersAndCausesFile> <outputFile> <statLogFile> <semantics> <repairType> <algo> <encodingContradiction> <printAnswers> <printDetails> <solver>`

**Example:** Assuming `orbits-1.1.jar` has been generated in directory `target` by command `mvn install`, go to the root of the project and launch:

`$ java -jar target/orbits-1.1.jar testInput/testPriorityScoreStructured_conflictgraph.json testInput/testPriorityScoreStructured_answers_causes.json testOutput/testPriorityScoreStructured_output.json testOutput/test_log.txt AR pareto_all_reachable_encoding generic_sat_based cqapri_encoding TRUE FALSE sat4j`

### Writing arguments directly in src/main/Parameters.java 

Edit the `src/main/Parameters.java` file by replacing the test arguments with the arguments you want to use. The possible values of *semantics*, *repairType*, *algo*, *encodingContradiction* and *solver* are given in this same file by the enumerations `Semantics`, `RepairType`, `Algorithm`, `EncodingTypeContradictionPart` and `Solvers`. 
Then either generate a runnable jar and run it without passing any arguments, or directly compile the project and run main class `main.Main`.


## Directories

- `src/main` contains the java source code of ORBITS. 
- `src/test` contains some tests.
- `testInput` contains several conflict graphs and files of answers and causes. 
- `testOutput` is the directory in which output files are produced by the tests.
- `solverFiles` is the directory where solver input and output files will be produced in the case where a standalone Maxsat solver is used.

