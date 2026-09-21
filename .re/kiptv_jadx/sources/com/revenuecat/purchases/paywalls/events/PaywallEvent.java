package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0004=<>?B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J:\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R\u0014\u0010:\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "creationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "data", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "type", "Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;", "componentInteraction", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "component2", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "component4", "()Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "getCreationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "getData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "getType", "Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;", "getComponentInteraction", "isPriorityEvent", "()Z", "Companion", "$serializer", "CreationData", "Data", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PaywallEvent implements com.revenuecat.purchases.common.events.FeatureEvent {
    private final com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData componentInteraction;
    private final com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData;
    private final com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data;
    private final com.revenuecat.purchases.paywalls.events.PaywallEventType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.events.PaywallEvent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallEvent.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {null, null, com.revenuecat.purchases.paywalls.events.PaywallEventType.INSTANCE.serializer(), null};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.events.PaywallEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "Ljava/util/UUID;", "id", "Ljava/util/Date;", "date", "<init>", "(Ljava/util/UUID;Ljava/util/Date;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/Date;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/util/Date;", "copy", "(Ljava/util/UUID;Ljava/util/Date;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getId$annotations", "()V", "Ljava/util/Date;", "getDate", "getDate$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class CreationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData.Companion INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData.Companion(null);
        private final java.util.Date date;
        private final java.util.UUID id;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ CreationData(int i3, @p119n8.i(with = com.revenuecat.purchases.utils.serializers.UUIDSerializer.class) java.util.UUID uuid, @p119n8.i(with = com.revenuecat.purchases.utils.serializers.DateSerializer.class) java.util.Date date, p153r8.k0 k0Var) {
            if (3 != (i3 & 3)) {
                p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = uuid;
            this.date = date;
        }

        public static /* synthetic */ com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData copy$default(com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData, java.util.UUID uuid, java.util.Date date, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                uuid = creationData.id;
            }
            if ((i3 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        @p119n8.i(with = com.revenuecat.purchases.utils.serializers.DateSerializer.class)
        public static /* synthetic */ void getDate$annotations() {
        }

        @p119n8.i(with = com.revenuecat.purchases.utils.serializers.UUIDSerializer.class)
        public static /* synthetic */ void getId$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, com.revenuecat.purchases.utils.serializers.UUIDSerializer.INSTANCE, self.id);
            output.h(serialDesc, 1, com.revenuecat.purchases.utils.serializers.DateSerializer.INSTANCE, self.date);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.util.UUID getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.util.Date getDate() {
            return this.date;
        }

        public final com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData copy(java.util.UUID id, java.util.Date date) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(date, "date");
            return new com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData(id, date);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData = (com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData) other;
            return kotlin.jvm.internal.m.a(this.id, creationData.id) && kotlin.jvm.internal.m.a(this.date, creationData.date);
        }

        public final java.util.Date getDate() {
            return this.date;
        }

        public final java.util.UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return this.date.hashCode() + (this.id.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }

        public CreationData(java.util.UUID id, java.util.Date date) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(date, "date");
            this.id = id;
            this.date = date;
        }
    }

    @p070h6.c
    public /* synthetic */ PaywallEvent(int i3, com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData, com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data, com.revenuecat.purchases.paywalls.events.PaywallEventType paywallEventType, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData, p153r8.k0 k0Var) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.revenuecat.purchases.paywalls.events.PaywallEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
        if ((i3 & 8) == 0) {
            this.componentInteraction = null;
        } else {
            this.componentInteraction = paywallComponentInteractionData;
        }
    }

    public static /* synthetic */ com.revenuecat.purchases.paywalls.events.PaywallEvent copy$default(com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent, com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData, com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data, com.revenuecat.purchases.paywalls.events.PaywallEventType paywallEventType, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i3 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i3 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        if ((i3 & 8) != 0) {
            paywallComponentInteractionData = paywallEvent.componentInteraction;
        }
        return paywallEvent.copy(creationData, data, paywallEventType, paywallComponentInteractionData);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.events.PaywallEvent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer.INSTANCE, self.creationData);
        output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer.INSTANCE, self.data);
        output.h(serialDesc, 2, kSerializerArr[2], self.type);
        if (!output.E(serialDesc) && self.componentInteraction == null) {
            return;
        }
        output.t(serialDesc, 3, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData$$serializer.INSTANCE, self.componentInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData getCreationData() {
        return this.creationData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallEvent.Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallEventType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData getComponentInteraction() {
        return this.componentInteraction;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallEvent copy(com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData, com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data, com.revenuecat.purchases.paywalls.events.PaywallEventType type, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData componentInteraction) {
        kotlin.jvm.internal.m.e(creationData, "creationData");
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(type, "type");
        return new com.revenuecat.purchases.paywalls.events.PaywallEvent(creationData, data, type, componentInteraction);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.paywalls.events.PaywallEvent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent = (com.revenuecat.purchases.paywalls.events.PaywallEvent) other;
        return kotlin.jvm.internal.m.a(this.creationData, paywallEvent.creationData) && kotlin.jvm.internal.m.a(this.data, paywallEvent.data) && this.type == paywallEvent.type && kotlin.jvm.internal.m.a(this.componentInteraction, paywallEvent.componentInteraction);
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData getComponentInteraction() {
        return this.componentInteraction;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData getCreationData() {
        return this.creationData;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallEvent.Data getData() {
        return this.data;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + ((this.data.hashCode() + (this.creationData.hashCode() * 31)) * 31)) * 31;
        com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData = this.componentInteraction;
        return iHashCode + (paywallComponentInteractionData == null ? 0 : paywallComponentInteractionData.hashCode());
    }

    @Override // com.revenuecat.purchases.common.events.FeatureEvent
    public boolean isPriorityEvent() {
        return this.type == com.revenuecat.purchases.paywalls.events.PaywallEventType.IMPRESSION;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsRelease() {
        java.lang.String paywallIdentifier = this.data.getPaywallIdentifier();
        java.lang.String string = this.data.getSessionIdentifier().toString();
        kotlin.jvm.internal.m.d(string, "data.sessionIdentifier.toString()");
        return new com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData(paywallIdentifier, string, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getPresentedOfferingContext().getOfferingIdentifier());
    }

    public java.lang.String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ", componentInteraction=" + this.componentInteraction + ')';
    }

    public PaywallEvent(com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData, com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data, com.revenuecat.purchases.paywalls.events.PaywallEventType type, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData) {
        kotlin.jvm.internal.m.e(creationData, "creationData");
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(type, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = type;
        this.componentInteraction = paywallComponentInteractionData;
    }

    public /* synthetic */ PaywallEvent(com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData creationData, com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data, com.revenuecat.purchases.paywalls.events.PaywallEventType paywallEventType, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(creationData, data, paywallEventType, (i3 & 8) != 0 ? null : paywallComponentInteractionData);
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u009f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0007HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "paywallIdentifier", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "paywallRevision", "", "sessionIdentifier", "Ljava/util/UUID;", "displayMode", "localeIdentifier", "darkMode", "", "exitOfferType", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "exitOfferingIdentifier", "packageIdentifier", "productIdentifier", "errorCode", "errorMessage", "workflowId", "stepId", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDarkMode", "()Z", "getDisplayMode", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "getExitOfferType", "()Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "getExitOfferingIdentifier", "getLocaleIdentifier", "getPackageIdentifier", "getPaywallIdentifier", "getPaywallRevision", "()I", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProductIdentifier", "getSessionIdentifier$annotations", "()V", "getSessionIdentifier", "()Ljava/util/UUID;", "getStepId", "getWorkflowId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer.class)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.events.PaywallEvent.Data.Companion INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallEvent.Data.Companion(null);
        private final boolean darkMode;
        private final java.lang.String displayMode;
        private final java.lang.Integer errorCode;
        private final java.lang.String errorMessage;
        private final com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType;
        private final java.lang.String exitOfferingIdentifier;
        private final java.lang.String localeIdentifier;
        private final java.lang.String packageIdentifier;
        private final java.lang.String paywallIdentifier;
        private final int paywallRevision;
        private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
        private final java.lang.String productIdentifier;
        private final java.util.UUID sessionIdentifier;
        private final java.lang.String stepId;
        private final java.lang.String workflowId;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Data(java.lang.String str, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, java.util.UUID sessionIdentifier, java.lang.String displayMode, java.lang.String localeIdentifier, boolean z6, com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            kotlin.jvm.internal.m.e(presentedOfferingContext, "presentedOfferingContext");
            kotlin.jvm.internal.m.e(sessionIdentifier, "sessionIdentifier");
            kotlin.jvm.internal.m.e(displayMode, "displayMode");
            kotlin.jvm.internal.m.e(localeIdentifier, "localeIdentifier");
            this.paywallIdentifier = str;
            this.presentedOfferingContext = presentedOfferingContext;
            this.paywallRevision = i3;
            this.sessionIdentifier = sessionIdentifier;
            this.displayMode = displayMode;
            this.localeIdentifier = localeIdentifier;
            this.darkMode = z6;
            this.exitOfferType = exitOfferType;
            this.exitOfferingIdentifier = str2;
            this.packageIdentifier = str3;
            this.productIdentifier = str4;
            this.errorCode = num;
            this.errorMessage = str5;
            this.workflowId = str6;
            this.stepId = str7;
        }

        @p119n8.i(with = com.revenuecat.purchases.utils.serializers.UUIDSerializer.class)
        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getPaywallIdentifier() {
            return this.paywallIdentifier;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final java.lang.String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final java.lang.String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final java.lang.String getWorkflowId() {
            return this.workflowId;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final java.lang.String getStepId() {
            return this.stepId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final java.util.UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final java.lang.String getDisplayMode() {
            return this.displayMode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final java.lang.String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getDarkMode() {
            return this.darkMode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final com.revenuecat.purchases.paywalls.events.ExitOfferType getExitOfferType() {
            return this.exitOfferType;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final java.lang.String getExitOfferingIdentifier() {
            return this.exitOfferingIdentifier;
        }

        public final com.revenuecat.purchases.paywalls.events.PaywallEvent.Data copy(java.lang.String paywallIdentifier, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int paywallRevision, java.util.UUID sessionIdentifier, java.lang.String displayMode, java.lang.String localeIdentifier, boolean darkMode, com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType, java.lang.String exitOfferingIdentifier, java.lang.String packageIdentifier, java.lang.String productIdentifier, java.lang.Integer errorCode, java.lang.String errorMessage, java.lang.String workflowId, java.lang.String stepId) {
            kotlin.jvm.internal.m.e(presentedOfferingContext, "presentedOfferingContext");
            kotlin.jvm.internal.m.e(sessionIdentifier, "sessionIdentifier");
            kotlin.jvm.internal.m.e(displayMode, "displayMode");
            kotlin.jvm.internal.m.e(localeIdentifier, "localeIdentifier");
            return new com.revenuecat.purchases.paywalls.events.PaywallEvent.Data(paywallIdentifier, presentedOfferingContext, paywallRevision, sessionIdentifier, displayMode, localeIdentifier, darkMode, exitOfferType, exitOfferingIdentifier, packageIdentifier, productIdentifier, errorCode, errorMessage, workflowId, stepId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.paywalls.events.PaywallEvent.Data)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data = (com.revenuecat.purchases.paywalls.events.PaywallEvent.Data) other;
            return kotlin.jvm.internal.m.a(this.paywallIdentifier, data.paywallIdentifier) && kotlin.jvm.internal.m.a(this.presentedOfferingContext, data.presentedOfferingContext) && this.paywallRevision == data.paywallRevision && kotlin.jvm.internal.m.a(this.sessionIdentifier, data.sessionIdentifier) && kotlin.jvm.internal.m.a(this.displayMode, data.displayMode) && kotlin.jvm.internal.m.a(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode && this.exitOfferType == data.exitOfferType && kotlin.jvm.internal.m.a(this.exitOfferingIdentifier, data.exitOfferingIdentifier) && kotlin.jvm.internal.m.a(this.packageIdentifier, data.packageIdentifier) && kotlin.jvm.internal.m.a(this.productIdentifier, data.productIdentifier) && kotlin.jvm.internal.m.a(this.errorCode, data.errorCode) && kotlin.jvm.internal.m.a(this.errorMessage, data.errorMessage) && kotlin.jvm.internal.m.a(this.workflowId, data.workflowId) && kotlin.jvm.internal.m.a(this.stepId, data.stepId);
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final java.lang.String getDisplayMode() {
            return this.displayMode;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final com.revenuecat.purchases.paywalls.events.ExitOfferType getExitOfferType() {
            return this.exitOfferType;
        }

        public final java.lang.String getExitOfferingIdentifier() {
            return this.exitOfferingIdentifier;
        }

        public final java.lang.String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final java.lang.String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        public final java.lang.String getPaywallIdentifier() {
            return this.paywallIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        public final java.lang.String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final java.util.UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        public final java.lang.String getStepId() {
            return this.stepId;
        }

        public final java.lang.String getWorkflowId() {
            return this.workflowId;
        }

        public int hashCode() {
            java.lang.String str = this.paywallIdentifier;
            int iF = p121o0.p.f(B2.a.a(B2.a.a((this.sessionIdentifier.hashCode() + p121o0.p.d(this.paywallRevision, (this.presentedOfferingContext.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31)) * 31, 31, this.displayMode), 31, this.localeIdentifier), 31, this.darkMode);
            com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType = this.exitOfferType;
            int iHashCode = (iF + (exitOfferType == null ? 0 : exitOfferType.hashCode())) * 31;
            java.lang.String str2 = this.exitOfferingIdentifier;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.packageIdentifier;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.productIdentifier;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            java.lang.Integer num = this.errorCode;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            java.lang.String str5 = this.errorMessage;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.workflowId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            java.lang.String str7 = this.stepId;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(paywallIdentifier=");
            sb.append(this.paywallIdentifier);
            sb.append(", presentedOfferingContext=");
            sb.append(this.presentedOfferingContext);
            sb.append(", paywallRevision=");
            sb.append(this.paywallRevision);
            sb.append(", sessionIdentifier=");
            sb.append(this.sessionIdentifier);
            sb.append(", displayMode=");
            sb.append(this.displayMode);
            sb.append(", localeIdentifier=");
            sb.append(this.localeIdentifier);
            sb.append(", darkMode=");
            sb.append(this.darkMode);
            sb.append(", exitOfferType=");
            sb.append(this.exitOfferType);
            sb.append(", exitOfferingIdentifier=");
            sb.append(this.exitOfferingIdentifier);
            sb.append(", packageIdentifier=");
            sb.append(this.packageIdentifier);
            sb.append(", productIdentifier=");
            sb.append(this.productIdentifier);
            sb.append(", errorCode=");
            sb.append(this.errorCode);
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
            sb.append(", workflowId=");
            sb.append(this.workflowId);
            sb.append(", stepId=");
            return Y6.f.l(sb, this.stepId, ')');
        }

        public /* synthetic */ Data(java.lang.String str, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, java.util.UUID uuid, java.lang.String str2, java.lang.String str3, boolean z6, com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, presentedOfferingContext, i3, uuid, str2, str3, z6, (i9 & 128) != 0 ? null : exitOfferType, (i9 & 256) != 0 ? null : str4, (i9 & 512) != 0 ? null : str5, (i9 & 1024) != 0 ? null : str6, (i9 & 2048) != 0 ? null : num, (i9 & 4096) != 0 ? null : str7, (i9 & 8192) != 0 ? null : str8, (i9 & 16384) != 0 ? null : str9);
        }
    }
}
