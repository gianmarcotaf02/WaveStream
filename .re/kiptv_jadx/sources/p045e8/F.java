package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements p045e8.c0, p080i8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Integer f21491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Integer f21492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p045e8.EnumC2122e f21493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Integer f21494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Integer f21495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Integer f21496f;

    public /* synthetic */ F() {
        this(null, null, null, null, null, null);
    }

    @Override // p045e8.c0
    public final void A(java.lang.Integer num) {
        this.f21495e = num;
    }

    @Override // p080i8.c
    public final java.lang.Object a() {
        return new p045e8.F(this.f21491a, this.f21492b, this.f21493c, this.f21494d, this.f21495e, this.f21496f);
    }

    @Override // p045e8.c0
    public final p045e8.EnumC2122e b() {
        return this.f21493c;
    }

    public final p036d8.i c() {
        int iIntValue;
        int iIntValue2;
        java.lang.Integer num = this.f21491a;
        if (num != null) {
            iIntValue = num.intValue();
            java.lang.Integer num2 = this.f21492b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            p045e8.EnumC2122e enumC2122e = this.f21493c;
            if (enumC2122e != null) {
                if ((enumC2122e == p045e8.EnumC2122e.f21535h) != (iIntValue >= 12)) {
                    throw new java.lang.IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + enumC2122e).toString());
                }
            }
        } else {
            java.lang.Integer num3 = this.f21492b;
            java.lang.Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                p045e8.EnumC2122e enumC2122e2 = this.f21493c;
                if (enumC2122e2 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = java.lang.Integer.valueOf(iIntValue3 + (enumC2122e2 != p045e8.EnumC2122e.f21535h ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new p036d8.a("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        java.lang.Integer num4 = this.f21494d;
        p045e8.K.a(num4, "minute");
        int iIntValue4 = num4.intValue();
        java.lang.Integer num5 = this.f21495e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        java.lang.Integer num6 = this.f21496f;
        try {
            j$.time.LocalTime localTimeOf = j$.time.LocalTime.of(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
            kotlin.jvm.internal.m.b(localTimeOf);
            return new p036d8.i(localTimeOf);
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    @Override // p045e8.c0
    public final void d(java.lang.Integer num) {
        this.f21492b = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p045e8.F)) {
            return false;
        }
        p045e8.F f9 = (p045e8.F) obj;
        return kotlin.jvm.internal.m.a(this.f21491a, f9.f21491a) && kotlin.jvm.internal.m.a(this.f21492b, f9.f21492b) && this.f21493c == f9.f21493c && kotlin.jvm.internal.m.a(this.f21494d, f9.f21494d) && kotlin.jvm.internal.m.a(this.f21495e, f9.f21495e) && kotlin.jvm.internal.m.a(this.f21496f, f9.f21496f);
    }

    @Override // p045e8.c0
    public final java.lang.Integer g() {
        return this.f21494d;
    }

    @Override // p045e8.c0
    public final void h(java.lang.Integer num) {
        this.f21494d = num;
    }

    public final int hashCode() {
        java.lang.Integer num = this.f21491a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        java.lang.Integer num2 = this.f21492b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        p045e8.EnumC2122e enumC2122e = this.f21493c;
        int iHashCode = ((enumC2122e != null ? enumC2122e.hashCode() : 0) * 31) + iIntValue2;
        java.lang.Integer num3 = this.f21494d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        java.lang.Integer num4 = this.f21495e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        java.lang.Integer num5 = this.f21496f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // p045e8.c0
    public final p055f8.a k() {
        java.lang.Integer num = this.f21496f;
        if (num != null) {
            return new p055f8.a(num.intValue(), 9);
        }
        return null;
    }

    @Override // p045e8.c0
    public final java.lang.Integer l() {
        return this.f21492b;
    }

    @Override // p045e8.c0
    public final void n(p055f8.a aVar) {
        this.f21496f = aVar != null ? java.lang.Integer.valueOf(aVar.a(9)) : null;
    }

    @Override // p045e8.c0
    public final void s(p045e8.EnumC2122e enumC2122e) {
        this.f21493c = enumC2122e;
    }

    @Override // p045e8.c0
    public final void t(java.lang.Integer num) {
        this.f21491a = num;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final java.lang.String toString() {
        java.lang.String strS0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object obj = this.f21491a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        java.lang.Object obj2 = this.f21494d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        java.lang.Integer num = this.f21495e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        java.lang.Integer num2 = this.f21496f;
        if (num2 != null) {
            java.lang.String strValueOf = java.lang.String.valueOf(num2.intValue());
            strS0 = O7.q.S0(9 - strValueOf.length(), strValueOf);
            if (strS0 == null) {
                strS0 = "???";
            }
        } else {
            strS0 = "???";
        }
        sb.append(strS0);
        return sb.toString();
    }

    @Override // p045e8.c0
    public final java.lang.Integer v() {
        return this.f21491a;
    }

    @Override // p045e8.c0
    public final java.lang.Integer y() {
        return this.f21495e;
    }

    public F(java.lang.Integer num, java.lang.Integer num2, p045e8.EnumC2122e enumC2122e, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        this.f21491a = num;
        this.f21492b = num2;
        this.f21493c = enumC2122e;
        this.f21494d = num3;
        this.f21495e = num4;
        this.f21496f = num5;
    }
}
