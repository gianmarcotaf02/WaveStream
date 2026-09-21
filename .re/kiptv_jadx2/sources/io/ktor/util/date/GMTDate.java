package io.ktor.util.date;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p119n8.i;
import p121o0.p;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002FGBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&Jj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u001a\u0010.\u001a\u00020-2\b\u0010\u0015\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bC\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010&¨\u0006H"}, d2 = {"Lio/ktor/util/date/GMTDate;", "", "", "seconds", "minutes", "hours", "Lio/ktor/util/date/WeekDay;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lio/ktor/util/date/Month;", "month", "year", "", "timestamp", "<init>", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)V", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(IIIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJLr8/k0;)V", Request.JsonKeys.OTHER, "compareTo", "(Lio/ktor/util/date/GMTDate;)I", "copy", "()Lio/ktor/util/date/GMTDate;", "component1", "()I", "component2", "component3", "component4", "()Lio/ktor/util/date/WeekDay;", "component5", "component6", "component7", "()Lio/ktor/util/date/Month;", "component8", "component9", "()J", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)Lio/ktor/util/date/GMTDate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$ktor_utils", "(Lio/ktor/util/date/GMTDate;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getSeconds", "getMinutes", "getHours", "Lio/ktor/util/date/WeekDay;", "getDayOfWeek", "getDayOfMonth", "getDayOfYear", "Lio/ktor/util/date/Month;", "getMonth", "getYear", "J", "getTimestamp", "Companion", "$serializer", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class GMTDate implements Comparable<GMTDate> {
    private final int dayOfMonth;
    private final WeekDay dayOfWeek;
    private final int dayOfYear;
    private final int hours;
    private final int minutes;
    private final Month month;
    private final int seconds;
    private final long timestamp;
    private final int year;

    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, AbstractC2686a0.f("io.ktor.util.date.WeekDay", WeekDay.values()), null, null, AbstractC2686a0.f("io.ktor.util.date.Month", Month.values()), null, null};
    private static final GMTDate START = DateJvmKt.GMTDate(0L);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/date/GMTDate$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/util/date/GMTDate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "START", "Lio/ktor/util/date/GMTDate;", "getSTART", "()Lio/ktor/util/date/GMTDate;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final GMTDate getSTART() {
            return GMTDate.START;
        }

        public final KSerializer serializer() {
            return GMTDate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GMTDate(int i3, int i9, int i10, int i11, WeekDay weekDay, int i12, int i13, Month month, int i14, long j, k0 k0Var) {
        if (511 != (i3 & 511)) {
            AbstractC2686a0.l(i3, 511, GMTDate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.seconds = i9;
        this.minutes = i10;
        this.hours = i11;
        this.dayOfWeek = weekDay;
        this.dayOfMonth = i12;
        this.dayOfYear = i13;
        this.month = month;
        this.year = i14;
        this.timestamp = j;
    }

    public static GMTDate copy$default(GMTDate gMTDate, int i3, int i9, int i10, WeekDay weekDay, int i11, int i12, Month month, int i13, long j, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i3 = gMTDate.seconds;
        }
        if ((i14 & 2) != 0) {
            i9 = gMTDate.minutes;
        }
        if ((i14 & 4) != 0) {
            i10 = gMTDate.hours;
        }
        if ((i14 & 8) != 0) {
            weekDay = gMTDate.dayOfWeek;
        }
        if ((i14 & 16) != 0) {
            i11 = gMTDate.dayOfMonth;
        }
        if ((i14 & 32) != 0) {
            i12 = gMTDate.dayOfYear;
        }
        if ((i14 & 64) != 0) {
            month = gMTDate.month;
        }
        if ((i14 & 128) != 0) {
            i13 = gMTDate.year;
        }
        if ((i14 & 256) != 0) {
            j = gMTDate.timestamp;
        }
        long j9 = j;
        Month month2 = month;
        int i15 = i13;
        int i16 = i11;
        int i17 = i12;
        return gMTDate.copy(i3, i9, i10, weekDay, i16, i17, month2, i15, j9);
    }

    public static final void write$Self$ktor_utils(GMTDate self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.n(0, self.seconds, serialDesc);
        output.n(1, self.minutes, serialDesc);
        output.n(2, self.hours, serialDesc);
        output.h(serialDesc, 3, kSerializerArr[3], self.dayOfWeek);
        output.n(4, self.dayOfMonth, serialDesc);
        output.n(5, self.dayOfYear, serialDesc);
        output.h(serialDesc, 6, kSerializerArr[6], self.month);
        output.n(7, self.year, serialDesc);
        output.D(serialDesc, 8, self.timestamp);
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getHours() {
        return this.hours;
    }

    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    public final Month getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final GMTDate copy(int seconds, int minutes, int hours, WeekDay dayOfWeek, int dayOfMonth, int dayOfYear, Month month, int year, long timestamp) {
        m.e(dayOfWeek, "dayOfWeek");
        m.e(month, "month");
        return new GMTDate(seconds, minutes, hours, dayOfWeek, dayOfMonth, dayOfYear, month, year, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) other;
        return this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final Month getMonth() {
        return this.month;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + p.d(this.year, (this.month.hashCode() + p.d(this.dayOfYear, p.d(this.dayOfMonth, (this.dayOfWeek.hashCode() + p.d(this.hours, p.d(this.minutes, Integer.hashCode(this.seconds) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.seconds + ", minutes=" + this.minutes + ", hours=" + this.hours + ", dayOfWeek=" + this.dayOfWeek + ", dayOfMonth=" + this.dayOfMonth + ", dayOfYear=" + this.dayOfYear + ", month=" + this.month + ", year=" + this.year + ", timestamp=" + this.timestamp + ')';
    }

    public GMTDate(int i3, int i9, int i10, WeekDay dayOfWeek, int i11, int i12, Month month, int i13, long j) {
        m.e(dayOfWeek, "dayOfWeek");
        m.e(month, "month");
        this.seconds = i3;
        this.minutes = i9;
        this.hours = i10;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = i11;
        this.dayOfYear = i12;
        this.month = month;
        this.year = i13;
        this.timestamp = j;
    }

    @Override
    public int compareTo(GMTDate other) {
        m.e(other, "other");
        return m.g(this.timestamp, other.timestamp);
    }

    public final GMTDate copy() {
        return DateJvmKt.GMTDate$default(null, 1, null);
    }
}
