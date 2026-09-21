package j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public class A {

    public static final ConcurrentHashMap f23650a = new ConcurrentHashMap(16, 0.75f, 2);

    public static final y f23651b = new y();

    public static final A f23652c = new A();

    public String c(j$.time.temporal.q qVar, long j, F f9, Locale locale) {
        Object objA = a(qVar, locale);
        if (objA instanceof z) {
            return ((z) objA).a(j, f9);
        }
        return null;
    }

    public String b(j$.time.chrono.l lVar, j$.time.temporal.q qVar, long j, F f9, Locale locale) {
        if (lVar == j$.time.chrono.s.f23629c || !(qVar instanceof j$.time.temporal.a)) {
            return c(qVar, j, f9, locale);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.q qVar, F f9, Locale locale) {
        List list;
        Object objA = a(qVar, locale);
        if (!(objA instanceof z) || (list = (List) ((z) objA).f23750b.get(f9)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(j$.time.chrono.l lVar, j$.time.temporal.q qVar, F f9, Locale locale) {
        if (lVar == j$.time.chrono.s.f23629c || !(qVar instanceof j$.time.temporal.a)) {
            return e(qVar, f9, locale);
        }
        return null;
    }

    public static Object a(j$.time.temporal.q qVar, Locale locale) {
        Object zVar;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(qVar, locale);
        ConcurrentHashMap concurrentHashMap = f23650a;
        Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (qVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i3 = 0; i3 < eras.length; i3++) {
                if (!eras[i3].isEmpty()) {
                    long j = i3;
                    map2.put(Long.valueOf(j), eras[i3]);
                    Long lValueOf = Long.valueOf(j);
                    String str = eras[i3];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(F.FULL, map2);
                map.put(F.SHORT, map2);
                map.put(F.NARROW, map3);
            }
            zVar = new z(map);
        } else {
            long j9 = 1;
            if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j10 = 1; j10 <= length; j10++) {
                    String strB = j$.time.c.b(j10, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j10), strB);
                    linkedHashMap2.put(Long.valueOf(j10), strB.substring(0, Character.charCount(strB.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j10), j$.time.c.b(j10, "LLL", locale));
                }
                if (length > 0) {
                    map.put(F.FULL_STANDALONE, linkedHashMap);
                    map.put(F.NARROW_STANDALONE, linkedHashMap2);
                    map.put(F.SHORT_STANDALONE, linkedHashMap3);
                    map.put(F.FULL, linkedHashMap);
                    map.put(F.NARROW, linkedHashMap2);
                    map.put(F.SHORT, linkedHashMap3);
                }
                zVar = new z(map);
            } else if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z6 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j11 = 1;
                while (j11 <= length2) {
                    String strA = j$.time.c.a(j11, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j11), strA);
                    Long lValueOf2 = Long.valueOf(j11);
                    if (!z6) {
                        strSubstring = strA.substring(0, Character.charCount(strA.codePointAt(0)));
                    } else {
                        strSubstring = new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(Long.valueOf(j11), j$.time.c.a(j11, "ccc", locale));
                    j11 += j9;
                    j9 = j9;
                }
                if (length2 > 0) {
                    map.put(F.FULL_STANDALONE, linkedHashMap4);
                    map.put(F.NARROW_STANDALONE, linkedHashMap5);
                    map.put(F.SHORT_STANDALONE, linkedHashMap6);
                    map.put(F.FULL, linkedHashMap4);
                    map.put(F.NARROW, linkedHashMap5);
                    map.put(F.SHORT, linkedHashMap6);
                }
                zVar = new z(map);
            } else if (qVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i9 = 0; i9 < amPmStrings.length; i9++) {
                    if (!amPmStrings[i9].isEmpty()) {
                        long j12 = i9;
                        map4.put(Long.valueOf(j12), amPmStrings[i9]);
                        Long lValueOf3 = Long.valueOf(j12);
                        String str2 = amPmStrings[i9];
                        map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(F.FULL, map4);
                    map.put(F.SHORT, map4);
                    map.put(F.NARROW, map5);
                }
                zVar = new z(map);
            } else {
                zVar = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, zVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
