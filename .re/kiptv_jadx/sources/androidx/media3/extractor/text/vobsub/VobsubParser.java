package androidx.media3.extractor.text.vobsub;

/* JADX INFO: loaded from: classes.dex */
public final class VobsubParser implements androidx.media3.extractor.text.SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    public static final androidx.media3.extractor.text.CuesWithTiming EMPTY_CUES;
    private static final java.lang.String TAG = "VobsubParser";
    private final androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder cueBuilder;
    private java.util.zip.Inflater inflater;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.common.util.ParsableByteArray inflatedScratch = new androidx.media3.common.util.ParsableByteArray();

    public static final class CueBuilder {
        private static final int CMD_ALPHA = 4;
        private static final int CMD_AREA = 5;
        private static final int CMD_COLORS = 3;
        private static final int CMD_END = 255;
        private static final int CMD_FORCE_START = 0;
        private static final int CMD_OFFSETS = 6;
        private static final int CMD_START = 1;
        private static final int CMD_STOP = 2;
        private android.graphics.Rect boundingBox;
        private boolean hasColors;
        private boolean hasPlane;
        private int[] palette;
        private int planeHeight;
        private int planeWidth;
        private long startTimeUs = androidx.media3.common.C.TIME_UNSET;
        private long endTimeUs = androidx.media3.common.C.TIME_UNSET;
        private final int[] colors = new int[4];
        private int dataOffset0 = -1;
        private int dataOffset1 = -1;

        public static final class Run {
            public int colorIndex;
            public int length;

            private Run() {
            }
        }

        private static int getColor(int[] iArr, int i3) {
            return (i3 < 0 || i3 >= iArr.length) ? iArr[0] : iArr[i3];
        }

        private static int parseColor(java.lang.String str) {
            try {
                return java.lang.Integer.parseInt(str, 16);
            } catch (java.lang.RuntimeException e6) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Parsing color failed", e6);
                return 0;
            }
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.palette"})
        private boolean parseCommand(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            if (unsignedByte == 255) {
                return false;
            }
            switch (unsignedByte) {
                case 1:
                    this.startTimeUs = j;
                case 0:
                    return true;
                case 2:
                    this.endTimeUs = j;
                    return true;
                case 3:
                    return parseControlColors(parsableByteArray);
                case 4:
                    return parseControlAlpha(parsableByteArray);
                case 5:
                    return parseControlArea(parsableByteArray);
                case 6:
                    return parseControlOffsets(parsableByteArray);
                default:
                    Y6.f.p(unsignedByte, "Unrecognized command: ", androidx.media3.extractor.text.vobsub.VobsubParser.TAG);
                    return false;
            }
        }

        private boolean parseControlAlpha(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Incomplete alpha command");
                return false;
            }
            if (!this.hasColors) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Ignoring alpha command before color command");
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int[] iArr = this.colors;
            iArr[3] = setAlpha(iArr[3], unsignedByte >> 4);
            int[] iArr2 = this.colors;
            iArr2[2] = setAlpha(iArr2[2], unsignedByte & 15);
            int[] iArr3 = this.colors;
            iArr3[1] = setAlpha(iArr3[1], unsignedByte2 >> 4);
            int[] iArr4 = this.colors;
            iArr4[0] = setAlpha(iArr4[0], unsignedByte2 & 15);
            return true;
        }

        private boolean parseControlArea(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 6) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Incomplete area command");
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int i3 = (unsignedByte << 4) | (unsignedByte2 >> 4);
            int unsignedByte3 = ((unsignedByte2 & 15) << 8) | parsableByteArray.readUnsignedByte();
            int unsignedByte4 = parsableByteArray.readUnsignedByte();
            int unsignedByte5 = parsableByteArray.readUnsignedByte();
            this.boundingBox = new android.graphics.Rect(i3, (unsignedByte4 << 4) | (unsignedByte5 >> 4), unsignedByte3 + 1, (parsableByteArray.readUnsignedByte() | ((unsignedByte5 & 15) << 8)) + 1);
            return true;
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.palette"})
        private boolean parseControlColors(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Incomplete color command");
                return false;
            }
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            this.colors[3] = getColor(this.palette, unsignedByte >> 4);
            this.colors[2] = getColor(this.palette, unsignedByte & 15);
            this.colors[1] = getColor(this.palette, unsignedByte2 >> 4);
            this.colors[0] = getColor(this.palette, unsignedByte2 & 15);
            this.hasColors = true;
            return true;
        }

        private boolean parseControlOffsets(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 4) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Incomplete offsets command");
                return false;
            }
            this.dataOffset0 = parsableByteArray.readUnsignedShort();
            this.dataOffset1 = parsableByteArray.readUnsignedShort();
            return true;
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.palette"})
        private boolean parseControlSequence(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
            boolean z6 = false;
            if (parsableByteArray.bytesLeft() < 4) {
                return false;
            }
            int position = parsableByteArray.getPosition();
            int unsignedShort = parsableByteArray.readUnsignedShort() * 10000;
            int unsignedShort2 = parsableByteArray.readUnsignedShort() + i3;
            boolean command = true;
            if (unsignedShort2 != position && unsignedShort2 < parsableByteArray.limit()) {
                z6 = true;
            }
            int iLimit = z6 ? unsignedShort2 : parsableByteArray.limit();
            while (parsableByteArray.getPosition() < iLimit && command) {
                command = parseCommand(unsignedShort, parsableByteArray);
            }
            if (z6) {
                parsableByteArray.setPosition(unsignedShort2);
            }
            return z6;
        }

        private void parseRleData(androidx.media3.common.util.ParsableBitArray parsableBitArray, boolean z6, android.graphics.Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i3 = !z6 ? 1 : 0;
            int i9 = i3 * iWidth;
            androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.Run run = new androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.Run();
            while (true) {
                int i10 = 0;
                do {
                    parseRun(parsableBitArray, iWidth, run);
                    int iMin = java.lang.Math.min(run.length, iWidth - i10);
                    if (iMin > 0) {
                        int i11 = i9 + iMin;
                        java.util.Arrays.fill(iArr, i9, i11, this.colors[run.colorIndex]);
                        i10 += iMin;
                        i9 = i11;
                    }
                } while (i10 < iWidth);
                i3 += 2;
                if (i3 >= iHeight) {
                    return;
                }
                i9 = i3 * iWidth;
                parsableBitArray.byteAlign();
            }
        }

        private static void parseRun(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i3, androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder.Run run) {
            int bits = 0;
            for (int i9 = 1; bits < i9 && i9 <= 64; i9 <<= 2) {
                if (parsableBitArray.bitsLeft() < 4) {
                    run.colorIndex = -1;
                    run.length = 0;
                    return;
                }
                bits = (bits << 4) | parsableBitArray.readBits(4);
            }
            run.colorIndex = bits & 3;
            if (bits >= 4) {
                i3 = bits >> 2;
            }
            run.length = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseSpuControlSequenceTable(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            if (this.palette == null) {
                androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Skipping SPU (no palette)");
            } else {
                if (!this.hasPlane) {
                    androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Skipping SPU (no plane)");
                    return;
                }
                int position = parsableByteArray.getPosition() - 2;
                parsableByteArray.setPosition(parsableByteArray.readUnsignedShort() + position);
                while (parseControlSequence(parsableByteArray, position)) {
                }
            }
        }

        private static int setAlpha(int i3, int i9) {
            return (i3 & 16777215) | ((i9 * 17) << 24);
        }

        public androidx.media3.common.text.Cue build(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            android.graphics.Rect rect;
            if (this.palette == null || !this.hasPlane || !this.hasColors || (rect = this.boundingBox) == null || this.dataOffset0 == -1 || this.dataOffset1 == -1 || rect.width() < 2 || this.boundingBox.height() < 2) {
                return null;
            }
            android.graphics.Rect rect2 = this.boundingBox;
            int[] iArr = new int[rect2.height() * rect2.width()];
            androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
            parsableByteArray.setPosition(this.dataOffset0);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, true, rect2, iArr);
            parsableByteArray.setPosition(this.dataOffset1);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, false, rect2, iArr);
            return new androidx.media3.common.text.Cue.Builder().setBitmap(android.graphics.Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), android.graphics.Bitmap.Config.ARGB_8888)).setPosition(rect2.left / this.planeWidth).setPositionAnchor(0).setLine(rect2.top / this.planeHeight, 0).setLineAnchor(0).setSize(rect2.width() / this.planeWidth).setBitmapHeight(rect2.height() / this.planeHeight).build();
        }

        public void parseIdx(java.lang.String str) {
            for (java.lang.String str2 : androidx.media3.common.util.Util.split(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str2.substring(9), ",");
                    this.palette = new int[strArrSplit.length];
                    for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                        this.palette[i3] = parseColor(strArrSplit[i3].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    java.lang.String[] strArrSplit2 = androidx.media3.common.util.Util.split(str2.substring(6).trim(), "x");
                    if (strArrSplit2.length != 2) {
                        androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Ignoring malformed IDX size line: '" + str2 + "'");
                    } else {
                        try {
                            this.planeWidth = java.lang.Integer.parseInt(strArrSplit2[0]);
                            this.planeHeight = java.lang.Integer.parseInt(strArrSplit2[1]);
                            this.hasPlane = true;
                        } catch (java.lang.RuntimeException e6) {
                            androidx.media3.common.util.Log.w(androidx.media3.extractor.text.vobsub.VobsubParser.TAG, "Parsing IDX failed", e6);
                        }
                    }
                }
            }
        }

        public void reset() {
            this.startTimeUs = androidx.media3.common.C.TIME_UNSET;
            this.endTimeUs = androidx.media3.common.C.TIME_UNSET;
            this.hasColors = false;
            this.boundingBox = null;
            this.dataOffset0 = -1;
            this.dataOffset1 = -1;
        }
    }

    static {
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        EMPTY_CUES = new androidx.media3.extractor.text.CuesWithTiming(p076i4.S0.f22832l, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
    }

    public VobsubParser(java.util.List<byte[]> list) {
        androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder cueBuilder = new androidx.media3.extractor.text.vobsub.VobsubParser.CueBuilder();
        this.cueBuilder = cueBuilder;
        cueBuilder.parseIdx(new java.lang.String(list.get(0), java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i3, int i9, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        this.scratch.reset(bArr, i9 + i3);
        this.scratch.setPosition(i3);
        consumer.accept(parse());
    }

    private androidx.media3.extractor.text.CuesWithTiming parse() {
        p076i4.S0 s0Y;
        if (this.inflater == null) {
            this.inflater = new java.util.zip.Inflater();
        }
        if (androidx.media3.common.util.Util.maybeInflate(this.scratch, this.inflatedScratch, this.inflater)) {
            this.scratch.reset(this.inflatedScratch.getData(), this.inflatedScratch.limit());
        }
        this.cueBuilder.reset();
        int iBytesLeft = this.scratch.bytesLeft();
        if (iBytesLeft >= 2 && this.scratch.readUnsignedShort() == iBytesLeft) {
            this.cueBuilder.parseSpuControlSequenceTable(this.scratch);
            androidx.media3.common.text.Cue cueBuild = this.cueBuilder.build(this.scratch);
            long j = this.cueBuilder.endTimeUs;
            long j9 = androidx.media3.common.C.TIME_UNSET;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                j9 = (this.cueBuilder.startTimeUs == androidx.media3.common.C.TIME_UNSET || this.cueBuilder.endTimeUs <= this.cueBuilder.startTimeUs) ? this.cueBuilder.endTimeUs : this.cueBuilder.endTimeUs - this.cueBuilder.startTimeUs;
            }
            long j10 = j9;
            if (cueBuild != null) {
                s0Y = p076i4.AbstractC2186b0.y(cueBuild);
            } else {
                s0Y = p076i4.S0.f22832l;
            }
            return new androidx.media3.extractor.text.CuesWithTiming(s0Y, this.cueBuilder.startTimeUs, j10);
        }
        return EMPTY_CUES;
    }
}
