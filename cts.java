import java.util.*;

public class cts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<List<String>> partitions = partition(input);
        
        // Format output to match expected format
        System.out.print("[");
        for (int i = 0; i < partitions.size(); i++) {
            List<String> part = partitions.get(i);
            System.out.print("[");
            for (int j = 0; j < part.size(); j++) {
                System.out.print("'" + part.get(j) + "'");
                if (j < part.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i < partitions.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> result = new ArrayList<>();
        boolean[][] dp = new boolean[n][n];

        // Precompute palindromes
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                if (s.charAt(start) == s.charAt(end)) {
                    if (len <= 2 || dp[start + 1][end - 1]) {
                        dp[start][end] = true;
                    }
                }
            }
        }

        backtrack(0, s, new ArrayList<>(), result, dp);
        return result;
    }

    private static void backtrack(int start, String s, List<String> path, List<List<String>> result, boolean[][] dp) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (dp[start][end]) {
                path.add(s.substring(start, end + 1));
                backtrack(end + 1, s, path, result, dp);
                path.remove(path.size() - 1); // backtrack
            }
        }
    }
}