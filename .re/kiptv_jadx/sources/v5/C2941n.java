package v5;

/* JADX INFO: renamed from: v5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2941n extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v5.C2943o f29549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f29550i;
    public final /* synthetic */ v5.C2943o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29551k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2941n(v5.C2943o c2943o, p117n6.c cVar) {
        super(cVar);
        this.j = c2943o;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f29550i = obj;
        this.f29551k |= Integer.MIN_VALUE;
        return this.j.e(null, 0, null, 0, this);
    }
}
