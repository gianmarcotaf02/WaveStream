package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/local/cache/SearchIndexDiskCache.SearchIndexDto.$serializer", "Lr8/D;", "Lcom/kiptv/core/local/cache/SearchIndexDiskCache$SearchIndexDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/local/cache/SearchIndexDiskCache$SearchIndexDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/local/cache/SearchIndexDiskCache$SearchIndexDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class SearchIndexDiskCache$SearchIndexDto$$serializer implements p153r8.D {
    public static final com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto$$serializer searchIndexDiskCache$SearchIndexDto$$serializer = new com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto$$serializer();
        INSTANCE = searchIndexDiskCache$SearchIndexDto$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.local.cache.SearchIndexDiskCache.SearchIndexDto", searchIndexDiskCache$SearchIndexDto$$serializer, 12);
        c2690c0.k("version", false);
        c2690c0.k("playlistId", false);
        c2690c0.k("cachedAt", false);
        c2690c0.k("movieCount", false);
        c2690c0.k("seriesCount", false);
        c2690c0.k("entries", false);
        c2690c0.k("byNormalized", false);
        c2690c0.k("byYear", false);
        c2690c0.k("byTmdbId", false);
        c2690c0.k("byPrefix", false);
        c2690c0.k("byKeyword", false);
        c2690c0.k("byContains", false);
        descriptor = c2690c0;
    }

    private SearchIndexDiskCache$SearchIndexDto$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto.f19624m;
        kotlinx.serialization.KSerializer kSerializer = kSerializerArr[5];
        kotlinx.serialization.KSerializer kSerializer2 = kSerializerArr[6];
        kotlinx.serialization.KSerializer kSerializer3 = kSerializerArr[7];
        kotlinx.serialization.KSerializer kSerializer4 = kSerializerArr[8];
        kotlinx.serialization.KSerializer kSerializer5 = kSerializerArr[9];
        kotlinx.serialization.KSerializer kSerializer6 = kSerializerArr[10];
        kotlinx.serialization.KSerializer kSerializer7 = kSerializerArr[11];
        p153r8.K k9 = p153r8.K.f26915a;
        return new kotlinx.serialization.KSerializer[]{k9, p153r8.p0.f26988a, p153r8.P.f26922a, k9, k9, kSerializer, kSerializer2, kSerializer3, kSerializer4, kSerializer5, kSerializer6, kSerializer7};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlinx.serialization.KSerializer[] kSerializerArr;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr2 = com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto.f19624m;
        java.util.List list = null;
        java.util.Map map = null;
        java.util.Map map2 = null;
        java.util.Map map3 = null;
        java.lang.String strQ = null;
        java.util.Map map4 = null;
        long jH = 0;
        int i3 = 0;
        boolean z6 = true;
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        java.util.Map map5 = null;
        java.util.Map map6 = null;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    iK = aVarC.k(serialDescriptor, 0);
                    i3 |= 1;
                    break;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    strQ = aVarC.q(serialDescriptor, 1);
                    i3 |= 2;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    jH = aVarC.h(serialDescriptor, 2);
                    i3 |= 4;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    iK2 = aVarC.k(serialDescriptor, 3);
                    i3 |= 8;
                    break;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    iK3 = aVarC.k(serialDescriptor, 4);
                    i3 |= 16;
                    break;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    list = (java.util.List) aVarC.x(serialDescriptor, 5, kSerializerArr[5], list);
                    i3 |= 32;
                    break;
                case 6:
                    kSerializerArr = kSerializerArr2;
                    map5 = (java.util.Map) aVarC.x(serialDescriptor, 6, kSerializerArr[6], map5);
                    i3 |= 64;
                    break;
                case 7:
                    kSerializerArr = kSerializerArr2;
                    map6 = (java.util.Map) aVarC.x(serialDescriptor, 7, kSerializerArr[7], map6);
                    i3 |= 128;
                    break;
                case 8:
                    kSerializerArr = kSerializerArr2;
                    map = (java.util.Map) aVarC.x(serialDescriptor, 8, kSerializerArr[8], map);
                    i3 |= 256;
                    break;
                case 9:
                    kSerializerArr = kSerializerArr2;
                    map2 = (java.util.Map) aVarC.x(serialDescriptor, 9, kSerializerArr[9], map2);
                    i3 |= 512;
                    break;
                case 10:
                    kSerializerArr = kSerializerArr2;
                    map3 = (java.util.Map) aVarC.x(serialDescriptor, 10, kSerializerArr[10], map3);
                    i3 |= 1024;
                    break;
                case 11:
                    kSerializerArr = kSerializerArr2;
                    map4 = (java.util.Map) aVarC.x(serialDescriptor, 11, kSerializerArr[11], map4);
                    i3 |= 2048;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
            kSerializerArr2 = kSerializerArr;
        }
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto(i3, iK, strQ, jH, iK2, iK3, list, map5, map6, map, map2, map3, map4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f19625a, serialDescriptor);
        bVarC.s(serialDescriptor, 1, value.f19626b);
        bVarC.D(serialDescriptor, 2, value.f19627c);
        bVarC.n(3, value.f19628d, serialDescriptor);
        bVarC.n(4, value.f19629e, serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto.f19624m;
        bVarC.h(serialDescriptor, 5, kSerializerArr[5], value.f19630f);
        bVarC.h(serialDescriptor, 6, kSerializerArr[6], value.g);
        bVarC.h(serialDescriptor, 7, kSerializerArr[7], value.f19631h);
        bVarC.h(serialDescriptor, 8, kSerializerArr[8], value.f19632i);
        bVarC.h(serialDescriptor, 9, kSerializerArr[9], value.j);
        bVarC.h(serialDescriptor, 10, kSerializerArr[10], value.f19633k);
        bVarC.h(serialDescriptor, 11, kSerializerArr[11], value.f19634l);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
