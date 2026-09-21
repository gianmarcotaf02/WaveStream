package S4;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f9431c;

    public p(java.lang.String baseName, int i3, java.util.List list) {
        kotlin.jvm.internal.m.e(baseName, "baseName");
        this.f9429a = i3;
        this.f9430b = baseName;
        this.f9431c = list;
    }

    public static S4.p a(S4.p pVar, int i3, java.util.ArrayList arrayList) {
        java.lang.String baseName = pVar.f9430b;
        kotlin.jvm.internal.m.e(baseName, "baseName");
        return new S4.p(baseName, i3, arrayList);
    }

    public final boolean b() {
        java.util.List list = this.f9431c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((S4.C0867f) it.next()).f9387a.a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.f9431c.size() > 1;
    }

    public final int d() {
        return this.f9429a;
    }

    public final com.kiptv.core.model.XtreamLiveStream e() {
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream;
        java.util.List list = this.f9431c;
        S4.C0867f c0867f = (S4.C0867f) p078i6.o.s1(list);
        return (c0867f == null || (xtreamLiveStream = c0867f.f9387a) == null) ? ((S4.C0867f) list.get(0)).f9387a : xtreamLiveStream;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.p)) {
            return false;
        }
        S4.p pVar = (S4.p) obj;
        return this.f9429a == pVar.f9429a && kotlin.jvm.internal.m.a(this.f9430b, pVar.f9430b) && kotlin.jvm.internal.m.a(this.f9431c, pVar.f9431c);
    }

    public final java.util.List f() {
        return this.f9431c;
    }

    public final int hashCode() {
        return this.f9431c.hashCode() + B2.a.a(java.lang.Integer.hashCode(this.f9429a) * 31, 31, this.f9430b);
    }

    public final java.lang.String toString() {
        return "GroupedChannel(id=" + this.f9429a + ", baseName=" + this.f9430b + ", variants=" + this.f9431c + ")";
    }
}
