package D5;

/* JADX INFO: renamed from: D5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0245c extends D5.AbstractC0253g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2271a;

    public C0245c(java.lang.String str) {
        this.f2271a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D5.C0245c) && kotlin.jvm.internal.m.a(this.f2271a, ((D5.C0245c) obj).f2271a);
    }

    public final int hashCode() {
        return this.f2271a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Header(label="), this.f2271a, ")");
    }
}
