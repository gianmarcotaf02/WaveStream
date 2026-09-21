package com.revenuecat.purchases.ads.events.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/ads/events/networking/AdEventsRequest;", "", "", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "events", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/List;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/ads/events/networking/AdEventsRequest;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/revenuecat/purchases/ads/events/networking/AdEventsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "getCacheKey", "cacheKey", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class AdEventsRequest {
    private final java.util.List<com.revenuecat.purchases.common.events.BackendEvent.Ad> events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ads.events.networking.AdEventsRequest.Companion INSTANCE = new com.revenuecat.purchases.ads.events.networking.AdEventsRequest.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.C2691d(com.revenuecat.purchases.common.events.BackendEvent$Ad$$serializer.INSTANCE, 0)};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/ads/events/networking/AdEventsRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/ads/events/networking/AdEventsRequest;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.ads.events.networking.AdEventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ AdEventsRequest(int i3, java.util.List list, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.events = list;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.ads.events.networking.AdEventsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.ads.events.networking.AdEventsRequest copy$default(com.revenuecat.purchases.ads.events.networking.AdEventsRequest adEventsRequest, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            list = adEventsRequest.events;
        }
        return adEventsRequest.copy(list);
    }

    public final java.util.List<com.revenuecat.purchases.common.events.BackendEvent.Ad> component1() {
        return this.events;
    }

    public final com.revenuecat.purchases.ads.events.networking.AdEventsRequest copy(java.util.List<com.revenuecat.purchases.common.events.BackendEvent.Ad> events) {
        kotlin.jvm.internal.m.e(events, "events");
        return new com.revenuecat.purchases.ads.events.networking.AdEventsRequest(events);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.revenuecat.purchases.ads.events.networking.AdEventsRequest) && kotlin.jvm.internal.m.a(this.events, ((com.revenuecat.purchases.ads.events.networking.AdEventsRequest) other).events);
    }

    public final java.util.List<java.lang.String> getCacheKey() {
        java.util.List<com.revenuecat.purchases.common.events.BackendEvent.Ad> list = this.events;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((com.revenuecat.purchases.common.events.BackendEvent.Ad) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final java.util.List<com.revenuecat.purchases.common.events.BackendEvent.Ad> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.M0.n(new java.lang.StringBuilder("AdEventsRequest(events="), this.events, ')');
    }

    public AdEventsRequest(java.util.List<com.revenuecat.purchases.common.events.BackendEvent.Ad> events) {
        kotlin.jvm.internal.m.e(events, "events");
        this.events = events;
    }
}
