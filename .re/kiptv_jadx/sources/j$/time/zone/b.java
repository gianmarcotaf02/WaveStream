package j$.time.zone;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j$.time.i f23839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.ZoneOffset f23840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j$.time.ZoneOffset f23841d;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.f23838a, ((j$.time.zone.b) obj).f23838a);
    }

    public b(j$.time.i iVar, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2) {
        this.f23838a = iVar.a0(zoneOffset);
        this.f23839b = iVar;
        this.f23840c = zoneOffset;
        this.f23841d = zoneOffset2;
    }

    public b(long j, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2) {
        this.f23838a = j;
        this.f23839b = j$.time.i.W(j, 0, zoneOffset);
        this.f23840c = zoneOffset;
        this.f23841d = zoneOffset2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a((byte) 2, this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j$.time.zone.b) {
            j$.time.zone.b bVar = (j$.time.zone.b) obj;
            if (this.f23838a == bVar.f23838a && this.f23840c.equals(bVar.f23840c) && this.f23841d.equals(bVar.f23841d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23839b.hashCode() ^ this.f23840c.hashCode()) ^ java.lang.Integer.rotateLeft(this.f23841d.hashCode(), 16);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transition[");
        j$.time.ZoneOffset zoneOffset = this.f23841d;
        int totalSeconds = zoneOffset.getTotalSeconds();
        j$.time.ZoneOffset zoneOffset2 = this.f23840c;
        sb.append(totalSeconds > zoneOffset2.getTotalSeconds() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f23839b);
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(']');
        return sb.toString();
    }
}
