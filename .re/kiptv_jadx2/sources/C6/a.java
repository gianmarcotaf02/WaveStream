package C6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.m;

public final class a extends B6.a {
    @Override
    public final int f(int i3, int i9) {
        return ThreadLocalRandom.current().nextInt(i3, i9);
    }

    @Override
    public final long h(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override
    public final long i(long j, long j9) {
        return ThreadLocalRandom.current().nextLong(j, j9);
    }

    @Override
    public final Random j() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        m.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
