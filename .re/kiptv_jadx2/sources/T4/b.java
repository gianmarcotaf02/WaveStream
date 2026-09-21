package T4;

import kotlin.jvm.internal.m;

public final class b {

    public final U4.a f9813a;

    public final long f9814b;

    public b(U4.a aVar, long j) {
        this.f9813a = aVar;
        this.f9814b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f9813a, bVar.f9813a) && this.f9814b == bVar.f9814b;
    }

    public final int hashCode() {
        U4.a aVar = this.f9813a;
        return Long.hashCode(this.f9814b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(value=");
        sb.append(this.f9813a);
        sb.append(", storedAtMillis=");
        return Y6.f.g(this.f9814b, ")", sb);
    }
}
