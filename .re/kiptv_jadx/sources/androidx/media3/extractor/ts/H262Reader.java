package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class H262Reader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final java.lang.String containerMimeType;
    private final androidx.media3.extractor.ts.H262Reader.CsdBuffer csdBuffer;
    private java.lang.String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private androidx.media3.extractor.TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final androidx.media3.extractor.ts.NalUnitTargetBuffer userData;
    private final androidx.media3.common.util.ParsableByteArray userDataParsable;
    private final androidx.media3.extractor.ts.UserDataReader userDataReader;

    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i3) {
            this.data = new byte[i3];
        }

        public void onData(byte[] bArr, int i3, int i9) {
            if (this.isFilling) {
                int i10 = i9 - i3;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i11 = this.length;
                if (length < i11 + i10) {
                    this.data = java.util.Arrays.copyOf(bArr2, (i11 + i10) * 2);
                }
                java.lang.System.arraycopy(bArr, i3, this.data, this.length, i10);
                this.length += i10;
            }
        }

        public boolean onStartCode(int i3, int i9) {
            if (this.isFilling) {
                int i10 = this.length - i9;
                this.length = i10;
                if (this.sequenceExtensionPosition != 0 || i3 != androidx.media3.extractor.ts.H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i10;
            } else if (i3 == androidx.media3.extractor.ts.H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    public H262Reader(java.lang.String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    private static android.util.Pair<androidx.media3.common.Format, java.lang.Long> parseCsdBuffer(androidx.media3.extractor.ts.H262Reader.CsdBuffer csdBuffer, java.lang.String str, java.lang.String str2) {
        float f9;
        int i3;
        float f10;
        int i9;
        long j;
        double[] dArr;
        double d4;
        int i10;
        int i11;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i12 = bArrCopyOf[4] & 255;
        byte b9 = bArrCopyOf[5];
        int i13 = (i12 << 4) | ((b9 & 255) >> 4);
        int i14 = ((b9 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i15 = (bArrCopyOf[7] & 240) >> 4;
        if (i15 == 2) {
            f9 = i14 * 4;
            i3 = i13 * 3;
        } else {
            if (i15 != 3) {
                if (i15 != 4) {
                    f10 = 1.0f;
                } else {
                    f9 = i14 * 121;
                    i3 = i13 * 100;
                }
                androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_MPEG2).setWidth(i13).setHeight(i14).setPixelWidthHeightRatio(f10).setInitializationData(java.util.Collections.singletonList(bArrCopyOf)).build();
                i9 = (bArrCopyOf[7] & 15) - 1;
                if (i9 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i9 < dArr.length) {
                        d4 = dArr[i9];
                        byte b10 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i10 = (b10 & 96) >> 5;
                        i11 = b10 & 31;
                        if (i10 != i11) {
                            d4 *= (((double) i10) + 1.0d) / ((double) (i11 + 1));
                        }
                        j = (long) (1000000.0d / d4);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return android.util.Pair.create(formatBuild, java.lang.Long.valueOf(j));
            }
            f9 = i14 * 16;
            i3 = i13 * 9;
        }
        f10 = f9 / i3;
        androidx.media3.common.Format formatBuild2 = new androidx.media3.common.Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_MPEG2).setWidth(i13).setHeight(i14).setPixelWidthHeightRatio(f10).setInitializationData(java.util.Collections.singletonList(bArrCopyOf)).build();
        i9 = (bArrCopyOf[7] & 15) - 1;
        if (i9 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i9 < dArr.length) {
                d4 = dArr[i9];
                byte b11 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i10 = (b11 & 96) >> 5;
                i11 = b11 & 31;
                if (i10 != i11) {
                    d4 *= (((double) i10) + 1.0d) / ((double) (i11 + 1));
                }
                j = (long) (1000000.0d / d4);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return android.util.Pair.create(formatBuild2, java.lang.Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        boolean z6;
        int i3;
        this.output.getClass();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = androidx.media3.container.NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i9 = iFindNalUnit + 3;
            int i10 = parsableByteArray.getData()[i9] & 255;
            int i11 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i11 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i10, i11 < 0 ? -i11 : 0)) {
                    androidx.media3.extractor.ts.H262Reader.CsdBuffer csdBuffer = this.csdBuffer;
                    java.lang.String str = this.formatId;
                    str.getClass();
                    android.util.Pair<androidx.media3.common.Format, java.lang.Long> csdBuffer2 = parseCsdBuffer(csdBuffer, str, this.containerMimeType);
                    this.output.format((androidx.media3.common.Format) csdBuffer2.first);
                    this.frameDurationUs = ((java.lang.Long) csdBuffer2.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i11 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i3 = 0;
                } else {
                    i3 = -i11;
                }
                if (this.userData.endNalUnit(i3)) {
                    androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((androidx.media3.common.util.ParsableByteArray) androidx.media3.common.util.Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, androidx.media3.container.NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((androidx.media3.extractor.ts.UserDataReader) androidx.media3.common.util.Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i10 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i10);
                }
            }
            if (i10 == 0 || i10 == START_SEQUENCE_HEADER) {
                int i12 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j = this.sampleTimeUs;
                    if (j != androidx.media3.common.C.TIME_UNSET) {
                        this.output.sampleMetadata(j, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i12, i12, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i12);
                    long j9 = this.pesTimeUs;
                    if (j9 == androidx.media3.common.C.TIME_UNSET) {
                        long j10 = this.sampleTimeUs;
                        j9 = j10 != androidx.media3.common.C.TIME_UNSET ? j10 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j9;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = androidx.media3.common.C.TIME_UNSET;
                    z6 = true;
                    this.startedFirstSample = true;
                } else {
                    z6 = true;
                }
                this.sampleHasPicture = i10 == 0 ? z6 : false;
            } else {
                if (i10 == START_GROUP) {
                    this.sampleIsKeyframe = true;
                }
                iLimit = iLimit;
            }
            iLimit = iLimit;
            position = i9;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        androidx.media3.extractor.ts.UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z6) {
        this.output.getClass();
        if (z6) {
            boolean z9 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z9 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i3) {
        this.pesTimeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        androidx.media3.container.NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    public H262Reader(androidx.media3.extractor.ts.UserDataReader userDataReader, java.lang.String str) {
        this.userDataReader = userDataReader;
        this.containerMimeType = str;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new androidx.media3.extractor.ts.H262Reader.CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new androidx.media3.extractor.ts.NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new androidx.media3.common.util.ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    }
}
