package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/OSSubtitleResult.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/OSSubtitleResult;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/OSSubtitleResult;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/OSSubtitleResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class OSSubtitleResult$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.OSSubtitleResult$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.OSSubtitleResult$$serializer oSSubtitleResult$$serializer = new com.kiptv.core.model.OSSubtitleResult$$serializer();
        INSTANCE = oSSubtitleResult$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.OSSubtitleResult", oSSubtitleResult$$serializer, 3);
        c2690c0.k("id", false);
        c2690c0.k("type", true);
        c2690c0.k("attributes", false);
        descriptor = c2690c0;
    }

    private OSSubtitleResult$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new kotlinx.serialization.KSerializer[]{p0Var, com.google.android.gms.internal.play_billing.V0.s(p0Var), com.kiptv.core.model.OSSubtitleAttributes$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.OSSubtitleResult deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        java.lang.String strQ = null;
        boolean z6 = true;
        int i3 = 0;
        java.lang.String str = null;
        com.kiptv.core.model.OSSubtitleAttributes oSSubtitleAttributes = null;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                strQ = aVarC.q(serialDescriptor, 0);
                i3 |= 1;
            } else if (iS == 1) {
                str = (java.lang.String) aVarC.u(serialDescriptor, 1, p153r8.p0.f26988a, str);
                i3 |= 2;
            } else {
                if (iS != 2) {
                    throw new p119n8.m(iS);
                }
                oSSubtitleAttributes = (com.kiptv.core.model.OSSubtitleAttributes) aVarC.x(serialDescriptor, 2, com.kiptv.core.model.OSSubtitleAttributes$$serializer.INSTANCE, oSSubtitleAttributes);
                i3 |= 4;
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.model.OSSubtitleResult(i3, strQ, str, oSSubtitleAttributes);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.OSSubtitleResult value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.s(serialDescriptor, 0, value.f19949a);
        boolean zE = bVarC.E(serialDescriptor);
        java.lang.String str = value.f19950b;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 1, p153r8.p0.f26988a, str);
        }
        bVarC.h(serialDescriptor, 2, com.kiptv.core.model.OSSubtitleAttributes$$serializer.INSTANCE, value.f19951c);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
