package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements N7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f7431a;

    public a(N7.m mVar) {
        this.f7431a = new java.util.concurrent.atomic.AtomicReference(mVar);
    }

    @Override // N7.m
    public final java.util.Iterator iterator() {
        N7.m mVar = (N7.m) this.f7431a.getAndSet(null);
        if (mVar != null) {
            return mVar.iterator();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
