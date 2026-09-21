package androidx.media3.common;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int AVIF = 21;
    public static final int BMP = 19;
    private static final String EXTENSION_AAC = ".aac";
    private static final String EXTENSION_AC3 = ".ac3";
    private static final String EXTENSION_AC4 = ".ac4";
    private static final String EXTENSION_ADTS = ".adts";
    private static final String EXTENSION_AMR = ".amr";
    private static final String EXTENSION_AVI = ".avi";
    private static final String EXTENSION_AVIF = ".avif";
    private static final String EXTENSION_BMP = ".bmp";
    private static final String EXTENSION_DIB = ".dib";
    private static final String EXTENSION_EC3 = ".ec3";
    private static final String EXTENSION_FLAC = ".flac";
    private static final String EXTENSION_FLV = ".flv";
    private static final String EXTENSION_HEIC = ".heic";
    private static final String EXTENSION_HEIF = ".heif";
    private static final String EXTENSION_JPEG = ".jpeg";
    private static final String EXTENSION_JPG = ".jpg";
    private static final String EXTENSION_M2P = ".m2p";
    private static final String EXTENSION_MID = ".mid";
    private static final String EXTENSION_MIDI = ".midi";
    private static final String EXTENSION_MP3 = ".mp3";
    private static final String EXTENSION_MP4 = ".mp4";
    private static final String EXTENSION_MPEG = ".mpeg";
    private static final String EXTENSION_MPG = ".mpg";
    private static final String EXTENSION_OPUS = ".opus";
    private static final String EXTENSION_PNG = ".png";
    private static final String EXTENSION_PREFIX_CMF = ".cmf";
    private static final String EXTENSION_PREFIX_M4 = ".m4";
    private static final String EXTENSION_PREFIX_MK = ".mk";
    private static final String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final String EXTENSION_PREFIX_OG = ".og";
    private static final String EXTENSION_PREFIX_TS = ".ts";
    private static final String EXTENSION_PS = ".ps";
    private static final String EXTENSION_SMF = ".smf";
    private static final String EXTENSION_TS = ".ts";
    private static final String EXTENSION_VTT = ".vtt";
    private static final String EXTENSION_WAV = ".wav";
    private static final String EXTENSION_WAVE = ".wave";
    private static final String EXTENSION_WEBM = ".webm";
    private static final String EXTENSION_WEBP = ".webp";
    private static final String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;
    static final String HEADER_CONTENT_TYPE = "Content-Type";
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

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
    }

    public static int inferFileTypeFromMimeType(String str) {
        int i3;
        byte b9;
        if (str == null) {
            return -1;
        }
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(str);
        strNormalizeMimeType.getClass();
        switch (strNormalizeMimeType.hashCode()) {
            case -2123537834:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    b9 = -1;
                } else {
                    b9 = 0;
                }
                break;
            case -1662384011:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_PS)) {
                    b9 = -1;
                } else {
                    b9 = 1;
                }
                break;
            case -1662384007:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_MP2T)) {
                    b9 = -1;
                } else {
                    b9 = 2;
                }
                break;
            case -1662095187:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_WEBM)) {
                    b9 = -1;
                } else {
                    b9 = 3;
                }
                break;
            case -1606874997:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AMR_WB)) {
                    b9 = -1;
                } else {
                    b9 = 4;
                }
                break;
            case -1487656890:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_AVIF)) {
                    b9 = -1;
                } else {
                    b9 = 5;
                }
                break;
            case -1487464693:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_HEIC)) {
                    b9 = -1;
                } else {
                    b9 = 6;
                }
                break;
            case -1487464690:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_HEIF)) {
                    b9 = -1;
                } else {
                    b9 = 7;
                }
                break;
            case -1487394660:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_JPEG)) {
                    b9 = -1;
                } else {
                    b9 = 8;
                }
                break;
            case -1487018032:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_WEBP)) {
                    b9 = -1;
                } else {
                    b9 = 9;
                }
                break;
            case -1248337486:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.APPLICATION_MP4)) {
                    b9 = -1;
                } else {
                    b9 = 10;
                }
                break;
            case -1079884372:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_AVI)) {
                    b9 = -1;
                } else {
                    b9 = 11;
                }
                break;
            case -1004728940:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.TEXT_VTT)) {
                    b9 = -1;
                } else {
                    b9 = 12;
                }
                break;
            case -879272239:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_BMP)) {
                    b9 = -1;
                } else {
                    b9 = 13;
                }
                break;
            case -879258763:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.IMAGE_PNG)) {
                    b9 = -1;
                } else {
                    b9 = 14;
                }
                break;
            case -387023398:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MATROSKA)) {
                    b9 = -1;
                } else {
                    b9 = 15;
                }
                break;
            case -43467528:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.APPLICATION_WEBM)) {
                    b9 = -1;
                } else {
                    b9 = 16;
                }
                break;
            case 13915911:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_FLV)) {
                    b9 = -1;
                } else {
                    b9 = 17;
                }
                break;
            case 187078296:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AC3)) {
                    b9 = -1;
                } else {
                    b9 = 18;
                }
                break;
            case 187078297:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AC4)) {
                    b9 = -1;
                } else {
                    b9 = 19;
                }
                break;
            case 187078669:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AMR)) {
                    b9 = -1;
                } else {
                    b9 = 20;
                }
                break;
            case 187090232:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MP4)) {
                    b9 = -1;
                } else {
                    b9 = 21;
                }
                break;
            case 187091926:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_OGG)) {
                    b9 = -1;
                } else {
                    b9 = 22;
                }
                break;
            case 187099443:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_WAV)) {
                    b9 = -1;
                } else {
                    b9 = 23;
                }
                break;
            case 1331848029:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_MP4)) {
                    b9 = -1;
                } else {
                    b9 = 24;
                }
                break;
            case 1503095341:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_AMR_NB)) {
                    b9 = -1;
                } else {
                    b9 = 25;
                }
                break;
            case 1504578661:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_E_AC3)) {
                    b9 = -1;
                } else {
                    b9 = 26;
                }
                break;
            case 1504619009:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_FLAC)) {
                    b9 = -1;
                } else {
                    b9 = 27;
                }
                break;
            case 1504824762:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MIDI)) {
                    b9 = -1;
                } else {
                    b9 = 28;
                }
                break;
            case 1504831518:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_MPEG)) {
                    b9 = -1;
                } else {
                    b9 = 29;
                }
                break;
            case 1505118770:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.AUDIO_WEBM)) {
                    b9 = -1;
                } else {
                    b9 = 30;
                }
                break;
            case 2039520277:
                i3 = 20;
                if (!strNormalizeMimeType.equals(MimeTypes.VIDEO_MATROSKA)) {
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

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List<String> list = map.get(HEADER_CONTENT_TYPE);
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
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
