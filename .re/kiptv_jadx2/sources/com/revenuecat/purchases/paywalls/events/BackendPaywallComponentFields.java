package com.revenuecat.purchases.paywalls.events;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 Jò\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\bHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/BackendPaywallComponentFields;", "", "componentType", "", "componentName", "componentValue", "componentUrl", "originIndex", "", "destinationIndex", "originContextName", "destinationContextName", "defaultIndex", "originPackageIdentifier", "destinationPackageIdentifier", "defaultPackageIdentifier", "originProductIdentifier", "destinationProductIdentifier", "defaultProductIdentifier", "currentPackageIdentifier", "resultingPackageIdentifier", "currentProductIdentifier", "resultingProductIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponentName", "()Ljava/lang/String;", "getComponentType", "getComponentUrl", "getComponentValue", "getCurrentPackageIdentifier", "getCurrentProductIdentifier", "getDefaultIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultPackageIdentifier", "getDefaultProductIdentifier", "getDestinationContextName", "getDestinationIndex", "getDestinationPackageIdentifier", "getDestinationProductIdentifier", "getOriginContextName", "getOriginIndex", "getOriginPackageIdentifier", "getOriginProductIdentifier", "getResultingPackageIdentifier", "getResultingProductIdentifier", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/BackendPaywallComponentFields;", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BackendPaywallComponentFields {
    private final String componentName;
    private final String componentType;
    private final String componentUrl;
    private final String componentValue;
    private final String currentPackageIdentifier;
    private final String currentProductIdentifier;
    private final Integer defaultIndex;
    private final String defaultPackageIdentifier;
    private final String defaultProductIdentifier;
    private final String destinationContextName;
    private final Integer destinationIndex;
    private final String destinationPackageIdentifier;
    private final String destinationProductIdentifier;
    private final String originContextName;
    private final Integer originIndex;
    private final String originPackageIdentifier;
    private final String originProductIdentifier;
    private final String resultingPackageIdentifier;
    private final String resultingProductIdentifier;

    public BackendPaywallComponentFields() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static BackendPaywallComponentFields copy$default(BackendPaywallComponentFields backendPaywallComponentFields, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i3, Object obj) {
        String str17;
        String str18;
        String str19 = (i3 & 1) != 0 ? backendPaywallComponentFields.componentType : str;
        String str20 = (i3 & 2) != 0 ? backendPaywallComponentFields.componentName : str2;
        String str21 = (i3 & 4) != 0 ? backendPaywallComponentFields.componentValue : str3;
        String str22 = (i3 & 8) != 0 ? backendPaywallComponentFields.componentUrl : str4;
        Integer num4 = (i3 & 16) != 0 ? backendPaywallComponentFields.originIndex : num;
        Integer num5 = (i3 & 32) != 0 ? backendPaywallComponentFields.destinationIndex : num2;
        String str23 = (i3 & 64) != 0 ? backendPaywallComponentFields.originContextName : str5;
        String str24 = (i3 & 128) != 0 ? backendPaywallComponentFields.destinationContextName : str6;
        Integer num6 = (i3 & 256) != 0 ? backendPaywallComponentFields.defaultIndex : num3;
        String str25 = (i3 & 512) != 0 ? backendPaywallComponentFields.originPackageIdentifier : str7;
        String str26 = (i3 & 1024) != 0 ? backendPaywallComponentFields.destinationPackageIdentifier : str8;
        String str27 = (i3 & 2048) != 0 ? backendPaywallComponentFields.defaultPackageIdentifier : str9;
        String str28 = (i3 & 4096) != 0 ? backendPaywallComponentFields.originProductIdentifier : str10;
        String str29 = (i3 & 8192) != 0 ? backendPaywallComponentFields.destinationProductIdentifier : str11;
        String str30 = str19;
        String str31 = (i3 & 16384) != 0 ? backendPaywallComponentFields.defaultProductIdentifier : str12;
        String str32 = (i3 & 32768) != 0 ? backendPaywallComponentFields.currentPackageIdentifier : str13;
        String str33 = (i3 & 65536) != 0 ? backendPaywallComponentFields.resultingPackageIdentifier : str14;
        String str34 = (i3 & 131072) != 0 ? backendPaywallComponentFields.currentProductIdentifier : str15;
        if ((i3 & 262144) != 0) {
            str18 = str34;
            str17 = backendPaywallComponentFields.resultingProductIdentifier;
        } else {
            str17 = str16;
            str18 = str34;
        }
        return backendPaywallComponentFields.copy(str30, str20, str21, str22, num4, num5, str23, str24, num6, str25, str26, str27, str28, str29, str31, str32, str33, str18, str17);
    }

    public final String getComponentType() {
        return this.componentType;
    }

    public final String getOriginPackageIdentifier() {
        return this.originPackageIdentifier;
    }

    public final String getDestinationPackageIdentifier() {
        return this.destinationPackageIdentifier;
    }

    public final String getDefaultPackageIdentifier() {
        return this.defaultPackageIdentifier;
    }

    public final String getOriginProductIdentifier() {
        return this.originProductIdentifier;
    }

    public final String getDestinationProductIdentifier() {
        return this.destinationProductIdentifier;
    }

    public final String getDefaultProductIdentifier() {
        return this.defaultProductIdentifier;
    }

    public final String getCurrentPackageIdentifier() {
        return this.currentPackageIdentifier;
    }

    public final String getResultingPackageIdentifier() {
        return this.resultingPackageIdentifier;
    }

    public final String getCurrentProductIdentifier() {
        return this.currentProductIdentifier;
    }

    public final String getResultingProductIdentifier() {
        return this.resultingProductIdentifier;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getComponentValue() {
        return this.componentValue;
    }

    public final String getComponentUrl() {
        return this.componentUrl;
    }

    public final Integer getOriginIndex() {
        return this.originIndex;
    }

    public final Integer getDestinationIndex() {
        return this.destinationIndex;
    }

    public final String getOriginContextName() {
        return this.originContextName;
    }

    public final String getDestinationContextName() {
        return this.destinationContextName;
    }

    public final Integer getDefaultIndex() {
        return this.defaultIndex;
    }

    public final BackendPaywallComponentFields copy(String componentType, String componentName, String componentValue, String componentUrl, Integer originIndex, Integer destinationIndex, String originContextName, String destinationContextName, Integer defaultIndex, String originPackageIdentifier, String destinationPackageIdentifier, String defaultPackageIdentifier, String originProductIdentifier, String destinationProductIdentifier, String defaultProductIdentifier, String currentPackageIdentifier, String resultingPackageIdentifier, String currentProductIdentifier, String resultingProductIdentifier) {
        return new BackendPaywallComponentFields(componentType, componentName, componentValue, componentUrl, originIndex, destinationIndex, originContextName, destinationContextName, defaultIndex, originPackageIdentifier, destinationPackageIdentifier, defaultPackageIdentifier, originProductIdentifier, destinationProductIdentifier, defaultProductIdentifier, currentPackageIdentifier, resultingPackageIdentifier, currentProductIdentifier, resultingProductIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackendPaywallComponentFields)) {
            return false;
        }
        BackendPaywallComponentFields backendPaywallComponentFields = (BackendPaywallComponentFields) other;
        return m.a(this.componentType, backendPaywallComponentFields.componentType) && m.a(this.componentName, backendPaywallComponentFields.componentName) && m.a(this.componentValue, backendPaywallComponentFields.componentValue) && m.a(this.componentUrl, backendPaywallComponentFields.componentUrl) && m.a(this.originIndex, backendPaywallComponentFields.originIndex) && m.a(this.destinationIndex, backendPaywallComponentFields.destinationIndex) && m.a(this.originContextName, backendPaywallComponentFields.originContextName) && m.a(this.destinationContextName, backendPaywallComponentFields.destinationContextName) && m.a(this.defaultIndex, backendPaywallComponentFields.defaultIndex) && m.a(this.originPackageIdentifier, backendPaywallComponentFields.originPackageIdentifier) && m.a(this.destinationPackageIdentifier, backendPaywallComponentFields.destinationPackageIdentifier) && m.a(this.defaultPackageIdentifier, backendPaywallComponentFields.defaultPackageIdentifier) && m.a(this.originProductIdentifier, backendPaywallComponentFields.originProductIdentifier) && m.a(this.destinationProductIdentifier, backendPaywallComponentFields.destinationProductIdentifier) && m.a(this.defaultProductIdentifier, backendPaywallComponentFields.defaultProductIdentifier) && m.a(this.currentPackageIdentifier, backendPaywallComponentFields.currentPackageIdentifier) && m.a(this.resultingPackageIdentifier, backendPaywallComponentFields.resultingPackageIdentifier) && m.a(this.currentProductIdentifier, backendPaywallComponentFields.currentProductIdentifier) && m.a(this.resultingProductIdentifier, backendPaywallComponentFields.resultingProductIdentifier);
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getComponentType() {
        return this.componentType;
    }

    public final String getComponentUrl() {
        return this.componentUrl;
    }

    public final String getComponentValue() {
        return this.componentValue;
    }

    public final String getCurrentPackageIdentifier() {
        return this.currentPackageIdentifier;
    }

    public final String getCurrentProductIdentifier() {
        return this.currentProductIdentifier;
    }

    public final Integer getDefaultIndex() {
        return this.defaultIndex;
    }

    public final String getDefaultPackageIdentifier() {
        return this.defaultPackageIdentifier;
    }

    public final String getDefaultProductIdentifier() {
        return this.defaultProductIdentifier;
    }

    public final String getDestinationContextName() {
        return this.destinationContextName;
    }

    public final Integer getDestinationIndex() {
        return this.destinationIndex;
    }

    public final String getDestinationPackageIdentifier() {
        return this.destinationPackageIdentifier;
    }

    public final String getDestinationProductIdentifier() {
        return this.destinationProductIdentifier;
    }

    public final String getOriginContextName() {
        return this.originContextName;
    }

    public final Integer getOriginIndex() {
        return this.originIndex;
    }

    public final String getOriginPackageIdentifier() {
        return this.originPackageIdentifier;
    }

    public final String getOriginProductIdentifier() {
        return this.originProductIdentifier;
    }

    public final String getResultingPackageIdentifier() {
        return this.resultingPackageIdentifier;
    }

    public final String getResultingProductIdentifier() {
        return this.resultingProductIdentifier;
    }

    public int hashCode() {
        String str = this.componentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.componentName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.componentValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.componentUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.originIndex;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.destinationIndex;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.originContextName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.destinationContextName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.defaultIndex;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.originPackageIdentifier;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.destinationPackageIdentifier;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.defaultPackageIdentifier;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.originProductIdentifier;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.destinationProductIdentifier;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.defaultProductIdentifier;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currentPackageIdentifier;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.resultingPackageIdentifier;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.currentProductIdentifier;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.resultingProductIdentifier;
        return iHashCode18 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BackendPaywallComponentFields(componentType=");
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
        return f.l(sb, this.resultingProductIdentifier, ')');
    }

    public BackendPaywallComponentFields(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
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

    public BackendPaywallComponentFields(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Integer num3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : num3, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? null : str11, (i3 & 16384) != 0 ? null : str12, (i3 & 32768) != 0 ? null : str13, (i3 & 65536) != 0 ? null : str14, (i3 & 131072) != 0 ? null : str15, (i3 & 262144) != 0 ? null : str16);
    }
}
