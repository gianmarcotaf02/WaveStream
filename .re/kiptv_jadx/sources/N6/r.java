package N6;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final N6.r f7416i = new N6.r(0);
    public static final N6.r j = new N6.r(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final N6.r f7417k = new N6.r(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final N6.r f7418l = new N6.r(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N6.r f7419m = new N6.r(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7420h;

    public /* synthetic */ r(int i3) {
        this.f7420h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f7420h) {
            case 0:
                kotlin.jvm.internal.m.e((p101l7.b) obj, "it");
                return 0;
            case 1:
                N6.G it = (N6.G) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return ((Q6.C) it).f8549l;
            case 2:
                N6.InterfaceC0697k it2 = (N6.InterfaceC0697k) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return java.lang.Boolean.valueOf(it2 instanceof N6.InterfaceC0688b);
            case 3:
                N6.InterfaceC0697k it3 = (N6.InterfaceC0697k) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return java.lang.Boolean.valueOf(!(it3 instanceof N6.InterfaceC0696j));
            default:
                N6.InterfaceC0697k it4 = (N6.InterfaceC0697k) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                java.util.List typeParameters = ((N6.InterfaceC0688b) it4).getTypeParameters();
                kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
                return p078i6.o.Y0(typeParameters);
        }
    }
}
