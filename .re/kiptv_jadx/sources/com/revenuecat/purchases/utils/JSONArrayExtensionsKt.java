package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001H\u0000\u001a\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"replaceJsonNullWithKotlinNull", "", "T", "toList", "Lorg/json/JSONArray;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JSONArrayExtensionsKt {
    public static final <T> java.util.List<T> replaceJsonNullWithKotlinNull(java.util.List<? extends T> list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        for (T t9 : list) {
            if (t9 instanceof java.util.Map) {
                kotlin.jvm.internal.m.c(t9, "null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull?>");
                t9 = (T) com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((java.util.Map) t9);
            } else if (t9 instanceof java.util.List) {
                kotlin.jvm.internal.m.c(t9, "null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull?>");
                t9 = (T) replaceJsonNullWithKotlinNull((java.util.List) t9);
            } else if (kotlin.jvm.internal.m.a(t9, org.json.JSONObject.NULL)) {
                t9 = (T) null;
            }
            arrayList.add(t9);
        }
        return arrayList;
    }

    public static final <T> java.util.List<T> toList(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.m.e(jSONArray, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            java.lang.Object list = jSONArray.get(i3);
            if (list instanceof org.json.JSONObject) {
                list = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap((org.json.JSONObject) list, true);
            } else if (list instanceof org.json.JSONArray) {
                list = toList((org.json.JSONArray) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
