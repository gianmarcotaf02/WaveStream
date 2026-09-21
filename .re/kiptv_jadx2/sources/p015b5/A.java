package p015b5;

import Y6.f;
import p121o0.p;

public final class A {

    public final int f17918a;

    public final int f17919b;

    public final int f17920c;

    public A(int i3, int i9, int i10) {
        this.f17918a = i3;
        this.f17919b = i9;
        this.f17920c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a2 = (A) obj;
        return this.f17918a == a2.f17918a && this.f17919b == a2.f17919b && this.f17920c == a2.f17920c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17920c) + p.d(this.f17919b, Integer.hashCode(this.f17918a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationResult(migratedCount=");
        sb.append(this.f17918a);
        sb.append(", conflictsResolved=");
        sb.append(this.f17919b);
        sb.append(", skippedCount=");
        return f.k(sb, this.f17920c, ")");
    }
}
