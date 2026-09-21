package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "", "", "amountMicros", "", "currency", "<init>", "(JLjava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IJLjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/networking/WebBillingPrice;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getAmountMicros", "getAmountMicros$annotations", "()V", "Ljava/lang/String;", "getCurrency", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WebBillingPrice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.networking.WebBillingPrice.Companion INSTANCE = new com.revenuecat.purchases.common.networking.WebBillingPrice.Companion(null);
    private final long amountMicros;
    private final java.lang.String currency;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingPrice$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/networking/WebBillingPrice;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.networking.WebBillingPrice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ WebBillingPrice(int i3, @p119n8.h("amount_micros") long j, java.lang.String str, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.common.networking.WebBillingPrice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.amountMicros = j;
        this.currency = str;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.networking.WebBillingPrice copy$default(com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice, long j, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = webBillingPrice.amountMicros;
        }
        if ((i3 & 2) != 0) {
            str = webBillingPrice.currency;
        }
        return webBillingPrice.copy(j, str);
    }

    @p119n8.h("amount_micros")
    public static /* synthetic */ void getAmountMicros$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.networking.WebBillingPrice self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.D(serialDesc, 0, self.amountMicros);
        output.s(serialDesc, 1, self.currency);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmountMicros() {
        return this.amountMicros;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final com.revenuecat.purchases.common.networking.WebBillingPrice copy(long amountMicros, java.lang.String currency) {
        kotlin.jvm.internal.m.e(currency, "currency");
        return new com.revenuecat.purchases.common.networking.WebBillingPrice(amountMicros, currency);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.WebBillingPrice)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.WebBillingPrice webBillingPrice = (com.revenuecat.purchases.common.networking.WebBillingPrice) other;
        return this.amountMicros == webBillingPrice.amountMicros && kotlin.jvm.internal.m.a(this.currency, webBillingPrice.currency);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return this.currency.hashCode() + (java.lang.Long.hashCode(this.amountMicros) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebBillingPrice(amountMicros=");
        sb.append(this.amountMicros);
        sb.append(", currency=");
        return Y6.f.l(sb, this.currency, ')');
    }

    public WebBillingPrice(long j, java.lang.String currency) {
        kotlin.jvm.internal.m.e(currency, "currency");
        this.amountMicros = j;
        this.currency = currency;
    }
}
