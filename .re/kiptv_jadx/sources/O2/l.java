package O2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f7908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.A f7909i;
    public kotlin.jvm.internal.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O2.q f7911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(O2.q qVar, p117n6.c cVar) {
        super(cVar);
        this.f7911l = qVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7910k = obj;
        this.f7912m |= Integer.MIN_VALUE;
        return this.f7911l.a(this);
    }
}
