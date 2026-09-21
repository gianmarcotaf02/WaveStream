package p136q;

import D6.g;
import O7.r;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p144r.a;

public final class C2677v {

    public int[] f26430a;

    public int f26431b;

    public C2677v(int i3) {
        this.f26430a = i3 == 0 ? AbstractC2670n.f26403a : new int[i3];
    }

    public final void a(int i3) {
        b(this.f26431b + 1);
        int[] iArr = this.f26430a;
        int i9 = this.f26431b;
        iArr[i9] = i3;
        this.f26431b = i9 + 1;
    }

    public final void b(int i3) {
        int[] iArr = this.f26430a;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i3, (iArr.length * 3) / 2));
            m.d(iArrCopyOf, "copyOf(...)");
            this.f26430a = iArrCopyOf;
        }
    }

    public final int c(int i3) {
        if (i3 >= 0 && i3 < this.f26431b) {
            return this.f26430a[i3];
        }
        a.d("Index must be between 0 and size");
        throw null;
    }

    public final void d(int i3) {
        int i9;
        if (i3 < 0 || i3 >= (i9 = this.f26431b)) {
            a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f26430a;
        int i10 = iArr[i3];
        if (i3 != i9 - 1) {
            p078i6.m.Y(i3, i3 + 1, i9, iArr, iArr);
        }
        this.f26431b--;
    }

    public final void e(int i3, int i9) {
        if (i3 < 0 || i3 >= this.f26431b) {
            a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f26430a;
        int i10 = iArr[i3];
        iArr[i3] = i9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2677v) {
            C2677v c2677v = (C2677v) obj;
            int i3 = c2677v.f26431b;
            int i9 = this.f26431b;
            if (i3 == i9) {
                int[] iArr = this.f26430a;
                int[] iArr2 = c2677v.f26430a;
                g gVarW = r.W(0, i9);
                int i10 = gVarW.f2458h;
                int i11 = gVarW.f2459i;
                if (i10 > i11) {
                    return true;
                }
                while (iArr[i10] == iArr2[i10]) {
                    if (i10 == i11) {
                        return true;
                    }
                    i10++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f26430a;
        int i3 = this.f26431b;
        int iHashCode = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            iHashCode += Integer.hashCode(iArr[i9]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f26430a;
        int i3 = this.f26431b;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = iArr[i9];
            if (i9 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                m.d(string, "toString(...)");
                return string;
            }
            if (i9 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i10);
        }
        sb.append((CharSequence) "]");
        String string2 = sb.toString();
        m.d(string2, "toString(...)");
        return string2;
    }

    public C2677v() {
        this(16);
    }
}
