package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "", "Cancel", "CustomAction", "CustomUrl", "MissingPurchase", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface CustomerCenterManagementOption {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$Cancel;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Cancel implements com.revenuecat.purchases.customercenter.CustomerCenterManagementOption {
        public static final com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.Cancel INSTANCE = new com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.Cancel();

        private Cancel() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$CustomAction;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "actionIdentifier", "", "purchaseIdentifier", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionIdentifier", "()Ljava/lang/String;", "getPurchaseIdentifier", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class CustomAction implements com.revenuecat.purchases.customercenter.CustomerCenterManagementOption {
        private final java.lang.String actionIdentifier;
        private final java.lang.String purchaseIdentifier;

        public CustomAction(java.lang.String actionIdentifier, java.lang.String str) {
            kotlin.jvm.internal.m.e(actionIdentifier, "actionIdentifier");
            this.actionIdentifier = actionIdentifier;
            this.purchaseIdentifier = str;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.CustomAction)) {
                return false;
            }
            com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.CustomAction customAction = (com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.CustomAction) obj;
            return kotlin.jvm.internal.m.a(this.actionIdentifier, customAction.actionIdentifier) && kotlin.jvm.internal.m.a(this.purchaseIdentifier, customAction.purchaseIdentifier);
        }

        public final java.lang.String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final java.lang.String getPurchaseIdentifier() {
            return this.purchaseIdentifier;
        }

        public int hashCode() {
            int iHashCode = this.actionIdentifier.hashCode() * 31;
            java.lang.String str = this.purchaseIdentifier;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomAction(actionIdentifier=");
            sb.append(this.actionIdentifier);
            sb.append(", purchaseIdentifier=");
            return Y6.f.l(sb, this.purchaseIdentifier, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$CustomUrl;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class CustomUrl implements com.revenuecat.purchases.customercenter.CustomerCenterManagementOption {
        private final android.net.Uri uri;

        public CustomUrl(android.net.Uri uri) {
            kotlin.jvm.internal.m.e(uri, "uri");
            this.uri = uri;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.CustomUrl) && kotlin.jvm.internal.m.a(this.uri, ((com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.CustomUrl) obj).uri);
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public java.lang.String toString() {
            return "CustomUrl(uri=" + this.uri + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$MissingPurchase;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class MissingPurchase implements com.revenuecat.purchases.customercenter.CustomerCenterManagementOption {
        public static final com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.MissingPurchase INSTANCE = new com.revenuecat.purchases.customercenter.CustomerCenterManagementOption.MissingPurchase();

        private MissingPurchase() {
        }
    }
}
