package Y2;

/* JADX INFO: renamed from: Y2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1038h implements D1.InterfaceC0218d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f11470c;

    public C1038h(java.security.MessageDigest messageDigest, int i3) {
        java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f11470c = messageDigest;
        this.f11468a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(Y2.C1038h c1038h, p070h6.C2180b c2180b, p117n6.a aVar) {
        t8.G g;
        byte bG;
        java.util.LinkedHashMap linkedHashMap;
        Y2.C1038h c1038h2;
        byte bF;
        java.util.LinkedHashMap linkedHashMap2;
        t8.AbstractC2851a abstractC2851a;
        if (aVar instanceof t8.G) {
            g = (t8.G) aVar;
            int i3 = g.f28573n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g.f28573n = i3 - Integer.MIN_VALUE;
            } else {
                g = new t8.G(c1038h, aVar);
            }
        } else {
            g = new t8.G(c1038h, aVar);
        }
        java.lang.Object obj = g.f28571l;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = g.f28573n;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str = g.f28570k;
            linkedHashMap2 = g.j;
            c1038h2 = g.f28569i;
            p070h6.C2180b c2180b2 = g.f28568h;
            com.google.common.util.concurrent.P.u0(obj);
            linkedHashMap2.put(str, (kotlinx.serialization.json.b) obj);
            bF = ((t8.AbstractC2851a) c1038h2.f11470c).f();
            if (bF == 4) {
                bG = bF;
                c1038h = c1038h2;
                linkedHashMap = linkedHashMap2;
                c2180b = c2180b2;
            } else if (bF != 7) {
                t8.AbstractC2851a.r((t8.AbstractC2851a) c1038h2.f11470c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            abstractC2851a = (t8.AbstractC2851a) c1038h2.f11470c;
            if (bF == 6) {
                abstractC2851a.g((byte) 7);
            } else if (bF == 4) {
                t8.x.p(abstractC2851a, "object");
                throw null;
            }
            return new kotlinx.serialization.json.c(linkedHashMap2);
        }
        com.google.common.util.concurrent.P.u0(obj);
        t8.AbstractC2851a abstractC2851a2 = (t8.AbstractC2851a) c1038h.f11470c;
        bG = abstractC2851a2.g((byte) 6);
        if (abstractC2851a2.w() == 4) {
            t8.AbstractC2851a.r(abstractC2851a2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new java.util.LinkedHashMap();
        t8.AbstractC2851a abstractC2851a3 = (t8.AbstractC2851a) c1038h.f11470c;
        if (abstractC2851a3.c()) {
            java.lang.String strL = c1038h.f11469b ? abstractC2851a3.l() : abstractC2851a3.j();
            abstractC2851a3.g((byte) 5);
            g.f28568h = c2180b;
            g.f28569i = c1038h;
            g.j = linkedHashMap;
            g.f28570k = strL;
            g.f28573n = 1;
            c2180b.getClass();
            c2180b.f22528i = g;
            return aVar2;
        }
        byte b9 = bG;
        c1038h2 = c1038h;
        bF = b9;
        linkedHashMap2 = linkedHashMap;
        abstractC2851a = (t8.AbstractC2851a) c1038h2.f11470c;
        if (bF == 6) {
            abstractC2851a.g((byte) 7);
        } else if (bF == 4) {
            t8.x.p(abstractC2851a, "object");
            throw null;
        }
        return new kotlinx.serialization.json.c(linkedHashMap2);
    }

    public static int e(java.util.ArrayList arrayList, int i3, Z2.AbstractC1181b0 abstractC1181b0) {
        int i9 = 0;
        if (i3 < 0) {
            return 0;
        }
        java.lang.Object obj = arrayList.get(i3);
        Z2.Z z6 = abstractC1181b0.f12870b;
        if (obj != z6) {
            return -1;
        }
        java.util.Iterator it = z6.b().iterator();
        while (it.hasNext()) {
            if (((Z2.AbstractC1185d0) it.next()) == abstractC1181b0) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static java.util.ArrayList g(Z2.C1182c c1182c) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!c1182c.w()) {
            java.lang.String strSubstring = null;
            if (!c1182c.w()) {
                int i3 = c1182c.f12783b;
                java.lang.String str = (java.lang.String) c1182c.f12785d;
                char cCharAt = str.charAt(i3);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    c1182c.f12783b = i3;
                } else {
                    int iG = c1182c.g();
                    while (true) {
                        if ((iG < 65 || iG > 90) && (iG < 97 || iG > 122)) {
                            break;
                        }
                        iG = c1182c.g();
                    }
                    strSubstring = str.substring(i3, c1182c.f12783b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(Z2.EnumC1184d.valueOf(strSubstring));
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (!c1182c.W()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean m(Z2.C1204n c1204n, int i3, java.util.ArrayList arrayList, int i9, Z2.AbstractC1181b0 abstractC1181b0) {
        Z2.C1205o c1205o = (Z2.C1205o) c1204n.f12902a.get(i3);
        if (!p(c1205o, abstractC1181b0)) {
            return false;
        }
        int i10 = c1205o.f12904a;
        if (i10 == 1) {
            if (i3 != 0) {
                while (i9 >= 0) {
                    if (!o(c1204n, i3 - 1, arrayList, i9)) {
                        i9--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i10 == 2) {
            return o(c1204n, i3 - 1, arrayList, i9);
        }
        int iE = e(arrayList, i9, abstractC1181b0);
        if (iE <= 0) {
            return false;
        }
        return m(c1204n, i3 - 1, arrayList, i9, (Z2.AbstractC1181b0) abstractC1181b0.f12870b.b().get(iE - 1));
    }

    public static boolean n(Z2.C1204n c1204n, Z2.AbstractC1181b0 abstractC1181b0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object obj = abstractC1181b0.f12870b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((Z2.AbstractC1185d0) obj).f12870b;
        }
        int size = arrayList.size() - 1;
        java.util.ArrayList arrayList2 = c1204n.f12902a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return p((Z2.C1205o) c1204n.f12902a.get(0), abstractC1181b0);
        }
        java.util.ArrayList arrayList3 = c1204n.f12902a;
        return m(c1204n, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC1181b0);
    }

    public static boolean o(Z2.C1204n c1204n, int i3, java.util.ArrayList arrayList, int i9) {
        Z2.C1205o c1205o = (Z2.C1205o) c1204n.f12902a.get(i3);
        Z2.AbstractC1181b0 abstractC1181b0 = (Z2.AbstractC1181b0) arrayList.get(i9);
        if (!p(c1205o, abstractC1181b0)) {
            return false;
        }
        int i10 = c1205o.f12904a;
        if (i10 == 1) {
            if (i3 != 0) {
                while (i9 > 0) {
                    i9--;
                    if (o(c1204n, i3 - 1, arrayList, i9)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i10 == 2) {
            return o(c1204n, i3 - 1, arrayList, i9 - 1);
        }
        int iE = e(arrayList, i9, abstractC1181b0);
        if (iE <= 0) {
            return false;
        }
        return m(c1204n, i3 - 1, arrayList, i9, (Z2.AbstractC1181b0) abstractC1181b0.f12870b.b().get(iE - 1));
    }

    public static boolean p(Z2.C1205o c1205o, Z2.AbstractC1181b0 abstractC1181b0) {
        java.util.ArrayList arrayList;
        java.lang.String str = c1205o.f12905b;
        if (str != null && !str.equals(abstractC1181b0.o().toLowerCase(java.util.Locale.US))) {
            return false;
        }
        java.util.ArrayList<Z2.C1180b> arrayList2 = c1205o.f12906c;
        if (arrayList2 != null) {
            for (Z2.C1180b c1180b : arrayList2) {
                java.lang.String str2 = c1180b.f12856a;
                java.lang.String str3 = c1180b.f12858c;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC1181b0.f12859c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = abstractC1181b0.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        java.util.ArrayList arrayList3 = c1205o.f12907d;
        if (arrayList3 == null) {
            return true;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((Z2.InterfaceC1186e) it.next()).a(abstractC1181b0)) {
                return false;
            }
        }
        return true;
    }

    @Override // D1.InterfaceC0218d0
    public void a() {
        this.f11469b = true;
    }

    @Override // D1.InterfaceC0218d0
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f11469b = false;
    }

    @Override // D1.InterfaceC0218d0
    public void c() {
        if (this.f11469b) {
            return;
        }
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = (androidx.appcompat.widget.ActionBarContextView) this.f11470c;
        actionBarContextView.f15675m = null;
        super/*android.view.View*/.setVisibility(this.f11468a);
    }

    public void f(Z2.C1202m c1202m, Z2.C1182c c1182c) throws Z2.C1178a {
        int iIntValue;
        int iL0;
        java.lang.String strN0 = c1182c.n0();
        c1182c.X();
        if (strN0 == null) {
            throw new Z2.C1178a("Invalid '@' rule");
        }
        int i3 = 0;
        if (!this.f11469b && strN0.equals(io.ktor.http.LinkHeader.Parameters.Media)) {
            java.util.ArrayList arrayListG = g(c1182c);
            if (!c1182c.t('{')) {
                throw new Z2.C1178a("Invalid @media rule: missing rule set");
            }
            c1182c.X();
            Z2.EnumC1184d enumC1184d = (Z2.EnumC1184d) this.f11470c;
            java.util.Iterator it = arrayListG.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i(c1182c);
                    break;
                }
                Z2.EnumC1184d enumC1184d2 = (Z2.EnumC1184d) it.next();
                if (enumC1184d2 == Z2.EnumC1184d.f12867h || enumC1184d2 == enumC1184d) {
                    this.f11469b = true;
                    c1202m.c(i(c1182c));
                    this.f11469b = false;
                    break;
                }
            }
            if (!c1182c.w() && !c1182c.t('}')) {
                throw new Z2.C1178a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f11469b || !strN0.equals("import")) {
            android.util.Log.w("CSSParser", "Ignoring @" + strN0 + " rule");
            while (!c1182c.w() && ((iIntValue = c1182c.J().intValue()) != 59 || i3 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i3 > 0 && (i3 = i3 - 1) == 0) {
                        break;
                    }
                } else {
                    i3++;
                }
            }
        } else {
            java.lang.String strM0 = null;
            if (!c1182c.w()) {
                int i9 = c1182c.f12783b;
                if (c1182c.u("url(")) {
                    c1182c.X();
                    java.lang.String strM1 = c1182c.m0();
                    if (strM1 == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        while (!c1182c.w()) {
                            int i10 = c1182c.f12783b;
                            java.lang.String str = (java.lang.String) c1182c.f12785d;
                            char cCharAt = str.charAt(i10);
                            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || Z2.M.G(cCharAt) || java.lang.Character.isISOControl((int) cCharAt)) {
                                break;
                            }
                            c1182c.f12783b++;
                            if (cCharAt == '\\') {
                                if (!c1182c.w()) {
                                    int i11 = c1182c.f12783b;
                                    c1182c.f12783b = i11 + 1;
                                    cCharAt = str.charAt(i11);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iL1 = Z2.C1182c.l0(cCharAt);
                                        if (iL1 != -1) {
                                            for (int i12 = 1; i12 <= 5 && !c1182c.w() && (iL0 = Z2.C1182c.l0(str.charAt(c1182c.f12783b))) != -1; i12++) {
                                                c1182c.f12783b++;
                                                iL1 = (iL1 * 16) + iL0;
                                            }
                                            sb.append((char) iL1);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strM1 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strM1 == null) {
                        c1182c.f12783b = i9;
                    } else {
                        c1182c.X();
                        if (c1182c.w() || c1182c.u(")")) {
                            strM0 = strM1;
                        } else {
                            c1182c.f12783b = i9;
                        }
                    }
                }
            }
            if (strM0 == null) {
                strM0 = c1182c.m0();
            }
            if (strM0 == null) {
                throw new Z2.C1178a("Invalid @import rule: expected string or url()");
            }
            c1182c.X();
            g(c1182c);
            if (!c1182c.w() && !c1182c.t(';')) {
                throw new Z2.C1178a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c1182c.X();
    }

    public boolean h(Z2.C1202m c1202m, Z2.C1182c c1182c) throws Z2.C1178a {
        java.util.ArrayList<Z2.C1204n> arrayListO0 = c1182c.o0();
        if (arrayListO0 == null || arrayListO0.isEmpty()) {
            return false;
        }
        if (!c1182c.t('{')) {
            throw new Z2.C1178a("Malformed rule block: expected '{'");
        }
        c1182c.X();
        Z2.V v6 = new Z2.V();
        do {
            java.lang.String strN0 = c1182c.n0();
            c1182c.X();
            if (!c1182c.t(':')) {
                throw new Z2.C1178a("Expected ':'");
            }
            c1182c.X();
            java.lang.String strSubstring = null;
            if (!c1182c.w()) {
                int i3 = c1182c.f12783b;
                java.lang.String str = (java.lang.String) c1182c.f12785d;
                int iCharAt = str.charAt(i3);
                int i9 = i3;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!Z2.M.G(iCharAt)) {
                        i9 = c1182c.f12783b + 1;
                    }
                    iCharAt = c1182c.g();
                }
                if (c1182c.f12783b > i3) {
                    strSubstring = str.substring(i3, i9);
                } else {
                    c1182c.f12783b = i3;
                }
            }
            if (strSubstring == null) {
                throw new Z2.C1178a("Expected property value");
            }
            c1182c.X();
            if (c1182c.t('!')) {
                c1182c.X();
                if (!c1182c.u("important")) {
                    throw new Z2.C1178a("Malformed rule set: found unexpected '!'");
                }
                c1182c.X();
            }
            c1182c.t(';');
            Z2.M0.D(v6, strN0, strSubstring);
            c1182c.X();
            if (c1182c.w()) {
                break;
            }
        } while (!c1182c.t('}'));
        c1182c.X();
        for (Z2.C1204n c1204n : arrayListO0) {
            Z2.C1200l c1200l = new Z2.C1200l();
            c1200l.f12895a = c1204n;
            c1200l.f12896b = v6;
            c1200l.f12897c = this.f11468a;
            c1202m.a(c1200l);
        }
        return true;
    }

    public Z2.C1202m i(Z2.C1182c c1182c) {
        Z2.C1202m c1202m = new Z2.C1202m(0);
        while (!c1182c.w()) {
            try {
                if (!c1182c.u("<!--") && !c1182c.u("-->")) {
                    if (!c1182c.t('@')) {
                        if (!h(c1202m, c1182c)) {
                            break;
                        }
                    } else {
                        f(c1202m, c1182c);
                    }
                }
            } catch (Z2.C1178a e6) {
                android.util.Log.e("CSSParser", "CSS parser terminated early due to error: " + e6.getMessage());
            }
        }
        return c1202m;
    }

    public kotlinx.serialization.json.b j() {
        kotlinx.serialization.json.b cVar;
        java.lang.Object obj;
        t8.AbstractC2851a abstractC2851a = (t8.AbstractC2851a) this.f11470c;
        byte bW = abstractC2851a.w();
        if (bW == 1) {
            return l(true);
        }
        if (bW == 0) {
            return l(false);
        }
        if (bW != 6) {
            if (bW == 8) {
                return k();
            }
            t8.AbstractC2851a.r(abstractC2851a, "Cannot read Json element because of unexpected ".concat(t8.x.w(bW)), 0, null, 6);
            throw null;
        }
        int i3 = this.f11468a + 1;
        this.f11468a = i3;
        if (i3 == 200) {
            t8.F f9 = new t8.F(this, null);
            p109m6.a aVar = p070h6.AbstractC2179a.f22526a;
            p070h6.C2180b c2180b = new p070h6.C2180b();
            c2180b.f22527h = f9;
            c2180b.f22528i = c2180b;
            p109m6.a aVar2 = p070h6.AbstractC2179a.f22526a;
            c2180b.j = aVar2;
            while (true) {
                obj = c2180b.j;
                p100l6.c cVar2 = c2180b.f22528i;
                if (cVar2 == null) {
                    break;
                }
                if (kotlin.jvm.internal.m.a(aVar2, obj)) {
                    try {
                        t8.F f10 = c2180b.f22527h;
                        kotlin.jvm.internal.E.c(3, f10);
                        t8.F f11 = new t8.F(f10.f28567k, cVar2);
                        f11.j = c2180b;
                        java.lang.Object objInvokeSuspend = f11.invokeSuspend(p070h6.A.f22523a);
                        if (objInvokeSuspend != p109m6.a.f25430h) {
                            cVar2.resumeWith(objInvokeSuspend);
                        }
                    } catch (java.lang.Throwable th) {
                        cVar2.resumeWith(com.google.common.util.concurrent.P.T(th));
                    }
                } else {
                    c2180b.j = aVar2;
                    cVar2.resumeWith(obj);
                }
            }
            com.google.common.util.concurrent.P.u0(obj);
            cVar = (kotlinx.serialization.json.b) obj;
        } else {
            byte bG = abstractC2851a.g((byte) 6);
            if (abstractC2851a.w() == 4) {
                t8.AbstractC2851a.r(abstractC2851a, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            while (abstractC2851a.c()) {
                java.lang.String strL = this.f11469b ? abstractC2851a.l() : abstractC2851a.j();
                abstractC2851a.g((byte) 5);
                linkedHashMap.put(strL, j());
                bG = abstractC2851a.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    t8.AbstractC2851a.r(abstractC2851a, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                abstractC2851a.g((byte) 7);
            } else if (bG == 4) {
                t8.x.p(abstractC2851a, "object");
                throw null;
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMap);
        }
        this.f11468a--;
        return cVar;
    }

    public kotlinx.serialization.json.a k() {
        t8.AbstractC2851a abstractC2851a = (t8.AbstractC2851a) this.f11470c;
        byte bF = abstractC2851a.f();
        if (abstractC2851a.w() == 4) {
            t8.AbstractC2851a.r(abstractC2851a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (abstractC2851a.c()) {
            arrayList.add(j());
            bF = abstractC2851a.f();
            if (bF != 4) {
                boolean z6 = bF == 9;
                int i3 = abstractC2851a.f28603a;
                if (!z6) {
                    t8.AbstractC2851a.r(abstractC2851a, "Expected end of the array or comma", i3, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            abstractC2851a.g((byte) 9);
        } else if (bF == 4) {
            t8.x.p(abstractC2851a, "array");
            throw null;
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public kotlinx.serialization.json.d l(boolean z6) {
        t8.AbstractC2851a abstractC2851a = (t8.AbstractC2851a) this.f11470c;
        java.lang.String strL = (this.f11469b || !z6) ? abstractC2851a.l() : abstractC2851a.j();
        return (z6 || !kotlin.jvm.internal.m.a(strL, "null")) ? new p162s8.r(strL, z6, null) : kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    public C1038h(C7.B b9, int i3, boolean z6) {
        this.f11470c = b9;
        this.f11468a = i3;
        this.f11469b = z6;
    }

    public C1038h(int i3) {
        Z2.EnumC1184d enumC1184d = Z2.EnumC1184d.f12868i;
        this.f11469b = false;
        this.f11470c = enumC1184d;
        this.f11468a = i3;
    }
}
