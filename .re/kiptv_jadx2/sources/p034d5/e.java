package p034d5;

import O7.q;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.common.util.concurrent.P;
import io.sentry.protocol.User;
import java.util.Locale;
import java.util.Set;
import p015b5.p;
import p015b5.t;
import p070h6.k;
import p078i6.C;
import p078i6.m;

public abstract class e {

    public static final Object f21242a = C.N0(new k("alb", "sq"), new k("sqi", "sq"), new k("arm", "hy"), new k("hye", "hy"), new k("baq", "eu"), new k("eus", "eu"), new k("bur", "my"), new k("mya", "my"), new k("chi", "zh"), new k("zho", "zh"), new k("cze", "cs"), new k("ces", "cs"), new k("dut", "nl"), new k("nld", "nl"), new k("fre", "fr"), new k("fra", "fr"), new k(User.JsonKeys.GEO, "ka"), new k("kat", "ka"), new k("ger", "de"), new k("deu", "de"), new k("gre", "el"), new k("ell", "el"), new k("ice", "is"), new k("isl", "is"), new k("mac", "mk"), new k("mkd", "mk"), new k("mao", "mi"), new k("mri", "mi"), new k("may", "ms"), new k("msa", "ms"), new k("per", "fa"), new k("fas", "fa"), new k("rum", "ro"), new k("ron", "ro"), new k("slo", "sk"), new k("slk", "sk"), new k("tib", "bo"), new k("bod", "bo"), new k("wel", "cy"), new k("cym", "cy"));

    public static final Object f21243b = C.N0(new k("ara", "ar"), new k("ben", "bn"), new k("bos", CmcdConfiguration.KEY_BUFFER_STARVATION), new k("bul", "bg"), new k("cat", "ca"), new k("dan", "da"), new k("eng", "en"), new k("est", "et"), new k("fin", "fi"), new k("heb", "he"), new k("hin", "hi"), new k("hrv", "hr"), new k("hun", "hu"), new k("ind", "id"), new k("gle", "ga"), new k("ita", "it"), new k("jpn", "ja"), new k("kor", "ko"), new k("lav", "lv"), new k("lit", "lt"), new k("mlt", "mt"), new k("nob", "nb"), new k("nno", "nn"), new k(CmcdConfiguration.KEY_NEXT_OBJECT_REQUEST, "no"), new k("pol", "pl"), new k("por", "pt"), new k("rus", "ru"), new k("slv", "sl"), new k("spa", "es"), new k("srp", "sr"), new k("swe", "sv"), new k("tam", "ta"), new k("tel", "te"), new k("tha", "th"), new k("tur", "tr"), new k("ukr", "uk"), new k("urd", "ur"), new k("vie", "vi"));

    public static final Object f21244c = C.N0(new k("arabic", "ar"), new k("bangla", "bn"), new k("bengali", "bn"), new k("chinese", "zh"), new k("croatian", "hr"), new k("czech", "cs"), new k("danish", "da"), new k("dansk", "da"), new k("deutsch", "de"), new k("dutch", "nl"), new k("english", "en"), new k("espanol", "es"), new k("español", "es"), new k("finnish", "fi"), new k("francais", "fr"), new k("français", "fr"), new k("french", "fr"), new k("german", "de"), new k("greek", "el"), new k("hebrew", "he"), new k("hindi", "hi"), new k("hungarian", "hu"), new k("italian", "it"), new k("italiano", "it"), new k("japanese", "ja"), new k("korean", "ko"), new k("latvian", "lv"), new k("lithuanian", "lt"), new k("malay", "ms"), new k("mandarin", "zh"), new k("nederlands", "nl"), new k("norsk", "no"), new k("norwegian", "no"), new k("polish", "pl"), new k("polski", "pl"), new k("portuguese", "pt"), new k("portugues", "pt"), new k("português", "pt"), new k("romanian", "ro"), new k("russian", "ru"), new k("serbian", "sr"), new k("shqip", "sq"), new k("slovak", "sk"), new k("slovenian", "sl"), new k("spanish", "es"), new k("suomi", "fi"), new k("svenska", "sv"), new k("swedish", "sv"), new k("thai", "th"), new k("turkish", "tr"), new k("ukrainian", "uk"), new k("urdu", "ur"), new k("vietnamese", "vi"));

