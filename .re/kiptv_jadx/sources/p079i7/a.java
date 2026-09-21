package p079i7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f23214e;

    public a(int... numbers) {
        java.util.List listN1;
        kotlin.jvm.internal.m.e(numbers, "numbers");
        this.f23210a = numbers;
        java.lang.Integer numQ0 = p078i6.m.q0(numbers, 0);
        this.f23211b = numQ0 != null ? numQ0.intValue() : -1;
        java.lang.Integer numQ1 = p078i6.m.q0(numbers, 1);
        this.f23212c = numQ1 != null ? numQ1.intValue() : -1;
        java.lang.Integer numQ2 = p078i6.m.q0(numbers, 2);
        this.f23213d = numQ2 != null ? numQ2.intValue() : -1;
        if (numbers.length <= 3) {
            listN1 = p078i6.w.f23205h;
        } else {
            if (numbers.length > 1024) {
                throw new java.lang.IllegalArgumentException(Y6.f.j(new java.lang.StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listN1 = p078i6.o.N1(new p078i6.C2253d(new p078i6.n(numbers), 3, numbers.length));
        }
        this.f23214e = listN1;
    }

    public final boolean a(int i3, int i9, int i10) {
        int i11 = this.f23211b;
        if (i11 > i3) {
            return true;
        }
        if (i11 < i3) {
            return false;
        }
        int i12 = this.f23212c;
        if (i12 > i9) {
            return true;
        }
        return i12 >= i9 && this.f23213d >= i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        p079i7.a aVar = (p079i7.a) obj;
        return this.f23211b == aVar.f23211b && this.f23212c == aVar.f23212c && this.f23213d == aVar.f23213d && kotlin.jvm.internal.m.a(this.f23214e, aVar.f23214e);
    }

    public final int hashCode() {
        int i3 = this.f23211b;
        int i9 = (i3 * 31) + this.f23212c + i3;
        int i10 = (i9 * 31) + this.f23213d + i9;
        return this.f23214e.hashCode() + (i10 * 31) + i10;
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 : this.f23210a) {
            if (i3 == -1) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i3));
        }
        return arrayList.isEmpty() ? "unknown" : p078i6.o.o1(arrayList, ".", null, null, null, 62);
    }
}
