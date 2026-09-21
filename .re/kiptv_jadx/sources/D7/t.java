package D7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.j implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2498h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i3, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i9, int i10) {
        super(i3, i9, cls, obj, str, str2);
        this.f2498h = i10;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean zB;
        boolean zB2;
        switch (this.f2498h) {
            case 0:
                C7.AbstractC0191x p2 = (C7.AbstractC0191x) obj;
                C7.AbstractC0191x p9 = (C7.AbstractC0191x) obj2;
                kotlin.jvm.internal.m.e(p2, "p0");
                kotlin.jvm.internal.m.e(p9, "p1");
                ((D7.u) this.receiver).getClass();
                D7.k.f2488b.getClass();
                D7.l lVar = D7.j.f2487b;
                return java.lang.Boolean.valueOf(lVar.b(p2, p9) && !lVar.b(p9, p2));
            case 1:
                C7.AbstractC0191x p10 = (C7.AbstractC0191x) obj;
                C7.AbstractC0191x p11 = (C7.AbstractC0191x) obj2;
                kotlin.jvm.internal.m.e(p10, "p0");
                kotlin.jvm.internal.m.e(p11, "p1");
                return java.lang.Boolean.valueOf(((D7.l) this.receiver).a(p10, p11));
            case 2:
                p175v0.C c9 = (p175v0.C) obj;
                p175v0.C c10 = (p175v0.C) obj2;
                p138q1.v vVar = (p138q1.v) this.receiver;
                if (vVar.f26487u && (zB = ((p175v0.D) c10).b()) != ((p175v0.D) c9).b()) {
                    F.I i3 = null;
                    if (zB) {
                        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
                        Q0.AbstractC0777k.p(vVar, new K0.C0656d(a2, vVar, 12));
                        F.I i9 = (F.I) a2.f24539h;
                        if (i9 != null) {
                            i9.a();
                            i3 = i9;
                        }
                        vVar.y = i3;
                    } else {
                        F.I i10 = vVar.y;
                        if (i10 != null) {
                            i10.b();
                        }
                        vVar.y = null;
                    }
                }
                return p070h6.A.f22523a;
            case 3:
                kotlinx.serialization.descriptors.SerialDescriptor p12 = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
                int iIntValue = ((java.lang.Number) obj2).intValue();
                kotlin.jvm.internal.m.e(p12, "p0");
                t8.t tVar = (t8.t) this.receiver;
                tVar.getClass();
                boolean z6 = !p12.j(iIntValue) && p12.i(iIntValue).d();
                tVar.f28638b = z6;
                return java.lang.Boolean.valueOf(z6);
            default:
                p175v0.C c11 = (p175v0.C) obj;
                p175v0.C c12 = (p175v0.C) obj2;
                v.U u6 = (v.U) this.receiver;
                if (u6.f26487u && (zB2 = ((p175v0.D) c12).b()) != ((p175v0.D) c11).b()) {
                    p007a7.n nVar = u6.y;
                    if (nVar != null) {
                        nVar.invoke(java.lang.Boolean.valueOf(zB2));
                    }
                    if (zB2) {
                        S7.C.A(u6.B0(), null, new v.T(u6, null), 3);
                        kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
                        Q0.AbstractC0777k.p(u6, new io.ktor.http.d(a9, u6, 18));
                        F.I i11 = (F.I) a9.f24539h;
                        if (i11 != null) {
                            i11.a();
                        } else {
                            i11 = null;
                        }
                        u6.f28898A = i11;
                        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = u6.f28899B;
                        if (nodeCoordinator != null && nodeCoordinator.U0().f26487u) {
                            u6.R0();
                        }
                    } else {
                        F.I i12 = u6.f28898A;
                        if (i12 != null) {
                            i12.b();
                        }
                        u6.f28898A = null;
                        u6.R0();
                    }
                    Q0.AbstractC0777k.l(u6);
                    p202z.k kVar = u6.f28901x;
                    if (kVar != null) {
                        if (zB2) {
                            p202z.d dVar = u6.f28902z;
                            if (dVar != null) {
                                u6.Q0(kVar, new p202z.e(dVar));
                                u6.f28902z = null;
                            }
                            p202z.d dVar2 = new p202z.d();
                            u6.Q0(kVar, dVar2);
                            u6.f28902z = dVar2;
                        } else {
                            p202z.d dVar3 = u6.f28902z;
                            if (dVar3 != null) {
                                u6.Q0(kVar, new p202z.e(dVar3));
                                u6.f28902z = null;
                            }
                        }
                    }
                }
                return p070h6.A.f22523a;
        }
    }
}
