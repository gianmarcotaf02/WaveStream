package Y2;

/* JADX INFO: renamed from: Y2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D0.C0206g f11499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f11500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y2.C1043m f11501f;

    public C1046p(org.json.JSONObject jSONObject) throws org.json.JSONException {
        this.f11496a = jSONObject.optString("basePlanId");
        java.lang.String strOptString = jSONObject.optString("offerId");
        this.f11497b = true == strOptString.isEmpty() ? null : strOptString;
        this.f11498c = jSONObject.getString("offerIdToken");
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        D0.C0206g c0206g = new D0.C0206g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Y2.C1045o(jSONObjectOptJSONObject));
                }
            }
        }
        c0206g.f1884a = arrayList;
        this.f11499d = c0206g;
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        this.f11501f = jSONObjectOptJSONObject2 != null ? new Y2.C1043m(jSONObjectOptJSONObject2) : null;
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getString("productId");
            jSONObjectOptJSONObject3.optString(io.ktor.http.LinkHeader.Parameters.Title);
            jSONObjectOptJSONObject3.optString("name");
            jSONObjectOptJSONObject3.optString("description");
            jSONObjectOptJSONObject3.optString("basePlanId");
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.optString("billingPeriod");
                jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                jSONObjectOptJSONObject4.optString("formattedPrice");
                jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                jSONObjectOptJSONObject4.optInt("recurrenceMode");
                jSONObjectOptJSONObject4.optInt("billingCycleCount");
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i9));
            }
        }
        this.f11500e = arrayList2;
    }
}
