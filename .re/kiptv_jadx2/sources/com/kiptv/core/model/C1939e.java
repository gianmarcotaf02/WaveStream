package com.kiptv.core.model;

import com.google.android.gms.internal.play_billing.M0;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class C1939e {
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1941f a(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str3, String str4, String str5, List list, List list2, ArrayList arrayList4, List list3, Integer num, Long l2, Long l9, String str6, String str7, boolean z6) {
        String str8;
        ArrayList arrayList5;
        List list4;
        String strO1;
        ArrayList arrayList6 = new ArrayList();
        String string = str != null ? O7.q.r1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() != 0) {
            switch (string.hashCode()) {
                case -1814410959:
                    break;
                case -1080415444:
                    if (string.equals("Rumored")) {
                        str8 = "rumored";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case -845738348:
                    if (string.equals("In Production")) {
                        str8 = "inProduction";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case -486654627:
                    if (string.equals("Released")) {
                        str8 = "released";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case -58529607:
                    break;
                case 67099290:
                    if (string.equals("Ended")) {
                        str8 = "ended";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case 77117080:
                    if (string.equals("Pilot")) {
                        str8 = "pilot";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case 553361465:
                    if (string.equals("Post Production")) {
                        str8 = "postProduction";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case 1170766244:
                    if (string.equals("Planned")) {
                        str8 = "planned";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
                case 1499086309:
                    if (string.equals("Returning Series")) {
                        str8 = "returningSeries";
                        string = p015b5.u.a("detail.info.statusValue.".concat(str8));
                    }
                    break;
            }
        } else {
            string = null;
        }
        if (string != null) {
            M0.w(p015b5.u.a("detail.info.status"), string, arrayList6);
        }
        List listJ1 = p078i6.o.J1(e(arrayList), 3);
        List list5 = !listJ1.isEmpty() ? listJ1 : null;
        if (list5 != null) {
            M0.w(p015b5.u.a(str2), p078i6.o.o1(list5, ", ", null, null, null, 62), arrayList6);
        }
        List listJ2 = p078i6.o.J1(e(arrayList2), 3);
        List list6 = !listJ2.isEmpty() ? listJ2 : null;
        if (list6 != null) {
            M0.w(p015b5.u.a("detail.info.screenplay"), p078i6.o.o1(list6, ", ", null, null, null, 62), arrayList6);
        }
        List listJ3 = p078i6.o.J1(e(arrayList3), 3);
        List list7 = !listJ3.isEmpty() ? listJ3 : null;
        if (list7 != null) {
            M0.w(p015b5.u.a("detail.info.music"), p078i6.o.o1(list7, ", ", null, null, null, 62), arrayList6);
        }
        String string2 = str4 != null ? O7.q.r1(str4).toString() : null;
        String string3 = O7.q.r1(str3).toString();
        if (string2 != null && string2.length() != 0 && !string2.equalsIgnoreCase(string3)) {
            M0.w(p015b5.u.a("detail.info.originalTitle"), string2, arrayList6);
        }
        String string4 = str5 != null ? O7.q.r1(str5).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        int i3 = 0;
        if (string4.length() == 0) {
            string4 = null;
        } else {
            Locale locale = new Locale(string4);
            p015b5.t.Companion.getClass();
            String displayLanguage = locale.getDisplayLanguage(p015b5.p.a());
            if (displayLanguage.length() != 0) {
                string4 = displayLanguage;
            }
            if (string4.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(string4.charAt(0));
                kotlin.jvm.internal.m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                sb.append((Object) upperCase);
                String strSubstring = string4.substring(1);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                string4 = sb.toString();
            }
        }
        if (string4 != null) {
            M0.w(p015b5.u.a("detail.info.originalLanguage"), string4, arrayList6);
        }
        if (list.isEmpty()) {
            arrayList5 = e(list2);
            list4 = p078i6.w.f23205h;
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : list) {
                TMDBCountry tMDBCountry = (TMDBCountry) obj;
                if (tMDBCountry.f20141a.length() > 0) {
                    String lowerCase = tMDBCountry.f20141a.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    if (hashSet.add(lowerCase)) {
                        arrayList7.add(obj);
                    }
                }
            }
            arrayList5 = new ArrayList(p078i6.q.I0(arrayList7, 10));
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                arrayList5.add(((TMDBCountry) it.next()).f20141a);
            }
            ArrayList arrayList8 = new ArrayList(p078i6.q.I0(arrayList7, 10));
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                arrayList8.add(((TMDBCountry) it2.next()).f20142b);
            }
            list4 = arrayList8;
        }
        if (arrayList5.isEmpty()) {
            strO1 = null;
        } else {
            ArrayList arrayList9 = new ArrayList(p078i6.q.I0(arrayList5, 10));
            for (Object obj2 : arrayList5) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                String str9 = (String) obj2;
                Locale locale2 = new Locale("", str9);
                p015b5.t.Companion.getClass();
                String displayCountry = locale2.getDisplayCountry(p015b5.p.a());
                kotlin.jvm.internal.m.b(displayCountry);
                if (displayCountry.length() <= 0 || displayCountry.equalsIgnoreCase(str9)) {
                    String str10 = (String) p078i6.o.k1(i3, list4);
                    if (str10 != null) {
                        str9 = str10;
                    }
                } else {
                    str9 = displayCountry;
                }
                arrayList9.add(str9);
                i3 = i9;
            }
            strO1 = p078i6.o.o1(arrayList9, ", ", null, null, null, 62);
        }
        if (strO1 != null) {
            M0.w(p015b5.u.a("detail.info.country"), strO1, arrayList6);
        }
        List listJ4 = p078i6.o.J1(e(list3), 3);
        List list8 = !listJ4.isEmpty() ? listJ4 : null;
        if (list8 != null) {
            M0.w(p015b5.u.a("detail.info.network"), p078i6.o.o1(list8, ", ", null, null, null, 62), arrayList6);
        }
        if (num != null) {
            Integer num2 = num.intValue() > 0 ? num : null;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                String strA = p015b5.u.a("detail.info.episodes");
                p015b5.t.Companion.getClass();
                M0.w(strA, NumberFormat.getInstance(p015b5.p.a()).format(Integer.valueOf(iIntValue)), arrayList6);
            }
        }
        String strD = d(str6);
        if (strD == null) {
            strD = null;
        } else if (z6) {
            strD = p121o0.p.p(strD, " – ", p015b5.u.a("detail.info.ongoing"));
        } else {
            String strD2 = d(str7);
            if (strD2 != null && !kotlin.jvm.internal.m.a(str7, str6)) {
                strD = p121o0.p.p(strD, " – ", strD2);
            }
        }
        if (strD != null) {
            M0.w(p015b5.u.a("detail.info.airingPeriod"), strD, arrayList6);
        }
        List listJ5 = p078i6.o.J1(e(arrayList4), 4);
        List list9 = !listJ5.isEmpty() ? listJ5 : null;
        if (list9 != null) {
            M0.w(p015b5.u.a("detail.info.production"), p078i6.o.o1(list9, ", ", null, null, null, 62), arrayList6);
        }
        String strC = c(l2);
        if (strC != null) {
            M0.w(p015b5.u.a("detail.info.budget"), strC, arrayList6);
        }
        String strC2 = c(l9);
        if (strC2 != null) {
            M0.w(p015b5.u.a("detail.info.revenue"), strC2, arrayList6);
        }
        if (arrayList6.isEmpty()) {
            return null;
        }
        return new C1941f(arrayList6);
    }

    public static ArrayList b(List list, Set set) {
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((TMDBCrewMember) obj).f20151c;
            if (str != null && set.contains(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p078i6.q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TMDBCrewMember) it.next()).f20150b);
        }
        return arrayList2;
    }

    public static String c(Long l2) {
        Object objT;
        if (l2 == null) {
            return null;
        }
        if (l2.longValue() <= 0) {
            l2 = null;
        }
        if (l2 == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
            currencyInstance.setCurrency(Currency.getInstance("USD"));
            objT = currencyInstance.format(jLongValue);
        } catch (Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        return (String) (objT instanceof p070h6.m ? null : objT);
    }

    public static String d(String str) {
        Object objT;
        String string = str != null ? O7.q.r1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            simpleDateFormat.setLenient(false);
            Date date = simpleDateFormat.parse(string);
            if (date != null) {
                p015b5.t.Companion.getClass();
                objT = DateFormat.getDateInstance(2, p015b5.p.a()).format(date);
            } else {
                objT = null;
            }
        } catch (Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        return (String) (objT instanceof p070h6.m ? null : objT);
    }

    public static ArrayList e(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = O7.q.r1((String) it.next()).toString();
            if (string.length() > 0) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                if (hashSet.add(lowerCase)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }
}
