package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1499f extends androidx.datastore.preferences.protobuf.C1500g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f16200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16201m;

    public C1499f(byte[] bArr, int i3, int i9) {
        super(bArr);
        androidx.datastore.preferences.protobuf.C1500g.e(i3, i3 + i9, bArr.length);
        this.f16200l = i3;
        this.f16201m = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.C1500g
    public final byte d(int i3) {
        int i9 = this.f16201m;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.f16204i[this.f16200l + i3];
        }
        if (i3 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(i3, "Index < 0: "));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C1500g
    public final void n(byte[] bArr, int i3) {
        java.lang.System.arraycopy(this.f16204i, this.f16200l, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C1500g
    public final int o() {
        return this.f16200l;
    }

    @Override // androidx.datastore.preferences.protobuf.C1500g
    public final byte p(int i3) {
        return this.f16204i[this.f16200l + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C1500g
    public final int size() {
        return this.f16201m;
    }
}
