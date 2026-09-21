package Y2;

import D0.C0206g;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class C1046p {

    public final String f11496a;

    public final String f11497b;

    public final String f11498c;

    public final C0206g f11499d;

    public final ArrayList f11500e;

    public final C1043m f11501f;

    public C1046p(JSONObject jSONObject) throws JSONException {
        this.f11496a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f11497b = true == strOptString.isEmpty() ? null : strOptString;
        this.f11498c = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        C0206g c0206g = new C0206g();
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C1045o(jSONObjectOptJSONObject));
                }
            }
        }
        c0206g.f1884a = arrayList;
        this.f11499d = c0206g;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        this.f11501f = jSONObjectOptJSONObject2 != null ? new C1043m(jSONObjectOptJSONObject2) : null;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getString("productId");
            jSONObjectOptJSONObject3.optString(LinkHeader.Parameters.Title);
            jSONObjectOptJSONObject3.optString("name");
            jSONObjectOptJSONObject3.optString("description");
            jSONObjectOptJSONObject3.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.optString("billingPeriod");
                jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                jSONObjectOptJSONObject4.optString("formattedPrice");
                jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                jSONObjectOptJSONObject4.optInt("recurrenceMode");
                jSONObjectOptJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i9));
            }
        }
        this.f11500e = arrayList2;
    }
}
