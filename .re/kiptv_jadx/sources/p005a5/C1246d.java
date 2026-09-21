package p005a5;

/* JADX INFO: renamed from: a5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1246d extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1296i f14338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14339i;
    public final /* synthetic */ p005a5.C1296i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14340k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246d(p005a5.C1296i c1296i, p117n6.c cVar) {
        super(cVar);
        this.j = c1296i;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14339i = obj;
        this.f14340k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
