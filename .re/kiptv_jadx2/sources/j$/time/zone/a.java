package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import org.videolan.libvlc.media.MediaPlayer;

public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    public byte f23836a;

    public Serializable f23837b;

    public a() {
    }

    public a(byte b9, Serializable serializable) {
        this.f23836a = b9;
        this.f23837b = serializable;
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b9 = this.f23836a;
        Serializable serializable = this.f23837b;
        objectOutput.writeByte(b9);
        if (b9 != 1) {
            if (b9 == 2) {
                b bVar = (b) serializable;
                c(bVar.f23838a, objectOutput);
                d(bVar.f23840c, objectOutput);
                d(bVar.f23841d, objectOutput);
                return;
            }
            if (b9 == 3) {
                ((e) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b9 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) serializable).g.getID());
                return;
            }
        }
        f fVar = (f) serializable;
        long[] jArr = fVar.f23855a;
        objectOutput.writeInt(jArr.length);
        for (long j : jArr) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : fVar.f23856b) {
            d(zoneOffset, objectOutput);
        }
        long[] jArr2 = fVar.f23857c;
        objectOutput.writeInt(jArr2.length);
        for (long j9 : jArr2) {
            c(j9, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : fVar.f23859e) {
            d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = fVar.f23860f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    @Override
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable fVar;
        byte b9 = objectInput.readByte();
        this.f23836a = b9;
        if (b9 == 1) {
            int i3 = objectInput.readInt();
            long[] jArr = f.f23852i;
            long[] jArr2 = i3 == 0 ? jArr : new long[i3];
            for (int i9 = 0; i9 < i3; i9++) {
                jArr2[i9] = a(objectInput);
            }
            int i10 = i3 + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i10];
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
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                zoneOffsetArr2[i15] = b(objectInput);
            }
            int i16 = objectInput.readByte();
            e[] eVarArr = i16 == 0 ? f.j : new e[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                eVarArr[i17] = e.a(objectInput);
            }
            fVar = new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (b9 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b9 == 3) {
            fVar = e.a(objectInput);
        } else {
            if (b9 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f23837b = fVar;
    }

    private Object readResolve() {
        return this.f23837b;
    }

    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i3 = totalSeconds % MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0 ? totalSeconds / MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR : 127;
        objectOutput.writeByte(i3);
        if (i3 == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    public static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b9 = objectInput.readByte();
        return b9 == 127 ? ZoneOffset.ofTotalSeconds(objectInput.readInt()) : ZoneOffset.ofTotalSeconds(b9 * 900);
    }

    public static void c(long j, ObjectOutput objectOutput) throws IOException {
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

    public static long a(ObjectInput objectInput) {
        int i3 = objectInput.readByte() & 255;
        if (i3 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i3 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
