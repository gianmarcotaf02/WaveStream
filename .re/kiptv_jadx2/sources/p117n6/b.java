package p117n6;

import p100l6.c;
import p100l6.h;

public final class b implements c {

    public static final b f25831h = new b();

    @Override
    public final h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
