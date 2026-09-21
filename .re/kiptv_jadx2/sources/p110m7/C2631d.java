package p110m7;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class C2631d extends OutputStream {

    public static final byte[] f25471m = new byte[0];
    public int j;

    public int f25475l;

    public final int f25472h = 128;

    public final ArrayList f25473i = new ArrayList();

    public byte[] f25474k = new byte[128];

    public final void b(int i3) {
        this.f25473i.add(new u(this.f25474k));
        int length = this.j + this.f25474k.length;
        this.j = length;
        this.f25474k = new byte[Math.max(this.f25472h, Math.max(i3, length >>> 1))];
        this.f25475l = 0;
    }

    public final void e() {
        int i3 = this.f25475l;
        byte[] bArr = this.f25474k;
        int length = bArr.length;
        ArrayList arrayList = this.f25473i;
        if (i3 >= length) {
            arrayList.add(new u(this.f25474k));
            this.f25474k = f25471m;
        } else if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i3));
            arrayList.add(new u(bArr2));
        }
        this.j += this.f25475l;
        this.f25475l = 0;
    }

    public final synchronized AbstractC2632e i() {
        ArrayList arrayList;
        e();
        arrayList = this.f25473i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC2632e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC2632e.f25476h : AbstractC2632e.d(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i3;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i3 = this.j + this.f25475l;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i3));
    }

    @Override
    public final synchronized void write(int i3) {
        try {
            if (this.f25475l == this.f25474k.length) {
                b(1);
            }
            byte[] bArr = this.f25474k;
            int i9 = this.f25475l;
            this.f25475l = i9 + 1;
            bArr[i9] = (byte) i3;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final synchronized void write(byte[] bArr, int i3, int i9) {
        try {
            byte[] bArr2 = this.f25474k;
            int length = bArr2.length;
            int i10 = this.f25475l;
            if (i9 <= length - i10) {
                System.arraycopy(bArr, i3, bArr2, i10, i9);
                this.f25475l += i9;
            } else {
                int length2 = bArr2.length - i10;
                System.arraycopy(bArr, i3, bArr2, i10, length2);
                int i11 = i9 - length2;
                b(i11);
                System.arraycopy(bArr, i3 + length2, this.f25474k, 0, i11);
                this.f25475l = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
