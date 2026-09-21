package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import io.sentry.util.HttpUtils;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076i4.X0;
import p121o0.p;

public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static String buildRangeRequestHeader(long j, long j9) {
        if (j == 0 && j9 == -1) {
            return null;
        }
        StringBuilder sbU = p.u(j, "bytes=", "-");
        if (j9 != -1) {
            sbU.append((j + j9) - 1);
        }
        return sbU.toString();
    }

    public static long getContentLength(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.e(TAG, "Unexpected Content-Length [" + str + "]");
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j9 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j10 = (j9 - Long.parseLong(strGroup2)) + 1;
            if (j < 0) {
                return j10;
            }
            if (j == j10) {
                return j;
            }
            Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, j10);
        } catch (NumberFormatException unused2) {
            Log.e(TAG, "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    public static String getCookieHeader(String str, Map<String, List<String>> map, CookieHandler cookieHandler) {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> map2 = X0.f22848n;
        try {
            map2 = cookieHandler.get(new URI(str), map);
        } catch (Exception e6) {
            Log.w(TAG, "Failed to read cookies from CookieHandler", e6);
        }
        StringBuilder sb = new StringBuilder();
        if (map2.containsKey(HttpUtils.COOKIE_HEADER_NAME) && (list = map2.get(HttpUtils.COOKIE_HEADER_NAME)) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("; ");
            }
        }
        String string = sb.toString();
        int length = string.length();
        while (length > 0) {
            int iCodePointBefore = Character.codePointBefore(string, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return string.substring(0, length);
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static void storeCookiesFromHeaders(String str, Map<String, List<String>> map, CookieHandler cookieHandler) {
        if (cookieHandler == null) {
            return;
        }
        try {
            cookieHandler.put(new URI(str), map);
        } catch (Exception e6) {
            Log.w(TAG, "Failed to store cookies in CookieHandler", e6);
        }
    }
}
