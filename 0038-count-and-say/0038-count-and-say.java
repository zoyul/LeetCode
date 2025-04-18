class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String rle = "1";
        for (int i = 1; i < n ; i ++) {
            rle = rle(rle);
        }
        return rle;
    }

    private String rle(String input) {
        int l = input.length();
        if (l == 1) return "11";

        String result = "";

        int cnt = 1;
        char before = input.charAt(0);
        for (int i = 1; i < l; i++) {
            char now = input.charAt(i);
            // 이전과 지금이 같다면 카운트 세기
            if (before == now) {
                cnt ++;
                // 맨 마지막 글자면 따로 더해주기
                if (i == l - 1) {
                    result += cnt;
                    result += before;
                }
            } else {
                // 이전과 지금이 같지 않다면 rle에 결과 넣어주고 카운트 초기화
                result += cnt;
                result += before;
                cnt = 1;
                // 맨 마지막 글자면 따로 더해주기
                if (i == l - 1) {
                    result += 1;
                    result += now;
                }
            }
            before = now;
        }
        return result;
    }
}