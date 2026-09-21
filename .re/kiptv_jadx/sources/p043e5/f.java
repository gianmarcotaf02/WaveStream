package p043e5;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f21434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f21435c;

    public f(java.util.List list) {
        java.util.Set platforms = p043e5.g.f21436a;
        kotlin.jvm.internal.m.e(platforms, "platforms");
        this.f21433a = "whatsNew.v3_0.headline.title";
        this.f21434b = list;
        this.f21435c = platforms;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p043e5.f)) {
            return false;
        }
        p043e5.f fVar = (p043e5.f) obj;
        return kotlin.jvm.internal.m.a(this.f21433a, fVar.f21433a) && kotlin.jvm.internal.m.a(this.f21434b, fVar.f21434b) && kotlin.jvm.internal.m.a(this.f21435c, fVar.f21435c);
    }

    public final int hashCode() {
        return this.f21435c.hashCode() + B2.a.b(this.f21433a.hashCode() * 31, 31, this.f21434b);
    }

    public final java.lang.String toString() {
        return "WhatsNewHeadline(titleKey=" + this.f21433a + ", subtitleKeys=" + this.f21434b + ", platforms=" + this.f21435c + ")";
    }
}
