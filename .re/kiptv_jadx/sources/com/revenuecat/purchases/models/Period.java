package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001cR\u001a\u0010%\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001cR\u0011\u0010'\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001c¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/models/Period;", "Landroid/os/Parcelable;", "", "value", "Lcom/revenuecat/purchases/models/Period$Unit;", "unit", "", "iso8601", "<init>", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "Lcom/revenuecat/purchases/models/Period$Unit;", "getUnit", "()Lcom/revenuecat/purchases/models/Period$Unit;", "Ljava/lang/String;", "getIso8601", "()Ljava/lang/String;", "", "getValueInDays", "()D", "getValueInDays$annotations", "()V", "valueInDays", "getValueInWeeks", "getValueInWeeks$annotations", "valueInWeeks", "getValueInYears", "getValueInYears$annotations", "valueInYears", "getValueInMonths", "valueInMonths", "Factory", "Unit", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Period implements android.os.Parcelable {
    private final java.lang.String iso8601;
    private final com.revenuecat.purchases.models.Period.Unit unit;
    private final int value;

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.models.Period.Companion INSTANCE = new com.revenuecat.purchases.models.Period.Companion(null);
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.models.Period> CREATOR = new com.revenuecat.purchases.models.Period.Creator();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.models.Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.Period createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.models.Period(parcel.readInt(), com.revenuecat.purchases.models.Period.Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.Period[] newArray(int i3) {
            return new com.revenuecat.purchases.models.Period[i3];
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.Period$Factory, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Factory;", "", "()V", "create", "Lcom/revenuecat/purchases/models/Period;", "iso8601", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.models.Period create(java.lang.String iso8601) {
            kotlin.jvm.internal.m.e(iso8601, "iso8601");
            p070h6.k period = com.revenuecat.purchases.models.PeriodKt.toPeriod(iso8601);
            return new com.revenuecat.purchases.models.Period(((java.lang.Number) period.f22539h).intValue(), (com.revenuecat.purchases.models.Period.Unit) period.f22540i, iso8601);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Unit;", "", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "UNKNOWN", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.models.Period.Unit.values().length];
            try {
                iArr[com.revenuecat.purchases.models.Period.Unit.DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.models.Period.Unit.WEEK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.models.Period.Unit.MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.models.Period.Unit.YEAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.revenuecat.purchases.models.Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i3, com.revenuecat.purchases.models.Period.Unit unit, java.lang.String iso8601) {
        kotlin.jvm.internal.m.e(unit, "unit");
        kotlin.jvm.internal.m.e(iso8601, "iso8601");
        this.value = i3;
        this.unit = unit;
        this.iso8601 = iso8601;
    }

    public static /* synthetic */ void getValueInDays$annotations() {
    }

    public static /* synthetic */ void getValueInWeeks$annotations() {
    }

    public static /* synthetic */ void getValueInYears$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.models.Period)) {
            return false;
        }
        com.revenuecat.purchases.models.Period period = (com.revenuecat.purchases.models.Period) obj;
        return this.value == period.value && this.unit == period.unit && kotlin.jvm.internal.m.a(this.iso8601, period.iso8601);
    }

    public final java.lang.String getIso8601() {
        return this.iso8601;
    }

    public final com.revenuecat.purchases.models.Period.Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInDays() {
        int i3 = com.revenuecat.purchases.models.Period.WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i3 == 1) {
            return this.value;
        }
        if (i3 == 2) {
            return ((double) this.value) * 7.0d;
        }
        if (i3 == 3) {
            return ((double) this.value) * 30.0d;
        }
        if (i3 == 4) {
            return ((double) this.value) * 365.0d;
        }
        if (i3 != 5) {
            throw new I3.b();
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in days: " + this.unit, null);
        return 0.0d;
    }

    public final double getValueInMonths() {
        int i3 = com.revenuecat.purchases.models.Period.WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i3 == 1) {
            return ((double) this.value) / 30.0d;
        }
        if (i3 == 2) {
            return ((double) this.value) / 4.345238095238096d;
        }
        if (i3 == 3) {
            return this.value;
        }
        if (i3 == 4) {
            return ((double) this.value) * 12.0d;
        }
        if (i3 != 5) {
            throw new I3.b();
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in months: " + this.unit, null);
        return 0.0d;
    }

    public final double getValueInWeeks() {
        int i3 = com.revenuecat.purchases.models.Period.WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i3 == 1) {
            return ((double) this.value) / 7.0d;
        }
        if (i3 == 2) {
            return this.value;
        }
        if (i3 == 3) {
            return ((double) this.value) * 4.345238095238096d;
        }
        if (i3 == 4) {
            return ((double) this.value) * 52.142857142857146d;
        }
        if (i3 != 5) {
            throw new I3.b();
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in weeks: " + this.unit, null);
        return 0.0d;
    }

    public final double getValueInYears() {
        int i3 = com.revenuecat.purchases.models.Period.WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i3 == 1) {
            return ((double) this.value) / 365.0d;
        }
        if (i3 == 2) {
            return ((double) this.value) / 52.142857142857146d;
        }
        if (i3 == 3) {
            return ((double) this.value) / 12.0d;
        }
        if (i3 == 4) {
            return this.value;
        }
        if (i3 != 5) {
            throw new I3.b();
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in years: " + this.unit, null);
        return 0.0d;
    }

    public int hashCode() {
        return this.iso8601.hashCode() + ((this.unit.hashCode() + (this.value * 31)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Period(value=");
        sb.append(this.value);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(", iso8601=");
        return Y6.f.l(sb, this.iso8601, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}
