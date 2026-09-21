package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p015b5.D f17924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Iterator f17925i;
    public com.kiptv.core.local.datastore.LocalProgressEntry j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f17930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p015b5.D f17931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(p015b5.D d4, p117n6.c cVar) {
        super(cVar);
        this.f17931p = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f17930o = obj;
        this.f17932q |= Integer.MIN_VALUE;
        return this.f17931p.b(this);
    }
}
