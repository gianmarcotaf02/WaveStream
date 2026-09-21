package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0000\u001a4\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u0002H\u0015\u0012\u0006\u0012\u0004\u0018\u0001H\u00160\u0014\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0016*\u0010\u0012\u0004\u0012\u0002H\u0015\u0012\u0006\u0012\u0004\u0018\u0001H\u00160\u0014H\u0000\u001a(\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00180\u0014\"\u0004\b\u0000\u0010\u0018*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0019"}, d2 = {"copy", "Lorg/json/JSONObject;", "deep", "", "getDate", "Ljava/util/Date;", "jsonKey", "", "getNullableInt", "", "name", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getNullableString", "optDate", "optNullableInt", "optNullableLong", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "optNullableString", "replaceJsonNullWithKotlinNull", "", "K", "V", "toMap", "T", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JSONObjectExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.JSONObjectExtensionsKt$toMap$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "jsonKey", "Lh6/k;", "invoke", "(Ljava/lang/String;)Lh6/k;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ boolean $deep;
        final /* synthetic */ org.json.JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z6, org.json.JSONObject jSONObject) {
            super(1);
            this.$deep = z6;
            this.$this_toMap = jSONObject;
        }

        @Override // p194x6.j
        public final p070h6.k invoke(java.lang.String str) throws org.json.JSONException {
            if (!this.$deep) {
                return new p070h6.k(str, this.$this_toMap.get(str));
            }
            java.lang.Object list = this.$this_toMap.get(str);
            if (list instanceof org.json.JSONObject) {
                list = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap((org.json.JSONObject) list, true);
            } else if (list instanceof org.json.JSONArray) {
                list = com.revenuecat.purchases.utils.JSONArrayExtensionsKt.toList((org.json.JSONArray) list);
            }
            return new p070h6.k(str, list);
        }
    }

    public static final org.json.JSONObject copy(org.json.JSONObject jSONObject, boolean z6) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        return new org.json.JSONObject(toMap(jSONObject, z6));
    }

    public static /* synthetic */ org.json.JSONObject copy$default(org.json.JSONObject jSONObject, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return copy(jSONObject, z6);
    }

    public static final java.util.Date getDate(org.json.JSONObject jSONObject, java.lang.String jsonKey) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(jsonKey, "jsonKey");
        java.util.Date date = com.revenuecat.purchases.utils.Iso8601Utils.parse(jSONObject.getString(jsonKey));
        kotlin.jvm.internal.m.d(date, "parse(getString(jsonKey))");
        return date;
    }

    public static final java.lang.Integer getNullableInt(org.json.JSONObject jSONObject, java.lang.String name) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return java.lang.Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    public static final java.lang.String getNullableString(org.json.JSONObject jSONObject, java.lang.String name) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final java.util.Date optDate(org.json.JSONObject jSONObject, java.lang.String jsonKey) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(jsonKey, "jsonKey");
        if (jSONObject.isNull(jsonKey)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, jsonKey);
        }
        return null;
    }

    public static final java.lang.Integer optNullableInt(org.json.JSONObject jSONObject, java.lang.String name) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableInt(jSONObject, name);
        }
        return null;
    }

    public static final java.lang.Long optNullableLong(org.json.JSONObject jSONObject, java.lang.String name) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        if (!jSONObject.has(name) || jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return java.lang.Long.valueOf(jSONObject.getLong(name));
        }
        return null;
    }

    public static final java.lang.String optNullableString(org.json.JSONObject jSONObject, java.lang.String name) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, name);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<K, V> replaceJsonNullWithKotlinNull(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof java.util.Map) {
                kotlin.jvm.internal.m.c(value, "null cannot be cast to non-null type kotlin.collections.Map<K of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull, V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull?>");
                value = replaceJsonNullWithKotlinNull((java.util.Map) value);
            } else if (value instanceof java.util.List) {
                kotlin.jvm.internal.m.c(value, "null cannot be cast to non-null type kotlin.collections.List<V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull?>");
                value = com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull((java.util.List) value);
            } else if (kotlin.jvm.internal.m.a(value, org.json.JSONObject.NULL)) {
                value = null;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final <T> java.util.Map<java.lang.String, T> toMap(org.json.JSONObject jSONObject, boolean z6) {
        kotlin.jvm.internal.m.e(jSONObject, "<this>");
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.m.d(itKeys, "this.keys()");
        return p078i6.C.W0(N7.o.p0(N7.o.g0(itKeys), new com.revenuecat.purchases.utils.JSONObjectExtensionsKt.AnonymousClass1(z6, jSONObject)));
    }

    public static /* synthetic */ java.util.Map toMap$default(org.json.JSONObject jSONObject, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return toMap(jSONObject, z6);
    }
}
