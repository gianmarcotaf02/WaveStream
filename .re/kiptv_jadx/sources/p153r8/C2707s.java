package p153r8;

/* JADX INFO: renamed from: r8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2707s extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f26997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26998b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        double[] dArrCopyOf = java.util.Arrays.copyOf(this.f26997a, this.f26998b);
        kotlin.jvm.internal.m.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        double[] dArr = this.f26997a;
        if (dArr.length < i3) {
            int length = dArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            double[] dArrCopyOf = java.util.Arrays.copyOf(dArr, i3);
            kotlin.jvm.internal.m.d(dArrCopyOf, "copyOf(...)");
            this.f26997a = dArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26998b;
    }
}
