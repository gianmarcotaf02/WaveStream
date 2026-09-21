package P;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final p137q0.p a(p137q0.p pVar, A5.e eVar) {
        return pVar.d(new P.b(eVar));
    }

    public static final M.c b(Q0.InterfaceC0775i interfaceC0775i) {
        M.f fVar;
        L.a aVar = new L.a();
        Q0.AbstractC0777k.w(interfaceC0775i, P.d.f8075a, new C5.C0132n0(new C5.C0132n0(17, aVar), new A7.o(1, aVar, L.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 26)));
        p136q.D d4 = new p136q.D();
        p136q.D d6 = aVar.f7037a;
        java.lang.Object[] objArr = d6.f26303a;
        int i3 = d6.f26304b;
        boolean z6 = true;
        int i9 = 0;
        M.b bVar = null;
        while (true) {
            fVar = M.f.f7117b;
            if (i9 >= i3) {
                break;
            }
            M.b bVar2 = (M.b) objArr[i9];
            if (!z6 || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z6 = false;
                } else {
                    if (bVar2 != fVar) {
                        p136q.D d9 = aVar.f7038b;
                        java.lang.Object[] objArr2 = d9.f26303a;
                        int i10 = d9.f26304b;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i10) {
                                if (((java.lang.Boolean) ((p194x6.j) objArr2[i11]).invoke(bVar2)).booleanValue()) {
                                    i11++;
                                } else {
                                    z6 = false;
                                }
                            }
                        }
                    }
                    d4.a(bVar2);
                    z6 = false;
                    bVar = bVar2;
                }
            }
            i9++;
        }
        if (((M.b) (d4.h() ? null : d4.f26303a[d4.f26304b - 1])) == fVar) {
            d4.k(d4.f26304b - 1);
        }
        p038e0.b bVar3 = d4.f26305c;
        if (bVar3 == null) {
            bVar3 = new p038e0.b(d4);
            d4.f26305c = bVar3;
        }
        return new M.c(bVar3);
    }

    public static final p137q0.p c(U.X x9) {
        return new P.e(x9);
    }

    public static final p137q0.p d(p137q0.p pVar, S.p pVar2, U.Y y, U.Z z6, J.C0557w c0557w) {
        return pVar.d(new P.j(pVar2, y, z6, c0557w));
    }
}
