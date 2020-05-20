package dev.yukiho.samples;

/**
 * switch式のサンプル
 */
public class SwitchFormula {

    private SwitchFormula() {
    }

    /**
     * AtCoder ABC 168
     * 「本」の数え方を答えてあげる
     *
     * @param num
     * @see "https://atcoder.jp/contests/abc168/tasks/abc168_a"
     */
    public static void solve(int num) {
        switch (num % 10) {
            case 2, 4, 5, 7, 9 -> System.out.println("hon");
            case 0, 1, 6, 8 -> System.out.println("pon");
            case 3 -> System.out.println("bon");
        }
    }
}
