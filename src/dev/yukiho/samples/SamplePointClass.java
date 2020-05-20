package dev.yukiho.samples;

import java.util.Objects;

/**
 * 座標を持つRecordと等価のClass
 *
 * @see SamplePointRecord
 */
public final class SamplePointClass {
    private final int x;
    private final int y;

    public SamplePointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() {
        return x;
    }

    int y() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SamplePointClass other)) {
            return false;
        }
        return other.x == x && other.y == y;
    }

    @Override
    public String toString() {
        return "SamplePointClass[x=" + x + ", y=" + y + "]";
    }
}
