package W6;

/* JADX INFO: renamed from: W6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1003d implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W6.C1003d f10644i = new W6.C1003d(0);
    public static final W6.C1003d j = new W6.C1003d(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W6.C1003d f10645k = new W6.C1003d(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W6.C1003d f10646l = new W6.C1003d(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W6.C1003d f10647m = new W6.C1003d(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final W6.C1003d f10648n = new W6.C1003d(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W6.C1003d f10649o = new W6.C1003d(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10650h;

    public /* synthetic */ C1003d(int i3) {
        this.f10650h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        N6.InterfaceC0689c interfaceC0689cB;
        java.lang.String strC0;
        boolean z6 = false;
        switch (this.f10650h) {
            case 0:
                N6.InterfaceC0689c it = (N6.InterfaceC0689c) obj;
                int i3 = W6.AbstractC1004e.f10651l;
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Boolean.valueOf(p078i6.o.b1(W6.G.f10630f, com.google.android.gms.internal.play_billing.AbstractC1864o0.c0(it)));
            case 1:
                N6.InterfaceC0689c it2 = (N6.InterfaceC0689c) obj;
                int i9 = W6.AbstractC1004e.f10651l;
                kotlin.jvm.internal.m.e(it2, "it");
                if ((it2 instanceof N6.InterfaceC0706u) && p078i6.o.b1(W6.G.f10630f, com.google.android.gms.internal.play_billing.AbstractC1864o0.c0(it2))) {
                    z6 = true;
                }
                return java.lang.Boolean.valueOf(z6);
            case 2:
                N6.InterfaceC0689c it3 = (N6.InterfaceC0689c) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return java.lang.Boolean.valueOf(O7.r.H(it3));
            case 3:
                return ((Q6.S) obj).getType();
            case 4:
                N6.InterfaceC0689c it4 = (N6.InterfaceC0689c) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return java.lang.Boolean.valueOf(O7.r.H(p161s7.d.k(it4)));
            case 5:
                N6.InterfaceC0689c it5 = (N6.InterfaceC0689c) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                int i10 = W6.AbstractC1002c.f10643l;
                Q6.L l2 = (Q6.L) it5;
                if (K6.i.z(l2) && p161s7.d.b(l2, new C7.C0173e(10, l2)) != null) {
                    z6 = true;
                }
                return java.lang.Boolean.valueOf(z6);
            default:
                N6.InterfaceC0689c it6 = (N6.InterfaceC0689c) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                if (K6.i.z(it6)) {
                    int i11 = W6.AbstractC1004e.f10651l;
                    W6.D d4 = null;
                    if (W6.G.f10629e.contains(it6.getName()) && (interfaceC0689cB = p161s7.d.b(it6, j)) != null && (strC0 = com.google.android.gms.internal.play_billing.AbstractC1864o0.c0(interfaceC0689cB)) != null) {
                        if (W6.G.f10626b.contains(strC0)) {
                            d4 = W6.D.f10617h;
                        } else {
                            d4 = ((W6.F) p078i6.C.M0(strC0, W6.G.f10628d)) == W6.F.f10620i ? W6.D.j : W6.D.f10618i;
                        }
                    }
                    if (d4 != null) {
                        z6 = true;
                    }
                }
                return java.lang.Boolean.valueOf(z6);
        }
    }
}
