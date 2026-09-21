package B6;

import java.io.Serializable;
import kotlin.jvm.internal.m;

public final class c extends d implements Serializable {
    @Override
    public final int a(int i3) {
        return d.f818i.a(i3);
    }

    @Override
    public final void b(byte[] array) {
        m.e(array, "array");
        d.f818i.b(array);
    }

    @Override
    public final byte[] c(byte[] array, int i3) {
        m.e(array, "array");
        d.f818i.c(array, i3);
        return array;
    }

    @Override
    public final int d() {
        return d.f818i.d();
    }

    @Override
    public final int e(int i3) {
        return d.f818i.e(i3);
    }

    @Override
    public final int f(int i3, int i9) {
        return d.f818i.f(i3, i9);
    }

    @Override
    public final long g() {
        return d.f818i.g();
    }

    @Override
    public final long h(long j) {
        throw null;
    }

    @Override
    public final long i(long j, long j9) {
        return d.f818i.i(j, j9);
    }

    public final float j() {
        return d.f818i.j().nextFloat();
    }
}
