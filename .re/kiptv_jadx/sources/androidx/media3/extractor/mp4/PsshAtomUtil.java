package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class PsshAtomUtil {
    private static final java.lang.String TAG = "PsshAtomUtil";

    public static final class PsshAtom {
        public final java.util.UUID[] keyIds;
        public final byte[] schemeData;
        public final java.util.UUID uuid;
        public final int version;

        public PsshAtom(java.util.UUID uuid, int i3, byte[] bArr, java.util.UUID[] uuidArr) {
            this.uuid = uuid;
            this.version = i3;
            this.schemeData = bArr;
            this.keyIds = uuidArr;
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(java.util.UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    public static androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom parsePsshAtom(byte[] bArr) {
        java.util.UUID[] uuidArr;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        int iBytesLeft = parsableByteArray.bytesLeft();
        int i3 = parsableByteArray.readInt();
        if (i3 != iBytesLeft) {
            androidx.media3.common.util.Log.w(TAG, "Advertised atom size (" + i3 + ") does not match buffer size: " + iBytesLeft);
            return null;
        }
        int i9 = parsableByteArray.readInt();
        if (i9 != 1886614376) {
            Y6.f.p(i9, "Atom type is not pssh: ", TAG);
            return null;
        }
        int fullBoxVersion = androidx.media3.extractor.mp4.BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (fullBoxVersion > 1) {
            Y6.f.p(fullBoxVersion, "Unsupported pssh version: ", TAG);
            return null;
        }
        java.util.UUID uuid = new java.util.UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (fullBoxVersion == 1) {
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            uuidArr = new java.util.UUID[unsignedIntToInt];
            for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
                uuidArr[i10] = new java.util.UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
            }
        } else {
            uuidArr = null;
        }
        int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        int iBytesLeft2 = parsableByteArray.bytesLeft();
        if (unsignedIntToInt2 == iBytesLeft2) {
            byte[] bArr2 = new byte[unsignedIntToInt2];
            parsableByteArray.readBytes(bArr2, 0, unsignedIntToInt2);
            return new androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom(uuid, fullBoxVersion, bArr2, uuidArr);
        }
        androidx.media3.common.util.Log.w(TAG, "Atom data size (" + unsignedIntToInt2 + ") does not match the bytes left: " + iBytesLeft2);
        return null;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, java.util.UUID uuid) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        if (uuid.equals(psshAtom.uuid)) {
            return psshAtom.schemeData;
        }
        androidx.media3.common.util.Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + psshAtom.uuid + ".");
        return null;
    }

    public static java.util.UUID parseUuid(byte[] bArr) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        return psshAtom.uuid;
    }

    public static int parseVersion(byte[] bArr) {
        androidx.media3.extractor.mp4.PsshAtomUtil.PsshAtom psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return -1;
        }
        return psshAtom.version;
    }

    public static byte[] buildPsshAtom(java.util.UUID uuid, java.util.UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(androidx.media3.container.Mp4Box.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (java.util.UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}
