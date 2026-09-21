package androidx.media3.extractor.metadata.id3;

import D1.C0223h;
import Y6.f;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Y;

public final class Id3Decoder extends SimpleMetadataDecoder {
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
    public static final FramePredicate NO_FRAMES_PREDICATE = new C0223h(18);
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;

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
        return i9 <= i3 ? Util.EMPTY_BYTE_ARRAY : Arrays.copyOfRange(bArr, i3, i9);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i3, int i9) {
        int iIndexOfZeroByte;
        String strConcat;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i10 = i3 - 1;
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        if (i9 == 2) {
            strConcat = "image/" + AbstractC1909d.i0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = MimeTypes.IMAGE_JPEG;
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            String strI0 = AbstractC1909d.i0(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
            strConcat = strI0.indexOf(47) == -1 ? "image/".concat(strI0) : strI0;
        }
        int i11 = bArr[iIndexOfZeroByte + 1] & 255;
        int i12 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i12, unsignedByte);
        return new ApicFrame(strConcat, new String(bArr, i12, iIndexOfTerminator - i12, charset), i11, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i10));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i3, String str) {
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i3, int i9, boolean z6, int i10, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i11 = parsableByteArray.readInt();
        int i12 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i13 = position + i3;
        while (parsableByteArray.getPosition() < i13) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i9, parsableByteArray, z6, i10, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterFrame(str, i11, i12, unsignedInt, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i3, int i9, boolean z6, int i10, FramePredicate framePredicate) throws Throwable {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, StandardCharsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z9 = (unsignedByte & 2) != 0;
        boolean z10 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i11 = 0; i11 < unsignedByte2; i11++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i11] = new String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, StandardCharsets.ISO_8859_1);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = position + i3;
        while (parsableByteArray.getPosition() < i12) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(i9, parsableByteArray, z6, i10, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new ChapterTocFrame(str, z9, z10, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i3) {
        if (i3 < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i9 = i3 - 4;
        byte[] bArr2 = new byte[i9];
        parsableByteArray.readBytes(bArr2, 0, i9);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    private static Id3Frame decodeFrame(int i3, ParsableByteArray parsableByteArray, boolean z6, int i9, FramePredicate framePredicate) throws Throwable {
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
        Throwable th;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        Id3Frame id3FrameDecodeChapterFrame;
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
            Log.w(TAG, "Frame size exceeds remaining tag data");
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
            Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
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
                                            } catch (Exception e6) {
                                                e = e6;
                                                i13 = i3;
                                                r11 = parsableByteArray;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (OutOfMemoryError e9) {
                                                e = e9;
                                                i13 = i3;
                                                r11 = parsableByteArray;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (Throwable th2) {
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
                                                    ParsableByteArray parsableByteArray2 = parsableByteArray;
                                                    id3FrameDecodeChapterFrame = decodeChapterTOCFrame(parsableByteArray2, i10, i13, z6, i9, framePredicate);
                                                    r9 = parsableByteArray2;
                                                } else {
                                                    i13 = i3;
                                                    ParsableByteArray parsableByteArray3 = parsableByteArray;
                                                    if (r15 == 77 && iRemoveUnsynchronization == 76 && i11 == 76 && i12 == 84) {
                                                        id3FrameDecodeChapterFrame = decodeMlltFrame(parsableByteArray3, i10);
                                                        r9 = parsableByteArray3;
                                                    } else {
                                                        id3FrameDecodeChapterFrame = decodeBinaryFrame(parsableByteArray3, i10, getFrameId(i13, r15 == true ? 1 : 0, iRemoveUnsynchronization, i11, i12));
                                                        r9 = parsableByteArray3;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                r11 = r9;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (OutOfMemoryError e11) {
                                                e = e11;
                                                r11 = r9;
                                                r10 = r15;
                                                r11.setPosition(position);
                                                r13 = th;
                                                r14 = r10;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r12 = r9;
                                                r12.setPosition(position);
                                                throw th;
                                            }
                                        }
                                        if (r13 == 0) {
                                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
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
                            } catch (Exception e12) {
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
                                    Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
                                }
                                return r13;
                            } catch (OutOfMemoryError e13) {
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
                                    Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
                                }
                                return r13;
                            }
                        }
                        r9.setPosition(position);
                        r13 = id3FrameDecodeChapterFrame;
                        e = th;
                        r14 = r15;
                        if (r13 == 0) {
                            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
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
            } catch (Throwable th4) {
                th = th4;
                r12 = parsableByteArray;
            }
        } catch (Exception e14) {
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
                Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
            }
            return r13;
        } catch (OutOfMemoryError e15) {
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
                Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
            }
            return r13;
        }
        if (r13 == 0) {
            Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i13, r14, iRemoveUnsynchronization, i11, i12) + ", frameSize=" + i10, e);
        }
        return r13;
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i3) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(unsignedByte);
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1));
        int i10 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i10, unsignedByte);
        String strDecodeStringIfValid = decodeStringIfValid(bArr, i10, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i9));
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(unsignedInt24))));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
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
                f.p(unsignedByte, "Skipped ID3 tag with unsupported majorVersion=", TAG);
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
        return new Id3Header(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i3) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
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
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i3) {
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iIndexOfZeroByte, StandardCharsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i3));
    }

    private static String decodeStringIfValid(byte[] bArr, int i3, int i9, Charset charset) {
        return (i9 <= i3 || i9 > bArr.length) ? "" : new String(bArr, i3, i9 - i3, charset);
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i3, String str) {
        if (i3 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static AbstractC2186b0 decodeTextInformationFrameValues(byte[] bArr, int i3, int i9) {
        if (i9 >= bArr.length) {
            return AbstractC2186b0.y("");
        }
        Y yS = AbstractC2186b0.s();
        int iIndexOfTerminator = indexOfTerminator(bArr, i9, i3);
        while (i9 < iIndexOfTerminator) {
            yS.c(new String(bArr, i9, iIndexOfTerminator - i9, getCharset(i3)));
            i9 = delimiterLength(i3) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i9, i3);
        }
        S0 s0F = yS.f();
        return s0F.isEmpty() ? AbstractC2186b0.y("") : s0F;
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i3) {
        if (i3 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i3, String str) {
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i3) {
        if (i3 < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = i3 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), StandardCharsets.ISO_8859_1));
    }

    private static int delimiterLength(int i3) {
        return (i3 == 0 || i3 == 3) ? 1 : 2;
    }

    private static Charset getCharset(int i3) {
        if (i3 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i3 != 2) {
            return i3 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String getFrameId(int i3, int i9, int i10, int i11, int i12) {
        return i3 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
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

    public static boolean lambda$static$0(int i3, int i9, int i10, int i11, int i12) {
        return false;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i3) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i9 = position;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= position + i3) {
                return i3;
            }
            if ((data[i9] & 255) == 255 && data[i10] == 0) {
                System.arraycopy(data, i9 + 2, data, i10, (i3 - (i9 - position)) - 2);
                i3--;
            }
            i9 = i10;
        }
    }

    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i3, int i9, boolean z6) {
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
            } catch (Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    @Override
    public Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    public Metadata decode(byte[] bArr, int i3) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i3);
        Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
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
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z6 = true;
        }
        while (parsableByteArray.bytesLeft() >= i9) {
            Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z6, i9, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
