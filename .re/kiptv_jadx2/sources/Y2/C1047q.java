package Y2;

import android.text.TextUtils;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class C1047q {

    public final String f11502a;

    public final JSONObject f11503b;

    public final String f11504c;

    public final String f11505d;

    public final String f11506e;

    public final String f11507f;
    public final String g;

    public final String f11508h;

    public final String f11509i;
    public final ArrayList j;

    public final ArrayList f11510k;

    public C1047q(String str) {
        this.f11502a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11503b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f11504c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f11505d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f11506e = jSONObject.optString(LinkHeader.Parameters.Title);
        this.f11507f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f11508h = jSONObject.optString("skuDetailsToken");
        this.f11509i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                arrayList.add(new C1046p(jSONArrayOptJSONArray.getJSONObject(i3)));
            }
            this.j = arrayList;
        } else {
            this.j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f11503b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f11503b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray2.length(); i9++) {
                arrayList2.add(new C1044n(jSONArrayOptJSONArray2.getJSONObject(i9)));
            }
            this.f11510k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f11510k = null;
        } else {
            arrayList2.add(new C1044n(jSONObjectOptJSONObject));
            this.f11510k = arrayList2;
        }
    }

    public final C1044n a() {
        ArrayList arrayList = this.f11510k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C1044n) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1047q) {
            return TextUtils.equals(this.f11502a, ((C1047q) obj).f11502a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11502a.hashCode();
    }

    public final String toString() {
        String string = this.f11503b.toString();
        String strValueOf = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
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
