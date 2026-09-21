package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class G5 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.I5 f13436i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G5(p005a5.I5 i9, p100l6.c cVar) {
        super(cVar);
        this.f13436i = i9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13435h = obj;
        this.j |= Integer.MIN_VALUE;
        return p005a5.I5.a(this.f13436i, null, this);
    }
}
