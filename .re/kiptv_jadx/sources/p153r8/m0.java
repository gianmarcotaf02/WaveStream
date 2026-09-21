package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f26978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26979b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        short[] sArrCopyOf = java.util.Arrays.copyOf(this.f26978a, this.f26979b);
        kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        short[] sArr = this.f26978a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] sArrCopyOf = java.util.Arrays.copyOf(sArr, i3);
            kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
            this.f26978a = sArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26979b;
    }
}
