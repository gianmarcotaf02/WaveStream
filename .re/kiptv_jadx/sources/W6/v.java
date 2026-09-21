package W6;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W6.B f10683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W6.B f10684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f10685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10686d;

    public v(W6.B b9, W6.B b10) {
        p078i6.x xVar = p078i6.x.f23206h;
        this.f10683a = b9;
        this.f10684b = b10;
        this.f10685c = xVar;
        com.google.common.util.concurrent.D.B(new A7.k(22, this));
        W6.B b11 = W6.B.IGNORE;
        this.f10686d = b9 == b11 && b10 == b11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W6.v)) {
            return false;
        }
        W6.v vVar = (W6.v) obj;
        return this.f10683a == vVar.f10683a && this.f10684b == vVar.f10684b && kotlin.jvm.internal.m.a(this.f10685c, vVar.f10685c);
    }

    public final int hashCode() {
        int iHashCode = this.f10683a.hashCode() * 31;
        W6.B b9 = this.f10684b;
        return this.f10685c.hashCode() + ((iHashCode + (b9 == null ? 0 : b9.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.f10683a);
        sb.append(", migrationLevel=");
        sb.append(this.f10684b);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        return p121o0.p.r(sb, this.f10685c, ')');
    }
}
