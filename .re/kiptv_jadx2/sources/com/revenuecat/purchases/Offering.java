package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.common.workflows.WorkflowScreenType;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.f;
import p070h6.h;
import p070h6.i;
import p070h6.n;
import p078i6.o;
import p078i6.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b$\u0018\u00002\u00020\u0001:\u0001\\B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001d\u0010D\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010G\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u001d\u0010J\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010A\u001a\u0004\bI\u0010CR\u001d\u0010M\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010CR\u001d\u0010P\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u001d\u0010S\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010CR\u001d\u0010V\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010CR\u0017\u0010W\u001a\u0002098G¢\u0006\f\u0012\u0004\bX\u00101\u001a\u0004\bW\u0010=R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u00101\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "serverDescription", "", TtmlNode.TAG_METADATA, "", "Lcom/revenuecat/purchases/Package;", "availablePackages", "Lcom/revenuecat/purchases/paywalls/PaywallData;", WorkflowScreenType.PAYWALL, "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "paywallComponents", "Ljava/net/URL;", "webCheckoutURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/Offering$PaywallComponents;Ljava/net/URL;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", CmcdData.STREAMING_FORMAT_SS, "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/Package;", "getPackage", SubscriberAttributeKt.JSON_NAME_KEY, "default", "getMetadataString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "copy", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/PackageType;", "packageType", "findPackage", "(Lcom/revenuecat/purchases/PackageType;)Lcom/revenuecat/purchases/Package;", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "getServerDescription", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Ljava/util/List;", "getAvailablePackages", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall$annotations", "()V", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getPaywallComponents", "()Lcom/revenuecat/purchases/Offering$PaywallComponents;", "getPaywallComponents$annotations", "Ljava/net/URL;", "getWebCheckoutURL", "()Ljava/net/URL;", "", "hasPaywallComponents", "Z", "getHasPaywallComponents$purchases_defaultsRelease", "()Z", "setHasPaywallComponents$purchases_defaultsRelease", "(Z)V", "lifetime$delegate", "Lh6/h;", "getLifetime", "()Lcom/revenuecat/purchases/Package;", "lifetime", "annual$delegate", "getAnnual", "annual", "sixMonth$delegate", "getSixMonth", "sixMonth", "threeMonth$delegate", "getThreeMonth", "threeMonth", "twoMonth$delegate", "getTwoMonth", "twoMonth", "monthly$delegate", "getMonthly", "monthly", "weekly$delegate", "getWeekly", "weekly", "hasPaywall", "hasPaywall$annotations", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext$annotations", "PaywallComponents", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Offering {

    private final h annual;
    private final List<Package> availablePackages;
    private boolean hasPaywallComponents;
    private final String identifier;

    private final h lifetime;
    private final Map<String, Object> metadata;

    private final h monthly;
    private final PaywallData paywall;
    private final PaywallComponents paywallComponents;
    private final String serverDescription;

    private final h sixMonth;

    private final h threeMonth;

    private final h twoMonth;
    private final URL webCheckoutURL;

    private final h weekly;

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData, PaywallComponents paywallComponents, URL url) {
        m.e(identifier, "identifier");
        m.e(serverDescription, "serverDescription");
        m.e(metadata, "metadata");
        m.e(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents;
        this.webCheckoutURL = url;
        this.lifetime = D.B(new Offering$lifetime$2(this));
        this.annual = D.B(new Offering$annual$2(this));
        this.sixMonth = D.B(new Offering$sixMonth$2(this));
        this.threeMonth = D.B(new Offering$threeMonth$2(this));
        this.twoMonth = D.B(new Offering$twoMonth$2(this));
        this.monthly = D.B(new Offering$monthly$2(this));
        this.weekly = D.B(new Offering$weekly$2(this));
    }

    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m.a(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (Package) next;
            }
        }
        next = null;
        return (Package) next;
    }

    public static void getPaywall$annotations() {
    }

    public static void getPaywallComponents$annotations() {
    }

    public static void getPresentedOfferingContext$annotations() {
    }

    public static void hasPaywall$annotations() {
    }

    public final Offering copy(PresentedOfferingContext presentedOfferingContext) {
        m.e(presentedOfferingContext, "presentedOfferingContext");
        String str = this.identifier;
        String str2 = this.serverDescription;
        Map<String, Object> map = this.metadata;
        List<Package> list = this.availablePackages;
        ArrayList arrayList = new ArrayList(q.I0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).copy$purchases_defaultsRelease(presentedOfferingContext));
        }
        Offering offering = new Offering(str, str2, map, arrayList, this.paywall, this.paywallComponents, this.webCheckoutURL);
        offering.hasPaywallComponents = this.hasPaywallComponents;
        return offering;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return m.a(this.identifier, offering.identifier) && m.a(this.serverDescription, offering.serverDescription) && m.a(this.metadata, offering.metadata) && m.a(this.availablePackages, offering.availablePackages) && m.a(this.paywall, offering.paywall) && m.a(this.paywallComponents, offering.paywallComponents) && m.a(this.webCheckoutURL, offering.webCheckoutURL);
    }

    public final Package get(String s9) {
        m.e(s9, "s");
        return getPackage(s9);
    }

    public final Package getAnnual() {
        return (Package) this.annual.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final boolean getHasPaywallComponents() {
        return this.hasPaywallComponents;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String key, String str) {
        m.e(key, "key");
        m.e(str, "default");
        Object obj = this.metadata.get(key);
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? str : str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly.getValue();
    }

    public final Package getPackage(String identifier) {
        m.e(identifier, "identifier");
        for (Package r9 : this.availablePackages) {
            if (m.a(r9.getIdentifier(), identifier)) {
                return r9;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        Package r9 = (Package) o.j1(this.availablePackages);
        if (r9 != null) {
            return r9.getPresentedOfferingContext();
        }
        return null;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth.getValue();
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public final Package getWeekly() {
        return (Package) this.weekly.getValue();
    }

    public final boolean hasPaywall() {
        return (this.paywall == null && this.paywallComponents == null && !this.hasPaywallComponents) ? false : true;
    }

    public int hashCode() {
        int iB = B2.a.b(B2.a.c(B2.a.a(this.identifier.hashCode() * 31, 31, this.serverDescription), 31, this.metadata), 31, this.availablePackages);
        PaywallData paywallData = this.paywall;
        int iHashCode = (iB + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        PaywallComponents paywallComponents = this.paywallComponents;
        int iHashCode2 = (iHashCode + (paywallComponents == null ? 0 : paywallComponents.hashCode())) * 31;
        URL url = this.webCheckoutURL;
        return iHashCode2 + (url != null ? url.hashCode() : 0);
    }

    public final void setHasPaywallComponents$purchases_defaultsRelease(boolean z6) {
        this.hasPaywallComponents = z6;
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rB'\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\n\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010#\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/Offering$PaywallComponents;", "", "Lcom/revenuecat/purchases/UiConfig;", "uiConfig", "", "componentsHash", "Lh6/h;", "Lh6/n;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "dataResult", "<init>", "(Lcom/revenuecat/purchases/UiConfig;Ljava/lang/String;Lh6/h;)V", "data", "(Lcom/revenuecat/purchases/UiConfig;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "Lkotlin/Function0;", "dataProvider", "(Lcom/revenuecat/purchases/UiConfig;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/UiConfig;", "getUiConfig", "()Lcom/revenuecat/purchases/UiConfig;", "Ljava/lang/String;", "Lh6/h;", "getData-d1pmJ48", "()Ljava/lang/Object;", "getDataOrNull", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "dataOrNull", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PaywallComponents {
        private final String componentsHash;
        private final h dataResult;
        private final UiConfig uiConfig;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh6/n;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "invoke-d1pmJ48", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements Function0 {
            final Function0 $dataProvider;

            public AnonymousClass1(Function0 function0) {
                super(0);
                this.$dataProvider = function0;
            }

            @Override
            public Object invoke() {
                return new n(m46invoked1pmJ48());
            }

            public final Object m46invoked1pmJ48() {
                try {
                    return this.$dataProvider.invoke();
                } catch (Throwable th) {
                    return P.T(th);
                }
            }
        }

        private PaywallComponents(UiConfig uiConfig, String str, h hVar) {
            this.uiConfig = uiConfig;
            this.componentsHash = str;
            this.dataResult = hVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaywallComponents)) {
                return false;
            }
            PaywallComponents paywallComponents = (PaywallComponents) other;
            return m.a(this.uiConfig, paywallComponents.uiConfig) && m.a(this.componentsHash, paywallComponents.componentsHash);
        }

        public final Object m45getDatad1pmJ48() {
            return ((n) this.dataResult.getValue()).f22542h;
        }

        public final PaywallComponentsData getDataOrNull() {
            Object obj = ((n) this.dataResult.getValue()).f22542h;
            if (obj instanceof p070h6.m) {
                obj = null;
            }
            return (PaywallComponentsData) obj;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return this.componentsHash.hashCode() + (this.uiConfig.hashCode() * 31);
        }

        public String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ')';
        }

        public PaywallComponents(UiConfig uiConfig, PaywallComponentsData data) {
            this(uiConfig, String.valueOf(data.hashCode()), new f(new n(data)));
            m.e(uiConfig, "uiConfig");
            m.e(data, "data");
        }

        public PaywallComponents(UiConfig uiConfig, String componentsHash, Function0 dataProvider) {
            this(uiConfig, componentsHash, D.A(i.f22536h, new AnonymousClass1(dataProvider)));
            m.e(uiConfig, "uiConfig");
            m.e(componentsHash, "componentsHash");
            m.e(dataProvider, "dataProvider");
        }
    }

    public Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents, URL url, int i3, AbstractC2541f abstractC2541f) {
        this(str, str2, map, list, (i3 & 16) != 0 ? null : paywallData, (i3 & 32) != 0 ? null : paywallComponents, (i3 & 64) != 0 ? null : url);
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, null, null);
        m.e(identifier, "identifier");
        m.e(serverDescription, "serverDescription");
        m.e(metadata, "metadata");
        m.e(availablePackages, "availablePackages");
    }
}
