package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class A5 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C5 f13128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13129i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C5 f13130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13131l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(p005a5.C5 c9, p117n6.c cVar) {
        super(cVar);
        this.f13130k = c9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f13131l |= Integer.MIN_VALUE;
        return this.f13130k.b(this);
    }
}
