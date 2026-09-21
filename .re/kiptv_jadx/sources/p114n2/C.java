package p114n2;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p114n2.A f25587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f25591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25592f;
    public boolean g;

    public C() {
        p114n2.A a2 = new p114n2.A();
        a2.f25574a = -1;
        a2.f25578e = -1;
        a2.f25579f = -1;
        this.f25587a = a2;
        this.f25590d = -1;
    }

    public final void a(java.lang.String str, p194x6.j jVar) {
        if (O7.q.N0(str)) {
            throw new java.lang.IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f25591e = str;
        this.f25590d = -1;
        this.f25592f = false;
        p114n2.M m8 = new p114n2.M();
        jVar.invoke(m8);
        this.f25592f = m8.f25611a;
        this.g = m8.f25612b;
    }
}
