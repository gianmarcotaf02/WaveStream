package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBG\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u001b¨\u00064"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "basePrice", "Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "trial", "introPrice", "<init>", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/networking/WebBillingPrice;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "component2", "()Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "component3", "component4", "copy", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lcom/revenuecat/purchases/common/networking/WebBillingPhase;)Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "getBasePrice", "getBasePrice$annotations", "()V", "Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "getBase", "getTrial", "getIntroPrice", "getIntroPrice$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WebBillingPurchaseOption {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.networking.WebBillingPurchaseOption.Companion INSTANCE = new com.revenuecat.purchases.common.networking.WebBillingPurchaseOption.Companion(null);
    private final com.revenuecat.purchases.common.networking.WebBillingPhase base;
    private final com.revenuecat.purchases.common.networking.WebBillingPrice basePrice;
    private final com.revenuecat.purchases.common.networking.WebBillingPhase introPrice;
    private final com.revenuecat.purchases.common.networking.WebBillingPhase trial;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.networking.WebBillingPurchaseOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebBillingPurchaseOption() {
        this((com.revenuecat.purchases.common.networking.WebBillingPrice) null, (com.revenuecat.purchases.common.networking.WebBillingPhase) null, (com.revenuecat.purchases.common.networking.WebBillingPhase) null, (com.revenuecat.purchases.common.networking.WebBillingPhase) null, 15, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    public static /* synthetic */ com.revenuecat.purchases.common.networking.WebBillingPurchaseOption copy$default(com.revenuecat.purchases.common.networking.WebBillingPurchaseOption webBillingPurchaseOption, com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase2, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            webBillingPrice = webBillingPurchaseOption.basePrice;
        }
        if ((i3 & 2) != 0) {
            webBillingPhase = webBillingPurchaseOption.base;
        }
        if ((i3 & 4) != 0) {
            webBillingPhase2 = webBillingPurchaseOption.trial;
        }
        if ((i3 & 8) != 0) {
            webBillingPhase3 = webBillingPurchaseOption.introPrice;
        }
        return webBillingPurchaseOption.copy(webBillingPrice, webBillingPhase, webBillingPhase2, webBillingPhase3);
    }

    @p119n8.h("base_price")
    public static /* synthetic */ void getBasePrice$annotations() {
    }

    @p119n8.h("intro_price")
    public static /* synthetic */ void getIntroPrice$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.networking.WebBillingPurchaseOption self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.basePrice != null) {
            output.t(serialDesc, 0, com.revenuecat.purchases.common.networking.WebBillingPrice$$serializer.INSTANCE, self.basePrice);
        }
        if (output.E(serialDesc) || self.base != null) {
            output.t(serialDesc, 1, com.revenuecat.purchases.common.networking.WebBillingPhase$$serializer.INSTANCE, self.base);
        }
        if (output.E(serialDesc) || self.trial != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.common.networking.WebBillingPhase$$serializer.INSTANCE, self.trial);
        }
        if (!output.E(serialDesc) && self.introPrice == null) {
            return;
        }
        output.t(serialDesc, 3, com.revenuecat.purchases.common.networking.WebBillingPhase$$serializer.INSTANCE, self.introPrice);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.common.networking.WebBillingPrice getBasePrice() {
        return this.basePrice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.networking.WebBillingPhase getBase() {
        return this.base;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.common.networking.WebBillingPhase getTrial() {
        return this.trial;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.common.networking.WebBillingPhase getIntroPrice() {
        return this.introPrice;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPurchaseOption copy(com.revenuecat.purchases.common.networking.WebBillingPrice basePrice, com.revenuecat.purchases.common.networking.WebBillingPhase base, com.revenuecat.purchases.common.networking.WebBillingPhase trial, com.revenuecat.purchases.common.networking.WebBillingPhase introPrice) {
        return new com.revenuecat.purchases.common.networking.WebBillingPurchaseOption(basePrice, base, trial, introPrice);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.WebBillingPurchaseOption)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.WebBillingPurchaseOption webBillingPurchaseOption = (com.revenuecat.purchases.common.networking.WebBillingPurchaseOption) other;
        return kotlin.jvm.internal.m.a(this.basePrice, webBillingPurchaseOption.basePrice) && kotlin.jvm.internal.m.a(this.base, webBillingPurchaseOption.base) && kotlin.jvm.internal.m.a(this.trial, webBillingPurchaseOption.trial) && kotlin.jvm.internal.m.a(this.introPrice, webBillingPurchaseOption.introPrice);
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPhase getBase() {
        return this.base;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPrice getBasePrice() {
        return this.basePrice;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPhase getIntroPrice() {
        return this.introPrice;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPhase getTrial() {
        return this.trial;
    }

    public int hashCode() {
        com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice = this.basePrice;
        int iHashCode = (webBillingPrice == null ? 0 : webBillingPrice.hashCode()) * 31;
        com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase = this.base;
        int iHashCode2 = (iHashCode + (webBillingPhase == null ? 0 : webBillingPhase.hashCode())) * 31;
        com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase2 = this.trial;
        int iHashCode3 = (iHashCode2 + (webBillingPhase2 == null ? 0 : webBillingPhase2.hashCode())) * 31;
        com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase3 = this.introPrice;
        return iHashCode3 + (webBillingPhase3 != null ? webBillingPhase3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WebBillingPurchaseOption(basePrice=" + this.basePrice + ", base=" + this.base + ", trial=" + this.trial + ", introPrice=" + this.introPrice + ')';
    }

    @p070h6.c
    public /* synthetic */ WebBillingPurchaseOption(int i3, @p119n8.h("base_price") com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase2, @p119n8.h("intro_price") com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase3, p153r8.k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.basePrice = null;
        } else {
            this.basePrice = webBillingPrice;
        }
        if ((i3 & 2) == 0) {
            this.base = null;
        } else {
            this.base = webBillingPhase;
        }
        if ((i3 & 4) == 0) {
            this.trial = null;
        } else {
            this.trial = webBillingPhase2;
        }
        if ((i3 & 8) == 0) {
            this.introPrice = null;
        } else {
            this.introPrice = webBillingPhase3;
        }
    }

    public WebBillingPurchaseOption(com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase2, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase3) {
        this.basePrice = webBillingPrice;
        this.base = webBillingPhase;
        this.trial = webBillingPhase2;
        this.introPrice = webBillingPhase3;
    }

    public /* synthetic */ WebBillingPurchaseOption(com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase2, com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : webBillingPrice, (i3 & 2) != 0 ? null : webBillingPhase, (i3 & 4) != 0 ? null : webBillingPhase2, (i3 & 8) != 0 ? null : webBillingPhase3);
    }
}
