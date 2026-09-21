package t5;

/* JADX INFO: renamed from: t5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2785b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f28130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f28132e;

    public C2785b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, boolean z6) {
        this.f28128a = str;
        this.f28129b = str2;
        this.f28130c = str3;
        this.f28131d = z6;
        this.f28132e = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2785b)) {
            return false;
        }
        t5.C2785b c2785b = (t5.C2785b) obj;
        return this.f28128a.equals(c2785b.f28128a) && kotlin.jvm.internal.m.a(this.f28129b, c2785b.f28129b) && this.f28130c.equals(c2785b.f28130c) && this.f28131d == c2785b.f28131d && this.f28132e.equals(c2785b.f28132e);
    }

    public final int hashCode() {
        int iHashCode = this.f28128a.hashCode() * 31;
        java.lang.String str = this.f28129b;
        return this.f28132e.hashCode() + p121o0.p.f(B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f28130c), 31, this.f28131d);
    }

    public final java.lang.String toString() {
        return "AvatarGroup(id=" + this.f28128a + ", titleKey=" + this.f28129b + ", titleLiteral=" + this.f28130c + ", isPremium=" + this.f28131d + ", names=" + this.f28132e + ")";
    }
}
