package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f23650a = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j$.time.format.y f23651b = new j$.time.format.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.format.A f23652c = new j$.time.format.A();

    public java.lang.String c(j$.time.temporal.q qVar, long j, j$.time.format.F f9, java.util.Locale locale) {
        java.lang.Object objA = a(qVar, locale);
        if (objA instanceof j$.time.format.z) {
            return ((j$.time.format.z) objA).a(j, f9);
        }
        return null;
    }

    public java.lang.String b(j$.time.chrono.l lVar, j$.time.temporal.q qVar, long j, j$.time.format.F f9, java.util.Locale locale) {
        if (lVar == j$.time.chrono.s.f23629c || !(qVar instanceof j$.time.temporal.a)) {
            return c(qVar, j, f9, locale);
        }
        return null;
    }

    public java.util.Iterator e(j$.time.temporal.q qVar, j$.time.format.F f9, java.util.Locale locale) {
        java.util.List list;
        java.lang.Object objA = a(qVar, locale);
        if (!(objA instanceof j$.time.format.z) || (list = (java.util.List) ((j$.time.format.z) objA).f23750b.get(f9)) == null) {
            return null;
        }
        return list.iterator();
    }

    public java.util.Iterator d(j$.time.chrono.l lVar, j$.time.temporal.q qVar, j$.time.format.F f9, java.util.Locale locale) {
        if (lVar == j$.time.chrono.s.f23629c || !(qVar instanceof j$.time.temporal.a)) {
            return e(qVar, f9, locale);
        }
        return null;
    }

    public static java.lang.Object a(j$.time.temporal.q qVar, java.util.Locale locale) {
        java.lang.Object zVar;
        java.lang.String strSubstring;
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new java.util.AbstractMap.SimpleImmutableEntry(qVar, locale);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f23650a;
        java.lang.Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (qVar == j$.time.temporal.a.ERA) {
            java.text.DateFormatSymbols dateFormatSymbols = java.text.DateFormatSymbols.getInstance(locale);
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            java.lang.String[] eras = dateFormatSymbols.getEras();
            for (int i3 = 0; i3 < eras.length; i3++) {
                if (!eras[i3].isEmpty()) {
                    long j = i3;
                    map2.put(java.lang.Long.valueOf(j), eras[i3]);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    java.lang.String str = eras[i3];
                    map3.put(lValueOf, str.substring(0, java.lang.Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(j$.time.format.F.FULL, map2);
                map.put(j$.time.format.F.SHORT, map2);
                map.put(j$.time.format.F.NARROW, map3);
            }
            zVar = new j$.time.format.z(map);
        } else {
            long j9 = 1;
            if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = java.text.DateFormatSymbols.getInstance(locale).getMonths().length;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (long j10 = 1; j10 <= length; j10++) {
                    java.lang.String strB = j$.time.c.b(j10, "LLLL", locale);
                    linkedHashMap.put(java.lang.Long.valueOf(j10), strB);
                    linkedHashMap2.put(java.lang.Long.valueOf(j10), strB.substring(0, java.lang.Character.charCount(strB.codePointAt(0))));
                    linkedHashMap3.put(java.lang.Long.valueOf(j10), j$.time.c.b(j10, "LLL", locale));
                }
                if (length > 0) {
                    map.put(j$.time.format.F.FULL_STANDALONE, linkedHashMap);
                    map.put(j$.time.format.F.NARROW_STANDALONE, linkedHashMap2);
                    map.put(j$.time.format.F.SHORT_STANDALONE, linkedHashMap3);
                    map.put(j$.time.format.F.FULL, linkedHashMap);
                    map.put(j$.time.format.F.NARROW, linkedHashMap2);
                    map.put(j$.time.format.F.SHORT, linkedHashMap3);
                }
                zVar = new j$.time.format.z(map);
            } else if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = java.text.DateFormatSymbols.getInstance(locale).getWeekdays().length;
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
                boolean z6 = locale == java.util.Locale.SIMPLIFIED_CHINESE || locale == java.util.Locale.TRADITIONAL_CHINESE;
                long j11 = 1;
                while (j11 <= length2) {
                    java.lang.String strA = j$.time.c.a(j11, "cccc", locale);
                    linkedHashMap4.put(java.lang.Long.valueOf(j11), strA);
                    java.lang.Long lValueOf2 = java.lang.Long.valueOf(j11);
                    if (!z6) {
                        strSubstring = strA.substring(0, java.lang.Character.charCount(strA.codePointAt(0)));
                    } else {
                        strSubstring = new java.lang.StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(java.lang.Long.valueOf(j11), j$.time.c.a(j11, "ccc", locale));
                    j11 += j9;
                    j9 = j9;
                }
                if (length2 > 0) {
                    map.put(j$.time.format.F.FULL_STANDALONE, linkedHashMap4);
                    map.put(j$.time.format.F.NARROW_STANDALONE, linkedHashMap5);
                    map.put(j$.time.format.F.SHORT_STANDALONE, linkedHashMap6);
                    map.put(j$.time.format.F.FULL, linkedHashMap4);
                    map.put(j$.time.format.F.NARROW, linkedHashMap5);
                    map.put(j$.time.format.F.SHORT, linkedHashMap6);
                }
                zVar = new j$.time.format.z(map);
            } else if (qVar == j$.time.temporal.a.AMPM_OF_DAY) {
                java.text.DateFormatSymbols dateFormatSymbols2 = java.text.DateFormatSymbols.getInstance(locale);
                java.util.HashMap map4 = new java.util.HashMap();
                java.util.HashMap map5 = new java.util.HashMap();
                java.lang.String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i9 = 0; i9 < amPmStrings.length; i9++) {
                    if (!amPmStrings[i9].isEmpty()) {
                        long j12 = i9;
                        map4.put(java.lang.Long.valueOf(j12), amPmStrings[i9]);
                        java.lang.Long lValueOf3 = java.lang.Long.valueOf(j12);
                        java.lang.String str2 = amPmStrings[i9];
                        map5.put(lValueOf3, str2.substring(0, java.lang.Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(j$.time.format.F.FULL, map4);
                    map.put(j$.time.format.F.SHORT, map4);
                    map.put(j$.time.format.F.NARROW, map5);
                }
                zVar = new j$.time.format.z(map);
            } else {
                zVar = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, zVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
