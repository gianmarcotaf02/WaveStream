package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11692b;

    public O1(java.lang.String str, java.lang.String str2) {
        this.f11691a = str;
        this.f11692b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.O1)) {
            return false;
        }
        Y4.O1 o8 = (Y4.O1) obj;
        return kotlin.jvm.internal.m.a(this.f11691a, o8.f11691a) && kotlin.jvm.internal.m.a(this.f11692b, o8.f11692b);
    }

    public final int hashCode() {
        int iHashCode = this.f11691a.hashCode() * 31;
        java.lang.String str = this.f11692b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XMLTVChannelMeta(displayName=");
        sb.append(this.f11691a);
        sb.append(", iconUrl=");
        return Y6.f.m(sb, this.f11692b, ")");
    }
}
