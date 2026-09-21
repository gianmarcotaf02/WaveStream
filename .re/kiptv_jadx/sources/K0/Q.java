package K0;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K0.S f6669i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(K0.S s9, p117n6.a aVar) {
        super(aVar);
        this.f6669i = s9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6668h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f6669i.h(0L, null, this);
    }
}
