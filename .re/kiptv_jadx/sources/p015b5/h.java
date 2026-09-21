package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p015b5.k f17958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f17959i;
    public final /* synthetic */ p015b5.k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17960k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p015b5.k kVar, p117n6.c cVar) {
        super(cVar);
        this.j = kVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f17959i = obj;
        this.f17960k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
