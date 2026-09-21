package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0012\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\bH&R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n\u0082\u0001\u0012+,-./0123456789:;<¨\u0006="}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint;", "", "pathTemplate", "", "name", "fallbackPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "expectsRCFormatResponse", "", "getExpectsRCFormatResponse", "()Z", "getFallbackPath", "()Ljava/lang/String;", "getName", "needsNonceToPerformSigning", "getNeedsNonceToPerformSigning", "getPathTemplate", "supportsFallbackBaseURLs", "getSupportsFallbackBaseURLs", "supportsSignatureVerification", "getSupportsSignatureVerification", "usesAPISources", "getUsesAPISources", "getPath", "useFallback", "AliasUsers", "GetAmazonReceipt", "GetCustomerCenterConfig", "GetCustomerInfo", "GetOfferings", "GetProductEntitlementMapping", "GetRemoteConfig", "GetRemoteConfigFallback", "GetRewardVerification", "GetVirtualCurrencies", "LogIn", "PostAttributes", "PostCreateSupportTicket", "PostDiagnostics", "PostEvents", "PostReceipt", "PostRedeemWebPurchase", "WebBillingGetProducts", "Lcom/revenuecat/purchases/common/networking/Endpoint$AliasUsers;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetAmazonReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerCenterConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerInfo;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetOfferings;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetProductEntitlementMapping;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfigFallback;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetRewardVerification;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetVirtualCurrencies;", "Lcom/revenuecat/purchases/common/networking/Endpoint$LogIn;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostAttributes;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostCreateSupportTicket;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostDiagnostics;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostEvents;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostRedeemWebPurchase;", "Lcom/revenuecat/purchases/common/networking/Endpoint$WebBillingGetProducts;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class Endpoint {
    private final boolean expectsRCFormatResponse;
    private final java.lang.String fallbackPath;
    private final java.lang.String name;
    private final java.lang.String pathTemplate;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$AliasUsers;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class AliasUsers extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AliasUsers(java.lang.String userId) {
            super("/v1/subscribers/%s/alias", "alias_users", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.AliasUsers copy$default(com.revenuecat.purchases.common.networking.Endpoint.AliasUsers aliasUsers, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = aliasUsers.userId;
            }
            return aliasUsers.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.AliasUsers copy(java.lang.String userId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            return new com.revenuecat.purchases.common.networking.Endpoint.AliasUsers(userId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.AliasUsers) && kotlin.jvm.internal.m.a(this.userId, ((com.revenuecat.purchases.common.networking.Endpoint.AliasUsers) other).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId)}, 1));
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("AliasUsers(userId="), this.userId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetAmazonReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "receiptId", "(Ljava/lang/String;Ljava/lang/String;)V", "getReceiptId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetAmazonReceipt extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String receiptId;
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAmazonReceipt(java.lang.String userId, java.lang.String receiptId) {
            super("/v1/receipts/amazon/%s/%s", "get_amazon_receipt", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            kotlin.jvm.internal.m.e(receiptId, "receiptId");
            this.userId = userId;
            this.receiptId = receiptId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt getAmazonReceipt, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getAmazonReceipt.userId;
            }
            if ((i3 & 2) != 0) {
                str2 = getAmazonReceipt.receiptId;
            }
            return getAmazonReceipt.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getReceiptId() {
            return this.receiptId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt copy(java.lang.String userId, java.lang.String receiptId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            kotlin.jvm.internal.m.e(receiptId, "receiptId");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt(userId, receiptId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt)) {
                return false;
            }
            com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt getAmazonReceipt = (com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt) other;
            return kotlin.jvm.internal.m.a(this.userId, getAmazonReceipt.userId) && kotlin.jvm.internal.m.a(this.receiptId, getAmazonReceipt.receiptId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId), this.receiptId}, 2));
        }

        public final java.lang.String getReceiptId() {
            return this.receiptId;
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.receiptId.hashCode() + (this.userId.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAmazonReceipt(userId=");
            sb.append(this.userId);
            sb.append(", receiptId=");
            return Y6.f.l(sb, this.receiptId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerCenterConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetCustomerCenterConfig extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerCenterConfig(java.lang.String userId) {
            super("/v1/customercenter/%s", "get_customer_center_config", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig getCustomerCenterConfig, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getCustomerCenterConfig.userId;
            }
            return getCustomerCenterConfig.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig copy(java.lang.String userId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig(userId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig) && kotlin.jvm.internal.m.a(this.userId, ((com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig) other).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId)}, 1));
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("GetCustomerCenterConfig(userId="), this.userId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerInfo;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetCustomerInfo extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerInfo(java.lang.String userId) {
            super("/v1/subscribers/%s", "get_customer", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo getCustomerInfo, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getCustomerInfo.userId;
            }
            return getCustomerInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo copy(java.lang.String userId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo(userId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo) && kotlin.jvm.internal.m.a(this.userId, ((com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo) other).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId)}, 1));
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("GetCustomerInfo(userId="), this.userId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetOfferings;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetOfferings extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOfferings(java.lang.String userId) {
            super("/v1/subscribers/%s/offerings", "get_offerings", "/v1/offerings", null);
            kotlin.jvm.internal.m.e(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetOfferings copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetOfferings getOfferings, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getOfferings.userId;
            }
            return getOfferings.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetOfferings copy(java.lang.String userId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetOfferings(userId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetOfferings) && kotlin.jvm.internal.m.a(this.userId, ((com.revenuecat.purchases.common.networking.Endpoint.GetOfferings) other).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return (!useFallback || getFallbackPath() == null) ? java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId)}, 1)) : getFallbackPath();
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("GetOfferings(userId="), this.userId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetProductEntitlementMapping;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetProductEntitlementMapping extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.GetProductEntitlementMapping INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.GetProductEntitlementMapping();

        /* JADX WARN: Illegal instructions before constructor call */
        private GetProductEntitlementMapping() {
            java.lang.String str = "/v1/product_entitlement_mapping";
            super(str, "get_product_entitlement_mapping", str, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return (!useFallback || getFallbackPath() == null) ? getPathTemplate() : getFallbackPath();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "expectsRCFormatResponse", "", "getExpectsRCFormatResponse", "()Z", "component1", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetRemoteConfig extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String domain;
        private final boolean expectsRCFormatResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRemoteConfig(java.lang.String domain) {
            super("/v1/config/%s", "remote_config", null, 4, null);
            kotlin.jvm.internal.m.e(domain, "domain");
            this.domain = domain;
            this.expectsRCFormatResponse = true;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig getRemoteConfig, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getRemoteConfig.domain;
            }
            return getRemoteConfig.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig copy(java.lang.String domain) {
            kotlin.jvm.internal.m.e(domain, "domain");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig(domain);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig) && kotlin.jvm.internal.m.a(this.domain, ((com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig) other).domain);
        }

        public final java.lang.String getDomain() {
            return this.domain;
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public boolean getExpectsRCFormatResponse() {
            return this.expectsRCFormatResponse;
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.domain)}, 1));
        }

        public int hashCode() {
            return this.domain.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("GetRemoteConfig(domain="), this.domain, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfigFallback;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetRemoteConfigFallback extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String domain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRemoteConfigFallback(java.lang.String domain) {
            super("/v1/config/%s", "remote_config_fallback", null, 4, null);
            kotlin.jvm.internal.m.e(domain, "domain");
            this.domain = domain;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback getRemoteConfigFallback, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getRemoteConfigFallback.domain;
            }
            return getRemoteConfigFallback.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback copy(java.lang.String domain) {
            kotlin.jvm.internal.m.e(domain, "domain");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback(domain);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback) && kotlin.jvm.internal.m.a(this.domain, ((com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback) other).domain);
        }

        public final java.lang.String getDomain() {
            return this.domain;
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.domain)}, 1));
        }

        public int hashCode() {
            return this.domain.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("GetRemoteConfigFallback(domain="), this.domain, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetRewardVerification;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "clientTransactionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientTransactionId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetRewardVerification extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String clientTransactionId;
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetRewardVerification(java.lang.String userId, java.lang.String clientTransactionId) {
            super("/v1/subscribers/%s/ads/reward_verifications/%s", "get_reward_verification", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            kotlin.jvm.internal.m.e(clientTransactionId, "clientTransactionId");
            this.userId = userId;
            this.clientTransactionId = clientTransactionId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification getRewardVerification, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getRewardVerification.userId;
            }
            if ((i3 & 2) != 0) {
                str2 = getRewardVerification.clientTransactionId;
            }
            return getRewardVerification.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getClientTransactionId() {
            return this.clientTransactionId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification copy(java.lang.String userId, java.lang.String clientTransactionId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            kotlin.jvm.internal.m.e(clientTransactionId, "clientTransactionId");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification(userId, clientTransactionId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification)) {
                return false;
            }
            com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification getRewardVerification = (com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification) other;
            return kotlin.jvm.internal.m.a(this.userId, getRewardVerification.userId) && kotlin.jvm.internal.m.a(this.clientTransactionId, getRewardVerification.clientTransactionId);
        }

        public final java.lang.String getClientTransactionId() {
            return this.clientTransactionId;
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId), android.net.Uri.encode(this.clientTransactionId)}, 2));
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.clientTransactionId.hashCode() + (this.userId.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GetRewardVerification(userId=");
            sb.append(this.userId);
            sb.append(", clientTransactionId=");
            return Y6.f.l(sb, this.clientTransactionId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetVirtualCurrencies;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class GetVirtualCurrencies extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetVirtualCurrencies(java.lang.String userId) {
            super("/v1/subscribers/%s/virtual_currencies", "get_virtual_currencies", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies copy$default(com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies getVirtualCurrencies, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = getVirtualCurrencies.userId;
            }
            return getVirtualCurrencies.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies copy(java.lang.String userId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            return new com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies(userId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies) && kotlin.jvm.internal.m.a(this.userId, ((com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies) other).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId)}, 1));
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("GetVirtualCurrencies(userId="), this.userId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$LogIn;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class LogIn extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.LogIn INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.LogIn();

        private LogIn() {
            super("/v1/subscribers/identify", "log_in", null, 4, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostAttributes;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class PostAttributes extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostAttributes(java.lang.String userId) {
            super("/v1/subscribers/%s/attributes", "post_attributes", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.PostAttributes copy$default(com.revenuecat.purchases.common.networking.Endpoint.PostAttributes postAttributes, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = postAttributes.userId;
            }
            return postAttributes.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.PostAttributes copy(java.lang.String userId) {
            kotlin.jvm.internal.m.e(userId, "userId");
            return new com.revenuecat.purchases.common.networking.Endpoint.PostAttributes(userId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.networking.Endpoint.PostAttributes) && kotlin.jvm.internal.m.a(this.userId, ((com.revenuecat.purchases.common.networking.Endpoint.PostAttributes) other).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId)}, 1));
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("PostAttributes(userId="), this.userId, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostCreateSupportTicket;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostCreateSupportTicket extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.PostCreateSupportTicket INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.PostCreateSupportTicket();

        private PostCreateSupportTicket() {
            super("/v1/customercenter/support/create-ticket", "post_create_support_ticket", null, 4, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostDiagnostics;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostDiagnostics extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.PostDiagnostics INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.PostDiagnostics();

        private PostDiagnostics() {
            super("/v1/diagnostics", "post_diagnostics", null, 4, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostEvents;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostEvents extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.PostEvents INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.PostEvents();

        private PostEvents() {
            super("/v1/events", "post_paywall_events", null, 4, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostReceipt extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.PostReceipt INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.PostReceipt();

        private PostReceipt() {
            super("/v1/receipts", "post_receipt", null, 4, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostRedeemWebPurchase;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostRedeemWebPurchase extends com.revenuecat.purchases.common.networking.Endpoint {
        public static final com.revenuecat.purchases.common.networking.Endpoint.PostRedeemWebPurchase INSTANCE = new com.revenuecat.purchases.common.networking.Endpoint.PostRedeemWebPurchase();

        private PostRedeemWebPurchase() {
            super("/v1/subscribers/redeem_purchase", "post_redeem_web_purchase", null, 4, null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$WebBillingGetProducts;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "productIds", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getProductIds", "()Ljava/util/Set;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class WebBillingGetProducts extends com.revenuecat.purchases.common.networking.Endpoint {
        private final java.util.Set<java.lang.String> productIds;
        private final java.lang.String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebBillingGetProducts(java.lang.String userId, java.util.Set<java.lang.String> productIds) {
            super("/rcbilling/v1/subscribers/%s/products?id=%s", "web_billing_get_products", null, 4, null);
            kotlin.jvm.internal.m.e(userId, "userId");
            kotlin.jvm.internal.m.e(productIds, "productIds");
            this.userId = userId;
            this.productIds = productIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts copy$default(com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts webBillingGetProducts, java.lang.String str, java.util.Set set, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = webBillingGetProducts.userId;
            }
            if ((i3 & 2) != 0) {
                set = webBillingGetProducts.productIds;
            }
            return webBillingGetProducts.copy(str, set);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final java.util.Set<java.lang.String> component2() {
            return this.productIds;
        }

        public final com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts copy(java.lang.String userId, java.util.Set<java.lang.String> productIds) {
            kotlin.jvm.internal.m.e(userId, "userId");
            kotlin.jvm.internal.m.e(productIds, "productIds");
            return new com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts(userId, productIds);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts)) {
                return false;
            }
            com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts webBillingGetProducts = (com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts) other;
            return kotlin.jvm.internal.m.a(this.userId, webBillingGetProducts.userId) && kotlin.jvm.internal.m.a(this.productIds, webBillingGetProducts.productIds);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public java.lang.String getPath(boolean useFallback) {
            return java.lang.String.format(getPathTemplate(), java.util.Arrays.copyOf(new java.lang.Object[]{android.net.Uri.encode(this.userId), p078i6.o.o1(this.productIds, "&id=", null, null, com.revenuecat.purchases.common.networking.Endpoint$WebBillingGetProducts$getPath$1.INSTANCE, 30)}, 2));
        }

        public final java.util.Set<java.lang.String> getProductIds() {
            return this.productIds;
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.productIds.hashCode() + (this.userId.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "WebBillingGetProducts(userId=" + this.userId + ", productIds=" + this.productIds + ')';
        }
    }

    public /* synthetic */ Endpoint(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3);
    }

    public static /* synthetic */ java.lang.String getPath$default(com.revenuecat.purchases.common.networking.Endpoint endpoint, boolean z6, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPath");
        }
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return endpoint.getPath(z6);
    }

    public boolean getExpectsRCFormatResponse() {
        return this.expectsRCFormatResponse;
    }

    public final java.lang.String getFallbackPath() {
        return this.fallbackPath;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean getNeedsNonceToPerformSigning() {
        if (this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.LogIn.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostReceipt.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostRedeemWebPurchase.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig) {
            return true;
        }
        if (this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetOfferings ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.PostAttributes ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostDiagnostics.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostEvents.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.GetProductEntitlementMapping.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostCreateSupportTicket.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.AliasUsers ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback) {
            return false;
        }
        throw new I3.b();
    }

    public abstract java.lang.String getPath(boolean useFallback);

    public final java.lang.String getPathTemplate() {
        return this.pathTemplate;
    }

    public final boolean getSupportsFallbackBaseURLs() {
        return this.fallbackPath != null;
    }

    public final boolean getSupportsSignatureVerification() {
        if (this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.LogIn.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostReceipt.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetOfferings ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.GetProductEntitlementMapping.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostRedeemWebPurchase.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback) {
            return true;
        }
        if (this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.PostAttributes ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostDiagnostics.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostEvents.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostCreateSupportTicket.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.AliasUsers) {
            return false;
        }
        throw new I3.b();
    }

    public final boolean getUsesAPISources() {
        if (this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerInfo ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.LogIn.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostReceipt.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetOfferings ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.AliasUsers ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.PostAttributes ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetAmazonReceipt ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.GetProductEntitlementMapping.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetCustomerCenterConfig ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfig ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostCreateSupportTicket.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostRedeemWebPurchase.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetVirtualCurrencies ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRewardVerification ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.WebBillingGetProducts) {
            return true;
        }
        if (equals(com.revenuecat.purchases.common.networking.Endpoint.PostDiagnostics.INSTANCE) ? true : equals(com.revenuecat.purchases.common.networking.Endpoint.PostEvents.INSTANCE) ? true : this instanceof com.revenuecat.purchases.common.networking.Endpoint.GetRemoteConfigFallback) {
            return false;
        }
        throw new I3.b();
    }

    private Endpoint(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.pathTemplate = str;
        this.name = str2;
        this.fallbackPath = str3;
    }

    public /* synthetic */ Endpoint(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, null);
    }
}
