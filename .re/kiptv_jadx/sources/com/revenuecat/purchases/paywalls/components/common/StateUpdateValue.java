package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue;", "", "Companion", "Literal", "PayloadReference", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue$Literal;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue$PayloadReference;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface StateUpdateValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Companion.$$INSTANCE;
    public static final java.lang.String PAYLOAD_REFERENCE_TOKEN = "$value";

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue$Companion;", "", "()V", "PAYLOAD_REFERENCE_TOKEN", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Companion();
        public static final java.lang.String PAYLOAD_REFERENCE_TOKEN = "$value";

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue$Literal;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue;", "Lkotlinx/serialization/json/d;", "value", "<init>", "(Lkotlinx/serialization/json/d;)V", "Lkotlinx/serialization/json/d;", "getValue", "()Lkotlinx/serialization/json/d;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Literal implements com.revenuecat.purchases.paywalls.components.common.StateUpdateValue {
        private final kotlinx.serialization.json.d value;

        public Literal(kotlinx.serialization.json.d value) {
            kotlin.jvm.internal.m.e(value, "value");
            this.value = value;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Literal) && kotlin.jvm.internal.m.a(this.value, ((com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Literal) obj).value);
        }

        public final /* synthetic */ kotlinx.serialization.json.d getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "Literal(value=" + this.value + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue$PayloadReference;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateValue;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PayloadReference implements com.revenuecat.purchases.paywalls.components.common.StateUpdateValue {
        public static final com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.PayloadReference INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.PayloadReference();

        private PayloadReference() {
        }
    }
}
