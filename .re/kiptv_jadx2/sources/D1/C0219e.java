package D1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

public final class C0219e implements InterfaceC0217d, InterfaceC0221f {

    public final int f2001h;

    public Object f2002i;
    public int j;

    public int f2003k;

    public Object f2004l;

    public Cloneable f2005m;

    public C0219e(int i3) {
        this.f2001h = i3;
    }

    public int a(long j) {
        int i3 = this.j + 1;
        long[] jArr = (long[]) this.f2002i;
        int length = jArr.length;
        if (i3 > length) {
            int i9 = length * 2;
            long[] jArr2 = new long[i9];
            int[] iArr = new int[i9];
            p078i6.m.c0(jArr, jArr2, 0, 0, jArr.length);
            p078i6.m.d0(0, 0, 14, (int[]) this.f2004l, iArr);
            this.f2002i = jArr2;
            this.f2004l = iArr;
        }
        int i10 = this.j;
        this.j = i10 + 1;
        int length2 = ((int[]) this.f2005m).length;
        if (this.f2003k >= length2) {
            int i11 = length2 * 2;
            ?? r9 = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                r9[i12] = i13;
                i12 = i13;
            }
            p078i6.m.d0(0, 0, 14, (int[]) this.f2005m, r9);
            this.f2005m = r9;
        }
        int i14 = this.f2003k;
        int[] iArr2 = (int[]) this.f2005m;
        this.f2003k = iArr2[i14];
        long[] jArr3 = (long[]) this.f2002i;
        jArr3[i10] = j;
        ((int[]) this.f2004l)[i10] = i14;
        iArr2[i14] = i10;
        while (i10 > 0) {
            int i15 = ((i10 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.m.g(jArr3[i15], j) <= 0) {
                break;
            }
            b(i15, i10);
            i10 = i15;
        }
        return i14;
    }

    public void b(int i3, int i9) {
        long[] jArr = (long[]) this.f2002i;
        int[] iArr = (int[]) this.f2004l;
        int[] iArr2 = (int[]) this.f2005m;
        long j = jArr[i3];
        jArr[i3] = jArr[i9];
        jArr[i9] = j;
        int i10 = iArr[i3];
        int i11 = iArr[i9];
        iArr[i3] = i11;
        iArr[i9] = i10;
        iArr2[i11] = i3;
        iArr2[i10] = i9;
    }

    @Override
    public C0222g build() {
        return new C0222g(new C0219e(this));
    }

    @Override
    public int d() {
        return this.j;
    }

    @Override
    public ClipData e() {
        return (ClipData) this.f2002i;
    }

    @Override
    public ContentInfo f() {
        return null;
    }

    @Override
    public int getFlags() {
        return this.f2003k;
    }

    @Override
    public void i(Uri uri) {
        this.f2004l = uri;
    }

    @Override
    public void setExtras(Bundle bundle) {
        this.f2005m = bundle;
    }

    @Override
    public void setFlags(int i3) {
        this.f2003k = i3;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f2001h) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f2002i).getDescription());
                sb.append(", source=");
                int i3 = this.j;
                if (i3 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i3 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i3 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i3 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i3 != 4) {
                    strValueOf = i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i9 = this.f2003k;
                sb.append((i9 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i9));
                Uri uri = (Uri) this.f2004l;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return Y6.f.m(sb, ((Bundle) this.f2005m) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0219e(C0219e c0219e) {
        this.f2001h = 1;
        ClipData clipData = (ClipData) c0219e.f2002i;
        clipData.getClass();
        this.f2002i = clipData;
        int i3 = c0219e.j;
        if (i3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i3 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.j = i3;
        int i9 = c0219e.f2003k;
        if ((i9 & 1) == i9) {
            this.f2003k = i9;
            this.f2004l = (Uri) c0219e.f2004l;
            this.f2005m = (Bundle) c0219e.f2005m;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i9) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
