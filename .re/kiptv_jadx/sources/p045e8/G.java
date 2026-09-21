package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements p045e8.k0, p080i8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f21497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Integer f21498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Integer f21499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Integer f21500d;

    public G(java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.f21497a = bool;
        this.f21498b = num;
        this.f21499c = num2;
        this.f21500d = num3;
    }

    @Override // p045e8.k0
    public final void B(java.lang.Integer num) {
        this.f21498b = num;
    }

    @Override // p045e8.k0
    public final void C(java.lang.Integer num) {
        this.f21500d = num;
    }

    @Override // p080i8.c
    public final java.lang.Object a() {
        return new p045e8.G(this.f21497a, this.f21498b, this.f21499c, this.f21500d);
    }

    public final p036d8.k b() {
        int i3 = kotlin.jvm.internal.m.a(this.f21497a, java.lang.Boolean.TRUE) ? -1 : 1;
        java.lang.Integer num = this.f21498b;
        java.lang.Integer numValueOf = num != null ? java.lang.Integer.valueOf(num.intValue() * i3) : null;
        java.lang.Integer num2 = this.f21499c;
        java.lang.Integer numValueOf2 = num2 != null ? java.lang.Integer.valueOf(num2.intValue() * i3) : null;
        java.lang.Integer num3 = this.f21500d;
        java.lang.Integer numValueOf3 = num3 != null ? java.lang.Integer.valueOf(num3.intValue() * i3) : null;
        p070h6.p pVar = p036d8.n.f21311a;
        try {
            if (numValueOf != null) {
                j$.time.ZoneOffset zoneOffsetOfHoursMinutesSeconds = j$.time.ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                kotlin.jvm.internal.m.d(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new p036d8.k(zoneOffsetOfHoursMinutesSeconds);
            }
            if (numValueOf2 != null) {
                j$.time.ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = j$.time.ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                kotlin.jvm.internal.m.d(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new p036d8.k(zoneOffsetOfHoursMinutesSeconds2);
            }
            j$.time.ZoneOffset zoneOffsetOfTotalSeconds = j$.time.ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
            kotlin.jvm.internal.m.d(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return new p036d8.k(zoneOffsetOfTotalSeconds);
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    @Override // p045e8.k0
    public final java.lang.Integer c() {
        return this.f21498b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p045e8.G)) {
            return false;
        }
        p045e8.G g = (p045e8.G) obj;
        return kotlin.jvm.internal.m.a(this.f21497a, g.f21497a) && kotlin.jvm.internal.m.a(this.f21498b, g.f21498b) && kotlin.jvm.internal.m.a(this.f21499c, g.f21499c) && kotlin.jvm.internal.m.a(this.f21500d, g.f21500d);
    }

    @Override // p045e8.k0
    public final java.lang.Integer f() {
        return this.f21500d;
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.f21497a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        java.lang.Integer num = this.f21498b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        java.lang.Integer num2 = this.f21499c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        java.lang.Integer num3 = this.f21500d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // p045e8.k0
    public final java.lang.Integer p() {
        return this.f21499c;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Boolean bool = this.f21497a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = io.ktor.sse.ServerSentEventKt.SPACE;
        }
        sb.append(str);
        java.lang.Object obj = this.f21498b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        java.lang.Object obj2 = this.f21499c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        java.lang.Integer num = this.f21500d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // p045e8.k0
    public final java.lang.Boolean w() {
        return this.f21497a;
    }

    @Override // p045e8.k0
    public final void x(java.lang.Boolean bool) {
        this.f21497a = bool;
    }

    @Override // p045e8.k0
    public final void z(java.lang.Integer num) {
        this.f21499c = num;
    }
}
