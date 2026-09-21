package I0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p137q0.o implements I0.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p194x6.j f4571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p194x6.j f4572w;

    @Override // I0.e
    public final boolean f(android.view.KeyEvent keyEvent) {
        p194x6.j jVar = this.f4572w;
        if (jVar != null) {
            return ((java.lang.Boolean) jVar.invoke(new I0.b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // I0.e
    public final boolean z(android.view.KeyEvent keyEvent) {
        p194x6.j jVar = this.f4571v;
        if (jVar != null) {
            return ((java.lang.Boolean) jVar.invoke(new I0.b(keyEvent))).booleanValue();
        }
        return false;
    }
}
