package V4;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.A f10257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10258i;
    public final /* synthetic */ V4.P j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(V4.P p2, p117n6.c cVar) {
        super(cVar);
        this.j = p2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10258i = obj;
        this.f10259k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
