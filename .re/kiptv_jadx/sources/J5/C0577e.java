package J5;

/* JADX INFO: renamed from: J5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0577e implements p194x6.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J5.C0577e f6380i = new J5.C0577e(0);
    public static final J5.C0577e j = new J5.C0577e(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final J5.C0577e f6381k = new J5.C0577e(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final J5.C0577e f6382l = new J5.C0577e(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final J5.C0577e f6383m = new J5.C0577e(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final J5.C0577e f6384n = new J5.C0577e(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6385h;

    public /* synthetic */ C0577e(int i3) {
        this.f6385h = i3;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f6385h) {
            case 0:
                p020c0.C1700q c1700q = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("settings.openSubtitles.logOut"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            case 1:
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("settings.openSubtitles.logoutConfirm"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
            case 2:
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.unlink"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q3, 0, 0, 131070);
                }
                break;
            case 3:
                p020c0.C1700q c1700q4 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.unlinkConfirm"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q4, 0, 0, 131070);
                }
                break;
            case 4:
                p020c0.C1700q c1700q5 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q5.F()) {
                    c1700q5.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.watchlistFullTitle"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q5, 0, 0, 131070);
                }
                break;
            default:
                p020c0.C1700q c1700q6 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q6.F()) {
                    c1700q6.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.watchlistFull"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q6, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
