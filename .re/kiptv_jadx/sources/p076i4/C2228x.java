package p076i4;

/* JADX INFO: renamed from: i4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2228x extends p076i4.O0 implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p068h4.j f22947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p076i4.O0 f22948i;

    public C2228x(p068h4.j jVar, p076i4.O0 o8) {
        this.f22947h = jVar;
        this.f22948i = o8;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        p068h4.j jVar = this.f22947h;
        return this.f22948i.compare(jVar.apply(obj), jVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p076i4.C2228x) {
            p076i4.C2228x c2228x = (p076i4.C2228x) obj;
            if (this.f22947h.equals(c2228x.f22947h) && this.f22948i.equals(c2228x.f22948i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f22947h, this.f22948i});
    }

    public final java.lang.String toString() {
        return this.f22948i + ".onResultOf(" + this.f22947h + ")";
    }
}
