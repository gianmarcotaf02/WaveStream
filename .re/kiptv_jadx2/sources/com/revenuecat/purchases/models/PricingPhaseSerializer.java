package com.revenuecat.purchases.models;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p143q8.a;
import p143q8.b;
import p153r8.K;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhaseSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/models/PricingPhase;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/models/PricingPhase;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/models/PricingPhase;", "", "nullableIntSerializer", "Lkotlinx/serialization/KSerializer;", "BILLING_PERIOD_INDEX", "I", "RECURRENCE_MODE_INDEX", "BILLING_CYCLE_COUNT_INDEX", "PRICE_INDEX", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PricingPhaseSerializer implements KSerializer {
    private static final int BILLING_CYCLE_COUNT_INDEX = 2;
    private static final int BILLING_PERIOD_INDEX = 0;
    private static final int PRICE_INDEX = 3;
    private static final int RECURRENCE_MODE_INDEX = 1;
    public static final PricingPhaseSerializer INSTANCE = new PricingPhaseSerializer();
    private static final KSerializer nullableIntSerializer = V0.s(K.f26915a);
    private static final SerialDescriptor descriptor = q0.j("PricingPhase", new SerialDescriptor[0], PricingPhaseSerializer$descriptor$1.INSTANCE);

    private PricingPhaseSerializer() {
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public PricingPhase deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        a aVarC = decoder.c(descriptor2);
        Period period = null;
        RecurrenceMode recurrenceMode = null;
        Integer num = null;
        Price price = null;
        while (true) {
            PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
            int iS = aVarC.s(pricingPhaseSerializer.getDescriptor());
            if (iS == -1) {
                m.b(period);
                m.b(recurrenceMode);
                m.b(price);
                PricingPhase pricingPhase = new PricingPhase(period, recurrenceMode, num, price);
                aVarC.a(descriptor2);
                return pricingPhase;
            }
            if (iS == 0) {
                period = (Period) aVarC.x(pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, null);
            } else if (iS == 1) {
                recurrenceMode = (RecurrenceMode) aVarC.x(pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, null);
            } else if (iS == 2) {
                num = (Integer) aVarC.x(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, null);
            } else {
                if (iS != 3) {
                    throw new IllegalStateException(("Unexpected index: " + iS).toString());
                }
                price = (Price) aVarC.x(pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, null);
            }
        }
    }

    @Override
    public void serialize(Encoder encoder, PricingPhase value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, value.getBillingPeriod());
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, value.getRecurrenceMode());
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 2, nullableIntSerializer, value.getBillingCycleCount());
        bVarC.h(pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, value.getPrice());
        bVarC.a(descriptor2);
    }
}
