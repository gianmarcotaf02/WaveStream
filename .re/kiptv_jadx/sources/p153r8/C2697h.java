package p153r8;

/* JADX INFO: renamed from: r8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2697h extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f26965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26966b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(this.f26965a, this.f26966b);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        byte[] bArr = this.f26965a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i3);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            this.f26965a = bArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26966b;
    }
}
