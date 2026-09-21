package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int AVIF = 21;
    public static final int BMP = 19;
    private static final java.lang.String EXTENSION_AAC = ".aac";
    private static final java.lang.String EXTENSION_AC3 = ".ac3";
    private static final java.lang.String EXTENSION_AC4 = ".ac4";
    private static final java.lang.String EXTENSION_ADTS = ".adts";
    private static final java.lang.String EXTENSION_AMR = ".amr";
    private static final java.lang.String EXTENSION_AVI = ".avi";
    private static final java.lang.String EXTENSION_AVIF = ".avif";
    private static final java.lang.String EXTENSION_BMP = ".bmp";
    private static final java.lang.String EXTENSION_DIB = ".dib";
    private static final java.lang.String EXTENSION_EC3 = ".ec3";
    private static final java.lang.String EXTENSION_FLAC = ".flac";
    private static final java.lang.String EXTENSION_FLV = ".flv";
    private static final java.lang.String EXTENSION_HEIC = ".heic";
    private static final java.lang.String EXTENSION_HEIF = ".heif";
    private static final java.lang.String EXTENSION_JPEG = ".jpeg";
    private static final java.lang.String EXTENSION_JPG = ".jpg";
    private static final java.lang.String EXTENSION_M2P = ".m2p";
    private static final java.lang.String EXTENSION_MID = ".mid";
    private static final java.lang.String EXTENSION_MIDI = ".midi";
    private static final java.lang.String EXTENSION_MP3 = ".mp3";
    private static final java.lang.String EXTENSION_MP4 = ".mp4";
    private static final java.lang.String EXTENSION_MPEG = ".mpeg";
    private static final java.lang.String EXTENSION_MPG = ".mpg";
    private static final java.lang.String EXTENSION_OPUS = ".opus";
    private static final java.lang.String EXTENSION_PNG = ".png";
    private static final java.lang.String EXTENSION_PREFIX_CMF = ".cmf";
    private static final java.lang.String EXTENSION_PREFIX_M4 = ".m4";
    private static final java.lang.String EXTENSION_PREFIX_MK = ".mk";
    private static final java.lang.String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final java.lang.String EXTENSION_PREFIX_OG = ".og";
    private static final java.lang.String EXTENSION_PREFIX_TS = ".ts";
    private static final java.lang.String EXTENSION_PS = ".ps";
    private static final java.lang.String EXTENSION_SMF = ".smf";
    private static final java.lang.String EXTENSION_TS = ".ts";
    private static final java.lang.String EXTENSION_VTT = ".vtt";
    private static final java.lang.String EXTENSION_WAV = ".wav";
    private static final java.lang.String EXTENSION_WAVE = ".wave";
    private static final java.lang.String EXTENSION_WEBM = ".webm";
    private static final java.lang.String EXTENSION_WEBP = ".webp";
    private static final java.lang.String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;
    static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int HEIF = 20;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PNG = 17;
    public static final int PS = 10;
    public static final int TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBP = 18;
    public static final int WEBVTT = 13;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
    }

    /* JADX WARN: Code duplicated, block: B:134:0x021e A[PHI: r23
  0x021e: PHI (r23v32 int) = 
  (r23v1 int)
  (r23v2 int)
  (r23v3 int)
  (r23v4 int)
  (r23v5 int)
  (r23v6 int)
  (r23v7 int)
  (r23v8 int)
  (r23v9 int)
  (r23v10 int)
  (r23v11 int)
  (r23v12 int)
  (r23v13 int)
  (r23v14 int)
  (r23v15 int)
  (r23v16 int)
  (r23v17 int)
  (r23v18 int)
  (r23v19 int)
  (r23v20 int)
  (r23v21 int)
  (r23v22 int)
  (r23v23 int)
  (r23v24 int)
  (r23v25 int)
  (r23v26 int)
  (r23v27 int)
  (r23v28 int)
  (r23v29 int)
  (r23v30 int)
  (r23v31 int)
  (r23v33 int)
 binds: [B:133:0x021c, B:129:0x020e, B:125:0x0201, B:121:0x01f3, B:117:0x01e5, B:113:0x01d7, B:109:0x01ca, B:105:0x01bb, B:101:0x01ac, B:97:0x019d, B:93:0x018e, B:89:0x017f, B:85:0x0170, B:81:0x0161, B:77:0x0152, B:73:0x0143, B:69:0x0134, B:65:0x0125, B:61:0x0116, B:57:0x0107, B:53:0x00f7, B:49:0x00e7, B:45:0x00d7, B:41:0x00c7, B:37:0x00b7, B:33:0x00a7, B:29:0x0097, B:25:0x0087, B:21:0x0077, B:17:0x0067, B:13:0x0057, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    public static int inferFileTypeFromMimeType(java.lang.String str) {
        int i3;
        byte b9;
        if (str == null) {
            return -1;
        }
        java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
        strNormalizeMimeType.getClass();
        switch (strNormalizeMimeType.hashCode()) {
            case -2123537834:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC)) {
                    b9 = -1;
                } else {
                    b9 = 0;
                }
                break;
            case -1662384011:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_PS)) {
                    b9 = -1;
                } else {
                    b9 = 1;
                }
                break;
            case -1662384007:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_MP2T)) {
                    b9 = -1;
                } else {
                    b9 = 2;
                }
                break;
            case -1662095187:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_WEBM)) {
                    b9 = -1;
                } else {
                    b9 = 3;
                }
                break;
            case -1606874997:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AMR_WB)) {
                    b9 = -1;
                } else {
                    b9 = 4;
                }
                break;
            case -1487656890:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_AVIF)) {
                    b9 = -1;
                } else {
                    b9 = 5;
                }
                break;
            case -1487464693:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_HEIC)) {
                    b9 = -1;
                } else {
                    b9 = 6;
                }
                break;
            case -1487464690:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_HEIF)) {
                    b9 = -1;
                } else {
                    b9 = 7;
                }
                break;
            case -1487394660:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_JPEG)) {
                    b9 = -1;
                } else {
                    b9 = 8;
                }
                break;
            case -1487018032:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_WEBP)) {
                    b9 = -1;
                } else {
                    b9 = 9;
                }
                break;
            case -1248337486:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.APPLICATION_MP4)) {
                    b9 = -1;
                } else {
                    b9 = 10;
                }
                break;
            case -1079884372:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_AVI)) {
                    b9 = -1;
                } else {
                    b9 = 11;
                }
                break;
            case -1004728940:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.TEXT_VTT)) {
                    b9 = -1;
                } else {
                    b9 = 12;
                }
                break;
            case -879272239:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_BMP)) {
                    b9 = -1;
                } else {
                    b9 = 13;
                }
                break;
            case -879258763:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.IMAGE_PNG)) {
                    b9 = -1;
                } else {
                    b9 = 14;
                }
                break;
            case -387023398:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_MATROSKA)) {
                    b9 = -1;
                } else {
                    b9 = 15;
                }
                break;
            case -43467528:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.APPLICATION_WEBM)) {
                    b9 = -1;
                } else {
                    b9 = 16;
                }
                break;
            case 13915911:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_FLV)) {
                    b9 = -1;
                } else {
                    b9 = 17;
                }
                break;
            case 187078296:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AC3)) {
                    b9 = -1;
                } else {
                    b9 = 18;
                }
                break;
            case 187078297:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AC4)) {
                    b9 = -1;
                } else {
                    b9 = 19;
                }
                break;
            case 187078669:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AMR)) {
                    b9 = -1;
                } else {
                    b9 = 20;
                }
                break;
            case 187090232:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_MP4)) {
                    b9 = -1;
                } else {
                    b9 = 21;
                }
                break;
            case 187091926:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_OGG)) {
                    b9 = -1;
                } else {
                    b9 = 22;
                }
                break;
            case 187099443:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_WAV)) {
                    b9 = -1;
                } else {
                    b9 = 23;
                }
                break;
            case 1331848029:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_MP4)) {
                    b9 = -1;
                } else {
                    b9 = 24;
                }
                break;
            case 1503095341:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AMR_NB)) {
                    b9 = -1;
                } else {
                    b9 = 25;
                }
                break;
            case 1504578661:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3)) {
                    b9 = -1;
                } else {
                    b9 = 26;
                }
                break;
            case 1504619009:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_FLAC)) {
                    b9 = -1;
                } else {
                    b9 = 27;
                }
                break;
            case 1504824762:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_MIDI)) {
                    b9 = -1;
                } else {
                    b9 = 28;
                }
                break;
            case 1504831518:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_MPEG)) {
                    b9 = -1;
                } else {
                    b9 = 29;
                }
                break;
            case 1505118770:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_WEBM)) {
                    b9 = -1;
                } else {
                    b9 = 30;
                }
                break;
            case 2039520277:
                i3 = 20;
                if (!strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_MATROSKA)) {
                    b9 = -1;
                } else {
                    b9 = 31;
                }
                break;
            default:
                b9 = -1;
                i3 = 20;
                break;
        }
        switch (b9) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return i3;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int inferFileTypeFromResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.List<java.lang.String> list = map.get(HEADER_CONTENT_TYPE);
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int inferFileTypeFromUri(android.net.Uri uri) {
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC3) || lastPathSegment.endsWith(EXTENSION_EC3)) {
            return 0;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC4)) {
            return 1;
        }
        if (lastPathSegment.endsWith(EXTENSION_ADTS) || lastPathSegment.endsWith(EXTENSION_AAC)) {
            return 2;
        }
        if (lastPathSegment.endsWith(EXTENSION_AMR)) {
            return 3;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
            return 4;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLV)) {
            return 5;
        }
        if (lastPathSegment.endsWith(EXTENSION_MID) || lastPathSegment.endsWith(EXTENSION_MIDI) || lastPathSegment.endsWith(EXTENSION_SMF)) {
            return 15;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_WEBM)) {
            return 6;
        }
        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_OPUS)) {
            return 9;
        }
        if (lastPathSegment.endsWith(EXTENSION_PS) || lastPathSegment.endsWith(EXTENSION_MPEG) || lastPathSegment.endsWith(EXTENSION_MPG) || lastPathSegment.endsWith(EXTENSION_M2P)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(EXTENSION_WAV) || lastPathSegment.endsWith(EXTENSION_WAVE)) {
            return 12;
        }
        if (lastPathSegment.endsWith(EXTENSION_VTT) || lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
            return 13;
        }
        if (lastPathSegment.endsWith(EXTENSION_JPG) || lastPathSegment.endsWith(EXTENSION_JPEG)) {
            return 14;
        }
        if (lastPathSegment.endsWith(EXTENSION_AVI)) {
            return 16;
        }
        if (lastPathSegment.endsWith(EXTENSION_PNG)) {
            return 17;
        }
        if (lastPathSegment.endsWith(EXTENSION_WEBP)) {
            return 18;
        }
        if (lastPathSegment.endsWith(EXTENSION_BMP) || lastPathSegment.endsWith(EXTENSION_DIB)) {
            return 19;
        }
        if (lastPathSegment.endsWith(EXTENSION_HEIC) || lastPathSegment.endsWith(EXTENSION_HEIF)) {
            return 20;
        }
        return lastPathSegment.endsWith(EXTENSION_AVIF) ? 21 : -1;
    }
}
