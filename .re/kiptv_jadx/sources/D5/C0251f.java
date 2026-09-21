package D5;

/* JADX INFO: renamed from: D5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0251f extends D5.AbstractC0253g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f2288c;

    public C0251f(java.lang.String str, java.lang.String currentValue, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(currentValue, "currentValue");
        this.f2286a = str;
        this.f2287b = currentValue;
        this.f2288c = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5.C0251f)) {
            return false;
        }
        D5.C0251f c0251f = (D5.C0251f) obj;
        return this.f2286a.equals(c0251f.f2286a) && kotlin.jvm.internal.m.a(this.f2287b, c0251f.f2287b) && this.f2288c.equals(c0251f.f2288c);
    }

    public final int hashCode() {
        return this.f2288c.hashCode() + B2.a.a(this.f2286a.hashCode() * 31, 31, this.f2287b);
    }

    public final java.lang.String toString() {
        return "Submenu(label=" + this.f2286a + ", currentValue=" + this.f2287b + ", options=" + this.f2288c + ")";
    }
}
