package com.revenuecat.purchases.common.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class EventsManager$Companion$paywalls$2 extends kotlin.jvm.internal.j implements p194x6.j {
    public EventsManager$Companion$paywalls$2(java.lang.Object obj) {
        super(1, 0, com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.Companion.class, obj, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;");
    }

    @Override // p194x6.j
    public final com.revenuecat.purchases.paywalls.events.PaywallStoredEvent invoke(java.lang.String p2) {
        kotlin.jvm.internal.m.e(p2, "p0");
        return ((com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.Companion) this.receiver).fromString(p2);
    }
}
