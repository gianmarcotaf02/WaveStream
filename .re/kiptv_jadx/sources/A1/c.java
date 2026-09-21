package A1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.List f128c;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1.c)) {
            return false;
        }
        A1.c cVar = (A1.c) obj;
        return java.util.Objects.equals(this.f126a, cVar.f126a) && java.util.Objects.equals(this.f127b, cVar.f127b) && java.util.Objects.equals(this.f128c, cVar.f128c);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f126a, this.f127b, this.f128c);
    }
}
