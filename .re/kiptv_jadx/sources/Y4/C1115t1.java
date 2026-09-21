package Y4;

/* JADX INFO: renamed from: Y4.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1115t1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1118u1 f12089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12090i;
    public final /* synthetic */ Y4.C1118u1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12091k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115t1(Y4.C1118u1 c1118u1, p117n6.c cVar) {
        super(cVar);
        this.j = c1118u1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12090i = obj;
        this.f12091k |= Integer.MIN_VALUE;
        return this.j.z(null, this);
    }
}
