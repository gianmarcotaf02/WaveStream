package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f13876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f13877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f13878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13879d;

    public S2(int i3, java.lang.String str, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f13876a = str;
        this.f13877b = arrayList;
        this.f13878c = arrayList2;
        this.f13879d = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.S2)) {
            return false;
        }
        p005a5.S2 s9 = (p005a5.S2) obj;
        return kotlin.jvm.internal.m.a(this.f13876a, s9.f13876a) && this.f13877b.equals(s9.f13877b) && this.f13878c.equals(s9.f13878c) && this.f13879d == s9.f13879d;
    }

    public final int hashCode() {
        java.lang.String str = this.f13876a;
        return java.lang.Integer.hashCode(this.f13879d) + ((this.f13878c.hashCode() + ((this.f13877b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndexInput(playlistId=");
        sb.append(this.f13876a);
        sb.append(", movies=");
        sb.append(this.f13877b);
        sb.append(", series=");
        sb.append(this.f13878c);
        sb.append(", generation=");
        return Y6.f.k(sb, this.f13879d, ")");
    }
}
