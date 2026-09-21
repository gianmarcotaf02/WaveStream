package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f26889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26890b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        float[] fArrCopyOf = java.util.Arrays.copyOf(this.f26889a, this.f26890b);
        kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        float[] fArr = this.f26889a;
        if (fArr.length < i3) {
            int length = fArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, i3);
            kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
            this.f26889a = fArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26890b;
    }
}
