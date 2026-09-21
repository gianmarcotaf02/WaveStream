package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p068h4.t f22509b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p068h4.b f22508a = p068h4.b.f22488m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22510c = androidx.media3.common.util.Log.LOG_LEVEL_OFF;

    public u(p068h4.t tVar) {
        this.f22509b = tVar;
    }

    public static p068h4.u a(char c9) {
        return new p068h4.u(new p020c0.C1704s0(7, new p068h4.e(c9, 0)));
    }

    public static p068h4.u b(java.lang.String str) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? a(str.charAt(0)) : new p068h4.u(new N6.A(str, 4));
    }

    public final java.util.List c(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator itL = this.f22509b.l(this, charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            p068h4.s sVar = (p068h4.s) itL;
            if (!sVar.hasNext()) {
                return java.util.Collections.unmodifiableList(arrayList);
            }
            arrayList.add((java.lang.String) sVar.next());
        }
    }
}
