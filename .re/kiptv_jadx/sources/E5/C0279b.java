package E5;

/* JADX INFO: renamed from: E5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0279b implements p194x6.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E5.C0279b f2992i = new E5.C0279b(0);
    public static final E5.C0279b j = new E5.C0279b(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E5.C0279b f2993k = new E5.C0279b(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final E5.C0279b f2994l = new E5.C0279b(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final E5.C0279b f2995m = new E5.C0279b(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2996h;

    public /* synthetic */ C0279b(int i3) {
        this.f2996h = i3;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f2996h) {
            case 0:
                p020c0.C1700q c1700q = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReached"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            case 1:
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReachedMessage"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
            case 2:
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.removePlaylistTitle"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q3, 0, 0, 131070);
                }
                break;
            case 3:
                p020c0.C1700q c1700q4 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReached"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q4, 0, 0, 131070);
                }
                break;
            default:
                p020c0.C1700q c1700q5 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q5.F()) {
                    c1700q5.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReachedMessage"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q5, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
