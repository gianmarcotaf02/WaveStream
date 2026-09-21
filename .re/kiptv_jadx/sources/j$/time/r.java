package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements java.io.Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f23775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f23776b;

    public r() {
    }

    public r(byte b9, java.lang.Object obj) {
        this.f23775a = b9;
        this.f23776b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b9 = this.f23775a;
        java.lang.Object obj = this.f23776b;
        objectOutput.writeByte(b9);
        switch (b9) {
            case 1:
                j$.time.d dVar = (j$.time.d) obj;
                objectOutput.writeLong(dVar.f23645a);
                objectOutput.writeInt(dVar.f23646b);
                return;
            case 2:
                j$.time.Instant instant = (j$.time.Instant) obj;
                objectOutput.writeLong(instant.f23562a);
                objectOutput.writeInt(instant.f23563b);
                return;
            case 3:
                j$.time.LocalDate localDate = (j$.time.LocalDate) obj;
                objectOutput.writeInt(localDate.f23564a);
                objectOutput.writeByte(localDate.f23565b);
                objectOutput.writeByte(localDate.f23566c);
                return;
            case 4:
                ((j$.time.LocalTime) obj).i0(objectOutput);
                return;
            case 5:
                j$.time.i iVar = (j$.time.i) obj;
                j$.time.LocalDate localDate2 = iVar.f23756a;
                objectOutput.writeInt(localDate2.f23564a);
                objectOutput.writeByte(localDate2.f23565b);
                objectOutput.writeByte(localDate2.f23566c);
                iVar.f23757b.i0(objectOutput);
                return;
            case 6:
                j$.time.ZonedDateTime zonedDateTime = (j$.time.ZonedDateTime) obj;
                j$.time.i iVar2 = zonedDateTime.f23582a;
                j$.time.LocalDate localDate3 = iVar2.f23756a;
                objectOutput.writeInt(localDate3.f23564a);
                objectOutput.writeByte(localDate3.f23565b);
                objectOutput.writeByte(localDate3.f23566c);
                iVar2.f23757b.i0(objectOutput);
                zonedDateTime.f23583b.d0(objectOutput);
                zonedDateTime.f23584c.W(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((j$.time.w) obj).f23833b);
                return;
            case 8:
                ((j$.time.ZoneOffset) obj).d0(objectOutput);
                return;
            case 9:
                j$.time.p pVar = (j$.time.p) obj;
                pVar.f23769a.i0(objectOutput);
                pVar.f23770b.d0(objectOutput);
                return;
            case 10:
                j$.time.OffsetDateTime offsetDateTime = (j$.time.OffsetDateTime) obj;
                j$.time.i iVar3 = offsetDateTime.f23574a;
                j$.time.LocalDate localDate4 = iVar3.f23756a;
                objectOutput.writeInt(localDate4.f23564a);
                objectOutput.writeByte(localDate4.f23565b);
                objectOutput.writeByte(localDate4.f23566c);
                iVar3.f23757b.i0(objectOutput);
                offsetDateTime.f23575b.d0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((j$.time.t) obj).f23780a);
                return;
            case 12:
                j$.time.v vVar = (j$.time.v) obj;
                objectOutput.writeInt(vVar.f23830a);
                objectOutput.writeByte(vVar.f23831b);
                return;
            case 13:
                j$.time.n nVar = (j$.time.n) obj;
                objectOutput.writeByte(nVar.f23765a);
                objectOutput.writeByte(nVar.f23766b);
                return;
            case 14:
                j$.time.q qVar = (j$.time.q) obj;
                objectOutput.writeInt(qVar.f23772a);
                objectOutput.writeInt(qVar.f23773b);
                objectOutput.writeInt(qVar.f23774c);
                return;
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte b9 = objectInput.readByte();
        this.f23775a = b9;
        this.f23776b = a(b9, objectInput);
    }

    public static java.io.Serializable a(byte b9, java.io.ObjectInput objectInput) throws java.io.IOException {
        switch (b9) {
            case 1:
                j$.time.d dVar = j$.time.d.f23644c;
                long j = objectInput.readLong();
                long j9 = objectInput.readInt();
                return j$.time.d.r(java.lang.Math.addExact(j, java.lang.Math.floorDiv(j9, androidx.media3.common.C.NANOS_PER_SECOND)), (int) java.lang.Math.floorMod(j9, androidx.media3.common.C.NANOS_PER_SECOND));
            case 2:
                j$.time.Instant instant = j$.time.Instant.f23561c;
                return j$.time.Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                j$.time.LocalDate localDate = j$.time.LocalDate.MIN;
                return j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j$.time.LocalTime.e0(objectInput);
            case 5:
                j$.time.i iVar = j$.time.i.f23754c;
                j$.time.LocalDate localDate2 = j$.time.LocalDate.MIN;
                return j$.time.i.K(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.LocalTime.e0(objectInput));
            case 6:
                j$.time.i iVar2 = j$.time.i.f23754c;
                j$.time.LocalDate localDate3 = j$.time.LocalDate.MIN;
                j$.time.i iVarK = j$.time.i.K(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.LocalTime.e0(objectInput));
                j$.time.ZoneOffset zoneOffsetC0 = j$.time.ZoneOffset.c0(objectInput);
                j$.time.ZoneId zoneId = (j$.time.ZoneId) a(objectInput.readByte(), objectInput);
                java.util.Objects.requireNonNull(zoneOffsetC0, "offset");
                java.util.Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof j$.time.ZoneOffset) || zoneOffsetC0.equals(zoneId)) {
                    return new j$.time.ZonedDateTime(iVarK, zoneId, zoneOffsetC0);
                }
                throw new java.lang.IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i3 = j$.time.w.f23832d;
                return j$.time.ZoneId.B(objectInput.readUTF(), false);
            case 8:
                return j$.time.ZoneOffset.c0(objectInput);
            case 9:
                int i9 = j$.time.p.f23768c;
                return new j$.time.p(j$.time.LocalTime.e0(objectInput), j$.time.ZoneOffset.c0(objectInput));
            case 10:
                int i10 = j$.time.OffsetDateTime.f23573c;
                j$.time.LocalDate localDate4 = j$.time.LocalDate.MIN;
                return new j$.time.OffsetDateTime(j$.time.i.K(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.LocalTime.e0(objectInput)), j$.time.ZoneOffset.c0(objectInput));
            case 11:
                int i11 = j$.time.t.f23779b;
                return j$.time.t.r(objectInput.readInt());
            case 12:
                int i12 = j$.time.v.f23829c;
                int i13 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                j$.time.temporal.a.YEAR.b0(i13);
                j$.time.temporal.a.MONTH_OF_YEAR.b0(b10);
                return new j$.time.v(i13, b10);
            case 13:
                int i14 = j$.time.n.f23764c;
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                j$.time.l lVarK = j$.time.l.K(b11);
                java.util.Objects.requireNonNull(lVarK, "month");
                j$.time.temporal.a.DAY_OF_MONTH.b0(b12);
                if (b12 <= lVarK.J()) {
                    return new j$.time.n(lVarK.p(), b12);
                }
                throw new j$.time.DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b12) + " is not valid for month " + lVarK.name());
            case 14:
                j$.time.q qVar = j$.time.q.f23771d;
                return j$.time.q.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
        }
    }

    private java.lang.Object readResolve() {
        return this.f23776b;
    }
}
