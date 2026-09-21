package p085j5;

/* JADX INFO: renamed from: j5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2513c extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p085j5.C2524n f24118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24119i;
    public final /* synthetic */ p085j5.C2524n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24120k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2513c(p085j5.C2524n c2524n, p117n6.c cVar) {
        super(cVar);
        this.j = c2524n;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24119i = obj;
        this.f24120k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
