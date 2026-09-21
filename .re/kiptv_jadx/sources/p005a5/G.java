package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.H f13408i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(p005a5.H h9, p117n6.c cVar) {
        super(cVar);
        this.f13408i = h9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13407h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13408i.f(this);
    }
}
