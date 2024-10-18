package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * The VotingMachine class allows adding candidates, casting votes, and printing vote results.
 */
public class VotingMachine {
    // A map to store the candidate names and their  votes
    private Map<String, Integer> candidates = new HashMap<>();


    /**
     * This method dds a candidate to the list.
     *
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);  // Initialize candidate with 0 votes
        }
    }

    /**
     * This method casts a vote for the candidate with the specified name
     *
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);  // Increment vote count
        }
    }

    /**
     * This method returns a string representation of the candidates and their vote counts
     *
     * @return a formatted string of candidates and their votes
     */
    @Override
    public String toString() {
        StringBuilder string_result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            string_result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes \t");
        }
        return string_result.toString();
    }
}
