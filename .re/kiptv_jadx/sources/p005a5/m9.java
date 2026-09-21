package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class m9 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f14792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f14793i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.n9 f14795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14796m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(p005a5.n9 n9Var, p117n6.c cVar) {
        super(cVar);
        this.f14795l = n9Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        this.f14794k = obj;
        this.f14796m |= Integer.MIN_VALUE;
        java.io.Serializable serializableH = this.f14795l.h(null, this);
        return serializableH == p109m6.a.f25430h ? serializableH : new p070h6.n(serializableH);
    }
}
