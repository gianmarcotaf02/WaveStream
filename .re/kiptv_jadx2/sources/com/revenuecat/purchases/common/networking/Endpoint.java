package com.revenuecat.purchases.common.networking;

import I3.b;
import Y6.f;
import android.net.Uri;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0012\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\bH&R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n\u0082\u0001\u0012+,-./0123456789:;<¨\u0006="}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint;", "", "pathTemplate", "", "name", "fallbackPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "expectsRCFormatResponse", "", "getExpectsRCFormatResponse", "()Z", "getFallbackPath", "()Ljava/lang/String;", "getName", "needsNonceToPerformSigning", "getNeedsNonceToPerformSigning", "getPathTemplate", "supportsFallbackBaseURLs", "getSupportsFallbackBaseURLs", "supportsSignatureVerification", "getSupportsSignatureVerification", "usesAPISources", "getUsesAPISources", "getPath", "useFallback", "AliasUsers", "GetAmazonReceipt", "GetCustomerCenterConfig", "GetCustomerInfo", "GetOfferings", "GetProductEntitlementMapping", "GetRemoteConfig", "GetRemoteConfigFallback", "GetRewardVerification", "GetVirtualCurrencies", "LogIn", "PostAttributes", "PostCreateSupportTicket", "PostDiagnostics", "PostEvents", "PostReceipt", "PostRedeemWebPurchase", "WebBillingGetProducts", "Lcom/revenuecat/purchases/common/networking/Endpoint$AliasUsers;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetAmazonReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerCenterConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerInfo;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetOfferings;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetProductEntitlementMapping;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfigFallback;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetRewardVerification;", "Lcom/revenuecat/purchases/common/networking/Endpoint$GetVirtualCurrencies;", "Lcom/revenuecat/purchases/common/networking/Endpoint$LogIn;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostAttributes;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostCreateSupportTicket;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostDiagnostics;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostEvents;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint$PostRedeemWebPurchase;", "Lcom/revenuecat/purchases/common/networking/Endpoint$WebBillingGetProducts;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class Endpoint {
    private final boolean expectsRCFormatResponse;
    private final String fallbackPath;
    private final String name;
    private final String pathTemplate;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$AliasUsers;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AliasUsers extends Endpoint {
        private final String userId;

        public AliasUsers(String userId) {
            super("/v1/subscribers/%s/alias", "alias_users", null, 4, null);
            m.e(userId, "userId");
            this.userId = userId;
        }

        public static AliasUsers copy$default(AliasUsers aliasUsers, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = aliasUsers.userId;
            }
            return aliasUsers.copy(str);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final AliasUsers copy(String userId) {
            m.e(userId, "userId");
            return new AliasUsers(userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AliasUsers) && m.a(this.userId, ((AliasUsers) other).userId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("AliasUsers(userId="), this.userId, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetAmazonReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "receiptId", "(Ljava/lang/String;Ljava/lang/String;)V", "getReceiptId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetAmazonReceipt extends Endpoint {
        private final String receiptId;
        private final String userId;

        public GetAmazonReceipt(String userId, String receiptId) {
            super("/v1/receipts/amazon/%s/%s", "get_amazon_receipt", null, 4, null);
            m.e(userId, "userId");
            m.e(receiptId, "receiptId");
            this.userId = userId;
            this.receiptId = receiptId;
        }

        public static GetAmazonReceipt copy$default(GetAmazonReceipt getAmazonReceipt, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getAmazonReceipt.userId;
            }
            if ((i3 & 2) != 0) {
                str2 = getAmazonReceipt.receiptId;
            }
            return getAmazonReceipt.copy(str, str2);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getReceiptId() {
            return this.receiptId;
        }

        public final GetAmazonReceipt copy(String userId, String receiptId) {
            m.e(userId, "userId");
            m.e(receiptId, "receiptId");
            return new GetAmazonReceipt(userId, receiptId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAmazonReceipt)) {
                return false;
            }
            GetAmazonReceipt getAmazonReceipt = (GetAmazonReceipt) other;
            return m.a(this.userId, getAmazonReceipt.userId) && m.a(this.receiptId, getAmazonReceipt.receiptId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), this.receiptId}, 2));
        }

        public final String getReceiptId() {
            return this.receiptId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.receiptId.hashCode() + (this.userId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GetAmazonReceipt(userId=");
            sb.append(this.userId);
            sb.append(", receiptId=");
            return f.l(sb, this.receiptId, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerCenterConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetCustomerCenterConfig extends Endpoint {
        private final String userId;

        public GetCustomerCenterConfig(String userId) {
            super("/v1/customercenter/%s", "get_customer_center_config", null, 4, null);
            m.e(userId, "userId");
            this.userId = userId;
        }

        public static GetCustomerCenterConfig copy$default(GetCustomerCenterConfig getCustomerCenterConfig, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getCustomerCenterConfig.userId;
            }
            return getCustomerCenterConfig.copy(str);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final GetCustomerCenterConfig copy(String userId) {
            m.e(userId, "userId");
            return new GetCustomerCenterConfig(userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetCustomerCenterConfig) && m.a(this.userId, ((GetCustomerCenterConfig) other).userId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("GetCustomerCenterConfig(userId="), this.userId, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetCustomerInfo;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetCustomerInfo extends Endpoint {
        private final String userId;

        public GetCustomerInfo(String userId) {
            super("/v1/subscribers/%s", "get_customer", null, 4, null);
            m.e(userId, "userId");
            this.userId = userId;
        }

        public static GetCustomerInfo copy$default(GetCustomerInfo getCustomerInfo, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getCustomerInfo.userId;
            }
            return getCustomerInfo.copy(str);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final GetCustomerInfo copy(String userId) {
            m.e(userId, "userId");
            return new GetCustomerInfo(userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetCustomerInfo) && m.a(this.userId, ((GetCustomerInfo) other).userId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("GetCustomerInfo(userId="), this.userId, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetOfferings;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetOfferings extends Endpoint {
        private final String userId;

        public GetOfferings(String userId) {
            super("/v1/subscribers/%s/offerings", "get_offerings", "/v1/offerings", null);
            m.e(userId, "userId");
            this.userId = userId;
        }

        public static GetOfferings copy$default(GetOfferings getOfferings, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getOfferings.userId;
            }
            return getOfferings.copy(str);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final GetOfferings copy(String userId) {
            m.e(userId, "userId");
            return new GetOfferings(userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetOfferings) && m.a(this.userId, ((GetOfferings) other).userId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return (!useFallback || getFallbackPath() == null) ? String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1)) : getFallbackPath();
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("GetOfferings(userId="), this.userId, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetProductEntitlementMapping;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetProductEntitlementMapping extends Endpoint {
        public static final GetProductEntitlementMapping INSTANCE = new GetProductEntitlementMapping();

        private GetProductEntitlementMapping() {
            String str = "/v1/product_entitlement_mapping";
            super(str, "get_product_entitlement_mapping", str, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return (!useFallback || getFallbackPath() == null) ? getPathTemplate() : getFallbackPath();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfig;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "expectsRCFormatResponse", "", "getExpectsRCFormatResponse", "()Z", "component1", "copy", "equals", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetRemoteConfig extends Endpoint {
        private final String domain;
        private final boolean expectsRCFormatResponse;

        public GetRemoteConfig(String domain) {
            super("/v1/config/%s", "remote_config", null, 4, null);
            m.e(domain, "domain");
            this.domain = domain;
            this.expectsRCFormatResponse = true;
        }

        public static GetRemoteConfig copy$default(GetRemoteConfig getRemoteConfig, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getRemoteConfig.domain;
            }
            return getRemoteConfig.copy(str);
        }

        public final String getDomain() {
            return this.domain;
        }

        public final GetRemoteConfig copy(String domain) {
            m.e(domain, "domain");
            return new GetRemoteConfig(domain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetRemoteConfig) && m.a(this.domain, ((GetRemoteConfig) other).domain);
        }

        public final String getDomain() {
            return this.domain;
        }

        @Override
        public boolean getExpectsRCFormatResponse() {
            return this.expectsRCFormatResponse;
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.domain)}, 1));
        }

        public int hashCode() {
            return this.domain.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("GetRemoteConfig(domain="), this.domain, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetRemoteConfigFallback;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetRemoteConfigFallback extends Endpoint {
        private final String domain;

        public GetRemoteConfigFallback(String domain) {
            super("/v1/config/%s", "remote_config_fallback", null, 4, null);
            m.e(domain, "domain");
            this.domain = domain;
        }

        public static GetRemoteConfigFallback copy$default(GetRemoteConfigFallback getRemoteConfigFallback, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getRemoteConfigFallback.domain;
            }
            return getRemoteConfigFallback.copy(str);
        }

        public final String getDomain() {
            return this.domain;
        }

        public final GetRemoteConfigFallback copy(String domain) {
            m.e(domain, "domain");
            return new GetRemoteConfigFallback(domain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetRemoteConfigFallback) && m.a(this.domain, ((GetRemoteConfigFallback) other).domain);
        }

        public final String getDomain() {
            return this.domain;
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.domain)}, 1));
        }

        public int hashCode() {
            return this.domain.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("GetRemoteConfigFallback(domain="), this.domain, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetRewardVerification;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "clientTransactionId", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientTransactionId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetRewardVerification extends Endpoint {
        private final String clientTransactionId;
        private final String userId;

        public GetRewardVerification(String userId, String clientTransactionId) {
            super("/v1/subscribers/%s/ads/reward_verifications/%s", "get_reward_verification", null, 4, null);
            m.e(userId, "userId");
            m.e(clientTransactionId, "clientTransactionId");
            this.userId = userId;
            this.clientTransactionId = clientTransactionId;
        }

        public static GetRewardVerification copy$default(GetRewardVerification getRewardVerification, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getRewardVerification.userId;
            }
            if ((i3 & 2) != 0) {
                str2 = getRewardVerification.clientTransactionId;
            }
            return getRewardVerification.copy(str, str2);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getClientTransactionId() {
            return this.clientTransactionId;
        }

        public final GetRewardVerification copy(String userId, String clientTransactionId) {
            m.e(userId, "userId");
            m.e(clientTransactionId, "clientTransactionId");
            return new GetRewardVerification(userId, clientTransactionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetRewardVerification)) {
                return false;
            }
            GetRewardVerification getRewardVerification = (GetRewardVerification) other;
            return m.a(this.userId, getRewardVerification.userId) && m.a(this.clientTransactionId, getRewardVerification.clientTransactionId);
        }

        public final String getClientTransactionId() {
            return this.clientTransactionId;
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), Uri.encode(this.clientTransactionId)}, 2));
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.clientTransactionId.hashCode() + (this.userId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GetRewardVerification(userId=");
            sb.append(this.userId);
            sb.append(", clientTransactionId=");
            return f.l(sb, this.clientTransactionId, ')');
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$GetVirtualCurrencies;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GetVirtualCurrencies extends Endpoint {
        private final String userId;

        public GetVirtualCurrencies(String userId) {
            super("/v1/subscribers/%s/virtual_currencies", "get_virtual_currencies", null, 4, null);
            m.e(userId, "userId");
            this.userId = userId;
        }

        public static GetVirtualCurrencies copy$default(GetVirtualCurrencies getVirtualCurrencies, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getVirtualCurrencies.userId;
            }
            return getVirtualCurrencies.copy(str);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final GetVirtualCurrencies copy(String userId) {
            m.e(userId, "userId");
            return new GetVirtualCurrencies(userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetVirtualCurrencies) && m.a(this.userId, ((GetVirtualCurrencies) other).userId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("GetVirtualCurrencies(userId="), this.userId, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$LogIn;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class LogIn extends Endpoint {
        public static final LogIn INSTANCE = new LogIn();

        private LogIn() {
            super("/v1/subscribers/identify", "log_in", null, 4, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostAttributes;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostAttributes extends Endpoint {
        private final String userId;

        public PostAttributes(String userId) {
            super("/v1/subscribers/%s/attributes", "post_attributes", null, 4, null);
            m.e(userId, "userId");
            this.userId = userId;
        }

        public static PostAttributes copy$default(PostAttributes postAttributes, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = postAttributes.userId;
            }
            return postAttributes.copy(str);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final PostAttributes copy(String userId) {
            m.e(userId, "userId");
            return new PostAttributes(userId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostAttributes) && m.a(this.userId, ((PostAttributes) other).userId);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("PostAttributes(userId="), this.userId, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostCreateSupportTicket;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostCreateSupportTicket extends Endpoint {
        public static final PostCreateSupportTicket INSTANCE = new PostCreateSupportTicket();

        private PostCreateSupportTicket() {
            super("/v1/customercenter/support/create-ticket", "post_create_support_ticket", null, 4, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostDiagnostics;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostDiagnostics extends Endpoint {
        public static final PostDiagnostics INSTANCE = new PostDiagnostics();

        private PostDiagnostics() {
            super("/v1/diagnostics", "post_diagnostics", null, 4, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostEvents;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostEvents extends Endpoint {
        public static final PostEvents INSTANCE = new PostEvents();

        private PostEvents() {
            super("/v1/events", "post_paywall_events", null, 4, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostReceipt;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostReceipt extends Endpoint {
        public static final PostReceipt INSTANCE = new PostReceipt();

        private PostReceipt() {
            super("/v1/receipts", "post_receipt", null, 4, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$PostRedeemWebPurchase;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "()V", "getPath", "", "useFallback", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostRedeemWebPurchase extends Endpoint {
        public static final PostRedeemWebPurchase INSTANCE = new PostRedeemWebPurchase();

        private PostRedeemWebPurchase() {
            super("/v1/subscribers/redeem_purchase", "post_redeem_web_purchase", null, 4, null);
        }

        @Override
        public String getPath(boolean useFallback) {
            return getPathTemplate();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/networking/Endpoint$WebBillingGetProducts;", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "userId", "", "productIds", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getProductIds", "()Ljava/util/Set;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "getPath", "useFallback", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class WebBillingGetProducts extends Endpoint {
        private final Set<String> productIds;
        private final String userId;

        public WebBillingGetProducts(String userId, Set<String> productIds) {
            super("/rcbilling/v1/subscribers/%s/products?id=%s", "web_billing_get_products", null, 4, null);
            m.e(userId, "userId");
            m.e(productIds, "productIds");
            this.userId = userId;
            this.productIds = productIds;
        }

        public static WebBillingGetProducts copy$default(WebBillingGetProducts webBillingGetProducts, String str, Set set, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = webBillingGetProducts.userId;
            }
            if ((i3 & 2) != 0) {
                set = webBillingGetProducts.productIds;
            }
            return webBillingGetProducts.copy(str, set);
        }

        public final String getUserId() {
            return this.userId;
        }

        public final Set<String> component2() {
            return this.productIds;
        }

        public final WebBillingGetProducts copy(String userId, Set<String> productIds) {
            m.e(userId, "userId");
            m.e(productIds, "productIds");
            return new WebBillingGetProducts(userId, productIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebBillingGetProducts)) {
                return false;
            }
            WebBillingGetProducts webBillingGetProducts = (WebBillingGetProducts) other;
            return m.a(this.userId, webBillingGetProducts.userId) && m.a(this.productIds, webBillingGetProducts.productIds);
        }

        @Override
        public String getPath(boolean useFallback) {
            return String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), o.o1(this.productIds, "&id=", null, null, Endpoint$WebBillingGetProducts$getPath$1.INSTANCE, 30)}, 2));
        }

        public final Set<String> getProductIds() {
            return this.productIds;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.productIds.hashCode() + (this.userId.hashCode() * 31);
        }

        public String toString() {
            return "WebBillingGetProducts(userId=" + this.userId + ", productIds=" + this.productIds + ')';
        }
    }

    public Endpoint(String str, String str2, String str3, AbstractC2541f abstractC2541f) {
        this(str, str2, str3);
    }

    public static String getPath$default(Endpoint endpoint, boolean z6, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPath");
        }
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return endpoint.getPath(z6);
    }

    public boolean getExpectsRCFormatResponse() {
        return this.expectsRCFormatResponse;
    }

    public final String getFallbackPath() {
        return this.fallbackPath;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsNonceToPerformSigning() {
        if (this instanceof GetCustomerInfo ? true : equals(LogIn.INSTANCE) ? true : equals(PostReceipt.INSTANCE) ? true : equals(PostRedeemWebPurchase.INSTANCE) ? true : this instanceof GetVirtualCurrencies ? true : this instanceof GetRewardVerification ? true : this instanceof GetRemoteConfig) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof GetOfferings ? true : this instanceof PostAttributes ? true : equals(PostDiagnostics.INSTANCE) ? true : equals(PostEvents.INSTANCE) ? true : equals(GetProductEntitlementMapping.INSTANCE) ? true : this instanceof GetCustomerCenterConfig ? true : equals(PostCreateSupportTicket.INSTANCE) ? true : this instanceof WebBillingGetProducts ? true : this instanceof AliasUsers ? true : this instanceof GetRemoteConfigFallback) {
            return false;
        }
        throw new b();
    }

    public abstract String getPath(boolean useFallback);

    public final String getPathTemplate() {
        return this.pathTemplate;
    }

    public final boolean getSupportsFallbackBaseURLs() {
        return this.fallbackPath != null;
    }

    public final boolean getSupportsSignatureVerification() {
        if (this instanceof GetCustomerInfo ? true : equals(LogIn.INSTANCE) ? true : equals(PostReceipt.INSTANCE) ? true : this instanceof GetOfferings ? true : equals(GetProductEntitlementMapping.INSTANCE) ? true : equals(PostRedeemWebPurchase.INSTANCE) ? true : this instanceof GetVirtualCurrencies ? true : this instanceof GetRewardVerification ? true : this instanceof GetRemoteConfig ? true : this instanceof GetRemoteConfigFallback) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof PostAttributes ? true : equals(PostDiagnostics.INSTANCE) ? true : equals(PostEvents.INSTANCE) ? true : this instanceof GetCustomerCenterConfig ? true : equals(PostCreateSupportTicket.INSTANCE) ? true : this instanceof WebBillingGetProducts ? true : this instanceof AliasUsers) {
            return false;
        }
        throw new b();
    }

    public final boolean getUsesAPISources() {
        if (this instanceof GetCustomerInfo ? true : equals(LogIn.INSTANCE) ? true : equals(PostReceipt.INSTANCE) ? true : this instanceof GetOfferings ? true : this instanceof AliasUsers ? true : this instanceof PostAttributes ? true : this instanceof GetAmazonReceipt ? true : equals(GetProductEntitlementMapping.INSTANCE) ? true : this instanceof GetCustomerCenterConfig ? true : this instanceof GetRemoteConfig ? true : equals(PostCreateSupportTicket.INSTANCE) ? true : equals(PostRedeemWebPurchase.INSTANCE) ? true : this instanceof GetVirtualCurrencies ? true : this instanceof GetRewardVerification ? true : this instanceof WebBillingGetProducts) {
            return true;
        }
        if (equals(PostDiagnostics.INSTANCE) ? true : equals(PostEvents.INSTANCE) ? true : this instanceof GetRemoteConfigFallback) {
            return false;
        }
        throw new b();
    }

    private Endpoint(String str, String str2, String str3) {
        this.pathTemplate = str;
        this.name = str2;
        this.fallbackPath = str3;
    }

    public Endpoint(String str, String str2, String str3, int i3, AbstractC2541f abstractC2541f) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, null);
    }
}
