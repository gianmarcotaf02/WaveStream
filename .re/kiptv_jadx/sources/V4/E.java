package V4;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.w f10262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10263i;
    public final /* synthetic */ V4.P j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10264k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(V4.P p2, p117n6.c cVar) {
        super(cVar);
        this.j = p2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10263i = obj;
        this.f10264k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
