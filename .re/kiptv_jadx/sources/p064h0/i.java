package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p078i6.AbstractC2259j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p064h0.c f22445i;

    public /* synthetic */ i(p064h0.c cVar, int i3) {
        this.f22444h = i3;
        this.f22445i = cVar;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry;
        switch (this.f22444h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry) || (entry = (java.util.Map.Entry) obj) == null) {
                    return false;
                }
                java.lang.Object key = entry.getKey();
                p064h0.c cVar = this.f22445i;
                java.lang.Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f22445i.containsKey(obj);
        }
    }

    @Override // p078i6.AbstractC2250a
    public final int d() {
        switch (this.f22444h) {
            case 0:
                p064h0.c cVar = this.f22445i;
                cVar.getClass();
                return cVar.f22433i;
            default:
                p064h0.c cVar2 = this.f22445i;
                cVar2.getClass();
                return cVar2.f22433i;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.f22444h) {
            case 0:
                p064h0.c cVar = this.f22445i;
                p064h0.l[] lVarArr = new p064h0.l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new p064h0.m(0);
                }
                return new p064h0.j(cVar.f22432h, lVarArr);
            default:
                p064h0.c cVar2 = this.f22445i;
                p064h0.l[] lVarArr2 = new p064h0.l[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    lVarArr2[i9] = new p064h0.m(1);
                }
                return new p064h0.j(cVar2.f22432h, lVarArr2);
        }
    }
}
