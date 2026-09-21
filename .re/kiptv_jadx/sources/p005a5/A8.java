package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class A8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f13146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f13147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f13148c;

    public A8(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f13146a = arrayList;
        this.f13147b = arrayList2;
        this.f13148c = arrayList3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.A8)) {
            return false;
        }
        p005a5.A8 a9 = (p005a5.A8) obj;
        return this.f13146a.equals(a9.f13146a) && this.f13147b.equals(a9.f13147b) && this.f13148c.equals(a9.f13148c);
    }

    public final int hashCode() {
        return this.f13148c.hashCode() + ((this.f13147b.hashCode() + (this.f13146a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TraktImportDiff(inserts=" + this.f13146a + ", promotions=" + this.f13147b + ", traktFlags=" + this.f13148c + ")";
    }
}
