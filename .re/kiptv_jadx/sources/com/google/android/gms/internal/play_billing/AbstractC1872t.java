package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1872t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19388a = java.lang.Runtime.getRuntime().availableProcessors();

    public static int a(java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        java.lang.Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static android.os.Bundle c(int i3, Y2.C1040j c1040j) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("RESPONSE_CODE", c1040j.f11477a);
        bundle.putString("DEBUG_MESSAGE", c1040j.f11479c);
        bundle.putInt("LOG_REASON", com.google.android.gms.internal.play_billing.M0.b(i3));
        return bundle;
    }

    public static android.os.Bundle d(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, X2.e eVar, long j) {
        android.os.Bundle bundle = new android.os.Bundle();
        b(bundle, str, str2, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        com.google.android.gms.internal.play_billing.C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
        java.lang.Object[] objArr = {"subs", "inapp"};
        P3.e.p0(objArr, 2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new java.util.ArrayList<>(com.google.android.gms.internal.play_billing.r.r(objArr, 2)));
        java.lang.Object[] objArr2 = {"inapp"};
        P3.e.p0(objArr2, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new java.util.ArrayList<>(com.google.android.gms.internal.play_billing.r.r(objArr2, 1)));
        java.lang.Object[] objArr3 = {"inapp"};
        P3.e.p0(objArr3, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new java.util.ArrayList<>(com.google.android.gms.internal.play_billing.r.r(objArr3, 1)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (eVar.f10827a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
        int size = arrayList.size();
        boolean z6 = false;
        boolean z9 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Y2.v vVar = (Y2.v) arrayList.get(i3);
            arrayList2.add(null);
            z6 |= !android.text.TextUtils.isEmpty(null);
            arrayList4.add(null);
            z9 |= !android.text.TextUtils.isEmpty(null);
            if (vVar.f11514b.equals("first_party")) {
                throw new java.lang.NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z6) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!android.text.TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z9) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static Y2.C1040j e(java.lang.String str, android.content.Intent intent) {
        if (intent != null) {
            D8.x xVarA = Y2.C1040j.a();
            xVarA.f2609i = a(str, intent.getExtras());
            xVarA.f2610k = f(str, intent.getExtras());
            return xVarA.p();
        }
        h("BillingHelper", "Got null intent!");
        D8.x xVarA2 = Y2.C1040j.a();
        xVarA2.f2609i = 6;
        xVarA2.f2610k = "An internal error occurred.";
        return xVarA2.p();
    }

    public static java.lang.String f(java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        java.lang.Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                android.util.Log.v(str, str2);
                return;
            }
            int i3 = androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            while (!str2.isEmpty() && i3 > 0) {
                int iMin = java.lang.Math.min(str2.length(), java.lang.Math.min(4000, i3));
                android.util.Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i3 -= iMin;
            }
        }
    }

    public static void h(java.lang.String str, java.lang.String str2) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        try {
            if (android.util.Log.isLoggable(str, 5)) {
                if (th == null) {
                    android.util.Log.w(str, str2);
                } else {
                    android.util.Log.w(str, str2, th);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static com.android.billingclient.api.Purchase j(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new com.android.billingclient.api.Purchase(str, str2);
        } catch (org.json.JSONException e6) {
            h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e6.toString()));
            return null;
        }
    }
}
