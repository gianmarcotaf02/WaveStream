package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C1497d;
import java.util.Iterator;

public class C1914i extends AbstractC1915j {

    public final byte[] f19539k;

    public C1914i(byte[] bArr) {
        this.f19542h = 0;
        bArr.getClass();
        this.f19539k = bArr;
    }

    @Override
    public byte d(int i3) {
        return this.f19539k[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1915j) || size() != ((AbstractC1915j) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1914i)) {
            return obj.equals(this);
        }
        C1914i c1914i = (C1914i) obj;
        int i3 = this.f19542h;
        int i9 = c1914i.f19542h;
        if (i3 != 0 && i9 != 0 && i3 != i9) {
            return false;
        }
        int size = size();
        if (size > c1914i.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1914i.size()) {
            StringBuilder sbT = p121o0.p.t(size, "Ran off end of other: 0, ", ", ");
            sbT.append(c1914i.size());
            throw new IllegalArgumentException(sbT.toString());
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

    @Override
    public final Iterator iterator() {
        return new C1497d(this);
    }

    @Override
    public void n(byte[] bArr, int i3) {
        System.arraycopy(this.f19539k, 0, bArr, 0, i3);
    }

    public int p() {
        return 0;
    }

    public byte q(int i3) {
        return this.f19539k[i3];
    }

    @Override
    public int size() {
        return this.f19539k.length;
    }
}
