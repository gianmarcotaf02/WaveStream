package p098l3;

import p041e3.h;
import p041e3.i;

public final class b {

    public final long f24723a;

    public final i f24724b;

    public final h f24725c;

    public b(long j, i iVar, h hVar) {
        this.f24723a = j;
        this.f24724b = iVar;
        this.f24725c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f24723a == bVar.f24723a && this.f24724b.equals(bVar.f24724b) && this.f24725c.equals(bVar.f24725c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24723a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f24724b.hashCode()) * 1000003) ^ this.f24725c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f24723a + ", transportContext=" + this.f24724b + ", event=" + this.f24725c + "}";
    }
}
