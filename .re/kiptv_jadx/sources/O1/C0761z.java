package O1;

/* JADX INFO: renamed from: O1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0761z extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O1.N f7881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7882i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O1.N f7883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0761z(O1.N n3, p117n6.c cVar) {
        super(cVar);
        this.f7883k = n3;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f7884l |= Integer.MIN_VALUE;
        return this.f7883k.h(this);
    }
}
