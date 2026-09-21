package p054f7;

import p044e7.l;
import p044e7.m;
import p101l7.b;
import p101l7.e;
import p142q7.f;

public final class d implements l {

    public final int f21734h;

    public final f f21735i;

    public d(f fVar, int i3) {
        this.f21734h = i3;
        this.f21735i = fVar;
    }

    @Override
    public final void c() {
        int i3 = this.f21734h;
    }

    @Override
    public final m g(e eVar) {
        switch (this.f21734h) {
            case 0:
                String strB = eVar.b();
                if ("d1".equals(strB)) {
                    return new c(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new c(this, 1);
                }
                return null;
            default:
                String strB2 = eVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new e(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new e(this, 1);
                }
                return null;
        }
    }

    @Override
    public final void i(e eVar, Object obj) {
        switch (this.f21734h) {
            case 0:
                String strB = eVar.b();
                boolean zEquals = "k".equals(strB);
                f fVar = this.f21735i;
                if (zEquals) {
                    if (obj instanceof Integer) {
                        a.f21723i.getClass();
                        a aVar = (a) a.j.get((Integer) obj);
                        if (aVar == null) {
                            aVar = a.UNKNOWN;
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
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.isEmpty()) {
                            fVar.f21739b = str;
                        }
                    }
                    break;
                } else if ("xi".equals(strB)) {
                    if (obj instanceof Integer) {
                        fVar.f21740c = ((Integer) obj).intValue();
                    }
                    break;
                } else if ("pn".equals(strB) && (obj instanceof String) && !((String) obj).isEmpty()) {
                    fVar.getClass();
                    break;
                }
                break;
            default:
                String strB2 = eVar.b();
                boolean zEquals2 = "version".equals(strB2);
                f fVar2 = this.f21735i;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        fVar2.f21739b = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    fVar2.f21738a = (int[]) obj;
                }
                break;
        }
    }

    @Override
    public final void p(e eVar, f fVar) {
        int i3 = this.f21734h;
    }

    @Override
    public final void s(e eVar, b bVar, e eVar2) {
        int i3 = this.f21734h;
    }

    @Override
    public final l t(b bVar, e eVar) {
        switch (this.f21734h) {
        }
        return null;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void a(e eVar, f fVar) {
    }

    private final void b(e eVar, f fVar) {
    }

    private final void f(e eVar, b bVar, e eVar2) {
    }

    private final void h(e eVar, b bVar, e eVar2) {
    }
}
