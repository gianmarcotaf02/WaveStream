package p155s1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f27246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p155s1.k f27247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p155s1.l f27248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27249d;

    public final void a(java.lang.Object obj) {
        this.f27249d = true;
        p155s1.k kVar = this.f27247b;
        if (kVar != null) {
            p155s1.j jVar = kVar.f27252i;
            jVar.getClass();
            if (obj == null) {
                obj = p155s1.g.f27243n;
            }
            if (p155s1.g.f27242m.g0(jVar, null, obj)) {
                p155s1.g.c(jVar);
                this.f27246a = null;
                this.f27247b = null;
                this.f27248c = null;
            }
        }
    }

    public final void finalize() {
        p155s1.l lVar;
        p155s1.k kVar = this.f27247b;
        if (kVar != null) {
            p155s1.j jVar = kVar.f27252i;
            if (!jVar.isDone()) {
                jVar.i(new com.google.android.gms.internal.cast.Z1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f27246a, 5));
            }
        }
        if (this.f27249d || (lVar = this.f27248c) == null) {
            return;
        }
        lVar.j(null);
    }
}
