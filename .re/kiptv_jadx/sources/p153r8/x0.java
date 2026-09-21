package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f27020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27021b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        long[] jArrCopyOf = java.util.Arrays.copyOf(this.f27020a, this.f27021b);
        kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
        return new p070h6.w(jArrCopyOf);
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        long[] jArr = this.f27020a;
        if (jArr.length < i3) {
            int length = jArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i3);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f27020a = jArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f27021b;
    }
}
