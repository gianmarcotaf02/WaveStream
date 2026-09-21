package R4;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Long f9066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final R4.f f9067f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9068h;

    public e(java.lang.String id, java.lang.String str, java.lang.String str2, long j, java.lang.Long l2, R4.f status, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(status, "status");
        this.f9062a = id;
        this.f9063b = str;
        this.f9064c = str2;
        this.f9065d = j;
        this.f9066e = l2;
        this.f9067f = status;
        this.g = str3;
        this.f9068h = str4;
    }

    public static R4.e a(R4.e eVar, java.lang.Long l2, R4.f fVar, java.lang.String str, java.lang.String str2, int i3) {
        java.lang.String str3 = eVar.f9063b;
        java.lang.String str4 = eVar.f9064c;
        if ((i3 & 64) != 0) {
            str = eVar.g;
        }
        java.lang.String str5 = str;
        if ((i3 & 128) != 0) {
            str2 = eVar.f9068h;
        }
        java.lang.String id = eVar.f9062a;
        kotlin.jvm.internal.m.e(id, "id");
        return new R4.e(id, str3, str4, eVar.f9065d, l2, fVar, str5, str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R4.e)) {
            return false;
        }
        R4.e eVar = (R4.e) obj;
        return kotlin.jvm.internal.m.a(this.f9062a, eVar.f9062a) && kotlin.jvm.internal.m.a(this.f9063b, eVar.f9063b) && kotlin.jvm.internal.m.a(this.f9064c, eVar.f9064c) && this.f9065d == eVar.f9065d && kotlin.jvm.internal.m.a(this.f9066e, eVar.f9066e) && this.f9067f == eVar.f9067f && kotlin.jvm.internal.m.a(this.g, eVar.g) && kotlin.jvm.internal.m.a(this.f9068h, eVar.f9068h);
    }

    public final int hashCode() {
        int iE = p121o0.p.e(B2.a.a(B2.a.a(this.f9062a.hashCode() * 31, 31, this.f9063b), 31, this.f9064c), 31, this.f9065d);
        java.lang.Long l2 = this.f9066e;
        int iHashCode = (this.f9067f.hashCode() + ((iE + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        java.lang.String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f9068h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingOperation(id=");
        sb.append(this.f9062a);
        sb.append(", name=");
        sb.append(this.f9063b);
        sb.append(", icon=");
        sb.append(this.f9064c);
        sb.append(", startTime=");
        sb.append(this.f9065d);
        sb.append(", endTime=");
        sb.append(this.f9066e);
        sb.append(", status=");
        sb.append(this.f9067f);
        sb.append(", detail=");
        sb.append(this.g);
        sb.append(", errorMessage=");
        return Y6.f.m(sb, this.f9068h, ")");
    }
}
