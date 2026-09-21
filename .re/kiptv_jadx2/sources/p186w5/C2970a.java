package p186w5;

import O0.C0718g;
import androidx.compose.foundation.layout.b;
import com.google.common.util.concurrent.U;
import com.kiptv.tv.R;
import p000a.a;
import p020c0.C1700q;
import p070h6.A;
import p194x6.m;
import v.AbstractC2901v;

public final class C2970a implements m {

    public static final C2970a f30183i = new C2970a(0);
    public static final C2970a j = new C2970a(1);

    public static final C2970a f30184k = new C2970a(2);

    public static final C2970a f30185l = new C2970a(3);

    public final int f30186h;

    public C2970a(int i3) {
        this.f30186h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30186h) {
            case 0:
                C1700q c1700q = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    U.K(0, c1700q);
                }
                break;
            case 1:
                C1700q c1700q2 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    U.O(0, c1700q2);
                }
                break;
            case 2:
                C1700q c1700q3 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    U.P(0, c1700q3);
                }
                break;
            default:
                C1700q c1700q4 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    AbstractC2901v.b(a.C(R.drawable.trakt_full_logo, c1700q4, 0), "Trakt", b.g(p137q0.m.f26474b, 30), null, C0718g.f7636b, 0.0f, c1700q4, 25016, 104);
                }
                break;
        }
        return A.f22523a;
    }
}
