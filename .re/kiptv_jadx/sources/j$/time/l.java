package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements j$.time.temporal.TemporalAccessor, j$.time.temporal.n {
    public static final j$.time.l APRIL;
    public static final j$.time.l AUGUST;
    public static final j$.time.l DECEMBER;
    public static final j$.time.l FEBRUARY;
    public static final j$.time.l JANUARY;
    public static final j$.time.l JULY;
    public static final j$.time.l JUNE;
    public static final j$.time.l MARCH;
    public static final j$.time.l MAY;
    public static final j$.time.l NOVEMBER;
    public static final j$.time.l OCTOBER;
    public static final j$.time.l SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j$.time.l[] f23761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j$.time.l[] f23762b;

    public static j$.time.l valueOf(java.lang.String str) {
        return (j$.time.l) java.lang.Enum.valueOf(j$.time.l.class, str);
    }

    public static j$.time.l[] values() {
        return (j$.time.l[]) f23762b.clone();
    }

    static {
        j$.time.l lVar = new j$.time.l("JANUARY", 0);
        JANUARY = lVar;
        j$.time.l lVar2 = new j$.time.l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        j$.time.l lVar3 = new j$.time.l("MARCH", 2);
        MARCH = lVar3;
        j$.time.l lVar4 = new j$.time.l("APRIL", 3);
        APRIL = lVar4;
        j$.time.l lVar5 = new j$.time.l("MAY", 4);
        MAY = lVar5;
        j$.time.l lVar6 = new j$.time.l("JUNE", 5);
        JUNE = lVar6;
        j$.time.l lVar7 = new j$.time.l("JULY", 6);
        JULY = lVar7;
        j$.time.l lVar8 = new j$.time.l("AUGUST", 7);
        AUGUST = lVar8;
        j$.time.l lVar9 = new j$.time.l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        j$.time.l lVar10 = new j$.time.l("OCTOBER", 9);
        OCTOBER = lVar10;
        j$.time.l lVar11 = new j$.time.l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        j$.time.l lVar12 = new j$.time.l("DECEMBER", 11);
        DECEMBER = lVar12;
        f23762b = new j$.time.l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        f23761a = values();
    }

    public static j$.time.l K(int i3) {
        if (i3 < 1 || i3 > 12) {
            throw new j$.time.DateTimeException("Invalid value for MonthOfYear: " + i3);
        }
        return f23761a[i3 - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.B();
        }
        return super.l(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        return super.j(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    public final int B(boolean z6) {
        int i3 = j$.time.k.f23760a[ordinal()];
        if (i3 != 1) {
            return (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        }
        return z6 ? 29 : 28;
    }

    public final int J() {
        int i3 = j$.time.k.f23760a[ordinal()];
        if (i3 != 1) {
            return (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int r(boolean z6) {
        switch (j$.time.k.f23760a[ordinal()]) {
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
                return (z6 ? 1 : 0) + org.videolan.libvlc.MediaPlayer.Event.Vout;
            default:
                return (z6 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23803b) {
            return j$.time.chrono.s.f23629c;
        }
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.l.F(mVar).equals(j$.time.chrono.s.f23629c)) {
            throw new j$.time.DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.e(p(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
