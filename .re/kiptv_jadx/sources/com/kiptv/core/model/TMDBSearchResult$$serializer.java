package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBSearchResult.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBSearchResult;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBSearchResult;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBSearchResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class TMDBSearchResult$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.TMDBSearchResult$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.TMDBSearchResult$$serializer tMDBSearchResult$$serializer = new com.kiptv.core.model.TMDBSearchResult$$serializer();
        INSTANCE = tMDBSearchResult$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.TMDBSearchResult", tMDBSearchResult$$serializer, 17);
        c2690c0.k("id", false);
        c2690c0.k(io.ktor.http.LinkHeader.Parameters.Title, true);
        c2690c0.k("name", true);
        c2690c0.k("original_title", true);
        c2690c0.k("original_name", true);
        c2690c0.k("overview", true);
        c2690c0.k("poster_path", true);
        c2690c0.k("backdrop_path", true);
        c2690c0.k("release_date", true);
        c2690c0.k("first_air_date", true);
        c2690c0.k("vote_average", true);
        c2690c0.k("vote_count", true);
        c2690c0.k("popularity", true);
        c2690c0.k("media_type", true);
        c2690c0.k("adult", true);
        c2690c0.k("original_language", true);
        c2690c0.k("genre_ids", true);
        descriptor = c2690c0;
    }

    private TMDBSearchResult$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.TMDBSearchResult.f20291r;
        p153r8.K k9 = p153r8.K.f26915a;
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        kotlinx.serialization.KSerializer kSerializerS = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS2 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS3 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS4 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS5 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS6 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS7 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS8 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        kotlinx.serialization.KSerializer kSerializerS9 = com.google.android.gms.internal.play_billing.V0.s(p0Var);
        p153r8.C2709u c2709u = p153r8.C2709u.f27003a;
        return new kotlinx.serialization.KSerializer[]{k9, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, kSerializerS5, kSerializerS6, kSerializerS7, kSerializerS8, kSerializerS9, com.google.android.gms.internal.play_billing.V0.s(c2709u), com.google.android.gms.internal.play_billing.V0.s(k9), com.google.android.gms.internal.play_billing.V0.s(c2709u), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(p153r8.C2696g.f26961a), com.google.android.gms.internal.play_billing.V0.s(p0Var), com.google.android.gms.internal.play_billing.V0.s(kSerializerArr[16])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.TMDBSearchResult deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i3;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.TMDBSearchResult.f20291r;
        java.lang.String str = null;
        java.lang.Boolean bool = null;
        java.lang.String str2 = null;
        java.lang.Double d4 = null;
        java.lang.String str3 = null;
        java.lang.Double d6 = null;
        java.lang.Integer num = null;
        java.lang.String str4 = null;
        java.util.List list = null;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        java.lang.String str7 = null;
        java.lang.String str8 = null;
        java.lang.String str9 = null;
        java.lang.String str10 = null;
        java.lang.String str11 = null;
        int i9 = 0;
        boolean z6 = true;
        int iK = 0;
        while (z6) {
            java.lang.String str12 = str5;
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    str5 = str12;
                    str4 = str4;
                    str6 = str6;
                    bool = bool;
                    break;
                case 0:
                    iK = aVarC.k(serialDescriptor, 0);
                    i9 |= 1;
                    str5 = str12;
                    str4 = str4;
                    str6 = str6;
                    bool = bool;
                    break;
                case 1:
                    str9 = (java.lang.String) aVarC.u(serialDescriptor, 1, p153r8.p0.f26988a, str9);
                    i9 |= 2;
                    str5 = str12;
                    str4 = str4;
                    str6 = str6;
                    bool = bool;
                    break;
                case 2:
                    str10 = (java.lang.String) aVarC.u(serialDescriptor, 2, p153r8.p0.f26988a, str10);
                    i9 |= 4;
                    str5 = str12;
                    str6 = str6;
                    bool = bool;
                    break;
                case 3:
                    str11 = (java.lang.String) aVarC.u(serialDescriptor, 3, p153r8.p0.f26988a, str11);
                    i9 |= 8;
                    str5 = str12;
                    str6 = str6;
                    bool = bool;
                    break;
                case 4:
                    bool = bool;
                    str6 = str6;
                    str5 = (java.lang.String) aVarC.u(serialDescriptor, 4, p153r8.p0.f26988a, str12);
                    i9 |= 16;
                    str6 = str6;
                    bool = bool;
                    break;
                case 5:
                    bool = bool;
                    str6 = (java.lang.String) aVarC.u(serialDescriptor, 5, p153r8.p0.f26988a, str6);
                    i9 |= 32;
                    str5 = str12;
                    bool = bool;
                    break;
                case 6:
                    str6 = str6;
                    str7 = (java.lang.String) aVarC.u(serialDescriptor, 6, p153r8.p0.f26988a, str7);
                    i9 |= 64;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 7:
                    str6 = str6;
                    str8 = (java.lang.String) aVarC.u(serialDescriptor, 7, p153r8.p0.f26988a, str8);
                    i9 |= 128;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 8:
                    str6 = str6;
                    str = (java.lang.String) aVarC.u(serialDescriptor, 8, p153r8.p0.f26988a, str);
                    i9 |= 256;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 9:
                    str6 = str6;
                    str3 = (java.lang.String) aVarC.u(serialDescriptor, 9, p153r8.p0.f26988a, str3);
                    i9 |= 512;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 10:
                    str6 = str6;
                    d6 = (java.lang.Double) aVarC.u(serialDescriptor, 10, p153r8.C2709u.f27003a, d6);
                    i9 |= 1024;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 11:
                    str6 = str6;
                    num = (java.lang.Integer) aVarC.u(serialDescriptor, 11, p153r8.K.f26915a, num);
                    i9 |= 2048;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 12:
                    str6 = str6;
                    d4 = (java.lang.Double) aVarC.u(serialDescriptor, 12, p153r8.C2709u.f27003a, d4);
                    i9 |= 4096;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 13:
                    str6 = str6;
                    str2 = (java.lang.String) aVarC.u(serialDescriptor, 13, p153r8.p0.f26988a, str2);
                    i9 |= 8192;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 14:
                    str6 = str6;
                    bool = (java.lang.Boolean) aVarC.u(serialDescriptor, 14, p153r8.C2696g.f26961a, bool);
                    i9 |= 16384;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 15:
                    str4 = (java.lang.String) aVarC.u(serialDescriptor, 15, p153r8.p0.f26988a, str4);
                    i3 = 32768;
                    i9 |= i3;
                    str5 = str12;
                    str6 = str6;
                    break;
                case 16:
                    list = (java.util.List) aVarC.u(serialDescriptor, 16, kSerializerArr[16], list);
                    i3 = 65536;
                    i9 |= i3;
                    str5 = str12;
                    str6 = str6;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        java.lang.Boolean bool2 = bool;
        java.lang.String str13 = str4;
        aVarC.a(serialDescriptor);
        return new com.kiptv.core.model.TMDBSearchResult(i9, iK, str9, str10, str11, str5, str6, str7, str8, str, str3, d6, num, d4, str2, bool2, str13, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.TMDBSearchResult value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f20292a, serialDescriptor);
        boolean zE = bVarC.E(serialDescriptor);
        java.lang.String str = value.f20293b;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 1, p153r8.p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        java.lang.String str2 = value.f20294c;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 2, p153r8.p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        java.lang.String str3 = value.f20295d;
        if (zE3 || str3 != null) {
            bVarC.t(serialDescriptor, 3, p153r8.p0.f26988a, str3);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        java.lang.String str4 = value.f20296e;
        if (zE4 || str4 != null) {
            bVarC.t(serialDescriptor, 4, p153r8.p0.f26988a, str4);
        }
        boolean zE5 = bVarC.E(serialDescriptor);
        java.lang.String str5 = value.f20297f;
        if (zE5 || str5 != null) {
            bVarC.t(serialDescriptor, 5, p153r8.p0.f26988a, str5);
        }
        boolean zE6 = bVarC.E(serialDescriptor);
        java.lang.String str6 = value.g;
        if (zE6 || str6 != null) {
            bVarC.t(serialDescriptor, 6, p153r8.p0.f26988a, str6);
        }
        boolean zE7 = bVarC.E(serialDescriptor);
        java.lang.String str7 = value.f20298h;
        if (zE7 || str7 != null) {
            bVarC.t(serialDescriptor, 7, p153r8.p0.f26988a, str7);
        }
        boolean zE8 = bVarC.E(serialDescriptor);
        java.lang.String str8 = value.f20299i;
        if (zE8 || str8 != null) {
            bVarC.t(serialDescriptor, 8, p153r8.p0.f26988a, str8);
        }
        boolean zE9 = bVarC.E(serialDescriptor);
        java.lang.String str9 = value.j;
        if (zE9 || str9 != null) {
            bVarC.t(serialDescriptor, 9, p153r8.p0.f26988a, str9);
        }
        boolean zE10 = bVarC.E(serialDescriptor);
        java.lang.Double d4 = value.f20300k;
        if (zE10 || d4 != null) {
            bVarC.t(serialDescriptor, 10, p153r8.C2709u.f27003a, d4);
        }
        boolean zE11 = bVarC.E(serialDescriptor);
        java.lang.Integer num = value.f20301l;
        if (zE11 || num != null) {
            bVarC.t(serialDescriptor, 11, p153r8.K.f26915a, num);
        }
        boolean zE12 = bVarC.E(serialDescriptor);
        java.lang.Double d6 = value.f20302m;
        if (zE12 || d6 != null) {
            bVarC.t(serialDescriptor, 12, p153r8.C2709u.f27003a, d6);
        }
        boolean zE13 = bVarC.E(serialDescriptor);
        java.lang.String str10 = value.f20303n;
        if (zE13 || str10 != null) {
            bVarC.t(serialDescriptor, 13, p153r8.p0.f26988a, str10);
        }
        boolean zE14 = bVarC.E(serialDescriptor);
        java.lang.Boolean bool = value.f20304o;
        if (zE14 || bool != null) {
            bVarC.t(serialDescriptor, 14, p153r8.C2696g.f26961a, bool);
        }
        boolean zE15 = bVarC.E(serialDescriptor);
        java.lang.String str11 = value.f20305p;
        if (zE15 || str11 != null) {
            bVarC.t(serialDescriptor, 15, p153r8.p0.f26988a, str11);
        }
        boolean zE16 = bVarC.E(serialDescriptor);
        java.util.List list = value.f20306q;
        if (zE16 || list != null) {
            bVarC.t(serialDescriptor, 16, com.kiptv.core.model.TMDBSearchResult.f20291r[16], list);
        }
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
