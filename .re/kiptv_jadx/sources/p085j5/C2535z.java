package p085j5;

/* JADX INFO: renamed from: j5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2535z extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p085j5.K f24227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24228i;
    public final /* synthetic */ p085j5.K j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24229k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2535z(p085j5.K k9, p117n6.c cVar) {
        super(cVar);
        this.j = k9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24228i = obj;
        this.f24229k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
