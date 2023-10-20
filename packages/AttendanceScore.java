package packages;
	public class AttendanceScore {

	    public static void main(String[] args) {
	        int n = 2; // Number of days
	        int MOD = 1000000007;
	        int ways = calculateAttendanceWays(n, MOD);
	        System.out.println(ways);
	    }

	    public static int calculateAttendanceWays(int n, int MOD) {
	        // Base cases
	        if (n == 0) return 1;
	        if (n == 1) return 3;

	        int[] dp = new int[n + 1];
	        dp[0] = 1;
	        dp[1] = 3;

	        // Calculate ways for each day based on previous days
	        for (int i = 2; i <= n; i++) {
	            dp[i] = (dp[i - 1]+dp[i - 1]+dp[i - 1]) % MOD;
	        }

	        return dp[n];
	    }
	}