package Y2;

import org.json.JSONObject;

public final class C1045o {

    public final String f11490a;

    public final long f11491b;

    public final String f11492c;

    public final String f11493d;

    public final int f11494e;

    public final int f11495f;

    public C1045o(JSONObject jSONObject) {
        this.f11493d = jSONObject.optString("billingPeriod");
        this.f11492c = jSONObject.optString("priceCurrencyCode");
        this.f11490a = jSONObject.optString("formattedPrice");
        this.f11491b = jSONObject.optLong("priceAmountMicros");
        this.f11495f = jSONObject.optInt("recurrenceMode");
        this.f11494e = jSONObject.optInt("billingCycleCount");
    }
}
