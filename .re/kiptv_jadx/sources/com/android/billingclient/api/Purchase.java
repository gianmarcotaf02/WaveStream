package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f18568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f18570c;

    public Purchase(java.lang.String str, java.lang.String str2) {
        this.f18568a = str;
        this.f18569b = str2;
        this.f18570c = new org.json.JSONObject(str);
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObject = this.f18570c;
        if (jSONObject.has("productIds")) {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i3));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final java.lang.String b() {
        org.json.JSONObject jSONObject = this.f18570c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.android.billingclient.api.Purchase)) {
            return false;
        }
        com.android.billingclient.api.Purchase purchase = (com.android.billingclient.api.Purchase) obj;
        return android.text.TextUtils.equals(this.f18568a, purchase.f18568a) && android.text.TextUtils.equals(this.f18569b, purchase.f18569b);
    }

    public final int hashCode() {
        return this.f18568a.hashCode();
    }

    public final java.lang.String toString() {
        return "Purchase. Json: ".concat(java.lang.String.valueOf(this.f18568a));
    }
}
