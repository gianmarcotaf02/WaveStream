package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class t extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24794i;

    public t(java.lang.String str) {
        super("Unsupported format: ".concat(str));
        this.f24794i = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p099l5.t) && kotlin.jvm.internal.m.a(this.f24794i, ((p099l5.t) obj).f24794i);
    }

    public final int hashCode() {
        return this.f24794i.hashCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("UnsupportedFormat(format="), this.f24794i, ")");
    }
}
