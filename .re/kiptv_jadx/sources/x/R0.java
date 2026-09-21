package x;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.z f30794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f30795i;
    public final /* synthetic */ x.W0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30796k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(x.W0 w6, p117n6.c cVar) {
        super(cVar);
        this.j = w6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f30795i = obj;
        this.f30796k |= Integer.MIN_VALUE;
        return this.j.a(0L, this);
    }
}
