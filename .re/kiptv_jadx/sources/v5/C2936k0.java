package v5;

/* JADX INFO: renamed from: v5.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2936k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f29532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f29533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f29534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f29535d;

    public C2936k0(java.util.List channels, java.util.List categories, java.util.Map byCategory, java.util.Map groupMap) {
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(byCategory, "byCategory");
        kotlin.jvm.internal.m.e(groupMap, "groupMap");
        this.f29532a = channels;
        this.f29533b = categories;
        this.f29534c = byCategory;
        this.f29535d = groupMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5.C2936k0)) {
            return false;
        }
        v5.C2936k0 c2936k0 = (v5.C2936k0) obj;
        return kotlin.jvm.internal.m.a(this.f29532a, c2936k0.f29532a) && kotlin.jvm.internal.m.a(this.f29533b, c2936k0.f29533b) && kotlin.jvm.internal.m.a(this.f29534c, c2936k0.f29534c) && kotlin.jvm.internal.m.a(this.f29535d, c2936k0.f29535d);
    }

    public final int hashCode() {
        return this.f29535d.hashCode() + B2.a.c(B2.a.b(this.f29532a.hashCode() * 31, 31, this.f29533b), 31, this.f29534c);
    }

    public final java.lang.String toString() {
        return "EpgContent(channels=" + this.f29532a + ", categories=" + this.f29533b + ", byCategory=" + this.f29534c + ", groupMap=" + this.f29535d + ")";
    }
}
