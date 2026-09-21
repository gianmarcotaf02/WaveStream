package D1;

/* JADX INFO: renamed from: D1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0219e implements D1.InterfaceC0217d, D1.InterfaceC0221f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f2002i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f2004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Cloneable f2005m;

    public /* synthetic */ C0219e(int i3) {
        this.f2001h = i3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.lang.Cloneable] */
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

    @Override // D1.InterfaceC0217d
    public D1.C0222g build() {
        return new D1.C0222g(new D1.C0219e(this));
    }

    @Override // D1.InterfaceC0221f
    public int d() {
        return this.j;
    }

    @Override // D1.InterfaceC0221f
    public android.content.ClipData e() {
        return (android.content.ClipData) this.f2002i;
    }

    @Override // D1.InterfaceC0221f
    public android.view.ContentInfo f() {
        return null;
    }

    @Override // D1.InterfaceC0221f
    public int getFlags() {
        return this.f2003k;
    }

    @Override // D1.InterfaceC0217d
    public void i(android.net.Uri uri) {
        this.f2004l = uri;
    }

    @Override // D1.InterfaceC0217d
    public void setExtras(android.os.Bundle bundle) {
        this.f2005m = bundle;
    }

    @Override // D1.InterfaceC0217d
    public void setFlags(int i3) {
        this.f2003k = i3;
    }

    public java.lang.String toString() {
        java.lang.String strValueOf;
        java.lang.String str;
        switch (this.f2001h) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentInfoCompat{clip=");
                sb.append(((android.content.ClipData) this.f2002i).getDescription());
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
                    strValueOf = i3 != 5 ? java.lang.String.valueOf(i3) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i9 = this.f2003k;
                sb.append((i9 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : java.lang.String.valueOf(i9));
                android.net.Uri uri = (android.net.Uri) this.f2004l;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return Y6.f.m(sb, ((android.os.Bundle) this.f2005m) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0219e(D1.C0219e c0219e) {
        this.f2001h = 1;
        android.content.ClipData clipData = (android.content.ClipData) c0219e.f2002i;
        clipData.getClass();
        this.f2002i = clipData;
        int i3 = c0219e.j;
        if (i3 < 0) {
            java.util.Locale locale = java.util.Locale.US;
            throw new java.lang.IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i3 > 5) {
            java.util.Locale locale2 = java.util.Locale.US;
            throw new java.lang.IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.j = i3;
        int i9 = c0219e.f2003k;
        if ((i9 & 1) == i9) {
            this.f2003k = i9;
            this.f2004l = (android.net.Uri) c0219e.f2004l;
            this.f2005m = (android.os.Bundle) c0219e.f2005m;
        } else {
            throw new java.lang.IllegalArgumentException("Requested flags 0x" + java.lang.Integer.toHexString(i9) + ", but only 0x" + java.lang.Integer.toHexString(1) + " are allowed");
        }
    }
}
