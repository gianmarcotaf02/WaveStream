package R1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements A6.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p194x6.j f9038i;
    public final S7.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f9039k = new java.lang.Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile S1.d f9040l;

    public b(java.lang.String str, p194x6.j jVar, S7.A a2) {
        this.f9037h = str;
        this.f9038i = jVar;
        this.j = a2;
    }

    @Override // A6.b
    public final java.lang.Object getValue(java.lang.Object obj, E6.u property) {
        S1.d dVar;
        android.content.Context thisRef = (android.content.Context) obj;
        kotlin.jvm.internal.m.e(thisRef, "thisRef");
        kotlin.jvm.internal.m.e(property, "property");
        S1.d dVar2 = this.f9040l;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f9039k) {
            try {
                if (this.f9040l == null) {
                    android.content.Context applicationContext = thisRef.getApplicationContext();
                    p194x6.j jVar = this.f9038i;
                    kotlin.jvm.internal.m.d(applicationContext, "applicationContext");
                    java.util.List migrations = (java.util.List) jVar.invoke(applicationContext);
                    S7.A a2 = this.j;
                    K0.C0656d c0656d = new K0.C0656d(applicationContext, this, 8);
                    kotlin.jvm.internal.m.e(migrations, "migrations");
                    this.f9040l = new S1.d(new S1.d(new O1.N(new Q1.f(M8.q.f7275h, new A8.m(10, c0656d)), com.google.common.util.concurrent.P.i0(new O1.C0740d(migrations, null)), new B3.o(19), a2)));
                }
                dVar = this.f9040l;
                kotlin.jvm.internal.m.b(dVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
