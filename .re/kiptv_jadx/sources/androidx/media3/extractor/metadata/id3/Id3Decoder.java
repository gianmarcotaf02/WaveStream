package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Decoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate NO_FRAMES_PREDICATE = new D1.C0223h(18);
    private static final java.lang.String TAG = "Id3Decoder";
    private final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i3, int i9, int i10, int i11, int i12);
    }

    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i3, boolean z6, int i9) {
            this.majorVersion = i3;
            this.isUnsynchronized = z6;
            this.framesSize = i9;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i3, int i9) {
        return i9 <= i3 ? androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY : java.util.Arrays.copyOfRange(bArr, i3, i9);
    }

    private static androidx.media3.extractor.metadata.id3.ApicFrame decodeApicFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
        int iIndexOfZeroByte;
        java.lang.String strConcat;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(unsignedByte);
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        if (i9 == 2) {
            strConcat = "image/" + com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(new java.lang.String(bArr, 0, 3, java.nio.charset.StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = androidx.media3.common.MimeTypes.IMAGE_JPEG;
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(new java.lang.String(bArr, 0, iIndexOfZeroByte, java.nio.charset.StandardCharsets.ISO_8859_1));
            strConcat = strI0.indexOf(47) == -1 ? "image/".concat(strI0) : strI0;
        }
        int i11 = bArr[iIndexOfZeroByte + 1] & 255;
        int i12 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i12, unsignedByte);
        return new androidx.media3.extractor.metadata.id3.ApicFrame(strConcat, new java.lang.String(bArr, i12, iIndexOfTerminator - i12, charset), i11, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i10));
    }

    private static androidx.media3.extractor.metadata.id3.BinaryFrame decodeBinaryFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, java.lang.String str) {
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new androidx.media3.extractor.metadata.id3.BinaryFrame(str, bArr);
    }

    private static androidx.media3.extractor.metadata.id3.ChapterFrame decodeChapterFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, boolean z6, int i10, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) throws java.lang.Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        java.lang.String str = new java.lang.String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, java.nio.charset.StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i11 = parsableByteArray.readInt();
        int i12 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i13 = position + i3;
        while (parsableByteArray.getPosition() < i13) {
            androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeFrame = decodeFrame(i9, parsableByteArray, z6, i10, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new androidx.media3.extractor.metadata.id3.ChapterFrame(str, i11, i12, unsignedInt, j, (androidx.media3.extractor.metadata.id3.Id3Frame[]) arrayList.toArray(new androidx.media3.extractor.metadata.id3.Id3Frame[0]));
    }

    private static androidx.media3.extractor.metadata.id3.ChapterTocFrame decodeChapterTOCFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, boolean z6, int i10, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) throws java.lang.Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        java.lang.String str = new java.lang.String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, java.nio.charset.StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z9 = (unsignedByte & 2) != 0;
        boolean z10 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        java.lang.String[] strArr = new java.lang.String[unsignedByte2];
        for (int i11 = 0; i11 < unsignedByte2; i11++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i11] = new java.lang.String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, java.nio.charset.StandardCharsets.ISO_8859_1);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i12 = position + i3;
        while (parsableByteArray.getPosition() < i12) {
            androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeFrame = decodeFrame(i9, parsableByteArray, z6, i10, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new androidx.media3.extractor.metadata.id3.ChapterTocFrame(str, z9, z10, strArr, (androidx.media3.extractor.metadata.id3.Id3Frame[]) arrayList.toArray(new androidx.media3.extractor.metadata.id3.Id3Frame[0]));
    }

    private static androidx.media3.extractor.metadata.id3.CommentFrame decodeCommentFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        if (i3 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        java.lang.String str = new java.lang.String(bArr, 0, 3);
        int i9 = i3 - 4;
        byte[] bArr2 = new byte[i9];
        parsableByteArray.readBytes(bArr2, 0, i9);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        java.lang.String str2 = new java.lang.String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new androidx.media3.extractor.metadata.id3.CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    /* JADX WARN: Code duplicated, block: B:190:0x024b  */
    /* JADX WARN: Instruction removed from duplicated block: B:190:0x024b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    private static androidx.media3.extractor.metadata.id3.Id3Frame decodeFrame(int i3, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z6, int i9, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) throws java.lang.Throwable {
        int unsignedIntToInt;
        int i10;
        ?? r9;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r10;
        int i11;
        int i12;
        ?? r11;
        java.lang.Throwable th;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeChapterFrame;
        int i13 = i3;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        boolean z13 = false;
        int unsignedByte4 = i13 >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i13 == 4) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (!z6) {
                unsignedIntToInt = (((unsignedIntToInt >> 24) & 255) << 21) | (unsignedIntToInt & 255) | (((unsignedIntToInt >> 8) & 255) << 7) | (((unsignedIntToInt >> 16) & 255) << 14);
            }
        } else {
            unsignedIntToInt = i13 == 3 ? parsableByteArray.readUnsignedIntToInt() : parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedIntToInt;
        int unsignedShort = i13 >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray.limit()) {
            androidx.media3.common.util.Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            boolean zEvaluate = framePredicate.evaluate(i13, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4);
            r9 = unsignedByte;
            i10 = unsignedByte2;
            if (!zEvaluate) {
                i13 = i13;
                parsableByteArray.setPosition(position);
                return null;
            }
        } else {
            i10 = unsignedByte2;
            r9 = unsignedByte;
        }
        i13 = i13;
        if (i13 == 3) {
            z9 = (unsignedShort & 128) != 0;
            boolean z14 = (unsignedShort & 64) != 0;
            z12 = false;
            z13 = z9;
            z10 = (unsignedShort & 32) != 0;
            z11 = z14;
        } else if (i13 == 4) {
            boolean z15 = (unsignedShort & 64) != 0;
            boolean z16 = (unsignedShort & 8) != 0;
            boolean z17 = (unsignedShort & 4) != 0;
            boolean z18 = (unsignedShort & 2) != 0;
            z13 = (unsignedShort & 1) != 0;
            z10 = z15;
            z9 = z13;
            z13 = z16;
            z11 = z17;
            z12 = z18;
        } else {
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (z13 || z11) {
            androidx.media3.common.util.Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(position);
            return null;
        }
        if (z10) {
            iRemoveUnsynchronization--;
            parsableByteArray.skipBytes(1);
        }
        if (z9) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z12) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            try {
                if (r9 == 84 && i10 == 88 && unsignedByte3 == 88 && (i13 == 2 || unsignedByte4 == 88)) {
                    id3FrameDecodeChapterFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
                } else if (r9 == 84) {
                    id3FrameDecodeChapterFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i13, r9, i10, unsignedByte3, unsignedByte4));
                } else if (r9 == 87 && i10 == 88 && unsignedByte3 == 88 && (i13 == 2 || unsignedByte4 == 88)) {
                    id3FrameDecodeChapterFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
                } else if (r9 == 87) {
                    id3FrameDecodeChapterFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i13, r9, i10, unsignedByte3, unsignedByte4));
                } else {
                    if (r9 != 80 || i10 != 82 || unsignedByte3 != 73 || unsignedByte4 != 86) {
                        if (r9 == 71 && i10 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i13 == 2)) {
                            id3FrameDecodeChapterFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
                        } else {
                            th = null;
                            try {
                                if (i13 != 2 ? r9 == 65 && i10 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67 : r9 == 80 && i10 == 73 && unsignedByte3 == 67) {
                                    id3FrameDecodeChapterFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i13);
                                } else {
                                    if (r9 != 67 || i10 != 79 || unsignedByte3 != 77 || (unsignedByte4 != 77 && i13 != 2)) {
                                        if (r9 == 67 && i10 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                                            int i14 = iRemoveUnsynchronization;
                                            iRemoveUnsynchronization = i10;
                                            i10 = i14;
                                            r15 = r9;
                                            i11 = unsignedByte3;
                                            i12 = unsignedByte4;
                                            try {
                                                id3FrameDecodeChapterFrame = decodeChapterFrame(parsableByteArray, i10, i13, z6, i9, framePredicate);
                                                i13 = i3;
                                                r9 = parsableByteArray;
                                            } catch (java.lang.Exception e6) {
                                                e = e6;
                                                i13 = i3;
                                                r11 = parsableByteArray;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (java.lang.OutOfMemoryError e9) {
                                                e = e9;
                                                i13 = i3;
                                                r11 = parsableByteArray;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                r12 = parsableByteArray;
                                                r12.setPosition(position);
                                                throw th;
                                            }
                                        } else {
                                            int i15 = iRemoveUnsynchronization;
                                            iRemoveUnsynchronization = i10;
                                            i10 = i15;
                                            r15 = r9;
                                            i11 = unsignedByte3;
                                            i12 = unsignedByte4;
                                            try {
                                                if (r15 == 67 && iRemoveUnsynchronization == 84 && i11 == 79 && i12 == 67) {
                                                    i13 = i3;
                                                    androidx.media3.common.util.ParsableByteArray parsableByteArray2 = parsableByteArray;
                                                    id3FrameDecodeChapterFrame = decodeChapterTOCFrame(parsableByteArray2, i10, i13, z6, i9, framePredicate);
                                                    r9 = parsableByteArray2;
                                                } else {
                                                    i13 = i3;
                                                    androidx.media3.common.util.ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                    if (r15 == 77 && iRemoveUnsynchronization == 76 && i11 == 76 && i12 == 84) {
                                                        id3FrameDecodeChapterFrame = decodeMlltFrame(parsableByteArray3, i10);
                                                        r9 = parsableByteArray3;
                                                    } else {
                                                        id3FrameDecodeChapterFrame = decodeBinaryFrame(parsableByteArray3, i10, getFrameId(i13, r15 == true ? 1 : 0, iRemoveUnsynchronization, i11, i12));
                                                        r9 = parsableByteArray3;
                                                    }
                                                }
                                            } catch (java.lang.Exception e10) {
                                                e = e10;
                                                r11 = r9;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (java.lang.OutOfMemoryError e11) {
                                                e = e11;
                                                r11 = r9;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                r12 = r9;
                                                r12.setPosition(position);
                                                throw th;
                                            }
                                        }
                                        if (r13 == 0) {
                                            androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
                                        }
                                        return r13;
                                    }
                                    id3FrameDecodeChapterFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
                                }
                                int i16 = iRemoveUnsynchronization;
                                iRemoveUnsynchronization = i10;
                                i10 = i16;
                                r15 = r9;
                                i11 = unsignedByte3;
                                i12 = unsignedByte4;
                                r9 = parsableByteArray;
                            } catch (java.lang.Exception e12) {
                                e = e12;
                                int i17 = iRemoveUnsynchronization;
                                iRemoveUnsynchronization = i10;
                                i10 = i17;
                                r10 = r9;
                                i11 = unsignedByte3;
                                i12 = unsignedByte4;
                                r11 = parsableByteArray;
                                r11.setPosition(position);
                                r13 = th;
                                r14 = r10;
                                if (r13 == 0) {
                                    androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
                                }
                                return r13;
                            } catch (java.lang.OutOfMemoryError e13) {
                                e = e13;
                                int i18 = iRemoveUnsynchronization;
                                iRemoveUnsynchronization = i10;
                                i10 = i18;
                                r10 = r9;
                                i11 = unsignedByte3;
                                i12 = unsignedByte4;
                                r11 = parsableByteArray;
                                r11.setPosition(position);
                                r13 = th;
                                r14 = r10;
                                if (r13 == 0) {
                                    androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
                                }
                                return r13;
                            }
                        }
                        r9.setPosition(position);
                        r13 = id3FrameDecodeChapterFrame;
                        e = th;
                        r14 = r15;
                        if (r13 == 0) {
                            androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
                        }
                        return r13;
                    }
                    id3FrameDecodeChapterFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
                }
                int i19 = iRemoveUnsynchronization;
                iRemoveUnsynchronization = i10;
                i10 = i19;
                r15 = r9;
                i11 = unsignedByte3;
                i12 = unsignedByte4;
                r9 = parsableByteArray;
                th = null;
                r9.setPosition(position);
                r13 = id3FrameDecodeChapterFrame;
                e = th;
                r14 = r15;
            } catch (java.lang.Throwable th4) {
                th = th4;
                r12 = parsableByteArray;
            }
        } catch (java.lang.Exception e14) {
            e = e14;
            int i20 = iRemoveUnsynchronization;
            iRemoveUnsynchronization = i10;
            i10 = i20;
            r10 = r9;
            i11 = unsignedByte3;
            i12 = unsignedByte4;
            r11 = parsableByteArray;
            th = null;
            r11.setPosition(position);
            r13 = th;
            r14 = r10;
            if (r13 == 0) {
                androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
            }
            return r13;
        } catch (java.lang.OutOfMemoryError e15) {
            e = e15;
            int i21 = iRemoveUnsynchronization;
            iRemoveUnsynchronization = i10;
            i10 = i21;
            r10 = r9;
            i11 = unsignedByte3;
            i12 = unsignedByte4;
            r11 = parsableByteArray;
            th = null;
            r11.setPosition(position);
            r13 = th;
            r14 = r10;
            if (r13 == 0) {
                androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
            }
            return r13;
        }
        if (r13 == 0) {
            androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
        }
        return r13;
    }

    private static androidx.media3.extractor.metadata.id3.GeobFrame decodeGeobFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(unsignedByte);
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(new java.lang.String(bArr, 0, iIndexOfZeroByte, java.nio.charset.StandardCharsets.ISO_8859_1));
        int i10 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i10, unsignedByte);
        java.lang.String strDecodeStringIfValid = decodeStringIfValid(bArr, i10, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new androidx.media3.extractor.metadata.id3.GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i9));
    }

    private static androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header decodeHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            androidx.media3.common.util.Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            androidx.media3.common.util.Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x".concat(java.lang.String.format("%06X", java.lang.Integer.valueOf(unsignedInt24))));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                androidx.media3.common.util.Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i3 = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i3);
                synchSafeInt -= i3 + 4;
            }
        } else {
            if (unsignedByte != 4) {
                Y6.f.p(unsignedByte, "Skipped ID3 tag with unsupported majorVersion=", TAG);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static androidx.media3.extractor.metadata.id3.MlltFrame decodeMlltFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i9 = ((i3 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i9];
        int[] iArr2 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i10] = bits;
            iArr2[i10] = bits2;
        }
        return new androidx.media3.extractor.metadata.id3.MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static androidx.media3.extractor.metadata.id3.PrivFrame decodePrivFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new androidx.media3.extractor.metadata.id3.PrivFrame(new java.lang.String(bArr, 0, iIndexOfZeroByte, java.nio.charset.StandardCharsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i3));
    }

    private static java.lang.String decodeStringIfValid(byte[] bArr, int i3, int i9, java.nio.charset.Charset charset) {
        return (i9 <= i3 || i9 > bArr.length) ? "" : new java.lang.String(bArr, i3, i9 - i3, charset);
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame decodeTextInformationFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, java.lang.String str) {
        if (i3 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new androidx.media3.extractor.metadata.id3.TextInformationFrame(str, (java.lang.String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static p076i4.AbstractC2186b0 decodeTextInformationFrameValues(byte[] bArr, int i3, int i9) {
        if (i9 >= bArr.length) {
            return p076i4.AbstractC2186b0.y("");
        }
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        int iIndexOfTerminator = indexOfTerminator(bArr, i9, i3);
        while (i9 < iIndexOfTerminator) {
            yS.c(new java.lang.String(bArr, i9, iIndexOfTerminator - i9, getCharset(i3)));
            i9 = delimiterLength(i3) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i9, i3);
        }
        p076i4.S0 s0F = yS.f();
        return s0F.isEmpty() ? p076i4.AbstractC2186b0.y("") : s0F;
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame decodeTxxxFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        if (i3 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new androidx.media3.extractor.metadata.id3.TextInformationFrame("TXXX", new java.lang.String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    private static androidx.media3.extractor.metadata.id3.UrlLinkFrame decodeUrlLinkFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, java.lang.String str) {
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new androidx.media3.extractor.metadata.id3.UrlLinkFrame(str, null, new java.lang.String(bArr, 0, indexOfZeroByte(bArr, 0), java.nio.charset.StandardCharsets.ISO_8859_1));
    }

    private static androidx.media3.extractor.metadata.id3.UrlLinkFrame decodeWxxxFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        if (i3 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        java.lang.String str = new java.lang.String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new androidx.media3.extractor.metadata.id3.UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), java.nio.charset.StandardCharsets.ISO_8859_1));
    }

    private static int delimiterLength(int i3) {
        return (i3 == 0 || i3 == 3) ? 1 : 2;
    }

    private static java.nio.charset.Charset getCharset(int i3) {
        if (i3 == 1) {
            return java.nio.charset.StandardCharsets.UTF_16;
        }
        if (i3 != 2) {
            return i3 != 3 ? java.nio.charset.StandardCharsets.ISO_8859_1 : java.nio.charset.StandardCharsets.UTF_8;
        }
        return java.nio.charset.StandardCharsets.UTF_16BE;
    }

    private static java.lang.String getFrameId(int i3, int i9, int i10, int i11, int i12) {
        return i3 == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12));
    }

    private static int indexOfTerminator(byte[] bArr, int i3, int i9) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i3);
        if (i9 == 0 || i9 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if ((iIndexOfZeroByte - i3) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i3) {
        while (i3 < bArr.length) {
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i3, int i9, int i10, int i11, int i12) {
        return false;
    }

    private static int removeUnsynchronization(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i9 = position;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= position + i3) {
                return i3;
            }
            if ((data[i9] & 255) == 255 && data[i10] == 0) {
                java.lang.System.arraycopy(data, i9 + 2, data, i10, (i3 - (i9 - position)) - 2);
                i3--;
            }
            i9 = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
  0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, boolean z6) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i10;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z9 = true;
                if (parsableByteArray.bytesLeft() < i9) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i3 >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i3 == 4 && !z6) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i3 == 4) {
                    i10 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z9 = false;
                    }
                } else if (i3 == 3) {
                    i10 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z9 = false;
                    }
                } else {
                    i10 = 0;
                    z9 = false;
                }
                if (z9) {
                    i10 += 4;
                }
                if (unsignedInt25 < i10) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() < unsignedInt25) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                parsableByteArray.skipBytes((int) unsignedInt25);
            } catch (java.lang.Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    public androidx.media3.common.Metadata decode(byte[] bArr, int i3) throws java.lang.Throwable {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr, i3);
        androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i9 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z6 = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i9, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i9, true)) {
                androidx.media3.common.util.Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z6 = true;
        }
        while (parsableByteArray.bytesLeft() >= i9) {
            androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z6, i9, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new androidx.media3.common.Metadata(arrayList);
    }
}
