package Y4;

/* JADX INFO: renamed from: Y4.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1065d1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1118u1 f11846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kotlinx.serialization.KSerializer f11847i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y4.C1118u1 f11848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11849l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065d1(Y4.C1118u1 c1118u1, p100l6.c cVar) {
        super(cVar);
        this.f11848k = c1118u1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f11849l |= Integer.MIN_VALUE;
        return this.f11848k.g(null, null, null, null, this);
    }
}
