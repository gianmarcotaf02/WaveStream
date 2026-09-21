package F4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3651a;

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f3651a) {
            case 0:
                throw new D4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                D4.e eVar = (D4.e) obj2;
                eVar.b(G4.e.g, entry.getKey());
                eVar.b(G4.e.f3792h, entry.getValue());
                return;
            default:
                throw new D4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
