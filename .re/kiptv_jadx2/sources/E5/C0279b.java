package E5;

import p020c0.C1700q;

public final class C0279b implements p194x6.m {

    public static final C0279b f2992i = new C0279b(0);
    public static final C0279b j = new C0279b(1);

    public static final C0279b f2993k = new C0279b(2);

    public static final C0279b f2994l = new C0279b(3);

    public static final C0279b f2995m = new C0279b(4);

    public final int f2996h;

    public C0279b(int i3) {
        this.f2996h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2996h) {
            case 0:
                C1700q c1700q = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReached"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            case 1:
                C1700q c1700q2 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReachedMessage"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
            case 2:
                C1700q c1700q3 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.removePlaylistTitle"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q3, 0, 0, 131070);
                }
                break;
            case 3:
                C1700q c1700q4 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReached"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q4, 0, 0, 131070);
                }
                break;
            default:
                C1700q c1700q5 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q5.F()) {
                    c1700q5.W();
                } else {
                    Z.K0.b(p015b5.u.a("playlist.limitReachedMessage"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q5, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
