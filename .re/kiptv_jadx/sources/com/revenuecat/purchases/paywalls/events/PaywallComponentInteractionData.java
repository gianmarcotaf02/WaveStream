package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019BÙ\u0001\b\u0011\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010!Jð\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J(\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@HÁ\u0001¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bJ\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bK\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bN\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bO\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bP\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bQ\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bR\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bS\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bT\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bU\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bV\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bW\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bX\u0010!R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bY\u0010!R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bZ\u0010!R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\b[\u0010!¨\u0006^"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;", "", "Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;", "componentType", "", "componentName", "componentValue", "componentUrl", "", "originIndex", "destinationIndex", "originContextName", "destinationContextName", "defaultIndex", "originPackageIdentifier", "destinationPackageIdentifier", "defaultPackageIdentifier", "originProductIdentifier", "destinationProductIdentifier", "defaultProductIdentifier", "currentPackageIdentifier", "resultingPackageIdentifier", "currentProductIdentifier", "resultingProductIdentifier", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallComponentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/events/PaywallComponentType;", "getComponentType", "Ljava/lang/String;", "getComponentName", "getComponentValue", "getComponentUrl", "Ljava/lang/Integer;", "getOriginIndex", "getDestinationIndex", "getOriginContextName", "getDestinationContextName", "getDefaultIndex", "getOriginPackageIdentifier", "getDestinationPackageIdentifier", "getDefaultPackageIdentifier", "getOriginProductIdentifier", "getDestinationProductIdentifier", "getDefaultProductIdentifier", "getCurrentPackageIdentifier", "getResultingPackageIdentifier", "getCurrentProductIdentifier", "getResultingProductIdentifier", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PaywallComponentInteractionData {
    private final java.lang.String componentName;
    private final com.revenuecat.purchases.paywalls.events.PaywallComponentType componentType;
    private final java.lang.String componentUrl;
    private final java.lang.String componentValue;
    private final java.lang.String currentPackageIdentifier;
    private final java.lang.String currentProductIdentifier;
    private final java.lang.Integer defaultIndex;
    private final java.lang.String defaultPackageIdentifier;
    private final java.lang.String defaultProductIdentifier;
    private final java.lang.String destinationContextName;
    private final java.lang.Integer destinationIndex;
    private final java.lang.String destinationPackageIdentifier;
    private final java.lang.String destinationProductIdentifier;
    private final java.lang.String originContextName;
    private final java.lang.Integer originIndex;
    private final java.lang.String originPackageIdentifier;
    private final java.lang.String originProductIdentifier;
    private final java.lang.String resultingPackageIdentifier;
    private final java.lang.String resultingProductIdentifier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData.Companion INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {com.revenuecat.purchases.paywalls.events.PaywallComponentType.INSTANCE.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallComponentInteractionData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ PaywallComponentInteractionData(int i3, com.revenuecat.purchases.paywalls.events.PaywallComponentType paywallComponentType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str4, java.lang.String str5, java.lang.Integer num3, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, p153r8.k0 k0Var) {
        if (5 != (i3 & 5)) {
            p153r8.AbstractC2686a0.l(i3, 5, com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.componentType = paywallComponentType;
        if ((i3 & 2) == 0) {
            this.componentName = null;
        } else {
            this.componentName = str;
        }
        this.componentValue = str2;
        if ((i3 & 8) == 0) {
            this.componentUrl = null;
        } else {
            this.componentUrl = str3;
        }
        if ((i3 & 16) == 0) {
            this.originIndex = null;
        } else {
            this.originIndex = num;
        }
        if ((i3 & 32) == 0) {
            this.destinationIndex = null;
        } else {
            this.destinationIndex = num2;
        }
        if ((i3 & 64) == 0) {
            this.originContextName = null;
        } else {
            this.originContextName = str4;
        }
        if ((i3 & 128) == 0) {
            this.destinationContextName = null;
        } else {
            this.destinationContextName = str5;
        }
        if ((i3 & 256) == 0) {
            this.defaultIndex = null;
        } else {
            this.defaultIndex = num3;
        }
        if ((i3 & 512) == 0) {
            this.originPackageIdentifier = null;
        } else {
            this.originPackageIdentifier = str6;
        }
        if ((i3 & 1024) == 0) {
            this.destinationPackageIdentifier = null;
        } else {
            this.destinationPackageIdentifier = str7;
        }
        if ((i3 & 2048) == 0) {
            this.defaultPackageIdentifier = null;
        } else {
            this.defaultPackageIdentifier = str8;
        }
        if ((i3 & 4096) == 0) {
            this.originProductIdentifier = null;
        } else {
            this.originProductIdentifier = str9;
        }
        if ((i3 & 8192) == 0) {
            this.destinationProductIdentifier = null;
        } else {
            this.destinationProductIdentifier = str10;
        }
        if ((i3 & 16384) == 0) {
            this.defaultProductIdentifier = null;
        } else {
            this.defaultProductIdentifier = str11;
        }
        if ((32768 & i3) == 0) {
            this.currentPackageIdentifier = null;
        } else {
            this.currentPackageIdentifier = str12;
        }
        if ((65536 & i3) == 0) {
            this.resultingPackageIdentifier = null;
        } else {
            this.resultingPackageIdentifier = str13;
        }
        if ((131072 & i3) == 0) {
            this.currentProductIdentifier = null;
        } else {
            this.currentProductIdentifier = str14;
        }
        if ((i3 & 262144) == 0) {
            this.resultingProductIdentifier = null;
        } else {
            this.resultingProductIdentifier = str15;
        }
    }

    public static /* synthetic */ com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData copy$default(com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData, com.revenuecat.purchases.paywalls.events.PaywallComponentType paywallComponentType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str4, java.lang.String str5, java.lang.Integer num3, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, int i3, java.lang.Object obj) {
        java.lang.String str16;
        java.lang.String str17;
        com.revenuecat.purchases.paywalls.events.PaywallComponentType paywallComponentType2 = (i3 & 1) != 0 ? paywallComponentInteractionData.componentType : paywallComponentType;
        java.lang.String str18 = (i3 & 2) != 0 ? paywallComponentInteractionData.componentName : str;
        java.lang.String str19 = (i3 & 4) != 0 ? paywallComponentInteractionData.componentValue : str2;
        java.lang.String str20 = (i3 & 8) != 0 ? paywallComponentInteractionData.componentUrl : str3;
        java.lang.Integer num4 = (i3 & 16) != 0 ? paywallComponentInteractionData.originIndex : num;
        java.lang.Integer num5 = (i3 & 32) != 0 ? paywallComponentInteractionData.destinationIndex : num2;
        java.lang.String str21 = (i3 & 64) != 0 ? paywallComponentInteractionData.originContextName : str4;
        java.lang.String str22 = (i3 & 128) != 0 ? paywallComponentInteractionData.destinationContextName : str5;
        java.lang.Integer num6 = (i3 & 256) != 0 ? paywallComponentInteractionData.defaultIndex : num3;
        java.lang.String str23 = (i3 & 512) != 0 ? paywallComponentInteractionData.originPackageIdentifier : str6;
        java.lang.String str24 = (i3 & 1024) != 0 ? paywallComponentInteractionData.destinationPackageIdentifier : str7;
        java.lang.String str25 = (i3 & 2048) != 0 ? paywallComponentInteractionData.defaultPackageIdentifier : str8;
        java.lang.String str26 = (i3 & 4096) != 0 ? paywallComponentInteractionData.originProductIdentifier : str9;
        java.lang.String str27 = (i3 & 8192) != 0 ? paywallComponentInteractionData.destinationProductIdentifier : str10;
        com.revenuecat.purchases.paywalls.events.PaywallComponentType paywallComponentType3 = paywallComponentType2;
        java.lang.String str28 = (i3 & 16384) != 0 ? paywallComponentInteractionData.defaultProductIdentifier : str11;
        java.lang.String str29 = (i3 & 32768) != 0 ? paywallComponentInteractionData.currentPackageIdentifier : str12;
        java.lang.String str30 = (i3 & 65536) != 0 ? paywallComponentInteractionData.resultingPackageIdentifier : str13;
        java.lang.String str31 = (i3 & 131072) != 0 ? paywallComponentInteractionData.currentProductIdentifier : str14;
        if ((i3 & 262144) != 0) {
            str17 = str31;
            str16 = paywallComponentInteractionData.resultingProductIdentifier;
        } else {
            str16 = str15;
            str17 = str31;
        }
        return paywallComponentInteractionData.copy(paywallComponentType3, str18, str19, str20, num4, num5, str21, str22, num6, str23, str24, str25, str26, str27, str28, str29, str30, str17, str16);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, $childSerializers[0], self.componentType);
        if (output.E(serialDesc) || self.componentName != null) {
            output.t(serialDesc, 1, p153r8.p0.f26988a, self.componentName);
        }
        output.s(serialDesc, 2, self.componentValue);
        if (output.E(serialDesc) || self.componentUrl != null) {
            output.t(serialDesc, 3, p153r8.p0.f26988a, self.componentUrl);
        }
        if (output.E(serialDesc) || self.originIndex != null) {
            output.t(serialDesc, 4, p153r8.K.f26915a, self.originIndex);
        }
        if (output.E(serialDesc) || self.destinationIndex != null) {
            output.t(serialDesc, 5, p153r8.K.f26915a, self.destinationIndex);
        }
        if (output.E(serialDesc) || self.originContextName != null) {
            output.t(serialDesc, 6, p153r8.p0.f26988a, self.originContextName);
        }
        if (output.E(serialDesc) || self.destinationContextName != null) {
            output.t(serialDesc, 7, p153r8.p0.f26988a, self.destinationContextName);
        }
        if (output.E(serialDesc) || self.defaultIndex != null) {
            output.t(serialDesc, 8, p153r8.K.f26915a, self.defaultIndex);
        }
        if (output.E(serialDesc) || self.originPackageIdentifier != null) {
            output.t(serialDesc, 9, p153r8.p0.f26988a, self.originPackageIdentifier);
        }
        if (output.E(serialDesc) || self.destinationPackageIdentifier != null) {
            output.t(serialDesc, 10, p153r8.p0.f26988a, self.destinationPackageIdentifier);
        }
        if (output.E(serialDesc) || self.defaultPackageIdentifier != null) {
            output.t(serialDesc, 11, p153r8.p0.f26988a, self.defaultPackageIdentifier);
        }
        if (output.E(serialDesc) || self.originProductIdentifier != null) {
            output.t(serialDesc, 12, p153r8.p0.f26988a, self.originProductIdentifier);
        }
        if (output.E(serialDesc) || self.destinationProductIdentifier != null) {
            output.t(serialDesc, 13, p153r8.p0.f26988a, self.destinationProductIdentifier);
        }
        if (output.E(serialDesc) || self.defaultProductIdentifier != null) {
            output.t(serialDesc, 14, p153r8.p0.f26988a, self.defaultProductIdentifier);
        }
        if (output.E(serialDesc) || self.currentPackageIdentifier != null) {
            output.t(serialDesc, 15, p153r8.p0.f26988a, self.currentPackageIdentifier);
        }
        if (output.E(serialDesc) || self.resultingPackageIdentifier != null) {
            output.t(serialDesc, 16, p153r8.p0.f26988a, self.resultingPackageIdentifier);
        }
        if (output.E(serialDesc) || self.currentProductIdentifier != null) {
            output.t(serialDesc, 17, p153r8.p0.f26988a, self.currentProductIdentifier);
        }
        if (!output.E(serialDesc) && self.resultingProductIdentifier == null) {
            return;
        }
        output.t(serialDesc, 18, p153r8.p0.f26988a, self.resultingProductIdentifier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallComponentType getComponentType() {
        return this.componentType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final java.lang.String getOriginPackageIdentifier() {
        return this.originPackageIdentifier;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final java.lang.String getDestinationPackageIdentifier() {
        return this.destinationPackageIdentifier;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final java.lang.String getDefaultPackageIdentifier() {
        return this.defaultPackageIdentifier;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final java.lang.String getOriginProductIdentifier() {
        return this.originProductIdentifier;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final java.lang.String getDestinationProductIdentifier() {
        return this.destinationProductIdentifier;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final java.lang.String getDefaultProductIdentifier() {
        return this.defaultProductIdentifier;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final java.lang.String getCurrentPackageIdentifier() {
        return this.currentPackageIdentifier;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final java.lang.String getResultingPackageIdentifier() {
        return this.resultingPackageIdentifier;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final java.lang.String getCurrentProductIdentifier() {
        return this.currentProductIdentifier;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final java.lang.String getResultingProductIdentifier() {
        return this.resultingProductIdentifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getComponentName() {
        return this.componentName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getComponentValue() {
        return this.componentValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getComponentUrl() {
        return this.componentUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.Integer getOriginIndex() {
        return this.originIndex;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.Integer getDestinationIndex() {
        return this.destinationIndex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getOriginContextName() {
        return this.originContextName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getDestinationContextName() {
        return this.destinationContextName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.Integer getDefaultIndex() {
        return this.defaultIndex;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData copy(com.revenuecat.purchases.paywalls.events.PaywallComponentType componentType, java.lang.String componentName, java.lang.String componentValue, java.lang.String componentUrl, java.lang.Integer originIndex, java.lang.Integer destinationIndex, java.lang.String originContextName, java.lang.String destinationContextName, java.lang.Integer defaultIndex, java.lang.String originPackageIdentifier, java.lang.String destinationPackageIdentifier, java.lang.String defaultPackageIdentifier, java.lang.String originProductIdentifier, java.lang.String destinationProductIdentifier, java.lang.String defaultProductIdentifier, java.lang.String currentPackageIdentifier, java.lang.String resultingPackageIdentifier, java.lang.String currentProductIdentifier, java.lang.String resultingProductIdentifier) {
        kotlin.jvm.internal.m.e(componentType, "componentType");
        kotlin.jvm.internal.m.e(componentValue, "componentValue");
        return new com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData(componentType, componentName, componentValue, componentUrl, originIndex, destinationIndex, originContextName, destinationContextName, defaultIndex, originPackageIdentifier, destinationPackageIdentifier, defaultPackageIdentifier, originProductIdentifier, destinationProductIdentifier, defaultProductIdentifier, currentPackageIdentifier, resultingPackageIdentifier, currentProductIdentifier, resultingProductIdentifier);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData paywallComponentInteractionData = (com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData) other;
        return this.componentType == paywallComponentInteractionData.componentType && kotlin.jvm.internal.m.a(this.componentName, paywallComponentInteractionData.componentName) && kotlin.jvm.internal.m.a(this.componentValue, paywallComponentInteractionData.componentValue) && kotlin.jvm.internal.m.a(this.componentUrl, paywallComponentInteractionData.componentUrl) && kotlin.jvm.internal.m.a(this.originIndex, paywallComponentInteractionData.originIndex) && kotlin.jvm.internal.m.a(this.destinationIndex, paywallComponentInteractionData.destinationIndex) && kotlin.jvm.internal.m.a(this.originContextName, paywallComponentInteractionData.originContextName) && kotlin.jvm.internal.m.a(this.destinationContextName, paywallComponentInteractionData.destinationContextName) && kotlin.jvm.internal.m.a(this.defaultIndex, paywallComponentInteractionData.defaultIndex) && kotlin.jvm.internal.m.a(this.originPackageIdentifier, paywallComponentInteractionData.originPackageIdentifier) && kotlin.jvm.internal.m.a(this.destinationPackageIdentifier, paywallComponentInteractionData.destinationPackageIdentifier) && kotlin.jvm.internal.m.a(this.defaultPackageIdentifier, paywallComponentInteractionData.defaultPackageIdentifier) && kotlin.jvm.internal.m.a(this.originProductIdentifier, paywallComponentInteractionData.originProductIdentifier) && kotlin.jvm.internal.m.a(this.destinationProductIdentifier, paywallComponentInteractionData.destinationProductIdentifier) && kotlin.jvm.internal.m.a(this.defaultProductIdentifier, paywallComponentInteractionData.defaultProductIdentifier) && kotlin.jvm.internal.m.a(this.currentPackageIdentifier, paywallComponentInteractionData.currentPackageIdentifier) && kotlin.jvm.internal.m.a(this.resultingPackageIdentifier, paywallComponentInteractionData.resultingPackageIdentifier) && kotlin.jvm.internal.m.a(this.currentProductIdentifier, paywallComponentInteractionData.currentProductIdentifier) && kotlin.jvm.internal.m.a(this.resultingProductIdentifier, paywallComponentInteractionData.resultingProductIdentifier);
    }

    public final java.lang.String getComponentName() {
        return this.componentName;
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallComponentType getComponentType() {
        return this.componentType;
    }

    public final java.lang.String getComponentUrl() {
        return this.componentUrl;
    }

    public final java.lang.String getComponentValue() {
        return this.componentValue;
    }

    public final java.lang.String getCurrentPackageIdentifier() {
        return this.currentPackageIdentifier;
    }

    public final java.lang.String getCurrentProductIdentifier() {
        return this.currentProductIdentifier;
    }

    public final java.lang.Integer getDefaultIndex() {
        return this.defaultIndex;
    }

    public final java.lang.String getDefaultPackageIdentifier() {
        return this.defaultPackageIdentifier;
    }

    public final java.lang.String getDefaultProductIdentifier() {
        return this.defaultProductIdentifier;
    }

    public final java.lang.String getDestinationContextName() {
        return this.destinationContextName;
    }

    public final java.lang.Integer getDestinationIndex() {
        return this.destinationIndex;
    }

    public final java.lang.String getDestinationPackageIdentifier() {
        return this.destinationPackageIdentifier;
    }

    public final java.lang.String getDestinationProductIdentifier() {
        return this.destinationProductIdentifier;
    }

    public final java.lang.String getOriginContextName() {
        return this.originContextName;
    }

    public final java.lang.Integer getOriginIndex() {
        return this.originIndex;
    }

    public final java.lang.String getOriginPackageIdentifier() {
        return this.originPackageIdentifier;
    }

    public final java.lang.String getOriginProductIdentifier() {
        return this.originProductIdentifier;
    }

    public final java.lang.String getResultingPackageIdentifier() {
        return this.resultingPackageIdentifier;
    }

    public final java.lang.String getResultingProductIdentifier() {
        return this.resultingProductIdentifier;
    }

    public int hashCode() {
        int iHashCode = this.componentType.hashCode() * 31;
        java.lang.String str = this.componentName;
        int iA = B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.componentValue);
        java.lang.String str2 = this.componentUrl;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.originIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.destinationIndex;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str3 = this.originContextName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.destinationContextName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num3 = this.defaultIndex;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str5 = this.originPackageIdentifier;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.destinationPackageIdentifier;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.defaultPackageIdentifier;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.originProductIdentifier;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.destinationProductIdentifier;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.defaultProductIdentifier;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        java.lang.String str11 = this.currentPackageIdentifier;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        java.lang.String str12 = this.resultingPackageIdentifier;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        java.lang.String str13 = this.currentProductIdentifier;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        java.lang.String str14 = this.resultingProductIdentifier;
        return iHashCode16 + (str14 != null ? str14.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaywallComponentInteractionData(componentType=");
        sb.append(this.componentType);
        sb.append(", componentName=");
        sb.append(this.componentName);
        sb.append(", componentValue=");
        sb.append(this.componentValue);
        sb.append(", componentUrl=");
        sb.append(this.componentUrl);
        sb.append(", originIndex=");
        sb.append(this.originIndex);
        sb.append(", destinationIndex=");
        sb.append(this.destinationIndex);
        sb.append(", originContextName=");
        sb.append(this.originContextName);
        sb.append(", destinationContextName=");
        sb.append(this.destinationContextName);
        sb.append(", defaultIndex=");
        sb.append(this.defaultIndex);
        sb.append(", originPackageIdentifier=");
        sb.append(this.originPackageIdentifier);
        sb.append(", destinationPackageIdentifier=");
        sb.append(this.destinationPackageIdentifier);
        sb.append(", defaultPackageIdentifier=");
        sb.append(this.defaultPackageIdentifier);
        sb.append(", originProductIdentifier=");
        sb.append(this.originProductIdentifier);
        sb.append(", destinationProductIdentifier=");
        sb.append(this.destinationProductIdentifier);
        sb.append(", defaultProductIdentifier=");
        sb.append(this.defaultProductIdentifier);
        sb.append(", currentPackageIdentifier=");
        sb.append(this.currentPackageIdentifier);
        sb.append(", resultingPackageIdentifier=");
        sb.append(this.resultingPackageIdentifier);
        sb.append(", currentProductIdentifier=");
        sb.append(this.currentProductIdentifier);
        sb.append(", resultingProductIdentifier=");
        return Y6.f.l(sb, this.resultingProductIdentifier, ')');
    }

    public PaywallComponentInteractionData(com.revenuecat.purchases.paywalls.events.PaywallComponentType componentType, java.lang.String str, java.lang.String componentValue, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, java.lang.Integer num3, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
        kotlin.jvm.internal.m.e(componentType, "componentType");
        kotlin.jvm.internal.m.e(componentValue, "componentValue");
        this.componentType = componentType;
        this.componentName = str;
        this.componentValue = componentValue;
        this.componentUrl = str2;
        this.originIndex = num;
        this.destinationIndex = num2;
        this.originContextName = str3;
        this.destinationContextName = str4;
        this.defaultIndex = num3;
        this.originPackageIdentifier = str5;
        this.destinationPackageIdentifier = str6;
        this.defaultPackageIdentifier = str7;
        this.originProductIdentifier = str8;
        this.destinationProductIdentifier = str9;
        this.defaultProductIdentifier = str10;
        this.currentPackageIdentifier = str11;
        this.resultingPackageIdentifier = str12;
        this.currentProductIdentifier = str13;
        this.resultingProductIdentifier = str14;
    }

    public /* synthetic */ PaywallComponentInteractionData(com.revenuecat.purchases.paywalls.events.PaywallComponentType paywallComponentType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str4, java.lang.String str5, java.lang.Integer num3, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(paywallComponentType, (i3 & 2) != 0 ? null : str, str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : num3, (i3 & 512) != 0 ? null : str6, (i3 & 1024) != 0 ? null : str7, (i3 & 2048) != 0 ? null : str8, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? null : str10, (i3 & 16384) != 0 ? null : str11, (32768 & i3) != 0 ? null : str12, (65536 & i3) != 0 ? null : str13, (131072 & i3) != 0 ? null : str14, (i3 & 262144) != 0 ? null : str15);
    }
}
