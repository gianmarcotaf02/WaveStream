package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0014JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020)J\t\u0010-\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata;", "", "eTagData", "Lcom/revenuecat/purchases/common/networking/ETagData;", com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_RESPONSE_CODE, "", com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_REQUEST_DATE, "Ljava/util/Date;", com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT, "Lcom/revenuecat/purchases/VerificationResult;", com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, "", com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_IS_FALLBACK_URL, com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES, "", "(Lcom/revenuecat/purchases/common/networking/ETagData;ILjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZLjava/lang/Long;)V", "getETagData", "()Lcom/revenuecat/purchases/common/networking/ETagData;", "()Z", "getPayloadSizeBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRequestDate", "()Ljava/util/Date;", "getResponseCode", "()I", "getVerificationResult", "()Lcom/revenuecat/purchases/VerificationResult;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/revenuecat/purchases/common/networking/ETagData;ILjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZLjava/lang/Long;)Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata;", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "serialize", "", "toHTTPResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "payload", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class ETagCacheMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.networking.ETagCacheMetadata.Companion INSTANCE = new com.revenuecat.purchases.common.networking.ETagCacheMetadata.Companion(null);
    private static final java.lang.String SERIALIZATION_NAME_ETAG = "eTag";
    private static final java.lang.String SERIALIZATION_NAME_IS_FALLBACK_URL = "isFallbackURL";
    private static final java.lang.String SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE = "isLoadShedderResponse";
    private static final java.lang.String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private static final java.lang.String SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES = "payloadSizeBytes";
    private static final java.lang.String SERIALIZATION_NAME_REQUEST_DATE = "requestDate";
    private static final java.lang.String SERIALIZATION_NAME_RESPONSE_CODE = "responseCode";
    private static final java.lang.String SERIALIZATION_NAME_VERIFICATION_RESULT = "verificationResult";
    private final com.revenuecat.purchases.common.networking.ETagData eTagData;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final java.lang.Long payloadSizeBytes;
    private final java.util.Date requestDate;
    private final int responseCode;
    private final com.revenuecat.purchases.VerificationResult verificationResult;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata$Companion;", "", "()V", "SERIALIZATION_NAME_ETAG", "", "SERIALIZATION_NAME_IS_FALLBACK_URL", "SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE", "SERIALIZATION_NAME_LAST_REFRESH_TIME", "SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES", "SERIALIZATION_NAME_REQUEST_DATE", "SERIALIZATION_NAME_RESPONSE_CODE", "SERIALIZATION_NAME_VERIFICATION_RESULT", "deserialize", "Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata;", "serialized", "fromResult", "result", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "eTagData", "Lcom/revenuecat/purchases/common/networking/ETagData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.common.networking.ETagCacheMetadata deserialize(java.lang.String serialized) {
            com.revenuecat.purchases.VerificationResult verificationResultValueOf;
            kotlin.jvm.internal.m.e(serialized, "serialized");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(serialized);
                java.lang.Long lValueOf = java.lang.Long.valueOf(jSONObject.optLong(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_LAST_REFRESH_TIME, -1L));
                if (lValueOf.longValue() == -1) {
                    lValueOf = null;
                }
                java.util.Date date = lValueOf != null ? new java.util.Date(lValueOf.longValue()) : null;
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(jSONObject.optLong(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_REQUEST_DATE, -1L));
                if (lValueOf2.longValue() == -1) {
                    lValueOf2 = null;
                }
                java.util.Date date2 = lValueOf2 != null ? new java.util.Date(lValueOf2.longValue()) : null;
                if (jSONObject.has(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT)) {
                    java.lang.String string = jSONObject.getString(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT);
                    kotlin.jvm.internal.m.d(string, "jsonObject.getString(SER…NAME_VERIFICATION_RESULT)");
                    verificationResultValueOf = com.revenuecat.purchases.VerificationResult.valueOf(string);
                } else {
                    verificationResultValueOf = com.revenuecat.purchases.VerificationResult.NOT_REQUESTED;
                }
                com.revenuecat.purchases.VerificationResult verificationResult = verificationResultValueOf;
                java.lang.String string2 = jSONObject.getString(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_ETAG);
                kotlin.jvm.internal.m.d(string2, "jsonObject.getString(SERIALIZATION_NAME_ETAG)");
                return new com.revenuecat.purchases.common.networking.ETagCacheMetadata(new com.revenuecat.purchases.common.networking.ETagData(string2, date), jSONObject.getInt(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_RESPONSE_CODE), date2, verificationResult, jSONObject.optBoolean(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, false), jSONObject.optBoolean(com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_IS_FALLBACK_URL, false), com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableLong(jSONObject, com.revenuecat.purchases.common.networking.ETagCacheMetadata.SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES));
            } catch (java.lang.IllegalArgumentException | org.json.JSONException unused) {
                return null;
            }
        }

        public final com.revenuecat.purchases.common.networking.ETagCacheMetadata fromResult(com.revenuecat.purchases.common.networking.HTTPResult result, com.revenuecat.purchases.common.networking.ETagData eTagData) {
            kotlin.jvm.internal.m.e(result, "result");
            kotlin.jvm.internal.m.e(eTagData, "eTagData");
            return new com.revenuecat.purchases.common.networking.ETagCacheMetadata(eTagData, result.getResponseCode(), result.getRequestDate(), result.getVerificationResult(), result.isLoadShedderResponse(), result.isFallbackURL(), null, 64, null);
        }

        private Companion() {
        }
    }

    public ETagCacheMetadata(com.revenuecat.purchases.common.networking.ETagData eTagData, int i3, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, boolean z6, boolean z9, java.lang.Long l2) {
        kotlin.jvm.internal.m.e(eTagData, "eTagData");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
        this.eTagData = eTagData;
        this.responseCode = i3;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        this.isLoadShedderResponse = z6;
        this.isFallbackURL = z9;
        this.payloadSizeBytes = l2;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.networking.ETagCacheMetadata copy$default(com.revenuecat.purchases.common.networking.ETagCacheMetadata eTagCacheMetadata, com.revenuecat.purchases.common.networking.ETagData eTagData, int i3, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, boolean z6, boolean z9, java.lang.Long l2, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            eTagData = eTagCacheMetadata.eTagData;
        }
        if ((i9 & 2) != 0) {
            i3 = eTagCacheMetadata.responseCode;
        }
        if ((i9 & 4) != 0) {
            date = eTagCacheMetadata.requestDate;
        }
        if ((i9 & 8) != 0) {
            verificationResult = eTagCacheMetadata.verificationResult;
        }
        if ((i9 & 16) != 0) {
            z6 = eTagCacheMetadata.isLoadShedderResponse;
        }
        if ((i9 & 32) != 0) {
            z9 = eTagCacheMetadata.isFallbackURL;
        }
        if ((i9 & 64) != 0) {
            l2 = eTagCacheMetadata.payloadSizeBytes;
        }
        boolean z10 = z9;
        java.lang.Long l9 = l2;
        boolean z11 = z6;
        java.util.Date date2 = date;
        return eTagCacheMetadata.copy(eTagData, i3, date2, verificationResult, z11, z10, l9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.common.networking.ETagData getETagData() {
        return this.eTagData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.util.Date getRequestDate() {
        return this.requestDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFallbackURL() {
        return this.isFallbackURL;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.Long getPayloadSizeBytes() {
        return this.payloadSizeBytes;
    }

    public final com.revenuecat.purchases.common.networking.ETagCacheMetadata copy(com.revenuecat.purchases.common.networking.ETagData eTagData, int responseCode, java.util.Date requestDate, com.revenuecat.purchases.VerificationResult verificationResult, boolean isLoadShedderResponse, boolean isFallbackURL, java.lang.Long payloadSizeBytes) {
        kotlin.jvm.internal.m.e(eTagData, "eTagData");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
        return new com.revenuecat.purchases.common.networking.ETagCacheMetadata(eTagData, responseCode, requestDate, verificationResult, isLoadShedderResponse, isFallbackURL, payloadSizeBytes);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.ETagCacheMetadata)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.ETagCacheMetadata eTagCacheMetadata = (com.revenuecat.purchases.common.networking.ETagCacheMetadata) other;
        return kotlin.jvm.internal.m.a(this.eTagData, eTagCacheMetadata.eTagData) && this.responseCode == eTagCacheMetadata.responseCode && kotlin.jvm.internal.m.a(this.requestDate, eTagCacheMetadata.requestDate) && this.verificationResult == eTagCacheMetadata.verificationResult && this.isLoadShedderResponse == eTagCacheMetadata.isLoadShedderResponse && this.isFallbackURL == eTagCacheMetadata.isFallbackURL && kotlin.jvm.internal.m.a(this.payloadSizeBytes, eTagCacheMetadata.payloadSizeBytes);
    }

    public final com.revenuecat.purchases.common.networking.ETagData getETagData() {
        return this.eTagData;
    }

    public final java.lang.Long getPayloadSizeBytes() {
        return this.payloadSizeBytes;
    }

    public final java.util.Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final com.revenuecat.purchases.VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int iD = p121o0.p.d(this.responseCode, this.eTagData.hashCode() * 31, 31);
        java.util.Date date = this.requestDate;
        int iF = p121o0.p.f(p121o0.p.f((this.verificationResult.hashCode() + ((iD + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.isLoadShedderResponse), 31, this.isFallbackURL);
        java.lang.Long l2 = this.payloadSizeBytes;
        return iF + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public final java.lang.String serialize() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(SERIALIZATION_NAME_ETAG, this.eTagData.getETag());
        java.util.Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put(SERIALIZATION_NAME_LAST_REFRESH_TIME, lastRefreshTime.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_RESPONSE_CODE, this.responseCode);
        java.util.Date date = this.requestDate;
        if (date != null) {
            jSONObject.put(SERIALIZATION_NAME_REQUEST_DATE, date.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_VERIFICATION_RESULT, this.verificationResult.name());
        jSONObject.put(SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, this.isLoadShedderResponse);
        jSONObject.put(SERIALIZATION_NAME_IS_FALLBACK_URL, this.isFallbackURL);
        java.lang.Long l2 = this.payloadSizeBytes;
        if (l2 != null) {
            jSONObject.put(SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES, l2.longValue());
        }
        java.lang.String string = jSONObject.toString();
        kotlin.jvm.internal.m.d(string, "JSONObject().apply {\n   …t) }\n        }.toString()");
        return string;
    }

    public final com.revenuecat.purchases.common.networking.HTTPResult toHTTPResult(java.lang.String payload) {
        kotlin.jvm.internal.m.e(payload, "payload");
        return new com.revenuecat.purchases.common.networking.HTTPResult(this.responseCode, payload, com.revenuecat.purchases.common.networking.HTTPResult.Origin.CACHE, this.requestDate, this.verificationResult, this.isLoadShedderResponse, this.isFallbackURL);
    }

    public java.lang.String toString() {
        return "ETagCacheMetadata(eTagData=" + this.eTagData + ", responseCode=" + this.responseCode + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ", isLoadShedderResponse=" + this.isLoadShedderResponse + ", isFallbackURL=" + this.isFallbackURL + ", payloadSizeBytes=" + this.payloadSizeBytes + ')';
    }

    public /* synthetic */ ETagCacheMetadata(com.revenuecat.purchases.common.networking.ETagData eTagData, int i3, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, boolean z6, boolean z9, java.lang.Long l2, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(eTagData, i3, date, verificationResult, z6, z9, (i9 & 64) != 0 ? null : l2);
    }
}
