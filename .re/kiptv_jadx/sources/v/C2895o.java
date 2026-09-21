package v;

/* JADX INFO: renamed from: v.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2895o extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f28977i;
    public final /* synthetic */ v.C2897q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28978k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895o(v.C2897q c2897q, p117n6.c cVar) {
        super(cVar);
        this.j = c2897q;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f28977i = obj;
        this.f28978k |= Integer.MIN_VALUE;
        return this.j.b(0L, null, this);
    }
}
