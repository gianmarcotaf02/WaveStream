package com.revenuecat.purchases.interfaces;

import I3.b;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;", "", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Lh6/A;", "handleResult", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "Result", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RedeemWebPurchaseListener {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "", "()V", "isSuccess", "", "()Z", "Error", "Expired", "InvalidToken", "PurchaseBelongsToOtherUser", "Success", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Error;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Expired;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$InvalidToken;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$PurchaseBelongsToOtherUser;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class Result {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Error;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "(Lcom/revenuecat/purchases/PurchasesError;)V", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Error extends Result {
            private final PurchasesError error;

            public Error(PurchasesError error) {
                super(null);
                m.e(error, "error");
                this.error = error;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && m.a(this.error, ((Error) obj).error);
            }

            public final PurchasesError getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Expired;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "obfuscatedEmail", "", "(Ljava/lang/String;)V", "getObfuscatedEmail", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Expired extends Result {
            private final String obfuscatedEmail;

            public Expired(String obfuscatedEmail) {
                super(null);
                m.e(obfuscatedEmail, "obfuscatedEmail");
                this.obfuscatedEmail = obfuscatedEmail;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Expired) && m.a(this.obfuscatedEmail, ((Expired) obj).obfuscatedEmail);
            }

            public final String getObfuscatedEmail() {
                return this.obfuscatedEmail;
            }

            public int hashCode() {
                return this.obfuscatedEmail.hashCode();
            }

            public String toString() {
                return f.l(new StringBuilder("Expired(obfuscatedEmail="), this.obfuscatedEmail, ')');
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$InvalidToken;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class InvalidToken extends Result {
            public static final InvalidToken INSTANCE = new InvalidToken();

            private InvalidToken() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$PurchaseBelongsToOtherUser;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class PurchaseBelongsToOtherUser extends Result {
            public static final PurchaseBelongsToOtherUser INSTANCE = new PurchaseBelongsToOtherUser();

            private PurchaseBelongsToOtherUser() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Success extends Result {
            private final CustomerInfo customerInfo;

            public Success(CustomerInfo customerInfo) {
                super(null);
                m.e(customerInfo, "customerInfo");
                this.customerInfo = customerInfo;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && m.a(this.customerInfo, ((Success) obj).customerInfo);
            }

            public final CustomerInfo getCustomerInfo() {
                return this.customerInfo;
            }

            public int hashCode() {
                return this.customerInfo.hashCode();
            }

            public String toString() {
                return "Success(customerInfo=" + this.customerInfo + ')';
            }
        }

        public Result(AbstractC2541f abstractC2541f) {
            this();
        }

        public final boolean isSuccess() {
            if (this instanceof Success) {
                return true;
            }
            if ((this instanceof Error) || equals(InvalidToken.INSTANCE) || (this instanceof Expired) || equals(PurchaseBelongsToOtherUser.INSTANCE)) {
                return false;
            }
            throw new b();
        }

        private Result() {
        }
    }

    void handleResult(Result result);
}
