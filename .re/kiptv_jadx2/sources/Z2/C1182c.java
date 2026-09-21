package Z2;

import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Iterator;

public final class C1182c extends M {
    public C1182c(String str) {
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

    public final String m0() {
        int iL0;
        if (w()) {
            return null;
        }
        char cCharAt = ((String) this.f12785d).charAt(this.f12783b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
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

    public final String n0() {
        int i3;
        int i9;
        boolean zW = w();
        String str = (String) this.f12785d;
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
        String strSubstring = str.substring(i11, i9);
        this.f12783b = i9;
        return strSubstring;
    }

    public final ArrayList o0() {
        ArrayList arrayList;
        int i3;
        ?? c1205o;
        int i9;
        String strM;
        int i10;
        int i11;
        C1206p c1206pA;
        ?? r10;
        D1.r rVar;
        C1188f c1188f;
        Object obj;
        ArrayList arrayListO0;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str = null;
        if (w()) {
            return null;
        }
        ?? r9 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        C1204n c1204n = new C1204n();
        while (!w() && !w()) {
            int i12 = this.f12783b;
            ArrayList arrayList5 = c1204n.f12902a;
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
            if (t(GMTDateParser.ANY)) {
                c1205o = new C1205o(i3, str);
            } else {
                String strN0 = n0();
                if (strN0 != null) {
                    C1205o c1205o2 = new C1205o(i3, strN0);
                    c1204n.f12903b += r9;
                    c1205o = c1205o2;
                } else {
                    c1205o = str;
                }
            }
            while (!w()) {
                if (t('.')) {
                    if (c1205o == 0) {
                        c1205o = new C1205o(i3, str);
                    }
                    String strN1 = n0();
                    if (strN1 == null) {
                        throw new C1178a("Invalid \".class\" simpleSelectors");
                    }
                    c1205o.a(i13, "class", strN1);
                    c1204n.a();
                } else if (t('#')) {
                    if (c1205o == 0) {
                        c1205o = new C1205o(i3, str);
                    }
                    String strN2 = n0();
                    if (strN2 == null) {
                        throw new C1178a("Invalid \"#id\" simpleSelectors");
                    }
                    c1205o.a(i13, "id", strN2);
                    c1204n.f12903b += 1000000;
                } else if (t('[')) {
                    if (c1205o == 0) {
                        c1205o = new C1205o(i3, str);
                    }
                    X();
                    String strN3 = n0();
                    if (strN3 == null) {
                        throw new C1178a("Invalid attribute simpleSelectors");
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
                            throw new C1178a("Invalid attribute simpleSelectors");
                        }
                        X();
                    } else {
                        strM = str;
                    }
                    if (!t(']')) {
                        throw new C1178a("Invalid attribute simpleSelectors");
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
                            c1205o = new C1205o(i3, str);
                        }
                        String strN4 = n0();
                        if (strN4 == null) {
                            throw new C1178a("Invalid pseudo class");
                        }
                        EnumC1192h enumC1192h = (EnumC1192h) EnumC1192h.f12886l.get(strN4);
                        if (enumC1192h == null) {
                            enumC1192h = EnumC1192h.f12885k;
                        }
                        switch (enumC1192h.ordinal()) {
                            case 0:
                                C1190g c1190g = new C1190g(2);
                                c1204n.a();
                                obj = c1190g;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 1:
                                C1190g c1190g2 = new C1190g(1);
                                c1204n.a();
                                obj = c1190g2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
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
                                boolean z9 = (enumC1192h == EnumC1192h.f12883h || enumC1192h == EnumC1192h.f12884i) ? r9 == true ? 1 : 0 : z6 ? 1 : 0;
                                boolean z10 = (enumC1192h == EnumC1192h.f12884i || enumC1192h == EnumC1192h.j) ? r9 == true ? 1 : 0 : z6 ? 1 : 0;
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
                                            String str2 = (String) this.f12785d;
                                            int i17 = this.f12784c;
                                            C1206p c1206pA2 = C1206p.a(i16, i17, str2);
                                            if (c1206pA2 != null) {
                                                this.f12783b = c1206pA2.f12908a;
                                            }
                                            if (t('n') || t('N')) {
                                                if (c1206pA2 == null) {
                                                    c1206pA2 = new C1206p(1L, this.f12783b);
                                                }
                                                X();
                                                boolean zT = t('+');
                                                i10 = (zT || !(zT = t('-'))) ? 1 : -1;
                                                if (zT) {
                                                    X();
                                                    c1206pA = C1206p.a(this.f12783b, i17, str2);
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
                                    throw new C1178a("Invalid or missing parameter section for pseudo class: ".concat(strN4));
                                }
                                c1188f = new C1188f(r10.f2053a, r10.f2054b, z9, z10, c1205o.f12905b);
                                c1204n.a();
                                obj = c1188f;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                                break;
                            case 6:
                                C1188f c1188f2 = new C1188f(0, 1, true, false, null);
                                c1204n.a();
                                obj = c1188f2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 7:
                                C1188f c1188f3 = new C1188f(0, 1, false, false, null);
                                c1204n.a();
                                obj = c1188f3;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 8:
                                C1188f c1188f4 = new C1188f(0, 1, true, true, c1205o.f12905b);
                                c1204n.a();
                                obj = c1188f4;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 9:
                                c1188f = new C1188f(0, 1, false, true, c1205o.f12905b);
                                c1204n.a();
                                obj = c1188f;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 10:
                                C1198k c1198k = new C1198k(z6, str);
                                c1204n.a();
                                obj = c1198k;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 11:
                                C1198k c1198k2 = new C1198k(r9, c1205o.f12905b);
                                c1204n.a();
                                obj = c1198k2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            case 12:
                                C1190g c1190g3 = new C1190g(0);
                                c1204n.a();
                                obj = c1190g3;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
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
                                            Iterator it = arrayListO0.iterator();
                                            while (it.hasNext() && (arrayList2 = ((C1204n) it.next()).f12902a) != null) {
                                                Iterator it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList3 = ((C1205o) it2.next()).f12907d) != null) {
                                                        Iterator it3 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((InterfaceC1186e) it3.next()) instanceof C1194i) {
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
                                    throw new C1178a("Invalid or missing parameter section for pseudo class: ".concat(strN4));
                                }
                                C1194i c1194i = new C1194i();
                                c1194i.f12889a = arrayListO0;
                                Iterator it4 = arrayListO0.iterator();
                                int i19 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i20 = ((C1204n) it4.next()).f12903b;
                                    if (i20 > i19) {
                                        i19 = i20;
                                    }
                                }
                                c1204n.f12903b = i19;
                                obj = c1194i;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
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
                                            String strN5 = n0();
                                            arrayList6 = arrayList6;
                                            if (strN5 == null) {
                                                this.f12783b = i21;
                                            } else {
                                                if (arrayList6 == 0) {
                                                    arrayList6 = new ArrayList();
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
                                C1196j c1196j = new C1196j(strN4);
                                c1204n.a();
                                obj = c1196j;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
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
                                C1196j c1196j2 = new C1196j(strN4);
                                c1204n.a();
                                obj = c1196j2;
                                if (c1205o.f12907d == null) {
                                    c1205o.f12907d = new ArrayList();
                                }
                                c1205o.f12907d.add(obj);
                                str = null;
                                r9 = 1;
                                z6 = false;
                                i13 = 2;
                                break;
                            default:
                                throw new C1178a("Unsupported pseudo class: ".concat(strN4));
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
                            c1204n.f12902a = new ArrayList();
                        }
                        c1204n.f12902a.add(c1205o);
                        if (!W()) {
                            arrayList4.add(c1204n);
                            c1204n = new C1204n();
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
                c1204n.f12902a = new ArrayList();
            }
            c1204n.f12902a.add(c1205o);
            if (!W()) {
                arrayList4.add(c1204n);
                c1204n = new C1204n();
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
