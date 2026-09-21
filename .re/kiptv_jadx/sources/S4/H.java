package S4;

/* JADX INFO: loaded from: classes.dex */
public final class H extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S4.J f9311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.LinkedHashMap f9312i;
    public kotlin.jvm.internal.y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p028c8.d f9313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S4.J f9316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9317o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(S4.J j, p117n6.c cVar) {
        super(cVar);
        this.f9316n = j;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f9315m = obj;
        this.f9317o |= Integer.MIN_VALUE;
        return this.f9316n.a(0, null, this);
    }
}
