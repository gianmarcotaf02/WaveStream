package j$.time.zone;

import io.ktor.sse.ServerSentEventKt;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.l;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import org.videolan.libvlc.media.MediaPlayer;

public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    public final l f23844a;

    public final byte f23845b;

    public final DayOfWeek f23846c;

    public final LocalTime f23847d;

    public final boolean f23848e;

    public final d f23849f;
    public final ZoneOffset g;

    public final ZoneOffset f23850h;

    public final ZoneOffset f23851i;

    public e(l lVar, int i3, DayOfWeek dayOfWeek, LocalTime localTime, boolean z6, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f23844a = lVar;
        this.f23845b = (byte) i3;
        this.f23846c = dayOfWeek;
        this.f23847d = localTime;
        this.f23848e = z6;
        this.f23849f = dVar;
        this.g = zoneOffset;
        this.f23850h = zoneOffset2;
        this.f23851i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b9;
        LocalTime localTime = this.f23847d;
        boolean z6 = this.f23848e;
        int secondOfDay = z6 ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.f23850h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.f23851i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            b9 = z6 ? (byte) 24 : localTime.f23569a;
        } else {
            b9 = 31;
        }
        int i3 = totalSeconds % MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0 ? (totalSeconds / MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR) + 128 : 255;
        int i9 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i10 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f23846c;
        objectOutput.writeInt((this.f23844a.p() << 28) + ((this.f23845b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.p()) << 19) + (b9 << 14) + (this.f23849f.ordinal() << 12) + (i3 << 4) + (i9 << 2) + i10);
        if (b9 == 31) {
            objectOutput.writeInt(secondOfDay);
        }
        if (i3 == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i9 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i10 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    public static e a(ObjectInput objectInput) {
        int i3;
        LocalTime localTimeR;
        int totalSeconds;
        ZoneOffset zoneOffsetOfTotalSeconds;
        int i9 = objectInput.readInt();
        l lVarK = l.K(i9 >>> 28);
        int i10 = ((264241152 & i9) >>> 22) - 32;
        int i11 = (3670016 & i9) >>> 19;
        DayOfWeek dayOfWeekR = i11 == 0 ? null : DayOfWeek.r(i11);
        int i12 = (507904 & i9) >>> 14;
        d dVar = d.values()[(i9 & 12288) >>> 12];
        int i13 = (i9 & 4080) >>> 4;
        int i14 = (i9 & 12) >>> 2;
        int i15 = i9 & 3;
        if (i12 == 31) {
            long j = objectInput.readInt();
            LocalTime localTime = LocalTime.MIN;
            j$.time.temporal.a.SECOND_OF_DAY.b0(j);
            int i16 = (int) (j / 3600);
            i3 = 24;
            long j9 = j - ((long) (i16 * 3600));
            int i17 = (int) (j9 / 60);
            localTimeR = LocalTime.r(i16, i17, (int) (j9 - ((long) (i17 * 60))), 0);
        } else {
            i3 = 24;
            int i18 = i12 % 24;
            LocalTime localTime2 = LocalTime.MIN;
            j$.time.temporal.a.HOUR_OF_DAY.b0(i18);
            localTimeR = LocalTime.f23568f[i18];
        }
        ZoneOffset zoneOffsetOfTotalSeconds2 = i13 == 255 ? ZoneOffset.ofTotalSeconds(objectInput.readInt()) : ZoneOffset.ofTotalSeconds((i13 - 128) * MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR);
        if (i14 == 3) {
            totalSeconds = objectInput.readInt();
        } else {
            totalSeconds = (i14 * 1800) + zoneOffsetOfTotalSeconds2.getTotalSeconds();
        }
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(totalSeconds);
        if (i15 == 3) {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(objectInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds((i15 * 1800) + zoneOffsetOfTotalSeconds2.getTotalSeconds());
        }
        ZoneOffset zoneOffset = zoneOffsetOfTotalSeconds;
        boolean z6 = i12 == i3;
        Objects.requireNonNull(lVarK, "month");
        Objects.requireNonNull(localTimeR, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetBefore");
        Objects.requireNonNull(zoneOffset, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z6 && !localTimeR.equals(LocalTime.f23567e)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeR.f23572d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(lVarK, i10, dayOfWeekR, localTimeR, z6, dVar, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3, zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f23844a == eVar.f23844a && this.f23845b == eVar.f23845b && this.f23846c == eVar.f23846c && this.f23849f == eVar.f23849f && this.f23847d.equals(eVar.f23847d) && this.f23848e == eVar.f23848e && this.g.equals(eVar.g) && this.f23850h.equals(eVar.f23850h) && this.f23851i.equals(eVar.f23851i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = ((this.f23847d.toSecondOfDay() + (this.f23848e ? 1 : 0)) << 15) + (this.f23844a.ordinal() << 11) + ((this.f23845b + 32) << 5);
        DayOfWeek dayOfWeek = this.f23846c;
        return ((this.g.hashCode() ^ (this.f23849f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f23850h.hashCode()) ^ this.f23851i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f23850h;
        ZoneOffset zoneOffset2 = this.f23851i;
        sb.append(zoneOffset2.f23580b - zoneOffset.f23580b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        l lVar = this.f23844a;
        byte b9 = this.f23845b;
        DayOfWeek dayOfWeek = this.f23846c;
        if (dayOfWeek == null) {
            sb.append(lVar.name());
            sb.append(' ');
            sb.append((int) b9);
        } else if (b9 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(lVar.name());
        } else if (b9 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b9) - 1);
            sb.append(" of ");
            sb.append(lVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(lVar.name());
            sb.append(' ');
            sb.append((int) b9);
        }
        sb.append(" at ");
        sb.append(this.f23848e ? "24:00" : this.f23847d.toString());
        sb.append(ServerSentEventKt.SPACE);
        sb.append(this.f23849f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
