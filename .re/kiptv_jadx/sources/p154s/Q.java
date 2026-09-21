package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p154s.Q f27093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p154s.Q f27094c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p154s.b0 f27095a;

    static {
        com.google.common.util.concurrent.D d4 = null;
        java.util.LinkedHashMap linkedHashMap = null;
        p154s.S s9 = null;
        p154s.Z z6 = null;
        p154s.C2739z c2739z = null;
        f27093b = new p154s.Q(new p154s.b0(s9, z6, c2739z, d4, linkedHashMap, 127));
        f27094c = new p154s.Q(new p154s.b0(s9, z6, c2739z, d4, linkedHashMap, 95));
    }

    public Q(p154s.b0 b0Var) {
        this.f27095a = b0Var;
    }

    public final p154s.Q a(p154s.Q q9) {
        p154s.b0 b0Var = q9.f27095a;
        p154s.b0 b0Var2 = this.f27095a;
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
        return new p154s.Q(new p154s.b0(s9, z6, c2739z, (com.google.common.util.concurrent.D) null, b0Var.f27114d || b0Var2.f27114d, p078i6.C.R0(b0Var2.f27115e, b0Var.f27115e)));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p154s.Q) && kotlin.jvm.internal.m.a(((p154s.Q) obj).f27095a, this.f27095a);
    }

    public final int hashCode() {
        return this.f27095a.hashCode();
    }

    public final java.lang.String toString() {
        if (equals(f27093b)) {
            return "ExitTransition.None";
        }
        if (equals(f27094c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitTransition: \nFade - ");
        p154s.b0 b0Var = this.f27095a;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b0Var.f27114d);
        return sb.toString();
    }
}
