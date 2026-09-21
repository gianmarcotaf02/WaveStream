package p005a5;

/* JADX INFO: renamed from: a5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1266f extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1296i f14445i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266f(p005a5.C1296i c1296i, p117n6.c cVar) {
        super(cVar);
        this.f14445i = c1296i;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14444h = obj;
        this.j |= Integer.MIN_VALUE;
        p005a5.C1296i.a(this.f14445i, this);
        return p109m6.a.f25430h;
    }
}
