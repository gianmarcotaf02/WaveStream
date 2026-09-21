package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.session.legacy.PlaybackStateCompat;

public final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i3, boolean z6) {
        if ((i3 >>> 8) == 3368816) {
            return true;
        }
        if (i3 == 1751476579 && z6) {
            return true;
        }
        for (int i9 : COMPATIBLE_BRANDS) {
            if (i9 == i3) {
                return true;
            }
        }
        return false;
    }

    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) {
        return sniffInternal(extractorInput, true, false);
    }

    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z6, boolean z9) {
        SniffFailure sniffFailure;
        int i3;
        int i9;
        int i10;
        long j;
        int i11;
        int[] iArr;
        long length = extractorInput.getLength();
        long j9 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j10 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i12 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j10 = length;
        }
        int i13 = (int) j10;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            if (i15 < i13) {
                parsableByteArray.reset(8);
                if (extractorInput.peekFully(parsableByteArray.getData(), i14, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i16 = parsableByteArray.readInt();
                    if (unsignedInt == 1) {
                        j9 = j9;
                        extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                        i9 = 16;
                        parsableByteArray.setLimit(16);
                        unsignedInt = parsableByteArray.readLong();
                        i15 = i15;
                    } else {
                        j9 = j9;
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j9) {
                                unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i9 = 8;
                    }
                    long j11 = unsignedInt;
                    sniffFailure = null;
                    long j12 = i9;
                    if (j11 < j12) {
                        if (i16 != 1718773093 || i9 != 8) {
                            return new AtomSizeTooSmallSniffFailure(i16, j11, i9);
                        }
                        j11 = j12;
                    }
                    int i17 = i15 + i9;
                    if (i16 == 1836019574 || i16 == 1970628964) {
                        i13 += (int) j11;
                        i10 = i12;
                        if (i12 != 0 && i13 > length) {
                            i13 = (int) length;
                        }
                        if (i16 == 1836019574) {
                            i15 = i17;
                            i12 = i10;
                            i14 = 0;
                        }
                    } else {
                        i10 = i12;
                    }
                    if (i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086) {
                        j = length;
                        i11 = 0;
                        i15 = i17;
                    } else if (i16 == 1836019558 || i16 == 1836475768) {
                        i3 = 1;
                    } else {
                        if (i16 == 1835295092) {
                            z10 = true;
                        }
                        if (i16 != 1937007212 || j11 <= 1000000) {
                            j = length;
                            if ((((long) i17) + j11) - j12 < i13) {
                                int i18 = (int) (j11 - j12);
                                i15 = i17 + i18;
                                if (i16 != 1718909296) {
                                    i11 = 0;
                                    if (i18 != 0) {
                                        extractorInput.advancePeekPosition(i18);
                                    }
                                } else {
                                    if (i18 < 8) {
                                        return new AtomSizeTooSmallSniffFailure(i16, i18, 8);
                                    }
                                    parsableByteArray.reset(i18);
                                    i11 = 0;
                                    extractorInput.peekFully(parsableByteArray.getData(), 0, i18);
                                    int i19 = parsableByteArray.readInt();
                                    if (isCompatibleBrand(i19, z9)) {
                                        z10 = true;
                                    }
                                    parsableByteArray.skipBytes(4);
                                    int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                                    if (z10 || iBytesLeft <= 0) {
                                        iArr = sniffFailure;
                                    } else {
                                        iArr = new int[iBytesLeft];
                                        for (int i20 = 0; i20 < iBytesLeft; i20++) {
                                            int i21 = parsableByteArray.readInt();
                                            iArr[i20] = i21;
                                            if (isCompatibleBrand(i21, z9)) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        return new UnsupportedBrandsSniffFailure(i19, iArr);
                                    }
                                }
                            }
                        }
                        i3 = 0;
                    }
                    i14 = i11;
                    i12 = i10;
                    length = j;
                }
                if (!z10) {
                    return NoDeclaredBrandSniffFailure.INSTANCE;
                }
                if (z6 != i3) {
                    return i3 != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED;
                }
                return sniffFailure;
            }
            sniffFailure = null;
            i3 = i14;
            if (!z10) {
                return NoDeclaredBrandSniffFailure.INSTANCE;
            }
            if (z6 != i3) {
                if (i3 != 0) {
                }
            }
            return sniffFailure;
        }
    }

    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z6) {
        return sniffInternal(extractorInput, false, z6);
    }
}
