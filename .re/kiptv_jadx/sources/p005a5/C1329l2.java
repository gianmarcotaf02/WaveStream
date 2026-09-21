package p005a5;

/* JADX INFO: renamed from: a5.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1329l2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1379q2 f14720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14721i;
    public final /* synthetic */ p005a5.C1379q2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14722k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1329l2(p005a5.C1379q2 c1379q2, p117n6.c cVar) {
        super(cVar);
        this.j = c1379q2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14721i = obj;
        this.f14722k |= Integer.MIN_VALUE;
        java.lang.Object objO = this.j.o(null, null, this);
        return objO == p109m6.a.f25430h ? objO : new p070h6.n(objO);
    }
}
