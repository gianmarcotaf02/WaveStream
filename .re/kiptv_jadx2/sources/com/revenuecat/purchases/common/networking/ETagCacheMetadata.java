package com.revenuecat.purchases.common.networking;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import io.sentry.protocol.Request;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p121o0.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0001.BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0014JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020)J\t\u0010-\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata;", "", "eTagData", "Lcom/revenuecat/purchases/common/networking/ETagData;", ETagCacheMetadata.SERIALIZATION_NAME_RESPONSE_CODE, "", ETagCacheMetadata.SERIALIZATION_NAME_REQUEST_DATE, "Ljava/util/Date;", ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT, "Lcom/revenuecat/purchases/VerificationResult;", ETagCacheMetadata.SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, "", ETagCacheMetadata.SERIALIZATION_NAME_IS_FALLBACK_URL, ETagCacheMetadata.SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES, "", "(Lcom/revenuecat/purchases/common/networking/ETagData;ILjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZLjava/lang/Long;)V", "getETagData", "()Lcom/revenuecat/purchases/common/networking/ETagData;", "()Z", "getPayloadSizeBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRequestDate", "()Ljava/util/Date;", "getResponseCode", "()I", "getVerificationResult", "()Lcom/revenuecat/purchases/VerificationResult;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/revenuecat/purchases/common/networking/ETagData;ILjava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZLjava/lang/Long;)Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata;", "equals", Request.JsonKeys.OTHER, "hashCode", "serialize", "", "toHTTPResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "payload", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ETagCacheMetadata {

    public static final Companion INSTANCE = new Companion(null);
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_IS_FALLBACK_URL = "isFallbackURL";
    private static final String SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE = "isLoadShedderResponse";
    private static final String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private static final String SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES = "payloadSizeBytes";
    private static final String SERIALIZATION_NAME_REQUEST_DATE = "requestDate";
    private static final String SERIALIZATION_NAME_RESPONSE_CODE = "responseCode";
    private static final String SERIALIZATION_NAME_VERIFICATION_RESULT = "verificationResult";
    private final ETagData eTagData;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final Long payloadSizeBytes;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata$Companion;", "", "()V", "SERIALIZATION_NAME_ETAG", "", "SERIALIZATION_NAME_IS_FALLBACK_URL", "SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE", "SERIALIZATION_NAME_LAST_REFRESH_TIME", "SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES", "SERIALIZATION_NAME_REQUEST_DATE", "SERIALIZATION_NAME_RESPONSE_CODE", "SERIALIZATION_NAME_VERIFICATION_RESULT", "deserialize", "Lcom/revenuecat/purchases/common/networking/ETagCacheMetadata;", "serialized", "fromResult", "result", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "eTagData", "Lcom/revenuecat/purchases/common/networking/ETagData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final ETagCacheMetadata deserialize(String serialized) {
            VerificationResult verificationResultValueOf;
            m.e(serialized, "serialized");
            try {
                JSONObject jSONObject = new JSONObject(serialized);
                Long lValueOf = Long.valueOf(jSONObject.optLong(ETagCacheMetadata.SERIALIZATION_NAME_LAST_REFRESH_TIME, -1L));
                if (lValueOf.longValue() == -1) {
                    lValueOf = null;
                }
                Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
                Long lValueOf2 = Long.valueOf(jSONObject.optLong(ETagCacheMetadata.SERIALIZATION_NAME_REQUEST_DATE, -1L));
                if (lValueOf2.longValue() == -1) {
                    lValueOf2 = null;
                }
                Date date2 = lValueOf2 != null ? new Date(lValueOf2.longValue()) : null;
                if (jSONObject.has(ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT)) {
                    String string = jSONObject.getString(ETagCacheMetadata.SERIALIZATION_NAME_VERIFICATION_RESULT);
                    m.d(string, "jsonObject.getString(SER…NAME_VERIFICATION_RESULT)");
                    verificationResultValueOf = VerificationResult.valueOf(string);
                } else {
                    verificationResultValueOf = VerificationResult.NOT_REQUESTED;
                }
                VerificationResult verificationResult = verificationResultValueOf;
                String string2 = jSONObject.getString(ETagCacheMetadata.SERIALIZATION_NAME_ETAG);
                m.d(string2, "jsonObject.getString(SERIALIZATION_NAME_ETAG)");
                return new ETagCacheMetadata(new ETagData(string2, date), jSONObject.getInt(ETagCacheMetadata.SERIALIZATION_NAME_RESPONSE_CODE), date2, verificationResult, jSONObject.optBoolean(ETagCacheMetadata.SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, false), jSONObject.optBoolean(ETagCacheMetadata.SERIALIZATION_NAME_IS_FALLBACK_URL, false), JSONObjectExtensionsKt.optNullableLong(jSONObject, ETagCacheMetadata.SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES));
            } catch (IllegalArgumentException | JSONException unused) {
                return null;
            }
        }

        public final ETagCacheMetadata fromResult(HTTPResult result, ETagData eTagData) {
            m.e(result, "result");
            m.e(eTagData, "eTagData");
            return new ETagCacheMetadata(eTagData, result.getResponseCode(), result.getRequestDate(), result.getVerificationResult(), result.isLoadShedderResponse(), result.isFallbackURL(), null, 64, null);
        }

        private Companion() {
        }
    }

    public ETagCacheMetadata(ETagData eTagData, int i3, Date date, VerificationResult verificationResult, boolean z6, boolean z9, Long l2) {
        m.e(eTagData, "eTagData");
        m.e(verificationResult, "verificationResult");
        this.eTagData = eTagData;
        this.responseCode = i3;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        this.isLoadShedderResponse = z6;
        this.isFallbackURL = z9;
        this.payloadSizeBytes = l2;
    }

    public static ETagCacheMetadata copy$default(ETagCacheMetadata eTagCacheMetadata, ETagData eTagData, int i3, Date date, VerificationResult verificationResult, boolean z6, boolean z9, Long l2, int i9, Object obj) {
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
        Long l9 = l2;
        boolean z11 = z6;
        Date date2 = date;
        return eTagCacheMetadata.copy(eTagData, i3, date2, verificationResult, z11, z10, l9);
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public final boolean getIsLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public final boolean getIsFallbackURL() {
        return this.isFallbackURL;
    }

    public final Long getPayloadSizeBytes() {
        return this.payloadSizeBytes;
    }

    public final ETagCacheMetadata copy(ETagData eTagData, int responseCode, Date requestDate, VerificationResult verificationResult, boolean isLoadShedderResponse, boolean isFallbackURL, Long payloadSizeBytes) {
        m.e(eTagData, "eTagData");
        m.e(verificationResult, "verificationResult");
        return new ETagCacheMetadata(eTagData, responseCode, requestDate, verificationResult, isLoadShedderResponse, isFallbackURL, payloadSizeBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ETagCacheMetadata)) {
            return false;
        }
        ETagCacheMetadata eTagCacheMetadata = (ETagCacheMetadata) other;
        return m.a(this.eTagData, eTagCacheMetadata.eTagData) && this.responseCode == eTagCacheMetadata.responseCode && m.a(this.requestDate, eTagCacheMetadata.requestDate) && this.verificationResult == eTagCacheMetadata.verificationResult && this.isLoadShedderResponse == eTagCacheMetadata.isLoadShedderResponse && this.isFallbackURL == eTagCacheMetadata.isFallbackURL && m.a(this.payloadSizeBytes, eTagCacheMetadata.payloadSizeBytes);
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final Long getPayloadSizeBytes() {
        return this.payloadSizeBytes;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int iD = p.d(this.responseCode, this.eTagData.hashCode() * 31, 31);
        Date date = this.requestDate;
        int iF = p.f(p.f((this.verificationResult.hashCode() + ((iD + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.isLoadShedderResponse), 31, this.isFallbackURL);
        Long l2 = this.payloadSizeBytes;
        return iF + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SERIALIZATION_NAME_ETAG, this.eTagData.getETag());
        Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put(SERIALIZATION_NAME_LAST_REFRESH_TIME, lastRefreshTime.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_RESPONSE_CODE, this.responseCode);
        Date date = this.requestDate;
        if (date != null) {
            jSONObject.put(SERIALIZATION_NAME_REQUEST_DATE, date.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_VERIFICATION_RESULT, this.verificationResult.name());
        jSONObject.put(SERIALIZATION_NAME_IS_LOAD_SHEDDER_RESPONSE, this.isLoadShedderResponse);
        jSONObject.put(SERIALIZATION_NAME_IS_FALLBACK_URL, this.isFallbackURL);
        Long l2 = this.payloadSizeBytes;
        if (l2 != null) {
            jSONObject.put(SERIALIZATION_NAME_PAYLOAD_SIZE_BYTES, l2.longValue());
        }
        String string = jSONObject.toString();
        m.d(string, "JSONObject().apply {\n   …t) }\n        }.toString()");
        return string;
    }

    public final HTTPResult toHTTPResult(String payload) {
        m.e(payload, "payload");
        return new HTTPResult(this.responseCode, payload, HTTPResult.Origin.CACHE, this.requestDate, this.verificationResult, this.isLoadShedderResponse, this.isFallbackURL);
    }

    public String toString() {
        return "ETagCacheMetadata(eTagData=" + this.eTagData + ", responseCode=" + this.responseCode + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ", isLoadShedderResponse=" + this.isLoadShedderResponse + ", isFallbackURL=" + this.isFallbackURL + ", payloadSizeBytes=" + this.payloadSizeBytes + ')';
    }

    public ETagCacheMetadata(ETagData eTagData, int i3, Date date, VerificationResult verificationResult, boolean z6, boolean z9, Long l2, int i9, AbstractC2541f abstractC2541f) {
        this(eTagData, i3, date, verificationResult, z6, z9, (i9 & 64) != 0 ? null : l2);
    }
}
