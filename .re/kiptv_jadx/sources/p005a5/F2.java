package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class F2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.J2 f13387i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(p005a5.J2 j9, p117n6.c cVar) {
        super(cVar);
        this.f13387i = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13386h = obj;
        this.j |= Integer.MIN_VALUE;
        return p005a5.J2.c(this.f13387i, null, this);
    }
}