    public static final Set f21245d = m.F0(new String[]{androidx.media3.common.C.LANGUAGE_UNDETERMINED, "mis", "zxx", "unknown"});

    public static String a(String str) {
        String string;
        Object objT;
        Object objT2;
        if (str == null || (string = q.r1(str).toString()) == null) {
            return null;
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        t.Companion.getClass();
        Locale localeA = p.a();
        String strB = b(string);
        if (strB != null) {
            try {
                objT = new Locale(strB).getDisplayLanguage(localeA);
            } catch (Throwable th) {
                objT = P.T(th);
            }
            if (objT instanceof p070h6.m) {
                objT = null;
            }
            String str2 = (String) objT;
            if (str2 != null) {
                if (q.N0(str2) || str2.equalsIgnoreCase(strB)) {
                    str2 = null;
                }
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        return str2;
                    }
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(str2.charAt(0));
                    kotlin.jvm.internal.m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                    sb.append((Object) upperCase);
                    String strSubstring = str2.substring(1);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    return sb.toString();
                }
            }
        }
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (f21245d.contains(lowerCase)) {
            return null;
        }
        try {
            String lowerCase2 = string.toLowerCase(locale);
            kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
            objT2 = new Locale(lowerCase2).getDisplayLanguage(localeA);
        } catch (Throwable th2) {
            objT2 = P.T(th2);
        }
        if (objT2 instanceof p070h6.m) {
            objT2 = null;
        }
        String str3 = (String) objT2;
        if (str3 == null) {
            return null;
        }
        if (q.N0(str3) || str3.equalsIgnoreCase(string)) {
            str3 = null;
        }
        if (str3 == null) {
            return null;
        }
        if (str3.length() <= 0) {
            return str3;
        }
        StringBuilder sb2 = new StringBuilder();
        String strValueOf2 = String.valueOf(str3.charAt(0));
        kotlin.jvm.internal.m.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
        String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
        sb2.append((Object) upperCase2);
        String strSubstring2 = str3.substring(1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static String b(String str) {
        String string;
        if (str != null && (string = q.r1(str).toString()) != null) {
            String lowerCase = string.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() <= 0) {
                lowerCase = null;
            }
            if (lowerCase != null && !f21245d.contains(lowerCase)) {
                String strL1 = q.l1(q.l1(lowerCase, '-'), '_');
                if (strL1.length() != 2) {
                    ?? r9 = f21242a;
                    if (r9.containsKey(strL1)) {
                        return (String) r9.get(strL1);
                    }
                    ?? r10 = f21243b;
                    if (r10.containsKey(strL1)) {
                        return (String) r10.get(strL1);
                    }
                    ?? r11 = f21244c;
                    if (r11.containsKey(strL1)) {
                        return (String) r11.get(strL1);
                    }
                    if (strL1.length() == 3) {
                    }
                }
                return strL1;
            }
        }
        return null;
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(String str, String str2) {
        String strA;
        String strA2;
        if (str2 == null || q.N0(str2)) {
            str2 = null;
        }
        if (str == null || q.N0(str)) {
            str = null;
        }
        if (str2 != null) {
            String string = q.r1(str2).toString();
            int length = string.length();
            if (2 <= length && length < 4) {
                for (int i3 = 0; i3 < string.length(); i3++) {
                    char cCharAt = string.charAt(i3);
                    if (Character.isLetter(cCharAt) && cCharAt < 128) {
                    }
                }
            }
            return str2;
        }
        if (str != null && (strA2 = a(str)) != null) {
            return strA2;
        }
        if (str2 != null && (strA = a(str2)) != null) {
            return strA;
        }
        if (str2 != null) {
            return str2;
        }
        if (b(str) != null) {
            return str;
        }
        return null;
    }
}
