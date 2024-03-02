package robakidze.nikoloz.tasks

class FiftiethTask {

    fun countVariants(stairsCount: Int): Int {

        if (stairsCount <= 1) return 1

        val dp = IntArray(stairsCount + 1)

        dp[0] = 1
        dp[1] = 1

        for (i in 2..stairsCount) {

            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[stairsCount]
    }
}