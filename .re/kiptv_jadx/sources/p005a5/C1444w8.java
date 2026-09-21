package p005a5;

/* JADX INFO: renamed from: a5.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1444w8 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15274i;
    public final /* synthetic */ J5.V j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444w8(J5.V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15273h = obj;
        this.f15274i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
