package com.revenuecat.purchases.common.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest;", "", "", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "events", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/events/EventsRequest;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getEvents$purchases_defaultsRelease", "()Ljava/util/List;", "", "getCacheKey", "cacheKey", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class EventsRequest {
    private final java.util.List<com.revenuecat.purchases.common.events.BackendEvent> events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.events.EventsRequest.Companion INSTANCE = new com.revenuecat.purchases.common.events.EventsRequest.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.C2691d(com.revenuecat.purchases.common.events.BackendEvent.INSTANCE.serializer(), 0)};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.events.EventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ EventsRequest(int i3, java.util.List list, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.events = list;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.common.events.EventsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.revenuecat.purchases.common.events.EventsRequest) && kotlin.jvm.internal.m.a(this.events, ((com.revenuecat.purchases.common.events.EventsRequest) obj).events);
    }

    public final java.util.List<java.lang.String> getCacheKey() {
        java.util.List<com.revenuecat.purchases.common.events.BackendEvent> list = this.events;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((com.revenuecat.purchases.common.events.BackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final java.util.List<com.revenuecat.purchases.common.events.BackendEvent> getEvents$purchases_defaultsRelease() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.M0.n(new java.lang.StringBuilder("EventsRequest(events="), this.events, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventsRequest(java.util.List<? extends com.revenuecat.purchases.common.events.BackendEvent> events) {
        kotlin.jvm.internal.m.e(events, "events");
        this.events = events;
    }
}
