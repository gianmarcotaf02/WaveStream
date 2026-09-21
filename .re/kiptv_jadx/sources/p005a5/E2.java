package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class E2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.J2 f13337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13338i;
    public final /* synthetic */ p005a5.J2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13339k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(p005a5.J2 j9, p117n6.c cVar) {
        super(cVar);
        this.j = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13338i = obj;
        this.f13339k |= Integer.MIN_VALUE;
        return p005a5.J2.b(this.j, this);
    }
}
