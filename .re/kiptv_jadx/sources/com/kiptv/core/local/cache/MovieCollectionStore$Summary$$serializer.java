package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore.Summary.$serializer", "Lr8/D;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class MovieCollectionStore$Summary$$serializer implements p153r8.D {
    public static final com.kiptv.core.local.cache.MovieCollectionStore$Summary$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.local.cache.MovieCollectionStore$Summary$$serializer movieCollectionStore$Summary$$serializer = new com.kiptv.core.local.cache.MovieCollectionStore$Summary$$serializer();
        INSTANCE = movieCollectionStore$Summary$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.local.cache.MovieCollectionStore.Summary", movieCollectionStore$Summary$$serializer, 6);
        c2690c0.k("id", false);
        c2690c0.k("name", false);
        c2690c0.k("posterPath", true);
        c2690c0.k("backdropPath", true);
        c2690c0.k("overview", true);
        c2690c0.k("parts", true);
        descriptor = c2690c0;
    }

    private MovieCollectionStore$Summary$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.local.cache.MovieCollectionStore$Summary.g;
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new kotlinx.serialization.KSerializer[]{p153r8.K.f26915a, p0Var, com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(p0Var), kSerializerArr[5]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.local.cache.MovieCollectionStore$Summary deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.local.cache.MovieCollectionStore$Summary.g;
        int i3 = 0;
        int iK = 0;
        java.lang.String strQ = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.util.List list = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    iK = aVarC.k(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    strQ = aVarC.q(serialDescriptor, 1);
                    i3 |= 2;
                    break;
                case 2:
                    str = (java.lang.String) aVarC.u(serialDescriptor, 2, p153r8.p0.f26988a, str);
                    i3 |= 4;
                    break;
                case 3:
                    str2 = (java.lang.String) aVarC.u(serialDescriptor, 3, p153r8.p0.f26988a, str2);
                    i3 |= 8;
                    break;
                case 4:
                    str3 = (java.lang.String) aVarC.u(serialDescriptor, 4, p153r8.p0.f26988a, str3);
                    i3 |= 16;
                    break;
                case 5:
                    list = (java.util.List) aVarC.x(serialDescriptor, 5, kSerializerArr[5], list);
                    i3 |= 32;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.local.cache.MovieCollectionStore$Summary(i3, iK, strQ, str, str2, str3, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.local.cache.MovieCollectionStore$Summary value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f19611a, serialDescriptor);
        bVarC.s(serialDescriptor, 1, value.f19612b);
        boolean zE = bVarC.E(serialDescriptor);
        java.lang.String str = value.f19613c;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 2, p153r8.p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        java.lang.String str2 = value.f19614d;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 3, p153r8.p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        java.lang.String str3 = value.f19615e;
        if (zE3 || str3 != null) {
            bVarC.t(serialDescriptor, 4, p153r8.p0.f26988a, str3);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        java.util.List list = value.f19616f;
        if (zE4 || !kotlin.jvm.internal.m.a(list, p078i6.w.f23205h)) {
            bVarC.h(serialDescriptor, 5, com.kiptv.core.local.cache.MovieCollectionStore$Summary.g[5], list);
        }
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
