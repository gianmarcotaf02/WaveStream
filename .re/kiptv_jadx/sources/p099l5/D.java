package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f24767c;

    public D(int i3, java.lang.String str, java.lang.String str2) {
        this.f24765a = i3;
        this.f24766b = str;
        this.f24767c = str2;
    }

    public final java.lang.String a() {
        java.lang.String strC = p034d5.e.c(this.f24766b, this.f24767c);
        return strC == null ? com.google.android.gms.internal.play_billing.M0.l(this.f24765a + 1, "Subtitle ") : strC;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.D)) {
            return false;
        }
        p099l5.D d4 = (p099l5.D) obj;
        return this.f24765a == d4.f24765a && kotlin.jvm.internal.m.a(this.f24766b, d4.f24766b) && kotlin.jvm.internal.m.a(this.f24767c, d4.f24767c);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f24765a) * 31;
        java.lang.String str = this.f24766b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f24767c;
        return p121o0.p.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubtitleTrack(id=");
        sb.append(this.f24765a);
        sb.append(", language=");
        sb.append(this.f24766b);
        sb.append(", title=");
        return Y6.f.m(sb, this.f24767c, ", isExternal=false, externalFileUrl=null)");
    }
}
