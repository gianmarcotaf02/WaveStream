package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24793i;

    public s(java.lang.String str) {
        super(str);
        this.f24793i = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p099l5.s) && kotlin.jvm.internal.m.a(this.f24793i, ((p099l5.s) obj).f24793i);
    }

    public final int hashCode() {
        return this.f24793i.hashCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Unknown(msg="), this.f24793i, ")");
    }
}
