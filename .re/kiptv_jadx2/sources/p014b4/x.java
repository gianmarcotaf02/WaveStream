package p014b4;

import Y6.f;
import androidx.datastore.preferences.protobuf.C1497d;
import com.google.android.gms.internal.play_billing.M0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public class x implements Iterable, Serializable {
    public static final x j = new x(y.f17916a);

    public int f17914h = 0;

    public final byte[] f17915i;

    static {
        int i3 = v.f17911a;
    }

    public x(byte[] bArr) {
        bArr.getClass();
        this.f17915i = bArr;
    }

    public static int p(int i3, int i9, int i10) {
        int i11 = i9 - i3;
        if ((i3 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(f.f(i3, "Beginning index: ", " < 0"));
        }
        if (i9 < i3) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(M0.k(i9, i10, "End index: ", " >= "));
    }

    public static x q(byte[] bArr, int i3) {
        p(0, i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return new x(bArr2);
    }

    public byte d(int i3) {
        return this.f17915i[i3];
    }

    public byte e(int i3) {
        return this.f17915i[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x) || n() != ((x) obj).n()) {
            return false;
        }
        if (n() == 0) {
            return true;
        }
        if (!(obj instanceof x)) {
            return obj.equals(this);
        }
        x xVar = (x) obj;
        int i3 = this.f17914h;
        int i9 = xVar.f17914h;
        if (i3 != 0 && i9 != 0 && i3 != i9) {
            return false;
        }
        int iN = n();
        if (iN > xVar.n()) {
            throw new IllegalArgumentException("Length too large: " + iN + n());
        }
        if (iN > xVar.n()) {
            throw new IllegalArgumentException(M0.k(iN, xVar.n(), "Ran off end of other: 0, ", ", "));
        }
        int iF = f() + iN;
        int iF2 = f();
        int iF3 = xVar.f();
        while (iF2 < iF) {
            if (this.f17915i[iF2] != xVar.f17915i[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public final int hashCode() {
        int i3 = this.f17914h;
        if (i3 != 0) {
            return i3;
        }
        int iN = n();
        int iF = f();
        byte[] bArr = y.f17916a;
        int i9 = iN;
        for (int i10 = iF; i10 < iF + iN; i10++) {
            i9 = (i9 * 31) + this.f17915i[i10];
        }
        int i11 = i9 != 0 ? i9 : 1;
        this.f17914h = i11;
        return i11;
    }

    @Override
    public final Iterator iterator() {
        return new C1497d(this);
    }

    public int n() {
        return this.f17915i.length;
    }

    public void o(byte[] bArr, int i3) {
        System.arraycopy(this.f17915i, 0, bArr, 0, i3);
    }

    public final byte[] r() {
        int iN = n();
        if (iN == 0) {
            return y.f17916a;
        }
        byte[] bArr = new byte[iN];
        o(bArr, iN);
        return bArr;
    }

    public final String toString() {
        x wVar;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iN = n();
        if (n() <= 50) {
            strConcat = AbstractC1659a.a(this);
        } else {
            int iP = p(0, 47, n());
            if (iP == 0) {
                wVar = j;
            } else {
                wVar = new w(this.f17915i, f(), iP);
            }
            strConcat = AbstractC1659a.a(wVar).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iN);
        sb.append(" contents=\"");
        return f.m(sb, strConcat, "\">");
    }
}
