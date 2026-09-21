package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class z implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f17917h;

    public z(java.lang.String str) {
        this.f17917h = str;
    }

    public static int b(byte b9) {
        return (b9 >> 5) & 7;
    }

    public final int a() {
        return b((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        p014b4.z zVar = (p014b4.z) obj;
        int iA = zVar.a();
        int iB = b((byte) 96);
        if (iB != iA) {
            return iB - zVar.a();
        }
        java.lang.String str = zVar.f17917h;
        int length = str.length();
        java.lang.String str2 = this.f17917h;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p014b4.z.class == obj.getClass()) {
            return this.f17917h.equals(((p014b4.z) obj).f17917h);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(b((byte) 96)), this.f17917h});
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("\""), this.f17917h, "\"");
    }
}
