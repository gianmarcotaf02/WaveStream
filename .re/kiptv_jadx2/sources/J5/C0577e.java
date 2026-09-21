package J5;

import p020c0.C1700q;

public final class C0577e implements p194x6.m {

    public static final C0577e f6380i = new C0577e(0);
    public static final C0577e j = new C0577e(1);

    public static final C0577e f6381k = new C0577e(2);

    public static final C0577e f6382l = new C0577e(3);

    public static final C0577e f6383m = new C0577e(4);

    public static final C0577e f6384n = new C0577e(5);

    public final int f6385h;

    public C0577e(int i3) {
        this.f6385h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6385h) {
            case 0:
                C1700q c1700q = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("settings.openSubtitles.logOut"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            case 1:
                C1700q c1700q2 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("settings.openSubtitles.logoutConfirm"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
            case 2:
                C1700q c1700q3 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.unlink"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q3, 0, 0, 131070);
                }
                break;
            case 3:
                C1700q c1700q4 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.unlinkConfirm"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q4, 0, 0, 131070);
                }
                break;
            case 4:
                C1700q c1700q5 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q5.F()) {
                    c1700q5.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.watchlistFullTitle"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q5, 0, 0, 131070);
                }
                break;
            default:
                C1700q c1700q6 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q6.F()) {
                    c1700q6.W();
                } else {
                    Z.K0.b(p015b5.u.a("trakt.watchlistFull"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q6, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
