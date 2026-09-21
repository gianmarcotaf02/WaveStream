package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13639i;
    public final /* synthetic */ p005a5.O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(p005a5.O o8, p117n6.c cVar) {
        super(cVar);
        this.j = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13639i = obj;
        this.f13640k |= Integer.MIN_VALUE;
        return this.j.f(0, 0, 0, null, null, this);
    }
}
