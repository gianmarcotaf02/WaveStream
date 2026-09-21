package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001c¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "price", "", "periodDuration", "", "cycleCount", "<init>", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;I)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;ILr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/networking/WebBillingPhase;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "component2", "()Ljava/lang/String;", "component3", "()I", "copy", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Ljava/lang/String;I)Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "toString", "hashCode", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "getPrice", "Ljava/lang/String;", "getPeriodDuration", "getPeriodDuration$annotations", "()V", "I", "getCycleCount", "getCycleCount$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WebBillingPhase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.networking.WebBillingPhase.Companion INSTANCE = new com.revenuecat.purchases.common.networking.WebBillingPhase.Companion(null);
    private final int cycleCount;
    private final java.lang.String periodDuration;
    private final com.revenuecat.purchases.common.networking.WebBillingPrice price;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPhase$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/networking/WebBillingPhase;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.networking.WebBillingPhase$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebBillingPhase() {
        this((com.revenuecat.purchases.common.networking.WebBillingPrice) null, (java.lang.String) null, 0, 7, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    public static /* synthetic */ com.revenuecat.purchases.common.networking.WebBillingPhase copy$default(com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase, com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, java.lang.String str, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            webBillingPrice = webBillingPhase.price;
        }
        if ((i9 & 2) != 0) {
            str = webBillingPhase.periodDuration;
        }
        if ((i9 & 4) != 0) {
            i3 = webBillingPhase.cycleCount;
        }
        return webBillingPhase.copy(webBillingPrice, str, i3);
    }

    @p119n8.h("cycle_count")
    public static /* synthetic */ void getCycleCount$annotations() {
    }

    @p119n8.h("period_duration")
    public static /* synthetic */ void getPeriodDuration$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.networking.WebBillingPhase self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.price != null) {
            output.t(serialDesc, 0, com.revenuecat.purchases.common.networking.WebBillingPrice$$serializer.INSTANCE, self.price);
        }
        if (output.E(serialDesc) || self.periodDuration != null) {
            output.t(serialDesc, 1, p153r8.p0.f26988a, self.periodDuration);
        }
        if (!output.E(serialDesc) && self.cycleCount == 1) {
            return;
        }
        output.n(2, self.cycleCount, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.common.networking.WebBillingPrice getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPeriodDuration() {
        return this.periodDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPhase copy(com.revenuecat.purchases.common.networking.WebBillingPrice price, java.lang.String periodDuration, int cycleCount) {
        return new com.revenuecat.purchases.common.networking.WebBillingPhase(price, periodDuration, cycleCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.WebBillingPhase)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.WebBillingPhase webBillingPhase = (com.revenuecat.purchases.common.networking.WebBillingPhase) other;
        return kotlin.jvm.internal.m.a(this.price, webBillingPhase.price) && kotlin.jvm.internal.m.a(this.periodDuration, webBillingPhase.periodDuration) && this.cycleCount == webBillingPhase.cycleCount;
    }

    public final int getCycleCount() {
        return this.cycleCount;
    }

    public final java.lang.String getPeriodDuration() {
        return this.periodDuration;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPrice getPrice() {
        return this.price;
    }

    public int hashCode() {
        com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice = this.price;
        int iHashCode = (webBillingPrice == null ? 0 : webBillingPrice.hashCode()) * 31;
        java.lang.String str = this.periodDuration;
        return java.lang.Integer.hashCode(this.cycleCount) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebBillingPhase(price=");
        sb.append(this.price);
        sb.append(", periodDuration=");
        sb.append(this.periodDuration);
        sb.append(", cycleCount=");
        return Y6.f.j(sb, this.cycleCount, ')');
    }

    @p070h6.c
    public /* synthetic */ WebBillingPhase(int i3, com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, @p119n8.h("period_duration") java.lang.String str, @p119n8.h("cycle_count") int i9, p153r8.k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.price = null;
        } else {
            this.price = webBillingPrice;
        }
        if ((i3 & 2) == 0) {
            this.periodDuration = null;
        } else {
            this.periodDuration = str;
        }
        if ((i3 & 4) == 0) {
            this.cycleCount = 1;
        } else {
            this.cycleCount = i9;
        }
    }

    public WebBillingPhase(com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, java.lang.String str, int i3) {
        this.price = webBillingPrice;
        this.periodDuration = str;
        this.cycleCount = i3;
    }

    public /* synthetic */ WebBillingPhase(com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, java.lang.String str, int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? null : webBillingPrice, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? 1 : i3);
    }
}
