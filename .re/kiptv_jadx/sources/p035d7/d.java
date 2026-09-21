package p035d7;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p035d7.d f21254e = new p035d7.d(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p035d7.g f21255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p035d7.e f21256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21258d;

    public d(p035d7.g gVar, p035d7.e eVar, boolean z6, boolean z9) {
        this.f21255a = gVar;
        this.f21256b = eVar;
        this.f21257c = z6;
        this.f21258d = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p035d7.d)) {
            return false;
        }
        p035d7.d dVar = (p035d7.d) obj;
        return this.f21255a == dVar.f21255a && this.f21256b == dVar.f21256b && this.f21257c == dVar.f21257c && this.f21258d == dVar.f21258d;
    }

    public final int hashCode() {
        p035d7.g gVar = this.f21255a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        p035d7.e eVar = this.f21256b;
        return java.lang.Boolean.hashCode(this.f21258d) + p121o0.p.f((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.f21257c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f21255a);
        sb.append(", mutability=");
        sb.append(this.f21256b);
        sb.append(", definitelyNotNull=");
        sb.append(this.f21257c);
        sb.append(", isNullabilityQualifierForWarning=");
        return v5.L.a(sb, this.f21258d, ')');
    }

    public /* synthetic */ d(p035d7.g gVar, boolean z6) {
        this(gVar, null, z6, false);
    }
}
