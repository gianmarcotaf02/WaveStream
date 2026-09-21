package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f32601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f32602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f32603c;

    public Y(java.lang.String tagKey, java.lang.String title, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(tagKey, "tagKey");
        kotlin.jvm.internal.m.e(title, "title");
        this.f32601a = tagKey;
        this.f32602b = title;
        this.f32603c = arrayList;
    }

    public final java.util.List a() {
        return this.f32603c;
    }

    public final java.lang.String b() {
        return this.f32602b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p208z5.Y)) {
            return false;
        }
        p208z5.Y y = (p208z5.Y) obj;
        return kotlin.jvm.internal.m.a(this.f32601a, y.f32601a) && kotlin.jvm.internal.m.a(this.f32602b, y.f32602b) && this.f32603c.equals(y.f32603c);
    }

    public final int hashCode() {
        return this.f32603c.hashCode() + B2.a.a(this.f32601a.hashCode() * 31, 31, this.f32602b);
    }

    public final java.lang.String toString() {
        return "TvMovieMyListSection(tagKey=" + this.f32601a + ", title=" + this.f32602b + ", items=" + this.f32603c + ")";
    }
}
