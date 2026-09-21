package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 Jò\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\bHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/BackendPaywallComponentFields;", "", "componentType", "", "componentName", "componentValue", "componentUrl", "originIndex", "", "destinationIndex", "originContextName", "destinationContextName", "defaultIndex", "originPackageIdentifier", "destinationPackageIdentifier", "defaultPackageIdentifier", "originProductIdentifier", "destinationProductIdentifier", "defaultProductIdentifier", "currentPackageIdentifier", "resultingPackageIdentifier", "currentProductIdentifier", "resultingProductIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponentName", "()Ljava/lang/String;", "getComponentType", "getComponentUrl", "getComponentValue", "getCurrentPackageIdentifier", "getCurrentProductIdentifier", "getDefaultIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultPackageIdentifier", "getDefaultProductIdentifier", "getDestinationContextName", "getDestinationIndex", "getDestinationPackageIdentifier", "getDestinationProductIdentifier", "getOriginContextName", "getOriginIndex", "getOriginPackageIdentifier", "getOriginProductIdentifier", "getResultingPackageIdentifier", "getResultingProductIdentifier", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/BackendPaywallComponentFields;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class BackendPaywallComponentFields {
    private final java.lang.String componentName;
    private final java.lang.String componentType;
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

    public BackendPaywallComponentFields() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields copy$default(com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields backendPaywallComponentFields, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, java.lang.String str5, java.lang.String str6, java.lang.Integer num3, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, int i3, java.lang.Object obj) {
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19 = (i3 & 1) != 0 ? backendPaywallComponentFields.componentType : str;
        java.lang.String str20 = (i3 & 2) != 0 ? backendPaywallComponentFields.componentName : str2;
        java.lang.String str21 = (i3 & 4) != 0 ? backendPaywallComponentFields.componentValue : str3;
        java.lang.String str22 = (i3 & 8) != 0 ? backendPaywallComponentFields.componentUrl : str4;
        java.lang.Integer num4 = (i3 & 16) != 0 ? backendPaywallComponentFields.originIndex : num;
        java.lang.Integer num5 = (i3 & 32) != 0 ? backendPaywallComponentFields.destinationIndex : num2;
        java.lang.String str23 = (i3 & 64) != 0 ? backendPaywallComponentFields.originContextName : str5;
        java.lang.String str24 = (i3 & 128) != 0 ? backendPaywallComponentFields.destinationContextName : str6;
        java.lang.Integer num6 = (i3 & 256) != 0 ? backendPaywallComponentFields.defaultIndex : num3;
        java.lang.String str25 = (i3 & 512) != 0 ? backendPaywallComponentFields.originPackageIdentifier : str7;
        java.lang.String str26 = (i3 & 1024) != 0 ? backendPaywallComponentFields.destinationPackageIdentifier : str8;
        java.lang.String str27 = (i3 & 2048) != 0 ? backendPaywallComponentFields.defaultPackageIdentifier : str9;
        java.lang.String str28 = (i3 & 4096) != 0 ? backendPaywallComponentFields.originProductIdentifier : str10;
        java.lang.String str29 = (i3 & 8192) != 0 ? backendPaywallComponentFields.destinationProductIdentifier : str11;
        java.lang.String str30 = str19;
        java.lang.String str31 = (i3 & 16384) != 0 ? backendPaywallComponentFields.defaultProductIdentifier : str12;
        java.lang.String str32 = (i3 & 32768) != 0 ? backendPaywallComponentFields.currentPackageIdentifier : str13;
        java.lang.String str33 = (i3 & 65536) != 0 ? backendPaywallComponentFields.resultingPackageIdentifier : str14;
        java.lang.String str34 = (i3 & 131072) != 0 ? backendPaywallComponentFields.currentProductIdentifier : str15;
        if ((i3 & 262144) != 0) {
            str18 = str34;
            str17 = backendPaywallComponentFields.resultingProductIdentifier;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return backendPaywallComponentFields.copy(str30, str20, str21, str22, num4, num5, str23, str24, num6, str25, str26, str27, str28, str29, str31, str32, str33, str18, str17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getComponentType() {
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

    public final com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields copy(java.lang.String componentType, java.lang.String componentName, java.lang.String componentValue, java.lang.String componentUrl, java.lang.Integer originIndex, java.lang.Integer destinationIndex, java.lang.String originContextName, java.lang.String destinationContextName, java.lang.Integer defaultIndex, java.lang.String originPackageIdentifier, java.lang.String destinationPackageIdentifier, java.lang.String defaultPackageIdentifier, java.lang.String originProductIdentifier, java.lang.String destinationProductIdentifier, java.lang.String defaultProductIdentifier, java.lang.String currentPackageIdentifier, java.lang.String resultingPackageIdentifier, java.lang.String currentProductIdentifier, java.lang.String resultingProductIdentifier) {
        return new com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields(componentType, componentName, componentValue, componentUrl, originIndex, destinationIndex, originContextName, destinationContextName, defaultIndex, originPackageIdentifier, destinationPackageIdentifier, defaultPackageIdentifier, originProductIdentifier, destinationProductIdentifier, defaultProductIdentifier, currentPackageIdentifier, resultingPackageIdentifier, currentProductIdentifier, resultingProductIdentifier);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields backendPaywallComponentFields = (com.revenuecat.purchases.paywalls.events.BackendPaywallComponentFields) other;
        return kotlin.jvm.internal.m.a(this.componentType, backendPaywallComponentFields.componentType) && kotlin.jvm.internal.m.a(this.componentName, backendPaywallComponentFields.componentName) && kotlin.jvm.internal.m.a(this.componentValue, backendPaywallComponentFields.componentValue) && kotlin.jvm.internal.m.a(this.componentUrl, backendPaywallComponentFields.componentUrl) && kotlin.jvm.internal.m.a(this.originIndex, backendPaywallComponentFields.originIndex) && kotlin.jvm.internal.m.a(this.destinationIndex, backendPaywallComponentFields.destinationIndex) && kotlin.jvm.internal.m.a(this.originContextName, backendPaywallComponentFields.originContextName) && kotlin.jvm.internal.m.a(this.destinationContextName, backendPaywallComponentFields.destinationContextName) && kotlin.jvm.internal.m.a(this.defaultIndex, backendPaywallComponentFields.defaultIndex) && kotlin.jvm.internal.m.a(this.originPackageIdentifier, backendPaywallComponentFields.originPackageIdentifier) && kotlin.jvm.internal.m.a(this.destinationPackageIdentifier, backendPaywallComponentFields.destinationPackageIdentifier) && kotlin.jvm.internal.m.a(this.defaultPackageIdentifier, backendPaywallComponentFields.defaultPackageIdentifier) && kotlin.jvm.internal.m.a(this.originProductIdentifier, backendPaywallComponentFields.originProductIdentifier) && kotlin.jvm.internal.m.a(this.destinationProductIdentifier, backendPaywallComponentFields.destinationProductIdentifier) && kotlin.jvm.internal.m.a(this.defaultProductIdentifier, backendPaywallComponentFields.defaultProductIdentifier) && kotlin.jvm.internal.m.a(this.currentPackageIdentifier, backendPaywallComponentFields.currentPackageIdentifier) && kotlin.jvm.internal.m.a(this.resultingPackageIdentifier, backendPaywallComponentFields.resultingPackageIdentifier) && kotlin.jvm.internal.m.a(this.currentProductIdentifier, backendPaywallComponentFields.currentProductIdentifier) && kotlin.jvm.internal.m.a(this.resultingProductIdentifier, backendPaywallComponentFields.resultingProductIdentifier);
    }

    public final java.lang.String getComponentName() {
        return this.componentName;
    }

    public final java.lang.String getComponentType() {
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
        java.lang.String str = this.componentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.componentName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.componentValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.componentUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num = this.originIndex;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.destinationIndex;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str5 = this.originContextName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.destinationContextName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Integer num3 = this.defaultIndex;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str7 = this.originPackageIdentifier;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.destinationPackageIdentifier;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.defaultPackageIdentifier;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.originProductIdentifier;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        java.lang.String str11 = this.destinationProductIdentifier;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        java.lang.String str12 = this.defaultProductIdentifier;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        java.lang.String str13 = this.currentPackageIdentifier;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        java.lang.String str14 = this.resultingPackageIdentifier;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        java.lang.String str15 = this.currentProductIdentifier;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        java.lang.String str16 = this.resultingProductIdentifier;
        return iHashCode18 + (str16 != null ? str16.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackendPaywallComponentFields(componentType=");
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

    public BackendPaywallComponentFields(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, java.lang.String str5, java.lang.String str6, java.lang.Integer num3, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16) {
        this.componentType = str;
        this.componentName = str2;
        this.componentValue = str3;
        this.componentUrl = str4;
        this.originIndex = num;
        this.destinationIndex = num2;
        this.originContextName = str5;
        this.destinationContextName = str6;
        this.defaultIndex = num3;
        this.originPackageIdentifier = str7;
        this.destinationPackageIdentifier = str8;
        this.defaultPackageIdentifier = str9;
        this.originProductIdentifier = str10;
        this.destinationProductIdentifier = str11;
        this.defaultProductIdentifier = str12;
        this.currentPackageIdentifier = str13;
        this.resultingPackageIdentifier = str14;
        this.currentProductIdentifier = str15;
        this.resultingProductIdentifier = str16;
    }

    public /* synthetic */ BackendPaywallComponentFields(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, java.lang.String str5, java.lang.String str6, java.lang.Integer num3, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : num3, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? null : str11, (i3 & 16384) != 0 ? null : str12, (i3 & 32768) != 0 ? null : str13, (i3 & 65536) != 0 ? null : str14, (i3 & 131072) != 0 ? null : str15, (i3 & 262144) != 0 ? null : str16);
    }
}
