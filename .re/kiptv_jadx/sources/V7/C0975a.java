package V7;

/* JADX INFO: renamed from: V7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0975a extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public W7.y f10429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10430i;
    public final /* synthetic */ O1.C0754s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10431k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975a(O1.C0754s c0754s, p100l6.c cVar) {
        super(cVar);
        this.j = c0754s;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10430i = obj;
        this.f10431k |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
