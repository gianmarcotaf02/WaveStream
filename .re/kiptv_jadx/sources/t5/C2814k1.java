package t5;

/* JADX INFO: renamed from: t5.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2814k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f28251c;

    public C2814k1(java.lang.String id, java.lang.String title, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f28249a = id;
        this.f28250b = title;
        this.f28251c = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2814k1)) {
            return false;
        }
        t5.C2814k1 c2814k1 = (t5.C2814k1) obj;
        return kotlin.jvm.internal.m.a(this.f28249a, c2814k1.f28249a) && kotlin.jvm.internal.m.a(this.f28250b, c2814k1.f28250b) && kotlin.jvm.internal.m.a(this.f28251c, c2814k1.f28251c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f28249a.hashCode() * 31, 31, this.f28250b);
        java.lang.Integer num = this.f28251c;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "TvSidebarEntry(id=" + this.f28249a + ", title=" + this.f28250b + ", count=" + this.f28251c + ")";
    }
}
