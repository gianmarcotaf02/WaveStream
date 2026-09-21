package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements p045e8.InterfaceC2123f, p080i8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Integer f21487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Integer f21488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Integer f21489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Integer f21490d;

    public E(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        this.f21487a = num;
        this.f21488b = num2;
        this.f21489c = num3;
        this.f21490d = num4;
    }

    @Override // p080i8.c
    public final java.lang.Object a() {
        return new p045e8.E(this.f21487a, this.f21488b, this.f21489c, this.f21490d);
    }

    public final p036d8.g b() {
        java.lang.Integer num = this.f21487a;
        p045e8.K.a(num, "year");
        int iIntValue = num.intValue();
        java.lang.Integer num2 = this.f21488b;
        p045e8.K.a(num2, "monthNumber");
        int iIntValue2 = num2.intValue();
        java.lang.Integer num3 = this.f21489c;
        p045e8.K.a(num3, "dayOfMonth");
        try {
            j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iIntValue, iIntValue2, num3.intValue());
            kotlin.jvm.internal.m.b(localDateOf);
            p036d8.g gVar = new p036d8.g(localDateOf);
            java.lang.Integer num4 = this.f21490d;
            if (num4 != null) {
                int iIntValue3 = num4.intValue();
                j$.time.DayOfWeek dayOfWeek = localDateOf.getDayOfWeek();
                kotlin.jvm.internal.m.d(dayOfWeek, "getDayOfWeek(...)");
                if (iIntValue3 != dayOfWeek.ordinal() + 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                    if (1 > iIntValue3 || iIntValue3 >= 8) {
                        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(iIntValue3, "Expected ISO day-of-week number in 1..7, got ").toString());
                    }
                    sb.append((j$.time.DayOfWeek) p036d8.b.f21301a.get(iIntValue3 - 1));
                    sb.append(" but the date is ");
                    sb.append(gVar);
                    sb.append(", which is a ");
                    j$.time.DayOfWeek dayOfWeek2 = localDateOf.getDayOfWeek();
                    kotlin.jvm.internal.m.d(dayOfWeek2, "getDayOfWeek(...)");
                    sb.append(dayOfWeek2);
                    throw new p036d8.a(sb.toString(), 0);
                }
            }
            return gVar;
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    @Override // p045e8.InterfaceC2123f
    public final void e(java.lang.Integer num) {
        this.f21488b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p045e8.E)) {
            return false;
        }
        p045e8.E e6 = (p045e8.E) obj;
        return kotlin.jvm.internal.m.a(this.f21487a, e6.f21487a) && kotlin.jvm.internal.m.a(this.f21488b, e6.f21488b) && kotlin.jvm.internal.m.a(this.f21489c, e6.f21489c) && kotlin.jvm.internal.m.a(this.f21490d, e6.f21490d);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f21487a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        java.lang.Integer num2 = this.f21488b;
        int iHashCode2 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode;
        java.lang.Integer num3 = this.f21489c;
        int iHashCode3 = ((num3 != null ? num3.hashCode() : 0) * 31) + iHashCode2;
        java.lang.Integer num4 = this.f21490d;
        return ((num4 != null ? num4.hashCode() : 0) * 31) + iHashCode3;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer i() {
        return this.f21487a;
    }

    @Override // p045e8.InterfaceC2123f
    public final void j(java.lang.Integer num) {
        this.f21489c = num;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer m() {
        return this.f21490d;
    }

    @Override // p045e8.InterfaceC2123f
    public final void o(java.lang.Integer num) {
        this.f21487a = num;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer q() {
        return this.f21489c;
    }

    @Override // p045e8.InterfaceC2123f
    public final java.lang.Integer r() {
        return this.f21488b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object obj = this.f21487a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        java.lang.Object obj2 = this.f21488b;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append('-');
        java.lang.Object obj3 = this.f21489c;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb.append(obj3);
        sb.append(" (day of week is ");
        java.lang.Integer num = this.f21490d;
        return B2.a.n(sb, num != null ? num : "??", ')');
    }

    @Override // p045e8.InterfaceC2123f
    public final void u(java.lang.Integer num) {
        this.f21490d = num;
    }
}
