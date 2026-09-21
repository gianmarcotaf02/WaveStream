package M3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        java.util.regex.Pattern.compile("\\\\.");
        java.util.regex.Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        int i3;
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null) {
            try {
                if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
                    if (jSONObject.length() == jSONObject2.length()) {
                        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            java.lang.String next = itKeys.next();
                            if (jSONObject2.has(next)) {
                                H3.q.g(next);
                                if (a(jSONObject.get(next), jSONObject2.get(next))) {
                                }
                            }
                        }
                        return true;
                    }
                } else {
                    if (!(obj instanceof org.json.JSONArray) || !(obj2 instanceof org.json.JSONArray)) {
                        return obj.equals(obj2);
                    }
                    org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                    org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj2;
                    if (jSONArray.length() == jSONArray2.length()) {
                        for (0; i3 < jSONArray.length(); i3 + 1) {
                            i3 = a(jSONArray.get(i3), jSONArray2.get(i3)) ? i3 + 1 : 0;
                        }
                        return true;
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return false;
    }
}
