package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import io.ktor.http.LinkHeader;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;
import p153r8.C2709u;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBPersonCreditEntry.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBPersonCreditEntry;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBPersonCreditEntry;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBPersonCreditEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public class TMDBPersonCreditEntry$$serializer implements p153r8.D {
    public static final TMDBPersonCreditEntry$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TMDBPersonCreditEntry$$serializer tMDBPersonCreditEntry$$serializer = new TMDBPersonCreditEntry$$serializer();
        INSTANCE = tMDBPersonCreditEntry$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.model.TMDBPersonCreditEntry", tMDBPersonCreditEntry$$serializer, 15);
        c2690c0.k("id", false);
        c2690c0.k(LinkHeader.Parameters.Title, true);
        c2690c0.k("name", true);
        c2690c0.k("character", true);
        c2690c0.k("media_type", true);
        c2690c0.k("poster_path", true);
        c2690c0.k("backdrop_path", true);
        c2690c0.k("vote_average", true);
        c2690c0.k("release_date", true);
        c2690c0.k("first_air_date", true);
        c2690c0.k("popularity", true);
        c2690c0.k("episode_count", true);
        c2690c0.k("overview", true);
        c2690c0.k("genre_ids", true);
        c2690c0.k("vote_count", true);
        descriptor = c2690c0;
    }

    private TMDBPersonCreditEntry$$serializer() {
    }

    @Override
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = TMDBPersonCreditEntry.f20221p;
        p153r8.K k9 = p153r8.K.f26915a;
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        KSerializer kSerializerS = V0.s(p0Var);
        KSerializer kSerializerS2 = V0.s(p0Var);
        KSerializer kSerializerS3 = V0.s(p0Var);
        KSerializer kSerializerS4 = V0.s(p0Var);
        KSerializer kSerializerS5 = V0.s(p0Var);
        KSerializer kSerializerS6 = V0.s(p0Var);
        C2709u c2709u = C2709u.f27003a;
        return new KSerializer[]{k9, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, kSerializerS5, kSerializerS6, V0.s(c2709u), V0.s(p0Var), V0.s(p0Var), V0.s(c2709u), V0.s(k9), V0.s(p0Var), V0.s(kSerializerArr[13]), V0.s(k9)};
    }

    @Override
    public final TMDBPersonCreditEntry deserialize(Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = TMDBPersonCreditEntry.f20221p;
        String str = null;
        Integer num = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        Double d4 = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Double d6 = null;
        String str9 = null;
        int i3 = 0;
        boolean z6 = true;
        int iK = 0;
        while (z6) {
            String str10 = str4;
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    i3 = i3;
                    d4 = d4;
                    z6 = false;
                    str4 = str10;
                    num = num;
                    break;
                case 0:
                    iK = aVarC.k(serialDescriptor, 0);
                    str4 = str10;
                    str5 = str5;
                    num = num;
                    i3 |= 1;
                    d4 = d4;
                    z6 = z6;
                    break;
                case 1:
                    str9 = (String) aVarC.u(serialDescriptor, 1, p153r8.p0.f26988a, str9);
                    i3 |= 2;
                    str4 = str10;
                    d4 = d4;
                    str5 = str5;
                    num = num;
                    z6 = z6;
                    break;
                case 2:
                    str4 = (String) aVarC.u(serialDescriptor, 2, p153r8.p0.f26988a, str10);
                    i3 |= 4;
                    str5 = str5;
                    num = num;
                    break;
                case 3:
                    str5 = (String) aVarC.u(serialDescriptor, 3, p153r8.p0.f26988a, str5);
                    i3 |= 8;
                    str4 = str10;
                    num = num;
                    break;
                case 4:
                    str6 = (String) aVarC.u(serialDescriptor, 4, p153r8.p0.f26988a, str6);
                    i3 |= 16;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 5:
                    str7 = (String) aVarC.u(serialDescriptor, 5, p153r8.p0.f26988a, str7);
                    i3 |= 32;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 6:
                    str8 = (String) aVarC.u(serialDescriptor, 6, p153r8.p0.f26988a, str8);
                    i3 |= 64;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 7:
                    d6 = (Double) aVarC.u(serialDescriptor, 7, C2709u.f27003a, d6);
                    i3 |= 128;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 8:
                    str = (String) aVarC.u(serialDescriptor, 8, p153r8.p0.f26988a, str);
                    i3 |= 256;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 9:
                    str3 = (String) aVarC.u(serialDescriptor, 9, p153r8.p0.f26988a, str3);
                    i3 |= 512;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 10:
                    d4 = (Double) aVarC.u(serialDescriptor, 10, C2709u.f27003a, d4);
                    i3 |= 1024;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 11:
                    num2 = (Integer) aVarC.u(serialDescriptor, 11, p153r8.K.f26915a, num2);
                    i3 |= 2048;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 12:
                    str2 = (String) aVarC.u(serialDescriptor, 12, p153r8.p0.f26988a, str2);
                    i3 |= 4096;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 13:
                    list = (List) aVarC.u(serialDescriptor, 13, kSerializerArr[13], list);
                    i3 |= 8192;
                    str4 = str10;
                    str5 = str5;
                    break;
                case 14:
                    num = (Integer) aVarC.u(serialDescriptor, 14, p153r8.K.f26915a, num);
                    i3 |= 16384;
                    str4 = str10;
                    str5 = str5;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        Double d9 = d4;
        int i9 = i3;
        String str11 = str9;
        aVarC.a(serialDescriptor);
        return new TMDBPersonCreditEntry(i9, iK, str11, str4, str5, str6, str7, str8, d6, str, str3, d9, num2, str2, list, num);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, TMDBPersonCreditEntry value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f20222a, serialDescriptor);
        boolean zE = bVarC.E(serialDescriptor);
        String str = value.f20223b;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 1, p153r8.p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        String str2 = value.f20224c;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 2, p153r8.p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        String str3 = value.f20225d;
        if (zE3 || str3 != null) {
            bVarC.t(serialDescriptor, 3, p153r8.p0.f26988a, str3);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        String str4 = value.f20226e;
        if (zE4 || str4 != null) {
            bVarC.t(serialDescriptor, 4, p153r8.p0.f26988a, str4);
        }
        boolean zE5 = bVarC.E(serialDescriptor);
        String str5 = value.f20227f;
        if (zE5 || str5 != null) {
            bVarC.t(serialDescriptor, 5, p153r8.p0.f26988a, str5);
        }
        boolean zE6 = bVarC.E(serialDescriptor);
        String str6 = value.g;
        if (zE6 || str6 != null) {
            bVarC.t(serialDescriptor, 6, p153r8.p0.f26988a, str6);
        }
        boolean zE7 = bVarC.E(serialDescriptor);
        Double d4 = value.f20228h;
        if (zE7 || d4 != null) {
            bVarC.t(serialDescriptor, 7, C2709u.f27003a, d4);
        }
        boolean zE8 = bVarC.E(serialDescriptor);
        String str7 = value.f20229i;
        if (zE8 || str7 != null) {
            bVarC.t(serialDescriptor, 8, p153r8.p0.f26988a, str7);
        }
        boolean zE9 = bVarC.E(serialDescriptor);
        String str8 = value.j;
        if (zE9 || str8 != null) {
            bVarC.t(serialDescriptor, 9, p153r8.p0.f26988a, str8);
        }
        boolean zE10 = bVarC.E(serialDescriptor);
        Double d6 = value.f20230k;
        if (zE10 || d6 != null) {
            bVarC.t(serialDescriptor, 10, C2709u.f27003a, d6);
        }
        boolean zE11 = bVarC.E(serialDescriptor);
        Integer num = value.f20231l;
        if (zE11 || num != null) {
            bVarC.t(serialDescriptor, 11, p153r8.K.f26915a, num);
        }
        boolean zE12 = bVarC.E(serialDescriptor);
        String str9 = value.f20232m;
        if (zE12 || str9 != null) {
            bVarC.t(serialDescriptor, 12, p153r8.p0.f26988a, str9);
        }
        boolean zE13 = bVarC.E(serialDescriptor);
        List list = value.f20233n;
        if (zE13 || list != null) {
            bVarC.t(serialDescriptor, 13, TMDBPersonCreditEntry.f20221p[13], list);
        }
        boolean zE14 = bVarC.E(serialDescriptor);
        Integer num2 = value.f20234o;
        if (zE14 || num2 != null) {
            bVarC.t(serialDescriptor, 14, p153r8.K.f26915a, num2);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
