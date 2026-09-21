package V7;

/* JADX INFO: renamed from: V7.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0998y extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U.O f10530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10531i;
    public final /* synthetic */ U.O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10532k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998y(U.O o8, p100l6.c cVar) {
        super(cVar);
        this.j = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10531i = obj;
        this.f10532k |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
