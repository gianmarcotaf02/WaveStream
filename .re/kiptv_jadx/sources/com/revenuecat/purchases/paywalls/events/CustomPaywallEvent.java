package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "()V", "isPriorityEvent", "", "()Z", "Impression", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class CustomPaywallEvent implements com.revenuecat.purchases.common.events.FeatureEvent {
    public /* synthetic */ CustomPaywallEvent(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    @Override // com.revenuecat.purchases.common.events.FeatureEvent
    public boolean isPriorityEvent() {
        return true;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression;", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent;", "creationData", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;", "data", "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;", "(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;)V", "getCreationData", "()Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;", "getData", "()Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;", "CreationData", "Data", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Impression extends com.revenuecat.purchases.paywalls.events.CustomPaywallEvent {
        private final com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData creationData;
        private final com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data data;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;", "", "id", "Ljava/util/UUID;", "date", "Ljava/util/Date;", "(Ljava/util/UUID;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getId", "()Ljava/util/UUID;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class CreationData {
            private final java.util.Date date;
            private final java.util.UUID id;

            /* JADX WARN: Multi-variable type inference failed */
            public CreationData() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData creationData = (com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData) obj;
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

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ CreationData(java.util.UUID uuid, java.util.Date date, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                if ((i3 & 1) != 0) {
                    uuid = java.util.UUID.randomUUID();
                    kotlin.jvm.internal.m.d(uuid, "randomUUID()");
                }
                this(uuid, (i3 & 2) != 0 ? new java.util.Date() : date);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Impression(com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData creationData, com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data data, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            if ((i3 & 1) != 0) {
                creationData = new com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            this(creationData, data);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression impression = (com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression) obj;
            return kotlin.jvm.internal.m.a(this.creationData, impression.creationData) && kotlin.jvm.internal.m.a(this.data, impression.data);
        }

        public final com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData getCreationData() {
            return this.creationData;
        }

        public final com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode() + (this.creationData.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "Impression(creationData=" + this.creationData + ", data=" + this.data + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impression(com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.CreationData creationData, com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data data) {
            super(null);
            kotlin.jvm.internal.m.e(creationData, "creationData");
            kotlin.jvm.internal.m.e(data, "data");
            this.creationData = creationData;
            this.data = data;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;", "", "paywallId", "", "offeringId", "placementIdentifier", "targetingRevision", "", "targetingRuleId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "getPaywallId", "getPlacementIdentifier", "getTargetingRevision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTargetingRuleId", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Data {
            private final java.lang.String offeringId;
            private final java.lang.String paywallId;
            private final java.lang.String placementIdentifier;
            private final java.lang.Integer targetingRevision;
            private final java.lang.String targetingRuleId;

            public Data(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4) {
                this.paywallId = str;
                this.offeringId = str2;
                this.placementIdentifier = str3;
                this.targetingRevision = num;
                this.targetingRuleId = str4;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data data = (com.revenuecat.purchases.paywalls.events.CustomPaywallEvent.Impression.Data) obj;
                return kotlin.jvm.internal.m.a(this.paywallId, data.paywallId) && kotlin.jvm.internal.m.a(this.offeringId, data.offeringId) && kotlin.jvm.internal.m.a(this.placementIdentifier, data.placementIdentifier) && kotlin.jvm.internal.m.a(this.targetingRevision, data.targetingRevision) && kotlin.jvm.internal.m.a(this.targetingRuleId, data.targetingRuleId);
            }

            public final java.lang.String getOfferingId() {
                return this.offeringId;
            }

            public final java.lang.String getPaywallId() {
                return this.paywallId;
            }

            public final java.lang.String getPlacementIdentifier() {
                return this.placementIdentifier;
            }

            public final java.lang.Integer getTargetingRevision() {
                return this.targetingRevision;
            }

            public final java.lang.String getTargetingRuleId() {
                return this.targetingRuleId;
            }

            public int hashCode() {
                java.lang.String str = this.paywallId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.offeringId;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.placementIdentifier;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                java.lang.Integer num = this.targetingRevision;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                java.lang.String str4 = this.targetingRuleId;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(paywallId=");
                sb.append(this.paywallId);
                sb.append(", offeringId=");
                sb.append(this.offeringId);
                sb.append(", placementIdentifier=");
                sb.append(this.placementIdentifier);
                sb.append(", targetingRevision=");
                sb.append(this.targetingRevision);
                sb.append(", targetingRuleId=");
                return Y6.f.l(sb, this.targetingRuleId, ')');
            }

            public /* synthetic */ Data(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : str4);
            }
        }
    }

    private CustomPaywallEvent() {
    }
}
