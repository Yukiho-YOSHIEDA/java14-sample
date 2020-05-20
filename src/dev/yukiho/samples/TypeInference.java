package dev.yukiho.samples;

/**
 * 型推論のサンプルクラス
 */
public class TypeInference {

    private final String message;
    private final String name;

    /**
     * @param message
     * @param name
     */
    public TypeInference(String message, String name) {
        this.message = message;
        this.name = name;
    }

    @Override
    public String toString() {
        // 左辺に型を指定しなくて良い
        var returnMessage = name + ", " + message;
        return returnMessage;
    }
}
