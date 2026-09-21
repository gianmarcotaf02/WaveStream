package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0080\b\u0018\u0000 C2\u00020\u0001:\u0003CDEBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010!JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b\r\u0010!R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b\u000e\u0010!R\u0017\u00106\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010&R\u001b\u0010<\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0015R\u0019\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010A\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010&¨\u0006F"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult;", "", "", "responseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "payload", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "origin", "Ljava/util/Date;", "requestDate", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "", "isLoadShedderResponse", "isFallbackURL", "<init>", "(ILcom/revenuecat/purchases/common/networking/HTTPResult$Payload;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)V", "", "(ILjava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)V", "Lorg/json/JSONObject;", "parseBody", "()Lorg/json/JSONObject;", "component1", "()I", "component2", "()Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "component3", "()Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "component4", "()Ljava/util/Date;", "component5", "()Lcom/revenuecat/purchases/VerificationResult;", "component6", "()Z", "component7", "copy", "(ILcom/revenuecat/purchases/common/networking/HTTPResult$Payload;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;ZZ)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "toString", "()Ljava/lang/String;", "hashCode", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "I", "getResponseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "getPayload", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "getOrigin", "Ljava/util/Date;", "getRequestDate", "Lcom/revenuecat/purchases/VerificationResult;", "getVerificationResult", "Z", "payloadText", "Ljava/lang/String;", "getPayloadText", "body$delegate", "Lh6/h;", "getBody", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "backendErrorCode", "Ljava/lang/Integer;", "getBackendErrorCode", "()Ljava/lang/Integer;", "backendErrorMessage", "getBackendErrorMessage", "Companion", "Origin", "Payload", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class HTTPResult {
    public static final java.lang.String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final java.lang.String LOAD_SHEDDER_HEADER_NAME = "x-revenuecat-fortress";
    public static final java.lang.String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final java.lang.String SIGNATURE_HEADER_NAME = "X-Signature";
    private final java.lang.Integer backendErrorCode;
    private final java.lang.String backendErrorMessage;

    /* JADX INFO: renamed from: body$delegate, reason: from kotlin metadata */
    private final p070h6.h body;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final com.revenuecat.purchases.common.networking.HTTPResult.Origin origin;
    private final com.revenuecat.purchases.common.networking.HTTPResult.Payload payload;
    private final java.lang.String payloadText;
    private final java.util.Date requestDate;
    private final int responseCode;
    private final com.revenuecat.purchases.VerificationResult verificationResult;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "", "(Ljava/lang/String;I)V", "BACKEND", "CACHE", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Origin {
        BACKEND,
        CACHE
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "", "text", "", "getText", "()Ljava/lang/String;", "RCFormat", "Text", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$RCFormat;", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$Text;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Payload {

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static java.lang.String getText(com.revenuecat.purchases.common.networking.HTTPResult.Payload payload) {
                return com.revenuecat.purchases.common.networking.HTTPResult.Payload.super.getText();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$RCFormat;", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "bytes", "", "([B)V", "getBytes", "()[B", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class RCFormat implements com.revenuecat.purchases.common.networking.HTTPResult.Payload {
            private final byte[] bytes;

            public RCFormat(byte[] bytes) {
                kotlin.jvm.internal.m.e(bytes, "bytes");
                this.bytes = bytes;
            }

            public boolean equals(java.lang.Object other) {
                if (this != other) {
                    return (other instanceof com.revenuecat.purchases.common.networking.HTTPResult.Payload.RCFormat) && java.util.Arrays.equals(this.bytes, ((com.revenuecat.purchases.common.networking.HTTPResult.Payload.RCFormat) other).bytes);
                }
                return true;
            }

            public final byte[] getBytes() {
                return this.bytes;
            }

            public int hashCode() {
                return java.util.Arrays.hashCode(this.bytes);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload$Text;", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Payload;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final /* data */ class Text implements com.revenuecat.purchases.common.networking.HTTPResult.Payload {
            private final java.lang.String value;

            public Text(java.lang.String value) {
                kotlin.jvm.internal.m.e(value, "value");
                this.value = value;
            }

            public static /* synthetic */ com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text copy$default(com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text text, java.lang.String str, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    str = text.value;
                }
                return text.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.String getValue() {
                return this.value;
            }

            public final com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text copy(java.lang.String value) {
                kotlin.jvm.internal.m.e(value, "value");
                return new com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text(value);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text) && kotlin.jvm.internal.m.a(this.value, ((com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text) other).value);
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public java.lang.String toString() {
                return Y6.f.l(new java.lang.StringBuilder("Text(value="), this.value, ')');
            }
        }

        default java.lang.String getText() {
            if (this instanceof com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text) {
                return ((com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text) this).getValue();
            }
            if (this instanceof com.revenuecat.purchases.common.networking.HTTPResult.Payload.RCFormat) {
                return "";
            }
            throw new I3.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0049  */
    public HTTPResult(int i3, com.revenuecat.purchases.common.networking.HTTPResult.Payload payload, com.revenuecat.purchases.common.networking.HTTPResult.Origin origin, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, boolean z6, boolean z9) {
        java.lang.Integer numValueOf;
        kotlin.jvm.internal.m.e(payload, "payload");
        kotlin.jvm.internal.m.e(origin, "origin");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
        this.responseCode = i3;
        this.payload = payload;
        this.origin = origin;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        this.isLoadShedderResponse = z6;
        this.isFallbackURL = z9;
        this.payloadText = payload.getText();
        this.body = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.common.networking.HTTPResult$body$2(this));
        java.lang.String str = null;
        if (!com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(this)) {
            int iOptInt = getBody().optInt("code");
            numValueOf = iOptInt <= 0 ? null : java.lang.Integer.valueOf(iOptInt);
        }
        this.backendErrorCode = numValueOf;
        if (!com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(this)) {
            java.lang.String it = getBody().optString("message");
            kotlin.jvm.internal.m.d(it, "it");
            if (!O7.q.N0(it)) {
                str = it;
            }
        }
        this.backendErrorMessage = str;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.networking.HTTPResult copy$default(com.revenuecat.purchases.common.networking.HTTPResult hTTPResult, int i3, com.revenuecat.purchases.common.networking.HTTPResult.Payload payload, com.revenuecat.purchases.common.networking.HTTPResult.Origin origin, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, boolean z6, boolean z9, int i9, java.lang.Object obj) {
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
        com.revenuecat.purchases.VerificationResult verificationResult2 = verificationResult;
        com.revenuecat.purchases.common.networking.HTTPResult.Origin origin2 = origin;
        return hTTPResult.copy(i3, payload, origin2, date, verificationResult2, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final org.json.JSONObject parseBody() {
        java.lang.String str = this.payloadText;
        org.json.JSONObject jSONObject = null;
        if (O7.q.N0(str)) {
            str = null;
        }
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException e6) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to parse payload as JSON: ".concat(str), e6);
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        return new org.json.JSONObject();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.networking.HTTPResult.Payload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.common.networking.HTTPResult.Origin getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.util.Date getRequestDate() {
        return this.requestDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.revenuecat.purchases.VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFallbackURL() {
        return this.isFallbackURL;
    }

    public final com.revenuecat.purchases.common.networking.HTTPResult copy(int responseCode, com.revenuecat.purchases.common.networking.HTTPResult.Payload payload, com.revenuecat.purchases.common.networking.HTTPResult.Origin origin, java.util.Date requestDate, com.revenuecat.purchases.VerificationResult verificationResult, boolean isLoadShedderResponse, boolean isFallbackURL) {
        kotlin.jvm.internal.m.e(payload, "payload");
        kotlin.jvm.internal.m.e(origin, "origin");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
        return new com.revenuecat.purchases.common.networking.HTTPResult(responseCode, payload, origin, requestDate, verificationResult, isLoadShedderResponse, isFallbackURL);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.HTTPResult)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.HTTPResult hTTPResult = (com.revenuecat.purchases.common.networking.HTTPResult) other;
        return this.responseCode == hTTPResult.responseCode && kotlin.jvm.internal.m.a(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && kotlin.jvm.internal.m.a(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult && this.isLoadShedderResponse == hTTPResult.isLoadShedderResponse && this.isFallbackURL == hTTPResult.isFallbackURL;
    }

    public final java.lang.Integer getBackendErrorCode() {
        return this.backendErrorCode;
    }

    public final java.lang.String getBackendErrorMessage() {
        return this.backendErrorMessage;
    }

    public final org.json.JSONObject getBody() {
        return (org.json.JSONObject) this.body.getValue();
    }

    public final com.revenuecat.purchases.common.networking.HTTPResult.Origin getOrigin() {
        return this.origin;
    }

    public final com.revenuecat.purchases.common.networking.HTTPResult.Payload getPayload() {
        return this.payload;
    }

    public final java.lang.String getPayloadText() {
        return this.payloadText;
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
        int iHashCode = (this.origin.hashCode() + ((this.payload.hashCode() + (java.lang.Integer.hashCode(this.responseCode) * 31)) * 31)) * 31;
        java.util.Date date = this.requestDate;
        return java.lang.Boolean.hashCode(this.isFallbackURL) + p121o0.p.f((this.verificationResult.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.isLoadShedderResponse);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTPResult(responseCode=");
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
        return v5.L.a(sb, this.isFallbackURL, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HTTPResult(int i3, java.lang.String payload, com.revenuecat.purchases.common.networking.HTTPResult.Origin origin, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, boolean z6, boolean z9) {
        this(i3, new com.revenuecat.purchases.common.networking.HTTPResult.Payload.Text(payload), origin, date, verificationResult, z6, z9);
        kotlin.jvm.internal.m.e(payload, "payload");
        kotlin.jvm.internal.m.e(origin, "origin");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
    }
}
