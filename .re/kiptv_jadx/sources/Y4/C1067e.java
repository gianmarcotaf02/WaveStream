package Y4;

/* JADX INFO: renamed from: Y4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1067e extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1075g f11857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11858i;
    public final /* synthetic */ Y4.C1075g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11859k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1067e(Y4.C1075g c1075g, p117n6.c cVar) {
        super(cVar);
        this.j = c1075g;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f11858i = obj;
        this.f11859k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
