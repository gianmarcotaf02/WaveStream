package L0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7040b;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0.a)) {
            return false;
        }
        L0.a aVar = (L0.a) obj;
        return this.f7039a == aVar.f7039a && java.lang.Float.compare(this.f7040b, aVar.f7040b) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f7040b) + (java.lang.Long.hashCode(this.f7039a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataPointAtTime(time=");
        sb.append(this.f7039a);
        sb.append(", dataPoint=");
        return p121o0.p.q(sb, this.f7040b, ')');
    }
}
