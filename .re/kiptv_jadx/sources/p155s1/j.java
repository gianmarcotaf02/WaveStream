package p155s1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p155s1.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p155s1.k f27250o;

    public j(p155s1.k kVar) {
        this.f27250o = kVar;
    }

    @Override // p155s1.g
    public final java.lang.String g() {
        p155s1.h hVar = (p155s1.h) this.f27250o.f27251h.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f27246a + "]";
    }
}
