package p110m7;

/* JADX INFO: renamed from: m7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2639l extends p110m7.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.C2636i f25494h;

    public AbstractC2639l() {
        this.f25494h = new p110m7.C2636i();
    }

    public final boolean h() {
        int i3 = 0;
        while (true) {
            p110m7.A a2 = this.f25494h.f25490a;
            if (i3 >= a2.f25443i.size()) {
                java.util.Iterator it = a2.c().iterator();
                while (it.hasNext()) {
                    if (!p110m7.C2636i.e((java.util.Map.Entry) it.next())) {
                        break;
                    }
                }
                return true;
            }
            if (!p110m7.C2636i.e((java.util.Map.Entry) a2.f25443i.get(i3))) {
                break;
            }
            i3++;
        }
        return false;
    }

    public final int i() {
        p110m7.A a2;
        int i3 = 0;
        int iD = 0;
        while (true) {
            a2 = this.f25494h.f25490a;
            if (i3 >= a2.f25443i.size()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) a2.f25443i.get(i3);
            iD += p110m7.C2636i.d((p110m7.C2640m) entry.getKey(), entry.getValue());
            i3++;
        }
        for (java.util.Map.Entry entry2 : a2.c()) {
            iD += p110m7.C2636i.d((p110m7.C2640m) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final java.lang.Object j(p110m7.C2641n c2641n) {
        n(c2641n);
        p110m7.A a2 = this.f25494h.f25490a;
        p110m7.C2640m c2640m = c2641n.f25500d;
        java.lang.Object obj = a2.get(c2640m);
        if (obj == null) {
            return c2641n.f25498b;
        }
        if (!c2640m.j) {
            return c2641n.a(obj);
        }
        if (c2640m.f25496i.f25458h != p110m7.N.ENUM) {
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c2641n.a(it.next()));
        }
        return arrayList;
    }

    public final boolean k(p110m7.C2641n c2641n) {
        n(c2641n);
        p110m7.C2636i c2636i = this.f25494h;
        c2636i.getClass();
        p110m7.C2640m c2640m = c2641n.f25500d;
        if (c2640m.j) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c2636i.f25490a.get(c2640m) != null;
    }

    public final void l() {
        this.f25494h.f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001d  */
    public final boolean m(p110m7.C2633f c2633f, Z2.M m8, p110m7.C2635h c2635h, int i3) throws p110m7.r {
        boolean z6;
        boolean z9;
        java.lang.Object objB;
        p110m7.AbstractC2629b abstractC2629b;
        p110m7.AbstractC2629b abstractC2629bA = a();
        int i9 = i3 & 7;
        c2635h.getClass();
        p110m7.C2641n c2641n = (p110m7.C2641n) c2635h.f25488a.get(new p110m7.C2634g(i3 >>> 3, abstractC2629bA));
        if (c2641n == null) {
            z9 = false;
            z6 = true;
        } else {
            p110m7.C2640m c2640m = c2641n.f25500d;
            p110m7.M m9 = c2640m.f25496i;
            p110m7.C2636i c2636i = p110m7.C2636i.f25489c;
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
        p110m7.AbstractC2637j abstractC2637jC = null;
        p110m7.C2636i c2636i2 = this.f25494h;
        if (z9) {
            int iD = c2633f.d(c2633f.k());
            p110m7.C2640m c2640m2 = c2641n.f25500d;
            if (c2640m2.f25496i != p110m7.M.f25456n) {
                while (c2633f.b() > 0) {
                    c2636i2.a(c2640m2, p110m7.C2636i.h(c2633f, c2640m2.f25496i));
                }
            } else if (c2633f.b() > 0) {
                c2633f.k();
                throw null;
            }
            c2633f.c(iD);
            return true;
        }
        int iOrdinal = c2641n.f25500d.f25496i.f25458h.ordinal();
        p110m7.C2640m c2640m3 = c2641n.f25500d;
        if (iOrdinal == 7) {
            c2633f.k();
            c2640m3.getClass();
            throw null;
        }
        if (iOrdinal != 8) {
            objB = p110m7.C2636i.h(c2633f, c2640m3.f25496i);
        } else {
            if (!c2640m3.j && (abstractC2629b = (p110m7.AbstractC2629b) c2636i2.f25490a.get(c2640m3)) != null) {
                abstractC2637jC = abstractC2629b.d();
            }
            if (abstractC2637jC == null) {
                abstractC2637jC = c2641n.f25499c.c();
            }
            if (c2640m3.f25496i == p110m7.M.f25454l) {
                int i10 = c2633f.f25484i;
                if (i10 >= 64) {
                    throw new p110m7.r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                }
                c2633f.f25484i = i10 + 1;
                abstractC2637jC.c(c2633f, c2635h);
                c2633f.a((c2640m3.f25495h << 3) | 4);
                c2633f.f25484i--;
            } else {
                int iK = c2633f.k();
                if (c2633f.f25484i >= 64) {
                    throw new p110m7.r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
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

    public final void n(p110m7.C2641n c2641n) {
        if (c2641n.f25497a != a()) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC2639l(p110m7.AbstractC2638k abstractC2638k) {
        abstractC2638k.f25493i.f();
        abstractC2638k.j = false;
        this.f25494h = abstractC2638k.f25493i;
    }
}
