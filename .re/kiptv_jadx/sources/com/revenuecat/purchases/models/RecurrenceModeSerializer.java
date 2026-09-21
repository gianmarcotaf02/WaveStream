package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/models/RecurrenceMode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RecurrenceModeSerializer implements kotlinx.serialization.KSerializer {
    public static final com.revenuecat.purchases.models.RecurrenceModeSerializer INSTANCE = new com.revenuecat.purchases.models.RecurrenceModeSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("RecurrenceMode", new kotlinx.serialization.descriptors.SerialDescriptor[0], com.revenuecat.purchases.models.RecurrenceModeSerializer$descriptor$1.INSTANCE);

    private RecurrenceModeSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.models.RecurrenceMode deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor2);
        java.lang.String strQ = "";
        while (true) {
            com.revenuecat.purchases.models.RecurrenceModeSerializer recurrenceModeSerializer = INSTANCE;
            int iS = aVarC.s(recurrenceModeSerializer.getDescriptor());
            if (iS == -1) {
                com.revenuecat.purchases.models.RecurrenceMode recurrenceModeValueOf = com.revenuecat.purchases.models.RecurrenceMode.valueOf(strQ);
                aVarC.a(descriptor2);
                return recurrenceModeValueOf;
            }
            if (iS != 0) {
                throw new java.lang.IllegalStateException(("Unexpected index: " + iS).toString());
            }
            strQ = aVarC.q(recurrenceModeSerializer.getDescriptor(), 0);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.models.RecurrenceMode value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        bVarC.s(INSTANCE.getDescriptor(), 0, value.name());
        bVarC.a(descriptor2);
    }
}
