package p005a5;

/* JADX INFO: renamed from: a5.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1305i8 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f14612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14613i;
    public java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1434v8 f14615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305i8(p005a5.C1434v8 c1434v8, p117n6.c cVar) {
        super(cVar);
        this.f14615l = c1434v8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14614k = obj;
        this.f14616m |= Integer.MIN_VALUE;
        return p005a5.C1434v8.d(this.f14615l, this);
    }
}
