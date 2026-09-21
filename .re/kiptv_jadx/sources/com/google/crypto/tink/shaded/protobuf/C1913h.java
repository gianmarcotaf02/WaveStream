package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1913h extends com.google.crypto.tink.shaded.protobuf.C1914i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19538m;

    public C1913h(byte[] bArr, int i3, int i9) {
        super(bArr);
        com.google.crypto.tink.shaded.protobuf.AbstractC1915j.e(i3, i3 + i9, bArr.length);
        this.f19537l = i3;
        this.f19538m = i9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1914i, com.google.crypto.tink.shaded.protobuf.AbstractC1915j
    public final byte d(int i3) {
        int i9 = this.f19538m;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.f19539k[this.f19537l + i3];
        }
        if (i3 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(i3, "Index < 0: "));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1914i, com.google.crypto.tink.shaded.protobuf.AbstractC1915j
    public final void n(byte[] bArr, int i3) {
        java.lang.System.arraycopy(this.f19539k, this.f19537l, bArr, 0, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1914i
    public final int p() {
        return this.f19537l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1914i
    public final byte q(int i3) {
        return this.f19539k[this.f19537l + i3];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1914i, com.google.crypto.tink.shaded.protobuf.AbstractC1915j
    public final int size() {
        return this.f19538m;
    }
}
