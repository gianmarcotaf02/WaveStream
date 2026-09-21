package V4;

/* JADX INFO: renamed from: V4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0960c extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.A f10296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10297i;
    public final /* synthetic */ V4.C0967j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10298k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0960c(V4.C0967j c0967j, p117n6.c cVar) {
        super(cVar);
        this.j = c0967j;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10297i = obj;
        this.f10298k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
