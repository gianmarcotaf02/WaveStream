package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M8.v f8525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M8.v f8526i;
    public M8.D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q1.k f8528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8529m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Q1.k kVar, p117n6.c cVar) {
        super(cVar);
        this.f8528l = kVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f8527k = obj;
        this.f8529m |= Integer.MIN_VALUE;
        return this.f8528l.b(null, this);
    }
}
