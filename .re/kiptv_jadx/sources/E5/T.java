package E5;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements E5.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2940b;

    public T(boolean z6, boolean z9) {
        this.f2939a = z6;
        this.f2940b = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5.T)) {
            return false;
        }
        E5.T t9 = (E5.T) obj;
        return this.f2939a == t9.f2939a && this.f2940b == t9.f2940b;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f2940b) + (java.lang.Boolean.hashCode(this.f2939a) * 31);
    }

    public final java.lang.String toString() {
        return "Selected(forceReload=" + this.f2939a + ", epgOnly=" + this.f2940b + ")";
    }
}
