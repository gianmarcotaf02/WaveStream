package com.revenuecat.purchases.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB5\u0012\u0006\u0010\u0002\u001a\u00020\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J=\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u000f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u0006\u0010&\u001a\u00020\rJ\b\u0010'\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "", "value", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "setTime", "Ljava/util/Date;", "isSynced", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;Z)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;Z)V", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "()Z", "getKey", "()Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "getSetTime", "()Ljava/util/Date;", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toBackendMap", "", "toJSONObject", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class SubscriberAttribute {
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final boolean isSynced;
    private final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey key;
    private final java.util.Date setTime;
    private final java.lang.String value;

    public SubscriberAttribute(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey key, java.lang.String str, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date setTime, boolean z6) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(setTime, "setTime");
        this.key = key;
        this.value = str;
        this.dateProvider = dateProvider;
        this.setTime = setTime;
        this.isSynced = z6;
    }

    public static /* synthetic */ com.revenuecat.purchases.subscriberattributes.SubscriberAttribute copy$default(com.revenuecat.purchases.subscriberattributes.SubscriberAttribute subscriberAttribute, com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey subscriberAttributeKey, java.lang.String str, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date date, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            subscriberAttributeKey = subscriberAttribute.key;
        }
        if ((i3 & 2) != 0) {
            str = subscriberAttribute.value;
        }
        if ((i3 & 4) != 0) {
            dateProvider = subscriberAttribute.dateProvider;
        }
        if ((i3 & 8) != 0) {
            date = subscriberAttribute.setTime;
        }
        if ((i3 & 16) != 0) {
            z6 = subscriberAttribute.isSynced;
        }
        boolean z9 = z6;
        com.revenuecat.purchases.common.DateProvider dateProvider2 = dateProvider;
        return subscriberAttribute.copy(subscriberAttributeKey, str, dateProvider2, date, z9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.util.Date getSetTime() {
        return this.setTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSynced() {
        return this.isSynced;
    }

    public final com.revenuecat.purchases.subscriberattributes.SubscriberAttribute copy(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey key, java.lang.String value, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date setTime, boolean isSynced) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(setTime, "setTime");
        return new com.revenuecat.purchases.subscriberattributes.SubscriberAttribute(key, value, dateProvider, setTime, isSynced);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!com.revenuecat.purchases.subscriberattributes.SubscriberAttribute.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttribute");
        com.revenuecat.purchases.subscriberattributes.SubscriberAttribute subscriberAttribute = (com.revenuecat.purchases.subscriberattributes.SubscriberAttribute) other;
        return kotlin.jvm.internal.m.a(this.key, subscriberAttribute.key) && kotlin.jvm.internal.m.a(this.value, subscriberAttribute.value) && kotlin.jvm.internal.m.a(this.setTime, subscriberAttribute.setTime) && this.isSynced == subscriberAttribute.isSynced;
    }

    public final com.revenuecat.purchases.common.DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey getKey() {
        return this.key;
    }

    public final java.util.Date getSetTime() {
        return this.setTime;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        java.lang.String str = this.value;
        return java.lang.Boolean.hashCode(this.isSynced) + ((this.setTime.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isSynced() {
        return this.isSynced;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toBackendMap() {
        return p078i6.C.N0(new p070h6.k("value", this.value), new p070h6.k(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.BACKEND_NAME_TIMESTAMP, java.lang.Long.valueOf(this.setTime.getTime())));
    }

    public final org.json.JSONObject toJSONObject() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, this.key.getBackendKey());
        java.lang.String str = this.value;
        if (str == null || jSONObject.put("value", str) == null) {
            jSONObject.put("value", org.json.JSONObject.NULL);
        }
        jSONObject.put(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_SET_TIME, this.setTime.getTime());
        jSONObject.put(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_IS_SYNCED, this.isSynced);
        return jSONObject;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriberAttribute(key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", setTime=");
        sb.append(this.setTime);
        sb.append(", isSynced=");
        return v5.L.a(sb, this.isSynced, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey subscriberAttributeKey, java.lang.String str, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date date, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        com.revenuecat.purchases.common.DateProvider defaultDateProvider = (i3 & 4) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider;
        this(subscriberAttributeKey, str, defaultDateProvider, (i3 & 8) != 0 ? defaultDateProvider.getNow() : date, (i3 & 16) != 0 ? false : z6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(java.lang.String str, java.lang.String str2, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date date, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        com.revenuecat.purchases.common.DateProvider defaultDateProvider = (i3 & 4) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider;
        this(str, str2, defaultDateProvider, (i3 & 8) != 0 ? defaultDateProvider.getNow() : date, (i3 & 16) != 0 ? false : z6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriberAttribute(java.lang.String key, java.lang.String str, com.revenuecat.purchases.common.DateProvider dateProvider, java.util.Date setTime, boolean z6) {
        this(com.revenuecat.purchases.common.subscriberattributes.SpecialSubscriberAttributesKt.getSubscriberAttributeKey(key), str, (com.revenuecat.purchases.common.DateProvider) null, setTime, z6, 4, (kotlin.jvm.internal.AbstractC2541f) null);
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(setTime, "setTime");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriberAttribute(org.json.JSONObject jsonObject) throws org.json.JSONException {
        kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
        java.lang.String string = jsonObject.getString(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY);
        kotlin.jvm.internal.m.d(string, "jsonObject.getString(JSON_NAME_KEY)");
        this(com.revenuecat.purchases.common.subscriberattributes.SpecialSubscriberAttributesKt.getSubscriberAttributeKey(string), com.revenuecat.purchases.utils.JSONObjectExtensionsKt.getNullableString(jsonObject, "value"), (com.revenuecat.purchases.common.DateProvider) null, new java.util.Date(jsonObject.getLong(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_SET_TIME)), jsonObject.getBoolean(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_IS_SYNCED), 4, (kotlin.jvm.internal.AbstractC2541f) null);
    }
}
