package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p153r8.p0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "", "OFFERING_IDENTIFIER_INDEX", "I", "PLACEMENT_IDENTIFIER_INDEX", "TARGETING_CONTEXT_INDEX", "", "nullableStringSerializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "nullableTargetingContextSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PresentedOfferingContextSerializer implements KSerializer {
    private static final int OFFERING_IDENTIFIER_INDEX = 0;
    private static final int PLACEMENT_IDENTIFIER_INDEX = 1;
    private static final int TARGETING_CONTEXT_INDEX = 2;
    public static final PresentedOfferingContextSerializer INSTANCE = new PresentedOfferingContextSerializer();
    private static final KSerializer nullableStringSerializer = V0.s(p0.f26988a);
    private static final KSerializer nullableTargetingContextSerializer = V0.s(TargetingContextSerializer.INSTANCE);
    private static final SerialDescriptor descriptor = q0.j("PresentedOfferingContext", new SerialDescriptor[0], PresentedOfferingContextSerializer$descriptor$1.INSTANCE);

    private PresentedOfferingContextSerializer() {
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public PresentedOfferingContext deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor2);
        String strQ = "";
        String str = null;
        PresentedOfferingContext.TargetingContext targetingContext = null;
        while (true) {
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
            int iS = aVarC.s(presentedOfferingContextSerializer.getDescriptor());
            if (iS == -1) {
                PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(strQ, str, targetingContext);
                aVarC.a(descriptor2);
                return presentedOfferingContext;
            }
            if (iS == 0) {
                strQ = aVarC.q(presentedOfferingContextSerializer.getDescriptor(), 0);
            } else if (iS == 1) {
                str = (String) aVarC.x(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, null);
            } else {
                if (iS != 2) {
                    throw new IllegalStateException(("Unexpected index: " + iS).toString());
                }
                targetingContext = (PresentedOfferingContext.TargetingContext) aVarC.x(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, null);
            }
        }
    }

    @Override
    public void serialize(Encoder encoder, PresentedOfferingContext value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
        bVarC.s(presentedOfferingContextSerializer.getDescriptor(), 0, value.getOfferingIdentifier());
        bVarC.h(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, value.getPlacementIdentifier());
        bVarC.h(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, value.getTargetingContext());
        bVarC.a(descriptor2);
    }
}
