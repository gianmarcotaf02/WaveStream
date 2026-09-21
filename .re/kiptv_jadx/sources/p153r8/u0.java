package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f27005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27006b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.f27005a, this.f27006b);
        kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
        return new p070h6.u(iArrCopyOf);
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        int[] iArr = this.f27005a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i3);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f27005a = iArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f27006b;
    }
}
