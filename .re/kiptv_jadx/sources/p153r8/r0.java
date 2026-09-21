package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends p153r8.AbstractC2692d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f26995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26996b;

    @Override // p153r8.AbstractC2692d0
    public final java.lang.Object a() {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(this.f26995a, this.f26996b);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return new p070h6.s(bArrCopyOf);
    }

    @Override // p153r8.AbstractC2692d0
    public final void b(int i3) {
        byte[] bArr = this.f26995a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i3);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            this.f26995a = bArrCopyOf;
        }
    }

    @Override // p153r8.AbstractC2692d0
    public final int d() {
        return this.f26996b;
    }
}
