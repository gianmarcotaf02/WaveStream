package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1813x2 extends com.google.android.gms.internal.cast.C1821z2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19171k;

    public C1813x2(byte[] bArr) {
        super(bArr);
        com.google.android.gms.internal.cast.C1821z2.n(bArr.length);
        this.f19171k = 47;
    }

    @Override // com.google.android.gms.internal.cast.C1821z2
    public final byte d(int i3) {
        int i9 = this.f19171k;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.f19181i[i3];
        }
        if (i3 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(i3, "Index < 0: "));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.C1821z2
    public final byte e(int i3) {
        return this.f19181i[i3];
    }

    @Override // com.google.android.gms.internal.cast.C1821z2
    public final int f() {
        return this.f19171k;
    }
}
