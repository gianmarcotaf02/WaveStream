package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "", "userID", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toBackendEvent", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toString", "()Ljava/lang/String;", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component2", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getEvent", "Ljava/lang/String;", "getUserID", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PaywallStoredEvent implements com.revenuecat.purchases.utils.Event {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.Companion(null);
    private static final p162s8.c json = p162s8.d.f27387d;
    private final com.revenuecat.purchases.paywalls.events.PaywallEvent event;
    private final java.lang.String userID;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent$Companion;", "", "<init>", "()V", "", "string", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fromString", "(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ls8/c;", "json", "Ls8/c;", "getJson", "()Ls8/c;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.paywalls.events.PaywallStoredEvent fromString(java.lang.String string) {
            kotlin.jvm.internal.m.e(string, "string");
            p162s8.c json = getJson();
            json.getClass();
            return (com.revenuecat.purchases.paywalls.events.PaywallStoredEvent) json.b(string, com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.INSTANCE.serializer());
        }

        public final p162s8.c getJson() {
            return com.revenuecat.purchases.paywalls.events.PaywallStoredEvent.json;
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.events.PaywallStoredEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ PaywallStoredEvent(int i3, com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent, java.lang.String str, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.events.PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static /* synthetic */ com.revenuecat.purchases.paywalls.events.PaywallStoredEvent copy$default(com.revenuecat.purchases.paywalls.events.PaywallStoredEvent paywallStoredEvent, com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i3 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.events.PaywallStoredEvent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.events.PaywallEvent$$serializer.INSTANCE, self.event);
        output.s(serialDesc, 1, self.userID);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallEvent getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getUserID() {
        return this.userID;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallStoredEvent copy(com.revenuecat.purchases.paywalls.events.PaywallEvent event, java.lang.String userID) {
        kotlin.jvm.internal.m.e(event, "event");
        kotlin.jvm.internal.m.e(userID, "userID");
        return new com.revenuecat.purchases.paywalls.events.PaywallStoredEvent(event, userID);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.paywalls.events.PaywallStoredEvent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.events.PaywallStoredEvent paywallStoredEvent = (com.revenuecat.purchases.paywalls.events.PaywallStoredEvent) other;
        return kotlin.jvm.internal.m.a(this.event, paywallStoredEvent.event) && kotlin.jvm.internal.m.a(this.userID, paywallStoredEvent.userID);
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallEvent getEvent() {
        return this.event;
    }

    public final java.lang.String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userID.hashCode() + (this.event.hashCode() * 31);
    }

    public final com.revenuecat.purchases.common.events.BackendEvent.Paywalls toBackendEvent() {
        com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields backendComponentFields = com.revenuecat.purchases.paywalls.events.PaywallEventKt.toBackendComponentFields(this.event.getComponentInteraction());
        java.lang.String string = this.event.getCreationData().getId().toString();
        kotlin.jvm.internal.m.d(string, "event.creationData.id.toString()");
        java.lang.String value = this.event.getType().getValue();
        java.lang.String str = this.userID;
        java.lang.String string2 = this.event.getData().getSessionIdentifier().toString();
        kotlin.jvm.internal.m.d(string2, "event.data.sessionIdentifier.toString()");
        java.lang.String offeringIdentifier = this.event.getData().getPresentedOfferingContext().getOfferingIdentifier();
        java.lang.String paywallIdentifier = this.event.getData().getPaywallIdentifier();
        int paywallRevision = this.event.getData().getPaywallRevision();
        long time = this.event.getCreationData().getDate().getTime();
        java.lang.String displayMode = this.event.getData().getDisplayMode();
        boolean darkMode = this.event.getData().getDarkMode();
        java.lang.String localeIdentifier = this.event.getData().getLocaleIdentifier();
        java.lang.String workflowId = this.event.getData().getWorkflowId();
        com.revenuecat.purchases.common.events.BackendEvent.PresentedOfferingContextData presentedOfferingContextDataFromContext = com.revenuecat.purchases.common.events.BackendEvent.PresentedOfferingContextData.INSTANCE.fromContext(this.event.getData().getPresentedOfferingContext(), this.event.getData().getPaywallIdentifier(), this.event.getData().getWorkflowId());
        com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType = this.event.getData().getExitOfferType();
        return new com.revenuecat.purchases.common.events.BackendEvent.Paywalls(string, 1, value, str, string2, offeringIdentifier, paywallIdentifier, paywallRevision, time, displayMode, darkMode, localeIdentifier, workflowId, presentedOfferingContextDataFromContext, exitOfferType != null ? exitOfferType.getValue() : null, this.event.getData().getExitOfferingIdentifier(), this.event.getData().getPackageIdentifier(), this.event.getData().getProductIdentifier(), this.event.getData().getErrorCode(), this.event.getData().getErrorMessage(), backendComponentFields.getComponentType(), backendComponentFields.getComponentName(), backendComponentFields.getComponentValue(), backendComponentFields.getComponentUrl(), backendComponentFields.getOriginIndex(), backendComponentFields.getDestinationIndex(), backendComponentFields.getOriginContextName(), backendComponentFields.getDestinationContextName(), backendComponentFields.getDefaultIndex(), backendComponentFields.getOriginPackageIdentifier(), backendComponentFields.getDestinationPackageIdentifier(), backendComponentFields.getDefaultPackageIdentifier(), backendComponentFields.getOriginProductIdentifier(), backendComponentFields.getDestinationProductIdentifier(), backendComponentFields.getDefaultProductIdentifier(), backendComponentFields.getCurrentPackageIdentifier(), backendComponentFields.getResultingPackageIdentifier(), backendComponentFields.getCurrentProductIdentifier(), backendComponentFields.getResultingProductIdentifier());
    }

    @Override // com.revenuecat.purchases.utils.Event
    public java.lang.String toString() {
        p162s8.c cVar = json;
        cVar.getClass();
        return cVar.d(INSTANCE.serializer(), this);
    }

    public PaywallStoredEvent(com.revenuecat.purchases.paywalls.events.PaywallEvent event, java.lang.String userID) {
        kotlin.jvm.internal.m.e(event, "event");
        kotlin.jvm.internal.m.e(userID, "userID");
        this.event = event;
        this.userID = userID;
    }
}
