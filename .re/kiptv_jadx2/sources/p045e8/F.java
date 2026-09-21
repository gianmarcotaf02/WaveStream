package p045e8;

import O7.q;
import com.google.android.gms.internal.play_billing.M0;
import j$.time.DateTimeException;
import j$.time.LocalTime;
import kotlin.jvm.internal.m;
import p036d8.a;
import p036d8.i;
import p080i8.c;

public final class F implements c0, c {

    public Integer f21491a;

    public Integer f21492b;

    public EnumC2122e f21493c;

    public Integer f21494d;

    public Integer f21495e;

    public Integer f21496f;

    public F() {
        this(null, null, null, null, null, null);
    }

    @Override
    public final void A(Integer num) {
        this.f21495e = num;
    }

    @Override
    public final Object a() {
        return new F(this.f21491a, this.f21492b, this.f21493c, this.f21494d, this.f21495e, this.f21496f);
    }

    @Override
    public final EnumC2122e b() {
        return this.f21493c;
    }

    public final i c() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.f21491a;
        if (num != null) {
            iIntValue = num.intValue();
            Integer num2 = this.f21492b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new IllegalArgumentException(M0.k(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            EnumC2122e enumC2122e = this.f21493c;
            if (enumC2122e != null) {
                if ((enumC2122e == EnumC2122e.f21535h) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + enumC2122e).toString());
                }
            }
        } else {
            Integer num3 = this.f21492b;
            Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                EnumC2122e enumC2122e2 = this.f21493c;
                if (enumC2122e2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (enumC2122e2 != EnumC2122e.f21535h ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new a("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num4 = this.f21494d;
        K.a(num4, "minute");
        int iIntValue4 = num4.intValue();
        Integer num5 = this.f21495e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f21496f;
        try {
            LocalTime localTimeOf = LocalTime.of(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
            m.b(localTimeOf);
            return new i(localTimeOf);
        } catch (DateTimeException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @Override
    public final void d(Integer num) {
        this.f21492b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f9 = (F) obj;
        return m.a(this.f21491a, f9.f21491a) && m.a(this.f21492b, f9.f21492b) && this.f21493c == f9.f21493c && m.a(this.f21494d, f9.f21494d) && m.a(this.f21495e, f9.f21495e) && m.a(this.f21496f, f9.f21496f);
    }

    @Override
    public final Integer g() {
        return this.f21494d;
    }

    @Override
    public final void h(Integer num) {
        this.f21494d = num;
    }

    public final int hashCode() {
        Integer num = this.f21491a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.f21492b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        EnumC2122e enumC2122e = this.f21493c;
        int iHashCode = ((enumC2122e != null ? enumC2122e.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.f21494d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.f21495e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f21496f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override
    public final p055f8.a k() {
        Integer num = this.f21496f;
        if (num != null) {
            return new p055f8.a(num.intValue(), 9);
        }
        return null;
    }

    @Override
    public final Integer l() {
        return this.f21492b;
    }

    @Override
    public final void n(p055f8.a aVar) {
        this.f21496f = aVar != null ? Integer.valueOf(aVar.a(9)) : null;
    }

    @Override
    public final void s(EnumC2122e enumC2122e) {
        this.f21493c = enumC2122e;
    }

    @Override
    public final void t(Integer num) {
        this.f21491a = num;
    }

    public final String toString() {
        String strS0;
        StringBuilder sb = new StringBuilder();
        Object obj = this.f21491a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.f21494d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.f21495e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.f21496f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strS0 = q.S0(9 - strValueOf.length(), strValueOf);
            if (strS0 == null) {
                strS0 = "???";
            }
        } else {
            strS0 = "???";
        }
        sb.append(strS0);
        return sb.toString();
    }

    @Override
    public final Integer v() {
        return this.f21491a;
    }

    @Override
    public final Integer y() {
        return this.f21495e;
    }

    public F(Integer num, Integer num2, EnumC2122e enumC2122e, Integer num3, Integer num4, Integer num5) {
        this.f21491a = num;
        this.f21492b = num2;
        this.f21493c = enumC2122e;
        this.f21494d = num3;
        this.f21495e = num4;
        this.f21496f = num5;
    }
}
