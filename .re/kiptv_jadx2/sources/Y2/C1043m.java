package Y2;

import org.json.JSONObject;

public final class C1043m {

    public final int f11482a;

    public final int f11483b;

    public C1043m(JSONObject jSONObject) {
        this.f11482a = jSONObject.getInt("commitmentPaymentsCount");
        this.f11483b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }
}
