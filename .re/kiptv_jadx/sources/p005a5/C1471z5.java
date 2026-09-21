package p005a5;

/* JADX INFO: renamed from: a5.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1471z5 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.C5 f15402i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1471z5(p005a5.C5 c9, p117n6.c cVar) {
        super(cVar);
        this.f15402i = c9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15401h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f15402i.a(null, this);
    }
}
