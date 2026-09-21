package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1497d implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16190h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16191i = 0;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Iterable f16192k;

    public C1497d(p014b4.x xVar) {
        this.f16192k = xVar;
        this.j = xVar.n();
    }

    public byte a() {
        try {
            byte[] bArr = ((p110m7.u) this.f16192k).f25506i;
            int i3 = this.f16191i;
            this.f16191i = i3 + 1;
            return bArr[i3];
        } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
            throw new java.util.NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16190h) {
            case 0:
                return this.f16191i < this.j;
            case 1:
                return this.f16191i < this.j;
            case 2:
                return this.f16191i < this.j;
            case 3:
                return this.f16191i < this.j;
            case 4:
                return this.f16191i < this.j;
            default:
                return this.f16191i < this.j;
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f16190h) {
            case 0:
                int i3 = this.f16191i;
                if (i3 >= this.j) {
                    throw new java.util.NoSuchElementException();
                }
                this.f16191i = i3 + 1;
                return java.lang.Byte.valueOf(((androidx.datastore.preferences.protobuf.C1500g) this.f16192k).p(i3));
            case 1:
                int i9 = this.f16191i;
                if (i9 >= this.j) {
                    throw new java.util.NoSuchElementException();
                }
                this.f16191i = i9 + 1;
                return java.lang.Byte.valueOf(((p014b4.x) this.f16192k).e(i9));
            case 2:
                int i10 = this.f16191i;
                if (i10 >= this.j) {
                    throw new java.util.NoSuchElementException();
                }
                this.f16191i = i10 + 1;
                return java.lang.Byte.valueOf(((com.google.android.gms.internal.cast.C1821z2) this.f16192k).e(i10));
            case 3:
                int i11 = this.f16191i;
                if (i11 >= this.j) {
                    throw new java.util.NoSuchElementException();
                }
                this.f16191i = i11 + 1;
                return java.lang.Byte.valueOf(((com.google.android.gms.internal.play_billing.AbstractC1859m0) this.f16192k).e(i11));
            case 4:
                int i12 = this.f16191i;
                if (i12 >= this.j) {
                    throw new java.util.NoSuchElementException();
                }
                this.f16191i = i12 + 1;
                return java.lang.Byte.valueOf(((com.google.crypto.tink.shaded.protobuf.C1914i) this.f16192k).q(i12));
            default:
                return java.lang.Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16190h) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            case 1:
                throw new java.lang.UnsupportedOperationException();
            case 2:
                throw new java.lang.UnsupportedOperationException();
            case 3:
                throw new java.lang.UnsupportedOperationException();
            case 4:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public C1497d(com.google.android.gms.internal.cast.C1821z2 c1821z2) {
        this.f16192k = c1821z2;
        this.j = c1821z2.f();
    }

    public C1497d(com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0) {
        this.f16192k = abstractC1859m0;
        this.j = abstractC1859m0.n();
    }

    public C1497d(androidx.datastore.preferences.protobuf.C1500g c1500g) {
        this.f16192k = c1500g;
        this.j = c1500g.size();
    }

    public C1497d(com.google.crypto.tink.shaded.protobuf.C1914i c1914i) {
        this.f16192k = c1914i;
        this.j = c1914i.size();
    }

    public C1497d(p110m7.u uVar) {
        this.f16192k = uVar;
        this.j = uVar.f25506i.length;
    }
}
