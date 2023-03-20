class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        cnt = 0
        flowerbed.append(0)
        for i in range(len(flowerbed)-1):
            # 꽃을 심을 수 없는 곳이면 넘어감
            if flowerbed[i] == 1:
                continue
            if (flowerbed[i - 1] + flowerbed[i + 1] == 0):
                flowerbed[i] = 1
                cnt += 1

        if cnt >= n:
            return True
        else:
            return False