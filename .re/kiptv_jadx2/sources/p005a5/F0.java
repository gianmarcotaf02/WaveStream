package p005a5;

import kotlin.jvm.internal.m;
import p121o0.p;

public final class F0 {

    public final int f13383a;

    public final int f13384b;

    public final Long f13385c;

    public F0(int i3, int i9, Long l2) {
        this.f13383a = i3;
        this.f13384b = i9;
        this.f13385c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f9 = (F0) obj;
        return this.f13383a == f9.f13383a && this.f13384b == f9.f13384b && m.a(this.f13385c, f9.f13385c);
    }

    public final int hashCode() {
        int iD = p.d(this.f13384b, Integer.hashCode(this.f13383a) * 31, 31);
        Long l2 = this.f13385c;
        return iD + (l2 == null ? 0 : l2.hashCode());
    }

    public final String toString() {
        return "Ep(season=" + this.f13383a + ", episode=" + this.f13384b + ", addedMs=" + this.f13385c + ")";
    }
}
