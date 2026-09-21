package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p064h0.c implements p020c0.InterfaceC1691l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p089k0.j f24422k = new p089k0.j(p064h0.k.f22446e, 0);

    public final p089k0.j b(p020c0.AbstractC1697o0 abstractC1697o0, p020c0.h1 h1Var) {
        Y2.L lU = this.f22432h.u(abstractC1697o0, abstractC1697o0.hashCode(), h1Var, 0);
        return lU == null ? this : new p089k0.j((p064h0.k) lU.j, this.f22433i + lU.f11389i);
    }

    @Override // p064h0.c, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof p020c0.AbstractC1697o0) {
            return super.containsKey((p020c0.AbstractC1697o0) obj);
        }
        return false;
    }

    @Override // p078i6.AbstractC2256g, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof p020c0.h1) {
            return super.containsValue((p020c0.h1) obj);
        }
        return false;
    }

    @Override // p064h0.c, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof p020c0.AbstractC1697o0) {
            return (p020c0.h1) super.get((p020c0.AbstractC1697o0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof p020c0.AbstractC1697o0) ? obj2 : (p020c0.h1) super.getOrDefault((p020c0.AbstractC1697o0) obj, (p020c0.h1) obj2);
    }
}
