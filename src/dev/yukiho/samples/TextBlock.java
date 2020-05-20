package dev.yukiho.samples;

/**
 * テキストブロックのサンプル
 */
public class TextBlock {
    private TextBlock() {

    }

    public static void printText() {
        var oldText = "これは\n" +
                "従来の\n" +
                "複数行文字列です。";

        var newText = """
                これは
                新しい
                複数行文字列です。""";

        System.out.println(oldText);
        System.out.println(newText);
    }
}
