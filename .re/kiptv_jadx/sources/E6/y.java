package E6;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E6.y f3222c = new E6.y(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E6.z f3223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E6.v f3224b;

    public y(E6.z zVar, E6.v vVar) {
        java.lang.String str;
        this.f3223a = zVar;
        this.f3224b = vVar;
        if ((zVar == null) == (vVar == null)) {
            return;
        }
        if (zVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + zVar + " requires type to be specified.";
        }
        throw new java.lang.IllegalArgumentException(str.toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6.y)) {
            return false;
        }
        E6.y yVar = (E6.y) obj;
        return this.f3223a == yVar.f3223a && kotlin.jvm.internal.m.a(this.f3224b, yVar.f3224b);
    }

    public final int hashCode() {
        E6.z zVar = this.f3223a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        E6.v vVar = this.f3224b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        E6.z zVar = this.f3223a;
        int i3 = zVar == null ? -1 : E6.x.f3221a[zVar.ordinal()];
        if (i3 == -1) {
            return "*";
        }
        E6.v vVar = this.f3224b;
        if (i3 == 1) {
            return java.lang.String.valueOf(vVar);
        }
        if (i3 == 2) {
            return "in " + vVar;
        }
        if (i3 != 3) {
            throw new I3.b();
        }
        return "out " + vVar;
    }
}
