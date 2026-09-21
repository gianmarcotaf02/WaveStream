package p005a5;

/* JADX INFO: renamed from: a5.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439w3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15235i;
    public final /* synthetic */ p005a5.B3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15236k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1439w3(p005a5.B3 b9, p117n6.c cVar) {
        super(cVar);
        this.j = b9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15235i = obj;
        this.f15236k |= Integer.MIN_VALUE;
        return this.j.o(0, null, this);
    }
}
