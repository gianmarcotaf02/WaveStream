package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f13412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f13413i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f13414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f13415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.String f13416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p028c8.d f13417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p005a5.M1 f13419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13420q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(p005a5.M1 m8, p117n6.c cVar) {
        super(cVar);
        this.f13419p = m8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13418o = obj;
        this.f13420q |= Integer.MIN_VALUE;
        return this.f13419p.a(null, null, null, null, null, this);
    }
}
