package com.kiptv.core.service;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.c;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;
import p153r8.D;
import p153r8.p0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/service/TriviaPill.$serializer", "Lr8/D;", "Lcom/kiptv/core/service/TriviaPill;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/service/TriviaPill;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/service/TriviaPill;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@c
public class TriviaPill$$serializer implements D {
    public static final TriviaPill$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TriviaPill$$serializer triviaPill$$serializer = new TriviaPill$$serializer();
        INSTANCE = triviaPill$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.service.TriviaPill", triviaPill$$serializer, 3);
        c2690c0.k("id", false);
        c2690c0.k("text", false);
        c2690c0.k("category", true);
        descriptor = c2690c0;
    }

    private TriviaPill$$serializer() {
    }

    @Override
    public final KSerializer[] childSerializers() {
        p0 p0Var = p0.f26988a;
        return new KSerializer[]{p0Var, p0Var, V0.s(p0Var)};
    }

    @Override
    public final TriviaPill deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        String strQ = null;
        boolean z6 = true;
        int i3 = 0;
        String strQ2 = null;
        String str = null;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                strQ = aVarC.q(serialDescriptor, 0);
                i3 |= 1;
            } else if (iS == 1) {
                strQ2 = aVarC.q(serialDescriptor, 1);
                i3 |= 2;
            } else {
                if (iS != 2) {
                    throw new p119n8.m(iS);
                }
                str = (String) aVarC.u(serialDescriptor, 2, p0.f26988a, str);
                i3 |= 4;
            }
        }
        aVarC.a(serialDescriptor);
        return new TriviaPill(i3, strQ, strQ2, str);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, TriviaPill value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        bVarC.s(serialDescriptor, 0, value.f20981a);
        bVarC.s(serialDescriptor, 1, value.f20982b);
        boolean zE = bVarC.E(serialDescriptor);
        String str = value.f20983c;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 2, p0.f26988a, str);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
