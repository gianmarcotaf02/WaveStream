package com.google.android.gms.internal.play_billing;

import Y2.C1040j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.extractor.MpegAudioUtil;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;

public abstract class AbstractC1872t {

    public static final int f19388a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, String str2, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(int i3, C1040j c1040j) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c1040j.f11477a);
        bundle.putString("DEBUG_MESSAGE", c1040j.f11479c);
        bundle.putInt("LOG_REASON", M0.b(i3));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, X2.e eVar, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, str2, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        C1865p c1865p = r.f19379i;
        Object[] objArr = {"subs", "inapp"};
        P3.e.p0(objArr, 2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(r.r(objArr, 2)));
        Object[] objArr2 = {"inapp"};
        P3.e.p0(objArr2, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(r.r(objArr2, 1)));
        Object[] objArr3 = {"inapp"};
        P3.e.p0(objArr3, 1);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(r.r(objArr3, 1)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (eVar.f10827a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z6 = false;
        boolean z9 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Y2.v vVar = (Y2.v) arrayList.get(i3);
            arrayList2.add(null);
            z6 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z9 |= !TextUtils.isEmpty(null);
            if (vVar.f11514b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z6) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z9) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static C1040j e(String str, Intent intent) {
        if (intent != null) {
            D8.x xVarA = C1040j.a();
            xVarA.f2609i = a(str, intent.getExtras());
            xVarA.f2610k = f(str, intent.getExtras());
            return xVarA.p();
        }
        h("BillingHelper", "Got null intent!");
        D8.x xVarA2 = C1040j.a();
        xVarA2.f2609i = 6;
        xVarA2.f2610k = "An internal error occurred.";
        return xVarA2.p();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i3 = MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            while (!str2.isEmpty() && i3 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i3));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i3 -= iMin;
            }
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e6) {
            h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e6.toString()));
            return null;
        }
    }
}
