package p005a5;

/* JADX INFO: renamed from: a5.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1468z2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.B2 f15393i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468z2(p005a5.B2 b9, p117n6.c cVar) {
        super(cVar);
        this.f15393i = b9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15392h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f15393i.e(0, this);
    }
}
