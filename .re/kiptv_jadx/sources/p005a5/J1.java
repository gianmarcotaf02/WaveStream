package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class J1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.M1 f13534i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(p005a5.M1 m8, p117n6.c cVar) {
        super(cVar);
        this.f13534i = m8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13533h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13534i.h(null, this);
    }
}
