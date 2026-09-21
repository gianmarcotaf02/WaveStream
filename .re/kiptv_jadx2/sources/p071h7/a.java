package p071h7;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class a extends p079i7.a {

    public static final a f22558f = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        m.e(numbers, "numbers");
    }
}
