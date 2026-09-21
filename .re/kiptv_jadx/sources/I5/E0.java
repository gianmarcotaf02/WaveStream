package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f4723c;

    public E0(java.lang.String tagKey, java.lang.String title, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(tagKey, "tagKey");
        kotlin.jvm.internal.m.e(title, "title");
        this.f4721a = tagKey;
        this.f4722b = title;
        this.f4723c = arrayList;
    }

    public final java.util.List a() {
        return this.f4723c;
    }

    public final java.lang.String b() {
        return this.f4722b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I5.E0)) {
            return false;
        }
        I5.E0 e6 = (I5.E0) obj;
        return kotlin.jvm.internal.m.a(this.f4721a, e6.f4721a) && kotlin.jvm.internal.m.a(this.f4722b, e6.f4722b) && this.f4723c.equals(e6.f4723c);
    }

    public final int hashCode() {
        return this.f4723c.hashCode() + B2.a.a(this.f4721a.hashCode() * 31, 31, this.f4722b);
    }

    public final java.lang.String toString() {
        return "TvSeriesMyListSection(tagKey=" + this.f4721a + ", title=" + this.f4722b + ", items=" + this.f4723c + ")";
    }
}
