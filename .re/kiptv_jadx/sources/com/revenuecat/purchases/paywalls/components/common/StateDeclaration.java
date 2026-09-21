package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001f\u001e B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration;", "", "Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;", "type", "Lkotlinx/serialization/json/d;", "defaultValue", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;Lkotlinx/serialization/json/d;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;Lkotlinx/serialization/json/d;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;", "Lkotlinx/serialization/json/d;", "getDefaultValue", "()Lkotlinx/serialization/json/d;", "getDefaultValue$annotations", "()V", "Companion", "$serializer", "ValueType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class StateDeclaration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.StateDeclaration.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateDeclaration.Companion(null);
    private final kotlinx.serialization.json.d defaultValue;
    private final com.revenuecat.purchases.paywalls.components.common.StateDeclaration.ValueType type;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.common.StateDeclaration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;", "", "(Ljava/lang/String;I)V", "BOOLEAN", "INTEGER", "DOUBLE", "STRING", "UNKNOWN", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.common.ValueTypeSerializer.class)
    public enum ValueType {
        BOOLEAN,
        INTEGER,
        DOUBLE,
        STRING,
        UNKNOWN;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.StateDeclaration.ValueType.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateDeclaration.ValueType.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/StateDeclaration$ValueType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.common.ValueTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @p070h6.c
    public /* synthetic */ StateDeclaration(int i3, com.revenuecat.purchases.paywalls.components.common.StateDeclaration.ValueType valueType, @p119n8.h("default") kotlinx.serialization.json.d dVar, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.common.StateDeclaration$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = valueType;
        this.defaultValue = dVar;
    }

    @p119n8.h("default")
    public static /* synthetic */ void getDefaultValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.StateDeclaration self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.common.ValueTypeSerializer.INSTANCE, self.type);
        output.h(serialDesc, 1, p162s8.y.f27432a, self.defaultValue);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.common.StateDeclaration)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.common.StateDeclaration stateDeclaration = (com.revenuecat.purchases.paywalls.components.common.StateDeclaration) obj;
        return this.type == stateDeclaration.type && kotlin.jvm.internal.m.a(this.defaultValue, stateDeclaration.defaultValue);
    }

    public final /* synthetic */ kotlinx.serialization.json.d getDefaultValue() {
        return this.defaultValue;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.StateDeclaration.ValueType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.defaultValue.hashCode() + (this.type.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "StateDeclaration(type=" + this.type + ", defaultValue=" + this.defaultValue + ')';
    }

    public StateDeclaration(com.revenuecat.purchases.paywalls.components.common.StateDeclaration.ValueType type, kotlinx.serialization.json.d defaultValue) {
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(defaultValue, "defaultValue");
        this.type = type;
        this.defaultValue = defaultValue;
    }
}
