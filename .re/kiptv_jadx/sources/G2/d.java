package G2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p100l6.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f3778h;

    public d(p100l6.h hVar) {
        this.f3778h = hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        return kotlin.jvm.internal.m.a(this.f3778h, obj);
    }

    @Override // p100l6.h
    public final java.lang.Object fold(java.lang.Object obj, p194x6.m mVar) {
        return this.f3778h.fold(obj, mVar);
    }

    @Override // p100l6.h
    public final p100l6.f get(p100l6.g gVar) {
        return this.f3778h.get(gVar);
    }

    public final int hashCode() {
        return this.f3778h.hashCode();
    }

    @Override // p100l6.h
    public final p100l6.h minusKey(p100l6.g gVar) {
        p100l6.h hVarMinusKey = this.f3778h.minusKey(gVar);
        int i3 = G2.g.f3783b;
        S7.C0905v c0905v = S7.AbstractC0906w.f9624h;
        S7.AbstractC0906w abstractC0906w = (S7.AbstractC0906w) get(c0905v);
        S7.AbstractC0906w abstractC0906w2 = (S7.AbstractC0906w) hVarMinusKey.get(c0905v);
        if ((abstractC0906w instanceof G2.e) && !kotlin.jvm.internal.m.a(abstractC0906w, abstractC0906w2)) {
            ((G2.e) abstractC0906w).j = 0;
        }
        return new G2.d(hVarMinusKey);
    }

    @Override // p100l6.h
    public final p100l6.h plus(p100l6.h hVar) {
        p100l6.h hVarPlus = this.f3778h.plus(hVar);
        int i3 = G2.g.f3783b;
        S7.C0905v c0905v = S7.AbstractC0906w.f9624h;
        S7.AbstractC0906w abstractC0906w = (S7.AbstractC0906w) get(c0905v);
        S7.AbstractC0906w abstractC0906w2 = (S7.AbstractC0906w) hVarPlus.get(c0905v);
        if ((abstractC0906w instanceof G2.e) && !kotlin.jvm.internal.m.a(abstractC0906w, abstractC0906w2)) {
            ((G2.e) abstractC0906w).j = 0;
        }
        return new G2.d(hVarPlus);
    }

    public final java.lang.String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f3778h + ')';
    }
}
