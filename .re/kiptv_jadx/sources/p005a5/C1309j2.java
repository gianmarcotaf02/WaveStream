package p005a5;

/* JADX INFO: renamed from: a5.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1309j2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1379q2 f14652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14653i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1379q2 f14654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14655l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309j2(p005a5.C1379q2 c1379q2, p117n6.c cVar) {
        super(cVar);
        this.f14654k = c1379q2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f14655l |= Integer.MIN_VALUE;
        return this.f14654k.m(null, this);
    }
}
