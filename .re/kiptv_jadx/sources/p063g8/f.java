package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public class f implements p063g8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f22376a;

    public f(java.util.ArrayList formats) {
        kotlin.jvm.internal.m.e(formats, "formats");
        this.f22376a = formats;
    }

    @Override // p063g8.k
    public h8.a a() {
        java.util.ArrayList arrayList = this.f22376a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p063g8.n) it.next()).a());
        }
        return arrayList2.size() == 1 ? (h8.a) p078i6.o.D1(arrayList2) : new h8.a();
    }

    @Override // p063g8.k
    public p080i8.p b() {
        java.util.ArrayList arrayList = this.f22376a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p063g8.n) it.next()).b());
        }
        return com.google.android.gms.internal.play_billing.V0.k(arrayList2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p063g8.f) {
            return kotlin.jvm.internal.m.a(this.f22376a, ((p063g8.f) obj).f22376a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22376a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("ConcatenatedFormatStructure("), p078i6.o.o1(this.f22376a, ", ", null, null, null, 62), ')');
    }
}
