package Y4;

/* JADX INFO: renamed from: Y4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1075g f11811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Map f11812i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y4.C1075g f11813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11814l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055b(Y4.C1075g c1075g, p117n6.c cVar) {
        super(cVar);
        this.f11813k = c1075g;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f11814l |= Integer.MIN_VALUE;
        return this.f11813k.c(this);
    }
}
