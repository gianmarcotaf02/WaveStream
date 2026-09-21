package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/local/cache/CacheMetadata.$serializer", "Lr8/D;", "Lcom/kiptv/core/local/cache/CacheMetadata;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/local/cache/CacheMetadata;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/local/cache/CacheMetadata;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class CacheMetadata$$serializer implements p153r8.D {
    public static final com.kiptv.core.local.cache.CacheMetadata$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.local.cache.CacheMetadata$$serializer cacheMetadata$$serializer = new com.kiptv.core.local.cache.CacheMetadata$$serializer();
        INSTANCE = cacheMetadata$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.local.cache.CacheMetadata", cacheMetadata$$serializer, 8);
        c2690c0.k("cachedAt", false);
        c2690c0.k("version", false);
        c2690c0.k("vodCategoryCount", false);
        c2690c0.k("vodStreamCount", false);
        c2690c0.k("seriesCategoryCount", false);
        c2690c0.k("seriesStreamCount", false);
        c2690c0.k("liveCategoryCount", false);
        c2690c0.k("liveStreamCount", false);
        descriptor = c2690c0;
    }

    private CacheMetadata$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.K k9 = p153r8.K.f26915a;
        return new kotlinx.serialization.KSerializer[]{p153r8.P.f26922a, k9, k9, k9, k9, k9, k9, k9};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.local.cache.CacheMetadata deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        int iK4 = 0;
        int iK5 = 0;
        int iK6 = 0;
        int iK7 = 0;
        long jH = 0;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    jH = aVarC.h(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    iK = aVarC.k(serialDescriptor, 1);
                    i3 |= 2;
                    break;
                case 2:
                    iK2 = aVarC.k(serialDescriptor, 2);
                    i3 |= 4;
                    break;
                case 3:
                    iK3 = aVarC.k(serialDescriptor, 3);
                    i3 |= 8;
                    break;
                case 4:
                    iK4 = aVarC.k(serialDescriptor, 4);
                    i3 |= 16;
                    break;
                case 5:
                    iK5 = aVarC.k(serialDescriptor, 5);
                    i3 |= 32;
                    break;
                case 6:
                    iK6 = aVarC.k(serialDescriptor, 6);
                    i3 |= 64;
                    break;
                case 7:
                    iK7 = aVarC.k(serialDescriptor, 7);
                    i3 |= 128;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.local.cache.CacheMetadata(i3, jH, iK, iK2, iK3, iK4, iK5, iK6, iK7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.local.cache.CacheMetadata value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.D(serialDescriptor, 0, value.f19595a);
        bVarC.n(1, value.f19596b, serialDescriptor);
        bVarC.n(2, value.f19597c, serialDescriptor);
        bVarC.n(3, value.f19598d, serialDescriptor);
        bVarC.n(4, value.f19599e, serialDescriptor);
        bVarC.n(5, value.f19600f, serialDescriptor);
        bVarC.n(6, value.g, serialDescriptor);
        bVarC.n(7, value.f19601h, serialDescriptor);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
