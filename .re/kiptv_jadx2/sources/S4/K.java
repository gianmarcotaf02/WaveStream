package S4;

import C5.O1;
import J5.t2;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.ktor.sse.ServerSentEventKt;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class K {

    public static final List f9328A;

    public static final K f9329a = new K();

    public static final List f9330b = p078i6.p.B0("hd", "4k", "uhd", "fhd", "720p", "1080p", "2160p", "bluray", "web-dl", "webrip");

    public static final List f9331c = p078i6.p.B0("ita", "eng", "sub", "dub");

    public static final List f9332d = p078i6.p.B0("hd", "4k", "720p", "1080p", "2160p", "bluray", "web-dl", "webrip", "cam", "ts", "dvdrip");

    public static final Object f9333e;

    public static final O7.o f9334f;
    public static final O7.o g;

    public static final List f9335h;

    public static final List f9336i;
    public static final List j;

    public static final List f9337k;

    public static final O7.o f9338l;

    public static final O7.o f9339m;

    public static final O7.o f9340n;

    public static final O7.o f9341o;

    public static final O7.o f9342p;

    public static final O7.o f9343q;

    public static final O7.o f9344r;

    public static final O7.o f9345s;

    public static final O7.o f9346t;

    public static final Set f9347u;

    public static final List f9348v;

    public static final Object f9349w;

    public static final List f9350x;
    public static final int y;

    public static final char[] f9351z;

    static {
        Map mapN0 = p078i6.C.N0(new p070h6.k("DE", "DE"), new p070h6.k("GER", "DE"), new p070h6.k("DEU", "DE"), new p070h6.k("FR", "FR"), new p070h6.k("FRA", "FR"), new p070h6.k("FRE", "FR"), new p070h6.k("IT", "IT"), new p070h6.k("ITA", "IT"), new p070h6.k("EN", "GB"), new p070h6.k("ENG", "GB"), new p070h6.k("UK", "GB"), new p070h6.k("GB", "GB"), new p070h6.k("US", "US"), new p070h6.k("USA", "US"), new p070h6.k("ES", "ES"), new p070h6.k("ESP", "ES"), new p070h6.k("SPA", "ES"), new p070h6.k("LAT", "MX"), new p070h6.k("LATINO", "MX"), new p070h6.k("MX", "MX"), new p070h6.k("PT", "PT"), new p070h6.k("POR", "PT"), new p070h6.k("BR", "BR"), new p070h6.k("BRA", "BR"), new p070h6.k("NL", "NL"), new p070h6.k("NLD", "NL"), new p070h6.k("DUT", "NL"), new p070h6.k("PL", "PL"), new p070h6.k("POL", "PL"), new p070h6.k("TR", "TR"), new p070h6.k("TUR", "TR"), new p070h6.k("AR", "SA"), new p070h6.k("ARA", "SA"), new p070h6.k("SA", "SA"), new p070h6.k("RU", "RU"), new p070h6.k("RUS", "RU"), new p070h6.k("GR", "GR"), new p070h6.k("GRE", "GR"), new p070h6.k("EL", "GR"), new p070h6.k("SE", "SE"), new p070h6.k("SWE", "SE"), new p070h6.k("SV", "SE"), new p070h6.k("NO", "NO"), new p070h6.k("NOR", "NO"), new p070h6.k("DK", "DK"), new p070h6.k("DAN", "DK"), new p070h6.k("DA", "DK"), new p070h6.k("FI", "FI"), new p070h6.k("FIN", "FI"), new p070h6.k("CZ", "CZ"), new p070h6.k("CZE", "CZ"), new p070h6.k("CS", "CZ"), new p070h6.k("SK", "SK"), new p070h6.k("SVK", "SK"), new p070h6.k("HU", "HU"), new p070h6.k("HUN", "HU"), new p070h6.k("RO", "RO"), new p070h6.k("ROM", "RO"), new p070h6.k("RON", "RO"), new p070h6.k("BG", "BG"), new p070h6.k("BUL", "BG"), new p070h6.k("UA", "UA"), new p070h6.k("UKR", "UA"), new p070h6.k("HR", "HR"), new p070h6.k("HRV", "HR"), new p070h6.k("CRO", "HR"), new p070h6.k("RS", "RS"), new p070h6.k("SRB", "RS"), new p070h6.k("SI", "SI"), new p070h6.k("SLV", "SI"), new p070h6.k("AL", "AL"), new p070h6.k("ALB", "AL"), new p070h6.k("JP", "JP"), new p070h6.k("JPN", "JP"), new p070h6.k("JA", "JP"), new p070h6.k("KR", "KR"), new p070h6.k("KOR", "KR"), new p070h6.k("KO", "KR"), new p070h6.k("CN", "CN"), new p070h6.k("CHN", "CN"), new p070h6.k("CHI", "CN"), new p070h6.k("ZH", "CN"), new p070h6.k(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN), new p070h6.k("IND", HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN), new p070h6.k("HIN", HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN), new p070h6.k("HI", HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN), new p070h6.k("IL", "IL"), new p070h6.k("HEB", "IL"), new p070h6.k("HE", "IL"), new p070h6.k("TH", "TH"), new p070h6.k("THA", "TH"), new p070h6.k("VN", "VN"), new p070h6.k("VIE", "VN"), new p070h6.k("VI", "VN"), new p070h6.k("ID", "ID"), new p070h6.k("IDN", "ID"), new p070h6.k("BE", "BE"), new p070h6.k("CH", "CH"), new p070h6.k("AT", "AT"), new p070h6.k("AU", "AU"), new p070h6.k("CA", "CA"), new p070h6.k("IE", "IE"), new p070h6.k("LU", "LU"), new p070h6.k("MA", "MA"), new p070h6.k("EG", "EG"), new p070h6.k("IR", "IR"), new p070h6.k("PK", "PK"), new p070h6.k("PH", "PH"), new p070h6.k("MY", "MY"));
        f9333e = mapN0;
        String strO1 = p078i6.o.o1(p078i6.o.I1(mapN0.keySet(), new B5.w(7, new O1(19))), "|", null, null, null, 62);
        f9334f = new O7.o(Y6.f.m(Y6.f.o("^(?:\\[(", strO1, ")]|\\((", strO1, ")\\)|("), strO1, ")\\s*[-|:–—])\\s*(?=\\S)"));
        g = new O7.o(Y6.f.h("\\((", strO1, ")(?:\\s+\\d{4})?\\)\\s*$"));
        O7.p[] pVarArr = O7.p.f8061h;
        List listB0 = p078i6.p.B0(new O7.o("^(HD|4K|UHD|FHD|720p|1080p|2160p|BluRay|WEB-DL|WEBRip)\\b\\s*", 0), new O7.o("^(ITA|ENG|SUB|DUB)\\b\\s*", 0), new O7.o("^\\[.*?]\\s*"), new O7.o("^\\d{4}\\s*-\\s*"));
        f9335h = listB0;
        List listB1 = p078i6.p.B0(new O7.o("\\s*\\(\\d{4}\\)(?:\\s*4K)?$"), new O7.o("\\s*\\d{4}\\s*4K$"), new O7.o("\\s*4K$"), new O7.o("\\s*\\b(HD|UHD|FHD|720p|1080p|2160p|BluRay|WEB-DL|WEBRip)$", 0), new O7.o("\\s*\\b(ITA|ENG|SUB|DUB)$", 0), new O7.o("\\s*\\[.*?]$"), new O7.o("\\s*-\\s*\\d{4}$"), new O7.o("\\s*\\([A-Z]{2,3}\\)$"), new O7.o("\\s*\\([A-Z]{2,3}\\s+\\d{4}\\)$"));
        f9336i = listB1;
        List listB2 = p078i6.p.B0(new t2(14), new t2(21), new t2(22), new t2(23));
        j = listB2;
        List listB3 = p078i6.p.B0(new t2(24), new t2(25), new t2(26), new t2(15), new t2(16), new t2(17), new t2(18), new t2(19), new t2(20));
        f9337k = listB3;
        if (listB2.size() != listB0.size() || listB3.size() != listB1.size()) {
            throw new IllegalStateException("TitleCleaner: every prefix/suffix pattern needs its needle guard");
        }
        f9338l = new O7.o("\\b(HD|4K|UHD|FHD|720p|1080p|2160p|BluRay|WEB-DL|WEBRip|CAM|TS|DVDRip)\\b", 0);
        f9339m = new O7.o("\\b(SUB|DUB)[ ._-]+(ITA|ENG)\\b", 0);
        f9340n = new O7.o("\\b(SUBITA|DUBITA|SUBENG|DUBBED|MULTISUB)\\b");
        f9341o = new O7.o("\\b(ITA|ENG|SUB|DUB)\\b", 0);
        f9342p = new O7.o("\\b(MULTI[ ._-]?(?:LANG|LANGUAGE|LINGUAL|AUDIO)?|DUAL[ ._-]?(?:AUDIO)?)\\b", 0);
        f9343q = new O7.o("\\s*\\(\\d{4}\\)");
        f9344r = new O7.o("\\p{InCombiningDiacriticalMarks}+");
        f9345s = new O7.o("\\s+");
        f9346t = new O7.o("^(.*\\S)\\s+((?:19|20)\\d{2})$");
        f9347u = p078i6.m.F0(new String[]{"the", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "an", "and", "or", "of", "to", "in", "for", "on", "with", "il", "la", "le", "gli", "lo", "una", "un", "di", "da", "per", "con", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "el", "los", "las", "de", "en", "del", "y", "que", "der", "die", "das", androidx.media3.common.C.LANGUAGE_UNDETERMINED, "von", "zu", "mit"});
        f9348v = p078i6.p.B0("the ", "il ", "la ", "le ", "gli ", "lo ", "una ", "un ", "der ", "die ", "das ", "el ", "los ", "las ", "a ", "an ");
        f9349w = p078i6.C.N0(new p070h6.k("SUBITA", "SUB ITA"), new p070h6.k("DUBITA", "DUB ITA"), new p070h6.k("SUBENG", "SUB ENG"), new p070h6.k("DUBBED", "DUB"), new p070h6.k("MULTISUB", "MULTI SUB"));
        f9350x = p078i6.p.B0(new O7.o("\\((\\d{4})\\)"), new O7.o("\\[(\\d{4})]"), new O7.o("(\\d{4})\\s*-\\s*"), new O7.o("\\s*-\\s*(\\d{4})$"), new O7.o("\\b(\\d{4})\\b"));
        y = Calendar.getInstance().get(1);
        f9351z = new char[]{'(', '[', '-', '-', 0};
        kotlin.jvm.internal.m.d(Pattern.compile("[|/,;]"), "compile(...)");
        f9328A = p078i6.p.B0(new p070h6.k(new O7.o("\\bxiii\\b"), "13"), new p070h6.k(new O7.o("\\bxii\\b"), "12"), new p070h6.k(new O7.o("\\bxi\\b"), "11"), new p070h6.k(new O7.o("\\bviii\\b"), "8"), new p070h6.k(new O7.o("\\bvii\\b"), "7"), new p070h6.k(new O7.o("\\bvi\\b"), "6"), new p070h6.k(new O7.o("\\biv\\b"), "4"), new p070h6.k(new O7.o("\\bix\\b"), "9"), new p070h6.k(new O7.o("\\biii\\b"), "3"), new p070h6.k(new O7.o("\\bii\\b"), "2"), new p070h6.k(new O7.o("\\bx\\b"), "10"), new p070h6.k(new O7.o("\\bv\\b"), "5"));
    }

    public static boolean a(String title1, String title2) {
        kotlin.jvm.internal.m.e(title1, "title1");
        kotlin.jvm.internal.m.e(title2, "title2");
        p070h6.k kVarE = e(title1);
        String str = (String) kVarE.f22539h;
        Integer num = (Integer) kVarE.f22540i;
        p070h6.k kVarE2 = e(title2);
        String str2 = (String) kVarE2.f22539h;
        Integer num2 = (Integer) kVarE2.f22540i;
        if ((num == null && num2 == null) || F.b(str, str2) < 0.85d) {
            return false;
        }
        if (num == null || num2 == null) {
            return true;
        }
        return !num.equals(num2);
    }

    public static String b(String title, boolean z6, boolean z9) {
        boolean z10;
        int i3;
        O7.m mVarA;
        Integer numZ0;
        kotlin.jvm.internal.m.e(title, "title");
        if (title.length() == 0) {
            return "";
        }
        if (!z6) {
            return O7.q.r1(title).toString();
        }
        String string = O7.q.r1(title).toString();
        if ((O7.q.L0(string, "sub", 0, true, 2) >= 0) || O7.q.L0(string, "dub", 0, true, 2) >= 0) {
            string = f9339m.e(string, "");
        }
        if (O7.q.B0(string, "SUB", false) || O7.q.B0(string, "DUB", false)) {
            string = f9340n.e(string, "");
        }
        if (O7.q.L0(string, "multi", 0, true, 2) >= 0 || O7.q.L0(string, "dual", 0, true, 2) >= 0) {
            string = f9342p.e(string, "");
        }
        if (string.length() != 0) {
            char cCharAt = string.charAt(0);
            if (cCharAt == '(' || cCharAt == '[') {
                string = f9334f.e(string, "");
                break;
            }
            if ('A' <= cCharAt && cCharAt < '[') {
                for (int i9 = 0; i9 < 5; i9++) {
                    if (O7.q.K0(string, "-|:–—".charAt(i9), 0, 6) >= 0) {
                        string = f9334f.e(string, "");
                        break;
                    }
                }
            }
        }
        List list = f9335h;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) ((p194x6.j) j.get(i10)).invoke(string)).booleanValue()) {
                string = ((O7.o) list.get(i10)).e(string, "");
            }
        }
        List list2 = f9336i;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((Boolean) ((p194x6.j) f9337k.get(i11)).invoke(string)).booleanValue()) {
                string = ((O7.o) list2.get(i11)).e(string, "");
            }
        }
        Iterator it = f9332d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (O7.q.L0(string, (String) it.next(), 0, true, 2) >= 0) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            string = f9338l.e(string, "");
        }
        Iterator it2 = f9331c.iterator();
        while (it2.hasNext()) {
            if (O7.q.L0(string, (String) it2.next(), 0, true, 2) >= 0) {
                string = f9341o.e(string, "");
                break;
            }
        }
        if (O7.q.K0(string, '(', 0, 6) >= 0) {
            string = f9343q.e(string, "");
        }
        if (z9) {
            string = O7.q.r1(string).toString();
            if (string.length() > 0 && Character.isDigit(O7.q.O0(string)) && (mVarA = f9346t.a(string)) != null && (numZ0 = O7.x.z0((String) ((O7.k) mVarA.a()).get(2))) != null && numZ0.intValue() <= y + 2) {
                string = (String) ((O7.k) mVarA.a()).get(1);
            }
        }
        String strW0 = O7.x.w0(O7.x.w0(O7.x.w0(i(string), ":", ServerSentEventKt.SPACE), "–", ServerSentEventKt.SPACE), "—", ServerSentEventKt.SPACE);
        int length = strW0.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt2 = strW0.charAt(i12);
            if (R8.i.w(cCharAt2) && (cCharAt2 != ' ' || ((i3 = i12 + 1) < strW0.length() && strW0.charAt(i3) == ' '))) {
                strW0 = f9345s.e(strW0, ServerSentEventKt.SPACE);
                break;
            }
        }
        return O7.q.r1(strW0).toString();
    }

    public static String c(K k9, String str, boolean z6, int i3) {
        if ((i3 & 2) != 0) {
            z6 = true;
        }
        k9.getClass();
        return b(str, z6, true);
    }

    public static ArrayList d(String str) {
        List listB1 = O7.q.b1(str, new String[]{ServerSentEventKt.SPACE}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB1) {
            String str2 = (String) obj;
            if (str2.length() >= 2) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                if (!f9347u.contains(lowerCase)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static p070h6.k e(String str) {
        Integer numZ0;
        String strH = h(str);
        List<String> listB1 = O7.q.b1(strH, new String[]{ServerSentEventKt.SPACE}, 0, 6);
        int i3 = 0;
        for (String str2 : listB1) {
            int i9 = i3 + 1;
            if (i3 != 0 && (numZ0 = O7.x.z0(str2)) != null && new D6.g(1, 30, 1).d(numZ0.intValue())) {
                return new p070h6.k(p078i6.o.o1(listB1.subList(0, i3), ServerSentEventKt.SPACE, null, null, null, 62), numZ0);
            }
            i3 = i9;
        }
        return new p070h6.k(strH, null);
    }

    public static Integer f(String title) {
        O7.m mVarA;
        String str;
        Integer numZ0;
        int iIntValue;
        kotlin.jvm.internal.m.e(title, "title");
        int length = title.length();
        int i3 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i3 = Character.isDigit(title.charAt(i9)) ? i3 + 1 : 0;
            if (i3 >= 4) {
                int i10 = 0;
                for (O7.o oVar : f9350x) {
                    int i11 = i10 + 1;
                    char c9 = f9351z[i10];
                    if ((c9 == 0 || O7.q.K0(title, c9, 0, 6) >= 0) && (mVarA = oVar.a(title)) != null && (str = (String) p078i6.o.k1(1, mVarA.a())) != null && (numZ0 = O7.x.z0(str)) != null && 1900 <= (iIntValue = numZ0.intValue()) && iIntValue <= y + 2) {
                        return numZ0;
                    }
                    i10 = i11;
                }
                return null;
            }
        }
        return null;
    }

    public static boolean g(char c9) {
        if ('a' <= c9 && c9 < '{') {
            return true;
        }
        if ('A' > c9 || c9 >= '[') {
            return '0' <= c9 && c9 < ':';
        }
        return true;
    }

    public static String h(String title) {
        kotlin.jvm.internal.m.e(title, "title");
        String lowerCase = title.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        int length = lowerCase.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = lowerCase.charAt(i3);
            if (cCharAt == 'i' || cCharAt == 'v' || cCharAt == 'x') {
                int i9 = i3;
                while (i9 < length && (lowerCase.charAt(i9) == 'i' || lowerCase.charAt(i9) == 'v' || lowerCase.charAt(i9) == 'x')) {
                    i9++;
                }
                char cCharAt2 = i3 == 0 ? ' ' : lowerCase.charAt(i3 - 1);
                char cCharAt3 = i9 < length ? lowerCase.charAt(i9) : ' ';
                if (!g(cCharAt2) && !g(cCharAt3)) {
                    for (p070h6.k kVar : f9328A) {
                        lowerCase = ((O7.o) kVar.f22539h).e(lowerCase, (String) kVar.f22540i);
                    }
                    return lowerCase;
                }
                i3 = i9;
            } else {
                i3++;
            }
        }
        return lowerCase;
    }

    public static String i(String str) {
        kotlin.jvm.internal.m.e(str, "str");
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) >= 128) {
                String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
                kotlin.jvm.internal.m.b(strNormalize);
                return f9344r.e(strNormalize, "");
            }
        }
        return str;
    }

    public static String j(String str) {
        for (String str2 : f9348v) {
            if (O7.x.x0(str, str2, false)) {
                return O7.q.V0(str, str2);
            }
        }
        return str;
    }
}
