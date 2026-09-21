package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f26891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26892b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        short[] sArrCopyOf = java.util.Arrays.copyOf(this.f26891a, this.f26892b);
        kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
        return new p070h6.z(sArrCopyOf);
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        short[] sArr = this.f26891a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] sArrCopyOf = java.util.Arrays.copyOf(sArr, i3);
            kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
            this.f26891a = sArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26892b;
    }
}
