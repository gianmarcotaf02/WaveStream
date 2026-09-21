package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    public static Projection decode(byte[] bArr, int i3) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i3);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i3);
    }

    private static int decodeZigZag(int i3) {
        return (-(i3 & 1)) ^ (i3 >> 1);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i3 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i3 == 1886547818;
    }

    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i3 > 10000) {
            return null;
        }
        float[] fArr = new float[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            fArr[i9] = parsableByteArray.readFloat();
        }
        int i10 = parsableByteArray.readInt();
        if (i10 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d4 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i3) * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        int i11 = 8;
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i10 * 5];
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Projection.Mesh mesh2 = mesh;
            int i14 = 0;
            while (i14 < 5) {
                int iDecodeZigZag = iArr[i14] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag >= i3 || iDecodeZigZag < 0) {
                    return mesh2;
                }
                fArr2[i13] = fArr[iDecodeZigZag];
                iArr[i14] = iDecodeZigZag;
                i14++;
                i13++;
            }
            i12++;
            mesh = mesh2;
        }
        Projection.Mesh mesh3 = mesh;
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i15 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i16 = 0;
        while (i16 < bits) {
            int bits2 = parsableBitArray.readBits(i11);
            int bits3 = parsableBitArray.readBits(i11);
            int bits4 = parsableBitArray.readBits(i15);
            if (bits4 > MAX_TRIANGLE_INDICES) {
                return mesh3;
            }
            int i17 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(((double) i10) * d4) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int i18 = 0;
            int i19 = 0;
            while (i18 < bits4) {
                int iDecodeZigZag2 = i19 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i10) {
                    return mesh3;
                }
                int i20 = i18 * 3;
                int i21 = iDecodeZigZag2 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i18 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
                i18++;
                i19 = iDecodeZigZag2;
            }
            subMeshArr[i16] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i16++;
            bits = i17;
            i15 = 32;
            d4 = 2.0d;
            i11 = 8;
        }
        return new Projection.Mesh(subMeshArr);
    }

    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i3 = parsableByteArray.readInt();
        if (i3 == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (i3 != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        int i3;
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && (i3 = parsableByteArray.readInt() + position) > position && i3 <= iLimit) {
            int i9 = parsableByteArray.readInt();
            if (i9 == TYPE_YTMP || i9 == TYPE_MSHP) {
                parsableByteArray.setLimit(i3);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i3);
            position = i3;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i3 = parsableByteArray.readInt() + position;
            if (i3 <= position || i3 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i3);
            position = i3;
        }
        return arrayList;
    }
}
