package t5;

/* JADX INFO: renamed from: t5.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2833r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f28336c;

    public C2833r0(java.lang.String id, java.lang.String str, java.lang.String title) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f28334a = id;
        this.f28335b = str;
        this.f28336c = title;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2833r0)) {
            return false;
        }
        t5.C2833r0 c2833r0 = (t5.C2833r0) obj;
        return kotlin.jvm.internal.m.a(this.f28334a, c2833r0.f28334a) && kotlin.jvm.internal.m.a(this.f28335b, c2833r0.f28335b) && kotlin.jvm.internal.m.a(this.f28336c, c2833r0.f28336c);
    }

    public final int hashCode() {
        return this.f28336c.hashCode() + B2.a.a(this.f28334a.hashCode() * 31, 31, this.f28335b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvHeroUpcoming(id=");
        sb.append(this.f28334a);
        sb.append(", startTimeText=");
        sb.append(this.f28335b);
        sb.append(", title=");
        return Y6.f.m(sb, this.f28336c, ")");
    }
}
