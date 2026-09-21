package V4;

/* JADX INFO: renamed from: V4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964g extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.A f10305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10306i;
    public final /* synthetic */ V4.C0967j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10307k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0964g(V4.C0967j c0967j, p117n6.c cVar) {
        super(cVar);
        this.j = c0967j;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10306i = obj;
        this.f10307k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
