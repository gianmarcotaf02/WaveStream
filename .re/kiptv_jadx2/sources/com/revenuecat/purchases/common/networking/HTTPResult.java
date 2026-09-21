package com.revenuecat.purchases.common.networking;

import I3.b;
import O7.q;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.D;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.BackendHelperKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import io.sentry.protocol.Request;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p070h6.h;
import p121o0.p;
import v5.L;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0080\b\u0018\u0000 C2\u00020\u0001:\u0003CDEBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010!JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b\r\u0010!R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b\u000e\u0010!R\u0017\u00106\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010&R\u001b\u0010<\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0015R\u0019\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010A\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010&¨\u0006F"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult;", "", "", "responseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "payload", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "origin", "Ljava/util/Date;", "requestDate", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "", "isLoadShedderResponse", "isFallbackURL", "<init>", "(ILcom/revenuecat/purchases/common/networking/HTTPResult$Payload;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)V", "", "(ILjava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)V", "Lorg/json/JSONObject;", "parseBody", "()Lorg/json/JSONObject;", "component1", "()I", "component2", "()Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "component3", "()Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "component4", "()Ljava/util/Date;", "component5", "()Lcom/revenuecat/purchases/VerificationResult;", "component6", "()Z", "component7", "copy", "(ILcom/revenuecat/purchases/common/networking/HTTPResult$Payload;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "toString", "()Ljava/lang/String;", "hashCode", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "I", "getResponseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "getPayload", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "getOrigin", "Ljava/util/Date;", "getRequestDate", "Lcom/revenuecat/purchases/VerificationResult;", "getVerificationResult", "Z", "payloadText", "Ljava/lang/String;", "getPayloadText", "body$delegate", "Lh6/h;", "getBody", TtmlNode.TAG_BODY, "backendErrorCode", "Ljava/lang/Integer;", "getBackendErrorCode", "()Ljava/lang/Integer;", "backendErrorMessage", "getBackendErrorMessage", "Companion", "Origin", "Payload", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HTTPResult {
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String LOAD_SHEDDER_HEADER_NAME = "x-revenuecat-fortress";
    public static final String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final String SIGNATURE_HEADER_NAME = "X-Signature";
    private final Integer backendErrorCode;
    private final String backendErrorMessage;

    private final h body;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final Origin origin;
    private final Payload payload;
    private final String payloadText;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "", "(Ljava/lang/String;I)V", "BACKEND", "CACHE", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Origin {
        BACKEND,
        CACHE
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "", "text", "", "getText", "()Ljava/lang/String;", "RCFormat", "Text", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$RCFormat;", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$Text;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Payload {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class DefaultImpls {
            @Deprecated
            public static String getText(Payload payload) {
                return Payload.super.getText();
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$RCFormat;", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "bytes", "", "([B)V", "getBytes", "()[B", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class RCFormat implements Payload {
            private final byte[] bytes;

            public RCFormat(byte[] bytes) {
                m.e(bytes, "bytes");
                this.bytes = bytes;
            }

            public boolean equals(Object other) {
                if (this != other) {
                    return (other instanceof RCFormat) && Arrays.equals(this.bytes, ((RCFormat) other).bytes);
                }
                return true;
            }

            public final byte[] getBytes() {
                return this.bytes;
            }

            public int hashCode() {
                return Arrays.hashCode(this.bytes);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$Text;", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Text implements Payload {
            private final String value;

            public Text(String value) {
                m.e(value, "value");
                this.value = value;
            }

            public static Text copy$default(Text text, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = text.value;
                }
                return text.copy(str);
            }

            public final String getValue() {
                return this.value;
            }

            public final Text copy(String value) {
                m.e(value, "value");
                return new Text(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && m.a(this.value, ((Text) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.l(new StringBuilder("Text(value="), this.value, ')');
            }
        }

        default String getText() {
            if (this instanceof Text) {
                return ((Text) this).getValue();
            }
            if (this instanceof RCFormat) {
                return "";
            }
            throw new b();
        }
    }

    public HTTPResult(int i3, Payload payload, Origin origin, Date date, VerificationResult verificationResult, boolean z6, boolean z9) {
        Integer numValueOf;
        m.e(payload, "payload");
        m.e(origin, "origin");
        m.e(verificationResult, "verificationResult");
        this.responseCode = i3;
        this.payload = payload;
        this.origin = origin;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        this.isLoadShedderResponse = z6;
        this.isFallbackURL = z9;
        this.payloadText = payload.getText();
        this.body = D.B(new HTTPResult$body$2(this));
        String str = null;
        if (!BackendHelperKt.isSuccessful(this)) {
            int iOptInt = getBody().optInt("code");
            numValueOf = iOptInt <= 0 ? null : Integer.valueOf(iOptInt);
        }
        this.backendErrorCode = numValueOf;
        if (!BackendHelperKt.isSuccessful(this)) {
            String it = getBody().optString("message");
            m.d(it, "it");
            if (!q.N0(it)) {
                str = it;
            }
        }
        this.backendErrorMessage = str;
    }

    public static HTTPResult copy$default(HTTPResult hTTPResult, int i3, Payload payload, Origin origin, Date date, VerificationResult verificationResult, boolean z6, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = hTTPResult.responseCode;
        }
        if ((i9 & 2) != 0) {
            payload = hTTPResult.payload;
        }
        if ((i9 & 4) != 0) {
            origin = hTTPResult.origin;
        }
        if ((i9 & 8) != 0) {
            date = hTTPResult.requestDate;
        }
        if ((i9 & 16) != 0) {
            verificationResult = hTTPResult.verificationResult;
        }
        if ((i9 & 32) != 0) {
            z6 = hTTPResult.isLoadShedderResponse;
        }
        if ((i9 & 64) != 0) {
            z9 = hTTPResult.isFallbackURL;
        }
        boolean z10 = z6;
        boolean z11 = z9;
        VerificationResult verificationResult2 = verificationResult;
        Origin origin2 = origin;
        return hTTPResult.copy(i3, payload, origin2, date, verificationResult2, z10, z11);
    }

    public final JSONObject parseBody() {
        String str = this.payloadText;
        JSONObject jSONObject = null;
        if (q.N0(str)) {
            str = null;
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e6) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to parse payload as JSON: ".concat(str), e6);
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        return new JSONObject();
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final Origin getOrigin() {
        return this.origin;
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

    public final HTTPResult copy(int responseCode, Payload payload, Origin origin, Date requestDate, VerificationResult verificationResult, boolean isLoadShedderResponse, boolean isFallbackURL) {
        m.e(payload, "payload");
        m.e(origin, "origin");
        m.e(verificationResult, "verificationResult");
        return new HTTPResult(responseCode, payload, origin, requestDate, verificationResult, isLoadShedderResponse, isFallbackURL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) other;
        return this.responseCode == hTTPResult.responseCode && m.a(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && m.a(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult && this.isLoadShedderResponse == hTTPResult.isLoadShedderResponse && this.isFallbackURL == hTTPResult.isFallbackURL;
    }

    public final Integer getBackendErrorCode() {
        return this.backendErrorCode;
    }

    public final String getBackendErrorMessage() {
        return this.backendErrorMessage;
    }

    public final JSONObject getBody() {
        return (JSONObject) this.body.getValue();
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final String getPayloadText() {
        return this.payloadText;
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
        int iHashCode = (this.origin.hashCode() + ((this.payload.hashCode() + (Integer.hashCode(this.responseCode) * 31)) * 31)) * 31;
        Date date = this.requestDate;
        return Boolean.hashCode(this.isFallbackURL) + p.f((this.verificationResult.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.isLoadShedderResponse);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HTTPResult(responseCode=");
        sb.append(this.responseCode);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", requestDate=");
        sb.append(this.requestDate);
        sb.append(", verificationResult=");
        sb.append(this.verificationResult);
        sb.append(", isLoadShedderResponse=");
        sb.append(this.isLoadShedderResponse);
        sb.append(", isFallbackURL=");
        return L.a(sb, this.isFallbackURL, ')');
    }

    public HTTPResult(int i3, String payload, Origin origin, Date date, VerificationResult verificationResult, boolean z6, boolean z9) {
        this(i3, new Payload.Text(payload), origin, date, verificationResult, z6, z9);
        m.e(payload, "payload");
        m.e(origin, "origin");
        m.e(verificationResult, "verificationResult");
    }
}
