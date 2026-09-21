package p099l5;

/* JADX INFO: renamed from: l5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2548a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f24769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f24770c;

    public C2548a(int i3, java.lang.String str, java.lang.String str2) {
        this.f24768a = i3;
        this.f24769b = str;
        this.f24770c = str2;
    }

    public final java.lang.String a() {
        java.lang.Object obj = p034d5.e.f21242a;
        java.lang.String strC = p034d5.e.c(this.f24769b, this.f24770c);
        return strC == null ? com.google.android.gms.internal.play_billing.M0.l(this.f24768a + 1, "Audio ") : strC;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.C2548a)) {
            return false;
        }
        p099l5.C2548a c2548a = (p099l5.C2548a) obj;
        return this.f24768a == c2548a.f24768a && kotlin.jvm.internal.m.a(this.f24769b, c2548a.f24769b) && kotlin.jvm.internal.m.a(this.f24770c, c2548a.f24770c);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f24768a) * 31;
        java.lang.String str = this.f24769b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f24770c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioTrack(id=");
        sb.append(this.f24768a);
        sb.append(", language=");
        sb.append(this.f24769b);
        sb.append(", title=");
        return Y6.f.m(sb, this.f24770c, ")");
    }
}
