package p105m2;

/* JADX INFO: renamed from: m2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2618p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f25350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p105m2.C2623v f25351b;

    public C2618p(p105m2.C2623v c2623v, boolean z6) {
        if (c2623v == null) {
            throw new java.lang.IllegalArgumentException("selector must not be null");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        this.f25350a = bundle;
        this.f25351b = c2623v;
        bundle.putBundle("selector", c2623v.f25371a);
        bundle.putBoolean("activeScan", z6);
    }

    public final void a() {
        if (this.f25351b == null) {
            android.os.Bundle bundle = this.f25350a.getBundle("selector");
            p105m2.C2623v c2623v = null;
            if (bundle != null) {
                c2623v = new p105m2.C2623v(bundle, null);
            } else {
                p105m2.C2623v c2623v2 = p105m2.C2623v.f25370c;
            }
            this.f25351b = c2623v;
            if (c2623v == null) {
                this.f25351b = p105m2.C2623v.f25370c;
            }
        }
    }

    public final boolean b() {
        return this.f25350a.getBoolean("activeScan");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p105m2.C2618p) {
            p105m2.C2618p c2618p = (p105m2.C2618p) obj;
            a();
            p105m2.C2623v c2623v = this.f25351b;
            c2618p.a();
            if (c2623v.equals(c2618p.f25351b) && b() == c2618p.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (this.f25351b.hashCode() ^ (b() ? 1 : 0)) == true ? 1 : 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.f25351b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        p105m2.C2623v c2623v = this.f25351b;
        c2623v.a();
        return com.google.android.gms.internal.play_billing.M0.o(sb, !c2623v.f25372b.contains(null), " }");
    }
}
