package v5;

/* JADX INFO: renamed from: v5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2933j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.EPGTMDBMatchResult f29526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.AbstractC1954n f29527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29528d;

    public C2933j(boolean z6, com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult, com.kiptv.core.model.AbstractC1954n abstractC1954n, boolean z9) {
        this.f29525a = z6;
        this.f29526b = ePGTMDBMatchResult;
        this.f29527c = abstractC1954n;
        this.f29528d = z9;
    }

    public static v5.C2933j a(v5.C2933j c2933j, boolean z6, com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult, com.kiptv.core.model.AbstractC1954n abstractC1954n, boolean z9, int i3) {
        if ((i3 & 1) != 0) {
            z6 = c2933j.f29525a;
        }
        if ((i3 & 2) != 0) {
            ePGTMDBMatchResult = c2933j.f29526b;
        }
        if ((i3 & 4) != 0) {
            abstractC1954n = c2933j.f29527c;
        }
        if ((i3 & 8) != 0) {
            z9 = c2933j.f29528d;
        }
        c2933j.getClass();
        return new v5.C2933j(z6, ePGTMDBMatchResult, abstractC1954n, z9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5.C2933j)) {
            return false;
        }
        v5.C2933j c2933j = (v5.C2933j) obj;
        return this.f29525a == c2933j.f29525a && kotlin.jvm.internal.m.a(this.f29526b, c2933j.f29526b) && kotlin.jvm.internal.m.a(this.f29527c, c2933j.f29527c) && this.f29528d == c2933j.f29528d;
    }

    public final int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.f29525a) * 31;
        com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult = this.f29526b;
        int iHashCode2 = (iHashCode + (ePGTMDBMatchResult == null ? 0 : ePGTMDBMatchResult.hashCode())) * 31;
        com.kiptv.core.model.AbstractC1954n abstractC1954n = this.f29527c;
        return java.lang.Boolean.hashCode(this.f29528d) + ((iHashCode2 + (abstractC1954n != null ? abstractC1954n.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "State(isLoadingTmdb=" + this.f29525a + ", tmdbMatch=" + this.f29526b + ", tmdbDetail=" + this.f29527c + ", hasReminder=" + this.f29528d + ")";
    }
}
