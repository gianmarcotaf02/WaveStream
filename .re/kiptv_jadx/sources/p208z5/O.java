package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.X f32541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32542i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p208z5.X f32543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32544l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(p208z5.X x9, p100l6.c cVar) {
        super(cVar);
        this.f32543k = x9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f32544l |= Integer.MIN_VALUE;
        return p208z5.X.f(this.f32543k, this);
    }
}
