package L0;

import p121o0.p;

public final class a {

    public long f7039a;

    public float f7040b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7039a == aVar.f7039a && Float.compare(this.f7040b, aVar.f7040b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7040b) + (Long.hashCode(this.f7039a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f7039a);
        sb.append(", dataPoint=");
        return p.q(sb, this.f7040b, ')');
    }
}
