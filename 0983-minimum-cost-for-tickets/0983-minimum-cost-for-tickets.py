class Solution(object):
    def mincostTickets(self, days, costs):
        dp = [0] * (days[-1] + 1)
        day1, day7, day30 = costs
        print(day7)

        for i in range(days[-1] + 1):
            # 여행을 안하는 날이면
            if i not in days:
                dp[i] = dp[i-1]
            # 여행을 하는 날이면
            else:
                dp[i] += min(dp[max(0, i-1)] + day1, dp[max(0, i-7)] + day7, dp[max(0, i-30)] + day30)

        return dp[-1]