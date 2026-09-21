package H3;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4016c;

    public z(java.lang.String str, boolean z6) {
        H3.q.e(str);
        this.f4014a = str;
        H3.q.e("com.google.android.gms");
        this.f4015b = "com.google.android.gms";
        this.f4016c = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H3.z)) {
            return false;
        }
        H3.z zVar = (H3.z) obj;
        return H3.q.j(this.f4014a, zVar.f4014a) && H3.q.j(this.f4015b, zVar.f4015b) && H3.q.j(null, null) && this.f4016c == zVar.f4016c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f4014a, this.f4015b, null, 4225, java.lang.Boolean.valueOf(this.f4016c)});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f4014a;
        if (str != null) {
            return str;
        }
        H3.q.g(null);
        throw null;
    }
}
