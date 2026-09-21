package p011b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p079i7.f f17739a = new p079i7.f(new p011b1.y(5), new p011b1.x(5), 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p079i7.f f17740b = new p079i7.f(new p011b1.y(6), new p011b1.x(6), 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p079i7.f f17741c = new p079i7.f(new p011b1.y(7), new p011b1.x(7), 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p079i7.f f17742d = new p079i7.f(new p011b1.y(8), new p011b1.x(8), 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p079i7.f f17743e = new p079i7.f(new p011b1.y(9), new p011b1.x(9), 2);

    public static p011b1.C1644a a(java.lang.String str, p011b1.M m8, long j, p113n1.c cVar, p048f1.h hVar, int i3, int i9) {
        p078i6.w wVar = p078i6.w.f23205h;
        return new p011b1.C1644a(new j1.c(str, m8, wVar, wVar, hVar, cVar), i3, 1, j);
    }

    public static final long b(int i3, int i9) {
        if (i3 < 0 || i9 < 0) {
            p065h1.a.a("start and end cannot be negative. [start: " + i3 + ", end: " + i9 + ']');
        }
        long j = (((long) i9) & 4294967295L) | (((long) i3) << 32);
        int i10 = p011b1.L.f17783c;
        return j;
    }

    public static final long c(int i3, long j) {
        int i9 = p011b1.L.f17783c;
        int i10 = (int) (j >> 32);
        int i11 = i10 < 0 ? 0 : i10;
        if (i11 > i3) {
            i11 = i3;
        }
        int i12 = (int) (4294967295L & j);
        int i13 = i12 >= 0 ? i12 : 0;
        if (i13 <= i3) {
            i3 = i13;
        }
        return (i11 == i10 && i3 == i12) ? j : b(i11, i3);
    }

    public static final int d(int i3, java.util.List list) {
        int i9;
        byte b9;
        int i10 = ((p011b1.q) p078i6.o.q1(list)).f17839c;
        if (i3 > ((p011b1.q) p078i6.o.q1(list)).f17839c) {
            p065h1.a.a("Index " + i3 + " should be less or equal than last line's end " + i10);
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (true) {
            if (i11 > size) {
                i9 = -(i11 + 1);
                break;
            }
            i9 = (i11 + size) >>> 1;
            p011b1.q qVar = (p011b1.q) list.get(i9);
            if (qVar.f17838b > i3) {
                b9 = 1;
            } else {
                b9 = qVar.f17839c <= i3 ? (byte) -1 : (byte) 0;
            }
            if (b9 >= 0) {
                if (b9 <= 0) {
                    break;
                }
                size = i9 - 1;
            } else {
                i11 = i9 + 1;
            }
        }
        if (i9 >= 0 && i9 < list.size()) {
            return i9;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i9, "Found paragraph index ", " should be in range [0, ");
        sbT.append(list.size());
        sbT.append(").\nDebug info: index=");
        sbT.append(i3);
        sbT.append(", paragraphs=[");
        sbT.append(p1.a.a(list, null, new p005a5.J6(3), 31));
        sbT.append(']');
        p065h1.a.a(sbT.toString());
        return i9;
    }

    public static final int e(int i3, java.util.List list) {
        byte b9;
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            p011b1.q qVar = (p011b1.q) list.get(i10);
            if (qVar.f17840d > i3) {
                b9 = 1;
            } else {
                b9 = qVar.f17841e <= i3 ? (byte) -1 : (byte) 0;
            }
            if (b9 < 0) {
                i9 = i10 + 1;
            } else {
                if (b9 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final int f(java.util.ArrayList arrayList, float f9) {
        byte b9;
        if (f9 <= 0.0f) {
            return 0;
        }
        if (f9 >= ((p011b1.q) p078i6.o.q1(arrayList)).g) {
            return p078i6.p.A0(arrayList);
        }
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i9 = (i3 + size) >>> 1;
            p011b1.q qVar = (p011b1.q) arrayList.get(i9);
            if (qVar.f17842f > f9) {
                b9 = 1;
            } else {
                b9 = qVar.g <= f9 ? (byte) -1 : (byte) 0;
            }
            if (b9 < 0) {
                i3 = i9 + 1;
            } else {
                if (b9 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void g(java.util.ArrayList arrayList, long j, p194x6.j jVar) {
        int size = arrayList.size();
        for (int iD = d(p011b1.L.f(j), arrayList); iD < size; iD++) {
            p011b1.q qVar = (p011b1.q) arrayList.get(iD);
            if (qVar.f17838b >= p011b1.L.e(j)) {
                return;
            }
            if (qVar.f17838b != qVar.f17839c) {
                jVar.invoke(qVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    public static final p011b1.M h(p011b1.M m8, p113n1.n nVar) {
        int i3;
        long j;
        p104m1.q qVar;
        int i9;
        int i10;
        int i11;
        p104m1.s sVar;
        p011b1.E e6 = m8.f17786a;
        p104m1.o oVar = p011b1.F.f17760d;
        p104m1.o oVar2 = e6.f17744a;
        if (oVar2.equals(p104m1.n.f25181a)) {
            oVar2 = p011b1.F.f17760d;
        }
        p104m1.o oVar3 = oVar2;
        p113n1.q[] qVarArr = p113n1.p.f25569b;
        long j9 = e6.f17745b;
        if ((j9 & 1095216660480L) == 0) {
            j9 = p011b1.F.f17757a;
        }
        long j10 = j9;
        p048f1.s sVar2 = e6.f17746c;
        if (sVar2 == null) {
            sVar2 = p048f1.s.f21668l;
        }
        p048f1.s sVar3 = sVar2;
        p048f1.o oVar4 = e6.f17747d;
        p048f1.o oVar5 = new p048f1.o(oVar4 != null ? oVar4.f21663a : 0);
        p048f1.p pVar = e6.f17748e;
        p048f1.p pVar2 = new p048f1.p(pVar != null ? pVar.f21664a : io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);
        p048f1.i iVar = e6.f17749f;
        if (iVar == null) {
            iVar = p048f1.i.f21646h;
        }
        p048f1.i iVar2 = iVar;
        java.lang.String str = e6.g;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long j11 = e6.f17750h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = p011b1.F.f17758b;
        }
        long j12 = j11;
        p104m1.a aVar = e6.f17751i;
        float f9 = aVar != null ? aVar.f25156a : 0.0f;
        p104m1.a aVar2 = new p104m1.a(java.lang.Float.isNaN(f9) ? 0.0f : f9);
        p104m1.p pVar3 = e6.j;
        if (pVar3 == null) {
            pVar3 = p104m1.p.f25182c;
        }
        p104m1.p pVar4 = pVar3;
        p074i1.b bVarU = e6.f17752k;
        if (bVarU == null) {
            p074i1.b bVar = p074i1.b.j;
            bVarU = p074i1.c.f22749a.u();
        }
        p074i1.b bVar2 = bVarU;
        long j13 = e6.f17753l;
        if (j13 == 16) {
            j13 = p011b1.F.f17759c;
        }
        long j14 = j13;
        p104m1.l lVar = e6.f17754m;
        if (lVar == null) {
            lVar = p104m1.l.f25176b;
        }
        p104m1.l lVar2 = lVar;
        p188x0.N n3 = e6.f17755n;
        if (n3 == null) {
            n3 = p188x0.N.f31076d;
        }
        p188x0.N n9 = n3;
        p203z0.c cVar = e6.f17756o;
        if (cVar == null) {
            cVar = p203z0.f.f32132b;
        }
        p011b1.E e9 = new p011b1.E(oVar3, j10, sVar3, oVar5, pVar2, iVar2, str2, j12, aVar2, pVar4, bVar2, j14, lVar2, n9, cVar);
        int i12 = p011b1.u.f17855b;
        p011b1.t tVar = m8.f17787b;
        int i13 = tVar.f17846a;
        int i14 = 5;
        if (i13 == 0) {
            i13 = 5;
        }
        int i15 = tVar.f17847b;
        if (i15 != 3) {
            if (i15 == 0) {
                int iOrdinal = nVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new I3.b();
                    }
                    i14 = 2;
                }
            } else {
                i3 = i15;
            }
            j = tVar.f17848c;
            if ((j & 1095216660480L) == 0) {
                j = p011b1.u.f17854a;
            }
            qVar = tVar.f17849d;
            if (qVar == null) {
                qVar = p104m1.q.f25185c;
            }
            i9 = tVar.g;
            if (i9 == 0) {
                i9 = p104m1.e.f25161b;
            }
            int i16 = i9;
            i10 = tVar.f17852h;
            if (i10 == 0) {
                i11 = 1;
            } else {
                i11 = i10;
            }
            sVar = tVar.f17853i;
            if (sVar == null) {
                sVar = p104m1.s.f25189c;
            }
            return new p011b1.M(e9, new p011b1.t(i13, i3, j, qVar, tVar.f17850e, tVar.f17851f, i16, i11, sVar), m8.f17788c);
        }
        int iOrdinal2 = nVar.ordinal();
        if (iOrdinal2 == 0) {
            i14 = 4;
        } else if (iOrdinal2 != 1) {
            throw new I3.b();
        }
        i3 = i14;
        j = tVar.f17848c;
        if ((j & 1095216660480L) == 0) {
            j = p011b1.u.f17854a;
        }
        qVar = tVar.f17849d;
        if (qVar == null) {
            qVar = p104m1.q.f25185c;
        }
        i9 = tVar.g;
        if (i9 == 0) {
            i9 = p104m1.e.f25161b;
        }
        int i17 = i9;
        i10 = tVar.f17852h;
        if (i10 == 0) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        sVar = tVar.f17853i;
        if (sVar == null) {
            sVar = p104m1.s.f25189c;
        }
        return new p011b1.M(e9, new p011b1.t(i13, i3, j, qVar, tVar.f17850e, tVar.f17851f, i17, i11, sVar), m8.f17788c);
    }
}
