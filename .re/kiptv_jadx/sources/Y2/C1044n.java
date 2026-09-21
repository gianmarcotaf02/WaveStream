package Y2;

/* JADX INFO: renamed from: Y2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f11488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f11489f;
    public final V1.b g;

    public C1044n(org.json.JSONObject jSONObject) throws org.json.JSONException {
        this.f11484a = jSONObject.optString("formattedPrice");
        this.f11485b = jSONObject.optLong("priceAmountMicros");
        this.f11486c = jSONObject.optString("priceCurrencyCode");
        java.lang.String strOptString = jSONObject.optString("offerIdToken");
        V1.b bVar = null;
        this.f11487d = true == strOptString.isEmpty() ? null : strOptString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        this.f11488e = new java.util.ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                this.f11488e.add(jSONArrayOptJSONArray.getString(i3));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                jSONObjectOptJSONObject.optInt("percentageDiscount");
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("startTimeMillis")) {
                jSONObjectOptJSONObject3.optLong("startTimeMillis");
            }
            if (jSONObjectOptJSONObject3.has("endTimeMillis")) {
                jSONObjectOptJSONObject3.optLong("endTimeMillis");
            }
        }
        org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.getInt("maximumQuantity");
            jSONObjectOptJSONObject4.getInt("remainingQuantity");
        }
        this.f11489f = jSONObject.optString("serializedDocid");
        org.json.JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.getLong("preorderReleaseTimeMillis");
            jSONObjectOptJSONObject5.getLong("preorderPresaleEndTimeMillis");
        }
        org.json.JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject6 != null) {
            jSONObjectOptJSONObject6.getString("rentalPeriod");
            jSONObjectOptJSONObject6.optString("rentalExpirationPeriod").getClass();
        }
        org.json.JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
        if (jSONObjectOptJSONObject7 != null) {
            bVar = new V1.b(5);
            jSONObjectOptJSONObject7.getString("type");
        }
        this.g = bVar;
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        if (jSONArrayOptJSONArray2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i9 = 0; i9 < jSONArrayOptJSONArray2.length(); i9++) {
            org.json.JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray2.optJSONObject(i9);
            if (jSONObjectOptJSONObject8 != null) {
                arrayList.add(new Y2.C1045o(jSONObjectOptJSONObject8));
            }
        }
    }
}
