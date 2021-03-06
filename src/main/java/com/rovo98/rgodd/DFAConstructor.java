package com.rovo98.rgodd;

/**
 * Interface defines the behaviors of RandomDFAConstructors.
 *
 * @author rovo98
 * @version 1.0.0
 * @since 2019-12-21
 */
public interface DFAConstructor {

    /**
     * Returns a constructed random DFA
     *
     * @param minXNum     the minimum number of the states in DFA.
     * @param maxXNum     the maximum number of the states in DFA.
     * @param multiFaulty control to whether to use multiply faulty mode or not.
     * @return constructed random DFA.
     */
    DFANode constructRandomDFA(int minXNum, int maxXNum, boolean multiFaulty);

    /**
     * Returns a constructed random DFA, and also saves its configurations to specified file.
     *
     * @param minXNum     the minimum number of the states in DFA.
     * @param maxXNum     the maximum number of the states in DFA.
     * @param multiFaulty control to whether to use multiply faulty mode or not.
     * @param saveConfig  control to whether to save the configurations or not.
     * @return A constructed random DFA.
     */
    DFANode constructRandomDFA(int minXNum, int maxXNum, boolean multiFaulty, boolean saveConfig);

    /**
     * Modification of the {@code constructRandomDFA} method, which adds an extra normal component
     * for every faulty component.
     *
     * @param minXNum     the minimum number of the states in DFA (without extra component).
     * @param maxXNum     the maximum number of the states in DFA (without extra component).
     * @param multiFaulty control to whether to use multiply faulty mode or not.
     * @return A constructed random DFA with extra normal component.
     */
    DFANode constructRandomDFAExtraNormal(int minXNum, int maxXNum, boolean multiFaulty);

    /**
     * Modification of the {@code constructRandomDFA} method, which adds an extra normal component
     * for every faulty component.
     *
     * @param minXNum     the minimum number of the states in DFA (without extra component).
     * @param maxXNum     the maximum number of the states in DFA (without extra component).
     * @param multiFaulty control to whether to apply multiply faulty mode or not.
     * @param saveConfig  control to whether to save the configurations of the constructed dfa or not.
     * @return A constructed random DFA with extra normal component.
     */
    DFANode constructRandomDFAExtraNormal(int minXNum, int maxXNum,
                                          boolean multiFaulty, boolean saveConfig);

    /**
     * Returns a constructed random DFA with diagnosability.
     *
     * @param minXNum     the minimum number of the states in DFA.
     * @param maxXNum     the maximum number of the states in DFA.
     * @param multiFaulty control to whether to apply multiply faulty mode or not.
     * @return A constructed random DFA with diagnosability.
     */
    DFANode constructRandomDFAWithDiagnosability(int minXNum, int maxXNum, boolean multiFaulty);

    /**
     * Returns a constructed random DFA with diagnosability, and also saves its configurations
     * to specified file.
     *
     * @param minXNum     the minimum number of the states in DFA.
     * @param maxXNum     the maximum number of the states in DFA.
     * @param multiFaulty control to whether to apply multiply faulty mode or not.
     * @param saveConfig  control to whether to save the configurations or not.
     * @return A constructed random DFA with diagnosability.
     */
    DFANode constructRandomDFAWithDiagnosability(int minXNum, int maxXNum,
                                                 boolean multiFaulty, boolean saveConfig);

    /**
     * Modification of the {@code constructRandomDFAWithDiagnosability} method, which adds an extra
     * normal component for the faulty components.
     *
     * @param minXNum     the minimum number of the states in DFA (without the extra normal component).
     * @param maxXNum     the maximum number of the states in DFA (without the extra normal component).
     * @param multiFaulty control to whether to apply multiply faulty mode or not.
     * @return A constructed random DFA with diagnosability.
     */
    DFANode constructRandomDFAExtraNormalWithDiagnosability(int minXNum, int maxXNum, boolean multiFaulty);

    /**
     * Modification of the {@code constructRandomDFAWithDiagnosability} method, which adds an extra
     * normal component for the faulty components.
     *
     * @param minXNum     the minimum number of the states in DFA (without the extra normal component).
     * @param maxXNum     the maximum number of the states in DFA (without the extra normal component).
     * @param multiFaulty control to whether to apply multiply faulty mode or not.
     * @param saveConfig  control to whether to save the configurations of the constructed dfa or not.
     * @return A constructed random DFA with diagnosability.
     */
    DFANode constructRandomDFAExtraNormalWithDiagnosability(int minXNum, int maxXNum,
                                                            boolean multiFaulty, boolean saveConfig);

    /**
     * Returns the configuration of the DFA constructor.
     *
     * @return configuration of current DFA constructor, an object of  {@code Config}.
     */
    DFAConfig getDFAConfig();
}
