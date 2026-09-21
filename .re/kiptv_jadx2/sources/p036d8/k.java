package p036d8;

import j$.time.ZoneOffset;
import kotlin.jvm.internal.m;
import p087j8.d;
import p119n8.i;

@i(with = d.class)
public final class k {
    public static final j Companion = new j();

    public final ZoneOffset f21307a;

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        m.d(UTC, "UTC");
        new k(UTC);
    }

    public k(ZoneOffset zoneOffset) {
        m.e(zoneOffset, "zoneOffset");
        this.f21307a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return m.a(this.f21307a, ((k) obj).f21307a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21307a.hashCode();
    }

    public final String toString() {
        String string = this.f21307a.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
