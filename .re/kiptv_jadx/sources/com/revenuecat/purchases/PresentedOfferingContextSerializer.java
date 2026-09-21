package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "", "OFFERING_IDENTIFIER_INDEX", "I", "PLACEMENT_IDENTIFIER_INDEX", "TARGETING_CONTEXT_INDEX", "", "nullableStringSerializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "nullableTargetingContextSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PresentedOfferingContextSerializer implements kotlinx.serialization.KSerializer {
    private static final int OFFERING_IDENTIFIER_INDEX = 0;
    private static final int PLACEMENT_IDENTIFIER_INDEX = 1;
    private static final int TARGETING_CONTEXT_INDEX = 2;
    public static final com.revenuecat.purchases.PresentedOfferingContextSerializer INSTANCE = new com.revenuecat.purchases.PresentedOfferingContextSerializer();
    private static final kotlinx.serialization.KSerializer nullableStringSerializer = com.google.android.gms.internal.play_billing.V0.s(p153r8.p0.f26988a);
    private static final kotlinx.serialization.KSerializer nullableTargetingContextSerializer = com.google.android.gms.internal.play_billing.V0.s(com.revenuecat.purchases.TargetingContextSerializer.INSTANCE);
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("PresentedOfferingContext", new kotlinx.serialization.descriptors.SerialDescriptor[0], com.revenuecat.purchases.PresentedOfferingContextSerializer$descriptor$1.INSTANCE);

    private PresentedOfferingContextSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.PresentedOfferingContext deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor2);
        java.lang.String strQ = "";
        java.lang.String str = null;
        com.revenuecat.purchases.PresentedOfferingContext.TargetingContext targetingContext = null;
        while (true) {
            com.revenuecat.purchases.PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
            int iS = aVarC.s(presentedOfferingContextSerializer.getDescriptor());
            if (iS == -1) {
                com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = new com.revenuecat.purchases.PresentedOfferingContext(strQ, str, targetingContext);
                aVarC.a(descriptor2);
                return presentedOfferingContext;
            }
            if (iS == 0) {
                strQ = aVarC.q(presentedOfferingContextSerializer.getDescriptor(), 0);
            } else if (iS == 1) {
                str = (java.lang.String) aVarC.x(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, null);
            } else {
                if (iS != 2) {
                    throw new java.lang.IllegalStateException(("Unexpected index: " + iS).toString());
                }
                targetingContext = (com.revenuecat.purchases.PresentedOfferingContext.TargetingContext) aVarC.x(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.PresentedOfferingContext value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        com.revenuecat.purchases.PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
        bVarC.s(presentedOfferingContextSerializer.getDescriptor(), 0, value.getOfferingIdentifier());
        bVarC.h(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, value.getPlacementIdentifier());
        bVarC.h(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, value.getTargetingContext());
        bVarC.a(descriptor2);
    }
}
