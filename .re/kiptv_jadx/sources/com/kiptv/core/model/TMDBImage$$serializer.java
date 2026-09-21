package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBImage.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBImage;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBImage;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBImage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class TMDBImage$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.TMDBImage$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.TMDBImage$$serializer tMDBImage$$serializer = new com.kiptv.core.model.TMDBImage$$serializer();
        INSTANCE = tMDBImage$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.TMDBImage", tMDBImage$$serializer, 6);
        c2690c0.k("file_path", false);
        c2690c0.k("width", true);
        c2690c0.k("height", true);
        c2690c0.k("aspect_ratio", true);
        c2690c0.k("iso_639_1", true);
        c2690c0.k("vote_average", true);
        descriptor = c2690c0;
    }

    private TMDBImage$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        p153r8.K k9 = p153r8.K.f26915a;
        kotlinx.serialization.KSerializer kSerializerS = com.google.android.gms.internal.play_billing.V0.s(k9);
        kotlinx.serialization.KSerializer kSerializerS2 = com.google.android.gms.internal.play_billing.V0.s(k9);
        p153r8.C2709u c2709u = p153r8.C2709u.f27003a;
        return new kotlinx.serialization.KSerializer[]{p0Var, kSerializerS, kSerializerS2, com.google.android.gms.internal.play_billing.V0.s(c2709u), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(c2709u)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.TMDBImage deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        java.lang.String strQ = null;
        java.lang.Integer num = null;
        java.lang.Integer num2 = null;
        java.lang.Double d4 = null;
        java.lang.String str = null;
        java.lang.Double d6 = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strQ = aVarC.q(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    num = (java.lang.Integer) aVarC.u(serialDescriptor, 1, p153r8.K.f26915a, num);
                    i3 |= 2;
                    break;
                case 2:
                    num2 = (java.lang.Integer) aVarC.u(serialDescriptor, 2, p153r8.K.f26915a, num2);
                    i3 |= 4;
                    break;
                case 3:
                    d4 = (java.lang.Double) aVarC.u(serialDescriptor, 3, p153r8.C2709u.f27003a, d4);
                    i3 |= 8;
                    break;
                case 4:
                    str = (java.lang.String) aVarC.u(serialDescriptor, 4, p153r8.p0.f26988a, str);
                    i3 |= 16;
                    break;
                case 5:
                    d6 = (java.lang.Double) aVarC.u(serialDescriptor, 5, p153r8.C2709u.f27003a, d6);
                    i3 |= 32;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.model.TMDBImage(i3, strQ, num, num2, d4, str, d6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.TMDBImage value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.s(serialDescriptor, 0, value.f20180a);
        boolean zE = bVarC.E(serialDescriptor);
        java.lang.Integer num = value.f20181b;
        if (zE || num != null) {
            bVarC.t(serialDescriptor, 1, p153r8.K.f26915a, num);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        java.lang.Integer num2 = value.f20182c;
        if (zE2 || num2 != null) {
            bVarC.t(serialDescriptor, 2, p153r8.K.f26915a, num2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        java.lang.Double d4 = value.f20183d;
        if (zE3 || d4 != null) {
            bVarC.t(serialDescriptor, 3, p153r8.C2709u.f27003a, d4);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        java.lang.String str = value.f20184e;
        if (zE4 || str != null) {
            bVarC.t(serialDescriptor, 4, p153r8.p0.f26988a, str);
        }
        boolean zE5 = bVarC.E(serialDescriptor);
        java.lang.Double d6 = value.f20185f;
        if (zE5 || d6 != null) {
            bVarC.t(serialDescriptor, 5, p153r8.C2709u.f27003a, d6);
        }
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
