package W1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.internal.play_billing.M0;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IMediaList;
import p121o0.p;

public final class g {

    public static final byte[] f10557A;

    public static final String[] f10558B;

    public static final int[] f10559C;

    public static final byte[] f10560D;

    public static final d f10561E;

    public static final d[][] f10562F;

    public static final d[] f10563G;
    public static final HashMap[] H;

    public static final HashMap[] f10564I;

    public static final HashSet f10565J;

    public static final HashMap f10566K;

    public static final Charset f10567L;

    public static final byte[] f10568M;

    public static final byte[] f10569N;

    public static final boolean f10570l = Log.isLoggable("ExifInterface", 3);

    public static final int[] f10571m;

    public static final int[] f10572n;

    public static final byte[] f10573o;

    public static final byte[] f10574p;

    public static final byte[] f10575q;

    public static final byte[] f10576r;

    public static final byte[] f10577s;

    public static final byte[] f10578t;

    public static final byte[] f10579u;

    public static final byte[] f10580v;

    public static final byte[] f10581w;

    public static final byte[] f10582x;
    public static final byte[] y;

    public static final byte[] f10583z;

    public final FileDescriptor f10584a;

    public final AssetManager.AssetInputStream f10585b;

    public int f10586c;

    public final HashMap[] f10587d;

    public final HashSet f10588e;

    public ByteOrder f10589f;
    public boolean g;

    public int f10590h;

    public int f10591i;
    public int j;

