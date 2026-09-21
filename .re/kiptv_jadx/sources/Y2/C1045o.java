package Y2;

/* JADX INFO: renamed from: Y2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11495f;

    public C1045o(org.json.JSONObject jSONObject) {
        this.f11493d = jSONObject.optString("billingPeriod");
        this.f11492c = jSONObject.optString("priceCurrencyCode");
        this.f11490a = jSONObject.optString("formattedPrice");
        this.f11491b = jSONObject.optLong("priceAmountMicros");
        this.f11495f = jSONObject.optInt("recurrenceMode");
        this.f11494e = jSONObject.optInt("billingCycleCount");
    }
}
