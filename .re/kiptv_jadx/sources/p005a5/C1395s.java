package p005a5;

/* JADX INFO: renamed from: a5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1395s extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1455y f15042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f15043i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1455y f15045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15046m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395s(p005a5.C1455y c1455y, p117n6.c cVar) {
        super(cVar);
        this.f15045l = c1455y;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15044k = obj;
        this.f15046m |= Integer.MIN_VALUE;
        return this.f15045l.a(this);
    }
}
