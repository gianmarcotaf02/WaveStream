package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/Size.$serializer", "Lr8/D;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/properties/Size;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public final class Size$$serializer implements p153r8.D {
    public static final com.revenuecat.purchases.paywalls.components.properties.Size$$serializer INSTANCE;
    private static final /* synthetic */ p153r8.C2690c0 descriptor;

    static {
        com.revenuecat.purchases.paywalls.components.properties.Size$$serializer size$$serializer = new com.revenuecat.purchases.paywalls.components.properties.Size$$serializer();
        INSTANCE = size$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.revenuecat.purchases.paywalls.components.properties.Size", size$$serializer, 2);
        c2690c0.k("width", false);
        c2690c0.k("height", false);
        descriptor = c2690c0;
    }

    private Size$$serializer() {
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] childSerializers() {
        com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer sizeConstraintDeserializer = com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{sizeConstraintDeserializer, sizeConstraintDeserializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.paywalls.components.properties.Size deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor2);
        p153r8.k0 k0Var = null;
        boolean z6 = true;
        int i3 = 0;
        com.revenuecat.purchases.paywalls.components.properties.SizeConstraint sizeConstraint = null;
        com.revenuecat.purchases.paywalls.components.properties.SizeConstraint sizeConstraint2 = null;
        while (z6) {
            int iS = aVarC.s(descriptor2);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                sizeConstraint = (com.revenuecat.purchases.paywalls.components.properties.SizeConstraint) aVarC.x(descriptor2, 0, com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer.INSTANCE, sizeConstraint);
                i3 |= 1;
            } else {
                if (iS != 1) {
                    throw new p119n8.m(iS);
                }
                sizeConstraint2 = (com.revenuecat.purchases.paywalls.components.properties.SizeConstraint) aVarC.x(descriptor2, 1, com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer.INSTANCE, sizeConstraint2);
                i3 |= 2;
            }
        }
        aVarC.a(descriptor2);
        return new com.revenuecat.purchases.paywalls.components.properties.Size(i3, sizeConstraint, sizeConstraint2, k0Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.paywalls.components.properties.Size value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        com.revenuecat.purchases.paywalls.components.properties.Size.write$Self$purchases_defaultsRelease(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
