package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p058g3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21406a;

    @Override // p061g6.a
    public final java.lang.Object get() {
        switch (this.f21406a) {
            case 0:
                return new F3.q(1, java.util.concurrent.Executors.newSingleThreadExecutor());
            default:
                V1.b bVar = new V1.b(24);
                java.util.HashMap map = new java.util.HashMap();
                p013b3.c cVar = p013b3.c.f17869h;
                java.util.Set set = java.util.Collections.EMPTY_SET;
                if (set == null) {
                    throw new java.lang.NullPointerException("Null flags");
                }
                map.put(cVar, new k3.b(30000L, 86400000L, set));
                p013b3.c cVar2 = p013b3.c.j;
                if (set == null) {
                    throw new java.lang.NullPointerException("Null flags");
                }
                map.put(cVar2, new k3.b(1000L, 86400000L, set));
                p013b3.c cVar3 = p013b3.c.f17870i;
                if (set == null) {
                    throw new java.lang.NullPointerException("Null flags");
                }
                java.util.Set setUnmodifiableSet = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(k3.d.f24447i)));
                if (setUnmodifiableSet == null) {
                    throw new java.lang.NullPointerException("Null flags");
                }
                map.put(cVar3, new k3.b(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < p013b3.c.values().length) {
                    throw new java.lang.IllegalStateException("Not all priorities have been configured");
                }
                new java.util.HashMap();
                return new k3.a(bVar, map);
        }
    }
}
