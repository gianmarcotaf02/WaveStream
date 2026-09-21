package com.revenuecat.purchases.ads.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005$%&'(R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0015\u001a\u00020\u0016X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0001\u0005)*+,-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006.À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "adFormat", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "getAdFormat-y0COY5Q", "()Ljava/lang/String;", "adUnitId", "", "getAdUnitId", "captureMethod", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getCaptureMethod", "()Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "eventVersion", "", "getEventVersion", "()I", "id", "getId", "impressionId", "getImpressionId", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "getMediatorName-GyoM_N4", "networkName", "getNetworkName", "placement", "getPlacement", "timestamp", "", "getTimestamp", "()J", "type", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "Displayed", "FailedToLoad", "Loaded", "Open", "Revenue", "Lcom/revenuecat/purchases/ads/events/AdEvent$Displayed;", "Lcom/revenuecat/purchases/ads/events/AdEvent$FailedToLoad;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Loaded;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Open;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Revenue;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface AdEvent extends com.revenuecat.purchases.common.events.FeatureEvent {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isPriorityEvent(com.revenuecat.purchases.ads.events.AdEvent adEvent) {
            return com.revenuecat.purchases.ads.events.AdEvent.super.isPriorityEvent();
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\"\u0010\u0018R \u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b#\u0010\u0018R \u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Displayed;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "", "id", "", "eventVersion", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "type", "", "timestamp", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "captureMethod", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getEventVersion", "()I", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "J", "getTimestamp", "()J", "getNetworkName", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getCaptureMethod", "()Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Displayed implements com.revenuecat.purchases.ads.events.AdEvent {
        private final java.lang.String adFormat;
        private final java.lang.String adUnitId;
        private final com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final java.lang.String id;
        private final java.lang.String impressionId;
        private final java.lang.String mediatorName;
        private final java.lang.String networkName;
        private final java.lang.String placement;
        private final long timestamp;
        private final com.revenuecat.purchases.ads.events.AdEventType type;

        public /* synthetic */ Displayed(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, i3, adEventType, j, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: from getter */
        public java.lang.String getAdFormat() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public java.lang.String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdEventType getType() {
            return this.type;
        }

        private Displayed(java.lang.String id, int i3, com.revenuecat.purchases.ads.events.AdEventType type, long j, java.lang.String str, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str2, java.lang.String adUnitId, java.lang.String impressionId, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(type, "type");
            kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
            kotlin.jvm.internal.m.e(adFormat, "adFormat");
            kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
            kotlin.jvm.internal.m.e(impressionId, "impressionId");
            kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i3;
            this.type = type;
            this.timestamp = j;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Displayed(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            java.lang.String str8;
            if ((i9 & 1) != 0) {
                java.lang.String string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i9 & 2) != 0 ? 1 : i3, (i9 & 4) != 0 ? com.revenuecat.purchases.ads.events.AdEventType.DISPLAYED : adEventType, (i9 & 8) != 0 ? java.lang.System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\"\u0010\u0018R \u0010\r\u001a\u00020\f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$FailedToLoad;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "", "id", "", "eventVersion", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "type", "", "timestamp", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "captureMethod", "mediatorErrorCode", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;Ljava/lang/Integer;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getEventVersion", "()I", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "J", "getTimestamp", "()J", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getCaptureMethod", "()Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "Ljava/lang/Integer;", "getMediatorErrorCode", "()Ljava/lang/Integer;", "networkName", "getNetworkName", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class FailedToLoad implements com.revenuecat.purchases.ads.events.AdEvent {
        private final java.lang.String adFormat;
        private final java.lang.String adUnitId;
        private final com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final java.lang.String id;
        private final java.lang.String impressionId;
        private final java.lang.Integer mediatorErrorCode;
        private final java.lang.String mediatorName;
        private final java.lang.String networkName;
        private final java.lang.String placement;
        private final long timestamp;
        private final com.revenuecat.purchases.ads.events.AdEventType type;

        public /* synthetic */ FailedToLoad(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, java.lang.Integer num, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, i3, adEventType, j, str2, str3, str4, str5, str6, adCaptureMethod, num);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: from getter */
        public java.lang.String getAdFormat() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getImpressionId() {
            return this.impressionId;
        }

        public final java.lang.Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public java.lang.String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdEventType getType() {
            return this.type;
        }

        private FailedToLoad(java.lang.String id, int i3, com.revenuecat.purchases.ads.events.AdEventType type, long j, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str, java.lang.String adUnitId, java.lang.String str2, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod, java.lang.Integer num) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(type, "type");
            kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
            kotlin.jvm.internal.m.e(adFormat, "adFormat");
            kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
            kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i3;
            this.type = type;
            this.timestamp = j;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str;
            this.adUnitId = adUnitId;
            this.impressionId = str2;
            this.captureMethod = captureMethod;
            this.mediatorErrorCode = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FailedToLoad(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, java.lang.Integer num, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            java.lang.String str7;
            if ((i9 & 1) != 0) {
                java.lang.String string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
                str7 = string;
            } else {
                str7 = str;
            }
            this(str7, (i9 & 2) != 0 ? 1 : i3, (i9 & 4) != 0 ? com.revenuecat.purchases.ads.events.AdEventType.FAILED_TO_LOAD : adEventType, (i9 & 8) != 0 ? java.lang.System.currentTimeMillis() : j, str2, str3, str4, str5, (i9 & 256) != 0 ? null : str6, adCaptureMethod, num, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\"\u0010\u0018R \u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b#\u0010\u0018R \u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Loaded;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "", "id", "", "eventVersion", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "type", "", "timestamp", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "captureMethod", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getEventVersion", "()I", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "J", "getTimestamp", "()J", "getNetworkName", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getCaptureMethod", "()Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Loaded implements com.revenuecat.purchases.ads.events.AdEvent {
        private final java.lang.String adFormat;
        private final java.lang.String adUnitId;
        private final com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final java.lang.String id;
        private final java.lang.String impressionId;
        private final java.lang.String mediatorName;
        private final java.lang.String networkName;
        private final java.lang.String placement;
        private final long timestamp;
        private final com.revenuecat.purchases.ads.events.AdEventType type;

        public /* synthetic */ Loaded(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, i3, adEventType, j, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: from getter */
        public java.lang.String getAdFormat() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public java.lang.String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdEventType getType() {
            return this.type;
        }

        private Loaded(java.lang.String id, int i3, com.revenuecat.purchases.ads.events.AdEventType type, long j, java.lang.String str, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str2, java.lang.String adUnitId, java.lang.String impressionId, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(type, "type");
            kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
            kotlin.jvm.internal.m.e(adFormat, "adFormat");
            kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
            kotlin.jvm.internal.m.e(impressionId, "impressionId");
            kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i3;
            this.type = type;
            this.timestamp = j;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loaded(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            java.lang.String str8;
            if ((i9 & 1) != 0) {
                java.lang.String string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i9 & 2) != 0 ? 1 : i3, (i9 & 4) != 0 ? com.revenuecat.purchases.ads.events.AdEventType.LOADED : adEventType, (i9 & 8) != 0 ? java.lang.System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\"\u0010\u0018R \u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b#\u0010\u0018R \u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Open;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "", "id", "", "eventVersion", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "type", "", "timestamp", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "captureMethod", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getEventVersion", "()I", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "J", "getTimestamp", "()J", "getNetworkName", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getCaptureMethod", "()Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Open implements com.revenuecat.purchases.ads.events.AdEvent {
        private final java.lang.String adFormat;
        private final java.lang.String adUnitId;
        private final com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod;
        private final int eventVersion;
        private final java.lang.String id;
        private final java.lang.String impressionId;
        private final java.lang.String mediatorName;
        private final java.lang.String networkName;
        private final java.lang.String placement;
        private final long timestamp;
        private final com.revenuecat.purchases.ads.events.AdEventType type;

        public /* synthetic */ Open(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, i3, adEventType, j, str2, str3, str4, str5, str6, str7, adCaptureMethod);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: from getter */
        public java.lang.String getAdFormat() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public java.lang.String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getPlacement() {
            return this.placement;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdEventType getType() {
            return this.type;
        }

        private Open(java.lang.String id, int i3, com.revenuecat.purchases.ads.events.AdEventType type, long j, java.lang.String str, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str2, java.lang.String adUnitId, java.lang.String impressionId, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(type, "type");
            kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
            kotlin.jvm.internal.m.e(adFormat, "adFormat");
            kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
            kotlin.jvm.internal.m.e(impressionId, "impressionId");
            kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
            this.id = id;
            this.eventVersion = i3;
            this.type = type;
            this.timestamp = j;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Open(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            java.lang.String str8;
            if ((i9 & 1) != 0) {
                java.lang.String string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i9 & 2) != 0 ? 1 : i3, (i9 & 4) != 0 ? com.revenuecat.purchases.ads.events.AdEventType.OPENED : adEventType, (i9 & 8) != 0 ? java.lang.System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, adCaptureMethod, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b&\u0010\u001cR \u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b'\u0010\u001cR \u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b1\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdEvent$Revenue;", "Lcom/revenuecat/purchases/ads/events/AdEvent;", "", "id", "", "eventVersion", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "type", "", "timestamp", "networkName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "adFormat", "placement", "adUnitId", "impressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "captureMethod", "revenueMicros", "currency", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "precision", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/ads/events/AdEventType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getEventVersion", "()I", "Lcom/revenuecat/purchases/ads/events/AdEventType;", "getType", "()Lcom/revenuecat/purchases/ads/events/AdEventType;", "J", "getTimestamp", "()J", "getNetworkName", "getMediatorName-GyoM_N4", "getAdFormat-y0COY5Q", "getPlacement", "getAdUnitId", "getImpressionId", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getCaptureMethod", "()Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "getRevenueMicros", "getCurrency", "getPrecision-rAcPn4k", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Revenue implements com.revenuecat.purchases.ads.events.AdEvent {
        private final java.lang.String adFormat;
        private final java.lang.String adUnitId;
        private final com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod;
        private final java.lang.String currency;
        private final int eventVersion;
        private final java.lang.String id;
        private final java.lang.String impressionId;
        private final java.lang.String mediatorName;
        private final java.lang.String networkName;
        private final java.lang.String placement;
        private final java.lang.String precision;
        private final long revenueMicros;
        private final long timestamp;
        private final com.revenuecat.purchases.ads.events.AdEventType type;

        public /* synthetic */ Revenue(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, long j9, java.lang.String str8, java.lang.String str9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, i3, adEventType, j, str2, str3, str4, str5, str6, str7, adCaptureMethod, j9, str8, str9);
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: from getter */
        public java.lang.String getAdFormat() {
            return this.adFormat;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getAdUnitId() {
            return this.adUnitId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdCaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        public final java.lang.String getCurrency() {
            return this.currency;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public int getEventVersion() {
            return this.eventVersion;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getId() {
            return this.id;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getImpressionId() {
            return this.impressionId;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: from getter */
        public java.lang.String getMediatorName() {
            return this.mediatorName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getNetworkName() {
            return this.networkName;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public java.lang.String getPlacement() {
            return this.placement;
        }

        /* JADX INFO: renamed from: getPrecision-rAcPn4k, reason: not valid java name and from getter */
        public final java.lang.String getPrecision() {
            return this.precision;
        }

        public final long getRevenueMicros() {
            return this.revenueMicros;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.revenuecat.purchases.ads.events.AdEvent
        public com.revenuecat.purchases.ads.events.AdEventType getType() {
            return this.type;
        }

        private Revenue(java.lang.String id, int i3, com.revenuecat.purchases.ads.events.AdEventType type, long j, java.lang.String str, java.lang.String mediatorName, java.lang.String adFormat, java.lang.String str2, java.lang.String adUnitId, java.lang.String impressionId, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod, long j9, java.lang.String currency, java.lang.String precision) {
            kotlin.jvm.internal.m.e(id, "id");
            kotlin.jvm.internal.m.e(type, "type");
            kotlin.jvm.internal.m.e(mediatorName, "mediatorName");
            kotlin.jvm.internal.m.e(adFormat, "adFormat");
            kotlin.jvm.internal.m.e(adUnitId, "adUnitId");
            kotlin.jvm.internal.m.e(impressionId, "impressionId");
            kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
            kotlin.jvm.internal.m.e(currency, "currency");
            kotlin.jvm.internal.m.e(precision, "precision");
            this.id = id;
            this.eventVersion = i3;
            this.type = type;
            this.timestamp = j;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = adFormat;
            this.placement = str2;
            this.adUnitId = adUnitId;
            this.impressionId = impressionId;
            this.captureMethod = captureMethod;
            this.revenueMicros = j9;
            this.currency = currency;
            this.precision = precision;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Revenue(java.lang.String str, int i3, com.revenuecat.purchases.ads.events.AdEventType adEventType, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.revenuecat.purchases.ads.events.AdCaptureMethod adCaptureMethod, long j9, java.lang.String str8, java.lang.String str9, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            java.lang.String str10;
            if ((i9 & 1) != 0) {
                java.lang.String string = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
                str10 = string;
            } else {
                str10 = str;
            }
            this(str10, (i9 & 2) != 0 ? 1 : i3, (i9 & 4) != 0 ? com.revenuecat.purchases.ads.events.AdEventType.REVENUE : adEventType, (i9 & 8) != 0 ? java.lang.System.currentTimeMillis() : j, str2, str3, str4, str5, str6, str7, adCaptureMethod, j9, str8, str9, null);
        }
    }

    /* JADX INFO: renamed from: getAdFormat-y0COY5Q, reason: not valid java name */
    java.lang.String getAdFormat();

    java.lang.String getAdUnitId();

    com.revenuecat.purchases.ads.events.AdCaptureMethod getCaptureMethod();

    int getEventVersion();

    java.lang.String getId();

    java.lang.String getImpressionId();

    /* JADX INFO: renamed from: getMediatorName-GyoM_N4, reason: not valid java name */
    java.lang.String getMediatorName();

    java.lang.String getNetworkName();

    java.lang.String getPlacement();

    long getTimestamp();

    com.revenuecat.purchases.ads.events.AdEventType getType();
}
