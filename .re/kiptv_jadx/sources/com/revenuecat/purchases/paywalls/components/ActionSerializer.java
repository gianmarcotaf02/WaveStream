package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ActionSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class ActionSerializer implements kotlinx.serialization.KSerializer {
    public static final com.revenuecat.purchases.paywalls.components.ActionSerializer INSTANCE = new com.revenuecat.purchases.paywalls.components.ActionSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.revenuecat.purchases.paywalls.components.ActionSurrogate.INSTANCE.serializer().getDescriptor();

    private ActionSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.paywalls.components.ButtonComponent.Action deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return ((com.revenuecat.purchases.paywalls.components.ActionSurrogate) decoder.p(com.revenuecat.purchases.paywalls.components.ActionSurrogate.INSTANCE.serializer())).toAction();
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.paywalls.components.ButtonComponent.Action value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.z(com.revenuecat.purchases.paywalls.components.ActionSurrogate.INSTANCE.serializer(), new com.revenuecat.purchases.paywalls.components.ActionSurrogate(value));
    }
}
