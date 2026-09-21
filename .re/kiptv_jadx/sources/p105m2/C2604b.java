package p105m2;

/* JADX INFO: renamed from: m2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2604b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p105m2.C2608f f25271a;

    public void a(p105m2.AbstractC2620s abstractC2620s, p105m2.C2617o c2617o, java.util.ArrayList arrayList) {
        p105m2.C2608f c2608f = this.f25271a;
        if (abstractC2620s != c2608f.f25307v || c2617o == null) {
            if (abstractC2620s == c2608f.f25305t) {
                if (c2617o != null) {
                    c2608f.n(c2608f.f25304s, c2617o);
                }
                c2608f.f25304s.j(arrayList);
                return;
            }
            return;
        }
        p105m2.C2627z c2627z = c2608f.f25306u.f25193a;
        java.lang.String strD = c2617o.d();
        p105m2.A a2 = new p105m2.A(c2627z, strD, c2608f.b(c2627z, strD));
        a2.f(c2617o);
        if (c2608f.f25304s == a2) {
            return;
        }
        c2608f.h(c2608f, a2, c2608f.f25307v, 3, c2608f.f25306u, arrayList);
        c2608f.f25306u = null;
        c2608f.f25307v = null;
    }
}
