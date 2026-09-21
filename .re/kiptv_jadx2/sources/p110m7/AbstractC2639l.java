package p110m7;

import Z2.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractC2639l extends o {

    public final C2636i f25494h;

    public AbstractC2639l() {
        this.f25494h = new C2636i();
    }

    public final boolean h() {
        int i3 = 0;
        while (true) {
            A a2 = this.f25494h.f25490a;
            if (i3 >= a2.f25443i.size()) {
                Iterator it = a2.c().iterator();
                while (it.hasNext()) {
                    if (!C2636i.e((Map.Entry) it.next())) {
                        break;
                    }
                }
                return true;
            }
            if (!C2636i.e((Map.Entry) a2.f25443i.get(i3))) {
                break;
            }
            i3++;
        }
        return false;
    }

    public final int i() {
        A a2;
        int i3 = 0;
        int iD = 0;
        while (true) {
            a2 = this.f25494h.f25490a;
            if (i3 >= a2.f25443i.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) a2.f25443i.get(i3);
            iD += C2636i.d((C2640m) entry.getKey(), entry.getValue());
            i3++;
        }
        for (Map.Entry entry2 : a2.c()) {
            iD += C2636i.d((C2640m) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object j(C2641n c2641n) {
        n(c2641n);
        A a2 = this.f25494h.f25490a;
        C2640m c2640m = c2641n.f25500d;
        Object obj = a2.get(c2640m);
        if (obj == null) {
            return c2641n.f25498b;
        }
        if (!c2640m.j) {
            return c2641n.a(obj);
        }
        if (c2640m.f25496i.f25458h != N.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c2641n.a(it.next()));
        }
        return arrayList;
    }

    public final boolean k(C2641n c2641n) {
        n(c2641n);
        C2636i c2636i = this.f25494h;
        c2636i.getClass();
        C2640m c2640m = c2641n.f25500d;
        if (c2640m.j) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c2636i.f25490a.get(c2640m) != null;
    }

    public final void l() {
        this.f25494h.f();
    }

    public final boolean m(C2633f c2633f, M m8, C2635h c2635h, int i3) throws r {
        boolean z6;
        boolean z9;
        Object objB;
        AbstractC2629b abstractC2629b;
        AbstractC2629b abstractC2629bA = a();
        int i9 = i3 & 7;
        c2635h.getClass();
        C2641n c2641n = (C2641n) c2635h.f25488a.get(new C2634g(i3 >>> 3, abstractC2629bA));
        if (c2641n == null) {
            z9 = false;
            z6 = true;
        } else {
            C2640m c2640m = c2641n.f25500d;
            M m9 = c2640m.f25496i;
            C2636i c2636i = C2636i.f25489c;
            if (i9 == m9.f25459i) {
                z6 = false;
                z9 = false;
            } else if (c2640m.j && m9.a() && i9 == 2) {
                z6 = false;
                z9 = true;
            } else {
                z9 = false;
                z6 = true;
            }
        }
        if (z6) {
            return c2633f.q(i3, m8);
        }
        AbstractC2637j abstractC2637jC = null;
        C2636i c2636i2 = this.f25494h;
        if (z9) {
            int iD = c2633f.d(c2633f.k());
            C2640m c2640m2 = c2641n.f25500d;
            if (c2640m2.f25496i != M.f25456n) {
                while (c2633f.b() > 0) {
                    c2636i2.a(c2640m2, C2636i.h(c2633f, c2640m2.f25496i));
                }
            } else if (c2633f.b() > 0) {
                c2633f.k();
                throw null;
            }
            c2633f.c(iD);
            return true;
        }
        int iOrdinal = c2641n.f25500d.f25496i.f25458h.ordinal();
        C2640m c2640m3 = c2641n.f25500d;
        if (iOrdinal == 7) {
            c2633f.k();
            c2640m3.getClass();
            throw null;
        }
        if (iOrdinal != 8) {
            objB = C2636i.h(c2633f, c2640m3.f25496i);
        } else {
            if (!c2640m3.j && (abstractC2629b = (AbstractC2629b) c2636i2.f25490a.get(c2640m3)) != null) {
                abstractC2637jC = abstractC2629b.d();
            }
            if (abstractC2637jC == null) {
                abstractC2637jC = c2641n.f25499c.c();
            }
            if (c2640m3.f25496i == M.f25454l) {
                int i10 = c2633f.f25484i;
                if (i10 >= 64) {
                    throw new r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                c2633f.f25484i = i10 + 1;
                abstractC2637jC.c(c2633f, c2635h);
                c2633f.a((c2640m3.f25495h << 3) | 4);
                c2633f.f25484i--;
            } else {
                int iK = c2633f.k();
                if (c2633f.f25484i >= 64) {
                    throw new r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                int iD2 = c2633f.d(iK);
                c2633f.f25484i++;
                abstractC2637jC.c(c2633f, c2635h);
                c2633f.a(0);
                c2633f.f25484i--;
                c2633f.c(iD2);
            }
            objB = abstractC2637jC.b();
        }
        if (c2640m3.j) {
            c2636i2.a(c2640m3, c2641n.b(objB));
            return true;
        }
        c2636i2.i(c2640m3, c2641n.b(objB));
        return true;
    }

    public final void n(C2641n c2641n) {
        if (c2641n.f25497a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC2639l(AbstractC2638k abstractC2638k) {
        abstractC2638k.f25493i.f();
        abstractC2638k.j = false;
        this.f25494h = abstractC2638k.f25493i;
    }
}
