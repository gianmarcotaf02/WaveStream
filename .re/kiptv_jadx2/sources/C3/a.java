package C3;

import B3.C0089b;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.protocol.Request;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p121o0.p;

public abstract class a {

    public static final C0089b f886a = new C0089b("MetadataUtils", null);

    public static final String[] f887b;

    public static final String f888c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f887b = strArr;
        f888c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static Calendar a(String str) {
        String strSubstring;
        int iIndexOf;
        int i3;
        String strSubstring2;
        char cCharAt;
        String[] strArr;
        int length;
        String str2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C0089b c0089b = f886a;
        if (zIsEmpty) {
            c0089b.b("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            c0089b.b("Input string is empty or null", new Object[0]);
        } else {
            try {
                strSubstring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException e6) {
                Log.e(c0089b.f617a, c0089b.d("Error extracting the date", new Object[0]), e6);
                strSubstring = null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                c0089b.b("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    c0089b.b("string is empty or null", new Object[0]);
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
                                    strSubstring2 = String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 1)).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException e9) {
                            Log.e(c0089b.f617a, c0089b.d("Error extracting the time substring: %s", new Object[0]), e9);
                        }
                        if (TextUtils.isEmpty(strSubstring2)) {
                            str2 = "yyyyMMdd";
                        } else {
                            strSubstring = p.p(strSubstring, "T", strSubstring2);
                            if (strSubstring2.length() == 6) {
                                str2 = "yyyyMMdd'T'HHmmss";
                            } else {
                                str2 = f888c;
                            }
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                        return calendar;
                    }
                    c0089b.b("T delimeter is not found", new Object[0]);
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return calendar;
            } catch (ParseException e10) {
                Log.e(c0089b.f617a, c0089b.d("Error parsing string", new Object[0]), e10);
                return null;
            }
            strSubstring2 = null;
            if (TextUtils.isEmpty(strSubstring2)) {
                strSubstring = p.p(strSubstring, "T", strSubstring2);
                if (strSubstring2.length() == 6) {
                    str2 = "yyyyMMdd'T'HHmmss";
                } else {
                    str2 = f888c;
                }
            } else {
                str2 = "yyyyMMdd";
            }
            Calendar calendar2 = Calendar.getInstance();
        }
        strSubstring = null;
        if (TextUtils.isEmpty(strSubstring)) {
            c0089b.b("Invalid date format", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            c0089b.b("string is empty or null", new Object[0]);
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
                if (TextUtils.isEmpty(strSubstring2)) {
                    strSubstring = p.p(strSubstring, "T", strSubstring2);
                    if (strSubstring2.length() == 6) {
                        str2 = "yyyyMMdd'T'HHmmss";
                    } else {
                        str2 = f888c;
                    }
                } else {
                    str2 = "yyyyMMdd";
                }
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return calendar3;
            }
            c0089b.b("T delimeter is not found", new Object[0]);
        }
        strSubstring2 = null;
        if (TextUtils.isEmpty(strSubstring2)) {
            strSubstring = p.p(strSubstring, "T", strSubstring2);
            if (strSubstring2.length() == 6) {
                str2 = "yyyyMMdd'T'HHmmss";
            } else {
                str2 = f888c;
            }
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTime(new SimpleDateFormat(str2).parse(strSubstring));
        return calendar4;
    }

    public static JSONArray b(ArrayList arrayList) {
        arrayList.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            G3.a aVar = (G3.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Request.JsonKeys.URL, aVar.f3785i.toString());
                jSONObject.put("width", aVar.j);
                jSONObject.put("height", aVar.f3786k);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(ArrayList arrayList, JSONArray jSONArray) {
        try {
            arrayList.clear();
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    arrayList.add(new G3.a(jSONArray.getJSONObject(i3)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
