package Y2;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11396a = 0;

    static {
        int i3 = Y2.Q.f11397f;
    }

    public static java.lang.String a(java.lang.Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            java.lang.String simpleName = exc.getClass().getSimpleName();
            java.lang.String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            java.lang.String str = simpleName + ":" + message;
            int i3 = com.google.android.gms.internal.play_billing.AbstractC1872t.f19388a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.C1845h1 b(int i3, int i9, Y2.C1040j c1040j, java.lang.String str, com.google.android.gms.internal.play_billing.o1 o1Var) {
        try {
            com.google.android.gms.internal.play_billing.C1857l1 c1857l1Q = com.google.android.gms.internal.play_billing.C1860m1.q();
            c1857l1Q.e(c1040j.f11477a);
            java.lang.String str2 = c1040j.f11479c;
            c1857l1Q.c();
            com.google.android.gms.internal.play_billing.C1860m1.s((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.f19393i, str2);
            int i10 = c1040j.f11478b;
            if (i10 != 0) {
                c1857l1Q.c();
                com.google.android.gms.internal.play_billing.C1860m1.u((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.f19393i, i10);
            }
            if (i3 != 0) {
                c1857l1Q.d(i3);
            }
            if (str != null) {
                c1857l1Q.c();
                com.google.android.gms.internal.play_billing.C1860m1.r((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.f19393i, str);
            }
            com.google.android.gms.internal.play_billing.C1842g1 c1842g1S = com.google.android.gms.internal.play_billing.C1845h1.s();
            c1842g1S.d(c1857l1Q);
            c1842g1S.f(i9);
            if (!o1Var.equals(com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED)) {
                c1842g1S.c();
                com.google.android.gms.internal.play_billing.C1845h1.v((com.google.android.gms.internal.play_billing.C1845h1) c1842g1S.f19393i, o1Var);
            }
            return (com.google.android.gms.internal.play_billing.C1845h1) c1842g1S.a();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.C1854k1 c(int i3, com.google.android.gms.internal.play_billing.o1 o1Var) {
        try {
            com.google.android.gms.internal.play_billing.C1848i1 c1848i1Q = com.google.android.gms.internal.play_billing.C1854k1.q();
            c1848i1Q.c();
            com.google.android.gms.internal.play_billing.C1854k1.p((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, i3);
            if (!o1Var.equals(com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED)) {
                c1848i1Q.c();
                com.google.android.gms.internal.play_billing.C1854k1.s((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, o1Var);
            }
            return (com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.a();
        } catch (java.lang.Exception e6) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }
}
