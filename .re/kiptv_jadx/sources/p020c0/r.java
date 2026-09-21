package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18355i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ r(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f18354h = i3;
        this.f18355i = obj;
        this.j = obj2;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f18354h) {
            case 0:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                boolean z6 = obj2 instanceof p020c0.InterfaceC1682h;
                p089k0.k kVar = (p089k0.k) this.f18355i;
                if (z6) {
                    kVar.f24428f.c((p020c0.InterfaceC1682h) obj2);
                } else if (!(obj2 instanceof p020c0.G0)) {
                    boolean z9 = obj2 instanceof p020c0.D0;
                    p020c0.N0 n3 = (p020c0.N0) this.j;
                    if (z9) {
                        p020c0.AbstractC1703s.G(n3, iIntValue, obj2);
                        kVar.e((p020c0.D0) obj2);
                    } else if (obj2 instanceof p020c0.C1701q0) {
                        p020c0.AbstractC1703s.G(n3, iIntValue, obj2);
                        ((p020c0.C1701q0) obj2).d();
                    }
                }
                break;
            case 1:
                ((java.lang.Integer) obj2).getClass();
                int iK = p020c0.AbstractC1703s.K(1);
                com.google.common.util.concurrent.U.L((p121o0.n) this.f18355i, (java.util.List) this.j, (p020c0.C1700q) obj, iK);
                break;
            case 2:
                ((java.lang.Integer) obj2).getClass();
                int iK2 = p020c0.AbstractC1703s.K(1);
                p089k0.e eVar = (p089k0.e) this.j;
                com.google.crypto.tink.shaded.protobuf.AbstractC1909d.j((p112n0.e) this.f18355i, eVar, (p020c0.C1700q) obj, iK2);
                break;
            case 3:
                ((java.lang.Integer) obj2).getClass();
                int iK3 = p020c0.AbstractC1703s.K(1);
                com.google.android.gms.internal.play_billing.AbstractC1864o0.C((kotlin.jvm.functions.Function0) this.f18355i, (p150r5.i) this.j, (p020c0.C1700q) obj, iK3);
                break;
            case 4:
                ((java.lang.Integer) obj2).getClass();
                int iK4 = p020c0.AbstractC1703s.K(49);
                t5.AbstractC2793d1.c0((t5.C2834r1) this.f18355i, (kotlin.jvm.functions.Function0) this.j, (p020c0.C1700q) obj, iK4);
                break;
            case 5:
                ((java.lang.Integer) obj2).getClass();
                int iK5 = p020c0.AbstractC1703s.K(49);
                p089k0.e eVar2 = (p089k0.e) this.j;
                t5.AbstractC2793d1.O((kotlin.jvm.functions.Function0) this.f18355i, eVar2, (p020c0.C1700q) obj, iK5);
                break;
            case 6:
                ((java.lang.Integer) obj2).getClass();
                int iK6 = p020c0.AbstractC1703s.K(1);
                com.google.android.gms.internal.play_billing.AbstractC1864o0.a((java.util.List) this.f18355i, (java.lang.String) this.j, (p020c0.C1700q) obj, iK6);
                break;
            case 7:
                ((java.lang.Integer) obj2).getClass();
                int iK7 = p020c0.AbstractC1703s.K(1);
                ((w.d) this.f18355i).a((w.c) this.j, (p020c0.C1700q) obj, iK7);
                break;
            default:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.f18355i;
                float f9 = xVar.f24554h;
                xVar.f24554h = ((x.InterfaceC3076x0) this.j).a(fFloatValue - f9) + f9;
                break;
        }
        return p070h6.A.f22523a;
    }

    public /* synthetic */ r(java.lang.Object obj, java.lang.Object obj2, int i3, int i9) {
        this.f18354h = i9;
        this.f18355i = obj;
        this.j = obj2;
    }
}
