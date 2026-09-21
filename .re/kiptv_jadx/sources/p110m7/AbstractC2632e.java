package p110m7;

/* JADX INFO: renamed from: m7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2632e implements java.lang.Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p110m7.u f25476h = new p110m7.u(new byte[0]);

    public static p110m7.AbstractC2632e d(java.util.Iterator it, int i3) {
        if (i3 == 1) {
            return (p110m7.AbstractC2632e) it.next();
        }
        int i9 = i3 >>> 1;
        return d(it, i9).e(d(it, i3 - i9));
    }

    public static p110m7.C2631d r() {
        return new p110m7.C2631d();
    }

    public final p110m7.AbstractC2632e e(p110m7.AbstractC2632e abstractC2632e) {
        int size = size();
        int size2 = abstractC2632e.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int[] iArr = p110m7.z.f25511o;
        p110m7.z zVar = this instanceof p110m7.z ? (p110m7.z) this : null;
        if (abstractC2632e.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC2632e;
        }
        int size3 = abstractC2632e.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC2632e.size();
            byte[] bArr = new byte[size4 + size5];
            f(0, 0, size4, bArr);
            abstractC2632e.f(0, size4, size5, bArr);
            return new p110m7.u(bArr);
        }
        if (zVar != null) {
            p110m7.AbstractC2632e abstractC2632e2 = zVar.f25513k;
            if (abstractC2632e.size() + abstractC2632e2.size() < 128) {
                int size6 = abstractC2632e2.size();
                int size7 = abstractC2632e.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC2632e2.f(0, 0, size6, bArr2);
                abstractC2632e.f(0, size6, size7, bArr2);
                return new p110m7.z(zVar.j, new p110m7.u(bArr2));
            }
        }
        if (zVar != null) {
            p110m7.AbstractC2632e abstractC2632e3 = zVar.j;
            int iO = abstractC2632e3.o();
            p110m7.AbstractC2632e abstractC2632e4 = zVar.f25513k;
            if (iO > abstractC2632e4.o()) {
                if (zVar.f25515m > abstractC2632e.o()) {
                    return new p110m7.z(abstractC2632e3, new p110m7.z(abstractC2632e4, abstractC2632e));
                }
            }
        }
        if (size3 >= p110m7.z.f25511o[java.lang.Math.max(o(), abstractC2632e.o()) + 1]) {
            return new p110m7.z(this, abstractC2632e);
        }
        p008a8.c cVar = new p008a8.c(15);
        cVar.P(this);
        cVar.P(abstractC2632e);
        java.util.Stack stack = (java.util.Stack) cVar.f15522i;
        p110m7.AbstractC2632e zVar2 = (p110m7.AbstractC2632e) stack.pop();
        while (!stack.isEmpty()) {
            zVar2 = new p110m7.z((p110m7.AbstractC2632e) stack.pop(), zVar2);
        }
        return zVar2;
    }

    public final void f(int i3, int i9, int i10, byte[] bArr) {
        if (i3 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i9 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i9);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i10);
            throw new java.lang.IndexOutOfBoundsException(sb3.toString());
        }
        int i11 = i3 + i10;
        if (i11 > size()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i11);
            throw new java.lang.IndexOutOfBoundsException(sb4.toString());
        }
        int i12 = i9 + i10;
        if (i12 <= bArr.length) {
            if (i10 > 0) {
                n(i3, i9, i10, bArr);
            }
        } else {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i12);
            throw new java.lang.IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void n(int i3, int i9, int i10, byte[] bArr);

    public abstract int o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract int s(int i3, int i9, int i10);

    public abstract int size();

    public abstract int t(int i3, int i9, int i10);

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    public abstract int u();

    public abstract java.lang.String v();

    public final java.lang.String w() {
        try {
            return v();
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }

    public abstract void x(java.io.OutputStream outputStream, int i3, int i9);
}
