package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class N6 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f13700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13701i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.core.repository.b f13703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13704m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(com.kiptv.core.repository.b bVar, p117n6.c cVar) {
        super(cVar);
        this.f13703l = bVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13702k = obj;
        this.f13704m |= Integer.MIN_VALUE;
        return this.f13703l.c(null, null, this);
    }
}
