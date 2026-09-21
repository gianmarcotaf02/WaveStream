package H6;

/* JADX INFO: renamed from: H6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0410b implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H6.C0410b f4410i = new H6.C0410b(0);
    public static final H6.C0410b j = new H6.C0410b(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H6.C0410b f4411k = new H6.C0410b(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final H6.C0410b f4412l = new H6.C0410b(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final H6.C0410b f4413m = new H6.C0410b(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final H6.C0410b f4414n = new H6.C0410b(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H6.C0410b f4415o = new H6.C0410b(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final H6.C0410b f4416p = new H6.C0410b(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final H6.C0410b f4417q = new H6.C0410b(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final H6.C0410b f4418r = new H6.C0410b(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final H6.C0410b f4419s = new H6.C0410b(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final H6.C0410b f4420t = new H6.C0410b(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4421h;

    public /* synthetic */ C0410b(int i3) {
        this.f4421h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p078i6.w wVar = p078i6.w.f23205h;
        switch (this.f4421h) {
            case 0:
                java.lang.Class it = (java.lang.Class) obj;
                H6.C0414d c0414d = H6.AbstractC0412c.f4423a;
                kotlin.jvm.internal.m.e(it, "it");
                return new H6.B(it);
            case 1:
                java.lang.Class it2 = (java.lang.Class) obj;
                H6.C0414d c0414d2 = H6.AbstractC0412c.f4423a;
                kotlin.jvm.internal.m.e(it2, "it");
                return new H6.V(it2);
            case 2:
                java.lang.Class it3 = (java.lang.Class) obj;
                H6.C0414d c0414d3 = H6.AbstractC0412c.f4423a;
                kotlin.jvm.internal.m.e(it3, "it");
                return E8.l.m(H6.AbstractC0412c.a(it3), wVar, false, wVar);
            case 3:
                java.lang.Class it4 = (java.lang.Class) obj;
                H6.C0414d c0414d4 = H6.AbstractC0412c.f4423a;
                kotlin.jvm.internal.m.e(it4, "it");
                return E8.l.m(H6.AbstractC0412c.a(it4), wVar, true, wVar);
            case 4:
                H6.C0414d c0414d5 = H6.AbstractC0412c.f4423a;
                kotlin.jvm.internal.m.e((java.lang.Class) obj, "it");
                return new java.util.concurrent.ConcurrentHashMap();
            case 5:
                java.lang.Class<?> returnType = ((java.lang.reflect.Method) obj).getReturnType();
                kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
                return T6.AbstractC0926d.b(returnType);
            case 6:
                java.lang.Class cls = (java.lang.Class) obj;
                kotlin.jvm.internal.m.b(cls);
                return T6.AbstractC0926d.b(cls);
            case 7:
                N6.N descriptor = (N6.N) obj;
                O7.o oVar = H6.G.f4370h;
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
                return p118n7.g.f25862e.v(descriptor) + " | " + H6.z0.b(descriptor).N();
            case 8:
                N6.InterfaceC0706u descriptor2 = (N6.InterfaceC0706u) obj;
                O7.o oVar2 = H6.G.f4370h;
                kotlin.jvm.internal.m.e(descriptor2, "descriptor");
                return p118n7.g.f25862e.v(descriptor2) + " | " + H6.z0.c(descriptor2).C();
            case 9:
                p118n7.g gVar = H6.y0.f4516a;
                C7.AbstractC0191x type = ((Q6.S) obj).getType();
                kotlin.jvm.internal.m.d(type, "getType(...)");
                return H6.y0.d(type);
            case 10:
                p118n7.g gVar2 = H6.y0.f4516a;
                C7.AbstractC0191x type2 = ((Q6.S) obj).getType();
                kotlin.jvm.internal.m.d(type2, "getType(...)");
                return H6.y0.d(type2);
            default:
                java.lang.Class cls2 = (java.lang.Class) obj;
                kotlin.jvm.internal.m.b(cls2);
                return T6.AbstractC0926d.b(cls2);
        }
    }
}
