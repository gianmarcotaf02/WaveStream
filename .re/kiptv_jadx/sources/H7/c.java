package H7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends C7.N {
    @Override // C7.N
    public final C7.P g(C7.M key) {
        kotlin.jvm.internal.m.e(key, "key");
        p134p7.b bVar = key instanceof p134p7.b ? (p134p7.b) key : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.a().c()) {
            return new C7.G(bVar.a().b(), C7.b0.f1577l);
        }
        return bVar.a();
    }
}
