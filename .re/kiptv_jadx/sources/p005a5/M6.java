package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class M6 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.kiptv.core.repository.b f13669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p005a5.L6 f13670i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.core.repository.b f13672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13673m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(com.kiptv.core.repository.b bVar, p117n6.c cVar) {
        super(cVar);
        this.f13672l = bVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13671k = obj;
        this.f13673m |= Integer.MIN_VALUE;
        return com.kiptv.core.repository.b.a(this.f13672l, null, null, this);
    }
}
