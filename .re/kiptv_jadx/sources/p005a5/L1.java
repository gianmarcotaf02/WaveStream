package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.M1 f13610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13611i;
    public com.kiptv.core.model.Playlist j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.M1 f13613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(p005a5.M1 m8, p117n6.c cVar) {
        super(cVar);
        this.f13613l = m8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13612k = obj;
        this.f13614m |= Integer.MIN_VALUE;
        return this.f13613l.j(null, null, null, null, null, null, null, this);
    }
}
