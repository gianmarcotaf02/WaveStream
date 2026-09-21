package p005a5;

/* JADX INFO: renamed from: a5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1405t extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1455y f15087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f15088i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1455y f15091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15092n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1405t(p005a5.C1455y c1455y, p117n6.c cVar) {
        super(cVar);
        this.f15091m = c1455y;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15090l = obj;
        this.f15092n |= Integer.MIN_VALUE;
        return this.f15091m.b(0, this);
    }
}
