package t8;

/* JADX INFO: renamed from: t8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2854d implements java.lang.CharSequence {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char[] f28616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28617i;

    public C2854d(char[] cArr) {
        this.f28616h = cArr;
        this.f28617i = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f28616h[i3];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f28617i;
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i3, int i9) {
        return O7.x.m0(this.f28616h, i3, java.lang.Math.min(i9, this.f28617i));
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        int i3 = this.f28617i;
        return O7.x.m0(this.f28616h, 0, java.lang.Math.min(i3, i3));
    }
}
