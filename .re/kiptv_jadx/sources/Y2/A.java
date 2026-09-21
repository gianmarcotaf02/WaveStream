package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f11360e;

    public A(java.lang.String str) {
        this.f11356a = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.f11357b = jSONObject.optString("productId");
        java.lang.String strOptString = jSONObject.optString("type");
        this.f11358c = strOptString;
        this.f11359d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (android.text.TextUtils.isEmpty(strOptString)) {
            throw new java.lang.IllegalArgumentException("Product type cannot be empty.");
        }
        this.f11360e = jSONObject.optString("serializedDocid");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y2.A) {
            return android.text.TextUtils.equals(this.f11356a, ((Y2.A) obj).f11356a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11356a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f11357b);
        sb.append("', productType='");
        sb.append(this.f11358c);
        sb.append("', statusCode=");
        return Y6.f.k(sb, this.f11359d, "}");
    }
}
