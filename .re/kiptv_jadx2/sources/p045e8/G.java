package p045e8;

import io.ktor.sse.ServerSentEventKt;
import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import kotlin.jvm.internal.m;
import p036d8.k;
import p036d8.n;
import p070h6.p;
import p080i8.c;

public final class G implements k0, c {

    public Boolean f21497a;

    public Integer f21498b;

    public Integer f21499c;

    public Integer f21500d;

    public G(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.f21497a = bool;
        this.f21498b = num;
        this.f21499c = num2;
        this.f21500d = num3;
    }

    @Override
    public final void B(Integer num) {
        this.f21498b = num;
    }

    @Override
    public final void C(Integer num) {
        this.f21500d = num;
    }

    @Override
    public final Object a() {
        return new G(this.f21497a, this.f21498b, this.f21499c, this.f21500d);
    }

    public final k b() {
        int i3 = m.a(this.f21497a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.f21498b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i3) : null;
        Integer num2 = this.f21499c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i3) : null;
        Integer num3 = this.f21500d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i3) : null;
        p pVar = n.f21311a;
        try {
            if (numValueOf != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                m.d(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new k(zoneOffsetOfHoursMinutesSeconds);
            }
            if (numValueOf2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                m.d(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new k(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
            m.d(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return new k(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @Override
    public final Integer c() {
        return this.f21498b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G)) {
            return false;
        }
        G g = (G) obj;
        return m.a(this.f21497a, g.f21497a) && m.a(this.f21498b, g.f21498b) && m.a(this.f21499c, g.f21499c) && m.a(this.f21500d, g.f21500d);
    }

    @Override
    public final Integer f() {
        return this.f21500d;
    }

    public final int hashCode() {
        Boolean bool = this.f21497a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.f21498b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.f21499c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.f21500d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override
    public final Integer p() {
        return this.f21499c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.f21497a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = ServerSentEventKt.SPACE;
        }
        sb.append(str);
        Object obj = this.f21498b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.f21499c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.f21500d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override
    public final Boolean w() {
        return this.f21497a;
    }

    @Override
    public final void x(Boolean bool) {
        this.f21497a = bool;
    }

    @Override
    public final void z(Integer num) {
        this.f21499c = num;
    }
}
