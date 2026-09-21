package O7;

import C5.C0132n0;
import D1.B;
import java.util.Iterator;
import java.util.regex.Matcher;
import p078i6.AbstractC2250a;

public final class l extends AbstractC2250a {

    public final int f8053h;

    public final Object f8054i;

    public l(int i3, Object obj) {
        this.f8053h = i3;
        this.f8054i = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f8053h) {
            case 0:
                if (obj == null ? true : obj instanceof i) {
                    return super.contains((i) obj);
                }
                return false;
            default:
                return ((p064h0.c) this.f8054i).containsValue(obj);
        }
    }

    @Override
    public final int d() {
        switch (this.f8053h) {
            case 0:
                return ((m) this.f8054i).f8055a.groupCount() + 1;
            default:
                p064h0.c cVar = (p064h0.c) this.f8054i;
                cVar.getClass();
                return cVar.f22433i;
        }
    }

    public i e(int i3) {
        m mVar = (m) this.f8054i;
        Matcher matcher = mVar.f8055a;
        D6.g gVarW = r.W(matcher.start(i3), matcher.end(i3));
        if (gVarW.f2458h < 0) {
            return null;
        }
        String strGroup = mVar.f8055a.group(i3);
        kotlin.jvm.internal.m.d(strGroup, "group(...)");
        return new i(strGroup, gVarW);
    }

    @Override
    public boolean isEmpty() {
        switch (this.f8053h) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8053h) {
            case 0:
                return new B(N7.o.p0(p078i6.o.Y0(p078i6.p.z0(this)), new C0132n0(15, this)));
            default:
                p064h0.c cVar = (p064h0.c) this.f8054i;
                p064h0.l[] lVarArr = new p064h0.l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new p064h0.m(2);
                }
                return new p064h0.j(cVar.f22432h, lVarArr);
        }
    }
}
