package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p064h0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D0.G f22430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f22431l;

    public b(D0.G g, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2, 0);
        this.f22430k = g;
        this.f22431l = obj2;
    }

    @Override // p064h0.a, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f22431l;
    }

    @Override // p064h0.a, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.f22431l;
        this.f22431l = obj;
        p064h0.e eVar = (p064h0.e) this.f22430k.f1810i;
        p089k0.i iVar = eVar.f22436k;
        java.lang.Object obj3 = this.f22429i;
        if (!iVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z6 = eVar.j;
        if (!z6) {
            iVar.put(obj3, obj);
        } else {
            if (!z6) {
                throw new java.util.NoSuchElementException();
            }
            p064h0.l lVar = eVar.f22434h[eVar.f22435i];
            java.lang.Object obj4 = lVar.f22451h[lVar.j];
            iVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, iVar.f24418i, obj4, 0);
        }
        eVar.f22439n = iVar.f24419k;
        return obj2;
    }
}
