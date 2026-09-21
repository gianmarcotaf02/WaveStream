package Z2;

/* JADX INFO: renamed from: Z2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1202m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f12900b;

    public C1202m(int i3) {
        this.f12899a = i3;
        switch (i3) {
            case 1:
                this.f12900b = new java.util.ArrayList();
                break;
            case 2:
                this.f12900b = new java.util.ArrayList(20);
                break;
            default:
                this.f12900b = null;
                break;
        }
    }

    public void a(Z2.C1200l c1200l) {
        if (this.f12900b == null) {
            this.f12900b = new java.util.ArrayList();
        }
        for (int i3 = 0; i3 < this.f12900b.size(); i3++) {
            if (((Z2.C1200l) this.f12900b.get(i3)).f12895a.f12903b > c1200l.f12895a.f12903b) {
                this.f12900b.add(i3, c1200l);
                return;
            }
        }
        this.f12900b.add(c1200l);
    }

    public void b(p063g8.k kVar) {
        boolean z6 = kVar instanceof p063g8.n;
        java.util.ArrayList arrayList = this.f12900b;
        if (z6) {
            arrayList.add(kVar);
        } else if (kVar instanceof p063g8.f) {
            java.util.Iterator it = ((p063g8.f) kVar).f22376a.iterator();
            while (it.hasNext()) {
                arrayList.add((p063g8.n) it.next());
            }
        }
    }

    public void c(Z2.C1202m c1202m) {
        if (c1202m.f12900b == null) {
            return;
        }
        if (this.f12900b == null) {
            this.f12900b = new java.util.ArrayList(c1202m.f12900b.size());
        }
        java.util.Iterator it = c1202m.f12900b.iterator();
        while (it.hasNext()) {
            a((Z2.C1200l) it.next());
        }
    }

    public void d(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        java.util.ArrayList arrayList = this.f12900b;
        arrayList.add(name);
        arrayList.add(O7.q.r1(value).toString());
    }

    public w8.m e() {
        return new w8.m((java.lang.String[]) this.f12900b.toArray(new java.lang.String[0]));
    }

    public void f(java.lang.String str) {
        int i3 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f12900b;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((java.lang.String) arrayList.get(i3))) {
                arrayList.remove(i3);
                arrayList.remove(i3);
                i3 -= 2;
            }
            i3 += 2;
        }
    }

    public java.lang.String toString() {
        switch (this.f12899a) {
            case 0:
                if (this.f12900b == null) {
                    return "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.util.Iterator it = this.f12900b.iterator();
                while (it.hasNext()) {
                    sb.append(((Z2.C1200l) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