    public int f10592k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f10571m = new int[]{8, 8, 8};
        f10572n = new int[]{8};
        f10573o = new byte[]{-1, -40, -1};
        f10574p = new byte[]{102, 116, 121, 112};
        f10575q = new byte[]{109, 105, 102, 49};
        f10576r = new byte[]{104, 101, 105, 99};
        f10577s = new byte[]{79, 76, 89, 77, 80, 0};
        f10578t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f10579u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f10580v = new byte[]{101, 88, 73, 102};
        f10581w = new byte[]{73, 72, 68, 82};
        f10582x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        f10583z = new byte[]{87, 69, 66, 80};
        f10557A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f10558B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f10559C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f10560D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new d("BitsPerSample", MediaPlayer.Event.Opening, 3), new d("Compression", MediaPlayer.Event.Buffering, 3), new d("PhotometricInterpretation", MediaPlayer.Event.Stopped, 3), new d("ImageDescription", MediaPlayer.Event.PausableChanged, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", MediaPlayer.Event.LengthChanged, 3, 4), new d("Orientation", MediaPlayer.Event.Vout, 3), new d("SamplesPerPixel", MediaPlayer.Event.ESDeleted, 3), new d("RowsPerStrip", MediaPlayer.Event.ESSelected, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IMediaList.Event.ItemDeleted, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new d("BitsPerSample", MediaPlayer.Event.Opening, 3), new d("Compression", MediaPlayer.Event.Buffering, 3), new d("PhotometricInterpretation", MediaPlayer.Event.Stopped, 3), new d("ImageDescription", MediaPlayer.Event.PausableChanged, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", MediaPlayer.Event.LengthChanged, 3, 4), new d("ThumbnailOrientation", MediaPlayer.Event.Vout, 3), new d("SamplesPerPixel", MediaPlayer.Event.ESDeleted, 3), new d("RowsPerStrip", MediaPlayer.Event.ESSelected, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", IMediaList.Event.ItemDeleted, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f10561E = new d("StripOffsets", MediaPlayer.Event.LengthChanged, 3);
        f10562F = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", TsExtractor.TS_STREAM_TYPE_AIT, 4), new d("PreviewImageLength", MediaPlayer.Event.Opening, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f10563G = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        f10564I = new HashMap[10];
        f10565J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f10566K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f10567L = charsetForName;
        f10568M = "Exif\u0000\u0000".getBytes(charsetForName);
        f10569N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            d[][] dVarArr6 = f10562F;
            if (i3 >= dVarArr6.length) {
                HashMap map = f10566K;
                d[] dVarArr7 = f10563G;
                map.put(Integer.valueOf(dVarArr7[0].f10551a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f10551a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f10551a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f10551a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f10551a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f10551a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i3] = new HashMap();
            f10564I[i3] = new HashMap();
            for (d dVar : dVarArr6[i3]) {
                H[i3].put(Integer.valueOf(dVar.f10551a), dVar);
                f10564I[i3].put(dVar.f10552b, dVar);
            }
            i3++;
        }
    }

    public g(InputStream inputStream) throws IOException {
        d[][] dVarArr = f10562F;
        this.f10587d = new HashMap[dVarArr.length];
        this.f10588e = new HashSet(dVarArr.length);
        this.f10589f = ByteOrder.BIG_ENDIAN;
        boolean z6 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z9 = f10570l;
        if (z6) {
            this.f10585b = (AssetManager.AssetInputStream) inputStream;
            this.f10584a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f10585b = null;
                this.f10584a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z9) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f10585b = null;
                this.f10584a = null;
            }
        } else {
            this.f10585b = null;
            this.f10584a = null;
        }
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            try {
                try {
                    this.f10587d[i3] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z9) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                if (z9) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z9) {
                    return;
                }
            } catch (UnsupportedOperationException e9) {
                e = e9;
                if (z9) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z9) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.f10586c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i9 = this.f10586c;
            if (i9 == 4) {
                e(bVar, 0, 0);
            } else if (i9 == 13) {
                h(bVar);
            } else if (i9 == 9) {
                i(bVar);
            } else if (i9 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i10 = this.f10586c;
            if (i10 == 12) {
                d(fVar);
            } else if (i10 == 7) {
                g(fVar);
            } else if (i10 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.e(this.f10590h);
            u(fVar);
        }
        a();
        if (!z9) {
            return;
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s9 = bVar.readShort();
        boolean z6 = f10570l;
        if (s9 == 18761) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s9 == 19789) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s9));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f10587d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(f10567L);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f10589f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f10589f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f10589f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f10589f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            if (!f10565J.contains(str)) {
                return cVarC.f(this.f10589f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i3 = cVarC.f10547a;
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f10589f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f10555a / eVar.f10556b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f10555a / eVar2.f10556b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f10555a / eVar3.f10556b)));
            }
            try {
                return Double.toString(cVarC.d(this.f10589f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f10570l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i3 = 0; i3 < f10562F.length; i3++) {
            c cVar = (c) this.f10587d[i3].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f10587d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f10589f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f10589f));
                }
                if (strExtractMetadata3 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata3);
                    if (i9 == 90) {
                        i3 = 6;
                    } else if (i9 != 180) {
                        i3 = i9 != 270 ? 1 : 8;
                    } else {
                        i3 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i3, this.f10589f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata4);
                    int i11 = Integer.parseInt(strExtractMetadata5);
                    if (i11 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.e(i10);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i12 = i10 + 6;
                    int i13 = i11 - 6;
                    if (!Arrays.equals(bArr, f10568M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i13];
                    fVar.readFully(bArr2);
                    this.f10590h = i12;
                    r(bArr2, 0);
                }
                if (f10570l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(W1.b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.g.e(W1.b, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i3;
        b bVar;
        b bVar2;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        byte[] bArr2;
        int i14;
        byte[] bArr3;
        int i15;
        b bVar3;
        short s9;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i16 = 0;
        while (true) {
            byte[] bArr5 = f10573o;
            if (i16 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i16] != bArr5[i16]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i17 = 0; i17 < bytes.length; i17++) {
                    if (bArr4[i17] != bytes[i17]) {
                        b bVar4 = null;
                        try {
                            try {
                                try {
                                    bVar = new b(bArr4);
                                    try {
                                        try {
                                            long j9 = bVar.readInt();
                                            byte[] bArr6 = new byte[4];
                                            bVar.readFully(bArr6);
                                            if (Arrays.equals(bArr6, f10574p)) {
                                                if (j9 == 1) {
                                                    j9 = bVar.readLong();
                                                    j = 16;
                                                    if (j9 < 16) {
                                                    }
                                                    bVar2 = new b(bArr4);
                                                    ByteOrder byteOrderQ = q(bVar2);
                                                    this.f10589f = byteOrderQ;
                                                    bVar2.j = byteOrderQ;
                                                    s9 = bVar2.readShort();
                                                    if (s9 != 20306 || s9 == 21330) {
                                                        i9 = 1;
                                                    } else {
                                                        i9 = i3;
                                                    }
                                                    bVar2.close();
                                                    if (i9 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        bVar3 = new b(bArr4);
                                                        try {
                                                            ByteOrder byteOrderQ2 = q(bVar3);
                                                            this.f10589f = byteOrderQ2;
                                                            bVar3.j = byteOrderQ2;
                                                            if (bVar3.readShort() == 85) {
                                                                i10 = 1;
                                                            } else {
                                                                i10 = i3;
                                                            }
                                                            bVar3.close();
                                                        } catch (Exception unused) {
                                                            bVar4 = bVar3;
                                                            if (bVar4 != null) {
                                                                bVar4.close();
                                                            }
                                                            i10 = i3;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bVar4 = bVar3;
                                                            if (bVar4 != null) {
                                                                bVar4.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (i10 != 0) {
                                                        return 10;
                                                    }
                                                    i11 = i3;
                                                    while (true) {
                                                        bArr = f10579u;
                                                        if (i11 < bArr.length) {
                                                            i12 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i11] != bArr[i11]) {
                                                            i12 = i3;
                                                            break;
                                                        }
                                                        i11++;
                                                    }
                                                    if (i12 != 0) {
                                                        return 13;
                                                    }
                                                    i13 = i3;
                                                    while (true) {
                                                        bArr2 = y;
                                                        if (i13 < bArr2.length) {
                                                            i14 = i3;
                                                            while (true) {
                                                                bArr3 = f10583z;
                                                                if (i14 < bArr3.length) {
                                                                    i15 = 1;
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i14 + 4] != bArr3[i14]) {
                                                                    break;
                                                                }
                                                                i14++;
                                                            }
                                                            if (i15 != 0) {
                                                                return 14;
                                                            }
                                                            return i3;
                                                        }
                                                        if (bArr4[i13] != bArr2[i13]) {
                                                            break;
                                                        }
                                                        i13++;
                                                    }
                                                    i15 = i3;
                                                    if (i15 != 0) {
                                                        return 14;
                                                    }
                                                    return i3;
                                                }
                                                j = 8;
                                                i3 = 0;
                                                long j10 = 5000;
                                                if (j9 > j10) {
                                                    j9 = j10;
                                                }
                                                long j11 = j9 - j;
                                                if (j11 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z6 = false;
                                                        boolean z9 = false;
                                                        for (long j12 = 0; j12 < j11 / 4; j12++) {
                                                            try {
                                                                bVar.readFully(bArr7);
                                                                if (j12 != 1) {
                                                                    if (Arrays.equals(bArr7, f10575q)) {
                                                                        z6 = true;
                                                                    } else if (Arrays.equals(bArr7, f10576r)) {
                                                                        z9 = true;
                                                                    }
                                                                    if (z6 && z9) {
                                                                        bVar.close();
                                                                        return 12;
                                                                    }
                                                                }
                                                            } catch (EOFException unused3) {
                                                            }
                                                        }
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        if (f10570l) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (bVar != null) {
                                                        }
                                                        bVar2 = new b(bArr4);
                                                        ByteOrder byteOrderQ3 = q(bVar2);
                                                        this.f10589f = byteOrderQ3;
                                                        bVar2.j = byteOrderQ3;
                                                        s9 = bVar2.readShort();
                                                        if (s9 != 20306) {
                                                            i9 = 1;
                                                        } else {
                                                            i9 = 1;
                                                        }
                                                        bVar2.close();
                                                        if (i9 != 0) {
                                                            return 7;
                                                        }
                                                        bVar3 = new b(bArr4);
                                                        ByteOrder byteOrderQ4 = q(bVar3);
                                                        this.f10589f = byteOrderQ4;
                                                        bVar3.j = byteOrderQ4;
                                                        if (bVar3.readShort() == 85) {
                                                            i10 = 1;
                                                        } else {
                                                            i10 = i3;
                                                        }
                                                        bVar3.close();
                                                        if (i10 != 0) {
                                                            return 10;
                                                        }
                                                        i11 = i3;
                                                        while (true) {
                                                            bArr = f10579u;
                                                            if (i11 < bArr.length) {
                                                                i12 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[i11] != bArr[i11]) {
                                                                i12 = i3;
                                                                break;
                                                            }
                                                            i11++;
                                                        }
                                                        if (i12 != 0) {
                                                            return 13;
                                                        }
                                                        i13 = i3;
                                                        while (true) {
                                                            bArr2 = y;
                                                            if (i13 < bArr2.length) {
                                                                i14 = i3;
                                                                while (true) {
                                                                    bArr3 = f10583z;
                                                                    if (i14 < bArr3.length) {
                                                                        i15 = 1;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i14 + 4] != bArr3[i14]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i14++;
                                                                }
                                                                if (i15 != 0) {
                                                                    return 14;
                                                                }
                                                                return i3;
                                                            }
                                                            if (bArr4[i13] != bArr2[i13]) {
                                                                break;
                                                                break;
                                                            }
                                                            i13++;
                                                        }
                                                        i15 = i3;
                                                        if (i15 != 0) {
                                                            return 14;
                                                        }
                                                        return i3;
                                                    }
                                                }
                                                bVar.close();
                                                bVar2 = new b(bArr4);
                                                ByteOrder byteOrderQ5 = q(bVar2);
                                                this.f10589f = byteOrderQ5;
                                                bVar2.j = byteOrderQ5;
                                                s9 = bVar2.readShort();
                                                if (s9 != 20306) {
                                                    i9 = 1;
                                                } else {
                                                    i9 = 1;
                                                }
                                                bVar2.close();
                                                if (i9 != 0) {
                                                    return 7;
                                                }
                                                bVar3 = new b(bArr4);
                                                ByteOrder byteOrderQ6 = q(bVar3);
                                                this.f10589f = byteOrderQ6;
                                                bVar3.j = byteOrderQ6;
                                                if (bVar3.readShort() == 85) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = i3;
                                                }
                                                bVar3.close();
                                                if (i10 != 0) {
                                                    return 10;
                                                }
                                                i11 = i3;
                                                while (true) {
                                                    bArr = f10579u;
                                                    if (i11 < bArr.length) {
                                                        i12 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i11] != bArr[i11]) {
                                                        i12 = i3;
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                                if (i12 != 0) {
                                                    return 13;
                                                }
                                                i13 = i3;
                                                while (true) {
                                                    bArr2 = y;
                                                    if (i13 < bArr2.length) {
                                                        i14 = i3;
                                                        while (true) {
                                                            bArr3 = f10583z;
                                                            if (i14 < bArr3.length) {
                                                                i15 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i14 + 4] != bArr3[i14]) {
                                                                break;
                                                                break;
                                                            }
                                                            i14++;
                                                        }
                                                        if (i15 != 0) {
                                                            return 14;
                                                        }
                                                        return i3;
                                                    }
                                                    if (bArr4[i13] != bArr2[i13]) {
                                                        break;
                                                        break;
                                                    }
                                                    i13++;
                                                }
                                                i15 = i3;
                                                if (i15 != 0) {
                                                    return 14;
                                                }
                                                return i3;
                                            }
                                            bVar.close();
                                            i3 = 0;
                                        } catch (Exception e9) {
                                            e = e9;
                                            i3 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bVar4 = bVar;
                                        if (bVar4 != null) {
                                            bVar4.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    i3 = 0;
                                    bVar = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                ByteOrder byteOrderQ7 = q(bVar2);
                                this.f10589f = byteOrderQ7;
                                bVar2.j = byteOrderQ7;
                                s9 = bVar2.readShort();
                                if (s9 != 20306) {
                                    i9 = 1;
                                } else {
                                    i9 = 1;
                                }
                                bVar2.close();
                            } catch (Exception unused4) {
                                if (bVar2 != null) {
                                    bVar2.close();
                                }
                                i9 = i3;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar4 = bVar2;
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                throw th;
                            }
                            bVar2 = new b(bArr4);
                        } catch (Exception unused5) {
                            bVar2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i9 != 0) {
                            return 7;
                        }
                        bVar3 = new b(bArr4);
                        ByteOrder byteOrderQ8 = q(bVar3);
                        this.f10589f = byteOrderQ8;
                        bVar3.j = byteOrderQ8;
                        if (bVar3.readShort() == 85) {
                            i10 = 1;
                        } else {
                            i10 = i3;
                        }
                        bVar3.close();
                        if (i10 != 0) {
                            return 10;
                        }
                        i11 = i3;
                        while (true) {
                            bArr = f10579u;
                            if (i11 < bArr.length) {
                                i12 = 1;
                                break;
                            }
                            if (bArr4[i11] != bArr[i11]) {
                                i12 = i3;
                                break;
                            }
                            i11++;
                        }
                        if (i12 != 0) {
                            return 13;
                        }
                        i13 = i3;
                        while (true) {
                            bArr2 = y;
                            if (i13 < bArr2.length) {
                                i14 = i3;
                                while (true) {
                                    bArr3 = f10583z;
                                    if (i14 < bArr3.length) {
                                        i15 = 1;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i14 + 4] != bArr3[i14]) {
                                        break;
                                        break;
                                    }
                                    i14++;
                                }
                                if (i15 != 0) {
                                    return 14;
                                }
                                return i3;
                            }
                            if (bArr4[i13] != bArr2[i13]) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        i15 = i3;
                        if (i15 != 0) {
                            return 14;
                        }
                        return i3;
                    }
                }
                return 9;
            }
            i16++;
        }
    }

    public final void g(f fVar) throws IOException {
        int i3;
        int i9;
        j(fVar);
        HashMap[] mapArr = this.f10587d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f10550d);
            fVar2.j = this.f10589f;
            byte[] bArr = f10577s;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.e(0L);
            byte[] bArr3 = f10578t;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.e(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f10589f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i3 = iArr[3]) <= (i9 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i3 - i9) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                c cVarC = c.c(i12, this.f10589f);
                c cVarC2 = c.c(i13, this.f10589f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (f10570l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.j = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f10579u;
        bVar.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i3 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i9 = length + 8;
                if (i9 == 16 && !Arrays.equals(bArr2, f10581w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f10582x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f10580v)) {
                    byte[] bArr3 = new byte[i3];
                    bVar.readFully(bArr3);
                    int i10 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i10) {
                        this.f10590h = i9;
                        r(bArr3, 0);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i10 + ", calculated CRC value: " + crc32.getValue());
                }
                int i11 = i3 + 4;
                bVar.b(i11);
                length = i9 + i11;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z6 = f10570l;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.b(i3 - bVar.f10544i);
        bVar.readFully(bArr4);
        e(new b(bArr4), i3, 5);
        bVar.b(i10 - bVar.f10544i);
        bVar.j = ByteOrder.BIG_ENDIAN;
        int i11 = bVar.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f10561E.f10551a) {
                short s9 = bVar.readShort();
                short s10 = bVar.readShort();
                c cVarC = c.c(s9, this.f10589f);
                c cVarC2 = c.c(s10, this.f10589f);
                HashMap[] mapArr = this.f10587d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z6) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s9) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.b(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f10586c == 8) {
            HashMap[] mapArr = this.f10587d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f10550d);
                fVar2.j = this.f10589f;
                fVar2.b(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (f10570l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f10587d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f10550d), (int) cVar.f10549c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (f10570l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.j = ByteOrder.LITTLE_ENDIAN;
        bVar.b(y.length);
        int i3 = bVar.readInt() + 8;
        byte[] bArr = f10583z;
        bVar.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i9 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(f10557A, bArr2)) {
                    byte[] bArr3 = new byte[i9];
                    bVar.readFully(bArr3);
                    this.f10590h = i10;
                    r(bArr3, 0);
                    u(new b(bArr3));
                    return;
                }
                if (i9 % 2 == 1) {
                    i9++;
                }
                length = i10 + i9;
                if (length == i3) {
                    return;
                }
                if (length > i3) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.b(i9);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f10589f);
        int iE2 = cVar2.e(this.f10589f);
        if (this.f10586c == 7) {
            iE += this.f10591i;
        }
        if (iE > 0 && iE2 > 0 && this.f10585b == null && this.f10584a == null) {
            bVar.b(iE);
            bVar.readFully(new byte[iE2]);
        }
        if (f10570l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f10589f) <= 512 && cVar2.e(this.f10589f) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f10589f = byteOrderQ;
        fVar.j = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i3 = this.f10586c;
        if (i3 != 7 && i3 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i9 = fVar.readInt();
        if (i9 < 8) {
            throw new IOException(M0.l(i9, "Invalid first Ifd offset: "));
        }
        int i10 = i9 - 8;
        if (i10 > 0) {
            fVar.b(i10);
        }
    }

    public final void p() {
        int i3 = 0;
        while (true) {
            HashMap[] mapArr = this.f10587d;
            if (i3 >= mapArr.length) {
                return;
            }
            StringBuilder sbT = p.t(i3, "The size of tag group[", "]: ");
            sbT.append(mapArr[i3].size());
            Log.d("ExifInterface", sbT.toString());
            for (Map.Entry entry : mapArr[i3].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f10589f) + "'");
            }
            i3++;
        }
    }

    public final void r(byte[] bArr, int i3) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i3);
    }

    public final void s(f fVar, int i3) throws IOException {
        HashMap[] mapArr;
        HashSet hashSet;
        long j;
        boolean z6;
        int i9;
        Integer num;
        String str;
        int unsignedShort;
        long j9;
        int i10;
        String strJ;
        int i11;
        Integer numValueOf = Integer.valueOf(fVar.f10544i);
        HashSet hashSet2 = this.f10588e;
        hashSet2.add(numValueOf);
        short s9 = fVar.readShort();
        boolean z9 = f10570l;
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s9));
        }
        if (s9 <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            mapArr = this.f10587d;
            if (s10 >= s9) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i12 = fVar.readInt();
            long j10 = ((long) fVar.f10544i) + 4;
            d dVar = (d) H[i3].get(Integer.valueOf(unsignedShort2));
            if (z9) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i3), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f10552b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i12)));
            }
            if (dVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f10559C;
                    if (unsignedShort3 < iArr.length) {
                        int i13 = dVar.f10553c;
                        if (i13 == 7 || unsignedShort3 == 7 || i13 == unsignedShort3 || (i9 = dVar.f10554d) == unsignedShort3 || (((i13 == 4 || i9 == 4) && unsignedShort3 == 3) || (((i13 == 9 || i9 == 9) && unsignedShort3 == 8) || ((i13 == 12 || i9 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i13;
                            }
                            hashSet = hashSet2;
                            j = ((long) i12) * ((long) iArr[unsignedShort3]);
                            if (j < 0 || j > 2147483647L) {
                                if (z9 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i12);
                                }
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                        } else if (z9 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f10558B[unsignedShort3] + ") is unexpected for tag: " + dVar.f10552b);
                        }
                    }
                    if (z6) {
                        if (j > 4) {
                            i11 = fVar.readInt();
                            if (z9 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i11);
                            }
                            if (this.f10586c == 7) {
                                if ("MakerNote".equals(dVar.f10552b)) {
                                    this.f10591i = i11;
                                } else if (i3 != 6 && "ThumbnailImage".equals(dVar.f10552b)) {
                                    this.j = i11;
                                    this.f10592k = i12;
                                    c cVarC = c.c(6, this.f10589f);
                                    c cVarA = c.a(this.j, this.f10589f);
                                    c cVarA2 = c.a(this.f10592k, this.f10589f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.e(i11);
                        } else {
                            hashSet = hashSet;
                            unsignedShort2 = unsignedShort2;
                            i12 = i12;
                        }
                        num = (Integer) f10566K.get(Integer.valueOf(unsignedShort2));
                        if (z9 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j9 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j9 = -1;
                                }
                                if (z9 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f10552b));
                                }
                                i10 = fVar.f10546l;
                                if (j9 > 0 || (i10 != -1 && j9 >= i10)) {
                                    hashSet = hashSet;
                                    if (z9 != 0) {
                                        strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i10 != -1) {
                                            strJ = strJ + " (total length: " + i10 + ")";
                                        }
                                        Log.d("ExifInterface", strJ);
                                    }
                                } else {
                                    hashSet = hashSet;
                                    if (!hashSet.contains(Integer.valueOf((int) j9))) {
                                        fVar.e(j9);
                                        s(fVar, num.intValue());
                                    } else if (z9 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j9 + ")");
                                    }
                                }
                                fVar.e(j10);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j9 = unsignedShort;
                            if (z9 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f10552b));
                            }
                            i10 = fVar.f10546l;
                            if (j9 > 0) {
                                hashSet = hashSet;
                                if (z9 != 0) {
                                    strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i10 != -1) {
                                        strJ = strJ + " (total length: " + i10 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            } else {
                                hashSet = hashSet;
                                if (z9 != 0) {
                                    strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i10 != -1) {
                                        strJ = strJ + " (total length: " + i10 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            }
                            fVar.e(j10);
                        } else {
                            hashSet = hashSet;
                            int i14 = fVar.f10544i + this.f10590h;
                            byte[] bArr = new byte[(int) j];
                            fVar.readFully(bArr);
                            c cVar = new c(i14, bArr, unsignedShort3, i12);
                            mapArr[i3].put(dVar.f10552b, cVar);
                            str = dVar.f10552b;
                            if ("DNGVersion".equals(str)) {
                                this.f10586c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f10589f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f10589f) == 65535)) {
                                this.f10586c = 8;
                            }
                            if (fVar.f10544i != j10) {
                                fVar.e(j10);
                            }
                        }
                    } else {
                        fVar.e(j10);
                    }
                    s10 = (short) (s10 + 1);
                    hashSet2 = hashSet;
                    s9 = s9;
                    z9 = z9;
                }
                hashSet = hashSet2;
                if (z9 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j = 0;
                z6 = false;
                if (z6) {
                    fVar.e(j10);
                } else {
                    if (j > 4) {
                        i11 = fVar.readInt();
                        if (z9 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i11);
                        }
                        if (this.f10586c == 7) {
                            if ("MakerNote".equals(dVar.f10552b)) {
                                this.f10591i = i11;
                            } else if (i3 != 6) {
                            }
                        }
                        fVar.e(i11);
                    } else {
                        hashSet = hashSet;
                        unsignedShort2 = unsignedShort2;
                        i12 = i12;
                    }
                    num = (Integer) f10566K.get(Integer.valueOf(unsignedShort2));
                    if (z9 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j9 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z9 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f10552b));
                            }
                            i10 = fVar.f10546l;
                            if (j9 > 0) {
                                hashSet = hashSet;
                                if (z9 != 0) {
                                    strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i10 != -1) {
                                        strJ = strJ + " (total length: " + i10 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            } else {
                                hashSet = hashSet;
                                if (z9 != 0) {
                                    strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i10 != -1) {
                                        strJ = strJ + " (total length: " + i10 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            }
                            fVar.e(j10);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j9 = unsignedShort;
                        if (z9 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f10552b));
                        }
                        i10 = fVar.f10546l;
                        if (j9 > 0) {
                            hashSet = hashSet;
                            if (z9 != 0) {
                                strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                if (i10 != -1) {
                                    strJ = strJ + " (total length: " + i10 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        } else {
                            hashSet = hashSet;
                            if (z9 != 0) {
                                strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                if (i10 != -1) {
                                    strJ = strJ + " (total length: " + i10 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        }
                        fVar.e(j10);
                    } else {
                        hashSet = hashSet;
                        int i15 = fVar.f10544i + this.f10590h;
                        byte[] bArr2 = new byte[(int) j];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(i15, bArr2, unsignedShort3, i12);
                        mapArr[i3].put(dVar.f10552b, cVar2);
                        str = dVar.f10552b;
                        if ("DNGVersion".equals(str)) {
                            this.f10586c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f10586c = 8;
                        if (fVar.f10544i != j10) {
                            fVar.e(j10);
                        }
                    }
                }
                s10 = (short) (s10 + 1);
                hashSet2 = hashSet;
                s9 = s9;
                z9 = z9;
            } else if (z9) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            hashSet = hashSet2;
            j = 0;
            z6 = false;
            if (z6) {
                fVar.e(j10);
            } else {
                if (j > 4) {
                    i11 = fVar.readInt();
                    if (z9 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i11);
                    }
                    if (this.f10586c == 7) {
                        if ("MakerNote".equals(dVar.f10552b)) {
                            this.f10591i = i11;
                        } else if (i3 != 6) {
                        }
                    }
                    fVar.e(i11);
                } else {
                    hashSet = hashSet;
                    unsignedShort2 = unsignedShort2;
                    i12 = i12;
                }
                num = (Integer) f10566K.get(Integer.valueOf(unsignedShort2));
                if (z9 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j9 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z9 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f10552b));
                        }
                        i10 = fVar.f10546l;
                        if (j9 > 0) {
                            hashSet = hashSet;
                            if (z9 != 0) {
                                strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                if (i10 != -1) {
                                    strJ = strJ + " (total length: " + i10 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        } else {
                            hashSet = hashSet;
                            if (z9 != 0) {
                                strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                                if (i10 != -1) {
                                    strJ = strJ + " (total length: " + i10 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        }
                        fVar.e(j10);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j9 = unsignedShort;
                    if (z9 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), dVar.f10552b));
                    }
                    i10 = fVar.f10546l;
                    if (j9 > 0) {
                        hashSet = hashSet;
                        if (z9 != 0) {
                            strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                            if (i10 != -1) {
                                strJ = strJ + " (total length: " + i10 + ")";
                            }
                            Log.d("ExifInterface", strJ);
                        }
                    } else {
                        hashSet = hashSet;
                        if (z9 != 0) {
                            strJ = B2.a.j(j9, "Skip jump into the IFD since its offset is invalid: ");
                            if (i10 != -1) {
                                strJ = strJ + " (total length: " + i10 + ")";
                            }
                            Log.d("ExifInterface", strJ);
                        }
                    }
                    fVar.e(j10);
                } else {
                    hashSet = hashSet;
                    int i16 = fVar.f10544i + this.f10590h;
                    byte[] bArr3 = new byte[(int) j];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(i16, bArr3, unsignedShort3, i12);
                    mapArr[i3].put(dVar.f10552b, cVar3);
                    str = dVar.f10552b;
                    if ("DNGVersion".equals(str)) {
                        this.f10586c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f10586c = 8;
                    if (fVar.f10544i != j10) {
                        fVar.e(j10);
                    }
                }
            }
            s10 = (short) (s10 + 1);
            hashSet2 = hashSet;
            s9 = s9;
            z9 = z9;
        }
        HashSet hashSet3 = hashSet2;
        boolean z10 = z9;
        int i17 = fVar.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i17)));
        }
        long j11 = i17;
        if (j11 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i17);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i17))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i17);
                return;
            }
            return;
        }
        fVar.e(j11);
        if (mapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i3, String str, String str2) {
        HashMap[] mapArr = this.f10587d;
        if (mapArr[i3].isEmpty() || mapArr[i3].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i3];
        map.put(str2, map.get(str));
        mapArr[i3].remove(str);
    }

    public final void u(b bVar) throws IOException {
        c cVar;
        int iE;
        HashMap map = this.f10587d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f10589f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f10589f);
            int[] iArr2 = f10571m;
            if (Arrays.equals(iArr2, iArr) || (this.f10586c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f10589f)) == 1 && Arrays.equals(iArr, f10572n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrO = p199y3.e.o(cVar4.g(this.f10589f));
                long[] jArrO2 = p199y3.e.o(cVar5.g(this.f10589f));
                if (jArrO == null || jArrO.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrO2 == null || jArrO2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrO.length != jArrO2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j9 : jArrO2) {
                    j += j9;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i3 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < jArrO.length; i10++) {
                    int i11 = (int) jArrO[i10];
                    int i12 = (int) jArrO2[i10];
                    if (i10 < jArrO.length - 1 && i11 + i12 != jArrO[i10 + 1]) {
                        this.g = false;
                    }
                    int i13 = i11 - i3;
                    if (i13 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.b(i13);
                        int i14 = i3 + i13;
                        byte[] bArr2 = new byte[i12];
                        try {
                            bVar.readFully(bArr2);
                            i3 = i14 + i12;
                            System.arraycopy(bArr2, 0, bArr, i9, i12);
                            i9 += i12;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                        return;
                    }
                }
                if (this.g) {
                    long j10 = jArrO[0];
                    return;
                }
                return;
            }
        }
        if (f10570l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i3, int i9) {
        HashMap[] mapArr = this.f10587d;
        boolean zIsEmpty = mapArr[i3].isEmpty();
        boolean z6 = f10570l;
        if (zIsEmpty || mapArr[i9].isEmpty()) {
            if (z6) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i3].get("ImageLength");
        c cVar2 = (c) mapArr[i3].get("ImageWidth");
        c cVar3 = (c) mapArr[i9].get("ImageLength");
        c cVar4 = (c) mapArr[i9].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z6) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z6) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f10589f);
        int iE2 = cVar2.e(this.f10589f);
        int iE3 = cVar3.e(this.f10589f);
        int iE4 = cVar4.e(this.f10589f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i3];
        mapArr[i3] = mapArr[i9];
        mapArr[i9] = map;
    }

    public final void w(f fVar, int i3) throws IOException {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f10587d;
        c cVar = (c) mapArr[i3].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i3].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i3].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i3].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i3].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f10547a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f10589f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f10589f);
                cVarC2 = c.b(eVarArr[1], this.f10589f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f10589f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f10589f);
                cVarC2 = c.c(iArr[1], this.f10589f);
            }
            mapArr[i3].put("ImageWidth", cVarC);
            mapArr[i3].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f10589f);
            int iE2 = cVar4.e(this.f10589f);
            int iE3 = cVar5.e(this.f10589f);
            int iE4 = cVar3.e(this.f10589f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f10589f);
            c cVarC4 = c.c(iE3 - iE4, this.f10589f);
            mapArr[i3].put("ImageLength", cVarC3);
            mapArr[i3].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i3].get("ImageLength");
        c cVar7 = (c) mapArr[i3].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i3].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i3].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f10589f);
            int iE6 = cVar8.e(this.f10589f);
            fVar.e(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            e(new b(bArr), iE5, i3);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f10587d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
