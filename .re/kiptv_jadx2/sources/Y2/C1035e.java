package Y2;

import org.json.JSONObject;

public final class C1035e {

    public final String f11461a;

    public C1035e(String str) {
        this.f11461a = new JSONObject(str).optString("countryCode");
    }
}
