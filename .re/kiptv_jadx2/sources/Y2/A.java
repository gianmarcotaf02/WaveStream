package Y2;

import android.text.TextUtils;
import org.json.JSONObject;

public final class A {

    public final String f11356a;

    public final String f11357b;

    public final String f11358c;

    public final int f11359d;

    public final String f11360e;

    public A(String str) {
        this.f11356a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11357b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f11358c = strOptString;
        this.f11359d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f11360e = jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return TextUtils.equals(this.f11356a, ((A) obj).f11356a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11356a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f11357b);
        sb.append("', productType='");
        sb.append(this.f11358c);
        sb.append("', statusCode=");
        return Y6.f.k(sb, this.f11359d, "}");
    }
}
