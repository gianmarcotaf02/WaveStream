package s0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U7.C0957e f27200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f27201i;
    public final /* synthetic */ s0.f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27202k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s0.f fVar, p117n6.c cVar) {
        super(cVar);
        this.j = fVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f27201i = obj;
        this.f27202k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
