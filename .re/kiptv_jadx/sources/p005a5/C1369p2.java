package p005a5;

/* JADX INFO: renamed from: a5.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1369p2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1379q2 f14934i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369p2(p005a5.C1379q2 c1379q2, p117n6.c cVar) {
        super(cVar);
        this.f14934i = c1379q2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14933h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f14934i.t(null, this);
    }
}
