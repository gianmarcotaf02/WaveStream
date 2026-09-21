package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    public final long f23838a;

    public final j$.time.i f23839b;

    public final ZoneOffset f23840c;

    public final ZoneOffset f23841d;

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f23838a, ((b) obj).f23838a);
    }

    public b(j$.time.i iVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f23838a = iVar.a0(zoneOffset);
        this.f23839b = iVar;
        this.f23840c = zoneOffset;
        this.f23841d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f23838a = j;
        this.f23839b = j$.time.i.W(j, 0, zoneOffset);
        this.f23840c = zoneOffset;
        this.f23841d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f23838a == bVar.f23838a && this.f23840c.equals(bVar.f23840c) && this.f23841d.equals(bVar.f23841d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23839b.hashCode() ^ this.f23840c.hashCode()) ^ Integer.rotateLeft(this.f23841d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        ZoneOffset zoneOffset = this.f23841d;
        int totalSeconds = zoneOffset.getTotalSeconds();
        ZoneOffset zoneOffset2 = this.f23840c;
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
