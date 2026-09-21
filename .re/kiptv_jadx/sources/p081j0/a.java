package p081j0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23867a;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p081j0.a) && this.f23867a == ((p081j0.a) obj).f23867a;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f23867a);
    }

    public final java.lang.String toString() {
        return Y6.f.j(new java.lang.StringBuilder("DeltaCounter(count="), this.f23867a, ')');
    }
}
