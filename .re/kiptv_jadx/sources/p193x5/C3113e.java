package p193x5;

/* JADX INFO: renamed from: x5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3113e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f31449c;

    public C3113e(java.lang.String id, java.lang.String title, java.util.List groups) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(groups, "groups");
        this.f31447a = id;
        this.f31448b = title;
        this.f31449c = groups;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.C3113e)) {
            return false;
        }
        p193x5.C3113e c3113e = (p193x5.C3113e) obj;
        return kotlin.jvm.internal.m.a(this.f31447a, c3113e.f31447a) && kotlin.jvm.internal.m.a(this.f31448b, c3113e.f31448b) && kotlin.jvm.internal.m.a(this.f31449c, c3113e.f31449c);
    }

    public final int hashCode() {
        return this.f31449c.hashCode() + B2.a.a(this.f31447a.hashCode() * 31, 31, this.f31448b);
    }

    public final java.lang.String toString() {
        return "LiveCarouselRow(id=" + this.f31447a + ", title=" + this.f31448b + ", groups=" + this.f31449c + ")";
    }
}
