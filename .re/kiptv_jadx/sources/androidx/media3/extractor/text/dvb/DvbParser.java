package androidx.media3.extractor.text.dvb;

/* JADX INFO: loaded from: classes.dex */
public final class DvbParser implements androidx.media3.extractor.text.SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final java.lang.String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private android.graphics.Bitmap bitmap;
    private final android.graphics.Canvas canvas;
    private final androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition defaultClutDefinition;
    private final androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition defaultDisplayDefinition;
    private final android.graphics.Paint defaultPaint;
    private final android.graphics.Paint fillRegionPaint;
    private final androidx.media3.extractor.text.dvb.DvbParser.SubtitleService subtitleService;

    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i3, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i3;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i3, int i9, int i10, int i11, int i12, int i13) {
            this.width = i3;
            this.height = i9;
            this.horizontalPositionMinimum = i10;
            this.horizontalPositionMaximum = i11;
            this.verticalPositionMinimum = i12;
            this.verticalPositionMaximum = i13;
        }
    }

    public static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i3, boolean z6, byte[] bArr, byte[] bArr2) {
            this.id = i3;
            this.nonModifyingColorFlag = z6;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    public static final class PageComposition {
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i3, int i9, int i10, android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> sparseArray) {
            this.timeOutSecs = i3;
            this.version = i9;
            this.state = i10;
            this.regions = sparseArray;
        }
    }

    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i3, int i9) {
            this.horizontalAddress = i3;
            this.verticalAddress = i9;
        }
    }

    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i3, boolean z6, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> sparseArray) {
            this.id = i3;
            this.fillFlag = z6;
            this.width = i9;
            this.height = i10;
            this.levelOfCompatibility = i11;
            this.depth = i12;
            this.clutId = i13;
            this.pixelCode8Bit = i14;
            this.pixelCode4Bit = i15;
            this.pixelCode2Bit = i16;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition) {
            android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                this.regionObjects.put(sparseArray.keyAt(i3), sparseArray.valueAt(i3));
            }
        }
    }

    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i3, int i9, int i10, int i11, int i12, int i13) {
            this.type = i3;
            this.provider = i9;
            this.horizontalPosition = i10;
            this.verticalPosition = i11;
            this.foregroundPixelCode = i12;
            this.backgroundPixelCode = i13;
        }
    }

    public static final class SubtitleService {
        public final int ancillaryPageId;
        public androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition displayDefinition;
        public androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition;
        public final int subtitlePageId;
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionComposition> regions = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition> cluts = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ObjectData> objects = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition> ancillaryCluts = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ObjectData> ancillaryObjects = new android.util.SparseArray<>();

        public SubtitleService(int i3, int i9) {
            this.subtitlePageId = i3;
            this.ancillaryPageId = i9;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(java.util.List<byte[]> list) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(list.get(0));
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.defaultPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new android.graphics.Canvas();
        this.defaultDisplayDefinition = new androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.defaultClutDefinition = new androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new androidx.media3.extractor.text.dvb.DvbParser.SubtitleService(unsignedShort, unsignedShort2);
    }

    private static byte[] buildClutMapTable(int i3, int i9, androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) parsableBitArray.readBits(i9);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i3 = 1; i3 < 16; i3++) {
            if (i3 < 8) {
                iArr[i3] = getColor(255, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i3] = getColor(255, (i3 & 1) != 0 ? 127 : 0, (i3 & 2) != 0 ? 127 : 0, (i3 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = getColor(63, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i9 = i3 & androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_HD;
                if (i9 == 0) {
                    iArr[i3] = getColor(255, ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i9 == 8) {
                    iArr[i3] = getColor(127, ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i9 == 128) {
                    iArr[i3] = getColor(255, ((i3 & 1) != 0 ? 43 : 0) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i9 == 136) {
                    iArr[i3] = getColor(255, ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i3, int i9, int i10, int i11) {
        return (i3 << 24) | (i9 << 16) | (i10 << 8) | i11;
    }

    private static int paint2BitPixelCodeString(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i3, int i9, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int i10;
        int bits;
        int bits2;
        boolean z6 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 != 0) {
                z6 = z6;
                i10 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(3) + 3;
                    bits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        i10 = 1;
                    } else {
                        int bits4 = parsableBitArray.readBits(2);
                        if (bits4 == 0) {
                            z6 = true;
                        } else if (bits4 == 1) {
                            i10 = 2;
                        } else if (bits4 == 2) {
                            bits = parsableBitArray.readBits(4) + 12;
                            bits2 = parsableBitArray.readBits(2);
                        } else if (bits4 != 3) {
                            z6 = z6;
                        } else {
                            bits = parsableBitArray.readBits(8) + 29;
                            bits2 = parsableBitArray.readBits(2);
                        }
                        bits3 = 0;
                        i10 = 0;
                    }
                    bits3 = 0;
                }
                z6 = z6;
                i10 = bits;
                bits3 = bits2;
            }
            if (i10 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i3, i9, i3 + i10, 1 + i9, paint);
            }
            i3 += i10;
            if (z6) {
                return i3;
            }
            z6 = z6;
        }
    }

    private static int paint4BitPixelCodeString(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i3, int i9, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int i10;
        int bits;
        int bits2;
        boolean z6 = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(4);
            if (bits3 != 0) {
                z6 = z6;
                i10 = 1;
            } else if (parsableBitArray.readBit()) {
                if (parsableBitArray.readBit()) {
                    int bits4 = parsableBitArray.readBits(2);
                    if (bits4 == 0) {
                        i10 = 1;
                        bits3 = 0;
                    } else if (bits4 == 1) {
                        bits3 = 0;
                        i10 = 2;
                        z6 = z6;
                    } else if (bits4 == 2) {
                        bits = parsableBitArray.readBits(4) + 9;
                        bits2 = parsableBitArray.readBits(4);
                    } else if (bits4 != 3) {
                        z6 = z6;
                        bits3 = 0;
                        i10 = 0;
                    } else {
                        bits = parsableBitArray.readBits(8) + 25;
                        bits2 = parsableBitArray.readBits(4);
                    }
                } else {
                    bits = parsableBitArray.readBits(2) + 4;
                    bits2 = parsableBitArray.readBits(4);
                }
                z6 = z6;
                i10 = bits;
                bits3 = bits2;
            } else {
                int bits5 = parsableBitArray.readBits(3);
                if (bits5 != 0) {
                    i10 = bits5 + 2;
                    bits3 = 0;
                } else {
                    z6 = true;
                    bits3 = 0;
                    i10 = 0;
                }
            }
            if (i10 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i3, i9, i3 + i10, 1 + i9, paint);
            }
            i3 += i10;
            if (z6) {
                return i3;
            }
            z6 = z6;
        }
    }

    private static int paint8BitPixelCodeString(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i3, int i9, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        boolean z6;
        int bits;
        boolean z9 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(8);
            if (bits2 != 0) {
                z6 = z9;
                bits = 1;
            } else if (parsableBitArray.readBit()) {
                z6 = z9;
                bits = parsableBitArray.readBits(7);
                bits2 = parsableBitArray.readBits(8);
            } else {
                int bits3 = parsableBitArray.readBits(7);
                if (bits3 != 0) {
                    z6 = z9;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z6 = true;
                    bits2 = 0;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i3, i9, i3 + bits, 1 + i9, paint);
            }
            i3 += bits;
            if (z6) {
                return i3;
            }
            z9 = z6;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i3, int i9, int i10, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int[] iArr2;
        android.graphics.Paint paint2;
        android.graphics.Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        int iPaint2BitPixelCodeString = i9;
        int i11 = i10;
        byte[] bArrBuildClutMapTable3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i3 != 3) {
                            if (i3 == 2) {
                                bArr3 = bArrBuildClutMapTable2 == null ? defaultMap2To4 : bArrBuildClutMapTable2;
                            } else {
                                bArr2 = null;
                            }
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i11, paint2, canvas2);
                            parsableBitArray.byteAlign();
                        } else {
                            bArr3 = bArrBuildClutMapTable3 == null ? defaultMap2To8 : bArrBuildClutMapTable3;
                        }
                        bArr2 = bArr3;
                        iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, iPaint2BitPixelCodeString, i11, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 17:
                        iArr2 = iArr;
                        android.graphics.Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(parsableBitArray, iArr2, i3 == 3 ? bArrBuildClutMapTable == null ? defaultMap4To8 : bArrBuildClutMapTable : null, iPaint2BitPixelCodeString, i11, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(parsableBitArray, iArr2, null, iPaint2BitPixelCodeString, i11, paint2, canvas2);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable2 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrBuildClutMapTable = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i11 += 2;
                iPaint2BitPixelCodeString = i9;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void paintPixelDataSubBlocks(androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData, androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition, int i3, int i9, int i10, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int[] iArr;
        if (i3 == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else {
            iArr = i3 == 2 ? clutDefinition.clutEntries4Bit : clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i3, i9, i10, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i3, i9, i10 + 1, paint, canvas);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition parseClutDefinition(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3) {
        int[] iArr;
        int bits;
        int i9;
        int bits2;
        int bits3;
        int bits4;
        int i10 = 8;
        int bits5 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i11 = 2;
        int i12 = i3 - 2;
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i12 > 0) {
            int bits6 = parsableBitArray.readBits(i10);
            int bits7 = parsableBitArray.readBits(i10);
            if ((bits7 & 128) != 0) {
                iArr = iArrGenerateDefault2BitClutEntries;
            } else {
                iArr = (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            }
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray.readBits(i10);
                bits4 = parsableBitArray.readBits(i10);
                bits = parsableBitArray.readBits(i10);
                bits2 = parsableBitArray.readBits(i10);
                i9 = i12 - 6;
            } else {
                int bits8 = parsableBitArray.readBits(6) << i11;
                int bits9 = parsableBitArray.readBits(4) << 4;
                bits = parsableBitArray.readBits(4) << 4;
                i9 = i12 - 4;
                bits2 = parsableBitArray.readBits(i11) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d4 = bits3;
            double d6 = bits4 - 128;
            double d9 = bits - 128;
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), androidx.media3.common.util.Util.constrainValue((int) ((1.402d * d6) + d4), 0, 255), androidx.media3.common.util.Util.constrainValue((int) ((d4 - (0.34414d * d9)) - (d6 * 0.71414d)), 0, 255), androidx.media3.common.util.Util.constrainValue((int) ((d9 * 1.772d) + d4), 0, 255));
            i12 = i9;
            bits5 = bits5;
            i10 = 8;
            i11 = 2;
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition parseDisplayDefinition(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int i3;
        int i9;
        int i10;
        int bits;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        if (bit) {
            int bits4 = parsableBitArray.readBits(16);
            int bits5 = parsableBitArray.readBits(16);
            int bits6 = parsableBitArray.readBits(16);
            bits = parsableBitArray.readBits(16);
            i10 = bits5;
            i9 = bits6;
            i3 = bits4;
        } else {
            i3 = 0;
            i9 = 0;
            i10 = bits2;
            bits = bits3;
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition(bits2, bits3, i3, i10, i9, bits);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.ObjectData parseObjectData(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = parsableBitArray.readBits(16);
                int bits4 = parsableBitArray.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    parsableBitArray.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    parsableBitArray.readBytes(bArr, 0, bits4);
                }
            }
            return new androidx.media3.extractor.text.dvb.DvbParser.ObjectData(bits, bit, bArr2, bArr);
        }
        parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        bArr = bArr2;
        return new androidx.media3.extractor.text.dvb.DvbParser.ObjectData(bits, bit, bArr2, bArr);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.PageComposition parsePageComposition(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3) {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(4);
        int bits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i9 = i3 - 2;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        while (i9 > 0) {
            int bits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i9 -= 6;
            sparseArray.put(bits4, new androidx.media3.extractor.text.dvb.DvbParser.PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.PageComposition(bits, bits2, bits3, sparseArray);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.RegionComposition parseRegionComposition(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3) {
        int i9;
        int bits;
        int bits2;
        char c9;
        int bits3 = parsableBitArray.readBits(8);
        int i10 = 4;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i11 = 16;
        int bits4 = parsableBitArray.readBits(16);
        int bits5 = parsableBitArray.readBits(16);
        int bits6 = parsableBitArray.readBits(3);
        int bits7 = parsableBitArray.readBits(3);
        int i12 = 2;
        parsableBitArray.skipBits(2);
        int bits8 = parsableBitArray.readBits(8);
        int bits9 = parsableBitArray.readBits(8);
        int bits10 = parsableBitArray.readBits(4);
        int bits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i13 = i3 - 10;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        while (i13 > 0) {
            int bits12 = parsableBitArray.readBits(i11);
            int bits13 = parsableBitArray.readBits(i12);
            int bits14 = parsableBitArray.readBits(i12);
            int bits15 = parsableBitArray.readBits(12);
            parsableBitArray.skipBits(i10);
            int bits16 = parsableBitArray.readBits(12);
            int i14 = i13 - 6;
            if (bits13 != 1) {
                i9 = 2;
                if (bits13 != 2) {
                    bits2 = 0;
                    bits = 0;
                    i13 = i14;
                    c9 = '\b';
                }
                sparseArray.put(bits12, new androidx.media3.extractor.text.dvb.DvbParser.RegionObject(bits13, bits14, bits15, bits16, bits2, bits));
                i11 = 16;
                i12 = i9;
                i10 = 4;
            } else {
                i9 = 2;
            }
            c9 = '\b';
            i13 -= 8;
            bits2 = parsableBitArray.readBits(8);
            bits = parsableBitArray.readBits(8);
            sparseArray.put(bits12, new androidx.media3.extractor.text.dvb.DvbParser.RegionObject(bits13, bits14, bits15, bits16, bits2, bits));
            i11 = 16;
            i12 = i9;
            i10 = 4;
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.RegionComposition(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void parseSubtitlingSegment(androidx.media3.common.util.ParsableBitArray parsableBitArray, androidx.media3.extractor.text.dvb.DvbParser.SubtitleService subtitleService) {
        androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition;
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + bits3;
        if (bits3 * 8 > parsableBitArray.bitsLeft()) {
            androidx.media3.common.util.Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == subtitleService.subtitlePageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition = subtitleService.pageComposition;
                    androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition2 = parsePageComposition(parsableBitArray, bits3);
                    if (pageComposition2.state != 0) {
                        subtitleService.pageComposition = pageComposition2;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                    } else if (pageComposition != null && pageComposition.version != pageComposition2.version) {
                        subtitleService.pageComposition = pageComposition2;
                    }
                }
                break;
            case 17:
                androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition3 = subtitleService.pageComposition;
                if (bits2 == subtitleService.subtitlePageId && pageComposition3 != null) {
                    androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition2 = parseRegionComposition(parsableBitArray, bits3);
                    if (pageComposition3.state == 0 && (regionComposition = subtitleService.regions.get(regionComposition2.id)) != null) {
                        regionComposition2.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(regionComposition2.id, regionComposition2);
                }
                break;
            case 18:
                if (bits2 == subtitleService.subtitlePageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.cluts.put(clutDefinition.id, clutDefinition);
                } else if (bits2 == subtitleService.ancillaryPageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition2 = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.ancillaryCluts.put(clutDefinition2.id, clutDefinition2);
                }
                break;
            case 19:
                if (bits2 == subtitleService.subtitlePageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(objectData.id, objectData);
                } else if (bits2 == subtitleService.ancillaryPageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(objectData2.id, objectData2);
                }
                break;
            case 20:
                if (bits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i3, int i9, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr, i9 + i3);
        parsableBitArray.setPosition(i3);
        consumer.accept(parse(parsableBitArray));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
        this.subtitleService.reset();
    }

    private androidx.media3.extractor.text.CuesWithTiming parse(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int i3;
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        androidx.media3.extractor.text.dvb.DvbParser.SubtitleService subtitleService = this.subtitleService;
        androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition = subtitleService.pageComposition;
        if (pageComposition == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return new androidx.media3.extractor.text.CuesWithTiming(p076i4.S0.f22832l, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        }
        androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, android.graphics.Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas.setBitmap(bitmapCreateBitmap);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> sparseArray = pageComposition.regions;
        int i9 = 0;
        while (i9 < sparseArray.size()) {
            this.canvas.save();
            androidx.media3.extractor.text.dvb.DvbParser.PageRegion pageRegionValueAt = sparseArray.valueAt(i9);
            androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray.keyAt(i9));
            int i10 = pageRegionValueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i11 = pageRegionValueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.canvas.clipRect(i10, i11, java.lang.Math.min(regionComposition.width + i10, displayDefinition.horizontalPositionMaximum), java.lang.Math.min(regionComposition.height + i11, displayDefinition.verticalPositionMaximum));
            androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition2 = clutDefinition;
            android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> sparseArray2 = regionComposition.regionObjects;
            int i12 = 0;
            while (i12 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i12);
                androidx.media3.extractor.text.dvb.DvbParser.RegionObject regionObjectValueAt = sparseArray2.valueAt(i12);
                androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData = this.subtitleService.objects.get(iKeyAt);
                if (objectData == null) {
                    objectData = this.subtitleService.ancillaryObjects.get(iKeyAt);
                }
                if (objectData != null) {
                    paintPixelDataSubBlocks(objectData, clutDefinition2, regionComposition.depth, regionObjectValueAt.horizontalPosition + i10, regionObjectValueAt.verticalPosition + i11, objectData.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                }
                i12++;
                sparseArray = sparseArray;
            }
            android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> sparseArray3 = sparseArray;
            if (regionComposition.fillFlag) {
                int i13 = regionComposition.depth;
                if (i13 == 3) {
                    i3 = clutDefinition2.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (i13 == 2) {
                    i3 = clutDefinition2.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i3 = clutDefinition2.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i3);
                this.canvas.drawRect(i10, i11, regionComposition.width + i10, regionComposition.height + i11, this.fillRegionPaint);
            }
            arrayList.add(new androidx.media3.common.text.Cue.Builder().setBitmap(android.graphics.Bitmap.createBitmap(this.bitmap, i10, i11, regionComposition.width, regionComposition.height)).setPosition(i10 / displayDefinition.width).setPositionAnchor(0).setLine(i11 / displayDefinition.height, 0).setLineAnchor(0).setSize(regionComposition.width / displayDefinition.width).setBitmapHeight(regionComposition.height / displayDefinition.height).build());
            this.canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            this.canvas.restore();
            i9++;
            sparseArray = sparseArray3;
        }
        return new androidx.media3.extractor.text.CuesWithTiming(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
    }
}
