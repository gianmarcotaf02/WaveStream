package p114n2;

/* JADX INFO: loaded from: classes.dex */
@p114n2.J("navigation")
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln2/x;", "Ln2/K;", "Ln2/v;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class x extends p114n2.K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p114n2.L f25682c;

    public x(p114n2.L navigatorProvider) {
        kotlin.jvm.internal.m.e(navigatorProvider, "navigatorProvider");
        this.f25682c = navigatorProvider;
    }

    @Override // p114n2.K
    public final void d(java.util.List list, p114n2.B b9) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p114n2.C2650i c2650i = (p114n2.C2650i) it.next();
            p114n2.t tVar = c2650i.f25625i;
            kotlin.jvm.internal.m.c(tVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            p114n2.v vVar = (p114n2.v) tVar;
            kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
            a2.f24539h = c2650i.f25630o.a();
            F3.C0371k c0371k = vVar.f25679m;
            int i3 = c0371k.f3600a;
            java.lang.String str = (java.lang.String) c0371k.f3604e;
            if (i3 == 0 && str == null) {
                Q0.w0 w0Var = vVar.f25671i;
                w0Var.getClass();
                java.lang.String superName = java.lang.String.valueOf(w0Var.f8482a);
                kotlin.jvm.internal.m.e(superName, "superName");
                if (((p114n2.v) c0371k.f3601b).f25671i.f8482a == 0) {
                    superName = "the root navigation";
                }
                throw new java.lang.IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            p114n2.t tVarC = str != null ? c0371k.c(str, false) : (p114n2.t) ((p136q.T) c0371k.f3602c).d(i3);
            if (tVarC == null) {
                if (((java.lang.String) c0371k.f3603d) == null) {
                    java.lang.String strValueOf = (java.lang.String) c0371k.f3604e;
                    if (strValueOf == null) {
                        strValueOf = java.lang.String.valueOf(c0371k.f3600a);
                    }
                    c0371k.f3603d = strValueOf;
                }
                java.lang.String str2 = (java.lang.String) c0371k.f3603d;
                kotlin.jvm.internal.m.b(str2);
                throw new java.lang.IllegalArgumentException(Y6.f.h("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                Q0.w0 w0Var2 = tVarC.f25671i;
                if (!str.equals((java.lang.String) w0Var2.f8486e)) {
                    p114n2.s sVarL = w0Var2.l(str);
                    android.os.Bundle bundle = sVarL != null ? sVarL.f25666i : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
                        bundleI.putAll(bundle);
                        android.os.Bundle bundle2 = (android.os.Bundle) a2.f24539h;
                        if (bundle2 != null) {
                            bundleI.putAll(bundle2);
                        }
                        a2.f24539h = bundleI;
                    }
                }
                if (tVarC.e().isEmpty()) {
                    continue;
                } else {
                    java.util.ArrayList arrayListC0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.c0(tVarC.e(), new F.e0(a2, 1));
                    if (!arrayListC0.isEmpty()) {
                        throw new java.lang.IllegalArgumentException(("Cannot navigate to startDestination " + tVarC + ". Missing required arguments [" + arrayListC0 + ']').toString());
                    }
                }
            }
            this.f25682c.b(tVarC.f25670h).d(com.google.common.util.concurrent.P.i0(b().b(tVarC, tVarC.d((android.os.Bundle) a2.f24539h))), b9);
        }
    }

    @Override // p114n2.K
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p114n2.v a() {
        return new p114n2.v(this);
    }
}
