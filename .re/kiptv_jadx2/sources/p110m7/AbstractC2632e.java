package p110m7;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;
import p008a8.c;

public abstract class AbstractC2632e implements Iterable {

    public static final u f25476h = new u(new byte[0]);

    public static AbstractC2632e d(Iterator it, int i3) {
        if (i3 == 1) {
            return (AbstractC2632e) it.next();
        }
        int i9 = i3 >>> 1;
        return d(it, i9).e(d(it, i3 - i9));
    }

    public static C2631d r() {
        return new C2631d();
    }

    public final AbstractC2632e e(AbstractC2632e abstractC2632e) {
        int size = size();
        int size2 = abstractC2632e.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = z.f25511o;
        z zVar = this instanceof z ? (z) this : null;
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
            return new u(bArr);
        }
        if (zVar != null) {
            AbstractC2632e abstractC2632e2 = zVar.f25513k;
            if (abstractC2632e.size() + abstractC2632e2.size() < 128) {
                int size6 = abstractC2632e2.size();
                int size7 = abstractC2632e.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC2632e2.f(0, 0, size6, bArr2);
                abstractC2632e.f(0, size6, size7, bArr2);
                return new z(zVar.j, new u(bArr2));
            }
        }
        if (zVar != null) {
            AbstractC2632e abstractC2632e3 = zVar.j;
            int iO = abstractC2632e3.o();
            AbstractC2632e abstractC2632e4 = zVar.f25513k;
            if (iO > abstractC2632e4.o()) {
                if (zVar.f25515m > abstractC2632e.o()) {
                    return new z(abstractC2632e3, new z(abstractC2632e4, abstractC2632e));
                }
            }
        }
        if (size3 >= z.f25511o[Math.max(o(), abstractC2632e.o()) + 1]) {
            return new z(this, abstractC2632e);
        }
        c cVar = new c(15);
        cVar.P(this);
        cVar.P(abstractC2632e);
        Stack stack = (Stack) cVar.f15522i;
        AbstractC2632e zVar2 = (AbstractC2632e) stack.pop();
        while (!stack.isEmpty()) {
            zVar2 = new z((AbstractC2632e) stack.pop(), zVar2);
        }
        return zVar2;
    }

    public final void f(int i3, int i9, int i10, byte[] bArr) {
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i9 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i9);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i11 = i3 + i10;
        if (i11 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i11);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i12 = i9 + i10;
        if (i12 <= bArr.length) {
            if (i10 > 0) {
                n(i3, i9, i10, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i12);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void n(int i3, int i9, int i10, byte[] bArr);

    public abstract int o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract int s(int i3, int i9, int i10);

    public abstract int size();

    public abstract int t(int i3, int i9, int i10);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int u();

    public abstract String v();

    public final String w() {
        try {
            return v();
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException("UTF-8 not supported?", e6);
        }
    }

    public abstract void x(OutputStream outputStream, int i3, int i9);
}
