package p054f7;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p044e7.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p054f7.f f21735i;

    public /* synthetic */ d(p054f7.f fVar, int i3) {
        this.f21734h = i3;
        this.f21735i = fVar;
    }

    @Override // p044e7.l, p044e7.m
    public final void c() {
        int i3 = this.f21734h;
    }

    @Override // p044e7.l
    public final p044e7.m g(p101l7.e eVar) {
        switch (this.f21734h) {
            case 0:
                java.lang.String strB = eVar.b();
                if ("d1".equals(strB)) {
                    return new p054f7.c(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new p054f7.c(this, 1);
                }
                return null;
            default:
                java.lang.String strB2 = eVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new p054f7.e(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new p054f7.e(this, 1);
                }
                return null;
        }
    }

    @Override // p044e7.l
    public final void i(p101l7.e eVar, java.lang.Object obj) {
        switch (this.f21734h) {
            case 0:
                java.lang.String strB = eVar.b();
                boolean zEquals = "k".equals(strB);
                p054f7.f fVar = this.f21735i;
                if (zEquals) {
                    if (obj instanceof java.lang.Integer) {
                        p054f7.a.f21723i.getClass();
                        p054f7.a aVar = (p054f7.a) p054f7.a.j.get((java.lang.Integer) obj);
                        if (aVar == null) {
                            aVar = p054f7.a.UNKNOWN;
                        }
                        fVar.g = aVar;
                    }
                    break;
                } else if ("mv".equals(strB)) {
                    if (obj instanceof int[]) {
                        fVar.f21738a = (int[]) obj;
                    }
                    break;
                } else if ("xs".equals(strB)) {
                    if (obj instanceof java.lang.String) {
                        java.lang.String str = (java.lang.String) obj;
                        if (!str.isEmpty()) {
                            fVar.f21739b = str;
                        }
                    }
                    break;
                } else if ("xi".equals(strB)) {
                    if (obj instanceof java.lang.Integer) {
                        fVar.f21740c = ((java.lang.Integer) obj).intValue();
                    }
                    break;
                } else if ("pn".equals(strB) && (obj instanceof java.lang.String) && !((java.lang.String) obj).isEmpty()) {
                    fVar.getClass();
                    break;
                }
                break;
            default:
                java.lang.String strB2 = eVar.b();
                boolean zEquals2 = "version".equals(strB2);
                p054f7.f fVar2 = this.f21735i;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        fVar2.f21739b = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    fVar2.f21738a = (int[]) obj;
                }
                break;
        }
    }

    @Override // p044e7.l
    public final void p(p101l7.e eVar, p142q7.f fVar) {
        int i3 = this.f21734h;
    }

    @Override // p044e7.l
    public final void s(p101l7.e eVar, p101l7.b bVar, p101l7.e eVar2) {
        int i3 = this.f21734h;
    }

    @Override // p044e7.l
    public final p044e7.l t(p101l7.b bVar, p101l7.e eVar) {
        switch (this.f21734h) {
        }
        return null;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void a(p101l7.e eVar, p142q7.f fVar) {
    }

    private final void b(p101l7.e eVar, p142q7.f fVar) {
    }

    private final void f(p101l7.e eVar, p101l7.b bVar, p101l7.e eVar2) {
    }

    private final void h(p101l7.e eVar, p101l7.b bVar, p101l7.e eVar2) {
    }
}
