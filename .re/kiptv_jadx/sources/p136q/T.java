package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class T implements java.lang.Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f26355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ int[] f26356i;
    public /* synthetic */ java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f26357k;

    public T(int i3) {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 4;
        this.f26356i = new int[i12];
        this.j = new java.lang.Object[i12];
    }

    public final void a(int i3, java.lang.Object obj) {
        int i9 = this.f26357k;
        if (i9 != 0 && i3 <= this.f26356i[i9 - 1]) {
            f(i3, obj);
            return;
        }
        if (this.f26355h && i9 >= this.f26356i.length) {
            p136q.AbstractC2674s.a(this);
        }
        int i10 = this.f26357k;
        if (i10 >= this.f26356i.length) {
            int i11 = (i10 + 1) * 4;
            for (int i12 = 4; i12 < 32; i12++) {
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.f26356i, i14);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f26356i = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.j, i14);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.j = objArrCopyOf;
        }
        this.f26356i[i10] = i3;
        this.j[i10] = obj;
        this.f26357k = i10 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p136q.T clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        kotlin.jvm.internal.m.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        p136q.T t9 = (p136q.T) objClone;
        t9.f26356i = (int[]) this.f26356i.clone();
        t9.j = (java.lang.Object[]) this.j.clone();
        return t9;
    }

    public final boolean c(int i3) {
        if (this.f26355h) {
            p136q.AbstractC2674s.a(this);
        }
        return p144r.a.a(this.f26357k, i3, this.f26356i) >= 0;
    }

    public final java.lang.Object d(int i3) {
        java.lang.Object obj;
        int iA = p144r.a.a(this.f26357k, i3, this.f26356i);
        if (iA < 0 || (obj = this.j[iA]) == p136q.AbstractC2674s.f26420c) {
            return null;
        }
        return obj;
    }

    public final int e(int i3) {
        if (this.f26355h) {
            p136q.AbstractC2674s.a(this);
        }
        return this.f26356i[i3];
    }

    public final void f(int i3, java.lang.Object obj) {
        int iA = p144r.a.a(this.f26357k, i3, this.f26356i);
        if (iA >= 0) {
            this.j[iA] = obj;
            return;
        }
        int i9 = ~iA;
        int i10 = this.f26357k;
        if (i9 < i10) {
            java.lang.Object[] objArr = this.j;
            if (objArr[i9] == p136q.AbstractC2674s.f26420c) {
                this.f26356i[i9] = i3;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.f26355h && i10 >= this.f26356i.length) {
            p136q.AbstractC2674s.a(this);
            i9 = ~p144r.a.a(this.f26357k, i3, this.f26356i);
        }
        int i11 = this.f26357k;
        if (i11 >= this.f26356i.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.f26356i, i15);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f26356i = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.j, i15);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.j = objArrCopyOf;
        }
        int i16 = this.f26357k;
        if (i16 - i9 != 0) {
            int[] iArr = this.f26356i;
            int i17 = i9 + 1;
            p078i6.m.Y(i17, i9, i16, iArr, iArr);
            java.lang.Object[] objArr2 = this.j;
            p078i6.m.Z(i17, i9, this.f26357k, objArr2, objArr2);
        }
        this.f26356i[i9] = i3;
        this.j[i9] = obj;
        this.f26357k++;
    }

    public final int g() {
        if (this.f26355h) {
            p136q.AbstractC2674s.a(this);
        }
        return this.f26357k;
    }

    public final java.lang.Object h(int i3) {
        if (this.f26355h) {
            p136q.AbstractC2674s.a(this);
        }
        java.lang.Object[] objArr = this.j;
        if (i3 < objArr.length) {
            return objArr[i3];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    public final java.lang.String toString() {
        if (g() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f26357k * 28);
        sb.append('{');
        int i3 = this.f26357k;
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(e(i9));
            sb.append('=');
            java.lang.Object objH = h(i9);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
