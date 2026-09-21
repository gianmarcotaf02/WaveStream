package com.revenuecat.purchases.paywalls.events;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.utils.Event;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;
import p162s8.c;
import p162s8.d;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "", "userID", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toBackendEvent", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toString", "()Ljava/lang/String;", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component2", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getEvent", "Ljava/lang/String;", "getUserID", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class PaywallStoredEvent implements Event {

    public static final Companion INSTANCE = new Companion(null);
    private static final c json = d.f27387d;
    private final PaywallEvent event;
    private final String userID;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent$Companion;", "", "<init>", "()V", "", "string", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fromString", "(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ls8/c;", "json", "Ls8/c;", "getJson", "()Ls8/c;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final PaywallStoredEvent fromString(String string) {
            m.e(string, "string");
            c json = getJson();
            json.getClass();
            return (PaywallStoredEvent) json.b(string, PaywallStoredEvent.INSTANCE.serializer());
        }

        public final c getJson() {
            return PaywallStoredEvent.json;
        }

        public final KSerializer serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public PaywallStoredEvent(int i3, PaywallEvent paywallEvent, String str, k0 k0Var) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i3 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final void write$Self$purchases_defaultsRelease(PaywallStoredEvent self, b output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, PaywallEvent$$serializer.INSTANCE, self.event);
        output.s(serialDesc, 1, self.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent event, String userID) {
        m.e(event, "event");
        m.e(userID, "userID");
        return new PaywallStoredEvent(event, userID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) other;
        return m.a(this.event, paywallStoredEvent.event) && m.a(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userID.hashCode() + (this.event.hashCode() * 31);
    }

    public final BackendEvent.Paywalls toBackendEvent() {
        BackendPaywallComponentFields backendComponentFields = PaywallEventKt.toBackendComponentFields(this.event.getComponentInteraction());
        String string = this.event.getCreationData().getId().toString();
        m.d(string, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String string2 = this.event.getData().getSessionIdentifier().toString();
        m.d(string2, "event.data.sessionIdentifier.toString()");
        String offeringIdentifier = this.event.getData().getPresentedOfferingContext().getOfferingIdentifier();
        String paywallIdentifier = this.event.getData().getPaywallIdentifier();
        int paywallRevision = this.event.getData().getPaywallRevision();
        long time = this.event.getCreationData().getDate().getTime();
        String displayMode = this.event.getData().getDisplayMode();
        boolean darkMode = this.event.getData().getDarkMode();
        String localeIdentifier = this.event.getData().getLocaleIdentifier();
        String workflowId = this.event.getData().getWorkflowId();
        BackendEvent.PresentedOfferingContextData presentedOfferingContextDataFromContext = BackendEvent.PresentedOfferingContextData.INSTANCE.fromContext(this.event.getData().getPresentedOfferingContext(), this.event.getData().getPaywallIdentifier(), this.event.getData().getWorkflowId());
        ExitOfferType exitOfferType = this.event.getData().getExitOfferType();
        return new BackendEvent.Paywalls(string, 1, value, str, string2, offeringIdentifier, paywallIdentifier, paywallRevision, time, displayMode, darkMode, localeIdentifier, workflowId, presentedOfferingContextDataFromContext, exitOfferType != null ? exitOfferType.getValue() : null, this.event.getData().getExitOfferingIdentifier(), this.event.getData().getPackageIdentifier(), this.event.getData().getProductIdentifier(), this.event.getData().getErrorCode(), this.event.getData().getErrorMessage(), backendComponentFields.getComponentType(), backendComponentFields.getComponentName(), backendComponentFields.getComponentValue(), backendComponentFields.getComponentUrl(), backendComponentFields.getOriginIndex(), backendComponentFields.getDestinationIndex(), backendComponentFields.getOriginContextName(), backendComponentFields.getDestinationContextName(), backendComponentFields.getDefaultIndex(), backendComponentFields.getOriginPackageIdentifier(), backendComponentFields.getDestinationPackageIdentifier(), backendComponentFields.getDefaultPackageIdentifier(), backendComponentFields.getOriginProductIdentifier(), backendComponentFields.getDestinationProductIdentifier(), backendComponentFields.getDefaultProductIdentifier(), backendComponentFields.getCurrentPackageIdentifier(), backendComponentFields.getResultingPackageIdentifier(), backendComponentFields.getCurrentProductIdentifier(), backendComponentFields.getResultingProductIdentifier());
    }

    @Override
    public String toString() {
        c cVar = json;
        cVar.getClass();
        return cVar.d(INSTANCE.serializer(), this);
    }

    public PaywallStoredEvent(PaywallEvent event, String userID) {
        m.e(event, "event");
        m.e(userID, "userID");
        this.event = event;
        this.userID = userID;
    }
}
