package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0004\u0018\u00010\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/MapConverter;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "ifSuccess", "tryCast", "(Ljava/lang/Object;Lx6/j;)Ljava/lang/Object;", "", "", "inputMap", "Lorg/json/JSONObject;", "convertToJSON$purchases_defaultsRelease", "(Ljava/util/Map;)Lorg/json/JSONObject;", "convertToJSON", "createJSONObject$purchases_defaultsRelease", "createJSONObject", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MapConverter {
    private final <T> java.lang.Object tryCast(java.lang.Object obj, p194x6.j jVar) {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final org.json.JSONObject convertToJSON$purchases_defaultsRelease(java.util.Map<java.lang.String, ? extends java.lang.Object> inputMap) throws org.json.JSONException {
        kotlin.jvm.internal.m.e(inputMap, "inputMap");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(inputMap.size()));
        java.util.Iterator<T> it = inputMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof java.util.List) {
                java.lang.Iterable iterable = (java.lang.Iterable) value;
                if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                    java.util.Iterator it2 = iterable.iterator();
                    do {
                        if (!it2.hasNext()) {
                            value = new org.json.JSONObject(p078i6.D.J0(new p070h6.k("temp_key", new org.json.JSONArray((java.util.Collection) value)))).getJSONArray("temp_key");
                            break;
                        }
                    } while (it2.next() instanceof java.lang.String);
                } else {
                    value = new org.json.JSONObject(p078i6.D.J0(new p070h6.k("temp_key", new org.json.JSONArray((java.util.Collection) value)))).getJSONArray("temp_key");
                    break;
                    break;
                }
            } else if (value instanceof java.util.Map) {
                value = convertToJSON$purchases_defaultsRelease((java.util.Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsRelease(linkedHashMap);
    }

    public final org.json.JSONObject createJSONObject$purchases_defaultsRelease(java.util.Map<java.lang.String, ? extends java.lang.Object> inputMap) {
        kotlin.jvm.internal.m.e(inputMap, "inputMap");
        return new org.json.JSONObject(inputMap);
    }
}
