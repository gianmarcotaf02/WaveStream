package Y4;

/* JADX INFO: renamed from: Y4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1122w extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.C1131z f12124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f12125i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y4.C1131z f12128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12129n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122w(Y4.C1131z c1131z, p117n6.c cVar) {
        super(cVar);
        this.f12128m = c1131z;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12127l = obj;
        this.f12129n |= Integer.MIN_VALUE;
        return this.f12128m.d(null, null, this);
    }
}
