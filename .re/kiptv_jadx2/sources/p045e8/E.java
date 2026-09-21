package p045e8;

import com.google.android.gms.internal.play_billing.M0;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import kotlin.jvm.internal.m;
import p036d8.a;
import p036d8.b;
import p036d8.g;
import p080i8.c;

public final class E implements InterfaceC2123f, c {

    public Integer f21487a;

    public Integer f21488b;

    public Integer f21489c;

    public Integer f21490d;

    public E(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f21487a = num;
        this.f21488b = num2;
        this.f21489c = num3;
        this.f21490d = num4;
    }

    @Override
    public final Object a() {
        return new E(this.f21487a, this.f21488b, this.f21489c, this.f21490d);
    }

    public final g b() {
        Integer num = this.f21487a;
        K.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.f21488b;
        K.a(num2, "monthNumber");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f21489c;
        K.a(num3, "dayOfMonth");
        try {
            LocalDate localDateOf = LocalDate.of(iIntValue, iIntValue2, num3.intValue());
            m.b(localDateOf);
            g gVar = new g(localDateOf);
            Integer num4 = this.f21490d;
            if (num4 != null) {
                int iIntValue3 = num4.intValue();
                DayOfWeek dayOfWeek = localDateOf.getDayOfWeek();
                m.d(dayOfWeek, "getDayOfWeek(...)");
                if (iIntValue3 != dayOfWeek.ordinal() + 1) {
                    StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                    if (1 > iIntValue3 || iIntValue3 >= 8) {
                        throw new IllegalArgumentException(M0.l(iIntValue3, "Expected ISO day-of-week number in 1..7, got ").toString());
                    }
                    sb.append((DayOfWeek) b.f21301a.get(iIntValue3 - 1));
                    sb.append(" but the date is ");
                    sb.append(gVar);
                    sb.append(", which is a ");
                    DayOfWeek dayOfWeek2 = localDateOf.getDayOfWeek();
                    m.d(dayOfWeek2, "getDayOfWeek(...)");
                    sb.append(dayOfWeek2);
                    throw new a(sb.toString(), 0);
                }
            }
            return gVar;
        } catch (DateTimeException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @Override
    public final void e(Integer num) {
        this.f21488b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        return m.a(this.f21487a, e6.f21487a) && m.a(this.f21488b, e6.f21488b) && m.a(this.f21489c, e6.f21489c) && m.a(this.f21490d, e6.f21490d);
    }

    public final int hashCode() {
        Integer num = this.f21487a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f21488b;
        int iHashCode2 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode;
        Integer num3 = this.f21489c;
        int iHashCode3 = ((num3 != null ? num3.hashCode() : 0) * 31) + iHashCode2;
        Integer num4 = this.f21490d;
        return ((num4 != null ? num4.hashCode() : 0) * 31) + iHashCode3;
    }

    @Override
    public final Integer i() {
        return this.f21487a;
    }

    @Override
    public final void j(Integer num) {
        this.f21489c = num;
    }

    @Override
    public final Integer m() {
        return this.f21490d;
    }

    @Override
    public final void o(Integer num) {
        this.f21487a = num;
    }

    @Override
    public final Integer q() {
        return this.f21489c;
    }

    @Override
    public final Integer r() {
        return this.f21488b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.f21487a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Object obj2 = this.f21488b;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append('-');
        Object obj3 = this.f21489c;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb.append(obj3);
        sb.append(" (day of week is ");
        Integer num = this.f21490d;
        return B2.a.n(sb, num != null ? num : "??", ')');
    }

    @Override
    public final void u(Integer num) {
        this.f21490d = num;
    }
}
