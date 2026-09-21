package j$.time;

import androidx.media3.common.C;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Objects;

public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    public byte f23775a;

    public Object f23776b;

    public r() {
    }

    public r(byte b9, Object obj) {
        this.f23775a = b9;
        this.f23776b = obj;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b9 = this.f23775a;
        Object obj = this.f23776b;
        objectOutput.writeByte(b9);
        switch (b9) {
            case 1:
                d dVar = (d) obj;
                objectOutput.writeLong(dVar.f23645a);
                objectOutput.writeInt(dVar.f23646b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f23562a);
                objectOutput.writeInt(instant.f23563b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f23564a);
                objectOutput.writeByte(localDate.f23565b);
                objectOutput.writeByte(localDate.f23566c);
                return;
            case 4:
                ((LocalTime) obj).i0(objectOutput);
                return;
            case 5:
                i iVar = (i) obj;
                LocalDate localDate2 = iVar.f23756a;
                objectOutput.writeInt(localDate2.f23564a);
                objectOutput.writeByte(localDate2.f23565b);
                objectOutput.writeByte(localDate2.f23566c);
                iVar.f23757b.i0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                i iVar2 = zonedDateTime.f23582a;
                LocalDate localDate3 = iVar2.f23756a;
                objectOutput.writeInt(localDate3.f23564a);
                objectOutput.writeByte(localDate3.f23565b);
                objectOutput.writeByte(localDate3.f23566c);
                iVar2.f23757b.i0(objectOutput);
                zonedDateTime.f23583b.d0(objectOutput);
                zonedDateTime.f23584c.W(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).f23833b);
                return;
            case 8:
                ((ZoneOffset) obj).d0(objectOutput);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.f23769a.i0(objectOutput);
                pVar.f23770b.d0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                i iVar3 = offsetDateTime.f23574a;
                LocalDate localDate4 = iVar3.f23756a;
                objectOutput.writeInt(localDate4.f23564a);
                objectOutput.writeByte(localDate4.f23565b);
                objectOutput.writeByte(localDate4.f23566c);
                iVar3.f23757b.i0(objectOutput);
                offsetDateTime.f23575b.d0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).f23780a);
                return;
            case 12:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.f23830a);
                objectOutput.writeByte(vVar.f23831b);
                return;
            case 13:
                n nVar = (n) obj;
                objectOutput.writeByte(nVar.f23765a);
                objectOutput.writeByte(nVar.f23766b);
                return;
            case 14:
                q qVar = (q) obj;
                objectOutput.writeInt(qVar.f23772a);
                objectOutput.writeInt(qVar.f23773b);
                objectOutput.writeInt(qVar.f23774c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b9 = objectInput.readByte();
        this.f23775a = b9;
        this.f23776b = a(b9, objectInput);
    }

    public static Serializable a(byte b9, ObjectInput objectInput) throws IOException {
        switch (b9) {
            case 1:
                d dVar = d.f23644c;
                long j = objectInput.readLong();
                long j9 = objectInput.readInt();
                return d.r(Math.addExact(j, Math.floorDiv(j9, C.NANOS_PER_SECOND)), (int) Math.floorMod(j9, C.NANOS_PER_SECOND));
            case 2:
                Instant instant = Instant.f23561c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.e0(objectInput);
            case 5:
                i iVar = i.f23754c;
                LocalDate localDate2 = LocalDate.MIN;
                return i.K(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput));
            case 6:
                i iVar2 = i.f23754c;
                LocalDate localDate3 = LocalDate.MIN;
                i iVarK = i.K(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput));
                ZoneOffset zoneOffsetC0 = ZoneOffset.c0(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneOffsetC0, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetC0.equals(zoneId)) {
                    return new ZonedDateTime(iVarK, zoneId, zoneOffsetC0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i3 = w.f23832d;
                return ZoneId.B(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.c0(objectInput);
            case 9:
                int i9 = p.f23768c;
                return new p(LocalTime.e0(objectInput), ZoneOffset.c0(objectInput));
            case 10:
                int i10 = OffsetDateTime.f23573c;
                LocalDate localDate4 = LocalDate.MIN;
                return new OffsetDateTime(i.K(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput)), ZoneOffset.c0(objectInput));
            case 11:
                int i11 = t.f23779b;
                return t.r(objectInput.readInt());
            case 12:
                int i12 = v.f23829c;
                int i13 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                j$.time.temporal.a.YEAR.b0(i13);
                j$.time.temporal.a.MONTH_OF_YEAR.b0(b10);
                return new v(i13, b10);
            case 13:
                int i14 = n.f23764c;
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                l lVarK = l.K(b11);
                Objects.requireNonNull(lVarK, "month");
                j$.time.temporal.a.DAY_OF_MONTH.b0(b12);
                if (b12 <= lVarK.J()) {
                    return new n(lVarK.p(), b12);
                }
                throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b12) + " is not valid for month " + lVarK.name());
            case 14:
                q qVar = q.f23771d;
                return q.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f23776b;
    }
}
