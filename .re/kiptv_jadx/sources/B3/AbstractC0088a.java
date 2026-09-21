package B3;

/* JADX INFO: renamed from: B3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f615a = java.util.regex.Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Random f616b = new java.util.Random(android.os.SystemClock.elapsedRealtime());

    public static org.json.JSONObject a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new java.lang.IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new java.lang.IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new java.lang.IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    public static java.util.ArrayList d(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static boolean e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    public static int[] f(java.util.AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        java.util.Iterator it = abstractCollection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((java.lang.Integer) it.next()).intValue();
            i3++;
        }
        return iArr;
    }
}
