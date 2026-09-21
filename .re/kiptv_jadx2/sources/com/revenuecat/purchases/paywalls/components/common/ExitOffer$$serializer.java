package com.revenuecat.purchases.paywalls.components.common;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.c;
import p143q8.a;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;
import p153r8.D;
import p153r8.p0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ExitOffer.$serializer", "Lr8/D;", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@c
public final class ExitOffer$$serializer implements D {
    public static final ExitOffer$$serializer INSTANCE;
    private static final C2690c0 descriptor;

    static {
        ExitOffer$$serializer exitOffer$$serializer = new ExitOffer$$serializer();
        INSTANCE = exitOffer$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.revenuecat.purchases.paywalls.components.common.ExitOffer", exitOffer$$serializer, 1);
        c2690c0.k("offering_id", false);
        descriptor = c2690c0;
    }

    private ExitOffer$$serializer() {
    }

    @Override
    public KSerializer[] childSerializers() {
        return new KSerializer[]{p0.f26988a};
    }

    @Override
    public ExitOffer deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        a aVarC = decoder.c(descriptor2);
        boolean z6 = true;
        int i3 = 0;
        String strQ = null;
        while (z6) {
            int iS = aVarC.s(descriptor2);
            if (iS == -1) {
                z6 = false;
            } else {
                if (iS != 0) {
                    throw new p119n8.m(iS);
                }
                strQ = aVarC.q(descriptor2, 0);
                i3 = 1;
            }
        }
        aVarC.a(descriptor2);
        return new ExitOffer(i3, strQ, null);
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(Encoder encoder, ExitOffer value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        bVarC.s(descriptor2, 0, value.offeringId);
        bVarC.a(descriptor2);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
