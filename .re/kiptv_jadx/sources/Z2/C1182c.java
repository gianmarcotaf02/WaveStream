package Z2;

/* JADX INFO: renamed from: Z2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1182c extends Z2.M {
    public C1182c(java.lang.String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int l0(int i3) {
        if (i3 >= 48 && i3 <= 57) {
            return i3 - 48;
        }
        if (i3 >= 65 && i3 <= 70) {
            return i3 - 55;
        }
        if (i3 < 97 || i3 > 102) {
            return -1;
        }
        return i3 - 87;
    }

    public final java.lang.String m0() {
        int iL0;
        if (w()) {
            return null;
        }
        char cCharAt = ((java.lang.String) this.f12785d).charAt(this.f12783b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.f12783b++;
        int iIntValue = J().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = J().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = J().intValue();
                    } else {
                        int iL1 = l0(iIntValue);
                        if (iL1 != -1) {
                            for (int i3 = 1; i3 <= 5 && (iL0 = l0((iIntValue = J().intValue()))) != -1; i3++) {
                                iL1 = (iL1 * 16) + iL0;
                            }
                            sb.append((char) iL1);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = J().intValue();
        }
        return sb.toString();
    }

    public final java.lang.String n0() {
        int i3;
        int i9;
        boolean zW = w();
        java.lang.String str = (java.lang.String) this.f12785d;
        if (zW) {
            i9 = this.f12783b;
        } else {
            int i10 = this.f12783b;
            int iCharAt = str.charAt(i10);
            if (iCharAt == 45) {
                iCharAt = g();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i3 = i10;
            } else {
                int iG = g();
                while (true) {
                    if ((iG < 65 || iG > 90) && ((iG < 97 || iG > 122) && !((iG >= 48 && iG <= 57) || iG == 45 || iG == 95))) {
                        break;
                    }
                    iG = g();
                }
                i3 = this.f12783b;
            }
            this.f12783b = i10;
            i9 = i3;
        }
        int i11 = this.f12783b;
        if (i9 == i11) {
            return null;
        }
        java.lang.String strSubstring = str.substring(i11, i9);
        this.f12783b = i9;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:192:0x030d  */
    /* JADX WARN: Code duplicated, block: B:254:0x041e  */
    /* JADX WARN: Code duplicated, block: B:259:0x043c  */
    /* JADX WARN: Code duplicated, block: B:261:0x0440  */
    /* JADX WARN: Code duplicated, block: B:265:0x0456  */
    /* JADX WARN: Code duplicated, block: B:269:0x0465  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:285:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [D1.r] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r11v10, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r11v13, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r11v14, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r11v15, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r11v16, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [Z2.o] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final java.util.ArrayList o0() {
        java.util.ArrayList arrayList;
        int i3;
        ?? c1205o;
        int i9;
        java.lang.String strM;
        int i10;
        int i11;
        Z2.C1206p c1206pA;
        ?? r10;
        D1.r rVar;
        Z2.C1188f c1188f;
        java.lang.Object obj;
        java.util.ArrayList arrayListO0;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.lang.String str = null;
        if (w()) {
            return null;
        }
        ?? r9 = 1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(1);
        Z2.C1204n c1204n = new Z2.C1204n();
        while (!w() && !w()) {
            int i12 = this.f12783b;
            java.util.ArrayList arrayList5 = c1204n.f12902a;
            boolean z6 = false;
            int i13 = 2;
            if (((arrayList5 == null || arrayList5.isEmpty()) ? r9 : 0) != 0) {
                i3 = 0;
            } else if (t('>')) {
                X();
                i3 = 2;
            } else if (t('+')) {
                X();
                i3 = 3;
            } else {
                i3 = 0;
            }
            if (t(io.ktor.util.date.GMTDateParser.ANY)) {
                c1205o = new Z2.C1205o(i3, str);
            } else {
                java.lang.String strN0 = n0();
                if (strN0 != null) {
                    Z2.C1205o c1205o2 = new Z2.C1205o(i3, strN0);
                    c1204n.f12903b += r9;
                    c1205o = c1205o2;
                } else {
                    c1205o = str;
                }
            }
            while (!w()) {
                if (t('.')) {
                    if (c1205o == 0) {
                        c1205o = new Z2.C1205o(i3, str);
                    }
                    java.lang.String strN1 = n0();
                    if (strN1 == null) {
                        throw new Z2.C1178a("Invalid \".class\" simpleSelectors");
                    }
                    c1205o.a(i13, "class", strN1);
                    c1204n.a();
                } else if (t('#')) {
                    if (c1205o == 0) {
                        c1205o = new Z2.C1205o(i3, str);
                    }
                    java.lang.String strN2 = n0();
                    if (strN2 == null) {
                        throw new Z2.C1178a("Invalid \"#id\" simpleSelectors");
                    }
                    c1205o.a(i13, "id", strN2);
                    c1204n.f12903b += 1000000;
                } else if (t('[')) {
                    if (c1205o == 0) {
                        c1205o = new Z2.C1205o(i3, str);
                    }
                    X();
                    java.lang.String strN3 = n0();
                    if (strN3 == null) {
                        throw new Z2.C1178a("Invalid attribute simpleSelectors");
                    }
                    X();
                    if (t('=')) {
                        i9 = i13;
                    } else if (u("~=")) {
                        i9 = 3;
                    } else {
                        i9 = u("|=") ? 4 : z6 ? 1 : 0;
                    }
                    if (i9 != 0) {
                        X();
                        if (w()) {
                            strM = str;
                        } else {
                            strM = M();
                            if (strM == null) {
                                strM = n0();
                            }
                        }
                        if (strM == null) {
                            throw new Z2.C1178a("Invalid attribute simpleSelectors");
                        }
                        X();
                    } else {
                        strM = str;
                    }
                    if (!t(']')) {
                        throw new Z2.C1178a("Invalid attribute simpleSelectors");
                    }
                    if (i9 == 0) {
                        i9 = r9 == true ? 1 : 0;
                    }
                    c1205o.a(i9, strN3, strM);
                    c1204n.a();
                } else {
                    c1205o = c1205o;
                    if (t(':')) {
                        if (c1205o == 0) {
                            c1205o = new Z2.C1205o(i3, str);
                        }
                        java.lang.String strN4 = n0();
                        if (strN4 == null) {
                            throw new Z2.C1178a("Invalid pseudo class");
                        }
                        Z2.EnumC1192h enumC1192h = (Z2.EnumC1192h) Z2.EnumC1192h.f12886l.get(strN4);
                        if (enumC1192h == null) {
                            enumC1192h = Z2.EnumC1192h.f12885k;
                        }
                        switch (enumC1192h.ordinal()) {
                            case 0:
                                Z2.C1190g c1190g = new Z2.C1190g(2);
                                c1204n.a();
                                obj = c1190g;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 1:
                                Z2.C1190g c1190g2 = new Z2.C1190g(1);
                                c1204n.a();
                                obj = c1190g2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z9 = (enumC1192h == Z2.EnumC1192h.f12883h || enumC1192h == Z2.EnumC1192h.f12884i) ? r9 == true ? 1 : 0 : z6 ? 1 : 0;
                                boolean z10 = (enumC1192h == Z2.EnumC1192h.f12884i || enumC1192h == Z2.EnumC1192h.j) ? r9 == true ? 1 : 0 : z6 ? 1 : 0;
                                if (w()) {
                                    r10 = str;
                                } else {
                                    int i14 = this.f12783b;
                                    if (t('(')) {
                                        X();
                                        if (u("odd")) {
                                            rVar = new D1.r(2, r9 == true ? 1 : 0);
                                        } else if (u("even")) {
                                            rVar = new D1.r(2, z6 ? 1 : 0);
                                        } else {
                                            int i15 = (!t('+') && t('-')) ? -1 : r9 == true ? 1 : 0;
                                            int i16 = this.f12783b;
                                            java.lang.String str2 = (java.lang.String) this.f12785d;
                                            int i17 = this.f12784c;
                                            Z2.C1206p c1206pA2 = Z2.C1206p.a(i16, i17, str2);
                                            if (c1206pA2 != null) {
                                                this.f12783b = c1206pA2.f12908a;
                                            }
                                            if (t('n') || t('N')) {
                                                if (c1206pA2 == null) {
                                                    c1206pA2 = new Z2.C1206p(1L, this.f12783b);
                                                }
                                                X();
                                                boolean zT = t('+');
                                                i10 = (zT || !(zT = t('-'))) ? 1 : -1;
                                                if (zT) {
                                                    X();
                                                    c1206pA = Z2.C1206p.a(this.f12783b, i17, str2);
                                                    if (c1206pA != null) {
                                                        this.f12783b = c1206pA.f12908a;
                                                        i11 = i15;
                                                    } else {
                                                        this.f12783b = i14;
                                                    }
                                                    r10 = 0;
                                                } else {
                                                    i11 = i15;
                                                    c1206pA = null;
                                                }
                                            } else {
                                                c1206pA = c1206pA2;
                                                i10 = i15;
                                                c1206pA2 = null;
                                                i11 = 1;
                                            }
                                            rVar = new D1.r(c1206pA2 == null ? 0 : (i11 == true ? 1 : 0) * ((int) c1206pA2.f12909b), c1206pA == null ? 0 : i10 * ((int) c1206pA.f12909b));
                                        }
                                        X();
                                        r10 = rVar;
                                        if (!t(')')) {
                                            this.f12783b = i14;
                                            r10 = 0;
                                        }
                                    } else {
                                        r10 = str;
                                    }
                                }
                                if (r10 == 0) {
                                    throw new Z2.C1178a("Invalid or missing parameter section for pseudo class: ".concat(strN4));
                                }
                                c1188f = new Z2.C1188f(r10.f2053a, r10.f2054b, z9, z10, c1205o.f12905b);
                                c1204n.a();
                                obj = c1188f;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                                break;
                            case 6:
                                Z2.C1188f c1188f2 = new Z2.C1188f(0, 1, true, false, null);
                                c1204n.a();
                                obj = c1188f2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 7:
                                Z2.C1188f c1188f3 = new Z2.C1188f(0, 1, false, false, null);
                                c1204n.a();
                                obj = c1188f3;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 8:
                                Z2.C1188f c1188f4 = new Z2.C1188f(0, 1, true, true, c1205o.f12905b);
                                c1204n.a();
                                obj = c1188f4;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 9:
                                c1188f = new Z2.C1188f(0, 1, false, true, c1205o.f12905b);
                                c1204n.a();
                                obj = c1188f;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 10:
                                Z2.C1198k c1198k = new Z2.C1198k(z6, str);
                                c1204n.a();
                                obj = c1198k;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 11:
                                Z2.C1198k c1198k2 = new Z2.C1198k(r9, c1205o.f12905b);
                                c1204n.a();
                                obj = c1198k2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 12:
                                Z2.C1190g c1190g3 = new Z2.C1190g(0);
                                c1204n.a();
                                obj = c1190g3;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 13:
                                if (w()) {
                                    arrayListO0 = str;
                                } else {
                                    int i18 = this.f12783b;
                                    if (t('(')) {
                                        X();
                                        arrayListO0 = o0();
                                        if (arrayListO0 != null && t(')')) {
                                            java.util.Iterator it = arrayListO0.iterator();
                                            while (it.hasNext() && (arrayList2 = ((Z2.C1204n) it.next()).f12902a) != null) {
                                                java.util.Iterator it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList3 = ((Z2.C1205o) it2.next()).f12907d) != null) {
                                                        java.util.Iterator it3 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((Z2.InterfaceC1186e) it3.next()) instanceof Z2.C1194i) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f12783b = i18;
                                        }
                                        arrayListO0 = str;
                                    } else {
                                        arrayListO0 = str;
                                    }
                                }
                                if (arrayListO0 == null) {
                                    throw new Z2.C1178a("Invalid or missing parameter section for pseudo class: ".concat(strN4));
                                }
                                Z2.C1194i c1194i = new Z2.C1194i();
                                c1194i.f12889a = arrayListO0;
                                java.util.Iterator it4 = arrayListO0.iterator();
                                int i19 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i20 = ((Z2.C1204n) it4.next()).f12903b;
                                    if (i20 > i19) {
                                        i19 = i20;
                                    }
                                }
                                c1204n.f12903b = i19;
                                obj = c1194i;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                                break;
                            case 14:
                                if (!w()) {
                                    int i21 = this.f12783b;
                                    if (t('(')) {
                                        X();
                                        ?? arrayList6 = str;
                                        while (true) {
                                            java.lang.String strN5 = n0();
                                            arrayList6 = arrayList6;
                                            if (strN5 == null) {
                                                this.f12783b = i21;
                                            } else {
                                                if (arrayList6 == 0) {
                                                    arrayList6 = new java.util.ArrayList();
                                                }
                                                arrayList6.add(strN5);
                                                X();
                                                if (!W()) {
                                                    if (!t(')')) {
                                                        this.f12783b = i21;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Z2.C1196j c1196j = new Z2.C1196j(strN4);
                                c1204n.a();
                                obj = c1196j;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                Z2.C1196j c1196j2 = new Z2.C1196j(strN4);
                                c1204n.a();
                                obj = c1196j2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new java.util.ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            default:
                                throw new Z2.C1178a("Unsupported pseudo class: ".concat(strN4));
                        }
                    } else {
                        if (c1205o != 0) {
                            this.f12783b = i12;
                            arrayList = c1204n.f12902a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList4.add(c1204n);
                            }
                            return arrayList4;
                        }
                        if (c1204n.f12902a == null) {
                            c1204n.f12902a = new java.util.ArrayList();
                        }
                        c1204n.f12902a.add(c1205o);
                        if (!W()) {
                            arrayList4.add(c1204n);
                            c1204n = new Z2.C1204n();
                        }
                        str = null;
                        r9 = 1;
                    }
                }
            }
            if (c1205o != 0) {
                this.f12783b = i12;
                arrayList = c1204n.f12902a;
                if (arrayList != null) {
                    arrayList4.add(c1204n);
                }
                return arrayList4;
            }
            if (c1204n.f12902a == null) {
                c1204n.f12902a = new java.util.ArrayList();
            }
            c1204n.f12902a.add(c1205o);
            if (!W()) {
                arrayList4.add(c1204n);
                c1204n = new Z2.C1204n();
            }
            str = null;
            r9 = 1;
        }
        arrayList = c1204n.f12902a;
        if (arrayList != null) {
            arrayList4.add(c1204n);
        }
        return arrayList4;
    }
}
