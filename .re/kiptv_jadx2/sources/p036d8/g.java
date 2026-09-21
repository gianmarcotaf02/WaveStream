package p036d8;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.m;
import p087j8.b;
import p119n8.i;

@i(with = b.class)
public final class g implements Comparable<g> {
    public static final e Companion = new e();

    public final LocalDate f21305h;

    static {
        LocalDate MIN = LocalDate.MIN;
        m.d(MIN, "MIN");
        new g(MIN);
        LocalDate MAX = LocalDate.MAX;
        m.d(MAX, "MAX");
        new g(MAX);
    }

    public g(LocalDate value) {
        m.e(value, "value");
        this.f21305h = value;
    }

    @Override
    public final int compareTo(g gVar) {
        g other = gVar;
        m.e(other, "other");
        return this.f21305h.compareTo((ChronoLocalDate) other.f21305h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return m.a(this.f21305h, ((g) obj).f21305h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21305h.hashCode();
    }

    public final String toString() {
        String string = this.f21305h.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
