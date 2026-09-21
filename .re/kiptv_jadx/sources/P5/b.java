package P5;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public P5.g f8144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8145i;
    public final /* synthetic */ P5.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8146k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(P5.g gVar, p117n6.c cVar) {
        super(cVar);
        this.j = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f8145i = obj;
        this.f8146k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
