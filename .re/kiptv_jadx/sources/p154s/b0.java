package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p154s.S f27111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p154s.Z f27112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p154s.C2739z f27113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f27115e;

    public b0(p154s.S s9, p154s.Z z6, p154s.C2739z c2739z, com.google.common.util.concurrent.D d4, boolean z9, java.util.Map map) {
        this.f27111a = s9;
        this.f27112b = z6;
        this.f27113c = c2739z;
        this.f27114d = z9;
        this.f27115e = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p154s.b0)) {
            return false;
        }
        p154s.b0 b0Var = (p154s.b0) obj;
        return kotlin.jvm.internal.m.a(this.f27111a, b0Var.f27111a) && kotlin.jvm.internal.m.a(this.f27112b, b0Var.f27112b) && kotlin.jvm.internal.m.a(this.f27113c, b0Var.f27113c) && kotlin.jvm.internal.m.a(null, null) && this.f27114d == b0Var.f27114d && kotlin.jvm.internal.m.a(this.f27115e, b0Var.f27115e);
    }

    public final int hashCode() {
        p154s.S s9 = this.f27111a;
        int iHashCode = (s9 == null ? 0 : s9.hashCode()) * 31;
        p154s.Z z6 = this.f27112b;
        int iHashCode2 = (iHashCode + (z6 == null ? 0 : z6.hashCode())) * 31;
        p154s.C2739z c2739z = this.f27113c;
        return this.f27115e.hashCode() + p121o0.p.f((((iHashCode2 + (c2739z == null ? 0 : c2739z.hashCode())) * 31) + 0) * 961, 31, this.f27114d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionData(fade=");
        sb.append(this.f27111a);
        sb.append(", slide=");
        sb.append(this.f27112b);
        sb.append(", changeSize=");
        sb.append(this.f27113c);
        sb.append(", scale=");
        sb.append((java.lang.Object) null);
        sb.append(", veil=null, hold=");
        sb.append(this.f27114d);
        sb.append(", effectsMap=");
        return p121o0.p.r(sb, this.f27115e, ')');
    }

    public /* synthetic */ b0(p154s.S s9, p154s.Z z6, p154s.C2739z c2739z, com.google.common.util.concurrent.D d4, java.util.LinkedHashMap linkedHashMap, int i3) {
        this((i3 & 1) != 0 ? null : s9, (i3 & 2) != 0 ? null : z6, (i3 & 4) != 0 ? null : c2739z, (i3 & 8) != 0 ? null : d4, (i3 & 32) == 0, (i3 & 64) != 0 ? p078i6.x.f23206h : linkedHashMap);
    }
}
