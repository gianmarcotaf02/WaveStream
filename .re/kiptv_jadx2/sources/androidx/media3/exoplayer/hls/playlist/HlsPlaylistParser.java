package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import io.ktor.http.LinkHeader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p076i4.AbstractC2230y;
import p121o0.p;

public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String ATTR_QUOTED_STRING_VALUE_PATTERN = "\"((?:.|\f)+?)\"";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String DATERANGE_CLASS_INTERSTITIALS = "com.apple.hls.interstitial";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DATERANGE = "#EXT-X-DATERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_VIDEO_RANGE = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SUPPLEMENTAL_CODECS = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PATHWAY_ID = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_STABLE_VARIANT_ID = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_STABLE_RENDITION_ID = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_ATTR_DURATION_PREFIXED = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_QUERY_PARAM = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_ID = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CLASS = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_START_DATE = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CUE = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_END_DATE = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_PLANNED_DURATION = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_END_ON_NEXT = compileBooleanAttrPattern("END-ON-NEXT");
    private static final Pattern REGEX_ASSET_URI = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_ASSET_LIST_URI = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESUME_OFFSET = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_PLAYOUT_LIMIT = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SNAP = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESTRICT = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CONTENT_MAY_VARY = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TIMELINE_OCCUPIES = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TIMELINE_STYLE = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SKIP_CONTROL_OFFSET = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SKIP_CONTROL_DURATION = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SKIP_CONTROL_LABEL_ID = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {LinkHeader.Rel.Next}, result = true)
        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                String strPoll = this.extraLines.poll();
                strPoll.getClass();
                this.next = strPoll;
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    public static final class MatcherCache extends LinkedHashMap<Pattern, Matcher> {
        public Matcher obtainMatcher(Pattern pattern, CharSequence charSequence) {
            Matcher matcher = get(pattern);
            if (matcher != null) {
                matcher.reset(charSequence);
                return matcher;
            }
            Matcher matcher2 = pattern.matcher(charSequence);
            put(pattern, matcher2);
            return matcher2;
        }

        @Override
        public boolean removeEldestEntry(Map.Entry<Pattern, Matcher> entry) {
            return size() > 32;
        }

        private MatcherCache() {
            super(16, 0.75f, true);
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
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
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData getPlaylistProtectionSchemes(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i3 = 0; i3 < schemeDataArr.length; i3++) {
            schemeDataArr2[i3] = schemeDataArr[i3].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String getSegmentEncryptionIV(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i3);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i3);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i3);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static boolean isDolbyVisionFormat(String str, String str2, String str3, String str4) {
        if (!MimeTypes.isDolbyVisionCodec(str2, str3)) {
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

    private static HlsMediaPlaylist.ClientDefinedAttribute parseClientDefinedAttribute(String str, String str2, Map<String, String> map, MatcherCache matcherCache) {
        String strO = p.o(str2, "=");
        int length = strO.length() + str.indexOf(strO);
        String strSubstring = str.substring(length, (str.length() == length + 1 ? 1 : 2) + length);
        if (strSubstring.startsWith("\"")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map, matcherCache), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map, matcherCache), 1);
        }
        return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseDoubleAttr(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b"), matcherCache));
    }

    private static double parseDoubleAttr(String str, Pattern pattern, MatcherCache matcherCache) {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache));
    }

    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map, MatcherCache matcherCache) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map, matcherCache);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map, matcherCache);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map, matcherCache);
        byte[] bArrDecode = Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern, MatcherCache matcherCache) {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache));
    }

    private static long parseLongAttr(String str, Pattern pattern, MatcherCache matcherCache) {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache));
    }

    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, Uri uri, MatcherCache matcherCache) throws DeltaUpdateException, ParserException {
        String str;
        TreeMap treeMap;
        String str2;
        long j;
        String str3;
        long j9;
        int i3;
        DrmInitData playlistProtectionSchemes;
        DrmInitData drmInitData;
        String str4;
        String str5;
        String str6;
        long j10;
        String str7;
        boolean z6;
        DrmInitData drmInitData2;
        String str8;
        String str9;
        Matcher matcher;
        byte b9;
        int i9;
        byte b10;
        long j11;
        String str10;
        DrmInitData playlistProtectionSchemes2;
        HlsMediaPlaylist.Part part;
        long j12;
        DrmInitData drmInitData3;
        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        String string = uri.toString();
        boolean z9 = hlsMultivariantPlaylist.hasIndependentSegments;
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist2 != null ? hlsMediaPlaylist2.lastSeenInitSegment : null;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HlsMediaPlaylist.ServerControl serverControl = new HlsMediaPlaylist.ServerControl(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap2 = new TreeMap();
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        boolean z10 = z9;
        HlsMediaPlaylist.Segment segment2 = segment;
        String str11 = "";
        String optionalStringAttr = str11;
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
        HlsMediaPlaylist.Part part2 = null;
        boolean z11 = false;
        boolean z12 = false;
        int intAttr2 = 1;
        DrmInitData playlistProtectionSchemes3 = null;
        DrmInitData drmInitData4 = null;
        int i10 = 0;
        String stringAttr = null;
        String str12 = null;
        long j19 = -1;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j20 = -1;
        String str13 = null;
        boolean z15 = false;
        long longAttr = 0;
        int i12 = 0;
        while (lineIterator.hasNext()) {
            linkedHashMap2 = linkedHashMap2;
            String next = lineIterator.next();
            z11 = z11;
            if (next.startsWith(TAG_PREFIX)) {
                arrayList4.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String stringAttr2 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map, matcherCache);
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
                ArrayList arrayList5 = arrayList4;
                long j21 = j14;
                long doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET, matcherCache) * 1000000.0d);
                boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false, matcherCache);
                arrayList4 = arrayList5;
                j13 = doubleAttr2;
                linkedHashMap2 = linkedHashMap2;
                z11 = optionalBooleanAttribute;
                j14 = j21;
            } else {
                ArrayList arrayList6 = arrayList4;
                long j22 = j14;
                if (next.startsWith(TAG_SERVER_CONTROL)) {
                    serverControl = parseServerControl(next, matcherCache);
                } else if (next.startsWith(TAG_PART_INF)) {
                    doubleAttr = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION, matcherCache) * 1000000.0d);
                } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                    String stringAttr3 = parseStringAttr(next, REGEX_URI, map, matcherCache);
                    String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map, matcherCache);
                    if (optionalStringAttr2 != null) {
                        String[] strArrSplit = Util.split(optionalStringAttr2, "@");
                        j19 = Long.parseLong(strArrSplit[0]);
                        if (strArrSplit.length > 1) {
                            j16 = Long.parseLong(strArrSplit[1]);
                        }
                    }
                    long j23 = j19;
                    if (j23 == j20) {
                        j16 = 0;
                    }
                    if (stringAttr != null && str12 == null) {
                        throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                    }
                    String str14 = stringAttr;
                    long j24 = j16;
                    HlsMediaPlaylist.Segment segment3 = new HlsMediaPlaylist.Segment(stringAttr3, j24, j23, str14, str12);
                    j16 = j23 != j20 ? j24 + j23 : j24;
                    stringAttr = str14;
                    arrayList4 = arrayList6;
                    segment2 = segment3;
                    j14 = j22;
                    j19 = j20;
                } else {
                    arrayList4 = arrayList6;
                    String str15 = stringAttr;
                    String str16 = str12;
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
                                String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_NAME, map, matcherCache);
                                String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_QUERY_PARAM, map, matcherCache);
                                if (optionalStringAttr3 != null) {
                                    verifyVariableNameNotContainedOrThrow(optionalStringAttr3, map);
                                    map.put(optionalStringAttr3, parseStringAttr(next, REGEX_VALUE, map, matcherCache));
                                } else if (optionalStringAttr4 != null) {
                                    verifyVariableNameNotContainedOrThrow(optionalStringAttr4, map);
                                    String queryParameter = uri.getQueryParameter(optionalStringAttr4);
                                    if (queryParameter == null) {
                                        throw ParserException.createForMalformedManifest("QUERYPARAM \"" + optionalStringAttr4 + "\" not found in playlist URI", null);
                                    }
                                    map.put(optionalStringAttr4, queryParameter);
                                } else {
                                    String stringAttr4 = parseStringAttr(next, REGEX_IMPORT, map, matcherCache);
                                    verifyVariableNameNotContainedOrThrow(stringAttr4, map);
                                    String str17 = hlsMultivariantPlaylist.variableDefinitions.get(stringAttr4);
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
                                    AbstractC1864o0.Y(hlsMediaPlaylist2 != null && arrayList.isEmpty());
                                    int i13 = (int) (longAttr - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist2)).mediaSequence);
                                    int i14 = i13 + intAttr3;
                                    if (i13 < 0 || i14 > hlsMediaPlaylist2.segments.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    str12 = str;
                                    String str18 = str15;
                                    long j25 = j17;
                                    while (i13 < i14) {
                                        HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist2.segments.get(i13);
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
                                        HlsMediaPlaylist.Segment segment4 = segmentCopyWith.initializationSegment;
                                        drmInitData4 = segmentCopyWith.drmInitData;
                                        String str19 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                        String str20 = segmentCopyWith.encryptionIV;
                                        if (str20 == null || !str20.equals(Long.toHexString(j22))) {
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
                                    String stringAttr5 = parseStringAttr(next, REGEX_METHOD, map, matcherCache);
                                    String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map, matcherCache);
                                    if (METHOD_NONE.equals(stringAttr5)) {
                                        treeMap2.clear();
                                        drmInitData4 = null;
                                        stringAttr = null;
                                        str12 = null;
                                    } else {
                                        String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_IV, map, matcherCache);
                                        if (!KEYFORMAT_IDENTITY.equals(optionalStringAttr5)) {
                                            String encryptionScheme = str13 == null ? parseEncryptionScheme(stringAttr5) : str13;
                                            DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, optionalStringAttr5, map, matcherCache);
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
                                        String[] strArrSplit2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, map, matcherCache), "@");
                                        j19 = Long.parseLong(strArrSplit2[0]);
                                        if (strArrSplit2.length > 1) {
                                            j16 = Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else {
                                        if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                            i11 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                            stringAttr = str15;
                                            str12 = str;
                                            z12 = true;
                                        } else if (next.equals(TAG_DISCONTINUITY)) {
                                            i10++;
                                        } else if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                            if (jMsToUs == 0) {
                                                jMsToUs = Util.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j17;
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
                                                arrayList3.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.resolve(string, parseStringAttr(next, REGEX_URI, map, matcherCache))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j20, matcherCache), parseOptionalIntAttr(next, REGEX_LAST_PART, -1, matcherCache)));
                                            } else {
                                                treeMap = treeMap2;
                                                str3 = str;
                                                if (!next.startsWith(TAG_PRELOAD_HINT)) {
                                                    part2 = part2;
                                                    String str21 = str13;
                                                    str2 = string;
                                                    long j27 = j22;
                                                    if (next.startsWith(TAG_PART)) {
                                                        String segmentEncryptionIV = getSegmentEncryptionIV(j27, str15, str3);
                                                        String stringAttr6 = parseStringAttr(next, REGEX_URI, map, matcherCache);
                                                        HashMap map3 = map2;
                                                        ArrayList arrayList7 = arrayList;
                                                        long doubleAttr3 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION, matcherCache) * 1000000.0d);
                                                        boolean optionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false, matcherCache) | (z10 && arrayList2.isEmpty());
                                                        boolean optionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_GAP, false, matcherCache);
                                                        String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map, matcherCache);
                                                        if (optionalStringAttr7 != null) {
                                                            String[] strArrSplit3 = Util.split(optionalStringAttr7, "@");
                                                            j9 = Long.parseLong(strArrSplit3[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                j18 = Long.parseLong(strArrSplit3[1]);
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
                                                            DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            DrmInitData drmInitData5 = new DrmInitData(str21, schemeDataArr);
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
                                                        arrayList2.add(new HlsMediaPlaylist.Part(stringAttr6, segment2, doubleAttr3, i10, j28, drmInitData, str15, segmentEncryptionIV, j30, j29, optionalBooleanAttribute3, optionalBooleanAttribute2, false));
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
                                                        HashMap map4 = map2;
                                                        ArrayList arrayList8 = arrayList;
                                                        if (next.startsWith(TAG_DATERANGE) && parseOptionalStringAttr(next, REGEX_CLASS, str11, map, matcherCache).equals(DATERANGE_CLASS_INTERSTITIALS)) {
                                                            String stringAttr7 = parseStringAttr(next, REGEX_ID, map, matcherCache);
                                                            String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_ASSET_URI, map, matcherCache);
                                                            Uri uri2 = optionalStringAttr8 != null ? Uri.parse(optionalStringAttr8) : null;
                                                            String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_ASSET_LIST_URI, map, matcherCache);
                                                            Uri uri3 = optionalStringAttr9 != null ? Uri.parse(optionalStringAttr9) : null;
                                                            String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_START_DATE, map, matcherCache);
                                                            long jMsToUs2 = optionalStringAttr10 != null ? Util.msToUs(Util.parseXsDateTime(optionalStringAttr10)) : -9223372036854775807L;
                                                            str11 = str11;
                                                            String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_END_DATE, map, matcherCache);
                                                            long jMsToUs3 = optionalStringAttr11 != null ? Util.msToUs(Util.parseXsDateTime(optionalStringAttr11)) : -9223372036854775807L;
                                                            arrayList3 = arrayList3;
                                                            ArrayList arrayList9 = new ArrayList();
                                                            str4 = str21;
                                                            String optionalStringAttr12 = parseOptionalStringAttr(next, REGEX_CUE, map, matcherCache);
                                                            str5 = str15;
                                                            if (optionalStringAttr12 != null) {
                                                                String[] strArrSplit4 = Util.split(optionalStringAttr12, ",");
                                                                int length = strArrSplit4.length;
                                                                int i19 = 0;
                                                                while (i19 < length) {
                                                                    String[] strArr = strArrSplit4;
                                                                    String strTrim = strArrSplit4[i19].trim();
                                                                    strTrim.getClass();
                                                                    switch (strTrim.hashCode()) {
                                                                        case 79491:
                                                                            i9 = length;
                                                                            if (!strTrim.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                                                                                b10 = -1;
                                                                            } else {
                                                                                b10 = 0;
                                                                            }
                                                                            break;
                                                                        case 2430593:
                                                                            i9 = length;
                                                                            if (!strTrim.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_ONCE)) {
                                                                                b10 = -1;
                                                                            } else {
                                                                                b10 = 1;
                                                                            }
                                                                            break;
                                                                        case 2461856:
                                                                            i9 = length;
                                                                            if (!strTrim.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
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
                                                            ArrayList arrayList10 = new ArrayList();
                                                            long j36 = j35;
                                                            String optionalStringAttr13 = parseOptionalStringAttr(next, REGEX_SNAP, map, matcherCache);
                                                            if (optionalStringAttr13 != null) {
                                                                String[] strArrSplit5 = Util.split(optionalStringAttr13, ",");
                                                                int length2 = strArrSplit5.length;
                                                                int i20 = 0;
                                                                while (i20 < length2) {
                                                                    int i21 = i20;
                                                                    String strTrim2 = strArrSplit5[i20].trim();
                                                                    strTrim2.getClass();
                                                                    int i22 = length2;
                                                                    if (strTrim2.equals(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN) || strTrim2.equals(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT)) {
                                                                        arrayList10.add(strTrim2);
                                                                    }
                                                                    i20 = i21 + 1;
                                                                    length2 = i22;
                                                                }
                                                            }
                                                            ArrayList arrayList11 = new ArrayList();
                                                            String optionalStringAttr14 = parseOptionalStringAttr(next, REGEX_RESTRICT, map, matcherCache);
                                                            if (optionalStringAttr14 != null) {
                                                                String[] strArrSplit6 = Util.split(optionalStringAttr14, ",");
                                                                int length3 = strArrSplit6.length;
                                                                int i23 = 0;
                                                                while (i23 < length3) {
                                                                    int i24 = i23;
                                                                    String strTrim3 = strArrSplit6[i23].trim();
                                                                    strTrim3.getClass();
                                                                    int i25 = length3;
                                                                    if (strTrim3.equals(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_JUMP) || strTrim3.equals(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP)) {
                                                                        arrayList11.add(strTrim3);
                                                                    }
                                                                    i23 = i24 + 1;
                                                                    length3 = i25;
                                                                }
                                                            }
                                                            String optionalStringAttr15 = parseOptionalStringAttr(next, REGEX_CONTENT_MAY_VARY, map, matcherCache);
                                                            Boolean boolValueOf = optionalStringAttr15 != null ? Boolean.valueOf(!optionalStringAttr15.equals(BOOLEAN_FALSE)) : null;
                                                            String optionalStringAttr16 = parseOptionalStringAttr(next, REGEX_TIMELINE_OCCUPIES, map, matcherCache);
                                                            Boolean bool = boolValueOf;
                                                            if (optionalStringAttr16 != null) {
                                                                str8 = HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_RANGE;
                                                                if (!optionalStringAttr16.equals(HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_RANGE)) {
                                                                    str8 = HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_POINT;
                                                                    if (!optionalStringAttr16.equals(HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_POINT)) {
                                                                        str8 = null;
                                                                    }
                                                                }
                                                            } else {
                                                                str8 = null;
                                                            }
                                                            String optionalStringAttr17 = parseOptionalStringAttr(next, REGEX_TIMELINE_STYLE, map, matcherCache);
                                                            String str22 = str8;
                                                            if (optionalStringAttr17 != null) {
                                                                str9 = HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_PRIMARY;
                                                                if (!optionalStringAttr17.equals(HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_PRIMARY)) {
                                                                    str9 = HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_HIGHLIGHT;
                                                                    if (!optionalStringAttr17.equals(HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_HIGHLIGHT)) {
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
                                                            String optionalStringAttr18 = parseOptionalStringAttr(next, REGEX_SKIP_CONTROL_LABEL_ID, map, matcherCache);
                                                            ArrayList arrayList12 = new ArrayList();
                                                            long j40 = j39;
                                                            String strSubstring = next.substring(17);
                                                            Matcher matcherObtainMatcher = matcherCache.obtainMatcher(REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX, strSubstring);
                                                            while (matcherObtainMatcher.find()) {
                                                                String strGroup = matcherObtainMatcher.group();
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
                                                            linkedHashMap2.put(stringAttr7, (linkedHashMap2.containsKey(stringAttr7) ? (HlsMediaPlaylist.Interstitial.Builder) linkedHashMap2.get(stringAttr7) : new HlsMediaPlaylist.Interstitial.Builder(stringAttr7)).setAssetUri(uri2).setAssetListUri(uri3).setStartDateUnixUs(jMsToUs2).setEndDateUnixUs(j37).setDurationUs(j31).setPlannedDurationUs(j33).setCue(arrayList9).setEndOnNext(optionalBooleanAttribute4).setResumeOffsetUs(j34).setPlayoutLimitUs(j36).setSnapTypes(arrayList10).setRestrictions(arrayList11).setClientDefinedAttributes(arrayList12).setContentMayVary(bool).setTimelineOccupies(str22).setTimelineStyle(str9).setSkipControlOffsetUs(j38).setSkipControlDurationUs(j40).setSkipControlLabelId(optionalStringAttr18));
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
                                                                String segmentEncryptionIV2 = getSegmentEncryptionIV(j27, str5, str6);
                                                                long j41 = j27 + 1;
                                                                String strReplaceVariableReferences = replaceVariableReferences(next, map, matcherCache);
                                                                HlsMediaPlaylist.Segment segment5 = (HlsMediaPlaylist.Segment) map4.get(strReplaceVariableReferences);
                                                                if (j19 == -1) {
                                                                    j10 = 0;
                                                                } else {
                                                                    if (z15 && segment2 == null && segment5 == null) {
                                                                        segment5 = new HlsMediaPlaylist.Segment(strReplaceVariableReferences, 0L, j16, null, null);
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
                                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    str7 = str4;
                                                                    DrmInitData drmInitData6 = new DrmInitData(str7, schemeDataArr2);
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
                                                                arrayList8.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment2 != null ? segment2 : segment5, optionalStringAttr, j44, i26, j43, drmInitData2, str5, segmentEncryptionIV2, j10, j42, z13, arrayList2));
                                                                long j45 = j43 + j44;
                                                                arrayList2 = new ArrayList();
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
                                                    String stringAttr8 = parseStringAttr(next, REGEX_URI, map, matcherCache);
                                                    long optionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L, matcherCache);
                                                    long optionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L, matcherCache);
                                                    String str23 = string;
                                                    HlsMediaPlaylist.Part part3 = part2;
                                                    String segmentEncryptionIV3 = getSegmentEncryptionIV(j22, str15, str3);
                                                    if (drmInitData4 != null || treeMap.isEmpty()) {
                                                        j11 = optionalLongAttr2;
                                                        str10 = str13;
                                                    } else {
                                                        j11 = optionalLongAttr2;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        str10 = str13;
                                                        DrmInitData drmInitData7 = new DrmInitData(str10, schemeDataArr3);
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
                                                            part = new HlsMediaPlaylist.Part(stringAttr8, segment2, 0L, i10, j46, drmInitData3, str15, segmentEncryptionIV3, j12, j47, false, false, true);
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
                                                        part = new HlsMediaPlaylist.Part(stringAttr8, segment2, 0L, i10, j48, drmInitData3, str15, segmentEncryptionIV3, j12, j49, false, false, true);
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
                                                        part = new HlsMediaPlaylist.Part(stringAttr8, segment2, 0L, i10, j410, drmInitData3, str15, segmentEncryptionIV3, j12, j411, false, false, true);
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
        ArrayList arrayList13 = arrayList4;
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        HlsMediaPlaylist.Part part4 = part2;
        boolean z16 = z11;
        ArrayList arrayList14 = arrayList;
        ArrayList arrayList15 = arrayList2;
        ArrayList arrayList16 = arrayList3;
        HashMap map5 = new HashMap();
        int i27 = 0;
        while (i27 < arrayList16.size()) {
            ArrayList arrayList17 = arrayList16;
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList17.get(i27);
            long size = renditionReport.lastMediaSequence;
            if (size == -1) {
                size = (longAttr + ((long) arrayList14.size())) - (arrayList15.isEmpty() ? 1L : 0L);
            }
            int size2 = renditionReport.lastPartIndex;
            if (size2 == -1 && doubleAttr != C.TIME_UNSET) {
                size2 = (arrayList15.isEmpty() ? ((HlsMediaPlaylist.Segment) AbstractC2230y.l(arrayList14)).parts : arrayList15).size() - 1;
            }
            Uri uri4 = renditionReport.playlistUri;
            map5.put(uri4, new HlsMediaPlaylist.RenditionReport(uri4, size, size2));
            i27++;
            arrayList16 = arrayList17;
        }
        if (part4 != null) {
            arrayList15.add(part4);
        }
        ArrayList arrayList18 = new ArrayList();
        Iterator it = linkedHashMap3.values().iterator();
        while (it.hasNext()) {
            HlsMediaPlaylist.Interstitial interstitialBuild = ((HlsMediaPlaylist.Interstitial.Builder) it.next()).build();
            if (interstitialBuild != null) {
                arrayList18.add(interstitialBuild);
            }
        }
        if (jMsToUs == 0 && hlsMediaPlaylist != null && hlsMediaPlaylist.hasProgramDateTime) {
            jMsToUs = hlsMediaPlaylist.startTimeUs;
        }
        return new HlsMediaPlaylist(i12, uri.toString(), arrayList13, j13, z16, jMsToUs, z12, i11, longAttr, intAttr2, intAttr, doubleAttr, z10, z14, jMsToUs != 0, playlistProtectionSchemes3, arrayList14, arrayList15, serverControl, map5, arrayList18, segment2);
    }

    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, Uri uri, MatcherCache matcherCache) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        String mediaMimeType;
        int i3;
        String str;
        String mediaMimeType2;
        int i9;
        String strP;
        int i10;
        String str2;
        String codecsOfType;
        ColorInfo colorInfoForDolbyVision;
        String optionalStringAttr;
        int i11;
        int i12;
        String optionalStringAttr2;
        float f9;
        Uri uriResolveToUri;
        Uri uri2;
        HashMap map;
        ArrayList arrayList3;
        String codecsWithoutType;
        String string = uri.toString();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean zContains = false;
        boolean z6 = false;
        while (true) {
            boolean zHasNext = lineIterator.hasNext();
            String str3 = MimeTypes.APPLICATION_M3U8;
            if (!zHasNext) {
                HashMap map4 = map2;
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList10;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList8;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i13 = 0;
                while (i13 < arrayList4.size()) {
                    HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList4.get(i13);
                    if (hashSet.add(variant.url)) {
                        AbstractC1864o0.Y(variant.format.metadata == null);
                        ArrayList arrayList20 = (ArrayList) map4.get(variant.url);
                        arrayList20.getClass();
                        i9 = 1;
                        arrayList19.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, arrayList20))).build()));
                    } else {
                        i9 = 1;
                    }
                    i13 += i9;
                }
                ArrayList arrayList21 = null;
                Format format = null;
                int i14 = 0;
                while (i14 < arrayList12.size()) {
                    ArrayList arrayList22 = arrayList12;
                    String str4 = (String) arrayList22.get(i14);
                    String stringAttr = parseStringAttr(str4, REGEX_GROUP_ID, map3, matcherCache);
                    String stringAttr2 = parseStringAttr(str4, REGEX_NAME, map3, matcherCache);
                    String optionalStringAttr3 = parseOptionalStringAttr(str4, REGEX_STABLE_RENDITION_ID, map3, matcherCache);
                    Format.Builder builder = new Format.Builder();
                    StringBuilder sb = new StringBuilder();
                    sb.append(stringAttr);
                    ArrayList arrayList23 = arrayList21;
                    sb.append(":");
                    sb.append(stringAttr2);
                    Format.Builder language = builder.setId(sb.toString()).setLabel(stringAttr2).setContainerMimeType(str3).setSelectionFlags(parseSelectionFlags(str4, matcherCache)).setRoleFlags(parseRoleFlags(str4, map3, matcherCache)).setLanguage(parseOptionalStringAttr(str4, REGEX_LANGUAGE, map3, matcherCache));
                    String optionalStringAttr4 = parseOptionalStringAttr(str4, REGEX_URI, map3, matcherCache);
                    Uri uriResolveToUri2 = optionalStringAttr4 == null ? null : UriUtil.resolveToUri(string, optionalStringAttr4);
                    String str5 = str3;
                    int i15 = i14;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.EMPTY_LIST));
                    String stringAttr3 = parseStringAttr(str4, REGEX_TYPE, map3, matcherCache);
                    stringAttr3.getClass();
                    switch (stringAttr3) {
                        case "SUBTITLES":
                            arrayList = arrayList15;
                            arrayList2 = arrayList14;
                            HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList4, stringAttr);
                            if (variantWithSubtitleGroup != null) {
                                String codecsOfType2 = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType2);
                                mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                mediaMimeType = null;
                            }
                            if (mediaMimeType == null) {
                                mediaMimeType = MimeTypes.TEXT_VTT;
                            }
                            language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                            if (uriResolveToUri2 != null) {
                                arrayList16 = arrayList16;
                                arrayList16.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2, optionalStringAttr3));
                            } else {
                                arrayList16 = arrayList16;
                                Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList21 = arrayList23;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList15;
                            arrayList2 = arrayList14;
                            String stringAttr4 = parseStringAttr(str4, REGEX_INSTREAM_ID, map3, matcherCache);
                            if (stringAttr4.startsWith("CC")) {
                                i3 = Integer.parseInt(stringAttr4.substring(2));
                                str = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i3 = Integer.parseInt(stringAttr4.substring(7));
                                str = MimeTypes.APPLICATION_CEA708;
                            }
                            ArrayList arrayList24 = arrayList23 == null ? new ArrayList() : arrayList23;
                            language.setSampleMimeType(str).setAccessibilityChannel(i3);
                            arrayList24.add(language.build());
                            arrayList21 = arrayList24;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList14;
                            HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList4, stringAttr);
                            if (variantWithAudioGroup != null) {
                                String codecsOfType3 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType3);
                                mediaMimeType2 = MimeTypes.getMediaMimeType(codecsOfType3);
                            } else {
                                mediaMimeType2 = null;
                            }
                            String optionalStringAttr5 = parseOptionalStringAttr(str4, REGEX_CHANNELS, map3, matcherCache);
                            if (optionalStringAttr5 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(optionalStringAttr5, "/")[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr5.endsWith("/JOC")) {
                                    language.setCodecs(MimeTypes.CODEC_E_AC3_JOC);
                                    mediaMimeType2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(mediaMimeType2);
                            if (uriResolveToUri2 == null) {
                                arrayList = arrayList15;
                                if (variantWithAudioGroup != null) {
                                    Format formatBuild = language.build();
                                    arrayList21 = arrayList23;
                                    format = formatBuild;
                                }
                                break;
                            } else {
                                language.setMetadata(metadata);
                                HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2, optionalStringAttr3);
                                arrayList = arrayList15;
                                arrayList.add(rendition);
                            }
                            arrayList21 = arrayList23;
                            break;
                        case "VIDEO":
                            HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList4, stringAttr);
                            if (variantWithVideoGroup != null) {
                                Format format2 = variantWithVideoGroup.format;
                                String codecsOfType4 = Util.getCodecsOfType(format2.codecs, 2);
                                language.setCodecs(codecsOfType4).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType4)).setWidth(format2.width).setHeight(format2.height).setFrameRate(format2.frameRate);
                            }
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                HlsMultivariantPlaylist.Rendition rendition2 = new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2, optionalStringAttr3);
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
                return new HlsMultivariantPlaylist(uri.toString(), arrayList18, arrayList19, arrayList14, arrayList15, arrayList16, arrayList17, format, zContains ? Collections.EMPTY_LIST : arrayList21, z6, map3, arrayList13);
            }
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList11.add(next);
            }
            boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            if (next.startsWith(TAG_DEFINE)) {
                String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_NAME, map3, matcherCache);
                if (optionalStringAttr6 != null) {
                    verifyVariableNameNotContainedOrThrow(optionalStringAttr6, map3);
                    map3.put(optionalStringAttr6, parseStringAttr(next, REGEX_VALUE, map3, matcherCache));
                } else {
                    String stringAttr5 = parseStringAttr(next, REGEX_QUERY_PARAM, map3, matcherCache);
                    verifyVariableNameNotContainedOrThrow(stringAttr5, map3);
                    String queryParameter = uri.getQueryParameter(stringAttr5);
                    if (queryParameter == null) {
                        throw ParserException.createForMalformedManifest("QUERYPARAM \"" + stringAttr5 + "\" not found in playlist URI", null);
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
                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map3, matcherCache), map3, matcherCache);
                    if (drmSchemeData != null) {
                        arrayList10.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map3, matcherCache)), drmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                    zContains |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i16 = zStartsWith ? 16384 : 0;
                    int intAttr = parseIntAttr(next, REGEX_BANDWIDTH, matcherCache);
                    int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1, matcherCache);
                    String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_VIDEO_RANGE, map3, matcherCache);
                    String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_CODECS, map3, matcherCache);
                    String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_SUPPLEMENTAL_CODECS, map3, matcherCache);
                    if (optionalStringAttr9 != null) {
                        String[] strArrSplit = Util.split(Util.splitAtFirst(optionalStringAttr9, ",")[0], "/");
                        String str6 = strArrSplit[0];
                        if (strArrSplit.length > 1) {
                            str2 = strArrSplit[1];
                            map2 = map2;
                            arrayList9 = arrayList9;
                            strP = str6;
                            i10 = 2;
                        } else {
                            strP = str6;
                        }
                        codecsOfType = Util.getCodecsOfType(optionalStringAttr8, i10);
                        if (isDolbyVisionFormat(optionalStringAttr7, codecsOfType, strP, str2)) {
                            colorInfoForDolbyVision = Util.getColorInfoForDolbyVision(optionalStringAttr8, strP, str2);
                            if (strP == null) {
                                strP = codecsOfType;
                            }
                            codecsWithoutType = Util.getCodecsWithoutType(optionalStringAttr8, i10);
                            if (codecsWithoutType != null) {
                                strP = p.p(strP, ",", codecsWithoutType);
                            }
                            optionalStringAttr8 = strP;
                        } else {
                            colorInfoForDolbyVision = null;
                        }
                        optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3, matcherCache);
                        if (optionalStringAttr != null) {
                            String[] strArrSplit2 = Util.split(optionalStringAttr, "x");
                            i12 = Integer.parseInt(strArrSplit2[0]);
                            i11 = Integer.parseInt(strArrSplit2[1]);
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
                            f9 = Float.parseFloat(optionalStringAttr2);
                        } else {
                            f9 = -1.0f;
                        }
                        String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_PATHWAY_ID, map3, matcherCache);
                        String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_VIDEO, map3, matcherCache);
                        String optionalStringAttr12 = parseOptionalStringAttr(next, REGEX_AUDIO, map3, matcherCache);
                        String optionalStringAttr13 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3, matcherCache);
                        String optionalStringAttr14 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3, matcherCache);
                        String optionalStringAttr15 = parseOptionalStringAttr(next, REGEX_STABLE_VARIANT_ID, map3, matcherCache);
                        if (zStartsWith) {
                            uriResolveToUri = UriUtil.resolveToUri(string, parseStringAttr(next, REGEX_URI, map3, matcherCache));
                        } else {
                            if (lineIterator.hasNext()) {
                                throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriResolveToUri = UriUtil.resolveToUri(string, replaceVariableReferences(lineIterator.next(), map3, matcherCache));
                        }
                        uri2 = uriResolveToUri;
                        arrayList4.add(new HlsMultivariantPlaylist.Variant(uri2, new Format.Builder().setId(arrayList4.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr8).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i12).setHeight(i11).setFrameRate(f9).setRoleFlags(i16).setColorInfo(colorInfoForDolbyVision).build(), optionalStringAttr11, optionalStringAttr12, optionalStringAttr13, optionalStringAttr14, optionalStringAttr10, optionalStringAttr15));
                        map = map2;
                        arrayList3 = (ArrayList) map.get(uri2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri2, arrayList3);
                        }
                        arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr11, optionalStringAttr12, optionalStringAttr13, optionalStringAttr14));
                    } else {
                        strP = null;
                    }
                    i10 = 2;
                    str2 = null;
                    codecsOfType = Util.getCodecsOfType(optionalStringAttr8, i10);
                    if (isDolbyVisionFormat(optionalStringAttr7, codecsOfType, strP, str2)) {
                        colorInfoForDolbyVision = Util.getColorInfoForDolbyVision(optionalStringAttr8, strP, str2);
                        if (strP == null) {
                            strP = codecsOfType;
                        }
                        codecsWithoutType = Util.getCodecsWithoutType(optionalStringAttr8, i10);
                        if (codecsWithoutType != null) {
                            strP = p.p(strP, ",", codecsWithoutType);
                        }
                        optionalStringAttr8 = strP;
                    } else {
                        colorInfoForDolbyVision = null;
                    }
                    optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3, matcherCache);
                    if (optionalStringAttr != null) {
                        String[] strArrSplit3 = Util.split(optionalStringAttr, "x");
                        i12 = Integer.parseInt(strArrSplit3[0]);
                        i11 = Integer.parseInt(strArrSplit3[1]);
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
                        f9 = Float.parseFloat(optionalStringAttr2);
                    } else {
                        f9 = -1.0f;
                    }
                    String optionalStringAttr16 = parseOptionalStringAttr(next, REGEX_PATHWAY_ID, map3, matcherCache);
                    String optionalStringAttr17 = parseOptionalStringAttr(next, REGEX_VIDEO, map3, matcherCache);
                    String optionalStringAttr18 = parseOptionalStringAttr(next, REGEX_AUDIO, map3, matcherCache);
                    String optionalStringAttr19 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3, matcherCache);
                    String optionalStringAttr110 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3, matcherCache);
                    String optionalStringAttr111 = parseOptionalStringAttr(next, REGEX_STABLE_VARIANT_ID, map3, matcherCache);
                    if (zStartsWith) {
                        uriResolveToUri = UriUtil.resolveToUri(string, parseStringAttr(next, REGEX_URI, map3, matcherCache));
                    } else {
                        if (lineIterator.hasNext()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriResolveToUri = UriUtil.resolveToUri(string, replaceVariableReferences(lineIterator.next(), map3, matcherCache));
                    }
                    uri2 = uriResolveToUri;
                    arrayList4.add(new HlsMultivariantPlaylist.Variant(uri2, new Format.Builder().setId(arrayList4.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr8).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i12).setHeight(i11).setFrameRate(f9).setRoleFlags(i16).setColorInfo(colorInfoForDolbyVision).build(), optionalStringAttr17, optionalStringAttr18, optionalStringAttr19, optionalStringAttr110, optionalStringAttr16, optionalStringAttr111));
                    map = map2;
                    arrayList3 = (ArrayList) map.get(uri2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uri2, arrayList3);
                    }
                    arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr17, optionalStringAttr18, optionalStringAttr19, optionalStringAttr110));
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

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z6, MatcherCache matcherCache) {
        Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        return matcherObtainMatcher.find() ? BOOLEAN_TRUE.equals(matcherObtainMatcher.group(1)) : z6;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d4, MatcherCache matcherCache) {
        Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!matcherObtainMatcher.find()) {
            return d4;
        }
        String strGroup = matcherObtainMatcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i3, MatcherCache matcherCache) {
        Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!matcherObtainMatcher.find()) {
            return i3;
        }
        String strGroup = matcherObtainMatcher.group(1);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j, MatcherCache matcherCache) {
        Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!matcherObtainMatcher.find()) {
            return j;
        }
        String strGroup = matcherObtainMatcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map, MatcherCache matcherCache) {
        return parseOptionalStringAttr(str, pattern, null, map, matcherCache);
    }

    private static int parseRoleFlags(String str, Map<String, String> map, MatcherCache matcherCache) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map, matcherCache);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        String[] strArrSplit = Util.split(optionalStringAttr, ",");
        int i3 = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i3 |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i3 |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i3 | 8192 : i3;
    }

    private static int parseSelectionFlags(String str, MatcherCache matcherCache) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false, matcherCache);
        ?? r9 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false, matcherCache)) {
            r9 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false, matcherCache) ? r9 | 4 : r9;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str, MatcherCache matcherCache) {
        double d4;
        long j;
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d, matcherCache);
        long j9 = C.TIME_UNSET;
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
        return new HlsMediaPlaylist.ServerControl(j10, optionalBooleanAttribute, j, j9, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false, matcherCache));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map, MatcherCache matcherCache) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map, matcherCache);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern, MatcherCache matcherCache) {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map, MatcherCache matcherCache) {
        Matcher matcherObtainMatcher = matcherCache.obtainMatcher(REGEX_VARIABLE_REFERENCE, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherObtainMatcher.find()) {
            String strGroup = matcherObtainMatcher.group(1);
            if (map.containsKey(strGroup)) {
                matcherObtainMatcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcherObtainMatcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z6, int i3) throws IOException {
        while (i3 != -1 && Character.isWhitespace(i3) && (z6 || !Util.isLinebreak(i3))) {
            i3 = bufferedReader.read();
        }
        return i3;
    }

    private static void verifyVariableNameNotContainedOrThrow(String str, Map<String, String> map) throws ParserException {
        if (map.containsKey(str)) {
            throw ParserException.createForMalformedManifest("duplicate variable name \"" + str + "\"", null);
        }
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map, MatcherCache matcherCache) {
        Matcher matcherObtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (matcherObtainMatcher.find()) {
            str2 = matcherObtainMatcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map, matcherCache);
    }

    @Override
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws ParserException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        MatcherCache matcherCache = new MatcherCache();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(TAG_STREAM_INF)) {
                        arrayDeque.add(strTrim);
                        HlsMultivariantPlaylist multivariantPlaylist = parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri, matcherCache);
                        Util.closeQuietly(bufferedReader);
                        return multivariantPlaylist;
                    }
                    if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri, matcherCache);
                    Util.closeQuietly(bufferedReader);
                    return mediaPlaylist;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(bufferedReader);
            throw th;
        }
    }
}
