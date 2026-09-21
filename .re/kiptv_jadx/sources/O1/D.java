package O1;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f7737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f7738i;
    public java.io.Serializable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.A f7739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ O1.N f7743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7744p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O1.N n3, p117n6.c cVar) {
        super(cVar);
        this.f7743o = n3;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7742n = obj;
        this.f7744p |= Integer.MIN_VALUE;
        return O1.N.f(this.f7743o, false, this);
    }
}
