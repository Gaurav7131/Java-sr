
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Ex {

    /**
     * Finds the indices of two transactions that add up to the target amount.
     * * @param transactions Array of transaction amounts
     * 
     * @param target The target sum we are looking for
     * @return Array containing the two indices, or an empty array if no match is
     *         found
     */
    public static int[] findTargetTransactions(int[] transactions, int target) {
        // Map to store the transaction amount and its index: <Amount, Index>
        Map<Integer, Integer> seenTransactions = new HashMap<>();

        for (int i = 0; i < transactions.length; i++) {
            int currentAmount = transactions[i];

            // Calculate what amount we NEED to hit the target
            int neededAmount = target - currentAmount;

            // Check if we've already seen the needed amount in our map
            if (seenTransactions.containsKey(neededAmount)) {
                // If yes, return the index of the needed amount and our current index
                return new int[] { seenTransactions.get(neededAmount), i };
            }

            // If not, add the current amount and its index to the map and keep looking
            seenTransactions.put(currentAmount, i);
        }

        // Return empty array if no two numbers sum up to the target
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] dailyTransactions = { 150, 250, 800, 400, 100 };
        int targetSum = 650;

        int[] result = findTargetTransactions(dailyTransactions, targetSum);

        if (result.length == 2) {
            System.out.println("Match found at indices: " + Arrays.toString(result));
            // Output: Match found at indices: [1, 3] (250 + 400 = 650)
        } else {
            System.out.println("No matching transactions found.");
        }
    }
}