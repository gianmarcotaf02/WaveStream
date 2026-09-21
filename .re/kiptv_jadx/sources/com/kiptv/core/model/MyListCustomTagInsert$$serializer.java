package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/MyListCustomTagInsert.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/MyListCustomTagInsert;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/MyListCustomTagInsert;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/MyListCustomTagInsert;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class MyListCustomTagInsert$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.MyListCustomTagInsert$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.MyListCustomTagInsert$$serializer myListCustomTagInsert$$serializer = new com.kiptv.core.model.MyListCustomTagInsert$$serializer();
        INSTANCE = myListCustomTagInsert$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.MyListCustomTagInsert", myListCustomTagInsert$$serializer, 6);
        c2690c0.k(io.sentry.TraceContext.JsonKeys.USER_ID, false);
        c2690c0.k("playlist_id", false);
        c2690c0.k(io.sentry.SentryEnvelopeItemHeader.JsonKeys.CONTENT_TYPE, false);
        c2690c0.k("tag_key", false);
        c2690c0.k("tag_name", false);
        c2690c0.k("sort_order", false);
        descriptor = c2690c0;
    }

    private MyListCustomTagInsert$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new kotlinx.serialization.KSerializer[]{p0Var, p0Var, p0Var, p0Var, p0Var, p153r8.K.f26915a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.MyListCustomTagInsert deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        int iK = 0;
        java.lang.String strQ = null;
        java.lang.String strQ2 = null;
        java.lang.String strQ3 = null;
        java.lang.String strQ4 = null;
        java.lang.String strQ5 = null;
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
                    strQ2 = aVarC.q(serialDescriptor, 1);
                    i3 |= 2;
                    break;
                case 2:
                    strQ3 = aVarC.q(serialDescriptor, 2);
                    i3 |= 4;
                    break;
                case 3:
                    strQ4 = aVarC.q(serialDescriptor, 3);
                    i3 |= 8;
                    break;
                case 4:
                    strQ5 = aVarC.q(serialDescriptor, 4);
                    i3 |= 16;
                    break;
                case 5:
                    iK = aVarC.k(serialDescriptor, 5);
                    i3 |= 32;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.model.MyListCustomTagInsert(i3, strQ, strQ2, strQ3, strQ4, strQ5, iK);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.MyListCustomTagInsert value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.s(serialDescriptor, 0, value.f19865a);
        bVarC.s(serialDescriptor, 1, value.f19866b);
        bVarC.s(serialDescriptor, 2, value.f19867c);
        bVarC.s(serialDescriptor, 3, value.f19868d);
        bVarC.s(serialDescriptor, 4, value.f19869e);
        bVarC.n(5, value.f19870f, serialDescriptor);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
