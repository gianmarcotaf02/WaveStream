package com.revenuecat.purchases.utils.serializers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/JsonObjectToMapSerializer;", "Lkotlinx/serialization/KSerializer;", "", "", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/util/Map;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/util/Map;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JsonObjectToMapSerializer implements kotlinx.serialization.KSerializer {
    public static final com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializer INSTANCE = new com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.json.c.Companion.serializer().getDescriptor();

    private JsonObjectToMapSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public java.util.Map<java.lang.String, java.lang.Object> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = decoder instanceof p162s8.k ? (p162s8.k) decoder : null;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Only JSON decoding is supported");
        }
        kotlinx.serialization.json.b bVarI = kVar.i();
        kotlinx.serialization.json.c cVar = bVarI instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarI : null;
        return cVar == null ? p078i6.x.f23206h : com.revenuecat.purchases.utils.serializers.JsonObjectToMapSerializerKt.toAnyMap(cVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, java.util.Map<java.lang.String, ? extends java.lang.Object> value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new java.lang.IllegalStateException("Serialization of Map<String, Any> is not supported");
    }
}
