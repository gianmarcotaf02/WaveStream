package p054f7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements p044e7.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f21732h;

    public b(int i3) {
        switch (i3) {
            case 1:
                this.f21732h = new java.util.ArrayList();
                break;
            default:
                this.f21732h = new java.util.ArrayList();
                break;
        }
    }

    public boolean a(int i3, p020c0.N n3, java.lang.Object obj) {
        java.util.ArrayList arrayList = n3.f18152a;
        if (arrayList == null) {
            b(i3, n3, null);
            return true;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            java.lang.Object obj2 = arrayList.get(i9);
            if (obj2 instanceof p020c0.C1668a) {
                if (kotlin.jvm.internal.m.a(obj2, obj)) {
                    b(0, n3, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof p020c0.N)) {
                    throw new java.lang.IllegalStateException(p121o0.p.n(obj2, "Unexpected child source info "));
                }
                if (a(i3, (p020c0.N) obj2, obj)) {
                    b(0, n3, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void b(int i3, p020c0.N n3, java.lang.Object obj) {
        this.f21732h.add(new p129p0.b(i3, null, null));
    }

    @Override // p044e7.m
    public void c() {
        e((java.lang.String[]) this.f21732h.toArray(new java.lang.String[0]));
    }

    public void d(int i3, java.lang.Object obj, p020c0.N n3, java.lang.Object obj2) {
        if (kotlin.jvm.internal.m.a(obj, p020c0.C1690l.f18284a)) {
            b(i3, n3, null);
        }
    }

    public abstract void e(java.lang.String[] strArr);

    @Override // p044e7.m
    public void h(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            this.f21732h.add((java.lang.String) obj);
        }
    }

    @Override // p044e7.m
    public p044e7.l k(p101l7.b bVar) {
        return null;
    }

    @Override // p044e7.m
    public void j(p142q7.f fVar) {
    }

    @Override // p044e7.m
    public void f(p101l7.b bVar, p101l7.e eVar) {
    }
}
