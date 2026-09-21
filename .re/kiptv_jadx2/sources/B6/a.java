package B6;

import java.util.Random;
import kotlin.jvm.internal.m;

public abstract class a extends d {
    @Override
    public final int a(int i3) {
        return ((-i3) >> 31) & (j().nextInt() >>> (32 - i3));
    }

    @Override
    public final void b(byte[] array) {
        m.e(array, "array");
        j().nextBytes(array);
    }

    @Override
    public final int d() {
        return j().nextInt();
    }

    @Override
    public final int e(int i3) {
        return j().nextInt(i3);
    }

    @Override
    public final long g() {
        return j().nextLong();
    }

    public abstract Random j();
}
