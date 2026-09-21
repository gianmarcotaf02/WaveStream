package j$.time.zone;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements java.io.Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f23836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.io.Serializable f23837b;

    public a() {
    }

    public a(byte b9, java.io.Serializable serializable) {
        this.f23836a = b9;
        this.f23837b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b9 = this.f23836a;
        java.io.Serializable serializable = this.f23837b;
        objectOutput.writeByte(b9);
        if (b9 != 1) {
            if (b9 == 2) {
                j$.time.zone.b bVar = (j$.time.zone.b) serializable;
                c(bVar.f23838a, objectOutput);
                d(bVar.f23840c, objectOutput);
                d(bVar.f23841d, objectOutput);
                return;
            }
            if (b9 == 3) {
                ((j$.time.zone.e) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b9 != 100) {
                    throw new java.io.InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((j$.time.zone.f) serializable).g.getID());
                return;
            }
        }
        j$.time.zone.f fVar = (j$.time.zone.f) serializable;
        long[] jArr = fVar.f23855a;
        objectOutput.writeInt(jArr.length);
        for (long j : jArr) {
            c(j, objectOutput);
        }
        for (j$.time.ZoneOffset zoneOffset : fVar.f23856b) {
            d(zoneOffset, objectOutput);
        }
        long[] jArr2 = fVar.f23857c;
        objectOutput.writeInt(jArr2.length);
        for (long j9 : jArr2) {
            c(j9, objectOutput);
        }
        for (j$.time.ZoneOffset zoneOffset2 : fVar.f23859e) {
            d(zoneOffset2, objectOutput);
        }
        j$.time.zone.e[] eVarArr = fVar.f23860f;
        objectOutput.writeByte(eVarArr.length);
        for (j$.time.zone.e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        java.io.Serializable fVar;
        byte b9 = objectInput.readByte();
        this.f23836a = b9;
        if (b9 == 1) {
            int i3 = objectInput.readInt();
            long[] jArr = j$.time.zone.f.f23852i;
            long[] jArr2 = i3 == 0 ? jArr : new long[i3];
            for (int i9 = 0; i9 < i3; i9++) {
                jArr2[i9] = a(objectInput);
            }
            int i10 = i3 + 1;
            j$.time.ZoneOffset[] zoneOffsetArr = new j$.time.ZoneOffset[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zoneOffsetArr[i11] = b(objectInput);
            }
            int i12 = objectInput.readInt();
            if (i12 != 0) {
                jArr = new long[i12];
            }
            long[] jArr3 = jArr;
            for (int i13 = 0; i13 < i12; i13++) {
                jArr3[i13] = a(objectInput);
            }
            int i14 = i12 + 1;
            j$.time.ZoneOffset[] zoneOffsetArr2 = new j$.time.ZoneOffset[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                zoneOffsetArr2[i15] = b(objectInput);
            }
            int i16 = objectInput.readByte();
            j$.time.zone.e[] eVarArr = i16 == 0 ? j$.time.zone.f.j : new j$.time.zone.e[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                eVarArr[i17] = j$.time.zone.e.a(objectInput);
            }
            fVar = new j$.time.zone.f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (b9 == 2) {
            long jA = a(objectInput);
            j$.time.ZoneOffset zoneOffsetB = b(objectInput);
            j$.time.ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new java.lang.IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new j$.time.zone.b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b9 == 3) {
            fVar = j$.time.zone.e.a(objectInput);
        } else {
            if (b9 != 100) {
                throw new java.io.StreamCorruptedException("Unknown serialized type");
            }
            fVar = new j$.time.zone.f(java.util.TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f23837b = fVar;
    }

    private java.lang.Object readResolve() {
        return this.f23837b;
    }

    public static void d(j$.time.ZoneOffset zoneOffset, java.io.ObjectOutput objectOutput) throws java.io.IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i3 = totalSeconds % org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0 ? totalSeconds / org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR : 127;
        objectOutput.writeByte(i3);
        if (i3 == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    public static j$.time.ZoneOffset b(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte b9 = objectInput.readByte();
        return b9 == 127 ? j$.time.ZoneOffset.ofTotalSeconds(objectInput.readInt()) : j$.time.ZoneOffset.ofTotalSeconds(b9 * 900);
    }

    public static void c(long j, java.io.ObjectOutput objectOutput) throws java.io.IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i3 = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i3 >>> 16) & 255);
            objectOutput.writeByte((i3 >>> 8) & 255);
            objectOutput.writeByte(i3 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j);
    }

    public static long a(java.io.ObjectInput objectInput) {
        int i3 = objectInput.readByte() & 255;
        if (i3 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i3 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
