package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p154s.P f27091b = new p154s.P(new p154s.b0((p154s.S) null, (p154s.Z) null, (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p154s.b0 f27092a;

    public P(p154s.b0 b0Var) {
        this.f27092a = b0Var;
    }

    public final p154s.P a(p154s.P p2) {
        com.google.common.util.concurrent.D d4 = null;
        p154s.b0 b0Var = p2.f27092a;
        p154s.b0 b0Var2 = this.f27092a;
        p154s.S s9 = b0Var.f27111a;
        if (s9 == null) {
            s9 = b0Var2.f27111a;
        }
        p154s.Z z6 = b0Var.f27112b;
        if (z6 == null) {
            z6 = b0Var2.f27112b;
        }
        p154s.C2739z c2739z = b0Var.f27113c;
        if (c2739z == null) {
            c2739z = b0Var2.f27113c;
        }
        return new p154s.P(new p154s.b0(s9, z6, c2739z, d4, p078i6.C.R0(b0Var2.f27115e, b0Var.f27115e), 32));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p154s.P) && kotlin.jvm.internal.m.a(((p154s.P) obj).f27092a, this.f27092a);
    }

    public final int hashCode() {
        return this.f27092a.hashCode();
    }

    public final java.lang.String toString() {
        if (equals(f27091b)) {
            return "EnterTransition.None";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnterTransition: \nFade - ");
        p154s.b0 b0Var = this.f27092a;
        p154s.S s9 = b0Var.f27111a;
        sb.append(s9 != null ? s9.toString() : null);
        sb.append(",\nSlide - ");
        p154s.Z z6 = b0Var.f27112b;
        sb.append(z6 != null ? z6.toString() : null);
        sb.append(",\nShrink - ");
        p154s.C2739z c2739z = b0Var.f27113c;
        sb.append(c2739z != null ? c2739z.toString() : null);
        sb.append(",\nScale - ");
        sb.append((java.lang.String) null);
        return sb.toString();
    }
}
