package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;)V", "", "KEY_SET", "Ljava/lang/String;", "KEY_TO", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StateUpdateSerializer implements kotlinx.serialization.KSerializer {
    private static final java.lang.String KEY_SET = "set";
    private static final java.lang.String KEY_TO = "to";
    public static final com.revenuecat.purchases.paywalls.components.common.StateUpdateSerializer INSTANCE = new com.revenuecat.purchases.paywalls.components.common.StateUpdateSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.json.c.Companion.serializer().getDescriptor();

    private StateUpdateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.paywalls.components.common.StateUpdate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = decoder instanceof p162s8.k ? (p162s8.k) decoder : null;
        if (kVar == null) {
            return com.revenuecat.purchases.paywalls.components.common.StateUpdate.Unsupported.INSTANCE;
        }
        kotlinx.serialization.json.b bVarI = kVar.i();
        kotlinx.serialization.json.c cVar = bVarI instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarI : null;
        if (cVar == null) {
            return com.revenuecat.purchases.paywalls.components.common.StateUpdate.Unsupported.INSTANCE;
        }
        java.lang.Object obj = cVar.get(KEY_SET);
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        if (dVar != null) {
            if (!dVar.e()) {
                dVar = null;
            }
            if (dVar != null && (strD = dVar.d()) != null) {
                java.lang.Object obj2 = cVar.get(KEY_TO);
                kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
                if (dVar2 == null) {
                    return com.revenuecat.purchases.paywalls.components.common.StateUpdate.Unsupported.INSTANCE;
                }
                return new com.revenuecat.purchases.paywalls.components.common.StateUpdate.Set(strD, (dVar2.e() && kotlin.jvm.internal.m.a(dVar2.d(), "$value")) ? com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.PayloadReference.INSTANCE : new com.revenuecat.purchases.paywalls.components.common.StateUpdateValue.Literal(dVar2));
            }
        }
        return com.revenuecat.purchases.paywalls.components.common.StateUpdate.Unsupported.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.paywalls.components.common.StateUpdate value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new p070h6.j("Serialization is not implemented because it is not needed.");
    }
}
