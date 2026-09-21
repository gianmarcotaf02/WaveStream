package v5;

/* JADX INFO: renamed from: v5.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2944o0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v5.d1 f29562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f29563i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v5.d1 f29564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29565l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2944o0(v5.d1 d1Var, p117n6.c cVar) {
        super(cVar);
        this.f29564k = d1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f29565l |= Integer.MIN_VALUE;
        return v5.d1.e(this.f29564k, null, this);
    }
}
