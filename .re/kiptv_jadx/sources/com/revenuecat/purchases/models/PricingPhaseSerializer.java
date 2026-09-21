package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhaseSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/models/PricingPhase;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/models/PricingPhase;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/models/PricingPhase;", "", "nullableIntSerializer", "Lkotlinx/serialization/KSerializer;", "BILLING_PERIOD_INDEX", "I", "RECURRENCE_MODE_INDEX", "BILLING_CYCLE_COUNT_INDEX", "PRICE_INDEX", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PricingPhaseSerializer implements kotlinx.serialization.KSerializer {
    private static final int BILLING_CYCLE_COUNT_INDEX = 2;
    private static final int BILLING_PERIOD_INDEX = 0;
    private static final int PRICE_INDEX = 3;
    private static final int RECURRENCE_MODE_INDEX = 1;
    public static final com.revenuecat.purchases.models.PricingPhaseSerializer INSTANCE = new com.revenuecat.purchases.models.PricingPhaseSerializer();
    private static final kotlinx.serialization.KSerializer nullableIntSerializer = com.google.android.gms.internal.play_billing.V0.s(p153r8.K.f26915a);
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("PricingPhase", new kotlinx.serialization.descriptors.SerialDescriptor[0], com.revenuecat.purchases.models.PricingPhaseSerializer$descriptor$1.INSTANCE);

    private PricingPhaseSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.models.PricingPhase deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor2);
        com.revenuecat.purchases.models.Period period = null;
        com.revenuecat.purchases.models.RecurrenceMode recurrenceMode = null;
        java.lang.Integer num = null;
        com.revenuecat.purchases.models.Price price = null;
        while (true) {
            com.revenuecat.purchases.models.PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
            int iS = aVarC.s(pricingPhaseSerializer.getDescriptor());
            if (iS == -1) {
                kotlin.jvm.internal.m.b(period);
                kotlin.jvm.internal.m.b(recurrenceMode);
                kotlin.jvm.internal.m.b(price);
                com.revenuecat.purchases.models.PricingPhase pricingPhase = new com.revenuecat.purchases.models.PricingPhase(period, recurrenceMode, num, price);
                aVarC.a(descriptor2);
                return pricingPhase;
            }
            if (iS == 0) {
                period = (com.revenuecat.purchases.models.Period) aVarC.x(pricingPhaseSerializer.getDescriptor(), 0, com.revenuecat.purchases.models.PeriodSerializer.INSTANCE, null);
            } else if (iS == 1) {
                recurrenceMode = (com.revenuecat.purchases.models.RecurrenceMode) aVarC.x(pricingPhaseSerializer.getDescriptor(), 1, com.revenuecat.purchases.models.RecurrenceModeSerializer.INSTANCE, null);
            } else if (iS == 2) {
                num = (java.lang.Integer) aVarC.x(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, null);
            } else {
                if (iS != 3) {
                    throw new java.lang.IllegalStateException(("Unexpected index: " + iS).toString());
                }
                price = (com.revenuecat.purchases.models.Price) aVarC.x(pricingPhaseSerializer.getDescriptor(), 3, com.revenuecat.purchases.models.PriceSerializer.INSTANCE, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.models.PricingPhase value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        com.revenuecat.purchases.models.PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 0, com.revenuecat.purchases.models.PeriodSerializer.INSTANCE, value.getBillingPeriod());
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 1, com.revenuecat.purchases.models.RecurrenceModeSerializer.INSTANCE, value.getRecurrenceMode());
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, value.getBillingCycleCount());
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 3, com.revenuecat.purchases.models.PriceSerializer.INSTANCE, value.getPrice());
        bVarC.a(descriptor2);
    }
}
