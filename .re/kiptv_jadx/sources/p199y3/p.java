package p199y3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends android.util.LruCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p199y3.c f31882a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p199y3.c cVar) {
        super(20);
        this.f31882a = cVar;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z6, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (z6) {
            p199y3.c cVar = this.f31882a;
            H3.q.g(cVar.g);
            cVar.g.add(num);
        }
    }
}
