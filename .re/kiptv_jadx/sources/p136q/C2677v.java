package p136q;

/* JADX INFO: renamed from: q.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2677v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f26430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26431b;

    public C2677v(int i3) {
        this.f26430a = i3 == 0 ? p136q.AbstractC2670n.f26403a : new int[i3];
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
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, java.lang.Math.max(i3, (iArr.length * 3) / 2));
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f26430a = iArrCopyOf;
        }
    }

    public final int c(int i3) {
        if (i3 >= 0 && i3 < this.f26431b) {
            return this.f26430a[i3];
        }
        p144r.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void d(int i3) {
        int i9;
        if (i3 < 0 || i3 >= (i9 = this.f26431b)) {
            p144r.a.d("Index must be between 0 and size");
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
            p144r.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f26430a;
        int i10 = iArr[i3];
        iArr[i3] = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p136q.C2677v) {
            p136q.C2677v c2677v = (p136q.C2677v) obj;
            int i3 = c2677v.f26431b;
            int i9 = this.f26431b;
            if (i3 == i9) {
                int[] iArr = this.f26430a;
                int[] iArr2 = c2677v.f26430a;
                D6.g gVarW = O7.r.W(0, i9);
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
            iHashCode += java.lang.Integer.hashCode(iArr[i9]) * 31;
        }
        return iHashCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        int[] iArr = this.f26430a;
        int i3 = this.f26431b;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = iArr[i9];
            if (i9 == -1) {
                sb.append((java.lang.CharSequence) "...");
                java.lang.String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                return string;
            }
            if (i9 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append(i10);
        }
        sb.append((java.lang.CharSequence) "]");
        java.lang.String string2 = sb.toString();
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        return string2;
    }

    public /* synthetic */ C2677v() {
        this(16);
    }
}
