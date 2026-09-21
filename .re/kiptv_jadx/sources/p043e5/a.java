package p043e5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p043e5.d f21421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f21422d;

    public a(java.lang.String str, java.lang.String str2, p043e5.d dVar) {
        java.util.Set platforms = p043e5.g.f21436a;
        kotlin.jvm.internal.m.e(platforms, "platforms");
        this.f21419a = str;
        this.f21420b = str2;
        this.f21421c = dVar;
        this.f21422d = platforms;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p043e5.a)) {
            return false;
        }
        p043e5.a aVar = (p043e5.a) obj;
        return kotlin.jvm.internal.m.a(this.f21419a, aVar.f21419a) && kotlin.jvm.internal.m.a(this.f21420b, aVar.f21420b) && this.f21421c == aVar.f21421c && kotlin.jvm.internal.m.a(this.f21422d, aVar.f21422d);
    }

    public final int hashCode() {
        return this.f21422d.hashCode() + ((this.f21421c.hashCode() + B2.a.a(this.f21419a.hashCode() * 31, 31, this.f21420b)) * 31);
    }

    public final java.lang.String toString() {
        return "WhatsNewBullet(titleKey=" + this.f21419a + ", descriptionKey=" + this.f21420b + ", category=" + this.f21421c + ", platforms=" + this.f21422d + ")";
    }
}
