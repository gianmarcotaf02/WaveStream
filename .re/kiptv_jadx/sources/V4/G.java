package V4;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10268i;
    public final /* synthetic */ V4.H j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(V4.H h9, p100l6.c cVar) {
        super(cVar);
        this.j = h9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10267h = obj;
        this.f10268i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
