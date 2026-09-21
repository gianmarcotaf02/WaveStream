package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Util {
    private static final int[] CRC16_BYTES_MSBF;
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;

    @java.lang.Deprecated
    public static final java.lang.String DEVICE;
    public static final java.lang.String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final long[] EMPTY_LONG_ARRAY;
    private static final java.util.regex.Pattern ESCAPED_CHARACTER_PATTERN;
    private static final java.lang.String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final java.lang.String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final java.util.regex.Pattern ISM_PATH_PATTERN;

    @java.lang.Deprecated
    public static final java.lang.String MANUFACTURER;

    @java.lang.Deprecated
    public static final java.lang.String MODEL;

    @java.lang.Deprecated
    public static final int SDK_INT;
    private static final java.lang.String TAG = "Util";
    private static final java.util.regex.Pattern XS_DATE_TIME_PATTERN;
    private static final java.util.regex.Pattern XS_DURATION_PATTERN;
    private static final int ZLIB_INFLATE_HEADER = 120;
    private static final java.lang.String[] additionalIsoLanguageReplacements;
    private static final java.lang.String[] isoLegacyTagReplacements;
    private static java.util.HashMap<java.lang.String, java.lang.String> languageTagReplacementMap;

    public static class Api24 {
        private Api24() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void stopForeground(android.app.Service service, boolean z6) {
            service.stopForeground(z6 ? 1 : 2);
        }
    }

    public static class Api26 {
        private Api26() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void createNotificationChannel(android.app.NotificationManager notificationManager, java.lang.String str, java.lang.String str2) {
            android.app.NotificationChannel notificationChannelG = U.AbstractC0944q.g(str, str2);
            if (android.os.Build.VERSION.SDK_INT <= 27) {
                notificationChannelG.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(notificationChannelG);
        }
    }

    public static class Api29 {
        private Api29() {
        }

        public static void startForeground(android.app.Service service, int i3, android.app.Notification notification, int i9, java.lang.String str) {
            try {
                service.startForeground(i3, notification, i9);
            } catch (java.lang.RuntimeException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.common.util.Util.TAG, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e6;
            }
        }
    }

    static {
        int i3 = android.os.Build.VERSION.SDK_INT;
        SDK_INT = i3;
        java.lang.String str = android.os.Build.DEVICE;
        DEVICE = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        MANUFACTURER = str2;
        java.lang.String str3 = android.os.Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i3;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        XS_DATE_TIME_PATTERN = java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        XS_DURATION_PATTERN = java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = java.util.regex.Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new java.lang.String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", io.sentry.protocol.User.JsonKeys.GEO, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new java.lang.String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, 180, 179, 186, androidx.media3.extractor.ts.PsExtractor.PRIVATE_STREAM_1, 199, androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.CREATED, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_HD, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 125, 122, 137, 142, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, ZLIB_INFLATE_HEADER, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, androidx.media3.extractor.ts.TsExtractor.TS_PACKET_SIZE, 187, 150, 145, 152, 159, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NO_CONTENT, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j, long j9, long j10) {
        long j11 = j + j9;
        long j12 = (((j9 ^ j) > 0L ? 1 : ((j9 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
        return ((j12 != Long.MIN_VALUE || j11 == Long.MIN_VALUE) && (j12 != Long.MAX_VALUE || j11 == Long.MAX_VALUE)) ? j12 : j10;
    }

    @java.lang.Deprecated
    public static boolean areEqual(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static int binarySearchCeil(int[] iArr, int i3, boolean z6, boolean z9) {
        int i9;
        int i10;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i3);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            while (true) {
                i9 = iBinarySearch + 1;
                if (i9 >= iArr.length || iArr[i9] != i3) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z6 ? iBinarySearch : i9;
        }
        return z9 ? java.lang.Math.min(iArr.length - 1, i10) : i10;
    }

    public static int binarySearchFloor(int[] iArr, int i3, boolean z6, boolean z9) {
        int i9;
        int i10;
        int iBinarySearch = java.util.Arrays.binarySearch(iArr, i3);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i9 = iBinarySearch - 1;
                if (i9 < 0 || iArr[i9] != i3) {
                    break;
                }
                iBinarySearch = i9;
            }
            i10 = z6 ? iBinarySearch : i9;
        }
        return z9 ? java.lang.Math.max(0, i10) : i10;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T castNonNull(T t9) {
        return t9;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static int ceilDivide(int i3, int i9) {
        return ((i3 + i9) - 1) / i9;
    }

    public static boolean checkCleartextTrafficPermitted(androidx.media3.common.MediaItem... mediaItemArr) {
        for (androidx.media3.common.MediaItem mediaItem : mediaItemArr) {
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i3 = 0; i3 < mediaItem.localConfiguration.subtitleConfigurations.size(); i3++) {
                    if (isTrafficRestricted(((androidx.media3.common.MediaItem.SubtitleConfiguration) mediaItem.localConfiguration.subtitleConfigurations.get(i3)).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @java.lang.Deprecated
    public static int compareLong(long j, long j9) {
        return java.lang.Long.compare(j, j9);
    }

    public static int constrainValue(int i3, int i9, int i10) {
        return java.lang.Math.max(i9, java.lang.Math.min(i3, i10));
    }

    public static boolean contains(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (java.util.Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contentEquals(android.util.SparseArray<T> sparseArray, android.util.SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 != null) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                return sparseArray.contentEquals(sparseArray2);
            }
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i3 = 0; i3 < size; i3++) {
                    if (java.util.Objects.equals(sparseArray.valueAt(i3), sparseArray2.get(sparseArray.keyAt(i3)))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <T> int contentHashCode(android.util.SparseArray<T> sparseArray) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iHashCode = 17;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            iHashCode = java.util.Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public static android.os.Bundle convertToNullIfInvalid(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        java.lang.ClassLoader classLoader = androidx.media3.common.util.Util.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (java.lang.RuntimeException e6) {
            androidx.media3.common.util.Log.e(TAG, "Ignoring invalid bundle", e6);
            return null;
        }
    }

    public static int crc16(byte[] bArr, int i3, int i9, int i10) {
        while (i3 < i9) {
            byte b9 = bArr[i3];
            i10 = crc16UpdateFourBits(b9 & 15, crc16UpdateFourBits((b9 & 255) >> 4, i10));
            i3++;
        }
        return i10;
    }

    private static int crc16UpdateFourBits(int i3, int i9) {
        int i10 = (i3 ^ ((i9 >> 12) & 255)) & 255;
        return (CRC16_BYTES_MSBF[i10] ^ ((i9 << 4) & io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE)) & io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE;
    }

    public static int crc32(byte[] bArr, int i3, int i9, int i10) {
        while (i3 < i9) {
            i10 = CRC32_BYTES_MSBF[((i10 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i10 << 8);
            i3++;
        }
        return i10;
    }

    public static int crc8(byte[] bArr, int i3, int i9, int i10) {
        while (i3 < i9) {
            i10 = CRC8_BYTES_MSBF[i10 ^ (bArr[i3] & 255)];
            i3++;
        }
        return i10;
    }

    public static android.os.Handler createHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new android.os.Handler(looper, callback);
    }

    public static android.os.Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> createIsoLanguageReplacementMap() {
        java.lang.String[] iSOLanguages = java.util.Locale.getISOLanguages();
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i3 = 0;
        for (java.lang.String str : iSOLanguages) {
            try {
                java.lang.String iSO3Language = new java.util.Locale(str).getISO3Language();
                if (!android.text.TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (java.util.MissingResourceException unused) {
            }
        }
        while (true) {
            java.lang.String[] strArr = additionalIsoLanguageReplacements;
            if (i3 >= strArr.length) {
                return map;
            }
            map.put(strArr[i3], strArr[i3 + 1]);
            i3 += 2;
        }
    }

    public static java.nio.ByteBuffer createReadOnlyByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    public static java.io.File createTempDirectory(android.content.Context context, java.lang.String str) {
        java.io.File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static java.io.File createTempFile(android.content.Context context, java.lang.String str) {
        java.io.File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        return java.io.File.createTempFile(str, null, cacheDir);
    }

    public static long durationUsToSampleCount(long j, int i3) {
        return scaleLargeValue(j, i3, 1000000L, java.math.RoundingMode.UP);
    }

    public static void ensureNotificationChannel(android.app.NotificationManager notificationManager, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT < 26 || notificationManager.getNotificationChannel(str) != null) {
            return;
        }
        androidx.media3.common.util.Util.Api26.createNotificationChannel(notificationManager, str, str2);
    }

    public static java.lang.String escapeFileName(java.lang.String str) {
        int length = str.length();
        int i3 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (shouldEscapeCharacter(str.charAt(i10))) {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i9 * 2) + length);
        while (i9 > 0) {
            int i11 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (shouldEscapeCharacter(cCharAt)) {
                sb.append('%');
                sb.append(java.lang.Integer.toHexString(cCharAt));
                i9--;
            } else {
                sb.append(cCharAt);
            }
            i3 = i11;
        }
        if (i3 < length) {
            sb.append((java.lang.CharSequence) str, i3, length);
        }
        return sb.toString();
    }

    public static android.net.Uri fixSmoothStreamingIsmManifestUri(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        java.util.regex.Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? android.net.Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static java.lang.String formatInvariant(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.lang.String fromUtf8Bytes(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static int generateAudioSessionIdV21(android.content.Context context) {
        int iGenerateAudioSessionId = androidx.media3.common.audio.AudioManagerCompat.getAudioManager(context).generateAudioSessionId();
        if (iGenerateAudioSessionId != -1) {
            return iGenerateAudioSessionId;
        }
        return 0;
    }

    public static java.lang.String getAdaptiveMimeTypeForContentType(int i3) {
        if (i3 == 0) {
            return androidx.media3.common.MimeTypes.APPLICATION_MPD;
        }
        if (i3 == 1) {
            return androidx.media3.common.MimeTypes.APPLICATION_SS;
        }
        if (i3 != 2) {
            return null;
        }
        return androidx.media3.common.MimeTypes.APPLICATION_M3U8;
    }

    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i3) {
        switch (i3) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    @java.lang.Deprecated
    public static int getAudioContentTypeForStreamType(int i3) {
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 5 || i3 == 8) {
                return 4;
            }
            if (i3 != 10) {
                return 2;
            }
        }
        return 1;
    }

    public static android.media.AudioFormat getAudioFormat(int i3, int i9, int i10) {
        return new android.media.AudioFormat.Builder().setSampleRate(i3).setChannelMask(i9).setEncoding(i10).build();
    }

    public static int getAudioTrackChannelConfig(int i3) {
        if (i3 == 10) {
            return android.os.Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i3 == 16) {
            return android.os.Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i3 == 24) {
            if (android.os.Build.VERSION.SDK_INT >= 32) {
                return androidx.media3.exoplayer.audio.IamfUtil.CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_H_9_10_3;
            }
            return 0;
        }
        switch (i3) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NO_CONTENT;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i3) {
                    case 12:
                        return 743676;
                    case 13:
                        return android.os.Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return android.os.Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    public static int getAudioUsageForStreamType(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 1) {
            return 13;
        }
        if (i3 == 2) {
            return 6;
        }
        int i9 = 4;
        if (i3 != 4) {
            i9 = 5;
            if (i3 != 5) {
                if (i3 != 8) {
                    return i3 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i9;
    }

    public static java.lang.String getAuxiliaryTrackTypeString(int i3) {
        if (i3 == 0) {
            return "undefined";
        }
        if (i3 == 1) {
            return "original";
        }
        if (i3 == 2) {
            return "depth-linear";
        }
        if (i3 == 3) {
            return "depth-inverse";
        }
        if (i3 == 4) {
            return "depth metadata";
        }
        throw new java.lang.IllegalStateException("Unsupported auxiliary track type");
    }

    public static androidx.media3.common.Player.Commands getAvailableCommands(androidx.media3.common.Player player, androidx.media3.common.Player.Commands commands) {
        boolean zIsPlayingAd = player.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean zHasNextMediaItem = player.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean zIsEmpty = player.getCurrentTimeline().isEmpty();
        boolean z6 = false;
        androidx.media3.common.Player.Commands.Builder builderAddIf = new androidx.media3.common.Player.Commands.Builder().addAll(commands).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z6 = true;
        }
        return builderAddIf.addIf(12, z6).build();
    }

    public static int getBigEndianInt(java.nio.ByteBuffer byteBuffer, int i3) {
        int i9 = byteBuffer.getInt(i3);
        return byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? i9 : java.lang.Integer.reverseBytes(i9);
    }

    public static int getBufferFlagsFromMediaCodecFlags(int i3) {
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        return (i3 & 4) == 4 ? i9 | 4 : i9;
    }

    public static int getByteDepth(int i3) {
        if (i3 != 2) {
            if (i3 == 3) {
                return 1;
            }
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 == 1879048192) {
                                        return 8;
                                    }
                                    throw new java.lang.IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static byte[] getBytesFromHexString(java.lang.String str) {
        p084j4.b bVar = p084j4.e.f23927e;
        p084j4.e bVar2 = bVar.f23931d;
        if (bVar2 == null) {
            p084j4.a aVarB = bVar.f23928a.b();
            bVar2 = aVarB == bVar.f23928a ? bVar : new p084j4.b(aVarB);
            bVar.f23931d = bVar2;
        }
        try {
            java.lang.CharSequence charSequenceD = bVar2.d(str);
            int length = (int) (((((long) bVar2.f23928a.f23921d) * ((long) charSequenceD.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iA = bVar2.a(bArr, charSequenceD);
            if (iA == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (p084j4.d e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public static int getCodecCountOfType(java.lang.String str, int i3) {
        int i9 = 0;
        for (java.lang.String str2 : splitCodecs(str)) {
            if (i3 == androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                i9++;
            }
        }
        return i9;
    }

    public static java.lang.String getCodecsOfType(java.lang.String str, int i3) {
        java.lang.String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArrSplitCodecs) {
            if (i3 == androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static java.lang.String getCodecsWithoutType(java.lang.String str, int i3) {
        java.lang.String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArrSplitCodecs) {
            if (i3 != androidx.media3.common.MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public static androidx.media3.common.ColorInfo getColorInfoForDolbyVision(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i3;
        int i9;
        if (str == null || !androidx.media3.common.MimeTypes.isDolbyVisionCodec(str, str2)) {
            return null;
        }
        int i10 = 6;
        if (!str.startsWith("dvhe") && !str.startsWith("dvh1") && !str.startsWith("dav1")) {
            if (str3 != null) {
                i3 = 2;
                if (!str3.equals("db1p")) {
                    if (str3.startsWith("db4")) {
                        i9 = 7;
                    } else {
                        i9 = -1;
                        i3 = -1;
                        i10 = -1;
                    }
                }
            } else {
                i9 = -1;
                i3 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                return null;
            }
            return new androidx.media3.common.ColorInfo.Builder().setColorSpace(i10).setColorRange(i3).setColorTransfer(i9).build();
        }
        i3 = 1;
        i9 = 6;
        if (i10 == -1) {
            return null;
        }
        return new androidx.media3.common.ColorInfo.Builder().setColorSpace(i10).setColorRange(i3).setColorTransfer(i9).build();
    }

    public static java.lang.String getCountryCode(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!android.text.TextUtils.isEmpty(networkCountryIso)) {
                return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.j0(networkCountryIso);
            }
        }
        return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.j0(java.util.Locale.getDefault().getCountry());
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    public static android.os.Looper getCurrentOrMainLooper() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : android.os.Looper.getMainLooper();
    }

    public static android.net.Uri getDataUriForString(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("data:", str, ";base64,");
        sbQ.append(android.util.Base64.encodeToString(str2.getBytes(), 2));
        return android.net.Uri.parse(sbQ.toString());
    }

    public static java.util.Locale getDefaultDisplayLocale() {
        return java.util.Locale.getDefault(java.util.Locale.Category.DISPLAY);
    }

    private static void getDisplaySize(android.view.Display display, android.graphics.Point point) {
        android.view.Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, android.content.res.Resources resources, int i3) {
        return resources.getDrawable(i3, context.getTheme());
    }

    public static java.util.UUID getDrmUuid(java.lang.String str) {
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str);
        strI0.getClass();
        switch (strI0) {
            case "playready":
                return androidx.media3.common.C.PLAYREADY_UUID;
            case "widevine":
                return androidx.media3.common.C.WIDEVINE_UUID;
            case "clearkey":
                return androidx.media3.common.C.CLEARKEY_UUID;
            default:
                try {
                    return java.util.UUID.fromString(str);
                } catch (java.lang.RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i3) {
        if (i3 == 2 || i3 == 4) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i3 == 10) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i3 == 7) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i3 == 8) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i3) {
            case 15:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i3) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(java.lang.String str) {
        java.lang.String[] strArrSplit;
        int length;
        int i3 = 0;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        java.lang.String str2 = strArrSplit[length - 1];
        boolean z6 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i3 = java.lang.Integer.parseInt(str2);
            if (z6) {
                return -i3;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        return i3;
    }

    public static java.lang.String getFormatSupportString(int i3) {
        if (i3 == 0) {
            return "NO";
        }
        if (i3 == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i3 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i3 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i3 == 4) {
            return "YES";
        }
        throw new java.lang.IllegalStateException();
    }

    public static int getInt24(java.nio.ByteBuffer byteBuffer, int i3) {
        java.nio.ByteOrder byteOrderOrder = byteBuffer.order();
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byte b9 = byteBuffer.get(byteOrderOrder == byteOrder ? i3 : i3 + 2);
        byte b10 = byteBuffer.get(i3 + 1);
        if (byteBuffer.order() == byteOrder) {
            i3 += 2;
        }
        return (((byteBuffer.get(i3) << 8) & 65280) | (((b9 << 24) & (-16777216)) | ((b10 << 16) & 16711680))) >> 8;
    }

    public static int getIntegerCodeForString(java.lang.String str) {
        int length = str.length();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(length <= 4);
        int iCharAt = 0;
        for (int i3 = 0; i3 < length; i3++) {
            iCharAt = (iCharAt << 8) | str.charAt(i3);
        }
        return iCharAt;
    }

    public static java.lang.String getLocaleLanguageTag(java.util.Locale locale) {
        return locale.toLanguageTag();
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(android.content.Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f9) {
        return f9 == 1.0f ? j : java.lang.Math.round(j * ((double) f9));
    }

    public static long getNowUnixTimeMs(long j) {
        return j == androidx.media3.common.C.TIME_UNSET ? java.lang.System.currentTimeMillis() : android.os.SystemClock.elapsedRealtime() + j;
    }

    public static int getPcmEncoding(int i3) {
        return getPcmEncoding(i3, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public static androidx.media3.common.Format getPcmFormat(int i3, int i9, int i10) {
        return new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setChannelCount(i9).setSampleRate(i10).setPcmEncoding(i3).build();
    }

    public static int getPcmFrameSize(int i3, int i9) {
        return getByteDepth(i3) * i9;
    }

    public static long getPlayoutDurationForMediaDuration(long j, float f9) {
        return f9 == 1.0f ? j : java.lang.Math.round(j / ((double) f9));
    }

    public static java.util.List<java.lang.String> getRoleFlagStrings(int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i3 & 1) != 0) {
            arrayList.add(io.sentry.protocol.SentryThread.JsonKeys.MAIN);
        }
        if ((i3 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i3 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i3 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i3 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i3 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i3 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i3 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i3 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i3 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i3 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i3 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i3 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i3 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i3 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i3 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static java.util.List<java.lang.String> getSelectionFlagStrings(int i3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i3 & 4) != 0) {
            arrayList.add(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO);
        }
        if ((i3 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i3 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @java.lang.Deprecated
    public static int getStreamTypeForAudioUsage(int i3) {
        switch (i3) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static java.lang.String getStringForTime(java.lang.StringBuilder sb, java.util.Formatter formatter, long j) {
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = 0;
        }
        java.lang.String str = j < 0 ? "-" : "";
        long jAbs = (java.lang.Math.abs(j) + 500) / 1000;
        long j9 = jAbs % 60;
        long j10 = (jAbs / 60) % 60;
        long j11 = jAbs / 3600;
        sb.setLength(0);
        return j11 > 0 ? formatter.format("%s%d:%02d:%02d", str, java.lang.Long.valueOf(j11), java.lang.Long.valueOf(j10), java.lang.Long.valueOf(j9)).toString() : formatter.format("%s%02d:%02d", str, java.lang.Long.valueOf(j10), java.lang.Long.valueOf(j9)).toString();
    }

    public static java.lang.String[] getSystemLanguageCodes() {
        java.lang.String[] systemLocales = getSystemLocales();
        for (int i3 = 0; i3 < systemLocales.length; i3++) {
            systemLocales[i3] = normalizeLanguageCode(systemLocales[i3]);
        }
        return systemLocales;
    }

    private static java.lang.String[] getSystemLocales() {
        return getSystemLocalesV24(android.content.res.Resources.getSystem().getConfiguration());
    }

    private static java.lang.String[] getSystemLocalesV24(android.content.res.Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    private static java.lang.String getSystemProperty(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception e6) {
            androidx.media3.common.util.Log.e(TAG, "Failed to read system property " + str, e6);
            return null;
        }
    }

    public static java.lang.String getTrackTypeString(int i3) {
        switch (i3) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                return i3 >= 10000 ? Y6.f.f(i3, "custom (", ")") : "?";
        }
    }

    public static java.lang.String getUserAgent(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        return Y6.f.m(sb, android.os.Build.VERSION.RELEASE, ") AndroidXMedia3/1.10.1");
    }

    public static byte[] getUtf8Bytes(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static byte[] gzip(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public static boolean handlePauseButtonAction(androidx.media3.common.Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean handlePlayButtonAction(androidx.media3.common.Player player) {
        boolean z6 = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState != 1 || !player.isCommandAvailable(2)) {
            if (playbackState == 4 && player.isCommandAvailable(4)) {
                player.seekToDefaultPosition();
            }
            if (player.isCommandAvailable(1)) {
                return z6;
            }
            player.play();
            return true;
        }
        player.prepare();
        z6 = true;
        if (player.isCommandAvailable(1)) {
            return z6;
        }
        player.play();
        return true;
    }

    public static boolean handlePlayPauseButtonAction(androidx.media3.common.Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    @java.lang.Deprecated
    public static int inferContentType(android.net.Uri uri, java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(java.lang.String str) {
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str);
        strI0.getClass();
        switch (strI0) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(android.net.Uri uri, java.lang.String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean inflate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, java.util.zip.Inflater inflater) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(parsableByteArray2.getData(), iInflate, parsableByteArray2.capacity() - iInflate);
                if (inflater.finished()) {
                    parsableByteArray2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (java.util.zip.DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (java.lang.Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static java.lang.String intToStringMaxRadix(int i3) {
        return java.lang.Integer.toString(i3, 36);
    }

    private static boolean isAppSpecificStorageFileUri(android.app.Activity activity, android.net.Uri uri) {
        try {
            java.lang.String path = uri.getPath();
            if (path == null) {
                return false;
            }
            java.lang.String canonicalPath = new java.io.File(path).getCanonicalPath();
            java.lang.String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            java.lang.String canonicalPath3 = null;
            java.io.File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            return canonicalPath3 != null && canonicalPath.startsWith(canonicalPath3);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static boolean isAutomotive(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean isBitmapFactorySupportedMimeType(java.lang.String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return android.os.Build.VERSION.SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return android.os.Build.VERSION.SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static boolean isEncodingHighResolutionPcm(int i3) {
        return i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4 || i3 == 1879048192;
    }

    public static boolean isEncodingLinearPcm(int i3) {
        return i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4 || i3 == 1879048192;
    }

    public static boolean isFrameDropAllowedOnSurfaceInput(android.content.Context context) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i3 == 30) {
            java.lang.String str = android.os.Build.MODEL;
            if (com.google.crypto.tink.shaded.protobuf.AbstractC1909d.P(str, "moto g(20)") || com.google.crypto.tink.shaded.protobuf.AbstractC1909d.P(str, "rmx3231")) {
                return true;
            }
        }
        return i3 == 34 && com.google.crypto.tink.shaded.protobuf.AbstractC1909d.P(android.os.Build.MODEL, "sm-x200");
    }

    public static boolean isLinebreak(int i3) {
        return i3 == 10 || i3 == 13;
    }

    public static boolean isLocalFileUri(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        return android.text.TextUtils.isEmpty(scheme) || java.util.Objects.equals(scheme, "file");
    }

    private static boolean isMediaStoreExternalContentUri(android.net.Uri uri) {
        if (!java.util.Objects.equals(uri.getScheme(), "content") || !java.util.Objects.equals(uri.getAuthority(), io.ktor.http.LinkHeader.Parameters.Media)) {
            return false;
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        java.lang.String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    private static boolean isReadStoragePermissionRequestNeeded(android.app.Activity activity, android.net.Uri uri) {
        if (isLocalFileUri(uri)) {
            return !isAppSpecificStorageFileUri(activity, uri);
        }
        return isMediaStoreExternalContentUri(uri);
    }

    public static boolean isRunningOnEmulator() {
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(android.os.Build.DEVICE);
        return strI0.contains("emulator") || strI0.contains("emu64a") || strI0.contains("emu64x") || strI0.contains("generic");
    }

    public static boolean isSorted(long[] jArr) {
        int i3 = 0;
        while (i3 < jArr.length - 1) {
            long j = jArr[i3];
            i3++;
            if (j > jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTrafficRestricted(android.net.Uri uri) {
        if (!"http".equals(uri.getScheme())) {
            return false;
        }
        android.security.NetworkSecurityPolicy networkSecurityPolicy = android.security.NetworkSecurityPolicy.getInstance();
        java.lang.String host = uri.getHost();
        host.getClass();
        return !networkSecurityPolicy.isCleartextTrafficPermitted(host);
    }

    public static boolean isTv(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean isWear(android.content.Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Thread lambda$newSingleThreadExecutor$3(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Thread lambda$newSingleThreadScheduledExecutor$4(java.lang.String str, java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postOrRunWithCompletion$0(com.google.common.util.concurrent.Q q9, java.lang.Runnable runnable, java.lang.Object obj) {
        try {
            if (q9.isCancelled()) {
                return;
            }
            runnable.run();
            q9.set(obj);
        } catch (java.lang.Throwable th) {
            q9.setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transformFutureAsync$1(com.google.common.util.concurrent.Q q9, com.google.common.util.concurrent.J j) {
        if (q9.isCancelled()) {
            j.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transformFutureAsync$2(com.google.common.util.concurrent.J j, com.google.common.util.concurrent.Q q9, com.google.common.util.concurrent.w wVar) {
        try {
            try {
                q9.setFuture(wVar.apply(com.google.common.util.concurrent.D.u(j)));
            } catch (java.lang.Throwable th) {
                q9.setException(th);
            }
        } catch (java.lang.Error e6) {
            e = e6;
            q9.setException(e);
        } catch (java.util.concurrent.CancellationException unused) {
            q9.cancel(false);
        } catch (java.lang.RuntimeException e9) {
            e = e9;
            q9.setException(e);
        } catch (java.util.concurrent.ExecutionException e10) {
            e = e10;
            java.lang.Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            q9.setException(e);
        }
    }

    public static int linearSearch(int[] iArr, int i3) {
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (iArr[i9] == i3) {
                return i9;
            }
        }
        return -1;
    }

    public static java.lang.String loadAsset(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return fromUtf8Bytes(p084j4.g.b(inputStreamOpen));
        } finally {
            closeQuietly(inputStreamOpen);
        }
    }

    public static java.lang.String loadRawResource(android.content.Context context, int i3) {
        java.io.InputStream inputStreamOpenRawResource = null;
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(i3);
            return fromUtf8Bytes(p084j4.g.b(inputStreamOpenRawResource));
        } finally {
            closeQuietly(inputStreamOpenRawResource);
        }
    }

    public static long maxValue(android.util.SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new java.util.NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i3 = 0; i3 < sparseLongArray.size(); i3++) {
            jMax = java.lang.Math.max(jMax, sparseLongArray.valueAt(i3));
        }
        return jMax;
    }

    public static boolean maybeInflate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, java.util.zip.Inflater inflater) {
        return parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == ZLIB_INFLATE_HEADER && inflate(parsableByteArray, parsableByteArray2, inflater);
    }

    private static java.lang.String maybeReplaceLegacyLanguageTags(java.lang.String str) {
        int i3 = 0;
        while (true) {
            java.lang.String[] strArr = isoLegacyTagReplacements;
            if (i3 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i3])) {
                return strArr[i3 + 1] + str.substring(strArr[i3].length());
            }
            i3 += 2;
        }
    }

    @java.lang.Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity activity, android.net.Uri... uriArr) {
        for (android.net.Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(android.app.Activity activity, androidx.media3.common.MediaItem... mediaItemArr) {
        for (androidx.media3.common.MediaItem mediaItem : mediaItemArr) {
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                p076i4.AbstractC2186b0 abstractC2186b0 = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
                    if (maybeRequestReadStoragePermission(activity, ((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long minValue(android.util.SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new java.util.NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < sparseLongArray.size(); i3++) {
            jMin = java.lang.Math.min(jMin, sparseLongArray.valueAt(i3));
        }
        return jMin;
    }

    public static <T> void moveItems(java.util.List<T> list, int i3, int i9, int i10) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        for (int i11 = (i9 - i3) - 1; i11 >= 0; i11--) {
            arrayDeque.addFirst(list.remove(i3 + i11));
        }
        list.addAll(java.lang.Math.min(i10, list.size()), arrayDeque);
    }

    public static long msToUs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static java.util.concurrent.ExecutorService newSingleThreadExecutor(java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new androidx.media3.common.util.g(str, 0));
    }

    public static java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor(java.lang.String str) {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new androidx.media3.common.util.g(str, 1));
    }

    public static java.lang.String normalizeLanguageCode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str);
        java.lang.String str2 = splitAtFirst(strI0, "-")[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        java.lang.String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            java.lang.StringBuilder sbV = p121o0.p.v(str3);
            sbV.append(strI0.substring(str2.length()));
            strI0 = sbV.toString();
            str2 = str3;
        }
        return ("no".equals(str2) || androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(strI0) : strI0;
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t9) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t9;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length + tArr2.length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 <= tArr.length);
        return (T[]) java.util.Arrays.copyOf(tArr, i3);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i9 <= tArr.length);
        return (T[]) java.util.Arrays.copyOfRange(tArr, i3, i9);
    }

    public static <T> void nullSafeListToArray(java.util.List<T> list, T[] tArr) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static long parseXsDateTime(java.lang.String str) throws androidx.media3.common.ParserException {
        java.util.regex.Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i3 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int i9 = java.lang.Integer.parseInt(matcher.group(12)) * 60;
            java.lang.String strGroup = matcher.group(13);
            i3 = strGroup != null ? java.lang.Integer.parseInt(strGroup) + i9 : i9;
            if ("-".equals(matcher.group(11))) {
                i3 *= -1;
            }
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(j$.util.DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)) - 1, java.lang.Integer.parseInt(matcher.group(3)), java.lang.Integer.parseInt(matcher.group(4)), java.lang.Integer.parseInt(matcher.group(5)), java.lang.Integer.parseInt(matcher.group(6)));
        if (!android.text.TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new java.math.BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i3 != 0 ? timeInMillis - (((long) i3) * 60000) : timeInMillis;
    }

    public static long parseXsDuration(java.lang.String str) {
        java.util.regex.Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (java.lang.Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = android.text.TextUtils.isEmpty(matcher.group(1));
        java.lang.String strGroup = matcher.group(3);
        double d4 = strGroup != null ? java.lang.Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        java.lang.String strGroup2 = matcher.group(5);
        double d6 = d4 + (strGroup2 != null ? java.lang.Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        java.lang.String strGroup3 = matcher.group(7);
        double d9 = d6 + (strGroup3 != null ? java.lang.Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        java.lang.String strGroup4 = matcher.group(10);
        double d10 = d9 + (strGroup4 != null ? java.lang.Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        java.lang.String strGroup5 = matcher.group(12);
        double d11 = d10 + (strGroup5 != null ? java.lang.Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        java.lang.String strGroup6 = matcher.group(14);
        long j = (long) ((d11 + (strGroup6 != null ? java.lang.Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j : j;
    }

    public static float percentFloat(long j, long j9) {
        if (j9 == 0 || j != j9) {
            return (j / j9) * 100.0f;
        }
        return 100.0f;
    }

    public static int percentInt(long j, long j9) {
        long jD = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(j, 100L);
        return com.google.crypto.tink.shaded.protobuf.q0.F((jD == Long.MAX_VALUE || jD == Long.MIN_VALUE) ? j / (j9 / 100) : jD / j9);
    }

    public static boolean postOrRun(android.os.Handler handler, java.lang.Runnable runnable) {
        android.os.Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != android.os.Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> com.google.common.util.concurrent.J postOrRunWithCompletion(android.os.Handler handler, java.lang.Runnable runnable, T t9) {
        com.google.common.util.concurrent.Q q9 = new com.google.common.util.concurrent.Q();
        postOrRun(handler, new O.g(q9, runnable, t9, 3));
        return q9;
    }

    public static void putInt24(java.nio.ByteBuffer byteBuffer, int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.P(((-16777216) & i3) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", java.lang.Integer.toHexString(i3));
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(byteBuffer.remaining() >= 3);
        java.nio.ByteOrder byteOrderOrder = byteBuffer.order();
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byteBuffer.put((byte) (byteOrderOrder == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((65280 & i3) >> 8)).put((byte) (byteBuffer.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
    }

    public static boolean readBoolean(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void recursiveDelete(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static android.content.Intent registerReceiverNotExported(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return android.os.Build.VERSION.SDK_INT < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static <T> void removeRange(java.util.List<T> list, int i3, int i9) {
        if (i3 < 0 || i9 > list.size() || i3 > i9) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i3 != i9) {
            list.subList(i3, i9).clear();
        }
    }

    private static boolean requestExternalStoragePermission(android.app.Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    private static boolean requestReadMediaPermissions(android.app.Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    public static long sampleCountToDurationUs(long j, int i3) {
        return scaleLargeValue(j, 1000000L, i3, java.math.RoundingMode.DOWN);
    }

    public static long scaleLargeTimestamp(long j, long j9, long j10) {
        return scaleLargeValue(j, j9, j10, java.math.RoundingMode.DOWN);
    }

    public static long[] scaleLargeTimestamps(java.util.List<java.lang.Long> list, long j, long j9) {
        return scaleLargeValues(list, j, j9, java.math.RoundingMode.DOWN);
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j9) {
        scaleLargeValuesInPlace(jArr, j, j9, java.math.RoundingMode.DOWN);
    }

    public static long scaleLargeValue(long j, long j9, long j10, java.math.RoundingMode roundingMode) {
        if (j == 0 || j9 == 0) {
            return 0L;
        }
        if (j10 >= j9 && j10 % j9 == 0) {
            return com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j10, j9, java.math.RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return com.google.android.gms.internal.play_billing.AbstractC1853k0.D(j, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j9, j10, java.math.RoundingMode.UNNECESSARY));
        }
        if (j10 < j || j10 % j != 0) {
            return (j10 >= j || j % j10 != 0) ? scaleLargeValueFallback(j, j9, j10, roundingMode) : com.google.android.gms.internal.play_billing.AbstractC1853k0.D(j9, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j, j10, java.math.RoundingMode.UNNECESSARY));
        }
        return com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j9, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j10, j, java.math.RoundingMode.UNNECESSARY), roundingMode);
    }

    private static long scaleLargeValueFallback(long j, long j9, long j10, java.math.RoundingMode roundingMode) {
        long jD = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(j, j9);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return com.google.android.gms.internal.play_billing.AbstractC1853k0.l(jD, j10, roundingMode);
        }
        long jS = com.google.android.gms.internal.play_billing.AbstractC1853k0.s(java.lang.Math.abs(j9), java.lang.Math.abs(j10));
        java.math.RoundingMode roundingMode2 = java.math.RoundingMode.UNNECESSARY;
        long jL = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j9, jS, roundingMode2);
        long jL2 = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j10, jS, roundingMode2);
        long jS2 = com.google.android.gms.internal.play_billing.AbstractC1853k0.s(java.lang.Math.abs(j), java.lang.Math.abs(jL2));
        long jL3 = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j, jS2, roundingMode2);
        long jL4 = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(jL2, jS2, roundingMode2);
        long jD2 = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(jL3, jL);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return com.google.android.gms.internal.play_billing.AbstractC1853k0.l(jD2, jL4, roundingMode);
        }
        double d4 = jL3 * (jL / jL4);
        if (d4 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d4 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return p091k4.c.d(d4, roundingMode);
    }

    public static long[] scaleLargeValues(java.util.List<java.lang.Long> list, long j, long j9, java.math.RoundingMode roundingMode) {
        long j10 = j;
        long j11 = j9;
        java.math.RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j10 != 0) {
            int i3 = 0;
            if (j11 >= j10 && j11 % j10 == 0) {
                long jL = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j11, j10, java.math.RoundingMode.UNNECESSARY);
                while (i3 < size) {
                    jArr[i3] = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(list.get(i3).longValue(), jL, roundingMode2);
                    i3++;
                }
            } else if (j11 >= j10 || j10 % j11 != 0) {
                int i9 = 0;
                while (i9 < size) {
                    long jLongValue = list.get(i9).longValue();
                    if (jLongValue != 0) {
                        if (j11 >= jLongValue && j11 % jLongValue == 0) {
                            jArr[i9] = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j10, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j11, jLongValue, java.math.RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j11 >= jLongValue || jLongValue % j11 != 0) {
                            jArr[i9] = scaleLargeValueFallback(jLongValue, j10, j11, roundingMode2);
                        } else {
                            jArr[i9] = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(j10, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(jLongValue, j11, java.math.RoundingMode.UNNECESSARY));
                        }
                    }
                    i9++;
                    j10 = j;
                    j11 = j9;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jL2 = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j10, j11, java.math.RoundingMode.UNNECESSARY);
                while (i3 < size) {
                    jArr[i3] = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(list.get(i3).longValue(), jL2);
                    i3++;
                }
            }
        }
        return jArr;
    }

    public static void scaleLargeValuesInPlace(long[] jArr, long j, long j9, java.math.RoundingMode roundingMode) {
        if (j == 0) {
            java.util.Arrays.fill(jArr, 0L);
            return;
        }
        int i3 = 0;
        if (j9 >= j && j9 % j == 0) {
            long jL = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j9, j, java.math.RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(jArr[i3], jL, roundingMode);
                i3++;
            }
            return;
        }
        if (j9 < j && j % j9 == 0) {
            long jL2 = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j, j9, java.math.RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(jArr[i3], jL2);
                i3++;
            }
            return;
        }
        for (int i9 = 0; i9 < jArr.length; i9++) {
            long j10 = jArr[i9];
            if (j10 != 0) {
                if (j9 >= j10 && j9 % j10 == 0) {
                    jArr[i9] = com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j9, j10, java.math.RoundingMode.UNNECESSARY), roundingMode);
                } else if (j9 >= j10 || j10 % j9 != 0) {
                    jArr[i9] = scaleLargeValueFallback(j10, j, j9, roundingMode);
                } else {
                    jArr[i9] = com.google.android.gms.internal.play_billing.AbstractC1853k0.D(j, com.google.android.gms.internal.play_billing.AbstractC1853k0.l(j10, j9, java.math.RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static void setForegroundServiceNotification(android.app.Service service, int i3, android.app.Notification notification, int i9, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.media3.common.util.Util.Api29.startForeground(service, i3, notification, i9, str);
        } else {
            service.startForeground(i3, notification);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean shouldEnablePlayPauseButton(androidx.media3.common.Player player) {
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        return (!player.isCommandAvailable(16) || player.getCurrentMediaItem() != null) && (player.isCommandAvailable(1) || (playbackState == 1 && player.isCommandAvailable(2)) || (playbackState == 4 && player.isCommandAvailable(4)));
    }

    private static boolean shouldEscapeCharacter(char c9) {
        return c9 == '\"' || c9 == '%' || c9 == '*' || c9 == '/' || c9 == ':' || c9 == '<' || c9 == '\\' || c9 == '|' || c9 == '>' || c9 == '?';
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(androidx.media3.common.Player player) {
        return shouldShowPlayButton(player, true);
    }

    public static void sneakyThrow(java.lang.Throwable th) throws java.lang.Throwable {
        sneakyThrowInternal(th);
    }

    public static java.lang.String[] split(java.lang.String str, java.lang.String str2) {
        return str.split(str2, -1);
    }

    public static java.lang.String[] splitAtFirst(java.lang.String str, java.lang.String str2) {
        return str.split(str2, 2);
    }

    public static java.lang.String[] splitCodecs(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? new java.lang.String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    public static android.content.ComponentName startForegroundService(android.content.Context context, android.content.Intent intent) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static void stopForeground(android.app.Service service, boolean z6) {
        androidx.media3.common.util.Util.Api24.stopForeground(service, z6);
    }

    public static long subtractWithOverflowDefault(long j, long j9, long j10) {
        long j11 = j - j9;
        long j12 = (((j9 ^ j) > 0L ? 1 : ((j9 ^ j) == 0L ? 0 : -1)) >= 0) | ((j ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
        return ((j12 != Long.MIN_VALUE || j11 == Long.MIN_VALUE) && (j12 != Long.MAX_VALUE || j11 == Long.MAX_VALUE)) ? j12 : j10;
    }

    public static long sum(long... jArr) {
        long j = 0;
        for (long j9 : jArr) {
            j += j9;
        }
        return j;
    }

    public static boolean tableExists(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        return android.database.DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new java.lang.String[]{str}) > 0;
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) {
        return p084j4.g.b(inputStream);
    }

    public static java.lang.String toFourccString(int i3) {
        return new java.lang.String(new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3}, java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static java.lang.String toHexString(byte[] bArr) {
        boolean z6;
        p084j4.b bVar = p084j4.e.f23927e;
        p084j4.e bVar2 = bVar.f23930c;
        if (bVar2 == null) {
            p084j4.a aVarB = bVar.f23928a;
            char[] cArr = aVarB.f23919b;
            for (char c9 : cArr) {
                if (com.google.crypto.tink.shaded.protobuf.AbstractC1909d.a0(c9)) {
                    int length = cArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z6 = false;
                            break;
                        }
                        char c10 = cArr[i3];
                        if (c10 >= 'a' && c10 <= 'z') {
                            z6 = true;
                            break;
                        }
                        i3++;
                    }
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(!z6, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i9 = 0; i9 < cArr.length; i9++) {
                        char c11 = cArr[i9];
                        if (com.google.crypto.tink.shaded.protobuf.AbstractC1909d.a0(c11)) {
                            c11 = (char) (c11 ^ ' ');
                        }
                        cArr2[i9] = c11;
                    }
                    p084j4.a aVar = new p084j4.a(Y6.f.m(new java.lang.StringBuilder(), aVarB.f23918a, ".lowerCase()"), cArr2);
                    if (!aVarB.f23925i) {
                        aVarB = aVar;
                        break;
                    }
                    aVarB = aVar.b();
                    break;
                }
            }
            bVar2 = aVarB == bVar.f23928a ? bVar : new p084j4.b(aVarB);
            bVar.f23930c = bVar2;
        }
        int length2 = bArr.length;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.W(0, length2, bArr.length);
        p084j4.a aVar2 = bVar2.f23928a;
        int i10 = aVar2.f23922e;
        int i11 = aVar2.f23923f;
        java.math.RoundingMode roundingMode = java.math.RoundingMode.CEILING;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.google.crypto.tink.shaded.protobuf.AbstractC1911f.r(length2, i11) * i10);
        try {
            bVar2.c(sb, bArr, length2);
            return sb.toString();
        } catch (java.io.IOException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }

    public static long toLong(int i3, int i9) {
        return toUnsignedLong(i9) | (toUnsignedLong(i3) << 32);
    }

    public static long toUnsignedLong(int i3) {
        return ((long) i3) & 4294967295L;
    }

    public static <T, U> com.google.common.util.concurrent.J transformFutureAsync(com.google.common.util.concurrent.J j, com.google.common.util.concurrent.w wVar) {
        com.google.common.util.concurrent.Q q9 = new com.google.common.util.concurrent.Q();
        androidx.media3.common.util.f fVar = new androidx.media3.common.util.f(q9, j, 5);
        com.google.common.util.concurrent.z zVar = com.google.common.util.concurrent.z.f19464h;
        q9.addListener(fVar, zVar);
        j.addListener(new O.g(j, q9, wVar, 2), zVar);
        return q9;
    }

    public static java.lang.String unescapeFileName(java.lang.String str) {
        int length = str.length();
        int iEnd = 0;
        int i3 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i10 = length - (i3 * 2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i10);
        java.util.regex.Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i3 > 0 && matcher.find()) {
            java.lang.String strGroup = matcher.group(1);
            strGroup.getClass();
            char c9 = (char) java.lang.Integer.parseInt(strGroup, 16);
            sb.append((java.lang.CharSequence) str, iEnd, matcher.start());
            sb.append(c9);
            iEnd = matcher.end();
            i3--;
        }
        if (iEnd < length) {
            sb.append((java.lang.CharSequence) str, iEnd, length);
        }
        if (sb.length() != i10) {
            return null;
        }
        return sb.toString();
    }

    public static long usToMs(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static void writeBoolean(android.os.Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static long ceilDivide(long j, long j9) {
        return ((j + j9) - 1) / j9;
    }

    public static long constrainValue(long j, long j9, long j10) {
        return java.lang.Math.max(j9, java.lang.Math.min(j, j10));
    }

    public static android.os.Handler createHandlerForCurrentLooper(android.os.Handler.Callback callback) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        looperMyLooper.getClass();
        return createHandler(looperMyLooper, callback);
    }

    public static android.os.Handler createHandlerForCurrentOrMainLooper(android.os.Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    public static java.lang.String fromUtf8Bytes(byte[] bArr, int i3, int i9) {
        return new java.lang.String(bArr, i3, i9, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static int getPcmEncoding(int i3, java.nio.ByteOrder byteOrder) {
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i3 == 24) {
            if (byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN)) {
                return 21;
            }
            return androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        }
        if (i3 != 32) {
            return 0;
        }
        if (byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN)) {
            return 22;
        }
        return androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN;
    }

    public static boolean handlePlayPauseButtonAction(androidx.media3.common.Player player, boolean z6) {
        return shouldShowPlayButton(player, z6) ? handlePlayButtonAction(player) : handlePauseButtonAction(player);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(androidx.media3.common.Player player, boolean z6) {
        return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4 || !(!z6 || player.getPlaybackSuppressionReason() == 0 || player.getPlaybackSuppressionReason() == 4);
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i3 = 0;
        for (int i9 : iArr) {
            bArr[i3] = (byte) (i9 >> 24);
            bArr[i3 + 1] = (byte) (i9 >> 16);
            int i10 = i3 + 3;
            bArr[i3 + 2] = (byte) (i9 >> 8);
            i3 += 4;
            bArr[i10] = (byte) i9;
        }
        return bArr;
    }

    public static float constrainValue(float f9, float f10, float f11) {
        return java.lang.Math.max(f10, java.lang.Math.min(f9, f11));
    }

    public static <T> boolean contains(android.util.SparseArray<T> sparseArray, int i3) {
        return sparseArray.indexOfKey(i3) >= 0;
    }

    public static int linearSearch(long[] jArr, long j) {
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    @java.lang.Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(android.app.Activity activity, androidx.media3.common.MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    public static int binarySearchCeil(long[] jArr, long j, boolean z6, boolean z9) {
        int i3;
        int i9;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i9 = ~iBinarySearch;
        } else {
            while (true) {
                i3 = iBinarySearch + 1;
                if (i3 >= jArr.length || jArr[i3] != j) {
                    break;
                }
                iBinarySearch = i3;
            }
            i9 = z6 ? iBinarySearch : i3;
        }
        return z9 ? java.lang.Math.min(jArr.length - 1, i9) : i9;
    }

    public static int binarySearchFloor(long[] jArr, long j, boolean z6, boolean z9) {
        int i3;
        int i9;
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j) {
                    break;
                }
                iBinarySearch = i3;
            }
            i9 = z6 ? iBinarySearch : i3;
        }
        return z9 ? java.lang.Math.max(0, i9) : i9;
    }

    public static double constrainValue(double d4, double d6, double d9) {
        return java.lang.Math.max(d6, java.lang.Math.min(d4, d9));
    }

    public static int inferContentType(android.net.Uri uri) {
        int iInferContentTypeForExtension;
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && (com.google.crypto.tink.shaded.protobuf.AbstractC1909d.P("rtsp", scheme) || com.google.crypto.tink.shaded.protobuf.AbstractC1909d.P("rtspt", scheme))) {
            return 3;
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
                return iInferContentTypeForExtension;
            }
            java.util.regex.Pattern pattern = ISM_PATH_PATTERN;
            java.lang.String path = uri.getPath();
            path.getClass();
            java.util.regex.Matcher matcher = pattern.matcher(path);
            if (matcher.matches()) {
                java.lang.String strGroup = matcher.group(2);
                if (strGroup != null) {
                    if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
                        return 0;
                    }
                    if (strGroup.contains(ISM_HLS_FORMAT_EXTENSION)) {
                        return 2;
                    }
                }
                return 1;
            }
        }
        return 4;
    }

    public static boolean postOrRun(androidx.media3.common.util.HandlerWrapper handlerWrapper, java.lang.Runnable runnable) {
        android.os.Looper looper = handlerWrapper.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == android.os.Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handlerWrapper.post(runnable);
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchCeil(java.util.List<? extends java.lang.Comparable<? super T>> list, T t9, boolean z6, boolean z9) {
        int i3;
        int i9;
        int iBinarySearch = java.util.Collections.binarySearch(list, t9);
        if (iBinarySearch < 0) {
            i9 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i3 = iBinarySearch + 1;
                if (i3 >= size || list.get(i3).compareTo(t9) != 0) {
                    break;
                }
                iBinarySearch = i3;
            }
            i9 = z6 ? iBinarySearch : i3;
        }
        return z9 ? java.lang.Math.min(list.size() - 1, i9) : i9;
    }

    public static <T extends java.lang.Comparable<? super T>> int binarySearchFloor(java.util.List<? extends java.lang.Comparable<? super T>> list, T t9, boolean z6, boolean z9) {
        int i3;
        int i9;
        int iBinarySearch = java.util.Collections.binarySearch(list, t9);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || list.get(i3).compareTo(t9) != 0) {
                    break;
                }
                iBinarySearch = i3;
            }
            i9 = z6 ? iBinarySearch : i3;
        }
        return z9 ? java.lang.Math.max(0, i9) : i9;
    }

    public static androidx.media3.common.Format getPcmFormat(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    private static boolean maybeRequestReadStoragePermission(android.app.Activity activity, android.net.Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    public static byte[] toByteArray(float f9) {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(f9);
        return new byte[]{(byte) (iFloatToIntBits >> 24), (byte) (iFloatToIntBits >> 16), (byte) (iFloatToIntBits >> 8), (byte) iFloatToIntBits};
    }

    public static android.graphics.Point getCurrentDisplayModeSize(android.content.Context context, android.view.Display display) {
        java.lang.String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!android.text.TextUtils.isEmpty(systemProperty)) {
                try {
                    java.lang.String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i3 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i9 = java.lang.Integer.parseInt(strArrSplit[1]);
                        if (i3 > 0 && i9 > 0) {
                            return new android.graphics.Point(i3, i9);
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                androidx.media3.common.util.Log.e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(android.os.Build.MANUFACTURER) && android.os.Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new android.graphics.Point(3840, 2160);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        getDisplaySize(display, point);
        return point;
    }

    public static int binarySearchFloor(androidx.media3.common.util.LongArray longArray, long j, boolean z6, boolean z9) {
        int i3;
        int size = longArray.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            if (longArray.get(i10) < j) {
                i9 = i10 + 1;
            } else {
                size = i10 - 1;
            }
        }
        if (z6 && (i3 = size + 1) < longArray.size() && longArray.get(i3) == j) {
            return i3;
        }
        if (z9 && size == -1) {
            return 0;
        }
        return size;
    }

    public static java.lang.String getStringForTime(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        return getStringForTime(sb, new java.util.Formatter(sb, java.util.Locale.getDefault()), j);
    }

    @java.lang.Deprecated
    public static int inferContentType(java.lang.String str) {
        return inferContentType(android.net.Uri.parse("file:///" + str));
    }

    private static <T extends java.lang.Throwable> void sneakyThrowInternal(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }
}
