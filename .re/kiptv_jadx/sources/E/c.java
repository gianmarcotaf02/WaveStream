package E;

/* JADX INFO: loaded from: classes.dex */
public final class c implements E.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2616a;

    public c(float f9) {
        this.f2616a = f9;
        if (p113n1.f.b(f9, 0) > 0) {
            return;
        }
        A.b.a("Provided size should be larger than zero.");
    }

    @Override // E.d
    public final java.util.ArrayList a(p113n1.c cVar, int i3, int i9) {
        int iK0 = cVar.k0(this.f2616a);
        int i10 = iK0 + i9;
        int i11 = i9 + i3;
        if (i10 >= i11) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(java.lang.Integer.valueOf(i3));
            return arrayList;
        }
        int i12 = i11 / i10;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList2.add(java.lang.Integer.valueOf(iK0));
        }
        return arrayList2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof E.c) {
            return p113n1.f.c(this.f2616a, ((E.c) obj).f2616a);
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f2616a);
    }
}
