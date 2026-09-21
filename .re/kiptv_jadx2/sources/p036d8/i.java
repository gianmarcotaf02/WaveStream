package p036d8;

import j$.time.LocalTime;
import kotlin.jvm.internal.m;
import p087j8.c;

@p119n8.i(with = c.class)
public final class i implements Comparable<i> {
    public static final h Companion = new h();

    public final LocalTime f21306h;

    static {
        LocalTime MIN = LocalTime.MIN;
        m.d(MIN, "MIN");
        new i(MIN);
        LocalTime MAX = LocalTime.MAX;
        m.d(MAX, "MAX");
        new i(MAX);
    }

    public i(LocalTime value) {
        m.e(value, "value");
        this.f21306h = value;
    }

    @Override
    public final int compareTo(i iVar) {
        i other = iVar;
        m.e(other, "other");
        return this.f21306h.compareTo(other.f21306h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return m.a(this.f21306h, ((i) obj).f21306h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21306h.hashCode();
    }

    public final String toString() {
        String string = this.f21306h.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
