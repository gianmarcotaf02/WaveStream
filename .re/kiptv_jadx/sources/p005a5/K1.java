package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.M1 f13571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.Playlist f13572i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.M1 f13573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13574l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(p005a5.M1 m8, p117n6.c cVar) {
        super(cVar);
        this.f13573k = m8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f13574l |= Integer.MIN_VALUE;
        return this.f13573k.i(null, this);
    }
}
