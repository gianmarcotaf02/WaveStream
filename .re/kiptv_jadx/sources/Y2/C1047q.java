package Y2;

/* JADX INFO: renamed from: Y2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1047q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f11503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f11506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f11507f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f11508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f11509i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f11510k;

    public C1047q(java.lang.String str) {
        this.f11502a = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.f11503b = jSONObject;
        java.lang.String strOptString = jSONObject.optString("productId");
        this.f11504c = strOptString;
        java.lang.String strOptString2 = jSONObject.optString("type");
        this.f11505d = strOptString2;
        if (android.text.TextUtils.isEmpty(strOptString)) {
            throw new java.lang.IllegalArgumentException("Product id cannot be empty.");
        }
        if (android.text.TextUtils.isEmpty(strOptString2)) {
            throw new java.lang.IllegalArgumentException("Product type cannot be empty.");
        }
        this.f11506e = jSONObject.optString(io.ktor.http.LinkHeader.Parameters.Title);
        this.f11507f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f11508h = jSONObject.optString("skuDetailsToken");
        this.f11509i = jSONObject.optString("serializedDocid");
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                arrayList.add(new Y2.C1046p(jSONArrayOptJSONArray.getJSONObject(i3)));
            }
            this.j = arrayList;
        } else {
            this.j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new java.util.ArrayList() : null;
        }
        org.json.JSONObject jSONObjectOptJSONObject = this.f11503b.optJSONObject("oneTimePurchaseOfferDetails");
        org.json.JSONArray jSONArrayOptJSONArray2 = this.f11503b.optJSONArray("oneTimePurchaseOfferDetailsList");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray2.length(); i9++) {
                arrayList2.add(new Y2.C1044n(jSONArrayOptJSONArray2.getJSONObject(i9)));
            }
            this.f11510k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f11510k = null;
        } else {
            arrayList2.add(new Y2.C1044n(jSONObjectOptJSONObject));
            this.f11510k = arrayList2;
        }
    }

    public final Y2.C1044n a() {
        java.util.ArrayList arrayList = this.f11510k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (Y2.C1044n) arrayList.get(0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y2.C1047q) {
            return android.text.TextUtils.equals(this.f11502a, ((Y2.C1047q) obj).f11502a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11502a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f11503b.toString();
        java.lang.String strValueOf = java.lang.String.valueOf(this.j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductDetails{jsonString='");
        B2.a.x(sb, this.f11502a, "', parsedJson=", string, ", productId='");
        sb.append(this.f11504c);
        sb.append("', productType='");
        sb.append(this.f11505d);
        sb.append("', title='");
        sb.append(this.f11506e);
        sb.append("', productDetailsToken='");
        sb.append(this.f11508h);
        sb.append("', subscriptionOfferDetails=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
