package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1939e {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r10.equals("Canceled") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009d, code lost:
    
        if (r10.equals("Cancelled") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a0, code lost:
    
        r10 = "canceled";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.kiptv.core.model.C1941f a(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.util.List list2, java.util.ArrayList arrayList4, java.util.List list3, java.lang.Integer num, java.lang.Long l2, java.lang.Long l9, java.lang.String str6, java.lang.String str7, boolean z6) {
        java.lang.String str8;
        java.util.ArrayList arrayList5;
        java.util.List list4;
        java.lang.String strO1;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.String string = str != null ? O7.q.r1(str).toString() : null;
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
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.status"), string, arrayList6);
        }
        java.util.List listJ1 = p078i6.o.J1(e(arrayList), 3);
        java.util.List list5 = !listJ1.isEmpty() ? listJ1 : null;
        if (list5 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a(str2), p078i6.o.o1(list5, ", ", null, null, null, 62), arrayList6);
        }
        java.util.List listJ2 = p078i6.o.J1(e(arrayList2), 3);
        java.util.List list6 = !listJ2.isEmpty() ? listJ2 : null;
        if (list6 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.screenplay"), p078i6.o.o1(list6, ", ", null, null, null, 62), arrayList6);
        }
        java.util.List listJ3 = p078i6.o.J1(e(arrayList3), 3);
        java.util.List list7 = !listJ3.isEmpty() ? listJ3 : null;
        if (list7 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.music"), p078i6.o.o1(list7, ", ", null, null, null, 62), arrayList6);
        }
        java.lang.String string2 = str4 != null ? O7.q.r1(str4).toString() : null;
        java.lang.String string3 = O7.q.r1(str3).toString();
        if (string2 != null && string2.length() != 0 && !string2.equalsIgnoreCase(string3)) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.originalTitle"), string2, arrayList6);
        }
        java.lang.String string4 = str5 != null ? O7.q.r1(str5).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        int i3 = 0;
        if (string4.length() == 0) {
            string4 = null;
        } else {
            java.util.Locale locale = new java.util.Locale(string4);
            p015b5.t.Companion.getClass();
            java.lang.String displayLanguage = locale.getDisplayLanguage(p015b5.p.a());
            if (displayLanguage.length() != 0) {
                string4 = displayLanguage;
            }
            if (string4.length() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String strValueOf = java.lang.String.valueOf(string4.charAt(0));
                kotlin.jvm.internal.m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
                java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                sb.append((java.lang.Object) upperCase);
                java.lang.String strSubstring = string4.substring(1);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                string4 = sb.toString();
            }
        }
        if (string4 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.originalLanguage"), string4, arrayList6);
        }
        if (list.isEmpty()) {
            arrayList5 = e(list2);
            list4 = p078i6.w.f23205h;
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.kiptv.core.model.TMDBCountry tMDBCountry = (com.kiptv.core.model.TMDBCountry) obj;
                if (tMDBCountry.f20141a.length() > 0) {
                    java.lang.String lowerCase = tMDBCountry.f20141a.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    if (hashSet.add(lowerCase)) {
                        arrayList7.add(obj);
                    }
                }
            }
            arrayList5 = new java.util.ArrayList(p078i6.q.I0(arrayList7, 10));
            java.util.Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                arrayList5.add(((com.kiptv.core.model.TMDBCountry) it.next()).f20141a);
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList(p078i6.q.I0(arrayList7, 10));
            java.util.Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                arrayList8.add(((com.kiptv.core.model.TMDBCountry) it2.next()).f20142b);
            }
            list4 = arrayList8;
        }
        if (arrayList5.isEmpty()) {
            strO1 = null;
        } else {
            java.util.ArrayList arrayList9 = new java.util.ArrayList(p078i6.q.I0(arrayList5, 10));
            for (java.lang.Object obj2 : arrayList5) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                java.lang.String str9 = (java.lang.String) obj2;
                java.util.Locale locale2 = new java.util.Locale("", str9);
                p015b5.t.Companion.getClass();
                java.lang.String displayCountry = locale2.getDisplayCountry(p015b5.p.a());
                kotlin.jvm.internal.m.b(displayCountry);
                if (displayCountry.length() <= 0 || displayCountry.equalsIgnoreCase(str9)) {
                    java.lang.String str10 = (java.lang.String) p078i6.o.k1(i3, list4);
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
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.country"), strO1, arrayList6);
        }
        java.util.List listJ4 = p078i6.o.J1(e(list3), 3);
        java.util.List list8 = !listJ4.isEmpty() ? listJ4 : null;
        if (list8 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.network"), p078i6.o.o1(list8, ", ", null, null, null, 62), arrayList6);
        }
        if (num != null) {
            java.lang.Integer num2 = num.intValue() > 0 ? num : null;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                java.lang.String strA = p015b5.u.a("detail.info.episodes");
                p015b5.t.Companion.getClass();
                com.google.android.gms.internal.play_billing.M0.w(strA, java.text.NumberFormat.getInstance(p015b5.p.a()).format(java.lang.Integer.valueOf(iIntValue)), arrayList6);
            }
        }
        java.lang.String strD = d(str6);
        if (strD == null) {
            strD = null;
        } else if (z6) {
            strD = p121o0.p.p(strD, " – ", p015b5.u.a("detail.info.ongoing"));
        } else {
            java.lang.String strD2 = d(str7);
            if (strD2 != null && !kotlin.jvm.internal.m.a(str7, str6)) {
                strD = p121o0.p.p(strD, " – ", strD2);
            }
        }
        if (strD != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.airingPeriod"), strD, arrayList6);
        }
        java.util.List listJ5 = p078i6.o.J1(e(arrayList4), 4);
        java.util.List list9 = !listJ5.isEmpty() ? listJ5 : null;
        if (list9 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.production"), p078i6.o.o1(list9, ", ", null, null, null, 62), arrayList6);
        }
        java.lang.String strC = c(l2);
        if (strC != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.budget"), strC, arrayList6);
        }
        java.lang.String strC2 = c(l9);
        if (strC2 != null) {
            com.google.android.gms.internal.play_billing.M0.w(p015b5.u.a("detail.info.revenue"), strC2, arrayList6);
        }
        if (arrayList6.isEmpty()) {
            return null;
        }
        return new com.kiptv.core.model.C1941f(arrayList6);
    }

    public static java.util.ArrayList b(java.util.List list, java.util.Set set) {
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str = ((com.kiptv.core.model.TMDBCrewMember) obj).f20151c;
            if (str != null && set.contains(str)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.kiptv.core.model.TMDBCrewMember) it.next()).f20150b);
        }
        return arrayList2;
    }

    public static java.lang.String c(java.lang.Long l2) {
        java.lang.Object objT;
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
            java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US);
            currencyInstance.setCurrency(java.util.Currency.getInstance("USD"));
            objT = currencyInstance.format(jLongValue);
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        return (java.lang.String) (objT instanceof p070h6.m ? null : objT);
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.Object objT;
        java.lang.String string = str != null ? O7.q.r1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            java.util.Date date = simpleDateFormat.parse(string);
            if (date != null) {
                p015b5.t.Companion.getClass();
                objT = java.text.DateFormat.getDateInstance(2, p015b5.p.a()).format(date);
            } else {
                objT = null;
            }
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        return (java.lang.String) (objT instanceof p070h6.m ? null : objT);
    }

    public static java.util.ArrayList e(java.util.List list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = O7.q.r1((java.lang.String) it.next()).toString();
            if (string.length() > 0) {
                java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                if (hashSet.add(lowerCase)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }
}
