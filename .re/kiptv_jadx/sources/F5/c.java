package F5;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0.C0205f f3676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3677c;

    public c(java.lang.String str, D0.C0205f c0205f, java.util.List list) {
        this.f3675a = str;
        this.f3676b = c0205f;
        this.f3677c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F5.c)) {
            return false;
        }
        F5.c cVar = (F5.c) obj;
        return kotlin.jvm.internal.m.a(this.f3675a, cVar.f3675a) && kotlin.jvm.internal.m.a(this.f3676b, cVar.f3676b) && kotlin.jvm.internal.m.a(this.f3677c, cVar.f3677c);
    }

    public final int hashCode() {
        return this.f3677c.hashCode() + ((this.f3676b.hashCode() + (this.f3675a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TvBenefitCategory(id=" + this.f3675a + ", icon=" + this.f3676b + ", benefitIds=" + this.f3677c + ")";
    }
}
