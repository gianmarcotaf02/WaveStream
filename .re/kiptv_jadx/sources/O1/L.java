package O1;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.y f7766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7767i;
    public final /* synthetic */ O1.N j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7768k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O1.N n3, p117n6.c cVar) {
        super(cVar);
        this.j = n3;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7767i = obj;
        this.f7768k |= Integer.MIN_VALUE;
        return this.j.j(null, false, this);
    }
}
