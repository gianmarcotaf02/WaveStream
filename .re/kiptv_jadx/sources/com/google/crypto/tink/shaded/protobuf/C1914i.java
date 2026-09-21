package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1914i extends com.google.crypto.tink.shaded.protobuf.AbstractC1915j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f19539k;

    public C1914i(byte[] bArr) {
        this.f19542h = 0;
        bArr.getClass();
        this.f19539k = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1915j
    public byte d(int i3) {
        return this.f19539k[i3];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1915j) || size() != ((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.C1914i)) {
            return obj.equals(this);
        }
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) obj;
        int i3 = this.f19542h;
        int i9 = c1914i.f19542h;
        if (i3 != 0 && i9 != 0 && i3 != i9) {
            return false;
        }
        int size = size();
        if (size > c1914i.size()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1914i.size()) {
            java.lang.StringBuilder sbT = p121o0.p.t(size, "Ran off end of other: 0, ", ", ");
            sbT.append(c1914i.size());
            throw new java.lang.IllegalArgumentException(sbT.toString());
        }
        int iP = p() + size;
        int iP2 = p();
        int iP3 = c1914i.p();
        while (iP2 < iP) {
            if (this.f19539k[iP2] != c1914i.f19539k[iP3]) {
                return false;
            }
            iP2++;
            iP3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.C1497d(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1915j
    public void n(byte[] bArr, int i3) {
        java.lang.System.arraycopy(this.f19539k, 0, bArr, 0, i3);
    }

    public int p() {
        return 0;
    }

    public byte q(int i3) {
        return this.f19539k[i3];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1915j
    public int size() {
        return this.f19539k.length;
    }
}
