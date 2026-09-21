package D2;

/* JADX INFO: loaded from: classes.dex */
public class h extends D1.AbstractC0220e0 {
    public static final D2.g j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f2086i;

    static {
        java.util.List listI0 = com.google.common.util.concurrent.P.i0(new D2.f());
        D2.d dVar = new D2.d();
        dVar.f2083a = D2.a.f2081a;
        dVar.f2084b = listI0;
        j = new D2.g(dVar, "");
    }

    public h(D2.d dVar, java.lang.String str) {
        super(dVar);
        this.f2086i = str;
    }

    public java.lang.String E0() {
        return this.f2086i;
    }
}
