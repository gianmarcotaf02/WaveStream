package E6;

public final class y {

    public static final y f3222c = new y(null, null);

    public final z f3223a;

    public final v f3224b;

    public y(z zVar, v vVar) {
        String str;
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
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f3223a == yVar.f3223a && kotlin.jvm.internal.m.a(this.f3224b, yVar.f3224b);
    }

    public final int hashCode() {
        z zVar = this.f3223a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        v vVar = this.f3224b;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        z zVar = this.f3223a;
        int i3 = zVar == null ? -1 : x.f3221a[zVar.ordinal()];
        if (i3 == -1) {
            return "*";
        }
        v vVar = this.f3224b;
        if (i3 == 1) {
            return String.valueOf(vVar);
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
