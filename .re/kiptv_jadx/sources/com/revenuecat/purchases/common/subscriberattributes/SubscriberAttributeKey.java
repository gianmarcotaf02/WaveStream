package com.revenuecat.purchases.common.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "", "backendKey", "", "(Ljava/lang/String;)V", "getBackendKey", "()Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "AttributionIds", "CampaignParameters", "Custom", "DeviceIdentifiers", "DisplayName", "Email", "FCMTokens", "IntegrationIds", "PhoneNumber", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$Custom;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$AmazonAdID;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$DeviceVersion;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$GPSAdID;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$IP;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DisplayName;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$Email;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$FCMTokens;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$PhoneNumber;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SubscriberAttributeKey {
    private final java.lang.String backendKey;

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "backendKey", "Lcom/revenuecat/purchases/common/subscriberattributes/ReservedSubscriberAttribute;", "(Lcom/revenuecat/purchases/common/subscriberattributes/ReservedSubscriberAttribute;)V", "Adjust", "Airbridge", "AppsFlyer", "Appstack", "CleverTap", "Facebook", "Kochava", "Mparticle", "SolarEngineAccountId", "SolarEngineDistinctId", "SolarEngineVisitorId", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Adjust;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Airbridge;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$AppsFlyer;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Appstack;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$CleverTap;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Facebook;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Kochava;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Mparticle;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$SolarEngineAccountId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$SolarEngineDistinctId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$SolarEngineVisitorId;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class AttributionIds extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Adjust;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Adjust extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Adjust INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Adjust();

            private Adjust() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.ADJUST_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Airbridge;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Airbridge extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Airbridge INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Airbridge();

            private Airbridge() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.AIRBRIDGE_DEVICE_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$AppsFlyer;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AppsFlyer extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.AppsFlyer INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.AppsFlyer();

            private AppsFlyer() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.APPSFLYER_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Appstack;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Appstack extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Appstack INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Appstack();

            private Appstack() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.APPSTACK_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$CleverTap;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class CleverTap extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.CleverTap INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.CleverTap();

            private CleverTap() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.CLEVER_TAP_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Facebook;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Facebook extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Facebook INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Facebook();

            private Facebook() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.FB_ANON_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Kochava;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Kochava extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Kochava INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Kochava();

            private Kochava() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.KOCHAVA_DEVICE_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$Mparticle;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Mparticle extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Mparticle INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.Mparticle();

            private Mparticle() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.MPARTICLE_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$SolarEngineAccountId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class SolarEngineAccountId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.SolarEngineAccountId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.SolarEngineAccountId();

            private SolarEngineAccountId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.SOLAR_ENGINE_ACCOUNT_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$SolarEngineDistinctId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class SolarEngineDistinctId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.SolarEngineDistinctId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.SolarEngineDistinctId();

            private SolarEngineDistinctId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.SOLAR_ENGINE_DISTINCT_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds$SolarEngineVisitorId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class SolarEngineVisitorId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.SolarEngineVisitorId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.AttributionIds.SolarEngineVisitorId();

            private SolarEngineVisitorId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.SOLAR_ENGINE_VISITOR_ID, null);
            }
        }

        public /* synthetic */ AttributionIds(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute reservedSubscriberAttribute, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(reservedSubscriberAttribute);
        }

        private AttributionIds(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute reservedSubscriberAttribute) {
            super(reservedSubscriberAttribute.getValue(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "backendKey", "Lcom/revenuecat/purchases/common/subscriberattributes/ReservedSubscriberAttribute;", "(Lcom/revenuecat/purchases/common/subscriberattributes/ReservedSubscriberAttribute;)V", "Ad", "AdGroup", "Campaign", "Creative", "Keyword", "MediaSource", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Ad;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$AdGroup;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Campaign;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Creative;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Keyword;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$MediaSource;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class CampaignParameters extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Ad;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Ad extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Ad INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Ad();

            private Ad() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.AD, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$AdGroup;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AdGroup extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.AdGroup INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.AdGroup();

            private AdGroup() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.AD_GROUP, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Campaign;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Campaign extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Campaign INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Campaign();

            private Campaign() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.CAMPAIGN, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Creative;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Creative extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Creative INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Creative();

            private Creative() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.CREATIVE, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$Keyword;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Keyword extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Keyword INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.Keyword();

            private Keyword() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.KEYWORD, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters$MediaSource;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$CampaignParameters;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class MediaSource extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.MediaSource INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.CampaignParameters.MediaSource();

            private MediaSource() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.MEDIA_SOURCE, null);
            }
        }

        public /* synthetic */ CampaignParameters(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute reservedSubscriberAttribute, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(reservedSubscriberAttribute);
        }

        private CampaignParameters(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute reservedSubscriberAttribute) {
            super(reservedSubscriberAttribute.getValue(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$Custom;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "value", "", "(Ljava/lang/String;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Custom extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(java.lang.String value) {
            super(value, null);
            kotlin.jvm.internal.m.e(value, "value");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers;", "", "()V", "AmazonAdID", "DeviceVersion", "GPSAdID", "IP", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class DeviceIdentifiers {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$AmazonAdID;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AmazonAdID extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID();

            private AmazonAdID() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.AMAZON_AD_ID.getValue(), null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$DeviceVersion;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class DeviceVersion extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.DeviceVersion();

            private DeviceVersion() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.DEVICE_VERSION.getValue(), null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$GPSAdID;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class GPSAdID extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.GPSAdID INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.GPSAdID();

            private GPSAdID() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.GPS_AD_ID.getValue(), null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DeviceIdentifiers$IP;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class IP extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.IP INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DeviceIdentifiers.IP();

            private IP() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.IP.getValue(), null);
            }
        }

        public /* synthetic */ DeviceIdentifiers(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private DeviceIdentifiers() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$DisplayName;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DisplayName extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
        public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DisplayName INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.DisplayName();

        private DisplayName() {
            super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.DISPLAY_NAME.getValue(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$Email;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Email extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
        public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.Email INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.Email();

        private Email() {
            super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.EMAIL.getValue(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$FCMTokens;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class FCMTokens extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
        public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.FCMTokens INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.FCMTokens();

        private FCMTokens() {
            super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.FCM_TOKENS.getValue(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "backendKey", "Lcom/revenuecat/purchases/common/subscriberattributes/ReservedSubscriberAttribute;", "(Lcom/revenuecat/purchases/common/subscriberattributes/ReservedSubscriberAttribute;)V", "Airship", "FirebaseAppInstanceId", "MixpanelDistinctId", "OneSignal", "OneSignalUserId", "PostHogUserId", "TenjinAnalyticsInstallationId", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$Airship;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$FirebaseAppInstanceId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$MixpanelDistinctId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$OneSignal;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$OneSignalUserId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$PostHogUserId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$TenjinAnalyticsInstallationId;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class IntegrationIds extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$Airship;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Airship extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.Airship INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.Airship();

            private Airship() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.AIRSHIP_CHANNEL_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$FirebaseAppInstanceId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class FirebaseAppInstanceId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId();

            private FirebaseAppInstanceId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.FIREBASE_APP_INSTANCE_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$MixpanelDistinctId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class MixpanelDistinctId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId();

            private MixpanelDistinctId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.MIXPANEL_DISTINCT_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$OneSignal;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class OneSignal extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.OneSignal INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.OneSignal();

            private OneSignal() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.ONESIGNAL_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$OneSignalUserId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class OneSignalUserId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.OneSignalUserId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.OneSignalUserId();

            private OneSignalUserId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.ONESIGNAL_USER_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$PostHogUserId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class PostHogUserId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.PostHogUserId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.PostHogUserId();

            private PostHogUserId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.POSTHOG_USER_ID, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds$TenjinAnalyticsInstallationId;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$IntegrationIds;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class TenjinAnalyticsInstallationId extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds {
            public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.TenjinAnalyticsInstallationId INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.IntegrationIds.TenjinAnalyticsInstallationId();

            private TenjinAnalyticsInstallationId() {
                super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.TENJIN_ANALYTICS_INSTALLATION_ID, null);
            }
        }

        public /* synthetic */ IntegrationIds(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute reservedSubscriberAttribute, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(reservedSubscriberAttribute);
        }

        private IntegrationIds(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute reservedSubscriberAttribute) {
            super(reservedSubscriberAttribute.getValue(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$PhoneNumber;", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PhoneNumber extends com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey {
        public static final com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.PhoneNumber INSTANCE = new com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey.PhoneNumber();

        private PhoneNumber() {
            super(com.revenuecat.purchases.common.subscriberattributes.ReservedSubscriberAttribute.PHONE_NUMBER.getValue(), null);
        }
    }

    public /* synthetic */ SubscriberAttributeKey(java.lang.String str, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey");
        return kotlin.jvm.internal.m.a(this.backendKey, ((com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey) other).backendKey);
    }

    public final java.lang.String getBackendKey() {
        return this.backendKey;
    }

    public int hashCode() {
        return this.backendKey.hashCode();
    }

    public java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("SubscriberAttributeKey('"), this.backendKey, "')");
    }

    private SubscriberAttributeKey(java.lang.String str) {
        this.backendKey = str;
    }
}
