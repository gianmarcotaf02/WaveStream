package p036d8;

import P7.b;
import j$.time.DateTimeException;
import j$.time.Instant;
import kotlin.jvm.internal.m;
import p087j8.a;
import p119n8.i;

@i(with = a.class)
public final class d implements Comparable<d> {
    public static final c Companion = new c();

    public static final d f21302i;
    public static final d j;

    public final Instant f21303h;

    static {
        m.d(Instant.ofEpochSecond(-3217862419201L, 999999999L), "ofEpochSecond(...)");
        m.d(Instant.ofEpochSecond(3093527980800L, 0L), "ofEpochSecond(...)");
        Instant MIN = Instant.MIN;
        m.d(MIN, "MIN");
        f21302i = new d(MIN);
        Instant MAX = Instant.MAX;
        m.d(MAX, "MAX");
        j = new d(MAX);
    }

    public d(Instant instant) {
        this.f21303h = instant;
    }

    @Override
    public final int compareTo(d other) {
        m.e(other, "other");
        return this.f21303h.compareTo(other.f21303h);
    }

    public final d b(long j9) {
        P7.a aVar = b.f8168i;
        try {
            Instant instantPlusNanos = this.f21303h.plusSeconds(b.i(j9, P7.d.SECONDS)).plusNanos(b.e(j9));
            m.d(instantPlusNanos, "plusNanos(...)");
            return new d(instantPlusNanos);
        } catch (Exception e6) {
            if ((e6 instanceof ArithmeticException) || (e6 instanceof DateTimeException)) {
                return j9 > 0 ? j : f21302i;
            }
            throw e6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return m.a(this.f21303h, ((d) obj).f21303h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21303h.hashCode();
    }

    public final String toString() {
        String string = this.f21303h.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
