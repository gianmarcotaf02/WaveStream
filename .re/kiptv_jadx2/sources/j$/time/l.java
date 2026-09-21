package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import org.videolan.libvlc.MediaPlayer;

public final class l implements TemporalAccessor, j$.time.temporal.n {
    public static final l APRIL;
    public static final l AUGUST;
    public static final l DECEMBER;
    public static final l FEBRUARY;
    public static final l JANUARY;
    public static final l JULY;
    public static final l JUNE;
    public static final l MARCH;
    public static final l MAY;
    public static final l NOVEMBER;
    public static final l OCTOBER;
    public static final l SEPTEMBER;

    public static final l[] f23761a;

    public static final l[] f23762b;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f23762b.clone();
    }

    static {
        l lVar = new l("JANUARY", 0);
        JANUARY = lVar;
        l lVar2 = new l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        l lVar3 = new l("MARCH", 2);
        MARCH = lVar3;
        l lVar4 = new l("APRIL", 3);
        APRIL = lVar4;
        l lVar5 = new l("MAY", 4);
        MAY = lVar5;
        l lVar6 = new l("JUNE", 5);
        JUNE = lVar6;
        l lVar7 = new l("JULY", 6);
        JULY = lVar7;
        l lVar8 = new l("AUGUST", 7);
        AUGUST = lVar8;
        l lVar9 = new l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        l lVar10 = new l("OCTOBER", 9);
        OCTOBER = lVar10;
        l lVar11 = new l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        l lVar12 = new l("DECEMBER", 11);
        DECEMBER = lVar12;
        f23762b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        f23761a = values();
    }

    public static l K(int i3) {
        if (i3 < 1 || i3 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i3);
        }
        return f23761a[i3 - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.B();
        }
        return super.l(qVar);
    }

    @Override
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        return super.j(qVar);
    }

    @Override
    public final long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    public final int B(boolean z6) {
        int i3 = k.f23760a[ordinal()];
        if (i3 != 1) {
            return (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        }
        return z6 ? 29 : 28;
    }

    public final int J() {
        int i3 = k.f23760a[ordinal()];
        if (i3 != 1) {
            return (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int r(boolean z6) {
        switch (k.f23760a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z6 ? 1 : 0) + 91;
            case 3:
                return (z6 ? 1 : 0) + 152;
            case 4:
                return (z6 ? 1 : 0) + 244;
            case 5:
                return (z6 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z6 ? 1 : 0) + 60;
            case 8:
                return (z6 ? 1 : 0) + 121;
            case 9:
                return (z6 ? 1 : 0) + 182;
            case 10:
                return (z6 ? 1 : 0) + 213;
            case 11:
                return (z6 ? 1 : 0) + MediaPlayer.Event.Vout;
            default:
                return (z6 ? 1 : 0) + 335;
        }
    }

    @Override
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23803b) {
            return j$.time.chrono.s.f23629c;
        }
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(temporalQuery);
    }

    @Override
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.F(mVar).equals(j$.time.chrono.s.f23629c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.e(p(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
