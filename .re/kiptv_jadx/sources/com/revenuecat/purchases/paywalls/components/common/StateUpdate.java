package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "", "Companion", "Set", "Unsupported", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate$Set;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate$Unsupported;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.paywalls.components.common.StateUpdateSerializer.class)
public interface StateUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.StateUpdate.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.common.StateUpdate.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.StateUpdate.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateUpdate.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.common.StateUpdateSerializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate$Set;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "", "value", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue;", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Set implements com.revenuecat.purchases.paywalls.components.common.StateUpdate {
        private final java.lang.String key;
        private final com.revenuecat.purchases.paywalls.components.common.StateUpdateValue value;

        public Set(java.lang.String key, com.revenuecat.purchases.paywalls.components.common.StateUpdateValue value) {
            kotlin.jvm.internal.m.e(key, "key");
            kotlin.jvm.internal.m.e(value, "value");
            this.key = key;
            this.value = value;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.paywalls.components.common.StateUpdate.Set)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.components.common.StateUpdate.Set set = (com.revenuecat.purchases.paywalls.components.common.StateUpdate.Set) obj;
            return kotlin.jvm.internal.m.a(this.key, set.key) && kotlin.jvm.internal.m.a(this.value, set.value);
        }

        public final /* synthetic */ java.lang.String getKey() {
            return this.key;
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.StateUpdateValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "Set(key=" + this.key + ", value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Unsupported implements com.revenuecat.purchases.paywalls.components.common.StateUpdate {
        public static final com.revenuecat.purchases.paywalls.components.common.StateUpdate.Unsupported INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateUpdate.Unsupported();

        private Unsupported() {
        }
    }
}
