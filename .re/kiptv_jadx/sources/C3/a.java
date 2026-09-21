package C3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B3.C0089b f886a = new B3.C0089b("MetadataUtils", null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.String f888c;

    static {
        java.lang.String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f887b = strArr;
        f888c = "yyyyMMdd'T'HHmmss".concat(java.lang.String.valueOf(strArr[0]));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static java.util.Calendar a(java.lang.String str) {
        java.lang.String strSubstring;
        int iIndexOf;
        int i3;
        java.lang.String strSubstring2;
        char cCharAt;
        java.lang.String[] strArr;
        int length;
        java.lang.String str2;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
        B3.C0089b c0089b = f886a;
        if (zIsEmpty) {
            c0089b.b("Input string is empty or null", new java.lang.Object[0]);
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            c0089b.b("Input string is empty or null", new java.lang.Object[0]);
        } else {
            try {
                strSubstring = str.substring(0, 8);
            } catch (java.lang.IndexOutOfBoundsException e6) {
                android.util.Log.e(c0089b.f617a, c0089b.d("Error extracting the date", new java.lang.Object[0]), e6);
                strSubstring = null;
            }
            if (android.text.TextUtils.isEmpty(strSubstring)) {
                c0089b.b("Invalid date format", new java.lang.Object[0]);
                return null;
            }
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    c0089b.b("string is empty or null", new java.lang.Object[0]);
                } else {
                    iIndexOf = str.indexOf(84);
                    i3 = iIndexOf + 1;
                    if (iIndexOf != 8) {
                        try {
                            strSubstring2 = str.substring(i3);
                            if (strSubstring2.length() != 6) {
                                cCharAt = strSubstring2.charAt(6);
                                strArr = f887b;
                                if (cCharAt != '+' || cCharAt == '-') {
                                    length = strSubstring2.length();
                                    if (length != strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (cCharAt == 'Z' && strSubstring2.length() == strArr[0].length() + 6) {
                                    strSubstring2 = java.lang.String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 1)).concat("+0000");
                                }
                            }
                        } catch (java.lang.IndexOutOfBoundsException e9) {
                            android.util.Log.e(c0089b.f617a, c0089b.d("Error extracting the time substring: %s", new java.lang.Object[0]), e9);
                        }
                        if (android.text.TextUtils.isEmpty(strSubstring2)) {
                            str2 = "yyyyMMdd";
                        } else {
                            strSubstring = p121o0.p.p(strSubstring, "T", strSubstring2);
                            if (strSubstring2.length() == 6) {
                                str2 = "yyyyMMdd'T'HHmmss";
                            } else {
                                str2 = f888c;
                            }
                        }
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.setTime(new java.text.SimpleDateFormat(str2).parse(strSubstring));
                        return calendar;
                    }
                    c0089b.b("T delimeter is not found", new java.lang.Object[0]);
                }
                calendar.setTime(new java.text.SimpleDateFormat(str2).parse(strSubstring));
                return calendar;
            } catch (java.text.ParseException e10) {
                android.util.Log.e(c0089b.f617a, c0089b.d("Error parsing string", new java.lang.Object[0]), e10);
                return null;
            }
            strSubstring2 = null;
            if (android.text.TextUtils.isEmpty(strSubstring2)) {
                strSubstring = p121o0.p.p(strSubstring, "T", strSubstring2);
                if (strSubstring2.length() == 6) {
                    str2 = "yyyyMMdd'T'HHmmss";
                } else {
                    str2 = f888c;
                }
            } else {
                str2 = "yyyyMMdd";
            }
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        }
        strSubstring = null;
        if (android.text.TextUtils.isEmpty(strSubstring)) {
            c0089b.b("Invalid date format", new java.lang.Object[0]);
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            c0089b.b("string is empty or null", new java.lang.Object[0]);
        } else {
            iIndexOf = str.indexOf(84);
            i3 = iIndexOf + 1;
            if (iIndexOf != 8) {
                strSubstring2 = str.substring(i3);
                if (strSubstring2.length() != 6) {
                    cCharAt = strSubstring2.charAt(6);
                    strArr = f887b;
                    if (cCharAt != '+') {
                        length = strSubstring2.length();
                        if (length != strArr[1].length() + 6) {
                        }
                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    } else {
                        length = strSubstring2.length();
                        if (length != strArr[1].length() + 6) {
                        }
                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    }
                }
                if (android.text.TextUtils.isEmpty(strSubstring2)) {
                    strSubstring = p121o0.p.p(strSubstring, "T", strSubstring2);
                    if (strSubstring2.length() == 6) {
                        str2 = "yyyyMMdd'T'HHmmss";
                    } else {
                        str2 = f888c;
                    }
                } else {
                    str2 = "yyyyMMdd";
                }
                java.util.Calendar calendar3 = java.util.Calendar.getInstance();
                calendar3.setTime(new java.text.SimpleDateFormat(str2).parse(strSubstring));
                return calendar3;
            }
            c0089b.b("T delimeter is not found", new java.lang.Object[0]);
        }
        strSubstring2 = null;
        if (android.text.TextUtils.isEmpty(strSubstring2)) {
            strSubstring = p121o0.p.p(strSubstring, "T", strSubstring2);
            if (strSubstring2.length() == 6) {
                str2 = "yyyyMMdd'T'HHmmss";
            } else {
                str2 = f888c;
            }
        } else {
            str2 = "yyyyMMdd";
        }
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        calendar4.setTime(new java.text.SimpleDateFormat(str2).parse(strSubstring));
        return calendar4;
    }

    public static org.json.JSONArray b(java.util.ArrayList arrayList) {
        arrayList.getClass();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            G3.a aVar = (G3.a) it.next();
            aVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(io.sentry.protocol.Request.JsonKeys.URL, aVar.f3785i.toString());
                jSONObject.put("width", aVar.j);
                jSONObject.put("height", aVar.f3786k);
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(java.util.ArrayList arrayList, org.json.JSONArray jSONArray) {
        try {
            arrayList.clear();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    arrayList.add(new G3.a(jSONArray.getJSONObject(i3)));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        } catch (org.json.JSONException unused2) {
        }
    }
}
