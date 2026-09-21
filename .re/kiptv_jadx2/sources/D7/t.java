package D7;

import C7.AbstractC0191x;
import F.I;
import K0.C0656d;
import Q0.AbstractC0777k;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.internal.A;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p138q1.v;
import p175v0.C;
import p175v0.D;
import v.T;
import v.U;

public final class t extends kotlin.jvm.internal.j implements p194x6.m {

    public final int f2498h;

    public t(int i3, Object obj, Class cls, String str, String str2, int i9, int i10) {
        super(i3, i9, cls, obj, str, str2);
        this.f2498h = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        boolean zB;
        boolean zB2;
        switch (this.f2498h) {
            case 0:
                AbstractC0191x p2 = (AbstractC0191x) obj;
                AbstractC0191x p9 = (AbstractC0191x) obj2;
                kotlin.jvm.internal.m.e(p2, "p0");
                kotlin.jvm.internal.m.e(p9, "p1");
                ((u) this.receiver).getClass();
                k.f2488b.getClass();
                l lVar = j.f2487b;
                return Boolean.valueOf(lVar.b(p2, p9) && !lVar.b(p9, p2));
            case 1:
                AbstractC0191x p10 = (AbstractC0191x) obj;
                AbstractC0191x p11 = (AbstractC0191x) obj2;
                kotlin.jvm.internal.m.e(p10, "p0");
                kotlin.jvm.internal.m.e(p11, "p1");
                return Boolean.valueOf(((l) this.receiver).a(p10, p11));
            case 2:
                C c9 = (C) obj;
                C c10 = (C) obj2;
                v vVar = (v) this.receiver;
                if (vVar.f26487u && (zB = ((D) c10).b()) != ((D) c9).b()) {
                    I i3 = null;
                    if (zB) {
                        A a2 = new A();
                        AbstractC0777k.p(vVar, new C0656d(a2, vVar, 12));
                        I i9 = (I) a2.f24539h;
                        if (i9 != null) {
                            i9.a();
                            i3 = i9;
                        }
                        vVar.y = i3;
                    } else {
                        I i10 = vVar.y;
                        if (i10 != null) {
                            i10.b();
                        }
                        vVar.y = null;
                    }
                }
                return p070h6.A.f22523a;
            case 3:
                SerialDescriptor p12 = (SerialDescriptor) obj;
                int iIntValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.e(p12, "p0");
                t8.t tVar = (t8.t) this.receiver;
                tVar.getClass();
                boolean z6 = !p12.j(iIntValue) && p12.i(iIntValue).d();
                tVar.f28638b = z6;
                return Boolean.valueOf(z6);
            default:
                C c11 = (C) obj;
                C c12 = (C) obj2;
                U u6 = (U) this.receiver;
                if (u6.f26487u && (zB2 = ((D) c12).b()) != ((D) c11).b()) {
                    p007a7.n nVar = u6.y;
                    if (nVar != null) {
                        nVar.invoke(Boolean.valueOf(zB2));
                    }
                    if (zB2) {
                        S7.C.A(u6.B0(), null, new T(u6, null), 3);
                        A a9 = new A();
                        AbstractC0777k.p(u6, new io.ktor.http.d(a9, u6, 18));
                        I i11 = (I) a9.f24539h;
                        if (i11 != null) {
                            i11.a();
                        } else {
                            i11 = null;
                        }
                        u6.f28898A = i11;
                        NodeCoordinator nodeCoordinator = u6.f28899B;
                        if (nodeCoordinator != null && nodeCoordinator.U0().f26487u) {
                            u6.R0();
                        }
                    } else {
                        I i12 = u6.f28898A;
                        if (i12 != null) {
                            i12.b();
                        }
                        u6.f28898A = null;
                        u6.R0();
                    }
                    AbstractC0777k.l(u6);
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
