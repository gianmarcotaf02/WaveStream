package U;

/* JADX INFO: renamed from: U.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939l extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f10037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f10038i;
    public p028c8.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U.C0945s f10041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10042n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0939l(U.C0945s c0945s, p117n6.c cVar) {
        super(cVar);
        this.f10041m = c0945s;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10040l = obj;
        this.f10042n |= Integer.MIN_VALUE;
        return U.C0945s.a(this.f10041m, null, 0L, null, this);
    }
}
