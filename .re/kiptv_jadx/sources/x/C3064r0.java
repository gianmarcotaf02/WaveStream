package x;

/* JADX INFO: renamed from: x.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3064r0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f30993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x.C3066s0 f30994i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064r0(x.C3066s0 c3066s0, p117n6.c cVar) {
        super(cVar);
        this.f30994i = c3066s0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f30993h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f30994i.f(this);
    }
}
