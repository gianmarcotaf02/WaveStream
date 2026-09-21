package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMediaRef f13437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f13439c;

    public G6(com.kiptv.core.model.TraktMediaRef traktMediaRef, java.lang.String title, java.lang.String str) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f13437a = traktMediaRef;
        this.f13438b = title;
        this.f13439c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.G6)) {
            return false;
        }
        p005a5.G6 g9 = (p005a5.G6) obj;
        return kotlin.jvm.internal.m.a(this.f13437a, g9.f13437a) && kotlin.jvm.internal.m.a(this.f13438b, g9.f13438b) && kotlin.jvm.internal.m.a(this.f13439c, g9.f13439c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f13437a.hashCode() * 31, 31, this.f13438b);
        java.lang.String str = this.f13439c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Candidate(ref=");
        sb.append(this.f13437a);
        sb.append(", title=");
        sb.append(this.f13438b);
        sb.append(", posterUrl=");
        return Y6.f.m(sb, this.f13439c, ")");
    }
}
