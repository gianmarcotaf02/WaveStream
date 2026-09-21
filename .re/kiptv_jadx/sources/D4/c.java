package D4;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f2132b;

    public c(java.lang.String str, java.util.Map map) {
        this.f2131a = str;
        this.f2132b = map;
    }

    public static D4.c a(java.lang.String str) {
        return new D4.c(str, java.util.Collections.EMPTY_MAP);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D4.c)) {
            return false;
        }
        D4.c cVar = (D4.c) obj;
        return this.f2131a.equals(cVar.f2131a) && this.f2132b.equals(cVar.f2132b);
    }

    public final int hashCode() {
        return this.f2132b.hashCode() + (this.f2131a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "FieldDescriptor{name=" + this.f2131a + ", properties=" + this.f2132b.values() + "}";
    }
}
