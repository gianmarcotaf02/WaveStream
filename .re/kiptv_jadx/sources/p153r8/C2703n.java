package p153r8;

/* JADX INFO: renamed from: r8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2703n extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f26980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26981b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        char[] cArrCopyOf = java.util.Arrays.copyOf(this.f26980a, this.f26981b);
        kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        char[] cArr = this.f26980a;
        if (cArr.length < i3) {
            int length = cArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            char[] cArrCopyOf = java.util.Arrays.copyOf(cArr, i3);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.f26980a = cArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26981b;
    }
}
