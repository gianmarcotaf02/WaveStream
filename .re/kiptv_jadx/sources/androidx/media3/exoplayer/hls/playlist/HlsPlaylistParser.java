package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsPlaylistParser implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> {
    private static final java.lang.String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final java.lang.String ATTR_QUOTED_STRING_VALUE_PATTERN = "\"((?:.|\f)+?)\"";
    private static final java.lang.String BOOLEAN_FALSE = "NO";
    private static final java.lang.String BOOLEAN_TRUE = "YES";
    private static final java.lang.String DATERANGE_CLASS_INTERSTITIALS = "com.apple.hls.interstitial";
    private static final java.lang.String KEYFORMAT_IDENTITY = "identity";
    private static final java.lang.String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final java.lang.String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final java.lang.String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final java.lang.String LOG_TAG = "HlsPlaylistParser";
    private static final java.lang.String METHOD_AES_128 = "AES-128";
    private static final java.lang.String METHOD_NONE = "NONE";
    private static final java.lang.String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final java.lang.String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final java.lang.String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final java.lang.String PLAYLIST_HEADER = "#EXTM3U";
    private static final java.lang.String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final java.lang.String TAG_DATERANGE = "#EXT-X-DATERANGE";
    private static final java.lang.String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final java.lang.String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final java.lang.String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final java.lang.String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final java.lang.String TAG_GAP = "#EXT-X-GAP";
    private static final java.lang.String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final java.lang.String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final java.lang.String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final java.lang.String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final java.lang.String TAG_KEY = "#EXT-X-KEY";
    private static final java.lang.String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final java.lang.String TAG_MEDIA_DURATION = "#EXTINF";
    private static final java.lang.String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final java.lang.String TAG_PART = "#EXT-X-PART";
    private static final java.lang.String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final java.lang.String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final java.lang.String TAG_PREFIX = "#EXT";
    private static final java.lang.String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final java.lang.String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final java.lang.String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final java.lang.String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final java.lang.String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final java.lang.String TAG_SKIP = "#EXT-X-SKIP";
    private static final java.lang.String TAG_START = "#EXT-X-START";
    private static final java.lang.String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final java.lang.String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final java.lang.String TAG_VERSION = "#EXT-X-VERSION";
    private static final java.lang.String TYPE_AUDIO = "AUDIO";
    private static final java.lang.String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final java.lang.String TYPE_MAP = "MAP";
    private static final java.lang.String TYPE_PART = "PART";
    private static final java.lang.String TYPE_SUBTITLES = "SUBTITLES";
    private static final java.lang.String TYPE_VIDEO = "VIDEO";
    private final androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;
    private final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist previousMediaPlaylist;
    private static final java.util.regex.Pattern REGEX_AVERAGE_BANDWIDTH = java.util.regex.Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_VIDEO = java.util.regex.Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_AUDIO = java.util.regex.Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_SUBTITLES = java.util.regex.Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_CLOSED_CAPTIONS = java.util.regex.Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_BANDWIDTH = java.util.regex.Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_CHANNELS = java.util.regex.Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_VIDEO_RANGE = java.util.regex.Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final java.util.regex.Pattern REGEX_CODECS = java.util.regex.Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_SUPPLEMENTAL_CODECS = java.util.regex.Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_RESOLUTION = java.util.regex.Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final java.util.regex.Pattern REGEX_FRAME_RATE = java.util.regex.Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_PATHWAY_ID = java.util.regex.Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_STABLE_VARIANT_ID = java.util.regex.Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_STABLE_RENDITION_ID = java.util.regex.Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_TARGET_DURATION = java.util.regex.Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_ATTR_DURATION = java.util.regex.Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_ATTR_DURATION_PREFIXED = java.util.regex.Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_PART_TARGET_DURATION = java.util.regex.Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_VERSION = java.util.regex.Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_PLAYLIST_TYPE = java.util.regex.Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final java.util.regex.Pattern REGEX_CAN_SKIP_UNTIL = java.util.regex.Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final java.util.regex.Pattern REGEX_SKIPPED_SEGMENTS = java.util.regex.Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_HOLD_BACK = java.util.regex.Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_PART_HOLD_BACK = java.util.regex.Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final java.util.regex.Pattern REGEX_MEDIA_SEQUENCE = java.util.regex.Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_MEDIA_DURATION = java.util.regex.Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_MEDIA_TITLE = java.util.regex.Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final java.util.regex.Pattern REGEX_LAST_MSN = java.util.regex.Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_LAST_PART = java.util.regex.Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_TIME_OFFSET = java.util.regex.Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_BYTERANGE = java.util.regex.Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final java.util.regex.Pattern REGEX_ATTR_BYTERANGE = java.util.regex.Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final java.util.regex.Pattern REGEX_BYTERANGE_START = java.util.regex.Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_BYTERANGE_LENGTH = java.util.regex.Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_METHOD = java.util.regex.Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final java.util.regex.Pattern REGEX_KEYFORMAT = java.util.regex.Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_KEYFORMATVERSIONS = java.util.regex.Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_URI = java.util.regex.Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_IV = java.util.regex.Pattern.compile("IV=([^,.*]+)");
    private static final java.util.regex.Pattern REGEX_TYPE = java.util.regex.Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final java.util.regex.Pattern REGEX_PRELOAD_HINT_TYPE = java.util.regex.Pattern.compile("TYPE=(PART|MAP)");
    private static final java.util.regex.Pattern REGEX_LANGUAGE = java.util.regex.Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_NAME = java.util.regex.Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_QUERY_PARAM = java.util.regex.Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_GROUP_ID = java.util.regex.Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_CHARACTERISTICS = java.util.regex.Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_INSTREAM_ID = java.util.regex.Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final java.util.regex.Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final java.util.regex.Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final java.util.regex.Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final java.util.regex.Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final java.util.regex.Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final java.util.regex.Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final java.util.regex.Pattern REGEX_VALUE = java.util.regex.Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_IMPORT = java.util.regex.Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_ID = java.util.regex.Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_CLASS = java.util.regex.Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_START_DATE = java.util.regex.Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_CUE = java.util.regex.Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_END_DATE = java.util.regex.Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_PLANNED_DURATION = java.util.regex.Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_END_ON_NEXT = compileBooleanAttrPattern("END-ON-NEXT");
    private static final java.util.regex.Pattern REGEX_ASSET_URI = java.util.regex.Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_ASSET_LIST_URI = java.util.regex.Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_RESUME_OFFSET = java.util.regex.Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_PLAYOUT_LIMIT = java.util.regex.Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_SNAP = java.util.regex.Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_RESTRICT = java.util.regex.Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_CONTENT_MAY_VARY = java.util.regex.Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_TIMELINE_OCCUPIES = java.util.regex.Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_TIMELINE_STYLE = java.util.regex.Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_SKIP_CONTROL_OFFSET = java.util.regex.Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_SKIP_CONTROL_DURATION = java.util.regex.Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_SKIP_CONTROL_LABEL_ID = java.util.regex.Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    private static final java.util.regex.Pattern REGEX_VARIABLE_REFERENCE = java.util.regex.Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final java.util.regex.Pattern REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX = java.util.regex.Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends java.io.IOException {
    }

    public static class LineIterator {
        private final java.util.Queue<java.lang.String> extraLines;
        private java.lang.String next;
        private final java.io.BufferedReader reader;

        public LineIterator(java.util.Queue<java.lang.String> queue, java.io.BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {io.ktor.http.LinkHeader.Rel.Next}, result = true)
        public boolean hasNext() throws java.io.IOException {
            java.lang.String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                java.lang.String strPoll = this.extraLines.poll();
                strPoll.getClass();
                this.next = strPoll;
                return true;
            }
            do {
                java.lang.String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public java.lang.String next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.String str = this.next;
            this.next = null;
            return str;
        }
    }

    public static final class MatcherCache extends java.util.LinkedHashMap<java.util.regex.Pattern, java.util.regex.Matcher> {
        /* JADX INFO: Access modifiers changed from: private */
        public java.util.regex.Matcher obtainMatcher(java.util.regex.Pattern pattern, java.lang.CharSequence charSequence) {
            java.util.regex.Matcher matcher = get(pattern);
            if (matcher != null) {
                matcher.reset(charSequence);
                return matcher;
            }
            java.util.regex.Matcher matcher2 = pattern.matcher(charSequence);
            put(pattern, matcher2);
            return matcher2;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(java.util.Map.Entry<java.util.regex.Pattern, java.util.regex.Matcher> entry) {
            return size() > 32;
        }

        private MatcherCache() {
            super(16, 0.75f, true);
        }
    }

    public HlsPlaylistParser() {
        this(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.EMPTY, null);
    }

    private static boolean checkPlaylistHeader(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        int i3 = bufferedReader.read();
        if (i3 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i3 = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i3);
        for (int i9 = 0; i9 < 7; i9++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i9)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return androidx.media3.common.util.Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static java.util.regex.Pattern compileBooleanAttrPattern(java.lang.String str) {
        return java.util.regex.Pattern.compile(str + "=(NO|YES)");
    }

    private static androidx.media3.common.DrmInitData getPlaylistProtectionSchemes(java.lang.String str, androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr) {
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr2 = new androidx.media3.common.DrmInitData.SchemeData[schemeDataArr.length];
        for (int i3 = 0; i3 < schemeDataArr.length; i3++) {
            schemeDataArr2[i3] = schemeDataArr[i3].copyWithData(null);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr2);
    }

    private static java.lang.String getSegmentEncryptionIV(long j, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : java.lang.Long.toHexString(j);
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(java.util.ArrayList<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> arrayList, java.lang.String str) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = arrayList.get(i3);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(java.util.ArrayList<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> arrayList, java.lang.String str) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = arrayList.get(i3);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(java.util.ArrayList<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> arrayList, java.lang.String str) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = arrayList.get(i3);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static boolean isDolbyVisionFormat(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (!androidx.media3.common.MimeTypes.isDolbyVisionCodec(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute parseClientDefinedAttribute(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.lang.String strO = p121o0.p.o(str2, "=");
        int length = strO.length() + str.indexOf(strO);
        java.lang.String strSubstring = str.substring(length, (str.length() == length + 1 ? 1 : 2) + length);
        if (strSubstring.startsWith("\"")) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, java.util.regex.Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map, matcherCache), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, java.util.regex.Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map, matcherCache), 1);
        }
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ClientDefinedAttribute(str2, parseDoubleAttr(str, java.util.regex.Pattern.compile(str2 + "=([\\d\\.]+)\\b"), matcherCache));
    }

    private static double parseDoubleAttr(java.lang.String str, java.util.regex.Pattern pattern, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        return java.lang.Double.parseDouble(parseStringAttr(str, pattern, java.util.Collections.EMPTY_MAP, matcherCache));
    }

    private static androidx.media3.common.DrmInitData.SchemeData parseDrmSchemeData(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) throws androidx.media3.common.ParserException {
        java.lang.String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map, matcherCache);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            java.lang.String stringAttr = parseStringAttr(str, REGEX_URI, map, matcherCache);
            return new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.WIDEVINE_UUID, androidx.media3.common.MimeTypes.VIDEO_MP4, android.util.Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.WIDEVINE_UUID, "hls", androidx.media3.common.util.Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(optionalStringAttr)) {
            return null;
        }
        java.lang.String stringAttr2 = parseStringAttr(str, REGEX_URI, map, matcherCache);
        byte[] bArrDecode = android.util.Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        java.util.UUID uuid = androidx.media3.common.C.PLAYREADY_UUID;
        return new androidx.media3.common.DrmInitData.SchemeData(uuid, androidx.media3.common.MimeTypes.VIDEO_MP4, androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static java.lang.String parseEncryptionScheme(java.lang.String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? androidx.media3.common.C.CENC_TYPE_cenc : androidx.media3.common.C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(java.lang.String str, java.util.regex.Pattern pattern, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        return java.lang.Integer.parseInt(parseStringAttr(str, pattern, java.util.Collections.EMPTY_MAP, matcherCache));
    }

    private static long parseLongAttr(java.lang.String str, java.util.regex.Pattern pattern, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        return java.lang.Long.parseLong(parseStringAttr(str, pattern, java.util.Collections.EMPTY_MAP, matcherCache));
    }

    /* JADX WARN: Code duplicated, block: B:191:0x056f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0573  */
    /* JADX WARN: Code duplicated, block: B:194:0x0576  */
    /* JADX WARN: Code duplicated, block: B:257:0x073a A[PHI: r40
  0x073a: PHI (r40v16 int) = (r40v12 int), (r40v13 int), (r40v14 int), (r40v17 int) binds: [B:267:0x075e, B:263:0x0751, B:259:0x0744, B:256:0x0738] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x0885  */
    /* JADX WARN: Code duplicated, block: B:334:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:349:0x08fe A[PHI: r39
  0x08fe: PHI (r39v22 java.util.regex.Matcher) = 
  (r39v9 java.util.regex.Matcher)
  (r39v10 java.util.regex.Matcher)
  (r39v11 java.util.regex.Matcher)
  (r39v12 java.util.regex.Matcher)
  (r39v13 java.util.regex.Matcher)
  (r39v14 java.util.regex.Matcher)
  (r39v15 java.util.regex.Matcher)
  (r39v16 java.util.regex.Matcher)
  (r39v17 java.util.regex.Matcher)
  (r39v18 java.util.regex.Matcher)
  (r39v19 java.util.regex.Matcher)
  (r39v20 java.util.regex.Matcher)
  (r39v23 java.util.regex.Matcher)
 binds: [B:395:0x09a6, B:391:0x0999, B:387:0x098c, B:383:0x097f, B:379:0x0972, B:375:0x0965, B:371:0x0958, B:367:0x0949, B:363:0x0939, B:359:0x0929, B:355:0x0919, B:351:0x0909, B:348:0x08fc] A[DONT_GENERATE, DONT_INLINE]] */
    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator lineIterator, android.net.Uri uri, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) throws androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.DeltaUpdateException, androidx.media3.common.ParserException {
        java.lang.String str;
        java.util.TreeMap treeMap;
        java.lang.String str2;
        long j;
        java.lang.String str3;
        long j9;
        int i3;
        androidx.media3.common.DrmInitData playlistProtectionSchemes;
        androidx.media3.common.DrmInitData drmInitData;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        long j10;
        java.lang.String str7;
        boolean z6;
        androidx.media3.common.DrmInitData drmInitData2;
        java.lang.String str8;
        java.lang.String str9;
        java.util.regex.Matcher matcher;
        byte b9;
        int i9;
        byte b10;
        long j11;
        java.lang.String str10;
        androidx.media3.common.DrmInitData playlistProtectionSchemes2;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part;
        long j12;
        androidx.media3.common.DrmInitData drmInitData3;
        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        java.lang.String string = uri.toString();
        boolean z9 = hlsMultivariantPlaylist.hasIndependentSegments;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = hlsMediaPlaylist2 != null ? hlsMediaPlaylist2.lastSeenInitSegment : null;
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl(androidx.media3.common.C.TIME_UNSET, false, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false);
        java.util.TreeMap treeMap2 = new java.util.TreeMap();
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        boolean z10 = z9;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment2 = segment;
        java.lang.String str11 = "";
        java.lang.String optionalStringAttr = str11;
        long doubleAttr = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long intAttr = -9223372036854775807L;
        long j14 = 0;
        long j15 = 0;
        long jMsToUs = 0;
        long j16 = 0;
        long j17 = 0;
        long timeSecondsToUs = 0;
        long j18 = 0;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part2 = null;
        boolean z11 = false;
        boolean z12 = false;
        int intAttr2 = 1;
        androidx.media3.common.DrmInitData playlistProtectionSchemes3 = null;
        androidx.media3.common.DrmInitData drmInitData4 = null;
        int i10 = 0;
        java.lang.String stringAttr = null;
        java.lang.String str12 = null;
        long j19 = -1;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j20 = -1;
        java.lang.String str13 = null;
        boolean z15 = false;
        long longAttr = 0;
        int i12 = 0;
        while (lineIterator.hasNext()) {
            linkedHashMap2 = linkedHashMap2;
            java.lang.String next = lineIterator.next();
            z11 = z11;
            if (next.startsWith(TAG_PREFIX)) {
                arrayList4.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                java.lang.String stringAttr2 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map, matcherCache);
                if ("VOD".equals(stringAttr2)) {
                    i12 = 1;
                } else if ("EVENT".equals(stringAttr2)) {
                    i12 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                linkedHashMap2 = linkedHashMap2;
                z11 = z11;
                z15 = true;
            } else if (next.startsWith(TAG_START)) {
                java.util.ArrayList arrayList5 = arrayList4;
                long j21 = j14;
                long doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET, matcherCache) * 1000000.0d);
                boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false, matcherCache);
                arrayList4 = arrayList5;
                j13 = doubleAttr2;
                linkedHashMap2 = linkedHashMap2;
                z11 = optionalBooleanAttribute;
                j14 = j21;
            } else {
                java.util.ArrayList arrayList6 = arrayList4;
                long j22 = j14;
                if (next.startsWith(TAG_SERVER_CONTROL)) {
                    serverControl = parseServerControl(next, matcherCache);
                } else if (next.startsWith(TAG_PART_INF)) {
                    doubleAttr = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION, matcherCache) * 1000000.0d);
                } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                    java.lang.String stringAttr3 = parseStringAttr(next, REGEX_URI, map, matcherCache);
                    java.lang.String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map, matcherCache);
                    if (optionalStringAttr2 != null) {
                        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(optionalStringAttr2, "@");
                        j19 = java.lang.Long.parseLong(strArrSplit[0]);
                        if (strArrSplit.length > 1) {
                            j16 = java.lang.Long.parseLong(strArrSplit[1]);
                        }
                    }
                    long j23 = j19;
                    if (j23 == j20) {
                        j16 = 0;
                    }
                    if (stringAttr != null && str12 == null) {
                        throw androidx.media3.common.ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                    }
                    java.lang.String str14 = stringAttr;
                    long j24 = j16;
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment3 = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(stringAttr3, j24, j23, str14, str12);
                    j16 = j23 != j20 ? j24 + j23 : j24;
                    stringAttr = str14;
                    arrayList4 = arrayList6;
                    segment2 = segment3;
                    j14 = j22;
                    j19 = j20;
                } else {
                    arrayList4 = arrayList6;
                    java.lang.String str15 = stringAttr;
                    java.lang.String str16 = str12;
                    if (next.startsWith(TAG_TARGET_DURATION)) {
                        str = str16;
                        intAttr = ((long) parseIntAttr(next, REGEX_TARGET_DURATION, matcherCache)) * 1000000;
                    } else {
                        str = str16;
                        if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                            longAttr = parseLongAttr(next, REGEX_MEDIA_SEQUENCE, matcherCache);
                            stringAttr = str15;
                            str12 = str;
                            j14 = longAttr;
                        } else if (next.startsWith(TAG_VERSION)) {
                            intAttr2 = parseIntAttr(next, REGEX_VERSION, matcherCache);
                        } else {
                            if (next.startsWith(TAG_DEFINE)) {
                                java.lang.String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_NAME, map, matcherCache);
                                java.lang.String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_QUERY_PARAM, map, matcherCache);
                                if (optionalStringAttr3 != null) {
                                    verifyVariableNameNotContainedOrThrow(optionalStringAttr3, map);
                                    map.put(optionalStringAttr3, parseStringAttr(next, REGEX_VALUE, map, matcherCache));
                                } else if (optionalStringAttr4 != null) {
                                    verifyVariableNameNotContainedOrThrow(optionalStringAttr4, map);
                                    java.lang.String queryParameter = uri.getQueryParameter(optionalStringAttr4);
                                    if (queryParameter == null) {
                                        throw androidx.media3.common.ParserException.createForMalformedManifest("QUERYPARAM \"" + optionalStringAttr4 + "\" not found in playlist URI", null);
                                    }
                                    map.put(optionalStringAttr4, queryParameter);
                                } else {
                                    java.lang.String stringAttr4 = parseStringAttr(next, REGEX_IMPORT, map, matcherCache);
                                    verifyVariableNameNotContainedOrThrow(stringAttr4, map);
                                    java.lang.String str17 = hlsMultivariantPlaylist.variableDefinitions.get(stringAttr4);
                                    if (str17 != null) {
                                        map.put(stringAttr4, str17);
                                    }
                                }
                                part2 = part2;
                                treeMap = treeMap2;
                                map2 = map2;
                                arrayList = arrayList;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList3;
                            } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                                timeSecondsToUs = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION, matcherCache);
                                optionalStringAttr = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str11, map, matcherCache);
                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                            } else {
                                str11 = str11;
                                if (next.startsWith(TAG_SKIP)) {
                                    int intAttr3 = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS, matcherCache);
                                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(hlsMediaPlaylist2 != null && arrayList.isEmpty());
                                    int i13 = (int) (longAttr - ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) androidx.media3.common.util.Util.castNonNull(hlsMediaPlaylist2)).mediaSequence);
                                    int i14 = i13 + intAttr3;
                                    if (i13 < 0 || i14 > hlsMediaPlaylist2.segments.size()) {
                                        throw new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.DeltaUpdateException();
                                    }
                                    str12 = str;
                                    java.lang.String str18 = str15;
                                    long j25 = j17;
                                    while (i13 < i14) {
                                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist2.segments.get(i13);
                                        int i15 = i13;
                                        int i16 = i14;
                                        if (longAttr != hlsMediaPlaylist2.mediaSequence) {
                                            segmentCopyWith = segmentCopyWith.copyWith(j25, (hlsMediaPlaylist2.discontinuitySequence - i11) + segmentCopyWith.relativeDiscontinuitySequence);
                                        }
                                        arrayList.add(segmentCopyWith);
                                        j25 += segmentCopyWith.durationUs;
                                        long j26 = segmentCopyWith.byteRangeLength;
                                        if (j26 != j20) {
                                            j16 = segmentCopyWith.byteRangeOffset + j26;
                                        }
                                        int i17 = segmentCopyWith.relativeDiscontinuitySequence;
                                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment4 = segmentCopyWith.initializationSegment;
                                        drmInitData4 = segmentCopyWith.drmInitData;
                                        java.lang.String str19 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                        java.lang.String str20 = segmentCopyWith.encryptionIV;
                                        if (str20 == null || !str20.equals(java.lang.Long.toHexString(j22))) {
                                            str12 = segmentCopyWith.encryptionIV;
                                        }
                                        j22++;
                                        i13 = i15 + 1;
                                        j15 = j25;
                                        i14 = i16;
                                        str18 = str19;
                                        i10 = i17;
                                        segment2 = segment4;
                                    }
                                    j17 = j25;
                                    stringAttr = str18;
                                } else if (next.startsWith(TAG_KEY)) {
                                    java.lang.String stringAttr5 = parseStringAttr(next, REGEX_METHOD, map, matcherCache);
                                    java.lang.String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map, matcherCache);
                                    if (METHOD_NONE.equals(stringAttr5)) {
                                        treeMap2.clear();
                                        drmInitData4 = null;
                                        stringAttr = null;
                                        str12 = null;
                                    } else {
                                        java.lang.String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_IV, map, matcherCache);
                                        if (!KEYFORMAT_IDENTITY.equals(optionalStringAttr5)) {
                                            java.lang.String encryptionScheme = str13 == null ? parseEncryptionScheme(stringAttr5) : str13;
                                            androidx.media3.common.DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, optionalStringAttr5, map, matcherCache);
                                            if (drmSchemeData != null) {
                                                treeMap2.put(optionalStringAttr5, drmSchemeData);
                                                str13 = encryptionScheme;
                                                str12 = optionalStringAttr6;
                                                drmInitData4 = null;
                                                stringAttr = null;
                                            } else {
                                                str13 = encryptionScheme;
                                                str12 = optionalStringAttr6;
                                                stringAttr = null;
                                            }
                                        } else if (METHOD_AES_128.equals(stringAttr5)) {
                                            stringAttr = parseStringAttr(next, REGEX_URI, map, matcherCache);
                                            str12 = optionalStringAttr6;
                                        } else {
                                            str12 = optionalStringAttr6;
                                            stringAttr = null;
                                        }
                                    }
                                } else {
                                    if (next.startsWith(TAG_BYTERANGE)) {
                                        java.lang.String[] strArrSplit2 = androidx.media3.common.util.Util.split(parseStringAttr(next, REGEX_BYTERANGE, map, matcherCache), "@");
                                        j19 = java.lang.Long.parseLong(strArrSplit2[0]);
                                        if (strArrSplit2.length > 1) {
                                            j16 = java.lang.Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else {
                                        if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                            i11 = java.lang.Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                            stringAttr = str15;
                                            str12 = str;
                                            z12 = true;
                                        } else if (next.equals(TAG_DISCONTINUITY)) {
                                            i10++;
                                        } else if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                            if (jMsToUs == 0) {
                                                jMsToUs = androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j17;
                                            } else {
                                                treeMap = treeMap2;
                                            }
                                        } else if (next.equals(TAG_GAP)) {
                                            str11 = str11;
                                            stringAttr = str15;
                                            str12 = str;
                                            j14 = j22;
                                            z13 = true;
                                        } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                            str11 = str11;
                                            stringAttr = str15;
                                            str12 = str;
                                            j14 = j22;
                                            z10 = true;
                                        } else if (next.equals(TAG_ENDLIST)) {
                                            str11 = str11;
                                            stringAttr = str15;
                                            str12 = str;
                                            j14 = j22;
                                            z14 = true;
                                        } else {
                                            if (next.startsWith(TAG_RENDITION_REPORT)) {
                                                treeMap = treeMap2;
                                                str3 = str;
                                                arrayList3.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport(android.net.Uri.parse(androidx.media3.common.util.UriUtil.resolve(string, parseStringAttr(next, REGEX_URI, map, matcherCache))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j20, matcherCache), parseOptionalIntAttr(next, REGEX_LAST_PART, -1, matcherCache)));
                                            } else {
                                                treeMap = treeMap2;
                                                str3 = str;
                                                if (!next.startsWith(TAG_PRELOAD_HINT)) {
                                                    part2 = part2;
                                                    java.lang.String str21 = str13;
                                                    str2 = string;
                                                    long j27 = j22;
                                                    if (next.startsWith(TAG_PART)) {
                                                        java.lang.String segmentEncryptionIV = getSegmentEncryptionIV(j27, str15, str3);
                                                        java.lang.String stringAttr6 = parseStringAttr(next, REGEX_URI, map, matcherCache);
                                                        java.util.HashMap map3 = map2;
                                                        java.util.ArrayList arrayList7 = arrayList;
                                                        long doubleAttr3 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION, matcherCache) * 1000000.0d);
                                                        boolean optionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false, matcherCache) | (z10 && arrayList2.isEmpty());
                                                        boolean optionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_GAP, false, matcherCache);
                                                        java.lang.String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map, matcherCache);
                                                        if (optionalStringAttr7 != null) {
                                                            java.lang.String[] strArrSplit3 = androidx.media3.common.util.Util.split(optionalStringAttr7, "@");
                                                            j9 = java.lang.Long.parseLong(strArrSplit3[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                j18 = java.lang.Long.parseLong(strArrSplit3[1]);
                                                            }
                                                        } else {
                                                            j9 = -1;
                                                        }
                                                        int i18 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                                                        if (i18 == 0) {
                                                            j18 = 0;
                                                        }
                                                        if (drmInitData4 != null || treeMap.isEmpty()) {
                                                            i3 = i18;
                                                            playlistProtectionSchemes = playlistProtectionSchemes3;
                                                            drmInitData = drmInitData4;
                                                        } else {
                                                            i3 = i18;
                                                            androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = (androidx.media3.common.DrmInitData.SchemeData[]) treeMap.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                                                            androidx.media3.common.DrmInitData drmInitData5 = new androidx.media3.common.DrmInitData(str21, schemeDataArr);
                                                            if (playlistProtectionSchemes3 == null) {
                                                                playlistProtectionSchemes = getPlaylistProtectionSchemes(str21, schemeDataArr);
                                                                drmInitData = drmInitData5;
                                                            } else {
                                                                drmInitData = drmInitData5;
                                                                playlistProtectionSchemes = playlistProtectionSchemes3;
                                                            }
                                                        }
                                                        long j28 = j15;
                                                        long j29 = j9;
                                                        long j30 = j18;
                                                        arrayList2.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(stringAttr6, segment2, doubleAttr3, i10, j28, drmInitData, str15, segmentEncryptionIV, j30, j29, optionalBooleanAttribute3, optionalBooleanAttribute2, false));
                                                        j15 = j28 + doubleAttr3;
                                                        j18 = i3 != 0 ? j30 + j29 : j30;
                                                        str11 = str11;
                                                        playlistProtectionSchemes3 = playlistProtectionSchemes;
                                                        stringAttr = str15;
                                                        j14 = j27;
                                                        str12 = str3;
                                                        drmInitData4 = drmInitData;
                                                        map2 = map3;
                                                        string = str2;
                                                        treeMap2 = treeMap;
                                                        part2 = part2;
                                                        arrayList = arrayList7;
                                                        j20 = -1;
                                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                        str13 = str21;
                                                    } else {
                                                        java.util.HashMap map4 = map2;
                                                        java.util.ArrayList arrayList8 = arrayList;
                                                        if (next.startsWith(TAG_DATERANGE) && parseOptionalStringAttr(next, REGEX_CLASS, str11, map, matcherCache).equals(DATERANGE_CLASS_INTERSTITIALS)) {
                                                            java.lang.String stringAttr7 = parseStringAttr(next, REGEX_ID, map, matcherCache);
                                                            java.lang.String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_ASSET_URI, map, matcherCache);
                                                            android.net.Uri uri2 = optionalStringAttr8 != null ? android.net.Uri.parse(optionalStringAttr8) : null;
                                                            java.lang.String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_ASSET_LIST_URI, map, matcherCache);
                                                            android.net.Uri uri3 = optionalStringAttr9 != null ? android.net.Uri.parse(optionalStringAttr9) : null;
                                                            java.lang.String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_START_DATE, map, matcherCache);
                                                            long jMsToUs2 = optionalStringAttr10 != null ? androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.parseXsDateTime(optionalStringAttr10)) : -9223372036854775807L;
                                                            str11 = str11;
                                                            java.lang.String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_END_DATE, map, matcherCache);
                                                            long jMsToUs3 = optionalStringAttr11 != null ? androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.parseXsDateTime(optionalStringAttr11)) : -9223372036854775807L;
                                                            arrayList3 = arrayList3;
                                                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                                            str4 = str21;
                                                            java.lang.String optionalStringAttr12 = parseOptionalStringAttr(next, REGEX_CUE, map, matcherCache);
                                                            str5 = str15;
                                                            if (optionalStringAttr12 != null) {
                                                                java.lang.String[] strArrSplit4 = androidx.media3.common.util.Util.split(optionalStringAttr12, ",");
                                                                int length = strArrSplit4.length;
                                                                int i19 = 0;
                                                                while (i19 < length) {
                                                                    java.lang.String[] strArr = strArrSplit4;
                                                                    java.lang.String strTrim = strArrSplit4[i19].trim();
                                                                    strTrim.getClass();
                                                                    switch (strTrim.hashCode()) {
                                                                        case 79491:
                                                                            i9 = length;
                                                                            if (!strTrim.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                                                                                b10 = -1;
                                                                            } else {
                                                                                b10 = 0;
                                                                            }
                                                                            break;
                                                                        case 2430593:
                                                                            i9 = length;
                                                                            if (!strTrim.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_ONCE)) {
                                                                                b10 = -1;
                                                                            } else {
                                                                                b10 = 1;
                                                                            }
                                                                            break;
                                                                        case 2461856:
                                                                            i9 = length;
                                                                            if (!strTrim.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
                                                                                b10 = -1;
                                                                            } else {
                                                                                b10 = 2;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            i9 = length;
                                                                            b10 = -1;
                                                                            break;
                                                                    }
                                                                    switch (b10) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                            arrayList9.add(strTrim);
                                                                            break;
                                                                    }
                                                                    i19++;
                                                                    length = i9;
                                                                    strArrSplit4 = strArr;
                                                                }
                                                            }
                                                            double optionalDoubleAttr = parseOptionalDoubleAttr(next, REGEX_ATTR_DURATION_PREFIXED, -1.0d, matcherCache);
                                                            long j31 = optionalDoubleAttr >= 0.0d ? (long) (optionalDoubleAttr * 1000000.0d) : -9223372036854775807L;
                                                            double optionalDoubleAttr2 = parseOptionalDoubleAttr(next, REGEX_PLANNED_DURATION, -1.0d, matcherCache);
                                                            long j32 = optionalDoubleAttr2 >= 0.0d ? (long) (optionalDoubleAttr2 * 1000000.0d) : -9223372036854775807L;
                                                            str6 = str3;
                                                            boolean optionalBooleanAttribute4 = parseOptionalBooleanAttribute(next, REGEX_END_ON_NEXT, false, matcherCache);
                                                            long j33 = j32;
                                                            double optionalDoubleAttr3 = parseOptionalDoubleAttr(next, REGEX_RESUME_OFFSET, Double.MIN_VALUE, matcherCache);
                                                            long j34 = optionalDoubleAttr3 != Double.MIN_VALUE ? (long) (optionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L;
                                                            double optionalDoubleAttr4 = parseOptionalDoubleAttr(next, REGEX_PLAYOUT_LIMIT, -1.0d, matcherCache);
                                                            long j35 = optionalDoubleAttr4 >= 0.0d ? (long) (optionalDoubleAttr4 * 1000000.0d) : -9223372036854775807L;
                                                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                                            long j36 = j35;
                                                            java.lang.String optionalStringAttr13 = parseOptionalStringAttr(next, REGEX_SNAP, map, matcherCache);
                                                            if (optionalStringAttr13 != null) {
                                                                java.lang.String[] strArrSplit5 = androidx.media3.common.util.Util.split(optionalStringAttr13, ",");
                                                                int length2 = strArrSplit5.length;
                                                                int i20 = 0;
                                                                while (i20 < length2) {
                                                                    int i21 = i20;
                                                                    java.lang.String strTrim2 = strArrSplit5[i20].trim();
                                                                    strTrim2.getClass();
                                                                    int i22 = length2;
                                                                    if (strTrim2.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN) || strTrim2.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT)) {
                                                                        arrayList10.add(strTrim2);
                                                                    }
                                                                    i20 = i21 + 1;
                                                                    length2 = i22;
                                                                }
                                                            }
                                                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                                                            java.lang.String optionalStringAttr14 = parseOptionalStringAttr(next, REGEX_RESTRICT, map, matcherCache);
                                                            if (optionalStringAttr14 != null) {
                                                                java.lang.String[] strArrSplit6 = androidx.media3.common.util.Util.split(optionalStringAttr14, ",");
                                                                int length3 = strArrSplit6.length;
                                                                int i23 = 0;
                                                                while (i23 < length3) {
                                                                    int i24 = i23;
                                                                    java.lang.String strTrim3 = strArrSplit6[i23].trim();
                                                                    strTrim3.getClass();
                                                                    int i25 = length3;
                                                                    if (strTrim3.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_JUMP) || strTrim3.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP)) {
                                                                        arrayList11.add(strTrim3);
                                                                    }
                                                                    i23 = i24 + 1;
                                                                    length3 = i25;
                                                                }
                                                            }
                                                            java.lang.String optionalStringAttr15 = parseOptionalStringAttr(next, REGEX_CONTENT_MAY_VARY, map, matcherCache);
                                                            java.lang.Boolean boolValueOf = optionalStringAttr15 != null ? java.lang.Boolean.valueOf(!optionalStringAttr15.equals(BOOLEAN_FALSE)) : null;
                                                            java.lang.String optionalStringAttr16 = parseOptionalStringAttr(next, REGEX_TIMELINE_OCCUPIES, map, matcherCache);
                                                            java.lang.Boolean bool = boolValueOf;
                                                            if (optionalStringAttr16 != null) {
                                                                str8 = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_RANGE;
                                                                if (!optionalStringAttr16.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_RANGE)) {
                                                                    str8 = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_POINT;
                                                                    if (!optionalStringAttr16.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_POINT)) {
                                                                        str8 = null;
                                                                    }
                                                                }
                                                            } else {
                                                                str8 = null;
                                                            }
                                                            java.lang.String optionalStringAttr17 = parseOptionalStringAttr(next, REGEX_TIMELINE_STYLE, map, matcherCache);
                                                            java.lang.String str22 = str8;
                                                            if (optionalStringAttr17 != null) {
                                                                str9 = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_PRIMARY;
                                                                if (!optionalStringAttr17.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_PRIMARY)) {
                                                                    str9 = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_HIGHLIGHT;
                                                                    if (!optionalStringAttr17.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_HIGHLIGHT)) {
                                                                        str9 = null;
                                                                    }
                                                                }
                                                            } else {
                                                                str9 = null;
                                                            }
                                                            long j37 = jMsToUs3;
                                                            double optionalDoubleAttr5 = parseOptionalDoubleAttr(next, REGEX_SKIP_CONTROL_OFFSET, -1.0d, matcherCache);
                                                            long j38 = optionalDoubleAttr5 >= 0.0d ? (long) (optionalDoubleAttr5 * 1000000.0d) : -9223372036854775807L;
                                                            double optionalDoubleAttr6 = parseOptionalDoubleAttr(next, REGEX_SKIP_CONTROL_DURATION, -1.0d, matcherCache);
                                                            long j39 = optionalDoubleAttr6 >= 0.0d ? (long) (optionalDoubleAttr6 * 1000000.0d) : -9223372036854775807L;
                                                            java.lang.String optionalStringAttr18 = parseOptionalStringAttr(next, REGEX_SKIP_CONTROL_LABEL_ID, map, matcherCache);
                                                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                                                            long j40 = j39;
                                                            java.lang.String strSubstring = next.substring(17);
                                                            java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX, strSubstring);
                                                            while (matcherObtainMatcher.find()) {
                                                                java.lang.String strGroup = matcherObtainMatcher.group();
                                                                strGroup.getClass();
                                                                switch (strGroup.hashCode()) {
                                                                    case -2136701954:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-SNAP=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 0;
                                                                        }
                                                                        break;
                                                                    case -1843050726:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-CONTENT-MAY-VARY=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 1;
                                                                        }
                                                                        break;
                                                                    case -148960310:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-PLAYOUT-LIMIT=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 2;
                                                                        }
                                                                        break;
                                                                    case -36345757:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-TIMELINE-STYLE=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 3;
                                                                        }
                                                                        break;
                                                                    case 397239341:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-ASSET-LIST=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 4;
                                                                        }
                                                                        break;
                                                                    case 850193465:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-TIMELINE-OCCUPIES=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 5;
                                                                        }
                                                                        break;
                                                                    case 1065650400:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 6;
                                                                        }
                                                                        break;
                                                                    case 1274498945:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 7;
                                                                        }
                                                                        break;
                                                                    case 1472528844:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-RESTRICT=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 8;
                                                                        }
                                                                        break;
                                                                    case 1748487807:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-RESUME-OFFSET=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 9;
                                                                        }
                                                                        break;
                                                                    case 1814205923:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-ASSET-URI=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 10;
                                                                        }
                                                                        break;
                                                                    case 2080546752:
                                                                        matcher = matcherObtainMatcher;
                                                                        if (!strGroup.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                            b9 = -1;
                                                                        } else {
                                                                            b9 = 11;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        matcher = matcherObtainMatcher;
                                                                        b9 = -1;
                                                                        break;
                                                                }
                                                                switch (b9) {
                                                                    case 0:
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                    case 5:
                                                                    case 6:
                                                                    case 7:
                                                                    case 8:
                                                                    case 9:
                                                                    case 10:
                                                                    case 11:
                                                                        break;
                                                                    default:
                                                                        arrayList12.add(parseClientDefinedAttribute(strSubstring, strGroup.substring(0, strGroup.length() - 1), map, matcherCache));
                                                                        break;
                                                                }
                                                                matcherObtainMatcher = matcher;
                                                                str9 = str9;
                                                            }
                                                            linkedHashMap2 = linkedHashMap2;
                                                            linkedHashMap2.put(stringAttr7, (linkedHashMap2.containsKey(stringAttr7) ? (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder) linkedHashMap2.get(stringAttr7) : new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder(stringAttr7)).setAssetUri(uri2).setAssetListUri(uri3).setStartDateUnixUs(jMsToUs2).setEndDateUnixUs(j37).setDurationUs(j31).setPlannedDurationUs(j33).setCue(arrayList9).setEndOnNext(optionalBooleanAttribute4).setResumeOffsetUs(j34).setPlayoutLimitUs(j36).setSnapTypes(arrayList10).setRestrictions(arrayList11).setClientDefinedAttributes(arrayList12).setContentMayVary(bool).setTimelineOccupies(str22).setTimelineStyle(str9).setSkipControlOffsetUs(j38).setSkipControlDurationUs(j40).setSkipControlLabelId(optionalStringAttr18));
                                                        } else {
                                                            str11 = str11;
                                                            str4 = str21;
                                                            str5 = str15;
                                                            j27 = j27;
                                                            str6 = str3;
                                                            arrayList2 = arrayList2;
                                                            arrayList3 = arrayList3;
                                                            linkedHashMap2 = linkedHashMap2;
                                                            if (!next.startsWith("#")) {
                                                                java.lang.String segmentEncryptionIV2 = getSegmentEncryptionIV(j27, str5, str6);
                                                                long j41 = j27 + 1;
                                                                java.lang.String strReplaceVariableReferences = replaceVariableReferences(next, map, matcherCache);
                                                                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment5 = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment) map4.get(strReplaceVariableReferences);
                                                                if (j19 == -1) {
                                                                    j10 = 0;
                                                                } else {
                                                                    if (z15 && segment2 == null && segment5 == null) {
                                                                        segment5 = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(strReplaceVariableReferences, 0L, j16, null, null);
                                                                        map4.put(strReplaceVariableReferences, segment5);
                                                                    }
                                                                    j10 = j16;
                                                                }
                                                                if (drmInitData4 != null || treeMap.isEmpty()) {
                                                                    str7 = str4;
                                                                    z6 = false;
                                                                    drmInitData2 = drmInitData4;
                                                                } else {
                                                                    z6 = false;
                                                                    androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr2 = (androidx.media3.common.DrmInitData.SchemeData[]) treeMap.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                                                                    str7 = str4;
                                                                    androidx.media3.common.DrmInitData drmInitData6 = new androidx.media3.common.DrmInitData(str7, schemeDataArr2);
                                                                    if (playlistProtectionSchemes3 == null) {
                                                                        playlistProtectionSchemes3 = getPlaylistProtectionSchemes(str7, schemeDataArr2);
                                                                    }
                                                                    drmInitData2 = drmInitData6;
                                                                }
                                                                int i26 = i10;
                                                                long j42 = j19;
                                                                long j43 = j17;
                                                                long j44 = timeSecondsToUs;
                                                                i10 = i26;
                                                                arrayList8.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment2 != null ? segment2 : segment5, optionalStringAttr, j44, i26, j43, drmInitData2, str5, segmentEncryptionIV2, j10, j42, z13, arrayList2));
                                                                long j45 = j43 + j44;
                                                                arrayList2 = new java.util.ArrayList();
                                                                if (j19 != -1) {
                                                                    j10 += j42;
                                                                }
                                                                j16 = j10;
                                                                arrayList = arrayList8;
                                                                stringAttr = str5;
                                                                str12 = str6;
                                                                z13 = z6;
                                                                timeSecondsToUs = 0;
                                                                optionalStringAttr = str11;
                                                                j15 = j45;
                                                                j17 = j15;
                                                                drmInitData4 = drmInitData2;
                                                                string = str2;
                                                                part2 = part2;
                                                                arrayList3 = arrayList3;
                                                                j19 = -1;
                                                                j20 = -1;
                                                                j14 = j41;
                                                                map2 = map4;
                                                                str13 = str7;
                                                                treeMap2 = treeMap;
                                                            }
                                                            arrayList2 = arrayList2;
                                                            linkedHashMap2 = linkedHashMap2;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        }
                                                        arrayList2 = arrayList2;
                                                        j = j27;
                                                        str15 = str5;
                                                        j19 = j19;
                                                        z13 = z13;
                                                        map2 = map4;
                                                        j17 = j17;
                                                        timeSecondsToUs = timeSecondsToUs;
                                                        optionalStringAttr = optionalStringAttr;
                                                        arrayList = arrayList8;
                                                        str13 = str4;
                                                        str = str6;
                                                        arrayList = arrayList;
                                                        stringAttr = str15;
                                                        j14 = j;
                                                        map2 = map2;
                                                        str12 = str;
                                                        optionalStringAttr = optionalStringAttr;
                                                        timeSecondsToUs = timeSecondsToUs;
                                                        j17 = j17;
                                                        z13 = z13;
                                                        string = str2;
                                                        treeMap2 = treeMap;
                                                        part2 = part2;
                                                        arrayList3 = arrayList3;
                                                        j20 = -1;
                                                        str13 = str13;
                                                        j19 = j19;
                                                        arrayList2 = arrayList2;
                                                        linkedHashMap2 = linkedHashMap2;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    }
                                                } else if (part2 == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, map, matcherCache))) {
                                                    java.lang.String stringAttr8 = parseStringAttr(next, REGEX_URI, map, matcherCache);
                                                    long optionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L, matcherCache);
                                                    long optionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L, matcherCache);
                                                    java.lang.String str23 = string;
                                                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part3 = part2;
                                                    java.lang.String segmentEncryptionIV3 = getSegmentEncryptionIV(j22, str15, str3);
                                                    if (drmInitData4 != null || treeMap.isEmpty()) {
                                                        j11 = optionalLongAttr2;
                                                        str10 = str13;
                                                    } else {
                                                        j11 = optionalLongAttr2;
                                                        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr3 = (androidx.media3.common.DrmInitData.SchemeData[]) treeMap.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                                                        str10 = str13;
                                                        androidx.media3.common.DrmInitData drmInitData7 = new androidx.media3.common.DrmInitData(str10, schemeDataArr3);
                                                        if (playlistProtectionSchemes3 == null) {
                                                            playlistProtectionSchemes2 = getPlaylistProtectionSchemes(str10, schemeDataArr3);
                                                            drmInitData4 = drmInitData7;
                                                        } else {
                                                            drmInitData4 = drmInitData7;
                                                        }
                                                        if (optionalLongAttr == -1 && j11 == -1) {
                                                            drmInitData3 = drmInitData4;
                                                            part = part3;
                                                        } else {
                                                            if (optionalLongAttr != -1) {
                                                                j12 = optionalLongAttr;
                                                            } else {
                                                                j12 = 0;
                                                            }
                                                            long j46 = j15;
                                                            long j47 = j11;
                                                            drmInitData3 = drmInitData4;
                                                            part = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(stringAttr8, segment2, 0L, i10, j46, drmInitData3, str15, segmentEncryptionIV3, j12, j47, false, false, true);
                                                            j15 = j46;
                                                        }
                                                        str11 = str11;
                                                        stringAttr = str15;
                                                        str13 = str10;
                                                        j14 = j22;
                                                        string = str23;
                                                        str12 = str3;
                                                        part2 = part;
                                                        drmInitData4 = drmInitData3;
                                                        treeMap2 = treeMap;
                                                        j20 = -1;
                                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                        playlistProtectionSchemes3 = playlistProtectionSchemes2;
                                                    }
                                                    playlistProtectionSchemes2 = playlistProtectionSchemes3;
                                                    if (optionalLongAttr == -1) {
                                                        if (optionalLongAttr != -1) {
                                                            j12 = optionalLongAttr;
                                                        } else {
                                                            j12 = 0;
                                                        }
                                                        long j48 = j15;
                                                        long j49 = j11;
                                                        drmInitData3 = drmInitData4;
                                                        part = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(stringAttr8, segment2, 0L, i10, j48, drmInitData3, str15, segmentEncryptionIV3, j12, j49, false, false, true);
                                                        j15 = j48;
                                                    } else {
                                                        if (optionalLongAttr != -1) {
                                                            j12 = optionalLongAttr;
                                                        } else {
                                                            j12 = 0;
                                                        }
                                                        long j410 = j15;
                                                        long j411 = j11;
                                                        drmInitData3 = drmInitData4;
                                                        part = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(stringAttr8, segment2, 0L, i10, j410, drmInitData3, str15, segmentEncryptionIV3, j12, j411, false, false, true);
                                                        j15 = j410;
                                                    }
                                                    str11 = str11;
                                                    stringAttr = str15;
                                                    str13 = str10;
                                                    j14 = j22;
                                                    string = str23;
                                                    str12 = str3;
                                                    part2 = part;
                                                    drmInitData4 = drmInitData3;
                                                    treeMap2 = treeMap;
                                                    j20 = -1;
                                                    hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                    playlistProtectionSchemes3 = playlistProtectionSchemes2;
                                                }
                                            }
                                            str = str3;
                                        }
                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                    }
                                    stringAttr = str15;
                                    str12 = str;
                                }
                                j14 = j22;
                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                            }
                            str2 = string;
                            j = j22;
                            arrayList = arrayList;
                            stringAttr = str15;
                            j14 = j;
                            map2 = map2;
                            str12 = str;
                            optionalStringAttr = optionalStringAttr;
                            timeSecondsToUs = timeSecondsToUs;
                            j17 = j17;
                            z13 = z13;
                            string = str2;
                            treeMap2 = treeMap;
                            part2 = part2;
                            arrayList3 = arrayList3;
                            j20 = -1;
                            str13 = str13;
                            j19 = j19;
                            arrayList2 = arrayList2;
                            linkedHashMap2 = linkedHashMap2;
                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                        }
                        arrayList4 = arrayList4;
                    }
                    stringAttr = str15;
                    str12 = str;
                    j14 = j22;
                    arrayList4 = arrayList4;
                }
                arrayList4 = arrayList6;
                j14 = j22;
            }
            z11 = z11;
        }
        java.util.ArrayList arrayList13 = arrayList4;
        java.util.LinkedHashMap linkedHashMap3 = linkedHashMap2;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part4 = part2;
        boolean z16 = z11;
        java.util.ArrayList arrayList14 = arrayList;
        java.util.ArrayList arrayList15 = arrayList2;
        java.util.ArrayList arrayList16 = arrayList3;
        java.util.HashMap map5 = new java.util.HashMap();
        int i27 = 0;
        while (i27 < arrayList16.size()) {
            java.util.ArrayList arrayList17 = arrayList16;
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport renditionReport = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport) arrayList17.get(i27);
            long size = renditionReport.lastMediaSequence;
            if (size == -1) {
                size = (longAttr + ((long) arrayList14.size())) - (arrayList15.isEmpty() ? 1L : 0L);
            }
            int size2 = renditionReport.lastPartIndex;
            if (size2 == -1 && doubleAttr != androidx.media3.common.C.TIME_UNSET) {
                size2 = (arrayList15.isEmpty() ? ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment) p076i4.AbstractC2230y.l(arrayList14)).parts : arrayList15).size() - 1;
            }
            android.net.Uri uri4 = renditionReport.playlistUri;
            map5.put(uri4, new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport(uri4, size, size2));
            i27++;
            arrayList16 = arrayList17;
        }
        if (part4 != null) {
            arrayList15.add(part4);
        }
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        java.util.Iterator it = linkedHashMap3.values().iterator();
        while (it.hasNext()) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitialBuild = ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.Builder) it.next()).build();
            if (interstitialBuild != null) {
                arrayList18.add(interstitialBuild);
            }
        }
        if (jMsToUs == 0 && hlsMediaPlaylist != null && hlsMediaPlaylist.hasProgramDateTime) {
            jMsToUs = hlsMediaPlaylist.startTimeUs;
        }
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(i12, uri.toString(), arrayList13, j13, z16, jMsToUs, z12, i11, longAttr, intAttr2, intAttr, doubleAttr, z10, z14, jMsToUs != 0, playlistProtectionSchemes3, arrayList14, arrayList15, serverControl, map5, arrayList18, segment2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x03af  */
    /* JADX WARN: Code duplicated, block: B:178:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    /* JADX WARN: Code duplicated, block: B:52:0x019b  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0200  */
    /* JADX WARN: Code duplicated, block: B:72:0x020d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0213  */
    /* JADX WARN: Code duplicated, block: B:77:0x026f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:120:0x03dd. Please report as an issue. */
    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist parseMultivariantPlaylist(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator lineIterator, android.net.Uri uri, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) throws java.io.IOException {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String mediaMimeType;
        int i3;
        java.lang.String str;
        java.lang.String mediaMimeType2;
        int i9;
        java.lang.String strP;
        int i10;
        java.lang.String str2;
        java.lang.String codecsOfType;
        androidx.media3.common.ColorInfo colorInfoForDolbyVision;
        java.lang.String optionalStringAttr;
        int i11;
        int i12;
        java.lang.String optionalStringAttr2;
        float f9;
        android.net.Uri uriResolveToUri;
        android.net.Uri uri2;
        java.util.HashMap map;
        java.util.ArrayList arrayList3;
        java.lang.String codecsWithoutType;
        java.lang.String string = uri.toString();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        boolean zContains = false;
        boolean z6 = false;
        while (true) {
            boolean zHasNext = lineIterator.hasNext();
            java.lang.String str3 = androidx.media3.common.MimeTypes.APPLICATION_M3U8;
            if (!zHasNext) {
                java.util.HashMap map4 = map2;
                java.util.ArrayList arrayList12 = arrayList9;
                java.util.ArrayList arrayList13 = arrayList10;
                java.util.ArrayList arrayList14 = arrayList5;
                java.util.ArrayList arrayList15 = arrayList6;
                java.util.ArrayList arrayList16 = arrayList7;
                java.util.ArrayList arrayList17 = arrayList8;
                java.util.ArrayList arrayList18 = arrayList11;
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                java.util.HashSet hashSet = new java.util.HashSet();
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = (androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant) arrayList4.get(i13);
                    if (hashSet.add(variant.url)) {
                        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(variant.format.metadata == null);
                        java.util.ArrayList arrayList20 = (java.util.ArrayList) map4.get(variant.url);
                        arrayList20.getClass();
                        i9 = 1;
                        arrayList19.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new androidx.media3.common.Metadata(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry(null, null, arrayList20))).build()));
                    } else {
                        i9 = 1;
                    }
                    i13 += i9;
                }
                java.util.ArrayList arrayList21 = null;
                androidx.media3.common.Format format = null;
                int i14 = 0;
                while (i14 < arrayList12.size()) {
                    java.util.ArrayList arrayList22 = arrayList12;
                    java.lang.String str4 = (java.lang.String) arrayList22.get(i14);
                    java.lang.String stringAttr = parseStringAttr(str4, REGEX_GROUP_ID, map3, matcherCache);
                    java.lang.String stringAttr2 = parseStringAttr(str4, REGEX_NAME, map3, matcherCache);
                    java.lang.String optionalStringAttr3 = parseOptionalStringAttr(str4, REGEX_STABLE_RENDITION_ID, map3, matcherCache);
                    androidx.media3.common.Format.Builder builder = new androidx.media3.common.Format.Builder();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(stringAttr);
                    java.util.ArrayList arrayList23 = arrayList21;
                    sb.append(":");
                    sb.append(stringAttr2);
                    androidx.media3.common.Format.Builder language = builder.setId(sb.toString()).setLabel(stringAttr2).setContainerMimeType(str3).setSelectionFlags(parseSelectionFlags(str4, matcherCache)).setRoleFlags(parseRoleFlags(str4, map3, matcherCache)).setLanguage(parseOptionalStringAttr(str4, REGEX_LANGUAGE, map3, matcherCache));
                    java.lang.String optionalStringAttr4 = parseOptionalStringAttr(str4, REGEX_URI, map3, matcherCache);
                    android.net.Uri uriResolveToUri2 = optionalStringAttr4 == null ? null : androidx.media3.common.util.UriUtil.resolveToUri(string, optionalStringAttr4);
                    java.lang.String str5 = str3;
                    int i15 = i14;
                    androidx.media3.common.Metadata metadata = new androidx.media3.common.Metadata(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry(stringAttr, stringAttr2, java.util.Collections.EMPTY_LIST));
                    java.lang.String stringAttr3 = parseStringAttr(str4, REGEX_TYPE, map3, matcherCache);
                    stringAttr3.getClass();
                    switch (stringAttr3) {
                        case "SUBTITLES":
                            arrayList = arrayList15;
                            arrayList2 = arrayList14;
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList4, stringAttr);
                            if (variantWithSubtitleGroup != null) {
                                java.lang.String codecsOfType2 = androidx.media3.common.util.Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType2);
                                mediaMimeType = androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                mediaMimeType = null;
                            }
                            if (mediaMimeType == null) {
                                mediaMimeType = androidx.media3.common.MimeTypes.TEXT_VTT;
                            }
                            language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                            if (uriResolveToUri2 != null) {
                                arrayList16 = arrayList16;
                                arrayList16.add(new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2, optionalStringAttr3));
                            } else {
                                arrayList16 = arrayList16;
                                androidx.media3.common.util.Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList21 = arrayList23;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList15;
                            arrayList2 = arrayList14;
                            java.lang.String stringAttr4 = parseStringAttr(str4, REGEX_INSTREAM_ID, map3, matcherCache);
                            if (stringAttr4.startsWith("CC")) {
                                i3 = java.lang.Integer.parseInt(stringAttr4.substring(2));
                                str = androidx.media3.common.MimeTypes.APPLICATION_CEA608;
                            } else {
                                i3 = java.lang.Integer.parseInt(stringAttr4.substring(7));
                                str = androidx.media3.common.MimeTypes.APPLICATION_CEA708;
                            }
                            java.util.ArrayList arrayList24 = arrayList23 == null ? new java.util.ArrayList() : arrayList23;
                            language.setSampleMimeType(str).setAccessibilityChannel(i3);
                            arrayList24.add(language.build());
                            arrayList21 = arrayList24;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList14;
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList4, stringAttr);
                            if (variantWithAudioGroup != null) {
                                java.lang.String codecsOfType3 = androidx.media3.common.util.Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType3);
                                mediaMimeType2 = androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType3);
                            } else {
                                mediaMimeType2 = null;
                            }
                            java.lang.String optionalStringAttr5 = parseOptionalStringAttr(str4, REGEX_CHANNELS, map3, matcherCache);
                            if (optionalStringAttr5 != null) {
                                language.setChannelCount(java.lang.Integer.parseInt(androidx.media3.common.util.Util.splitAtFirst(optionalStringAttr5, "/")[0]));
                                if (androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr5.endsWith("/JOC")) {
                                    language.setCodecs(androidx.media3.common.MimeTypes.CODEC_E_AC3_JOC);
                                    mediaMimeType2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(mediaMimeType2);
                            if (uriResolveToUri2 == null) {
                                arrayList = arrayList15;
                                if (variantWithAudioGroup != null) {
                                    androidx.media3.common.Format formatBuild = language.build();
                                    arrayList21 = arrayList23;
                                    format = formatBuild;
                                }
                                break;
                            } else {
                                language.setMetadata(metadata);
                                androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition rendition = new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2, optionalStringAttr3);
                                arrayList = arrayList15;
                                arrayList.add(rendition);
                            }
                            arrayList21 = arrayList23;
                            break;
                        case "VIDEO":
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList4, stringAttr);
                            if (variantWithVideoGroup != null) {
                                androidx.media3.common.Format format2 = variantWithVideoGroup.format;
                                java.lang.String codecsOfType4 = androidx.media3.common.util.Util.getCodecsOfType(format2.codecs, 2);
                                language.setCodecs(codecsOfType4).setSampleMimeType(androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType4)).setWidth(format2.width).setHeight(format2.height).setFrameRate(format2.frameRate);
                            }
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition rendition2 = new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2, optionalStringAttr3);
                                arrayList2 = arrayList14;
                                arrayList2.add(rendition2);
                                arrayList = arrayList15;
                            }
                            arrayList21 = arrayList23;
                        default:
                            arrayList = arrayList15;
                            arrayList2 = arrayList14;
                            arrayList21 = arrayList23;
                            break;
                    }
                    i14 = i15 + 1;
                    arrayList12 = arrayList22;
                    arrayList14 = arrayList2;
                    arrayList15 = arrayList;
                    arrayList16 = arrayList16;
                    str3 = str5;
                }
                return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist(uri.toString(), arrayList18, arrayList19, arrayList14, arrayList15, arrayList16, arrayList17, format, zContains ? java.util.Collections.EMPTY_LIST : arrayList21, z6, map3, arrayList13);
            }
            java.lang.String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList11.add(next);
            }
            boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            if (next.startsWith(TAG_DEFINE)) {
                java.lang.String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_NAME, map3, matcherCache);
                if (optionalStringAttr6 != null) {
                    verifyVariableNameNotContainedOrThrow(optionalStringAttr6, map3);
                    map3.put(optionalStringAttr6, parseStringAttr(next, REGEX_VALUE, map3, matcherCache));
                } else {
                    java.lang.String stringAttr5 = parseStringAttr(next, REGEX_QUERY_PARAM, map3, matcherCache);
                    verifyVariableNameNotContainedOrThrow(stringAttr5, map3);
                    java.lang.String queryParameter = uri.getQueryParameter(stringAttr5);
                    if (queryParameter == null) {
                        throw androidx.media3.common.ParserException.createForMalformedManifest("QUERYPARAM \"" + stringAttr5 + "\" not found in playlist URI", null);
                    }
                    map3.put(stringAttr5, queryParameter);
                }
            } else {
                if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                    map = map2;
                    arrayList9 = arrayList9;
                    z6 = true;
                } else if (next.startsWith(TAG_MEDIA)) {
                    arrayList9.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    androidx.media3.common.DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map3, matcherCache), map3, matcherCache);
                    if (drmSchemeData != null) {
                        arrayList10.add(new androidx.media3.common.DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map3, matcherCache)), drmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                    zContains |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i16 = zStartsWith ? 16384 : 0;
                    int intAttr = parseIntAttr(next, REGEX_BANDWIDTH, matcherCache);
                    int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1, matcherCache);
                    java.lang.String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_VIDEO_RANGE, map3, matcherCache);
                    java.lang.String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_CODECS, map3, matcherCache);
                    java.lang.String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_SUPPLEMENTAL_CODECS, map3, matcherCache);
                    if (optionalStringAttr9 != null) {
                        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(androidx.media3.common.util.Util.splitAtFirst(optionalStringAttr9, ",")[0], "/");
                        java.lang.String str6 = strArrSplit[0];
                        if (strArrSplit.length > 1) {
                            str2 = strArrSplit[1];
                            map2 = map2;
                            arrayList9 = arrayList9;
                            strP = str6;
                            i10 = 2;
                        } else {
                            strP = str6;
                        }
                        codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(optionalStringAttr8, i10);
                        if (isDolbyVisionFormat(optionalStringAttr7, codecsOfType, strP, str2)) {
                            colorInfoForDolbyVision = androidx.media3.common.util.Util.getColorInfoForDolbyVision(optionalStringAttr8, strP, str2);
                            if (strP == null) {
                                strP = codecsOfType;
                            }
                            codecsWithoutType = androidx.media3.common.util.Util.getCodecsWithoutType(optionalStringAttr8, i10);
                            if (codecsWithoutType != null) {
                                strP = p121o0.p.p(strP, ",", codecsWithoutType);
                            }
                            optionalStringAttr8 = strP;
                        } else {
                            colorInfoForDolbyVision = null;
                        }
                        optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3, matcherCache);
                        if (optionalStringAttr != null) {
                            java.lang.String[] strArrSplit2 = androidx.media3.common.util.Util.split(optionalStringAttr, "x");
                            i12 = java.lang.Integer.parseInt(strArrSplit2[0]);
                            i11 = java.lang.Integer.parseInt(strArrSplit2[1]);
                            if (i12 > 0 || i11 <= 0) {
                                i11 = -1;
                                i12 = -1;
                            }
                        } else {
                            i11 = -1;
                            i12 = -1;
                        }
                        optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map3, matcherCache);
                        if (optionalStringAttr2 != null) {
                            f9 = java.lang.Float.parseFloat(optionalStringAttr2);
                        } else {
                            f9 = -1.0f;
                        }
                        java.lang.String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_PATHWAY_ID, map3, matcherCache);
                        java.lang.String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_VIDEO, map3, matcherCache);
                        java.lang.String optionalStringAttr12 = parseOptionalStringAttr(next, REGEX_AUDIO, map3, matcherCache);
                        java.lang.String optionalStringAttr13 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3, matcherCache);
                        java.lang.String optionalStringAttr14 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3, matcherCache);
                        java.lang.String optionalStringAttr15 = parseOptionalStringAttr(next, REGEX_STABLE_VARIANT_ID, map3, matcherCache);
                        if (zStartsWith) {
                            uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(string, parseStringAttr(next, REGEX_URI, map3, matcherCache));
                        } else {
                            if (lineIterator.hasNext()) {
                                throw androidx.media3.common.ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(string, replaceVariableReferences(lineIterator.next(), map3, matcherCache));
                        }
                        uri2 = uriResolveToUri;
                        arrayList4.add(new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(uri2, new androidx.media3.common.Format.Builder().setId(arrayList4.size()).setContainerMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr8).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i12).setHeight(i11).setFrameRate(f9).setRoleFlags(i16).setColorInfo(colorInfoForDolbyVision).build(), optionalStringAttr11, optionalStringAttr12, optionalStringAttr13, optionalStringAttr14, optionalStringAttr10, optionalStringAttr15));
                        map = map2;
                        arrayList3 = (java.util.ArrayList) map.get(uri2);
                        if (arrayList3 == null) {
                            arrayList3 = new java.util.ArrayList();
                            map.put(uri2, arrayList3);
                        }
                        arrayList3.add(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr11, optionalStringAttr12, optionalStringAttr13, optionalStringAttr14));
                    } else {
                        strP = null;
                    }
                    i10 = 2;
                    str2 = null;
                    codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(optionalStringAttr8, i10);
                    if (isDolbyVisionFormat(optionalStringAttr7, codecsOfType, strP, str2)) {
                        colorInfoForDolbyVision = androidx.media3.common.util.Util.getColorInfoForDolbyVision(optionalStringAttr8, strP, str2);
                        if (strP == null) {
                            strP = codecsOfType;
                        }
                        codecsWithoutType = androidx.media3.common.util.Util.getCodecsWithoutType(optionalStringAttr8, i10);
                        if (codecsWithoutType != null) {
                            strP = p121o0.p.p(strP, ",", codecsWithoutType);
                        }
                        optionalStringAttr8 = strP;
                    } else {
                        colorInfoForDolbyVision = null;
                    }
                    optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3, matcherCache);
                    if (optionalStringAttr != null) {
                        java.lang.String[] strArrSplit3 = androidx.media3.common.util.Util.split(optionalStringAttr, "x");
                        i12 = java.lang.Integer.parseInt(strArrSplit3[0]);
                        i11 = java.lang.Integer.parseInt(strArrSplit3[1]);
                        if (i12 > 0) {
                            i11 = -1;
                            i12 = -1;
                        } else {
                            i11 = -1;
                            i12 = -1;
                        }
                    } else {
                        i11 = -1;
                        i12 = -1;
                    }
                    optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map3, matcherCache);
                    if (optionalStringAttr2 != null) {
                        f9 = java.lang.Float.parseFloat(optionalStringAttr2);
                    } else {
                        f9 = -1.0f;
                    }
                    java.lang.String optionalStringAttr16 = parseOptionalStringAttr(next, REGEX_PATHWAY_ID, map3, matcherCache);
                    java.lang.String optionalStringAttr17 = parseOptionalStringAttr(next, REGEX_VIDEO, map3, matcherCache);
                    java.lang.String optionalStringAttr18 = parseOptionalStringAttr(next, REGEX_AUDIO, map3, matcherCache);
                    java.lang.String optionalStringAttr19 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3, matcherCache);
                    java.lang.String optionalStringAttr110 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3, matcherCache);
                    java.lang.String optionalStringAttr111 = parseOptionalStringAttr(next, REGEX_STABLE_VARIANT_ID, map3, matcherCache);
                    if (zStartsWith) {
                        uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(string, parseStringAttr(next, REGEX_URI, map3, matcherCache));
                    } else {
                        if (lineIterator.hasNext()) {
                            throw androidx.media3.common.ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(string, replaceVariableReferences(lineIterator.next(), map3, matcherCache));
                    }
                    uri2 = uriResolveToUri;
                    arrayList4.add(new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(uri2, new androidx.media3.common.Format.Builder().setId(arrayList4.size()).setContainerMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr8).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i12).setHeight(i11).setFrameRate(f9).setRoleFlags(i16).setColorInfo(colorInfoForDolbyVision).build(), optionalStringAttr17, optionalStringAttr18, optionalStringAttr19, optionalStringAttr110, optionalStringAttr16, optionalStringAttr111));
                    map = map2;
                    arrayList3 = (java.util.ArrayList) map.get(uri2);
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        map.put(uri2, arrayList3);
                    }
                    arrayList3.add(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr17, optionalStringAttr18, optionalStringAttr19, optionalStringAttr110));
                }
                map2 = map;
                arrayList10 = arrayList10;
                arrayList8 = arrayList8;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            map = map2;
            arrayList9 = arrayList9;
            map2 = map;
            arrayList10 = arrayList10;
            arrayList8 = arrayList8;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
        }
    }

    private static boolean parseOptionalBooleanAttribute(java.lang.String str, java.util.regex.Pattern pattern, boolean z6, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        return matcherObtainMatcher.find() ? BOOLEAN_TRUE.equals(matcherObtainMatcher.group(1)) : z6;
    }

    private static double parseOptionalDoubleAttr(java.lang.String str, java.util.regex.Pattern pattern, double d4, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!matcherObtainMatcher.find()) {
            return d4;
        }
        java.lang.String strGroup = matcherObtainMatcher.group(1);
        strGroup.getClass();
        return java.lang.Double.parseDouble(strGroup);
    }

    private static int parseOptionalIntAttr(java.lang.String str, java.util.regex.Pattern pattern, int i3, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!matcherObtainMatcher.find()) {
            return i3;
        }
        java.lang.String strGroup = matcherObtainMatcher.group(1);
        strGroup.getClass();
        return java.lang.Integer.parseInt(strGroup);
    }

    private static long parseOptionalLongAttr(java.lang.String str, java.util.regex.Pattern pattern, long j, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!matcherObtainMatcher.find()) {
            return j;
        }
        java.lang.String strGroup = matcherObtainMatcher.group(1);
        strGroup.getClass();
        return java.lang.Long.parseLong(strGroup);
    }

    private static java.lang.String parseOptionalStringAttr(java.lang.String str, java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        return parseOptionalStringAttr(str, pattern, null, map, matcherCache);
    }

    private static int parseRoleFlags(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.lang.String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map, matcherCache);
        if (android.text.TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(optionalStringAttr, ",");
        int i3 = androidx.media3.common.util.Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (androidx.media3.common.util.Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i3 |= 4096;
        }
        if (androidx.media3.common.util.Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i3 |= 1024;
        }
        return androidx.media3.common.util.Util.contains(strArrSplit, "public.easy-to-read") ? i3 | 8192 : i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false, matcherCache);
        ?? r9 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false, matcherCache)) {
            r9 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false, matcherCache) ? r9 | 4 : r9;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl parseServerControl(java.lang.String str, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        double d4;
        long j;
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d, matcherCache);
        long j9 = androidx.media3.common.C.TIME_UNSET;
        long j10 = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false, matcherCache);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d, matcherCache);
        if (optionalDoubleAttr2 == -9.223372036854776E18d) {
            d4 = 1000000.0d;
            j = -9223372036854775807L;
        } else {
            d4 = 1000000.0d;
            j = (long) (optionalDoubleAttr2 * 1000000.0d);
        }
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d, matcherCache);
        if (optionalDoubleAttr3 != -9.223372036854776E18d) {
            j9 = (long) (optionalDoubleAttr3 * d4);
        }
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl(j10, optionalBooleanAttribute, j, j9, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false, matcherCache));
    }

    private static java.lang.String parseStringAttr(java.lang.String str, java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) throws androidx.media3.common.ParserException {
        java.lang.String optionalStringAttr = parseOptionalStringAttr(str, pattern, map, matcherCache);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw androidx.media3.common.ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long parseTimeSecondsToUs(java.lang.String str, java.util.regex.Pattern pattern, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        return new java.math.BigDecimal(parseStringAttr(str, pattern, java.util.Collections.EMPTY_MAP, matcherCache)).multiply(new java.math.BigDecimal(1000000L)).longValue();
    }

    private static java.lang.String replaceVariableReferences(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(REGEX_VARIABLE_REFERENCE, str);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (matcherObtainMatcher.find()) {
            java.lang.String strGroup = matcherObtainMatcher.group(1);
            if (map.containsKey(strGroup)) {
                matcherObtainMatcher.appendReplacement(stringBuffer, java.util.regex.Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcherObtainMatcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(java.io.BufferedReader bufferedReader, boolean z6, int i3) throws java.io.IOException {
        while (i3 != -1 && java.lang.Character.isWhitespace(i3) && (z6 || !androidx.media3.common.util.Util.isLinebreak(i3))) {
            i3 = bufferedReader.read();
        }
        return i3;
    }

    private static void verifyVariableNameNotContainedOrThrow(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        if (map.containsKey(str)) {
            throw androidx.media3.common.ParserException.createForMalformedManifest("duplicate variable name \"" + str + "\"", null);
        }
    }

    public HlsPlaylistParser(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static java.lang.String parseOptionalStringAttr(java.lang.String str, java.util.regex.Pattern pattern, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache) {
        java.util.regex.Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (matcherObtainMatcher.find()) {
            str2 = matcherObtainMatcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map, matcherCache);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylist parse(android.net.Uri uri, java.io.InputStream inputStream) throws androidx.media3.common.ParserException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache matcherCache = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw androidx.media3.common.ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    androidx.media3.common.util.Util.closeQuietly(bufferedReader);
                    throw androidx.media3.common.ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                java.lang.String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(TAG_STREAM_INF)) {
                        arrayDeque.add(strTrim);
                        androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist = parseMultivariantPlaylist(new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator(arrayDeque, bufferedReader), uri, matcherCache);
                        androidx.media3.common.util.Util.closeQuietly(bufferedReader);
                        return multivariantPlaylist;
                    }
                    if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator(arrayDeque, bufferedReader), uri, matcherCache);
                    androidx.media3.common.util.Util.closeQuietly(bufferedReader);
                    return mediaPlaylist;
                }
            }
        } catch (java.lang.Throwable th) {
            androidx.media3.common.util.Util.closeQuietly(bufferedReader);
            throw th;
        }
    }
}
