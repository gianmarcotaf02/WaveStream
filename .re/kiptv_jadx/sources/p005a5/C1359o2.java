package p005a5;

/* JADX INFO: renamed from: a5.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1359o2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1379q2 f14879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14880i;
    public final /* synthetic */ p005a5.C1379q2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14881k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359o2(p005a5.C1379q2 c1379q2, p117n6.c cVar) {
        super(cVar);
        this.j = c1379q2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14880i = obj;
        this.f14881k |= Integer.MIN_VALUE;
        java.lang.Object objS = this.j.s(this);
        return objS == p109m6.a.f25430h ? objS : new p070h6.n(objS);
    }
}
