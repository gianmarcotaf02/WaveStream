package W6;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p035d7.h f10660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Collection f10661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10662c;

    public m(p035d7.h hVar, java.util.Collection qualifierApplicabilityTypes, boolean z6) {
        kotlin.jvm.internal.m.e(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f10660a = hVar;
        this.f10661b = qualifierApplicabilityTypes;
        this.f10662c = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W6.m)) {
            return false;
        }
        W6.m mVar = (W6.m) obj;
        return kotlin.jvm.internal.m.a(this.f10660a, mVar.f10660a) && kotlin.jvm.internal.m.a(this.f10661b, mVar.f10661b) && this.f10662c == mVar.f10662c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f10662c) + ((this.f10661b.hashCode() + (this.f10660a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f10660a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f10661b);
        sb.append(", definitelyNotNull=");
        return v5.L.a(sb, this.f10662c, ')');
    }

    public m(p035d7.h hVar, java.util.Collection collection) {
        this(hVar, collection, hVar.f21265a == p035d7.g.j);
    }
}
