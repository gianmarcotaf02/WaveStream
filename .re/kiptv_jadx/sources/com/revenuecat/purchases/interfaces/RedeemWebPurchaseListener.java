package com.revenuecat.purchases.interfaces;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Lh6/A;", "handleResult", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "Result", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RedeemWebPurchaseListener {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "", "()V", "isSuccess", "", "()Z", "Error", "Expired", "InvalidToken", "PurchaseBelongsToOtherUser", "Success", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Error;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Expired;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$InvalidToken;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$PurchaseBelongsToOtherUser;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Error;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "(Lcom/revenuecat/purchases/PurchasesError;)V", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Error extends com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result {
            private final com.revenuecat.purchases.PurchasesError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(com.revenuecat.purchases.PurchasesError error) {
                super(null);
                kotlin.jvm.internal.m.e(error, "error");
                this.error = error;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Error) && kotlin.jvm.internal.m.a(this.error, ((com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Error) obj).error);
            }

            public final com.revenuecat.purchases.PurchasesError getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public java.lang.String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Expired;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "obfuscatedEmail", "", "(Ljava/lang/String;)V", "getObfuscatedEmail", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Expired extends com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result {
            private final java.lang.String obfuscatedEmail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Expired(java.lang.String obfuscatedEmail) {
                super(null);
                kotlin.jvm.internal.m.e(obfuscatedEmail, "obfuscatedEmail");
                this.obfuscatedEmail = obfuscatedEmail;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Expired) && kotlin.jvm.internal.m.a(this.obfuscatedEmail, ((com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Expired) obj).obfuscatedEmail);
            }

            public final java.lang.String getObfuscatedEmail() {
                return this.obfuscatedEmail;
            }

            public int hashCode() {
                return this.obfuscatedEmail.hashCode();
            }

            public java.lang.String toString() {
                return Y6.f.l(new java.lang.StringBuilder("Expired(obfuscatedEmail="), this.obfuscatedEmail, ')');
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$InvalidToken;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class InvalidToken extends com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result {
            public static final com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.InvalidToken INSTANCE = new com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.InvalidToken();

            private InvalidToken() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$PurchaseBelongsToOtherUser;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class PurchaseBelongsToOtherUser extends com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result {
            public static final com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser INSTANCE = new com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser();

            private PurchaseBelongsToOtherUser() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Success extends com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result {
            private final com.revenuecat.purchases.CustomerInfo customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.revenuecat.purchases.CustomerInfo customerInfo) {
                super(null);
                kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
                this.customerInfo = customerInfo;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Success) && kotlin.jvm.internal.m.a(this.customerInfo, ((com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Success) obj).customerInfo);
            }

            public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
                return this.customerInfo;
            }

            public int hashCode() {
                return this.customerInfo.hashCode();
            }

            public java.lang.String toString() {
                return "Success(customerInfo=" + this.customerInfo + ')';
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final boolean isSuccess() {
            if (this instanceof com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Success) {
                return true;
            }
            if ((this instanceof com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Error) || equals(com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE) || (this instanceof com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.Expired) || equals(com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
                return false;
            }
            throw new I3.b();
        }

        private Result() {
        }
    }

    void handleResult(com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener.Result result);
}
