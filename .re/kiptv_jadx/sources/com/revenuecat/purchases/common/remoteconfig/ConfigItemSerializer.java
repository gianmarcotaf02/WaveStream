package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/ConfigItemSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;)V", "", "BLOB_REF_KEY", "Ljava/lang/String;", "PREFETCH_KEY", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConfigItemSerializer implements kotlinx.serialization.KSerializer {
    private static final java.lang.String BLOB_REF_KEY = "blob_ref";
    private static final java.lang.String PREFETCH_KEY = "prefetch";
    public static final com.revenuecat.purchases.common.remoteconfig.ConfigItemSerializer INSTANCE = new com.revenuecat.purchases.common.remoteconfig.ConfigItemSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.json.c.Companion.serializer().getDescriptor();

    private ConfigItemSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String strD;
        java.lang.Boolean boolE;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = decoder instanceof p162s8.k ? (p162s8.k) decoder : null;
        if (kVar == null) {
            throw new p119n8.j("ConfigItem can only be deserialized from JSON.");
        }
        kotlinx.serialization.json.b bVarI = kVar.i();
        kotlinx.serialization.json.c cVar = bVarI instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarI : null;
        if (cVar == null) {
            throw new p119n8.j("ConfigItem must be a JSON object, but was: " + bVarI + '.');
        }
        java.lang.Object obj = cVar.get(BLOB_REF_KEY);
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        if (dVar == null) {
            strD = null;
        } else {
            if (!dVar.e()) {
                dVar = null;
            }
            if (dVar != null) {
                strD = dVar.d();
            } else {
                strD = null;
            }
        }
        java.lang.Object obj2 = cVar.get("prefetch");
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        boolean zBooleanValue = (dVar2 == null || (boolE = p162s8.l.e(dVar2)) == null) ? false : boolE.booleanValue();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : cVar.f24558h.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (!kotlin.jvm.internal.m.a(str, BLOB_REF_KEY) && !kotlin.jvm.internal.m.a(str, "prefetch")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem(strD, zBooleanValue, new kotlinx.serialization.json.c(linkedHashMap));
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        p162s8.o oVar = encoder instanceof p162s8.o ? (p162s8.o) encoder : null;
        if (oVar == null) {
            throw new p119n8.j("ConfigItem can only be serialized to JSON.");
        }
        p086j6.e eVar = new p086j6.e();
        eVar.putAll(value.getMetadata());
        java.lang.String blobRef = value.getBlobRef();
        if (blobRef != null) {
        }
        if (value.getPrefetch()) {
            eVar.put("prefetch", p162s8.l.a(java.lang.Boolean.TRUE));
        }
        oVar.w(new kotlinx.serialization.json.c(eVar.b()));
    }
}
