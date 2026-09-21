package p011b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17757a = com.google.common.util.concurrent.D.w(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17758b = com.google.common.util.concurrent.D.w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f17759c = p188x0.C3098s.f31127f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p104m1.o f17760d;

    static {
        long j = p188x0.C3098s.f31123b;
        f17760d = j != 16 ? new p104m1.c(j) : p104m1.n.f25181a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x016d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0172 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:115:0x018a  */
    /* JADX WARN: Code duplicated, block: B:117:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0191  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:122:0x0199  */
    /* JADX WARN: Code duplicated, block: B:124:0x019d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01af  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x010c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0136  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0140  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    public static final p011b1.E a(p011b1.E e6, long j, p188x0.AbstractC3095o abstractC3095o, float f9, long j9, p048f1.s sVar, p048f1.o oVar, p048f1.p pVar, p048f1.i iVar, java.lang.String str, long j10, p104m1.a aVar, p104m1.p pVar2, p074i1.b bVar, long j11, p104m1.l lVar, p188x0.N n3, p203z0.c cVar) {
        p104m1.a aVar2;
        long j12;
        p188x0.N n9;
        p203z0.c cVar2;
        p104m1.n nVar;
        p104m1.o cVar3;
        p104m1.o oVar2;
        boolean z6;
        long j13;
        p048f1.s sVar2;
        p104m1.p pVar3;
        p074i1.b bVar2;
        p104m1.l lVar2;
        p203z0.c cVar4;
        long jA;
        p048f1.o oVar3 = oVar;
        p048f1.p pVar4 = pVar;
        p048f1.i iVar2 = iVar;
        java.lang.String str2 = str;
        long j14 = j10;
        p113n1.q[] qVarArr = p113n1.p.f25569b;
        long j15 = j9 & 1095216660480L;
        if (((j15 == 0) || p113n1.p.a(j9, e6.f17745b)) && ((abstractC3095o != null || j == 16 || p188x0.C3098s.d(j, e6.f17744a.b())) && ((oVar3 == null || oVar3.equals(e6.f17747d)) && ((sVar == null || sVar.equals(e6.f17746c)) && ((iVar2 == null || iVar2 == e6.f17749f) && (((j14 & 1095216660480L) == 0 || p113n1.p.a(j14, e6.f17750h)) && ((lVar == null || lVar.equals(e6.f17754m)) && kotlin.jvm.internal.m.a(abstractC3095o, e6.f17744a.c()) && ((abstractC3095o == null || f9 == e6.f17744a.a()) && ((pVar4 == null || pVar4.equals(e6.f17748e)) && (str2 == null || str2.equals(e6.g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(e6.f17751i)) {
                }
                nVar = p104m1.n.f25181a;
                if (abstractC3095o != null) {
                    if (abstractC3095o instanceof p188x0.S) {
                        jA = com.google.android.gms.internal.play_billing.AbstractC1853k0.A(((p188x0.S) abstractC3095o).f31093a, f9);
                        if (jA != 16) {
                            cVar3 = new p104m1.c(jA);
                        } else {
                            cVar3 = nVar;
                        }
                    } else {
                        if (!(abstractC3095o instanceof p188x0.M)) {
                            throw new I3.b();
                        }
                        cVar3 = new p104m1.b((p188x0.M) abstractC3095o, f9);
                    }
                } else if (j != 16) {
                    cVar3 = new p104m1.c(j);
                } else {
                    cVar3 = nVar;
                }
                oVar2 = e6.f17744a;
                oVar2.getClass();
                z6 = cVar3 instanceof p104m1.b;
                if (!z6 && (oVar2 instanceof p104m1.b)) {
                    p104m1.b bVar3 = (p104m1.b) cVar3;
                    float f10 = bVar3.f25158b;
                    if (java.lang.Float.isNaN(f10)) {
                        f10 = ((p104m1.b) oVar2).f25158b;
                    }
                    cVar3 = new p104m1.b(bVar3.f25157a, f10);
                } else if ((z6 || (oVar2 instanceof p104m1.b)) && ((!z6 && (oVar2 instanceof p104m1.b)) || cVar3.equals(nVar))) {
                }
                if (iVar2 == null) {
                    iVar2 = e6.f17749f;
                }
                if (j15 == 0) {
                    j13 = e6.f17745b;
                } else {
                    j13 = j9;
                }
                if (sVar == null) {
                    sVar2 = e6.f17746c;
                } else {
                    sVar2 = sVar;
                }
                if (oVar3 == null) {
                    oVar3 = e6.f17747d;
                }
                if (pVar4 == null) {
                    pVar4 = e6.f17748e;
                }
                if (str2 == null) {
                    str2 = e6.g;
                }
                if ((j14 & 1095216660480L) == 0) {
                    j14 = e6.f17750h;
                }
                if (aVar2 == null) {
                    aVar2 = e6.f17751i;
                }
                long j16 = j13;
                if (pVar2 == null) {
                    pVar3 = e6.j;
                } else {
                    pVar3 = pVar2;
                }
                if (bVar == null) {
                    bVar2 = e6.f17752k;
                } else {
                    bVar2 = bVar;
                }
                if (j12 == 16) {
                    j12 = e6.f17753l;
                }
                p104m1.p pVar5 = pVar3;
                if (lVar == null) {
                    lVar2 = e6.f17754m;
                } else {
                    lVar2 = lVar;
                }
                if (n9 == null) {
                    n9 = e6.f17755n;
                }
                if (cVar2 == null) {
                    cVar4 = e6.f17756o;
                } else {
                    cVar4 = cVar2;
                }
                return new p011b1.E(cVar3, j16, sVar2, oVar3, pVar4, iVar2, str2, j14, aVar2, pVar5, bVar2, j12, lVar2, n9, cVar4);
            }
            aVar2 = aVar;
            if (pVar2 == null || pVar2.equals(e6.j)) {
                if (bVar == null || bVar.equals(e6.f17752k)) {
                    j12 = j11;
                    if (j12 == 16 || p188x0.C3098s.d(j12, e6.f17753l)) {
                        n9 = n3;
                        if (n9 == null || n9.equals(e6.f17755n)) {
                            cVar2 = cVar;
                            if (cVar2 == null || cVar2.equals(e6.f17756o)) {
                                return e6;
                            }
                        }
                    }
                    cVar2 = cVar;
                }
                n9 = n3;
                cVar2 = cVar;
            }
            nVar = p104m1.n.f25181a;
            if (abstractC3095o != null) {
                if (abstractC3095o instanceof p188x0.S) {
                    jA = com.google.android.gms.internal.play_billing.AbstractC1853k0.A(((p188x0.S) abstractC3095o).f31093a, f9);
                    if (jA != 16) {
                        cVar3 = new p104m1.c(jA);
                    } else {
                        cVar3 = nVar;
                    }
                } else {
                    if (!(abstractC3095o instanceof p188x0.M)) {
                        throw new I3.b();
                    }
                    cVar3 = new p104m1.b((p188x0.M) abstractC3095o, f9);
                }
            } else if (j != 16) {
                cVar3 = new p104m1.c(j);
            } else {
                cVar3 = nVar;
            }
            oVar2 = e6.f17744a;
            oVar2.getClass();
            z6 = cVar3 instanceof p104m1.b;
            if (!z6) {
                cVar3 = z6 ? oVar2 : oVar2;
            } else if (z6) {
            }
            if (iVar2 == null) {
                iVar2 = e6.f17749f;
            }
            if (j15 == 0) {
                j13 = e6.f17745b;
            } else {
                j13 = j9;
            }
            if (sVar == null) {
                sVar2 = e6.f17746c;
            } else {
                sVar2 = sVar;
            }
            if (oVar3 == null) {
                oVar3 = e6.f17747d;
            }
            if (pVar4 == null) {
                pVar4 = e6.f17748e;
            }
            if (str2 == null) {
                str2 = e6.g;
            }
            if ((j14 & 1095216660480L) == 0) {
                j14 = e6.f17750h;
            }
            if (aVar2 == null) {
                aVar2 = e6.f17751i;
            }
            long j17 = j13;
            if (pVar2 == null) {
                pVar3 = e6.j;
            } else {
                pVar3 = pVar2;
            }
            if (bVar == null) {
                bVar2 = e6.f17752k;
            } else {
                bVar2 = bVar;
            }
            if (j12 == 16) {
                j12 = e6.f17753l;
            }
            p104m1.p pVar6 = pVar3;
            if (lVar == null) {
                lVar2 = e6.f17754m;
            } else {
                lVar2 = lVar;
            }
            if (n9 == null) {
                n9 = e6.f17755n;
            }
            if (cVar2 == null) {
                cVar4 = e6.f17756o;
            } else {
                cVar4 = cVar2;
            }
            return new p011b1.E(cVar3, j17, sVar2, oVar3, pVar4, iVar2, str2, j14, aVar2, pVar6, bVar2, j12, lVar2, n9, cVar4);
        }
        aVar2 = aVar;
        j12 = j11;
        n9 = n3;
        cVar2 = cVar;
        nVar = p104m1.n.f25181a;
        if (abstractC3095o != null) {
            if (abstractC3095o instanceof p188x0.S) {
                jA = com.google.android.gms.internal.play_billing.AbstractC1853k0.A(((p188x0.S) abstractC3095o).f31093a, f9);
                if (jA != 16) {
                    cVar3 = new p104m1.c(jA);
                } else {
                    cVar3 = nVar;
                }
            } else {
                if (!(abstractC3095o instanceof p188x0.M)) {
                    throw new I3.b();
                }
                cVar3 = new p104m1.b((p188x0.M) abstractC3095o, f9);
            }
        } else if (j != 16) {
            cVar3 = new p104m1.c(j);
        } else {
            cVar3 = nVar;
        }
        oVar2 = e6.f17744a;
        oVar2.getClass();
        z6 = cVar3 instanceof p104m1.b;
        if (!z6) {
            if (z6) {
            }
        } else if (z6) {
        }
        if (iVar2 == null) {
            iVar2 = e6.f17749f;
        }
        if (j15 == 0) {
            j13 = e6.f17745b;
        } else {
            j13 = j9;
        }
        if (sVar == null) {
            sVar2 = e6.f17746c;
        } else {
            sVar2 = sVar;
        }
        if (oVar3 == null) {
            oVar3 = e6.f17747d;
        }
        if (pVar4 == null) {
            pVar4 = e6.f17748e;
        }
        if (str2 == null) {
            str2 = e6.g;
        }
        if ((j14 & 1095216660480L) == 0) {
            j14 = e6.f17750h;
        }
        if (aVar2 == null) {
            aVar2 = e6.f17751i;
        }
        long j18 = j13;
        if (pVar2 == null) {
            pVar3 = e6.j;
        } else {
            pVar3 = pVar2;
        }
        if (bVar == null) {
            bVar2 = e6.f17752k;
        } else {
            bVar2 = bVar;
        }
        if (j12 == 16) {
            j12 = e6.f17753l;
        }
        p104m1.p pVar7 = pVar3;
        if (lVar == null) {
            lVar2 = e6.f17754m;
        } else {
            lVar2 = lVar;
        }
        if (n9 == null) {
            n9 = e6.f17755n;
        }
        if (cVar2 == null) {
            cVar4 = e6.f17756o;
        } else {
            cVar4 = cVar2;
        }
        return new p011b1.E(cVar3, j18, sVar2, oVar3, pVar4, iVar2, str2, j14, aVar2, pVar7, bVar2, j12, lVar2, n9, cVar4);
    }
}
