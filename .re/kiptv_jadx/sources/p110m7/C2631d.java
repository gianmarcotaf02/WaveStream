package p110m7;

/* JADX INFO: renamed from: m7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2631d extends java.io.OutputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f25471m = new byte[0];
    public int j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25475l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25472h = 128;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f25473i = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f25474k = new byte[128];

    public final void b(int i3) {
        this.f25473i.add(new p110m7.u(this.f25474k));
        int length = this.j + this.f25474k.length;
        this.j = length;
        this.f25474k = new byte[java.lang.Math.max(this.f25472h, java.lang.Math.max(i3, length >>> 1))];
        this.f25475l = 0;
    }

    public final void e() {
        int i3 = this.f25475l;
        byte[] bArr = this.f25474k;
        int length = bArr.length;
        java.util.ArrayList arrayList = this.f25473i;
        if (i3 >= length) {
            arrayList.add(new p110m7.u(this.f25474k));
            this.f25474k = f25471m;
        } else if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i3));
            arrayList.add(new p110m7.u(bArr2));
        }
        this.j += this.f25475l;
        this.f25475l = 0;
    }

    public final synchronized p110m7.AbstractC2632e i() {
        java.util.ArrayList arrayList;
        e();
        arrayList = this.f25473i;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((p110m7.AbstractC2632e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? p110m7.AbstractC2632e.f25476h : p110m7.AbstractC2632e.d(arrayList.iterator(), arrayList.size());
    }

    public final java.lang.String toString() {
        int i3;
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        synchronized (this) {
            i3 = this.j + this.f25475l;
        }
        return java.lang.String.format("<ByteString.Output@%s size=%d>", hexString, java.lang.Integer.valueOf(i3));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i3) {
        try {
            if (this.f25475l == this.f25474k.length) {
                b(1);
            }
            byte[] bArr = this.f25474k;
            int i9 = this.f25475l;
            this.f25475l = i9 + 1;
            bArr[i9] = (byte) i3;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i3, int i9) {
        try {
            byte[] bArr2 = this.f25474k;
            int length = bArr2.length;
            int i10 = this.f25475l;
            if (i9 <= length - i10) {
                java.lang.System.arraycopy(bArr, i3, bArr2, i10, i9);
                this.f25475l += i9;
            } else {
                int length2 = bArr2.length - i10;
                java.lang.System.arraycopy(bArr, i3, bArr2, i10, length2);
                int i11 = i9 - length2;
                b(i11);
                java.lang.System.arraycopy(bArr, i3 + length2, this.f25474k, 0, i11);
                this.f25475l = i11;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
