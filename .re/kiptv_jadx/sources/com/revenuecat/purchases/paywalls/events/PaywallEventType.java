package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMPRESSION", "CANCEL", "CLOSE", "PURCHASE_INITIATED", "PURCHASE_ERROR", "EXIT_OFFER", "COMPONENT_INTERACTION", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public enum PaywallEventType {
    IMPRESSION("paywall_impression"),
    CANCEL("paywall_cancel"),
    CLOSE("paywall_close"),
    PURCHASE_INITIATED("paywall_purchase_initiated"),
    PURCHASE_ERROR("paywall_purchase_error"),
    EXIT_OFFER("paywall_exit_offer"),
    COMPONENT_INTERACTION("paywall_component_interacted");

    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.events.PaywallEventType.Companion INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallEventType.Companion(null);
    private static final p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.events.PaywallEventType.Companion.AnonymousClass1.INSTANCE);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventType$Companion$1, reason: invalid class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            public static final com.revenuecat.purchases.paywalls.events.PaywallEventType.Companion.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallEventType.Companion.AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer invoke() {
                return p153r8.AbstractC2686a0.f("com.revenuecat.purchases.paywalls.events.PaywallEventType", com.revenuecat.purchases.paywalls.events.PaywallEventType.values());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
            return (kotlinx.serialization.KSerializer) com.revenuecat.purchases.paywalls.events.PaywallEventType.$cachedSerializer$delegate.getValue();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    PaywallEventType(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
