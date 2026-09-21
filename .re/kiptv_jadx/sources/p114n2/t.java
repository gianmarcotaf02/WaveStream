package p114n2;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f25669l = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f25670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q0.w0 f25671i;
    public p114n2.v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p136q.T f25672k;

    static {
        new java.util.LinkedHashMap();
    }

    public t(p114n2.K navigator) {
        kotlin.jvm.internal.m.e(navigator, "navigator");
        java.util.LinkedHashMap linkedHashMap = p114n2.L.f25609b;
        this.f25670h = com.google.crypto.tink.shaded.protobuf.q0.w(navigator.getClass());
        kotlin.jvm.internal.m.e(this, "destination");
        Q0.w0 w0Var = new Q0.w0();
        w0Var.f8483b = this;
        w0Var.f8484c = new java.util.ArrayList();
        w0Var.f8485d = new java.util.LinkedHashMap();
        this.f25671i = w0Var;
        this.f25672k = new p136q.T(0);
    }

    public final android.os.Bundle d(android.os.Bundle bundle) {
        java.lang.Object obj;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f25671i.f8485d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String name = (java.lang.String) entry.getKey();
            p114n2.C2648g c2648g = (p114n2.C2648g) entry.getValue();
            c2648g.getClass();
            kotlin.jvm.internal.m.e(name, "name");
            if (c2648g.f25620c && (obj = c2648g.f25621d) != null) {
                c2648g.f25618a.e(bundleI, name, obj);
            }
        }
        if (bundle != null) {
            bundleI.putAll(bundle);
            for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                java.lang.String name2 = (java.lang.String) entry2.getKey();
                p114n2.C2648g c2648g2 = (p114n2.C2648g) entry2.getValue();
                c2648g2.getClass();
                kotlin.jvm.internal.m.e(name2, "name");
                p114n2.I i3 = c2648g2.f25618a;
                if (c2648g2.f25619b || !bundleI.containsKey(name2) || !com.google.crypto.tink.shaded.protobuf.q0.B(name2, bundleI)) {
                    try {
                        i3.a(name2, bundleI);
                    } catch (java.lang.IllegalStateException unused) {
                    }
                }
                java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Wrong argument type for '", name2, "' in argument savedState. ");
                sbQ.append(i3.b());
                sbQ.append(" expected.");
                throw new java.lang.IllegalArgumentException(sbQ.toString().toString());
            }
        }
        return bundleI;
    }

    public final java.util.Map e() {
        return p078i6.C.Y0((java.util.LinkedHashMap) this.f25671i.f8485d);
    }

    public boolean equals(java.lang.Object obj) {
        boolean z6;
        boolean z9;
        if (this != obj) {
            if (obj != null && (obj instanceof p114n2.t)) {
                Q0.w0 w0Var = this.f25671i;
                java.util.ArrayList arrayList = (java.util.ArrayList) w0Var.f8484c;
                p114n2.t tVar = (p114n2.t) obj;
                Q0.w0 w0Var2 = tVar.f25671i;
                boolean zA = kotlin.jvm.internal.m.a(arrayList, (java.util.ArrayList) w0Var2.f8484c);
                p136q.T t9 = this.f25672k;
                int iG = t9.g();
                p136q.T t10 = tVar.f25672k;
                if (iG != t10.g()) {
                    z6 = false;
                    break;
                }
                java.util.Iterator it = ((N7.a) N7.o.g0(new p136q.U(t9))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    int iIntValue = ((java.lang.Number) it.next()).intValue();
                    if (!kotlin.jvm.internal.m.a(t9.d(iIntValue), t10.d(iIntValue))) {
                        z6 = false;
                        break;
                    }
                }
                if (e().size() != tVar.e().size()) {
                    z9 = false;
                    break;
                }
                java.util.Iterator it2 = ((java.lang.Iterable) p078i6.o.Y0(e().entrySet()).f7463b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z9 = true;
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                    if (!tVar.e().containsKey(entry.getKey()) || !kotlin.jvm.internal.m.a(tVar.e().get(entry.getKey()), entry.getValue())) {
                        z9 = false;
                        break;
                    }
                }
                if (w0Var.f8482a != w0Var2.f8482a || !kotlin.jvm.internal.m.a((java.lang.String) w0Var.f8486e, (java.lang.String) w0Var2.f8486e) || !zA || !z6 || !z9) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Q0.w0 w0Var = this.f25671i;
        int i3 = w0Var.f8482a * 31;
        java.lang.String str = (java.lang.String) w0Var.f8486e;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        java.util.Iterator it = ((java.util.ArrayList) w0Var.f8484c).iterator();
        while (it.hasNext()) {
            iHashCode = (((p114n2.r) it.next()).f25655a.hashCode() + (iHashCode * 31)) * 961;
        }
        p136q.T t9 = this.f25672k;
        kotlin.jvm.internal.m.e(t9, "<this>");
        if (t9.g() > 0) {
            t9.h(0).getClass();
            throw new java.lang.ClassCastException();
        }
        for (java.lang.String str2 : e().keySet()) {
            int iA = B2.a.a(iHashCode * 31, 31, str2);
            java.lang.Object obj = e().get(str2);
            iHashCode = iA + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public p114n2.s n(j1.l lVar) {
        boolean zD;
        O7.o oVar;
        O7.m mVarC;
        Q0.w0 w0Var = this.f25671i;
        w0Var.getClass();
        java.util.ArrayList<p114n2.r> arrayList = (java.util.ArrayList) w0Var.f8484c;
        if (arrayList.isEmpty()) {
            return null;
        }
        p114n2.s sVar = null;
        for (p114n2.r rVar : arrayList) {
            rVar.getClass();
            p070h6.p pVar = rVar.f25658d;
            O7.o oVar2 = (O7.o) pVar.getValue();
            android.net.Uri uri = (android.net.Uri) lVar.f23899i;
            if (oVar2 == null) {
                zD = true;
            } else if (uri == null) {
                zD = false;
            } else {
                O7.o oVar3 = (O7.o) pVar.getValue();
                kotlin.jvm.internal.m.b(oVar3);
                zD = oVar3.d(uri.toString());
            }
            if (zD) {
                java.util.LinkedHashMap arguments = (java.util.LinkedHashMap) w0Var.f8485d;
                android.os.Bundle bundleD = uri != null ? rVar.d(uri, arguments) : null;
                int iB = rVar.b(uri);
                java.lang.String str = (java.lang.String) lVar.j;
                boolean z6 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z6) {
                        kotlin.jvm.internal.m.e(arguments, "arguments");
                        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
                        if (uri != null && (oVar = (O7.o) pVar.getValue()) != null && (mVarC = oVar.c(uri.toString())) != null) {
                            rVar.e(mVarC, bundleI, arguments);
                            if (((java.lang.Boolean) rVar.f25659e.getValue()).booleanValue()) {
                                rVar.f(uri, bundleI, arguments);
                            }
                        }
                        if (com.google.crypto.tink.shaded.protobuf.AbstractC1909d.c0(arguments, new p114n2.p(1, bundleI)).isEmpty()) {
                        }
                    }
                }
                p114n2.s sVar2 = new p114n2.s((p114n2.t) w0Var.f8483b, bundleD, rVar.f25664l, iB, z6);
                if (sVar == null || sVar2.compareTo(sVar) > 0) {
                    sVar = sVar2;
                }
            }
        }
        return sVar;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        Q0.w0 w0Var = this.f25671i;
        w0Var.getClass();
        sb.append(java.lang.Integer.toHexString(w0Var.f8482a));
        sb.append(")");
        java.lang.String str = (java.lang.String) w0Var.f8486e;
        if (str != null && !O7.q.N0(str)) {
            sb.append(" route=");
            sb.append((java.lang.String) w0Var.f8486e);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
