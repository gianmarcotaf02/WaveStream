package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b$\u0018\u00002\u00020\u0001:\u0001\\B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001d\u0010D\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010G\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u001d\u0010J\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010CR\u001d\u0010M\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010CR\u001d\u0010P\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u001d\u0010S\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010CR\u001d\u0010V\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010CR\u0017\u0010W\u001a\u0002098G¢\u0006\f\u0012\u0004\bX\u00101\u001a\u0004\bW\u0010=R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u00101\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "", "", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "serverDescription", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "", "Lcom/revenuecat/purchases/Package;", "availablePackages", "Lcom/revenuecat/purchases/paywalls/PaywallData;", com.revenuecat.purchases.common.workflows.WorkflowScreenType.PAYWALL, "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "paywallComponents", "Ljava/net/URL;", "webCheckoutURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/Offering$PaywallComponents;Ljava/net/URL;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS, "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/Package;", "getPackage", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "default", "getMetadataString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "copy", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/PackageType;", "packageType", "findPackage", "(Lcom/revenuecat/purchases/PackageType;)Lcom/revenuecat/purchases/Package;", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "getServerDescription", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Ljava/util/List;", "getAvailablePackages", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall$annotations", "()V", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getPaywallComponents", "()Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getPaywallComponents$annotations", "Ljava/net/URL;", "getWebCheckoutURL", "()Ljava/net/URL;", "", "hasPaywallComponents", "Z", "getHasPaywallComponents$purchases_defaultsRelease", "()Z", "setHasPaywallComponents$purchases_defaultsRelease", "(Z)V", "lifetime$delegate", "Lh6/h;", "getLifetime", "()Lcom/revenuecat/purchases/Package;", "lifetime", "annual$delegate", "getAnnual", "annual", "sixMonth$delegate", "getSixMonth", "sixMonth", "threeMonth$delegate", "getThreeMonth", "threeMonth", "twoMonth$delegate", "getTwoMonth", "twoMonth", "monthly$delegate", "getMonthly", "monthly", "weekly$delegate", "getWeekly", "weekly", "hasPaywall", "hasPaywall$annotations", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$annotations", "PaywallComponents", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Offering {

    /* JADX INFO: renamed from: annual$delegate, reason: from kotlin metadata */
    private final p070h6.h annual;
    private final java.util.List<com.revenuecat.purchases.Package> availablePackages;
    private boolean hasPaywallComponents;
    private final java.lang.String identifier;

    /* JADX INFO: renamed from: lifetime$delegate, reason: from kotlin metadata */
    private final p070h6.h lifetime;
    private final java.util.Map<java.lang.String, java.lang.Object> metadata;

    /* JADX INFO: renamed from: monthly$delegate, reason: from kotlin metadata */
    private final p070h6.h monthly;
    private final com.revenuecat.purchases.paywalls.PaywallData paywall;
    private final com.revenuecat.purchases.Offering.PaywallComponents paywallComponents;
    private final java.lang.String serverDescription;

    /* JADX INFO: renamed from: sixMonth$delegate, reason: from kotlin metadata */
    private final p070h6.h sixMonth;

    /* JADX INFO: renamed from: threeMonth$delegate, reason: from kotlin metadata */
    private final p070h6.h threeMonth;

    /* JADX INFO: renamed from: twoMonth$delegate, reason: from kotlin metadata */
    private final p070h6.h twoMonth;
    private final java.net.URL webCheckoutURL;

    /* JADX INFO: renamed from: weekly$delegate, reason: from kotlin metadata */
    private final p070h6.h weekly;

    public Offering(java.lang.String identifier, java.lang.String serverDescription, java.util.Map<java.lang.String, ? extends java.lang.Object> metadata, java.util.List<com.revenuecat.purchases.Package> availablePackages, com.revenuecat.purchases.paywalls.PaywallData paywallData, com.revenuecat.purchases.Offering.PaywallComponents paywallComponents, java.net.URL url) {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        kotlin.jvm.internal.m.e(serverDescription, "serverDescription");
        kotlin.jvm.internal.m.e(metadata, "metadata");
        kotlin.jvm.internal.m.e(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents;
        this.webCheckoutURL = url;
        this.lifetime = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$lifetime$2(this));
        this.annual = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$annual$2(this));
        this.sixMonth = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$sixMonth$2(this));
        this.threeMonth = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$threeMonth$2(this));
        this.twoMonth = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$twoMonth$2(this));
        this.monthly = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$monthly$2(this));
        this.weekly = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.Offering$weekly$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.revenuecat.purchases.Package findPackage(com.revenuecat.purchases.PackageType packageType) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.m.a(((com.revenuecat.purchases.Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (com.revenuecat.purchases.Package) next;
            }
        }
        next = null;
        return (com.revenuecat.purchases.Package) next;
    }

    public static /* synthetic */ void getPaywall$annotations() {
    }

    public static /* synthetic */ void getPaywallComponents$annotations() {
    }

    public static /* synthetic */ void getPresentedOfferingContext$annotations() {
    }

    public static /* synthetic */ void hasPaywall$annotations() {
    }

    public final com.revenuecat.purchases.Offering copy(com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.m.e(presentedOfferingContext, "presentedOfferingContext");
        java.lang.String str = this.identifier;
        java.lang.String str2 = this.serverDescription;
        java.util.Map<java.lang.String, java.lang.Object> map = this.metadata;
        java.util.List<com.revenuecat.purchases.Package> list = this.availablePackages;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.revenuecat.purchases.Package) it.next()).copy$purchases_defaultsRelease(presentedOfferingContext));
        }
        com.revenuecat.purchases.Offering offering = new com.revenuecat.purchases.Offering(str, str2, map, arrayList, this.paywall, this.paywallComponents, this.webCheckoutURL);
        offering.hasPaywallComponents = this.hasPaywallComponents;
        return offering;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.Offering)) {
            return false;
        }
        com.revenuecat.purchases.Offering offering = (com.revenuecat.purchases.Offering) obj;
        return kotlin.jvm.internal.m.a(this.identifier, offering.identifier) && kotlin.jvm.internal.m.a(this.serverDescription, offering.serverDescription) && kotlin.jvm.internal.m.a(this.metadata, offering.metadata) && kotlin.jvm.internal.m.a(this.availablePackages, offering.availablePackages) && kotlin.jvm.internal.m.a(this.paywall, offering.paywall) && kotlin.jvm.internal.m.a(this.paywallComponents, offering.paywallComponents) && kotlin.jvm.internal.m.a(this.webCheckoutURL, offering.webCheckoutURL);
    }

    public final com.revenuecat.purchases.Package get(java.lang.String s9) {
        kotlin.jvm.internal.m.e(s9, "s");
        return getPackage(s9);
    }

    public final com.revenuecat.purchases.Package getAnnual() {
        return (com.revenuecat.purchases.Package) this.annual.getValue();
    }

    public final java.util.List<com.revenuecat.purchases.Package> getAvailablePackages() {
        return this.availablePackages;
    }

    /* JADX INFO: renamed from: getHasPaywallComponents$purchases_defaultsRelease, reason: from getter */
    public final boolean getHasPaywallComponents() {
        return this.hasPaywallComponents;
    }

    public final java.lang.String getIdentifier() {
        return this.identifier;
    }

    public final com.revenuecat.purchases.Package getLifetime() {
        return (com.revenuecat.purchases.Package) this.lifetime.getValue();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return this.metadata;
    }

    public final java.lang.String getMetadataString(java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(str, "default");
        java.lang.Object obj = this.metadata.get(key);
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        return str2 == null ? str : str2;
    }

    public final com.revenuecat.purchases.Package getMonthly() {
        return (com.revenuecat.purchases.Package) this.monthly.getValue();
    }

    public final com.revenuecat.purchases.Package getPackage(java.lang.String identifier) {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        for (com.revenuecat.purchases.Package r9 : this.availablePackages) {
            if (kotlin.jvm.internal.m.a(r9.getIdentifier(), identifier)) {
                return r9;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final com.revenuecat.purchases.paywalls.PaywallData getPaywall() {
        return this.paywall;
    }

    public final com.revenuecat.purchases.Offering.PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        com.revenuecat.purchases.Package r9 = (com.revenuecat.purchases.Package) p078i6.o.j1(this.availablePackages);
        if (r9 != null) {
            return r9.getPresentedOfferingContext();
        }
        return null;
    }

    public final java.lang.String getServerDescription() {
        return this.serverDescription;
    }

    public final com.revenuecat.purchases.Package getSixMonth() {
        return (com.revenuecat.purchases.Package) this.sixMonth.getValue();
    }

    public final com.revenuecat.purchases.Package getThreeMonth() {
        return (com.revenuecat.purchases.Package) this.threeMonth.getValue();
    }

    public final com.revenuecat.purchases.Package getTwoMonth() {
        return (com.revenuecat.purchases.Package) this.twoMonth.getValue();
    }

    public final java.net.URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public final com.revenuecat.purchases.Package getWeekly() {
        return (com.revenuecat.purchases.Package) this.weekly.getValue();
    }

    public final boolean hasPaywall() {
        return (this.paywall == null && this.paywallComponents == null && !this.hasPaywallComponents) ? false : true;
    }

    public int hashCode() {
        int iB = B2.a.b(B2.a.c(B2.a.a(this.identifier.hashCode() * 31, 31, this.serverDescription), 31, this.metadata), 31, this.availablePackages);
        com.revenuecat.purchases.paywalls.PaywallData paywallData = this.paywall;
        int iHashCode = (iB + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        com.revenuecat.purchases.Offering.PaywallComponents paywallComponents = this.paywallComponents;
        int iHashCode2 = (iHashCode + (paywallComponents == null ? 0 : paywallComponents.hashCode())) * 31;
        java.net.URL url = this.webCheckoutURL;
        return iHashCode2 + (url != null ? url.hashCode() : 0);
    }

    public final void setHasPaywallComponents$purchases_defaultsRelease(boolean z6) {
        this.hasPaywallComponents = z6;
    }

    public java.lang.String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rB'\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\n\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010#\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/Offering$PaywallComponents;", "", "Lcom/revenuecat/purchases/UiConfig;", "uiConfig", "", "componentsHash", "Lh6/h;", "Lh6/n;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "dataResult", "<init>", "(Lcom/revenuecat/purchases/UiConfig;Ljava/lang/String;Lh6/h;)V", "data", "(Lcom/revenuecat/purchases/UiConfig;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "Lkotlin/Function0;", "dataProvider", "(Lcom/revenuecat/purchases/UiConfig;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/UiConfig;", "getUiConfig", "()Lcom/revenuecat/purchases/UiConfig;", "Ljava/lang/String;", "Lh6/h;", "getData-d1pmJ48", "()Ljava/lang/Object;", "getDataOrNull", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "dataOrNull", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PaywallComponents {
        private final java.lang.String componentsHash;
        private final p070h6.h dataResult;
        private final com.revenuecat.purchases.UiConfig uiConfig;

        /* JADX INFO: renamed from: com.revenuecat.purchases.Offering$PaywallComponents$1, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh6/n;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "invoke-d1pmJ48", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ kotlin.jvm.functions.Function0 $dataProvider;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(kotlin.jvm.functions.Function0 function0) {
                super(0);
                this.$dataProvider = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ java.lang.Object invoke() {
                return new p070h6.n(m46invoked1pmJ48());
            }

            /* JADX INFO: renamed from: invoke-d1pmJ48, reason: not valid java name */
            public final java.lang.Object m46invoked1pmJ48() {
                try {
                    return this.$dataProvider.invoke();
                } catch (java.lang.Throwable th) {
                    return com.google.common.util.concurrent.P.T(th);
                }
            }
        }

        private PaywallComponents(com.revenuecat.purchases.UiConfig uiConfig, java.lang.String str, p070h6.h hVar) {
            this.uiConfig = uiConfig;
            this.componentsHash = str;
            this.dataResult = hVar;
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.Offering.PaywallComponents)) {
                return false;
            }
            com.revenuecat.purchases.Offering.PaywallComponents paywallComponents = (com.revenuecat.purchases.Offering.PaywallComponents) other;
            return kotlin.jvm.internal.m.a(this.uiConfig, paywallComponents.uiConfig) && kotlin.jvm.internal.m.a(this.componentsHash, paywallComponents.componentsHash);
        }

        /* JADX INFO: renamed from: getData-d1pmJ48, reason: not valid java name */
        public final java.lang.Object m45getDatad1pmJ48() {
            return ((p070h6.n) this.dataResult.getValue()).f22542h;
        }

        public final com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData getDataOrNull() {
            java.lang.Object obj = ((p070h6.n) this.dataResult.getValue()).f22542h;
            if (obj instanceof p070h6.m) {
                obj = null;
            }
            return (com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData) obj;
        }

        public final com.revenuecat.purchases.UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return this.componentsHash.hashCode() + (this.uiConfig.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PaywallComponents(com.revenuecat.purchases.UiConfig uiConfig, com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData data) {
            this(uiConfig, java.lang.String.valueOf(data.hashCode()), new p070h6.f(new p070h6.n(data)));
            kotlin.jvm.internal.m.e(uiConfig, "uiConfig");
            kotlin.jvm.internal.m.e(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PaywallComponents(com.revenuecat.purchases.UiConfig uiConfig, java.lang.String componentsHash, kotlin.jvm.functions.Function0 dataProvider) {
            this(uiConfig, componentsHash, com.google.common.util.concurrent.D.A(p070h6.i.f22536h, new com.revenuecat.purchases.Offering.PaywallComponents.AnonymousClass1(dataProvider)));
            kotlin.jvm.internal.m.e(uiConfig, "uiConfig");
            kotlin.jvm.internal.m.e(componentsHash, "componentsHash");
            kotlin.jvm.internal.m.e(dataProvider, "dataProvider");
        }
    }

    public /* synthetic */ Offering(java.lang.String str, java.lang.String str2, java.util.Map map, java.util.List list, com.revenuecat.purchases.paywalls.PaywallData paywallData, com.revenuecat.purchases.Offering.PaywallComponents paywallComponents, java.net.URL url, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, map, list, (i3 & 16) != 0 ? null : paywallData, (i3 & 32) != 0 ? null : paywallComponents, (i3 & 64) != 0 ? null : url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(java.lang.String identifier, java.lang.String serverDescription, java.util.Map<java.lang.String, ? extends java.lang.Object> metadata, java.util.List<com.revenuecat.purchases.Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, null, null);
        kotlin.jvm.internal.m.e(identifier, "identifier");
        kotlin.jvm.internal.m.e(serverDescription, "serverDescription");
        kotlin.jvm.internal.m.e(metadata, "metadata");
        kotlin.jvm.internal.m.e(availablePackages, "availablePackages");
    }
}
