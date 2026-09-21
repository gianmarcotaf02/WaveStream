package com.revenuecat.purchases.paywalls.components.common.serializers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/serializers/StoreReplacementModeDeserializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "defaultValue", "Lkotlin/Function1;", "", "typeForValue", "<init>", "(Lcom/revenuecat/purchases/models/StoreReplacementMode;Lx6/j;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/models/StoreReplacementMode;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/models/StoreReplacementMode;)V", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "", "valuesByType", "Ljava/util/Map;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class StoreReplacementModeDeserializer implements kotlinx.serialization.KSerializer {
    private final com.revenuecat.purchases.models.StoreReplacementMode defaultValue;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.models.StoreReplacementMode> valuesByType;

    public StoreReplacementModeDeserializer(com.revenuecat.purchases.models.StoreReplacementMode defaultValue, p194x6.j typeForValue) {
        kotlin.jvm.internal.m.e(defaultValue, "defaultValue");
        kotlin.jvm.internal.m.e(typeForValue, "typeForValue");
        this.defaultValue = defaultValue;
        java.util.List listB0 = p078i6.p.B0(com.revenuecat.purchases.models.StoreReplacementMode.WITHOUT_PRORATION, com.revenuecat.purchases.models.StoreReplacementMode.WITH_TIME_PRORATION, com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_FULL_PRICE, com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_PRORATED_PRICE, com.revenuecat.purchases.models.StoreReplacementMode.DEFERRED);
        int iI0 = p078i6.D.I0(p078i6.q.I0(listB0, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0 < 16 ? 16 : iI0);
        for (java.lang.Object obj : listB0) {
            linkedHashMap.put(typeForValue.invoke(obj), obj);
        }
        this.valuesByType = linkedHashMap;
        this.descriptor = com.google.crypto.tink.shaded.protobuf.q0.d("StoreReplacementMode", p135p8.e.f26270n);
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.models.StoreReplacementMode deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode = this.valuesByType.get(decoder.m());
        return storeReplacementMode == null ? this.defaultValue : storeReplacementMode;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.models.StoreReplacementMode value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new p070h6.j("Serialization is not implemented because it is not needed.");
    }
}
