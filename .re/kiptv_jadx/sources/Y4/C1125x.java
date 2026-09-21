package Y4;

/* JADX INFO: renamed from: Y4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1125x extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1131z f12138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12139i;
    public final /* synthetic */ Y4.C1131z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12140k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125x(Y4.C1131z c1131z, p117n6.c cVar) {
        super(cVar);
        this.j = c1131z;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12139i = obj;
        this.f12140k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
