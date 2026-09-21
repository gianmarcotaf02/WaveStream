package V7;

/* JADX INFO: renamed from: V7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0983i extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10465i;
    public final /* synthetic */ O1.C0754s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V7.InterfaceC0982h f10466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.Iterator f10467l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0983i(O1.C0754s c0754s, p100l6.c cVar) {
        super(cVar);
        this.j = c0754s;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10464h = obj;
        this.f10465i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
