package F4;

/* JADX INFO: loaded from: classes.dex */
public final class d implements E4.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F4.b f3655f;
    public static final F4.b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f3658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F4.a f3659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F4.a f3654e = new F4.a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F4.c f3656h = new F4.c();

    /* JADX WARN: Type inference failed for: r0v1, types: [F4.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [F4.b] */
    static {
        final int i3 = 0;
        f3655f = new D4.f() { // from class: F4.b
            @Override // D4.a
            public final void a(java.lang.Object obj, java.lang.Object obj2) {
                switch (i3) {
                    case 0:
                        ((D4.g) obj2).c((java.lang.String) obj);
                        break;
                    default:
                        ((D4.g) obj2).d(((java.lang.Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i9 = 1;
        g = new D4.f() { // from class: F4.b
            @Override // D4.a
            public final void a(java.lang.Object obj, java.lang.Object obj2) {
                switch (i9) {
                    case 0:
                        ((D4.g) obj2).c((java.lang.String) obj);
                        break;
                    default:
                        ((D4.g) obj2).d(((java.lang.Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        java.util.HashMap map = new java.util.HashMap();
        this.f3657a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        this.f3658b = map2;
        this.f3659c = f3654e;
        this.f3660d = false;
        map2.put(java.lang.String.class, f3655f);
        map.remove(java.lang.String.class);
        map2.put(java.lang.Boolean.class, g);
        map.remove(java.lang.Boolean.class);
        map2.put(java.util.Date.class, f3656h);
        map.remove(java.util.Date.class);
    }

    public final E4.a a(java.lang.Class cls, D4.d dVar) {
        this.f3657a.put(cls, dVar);
        this.f3658b.remove(cls);
        return this;
    }
}
