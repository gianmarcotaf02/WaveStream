package x;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f30722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f30723i;
    public final /* synthetic */ B7.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30724k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(B7.l lVar, p117n6.c cVar) {
        super(cVar);
        this.j = lVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f30723i = obj;
        this.f30724k |= Integer.MIN_VALUE;
        return this.j.h0(0L, 0L, this);
    }
}
