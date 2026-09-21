package p005a5;

/* JADX INFO: renamed from: a5.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1260e3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.B3 f14393i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260e3(p005a5.B3 b9, p117n6.c cVar) {
        super(cVar);
        this.f14393i = b9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14392h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f14393i.h(null, this);
    }
}
