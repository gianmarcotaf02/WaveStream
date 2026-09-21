package Y4;

/* JADX INFO: renamed from: Y4.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1073f1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1118u1 f11881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11882i;
    public final /* synthetic */ Y4.C1118u1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11883k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073f1(Y4.C1118u1 c1118u1, p117n6.c cVar) {
        super(cVar);
        this.j = c1118u1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f11882i = obj;
        this.f11883k |= Integer.MIN_VALUE;
        return this.j.j(null, null, null, this);
    }
}
