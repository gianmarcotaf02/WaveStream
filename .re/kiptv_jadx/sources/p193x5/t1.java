package p193x5;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f31646c;

    public t1(java.lang.String key, java.lang.String name, java.util.Set set) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(name, "name");
        this.f31644a = key;
        this.f31645b = name;
        this.f31646c = set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.t1)) {
            return false;
        }
        p193x5.t1 t1Var = (p193x5.t1) obj;
        return kotlin.jvm.internal.m.a(this.f31644a, t1Var.f31644a) && kotlin.jvm.internal.m.a(this.f31645b, t1Var.f31645b) && kotlin.jvm.internal.m.a(this.f31646c, t1Var.f31646c);
    }

    public final int hashCode() {
        return this.f31646c.hashCode() + B2.a.a(this.f31644a.hashCode() * 31, 31, this.f31645b);
    }

    public final java.lang.String toString() {
        return "TvLiveTagSection(key=" + this.f31644a + ", name=" + this.f31645b + ", contentIds=" + this.f31646c + ")";
    }
}
