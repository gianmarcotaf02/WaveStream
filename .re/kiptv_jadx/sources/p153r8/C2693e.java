package p153r8;

/* JADX INFO: renamed from: r8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2693e extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f26956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26957b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        boolean[] zArrCopyOf = java.util.Arrays.copyOf(this.f26956a, this.f26957b);
        kotlin.jvm.internal.m.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        boolean[] zArr = this.f26956a;
        if (zArr.length < i3) {
            int length = zArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            boolean[] zArrCopyOf = java.util.Arrays.copyOf(zArr, i3);
            kotlin.jvm.internal.m.d(zArrCopyOf, "copyOf(...)");
            this.f26956a = zArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26957b;
    }
}
