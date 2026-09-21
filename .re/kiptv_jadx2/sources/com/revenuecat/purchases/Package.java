package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.models.StoreProduct;
import io.sentry.protocol.ViewHierarchyNode;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tB3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/Package;", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "packageType", "Lcom/revenuecat/purchases/PackageType;", "product", "Lcom/revenuecat/purchases/models/StoreProduct;", "offering", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;)V", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "webCheckoutURL", "Ljava/net/URL;", "(Ljava/lang/String;Lcom/revenuecat/purchases/PackageType;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/net/URL;)V", "getIdentifier", "()Ljava/lang/String;", "getOffering$annotations", "()V", "getOffering", "getPackageType", "()Lcom/revenuecat/purchases/PackageType;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "getWebCheckoutURL", "()Ljava/net/URL;", "copy", "copy$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Package {
    private final String identifier;
    private final PackageType packageType;
    private final PresentedOfferingContext presentedOfferingContext;
    private final StoreProduct product;
    private final URL webCheckoutURL;

    public Package(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext) {
        this(identifier, packageType, product, presentedOfferingContext, null, 16, null);
        m.e(identifier, "identifier");
        m.e(packageType, "packageType");
        m.e(product, "product");
        m.e(presentedOfferingContext, "presentedOfferingContext");
    }

    @p070h6.c
    public static void getOffering$annotations() {
    }

    public final Package copy$purchases_defaultsRelease(PresentedOfferingContext presentedOfferingContext) {
        m.e(presentedOfferingContext, "presentedOfferingContext");
        return new Package(this.identifier, this.packageType, this.product.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, this.webCheckoutURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r9 = (Package) obj;
        return m.a(this.identifier, r9.identifier) && this.packageType == r9.packageType && m.a(this.product, r9.product) && m.a(this.presentedOfferingContext, r9.presentedOfferingContext) && m.a(this.webCheckoutURL, r9.webCheckoutURL);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        String offeringIdentifier = this.presentedOfferingContext.getOfferingIdentifier();
        return offeringIdentifier == null ? "" : offeringIdentifier;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public int hashCode() {
        int iHashCode = (this.presentedOfferingContext.hashCode() + ((this.product.hashCode() + ((this.packageType.hashCode() + (this.identifier.hashCode() * 31)) * 31)) * 31)) * 31;
        URL url = this.webCheckoutURL;
        return iHashCode + (url == null ? 0 : url.hashCode());
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", presentedOfferingContext=" + this.presentedOfferingContext + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    public Package(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext, URL url) {
        m.e(identifier, "identifier");
        m.e(packageType, "packageType");
        m.e(product, "product");
        m.e(presentedOfferingContext, "presentedOfferingContext");
        this.identifier = identifier;
        this.packageType = packageType;
        this.product = product;
        this.presentedOfferingContext = presentedOfferingContext;
        this.webCheckoutURL = url;
    }

    public Package(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, URL url, int i3, AbstractC2541f abstractC2541f) {
        this(str, packageType, storeProduct, presentedOfferingContext, (i3 & 16) != 0 ? null : url);
    }

    @p070h6.c
    public Package(String identifier, PackageType packageType, StoreProduct product, String offering) {
        this(identifier, packageType, product, new PresentedOfferingContext(offering), null);
        m.e(identifier, "identifier");
        m.e(packageType, "packageType");
        m.e(product, "product");
        m.e(offering, "offering");
    }
}
