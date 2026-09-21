package Y2;

import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.C1842g1;
import com.google.android.gms.internal.play_billing.C1845h1;
import com.google.android.gms.internal.play_billing.C1848i1;
import com.google.android.gms.internal.play_billing.C1854k1;
import com.google.android.gms.internal.play_billing.C1857l1;
import com.google.android.gms.internal.play_billing.C1860m1;
import com.google.android.gms.internal.play_billing.o1;

public abstract class P {

    public static final int f11396a = 0;

    static {
        int i3 = Q.f11397f;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i3 = AbstractC1872t.f19388a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC1872t.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static C1845h1 b(int i3, int i9, C1040j c1040j, String str, o1 o1Var) {
        try {
            C1857l1 c1857l1Q = C1860m1.q();
            c1857l1Q.e(c1040j.f11477a);
            String str2 = c1040j.f11479c;
            c1857l1Q.c();
            C1860m1.s((C1860m1) c1857l1Q.f19393i, str2);
            int i10 = c1040j.f11478b;
            if (i10 != 0) {
                c1857l1Q.c();
                C1860m1.u((C1860m1) c1857l1Q.f19393i, i10);
            }
            if (i3 != 0) {
                c1857l1Q.d(i3);
            }
            if (str != null) {
                c1857l1Q.c();
                C1860m1.r((C1860m1) c1857l1Q.f19393i, str);
            }
            C1842g1 c1842g1S = C1845h1.s();
            c1842g1S.d(c1857l1Q);
            c1842g1S.f(i9);
            if (!o1Var.equals(o1.BROADCAST_ACTION_UNSPECIFIED)) {
                c1842g1S.c();
                C1845h1.v((C1845h1) c1842g1S.f19393i, o1Var);
            }
            return (C1845h1) c1842g1S.a();
        } catch (Throwable th) {
            AbstractC1872t.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static C1854k1 c(int i3, o1 o1Var) {
        try {
            C1848i1 c1848i1Q = C1854k1.q();
            c1848i1Q.c();
            C1854k1.p((C1854k1) c1848i1Q.f19393i, i3);
            if (!o1Var.equals(o1.BROADCAST_ACTION_UNSPECIFIED)) {
                c1848i1Q.c();
                C1854k1.s((C1854k1) c1848i1Q.f19393i, o1Var);
            }
            return (C1854k1) c1848i1Q.a();
        } catch (Exception e6) {
            AbstractC1872t.i("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }
}
