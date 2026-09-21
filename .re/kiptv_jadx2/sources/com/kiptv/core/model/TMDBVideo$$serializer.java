package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;
import p153r8.C2696g;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBVideo.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBVideo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBVideo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBVideo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public class TMDBVideo$$serializer implements p153r8.D {
    public static final TMDBVideo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TMDBVideo$$serializer tMDBVideo$$serializer = new TMDBVideo$$serializer();
        INSTANCE = tMDBVideo$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.model.TMDBVideo", tMDBVideo$$serializer, 8);
        c2690c0.k("id", false);
        c2690c0.k(SubscriberAttributeKt.JSON_NAME_KEY, false);
        c2690c0.k("name", false);
        c2690c0.k("site", false);
        c2690c0.k("size", true);
        c2690c0.k("type", true);
        c2690c0.k("official", true);
        c2690c0.k("published_at", true);
        descriptor = c2690c0;
    }

    private TMDBVideo$$serializer() {
    }

    @Override
    public final KSerializer[] childSerializers() {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new KSerializer[]{p0Var, p0Var, p0Var, p0Var, V0.s(p153r8.K.f26915a), V0.s(p0Var), V0.s(C2696g.f26961a), V0.s(p0Var)};
    }

    @Override
    public final TMDBVideo deserialize(Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        String strQ4 = null;
        Integer num = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
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
                    num = (Integer) aVarC.u(serialDescriptor, 4, p153r8.K.f26915a, num);
                    i3 |= 16;
                    break;
                case 5:
                    str = (String) aVarC.u(serialDescriptor, 5, p153r8.p0.f26988a, str);
                    i3 |= 32;
                    break;
                case 6:
                    bool = (Boolean) aVarC.u(serialDescriptor, 6, C2696g.f26961a, bool);
                    i3 |= 64;
                    break;
                case 7:
                    str2 = (String) aVarC.u(serialDescriptor, 7, p153r8.p0.f26988a, str2);
                    i3 |= 128;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new TMDBVideo(i3, strQ, strQ2, strQ3, strQ4, num, str, bool, str2);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, TMDBVideo value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.s(serialDescriptor, 0, value.f20341a);
        bVarC.s(serialDescriptor, 1, value.f20342b);
        bVarC.s(serialDescriptor, 2, value.f20343c);
        bVarC.s(serialDescriptor, 3, value.f20344d);
        boolean zE = bVarC.E(serialDescriptor);
        Integer num = value.f20345e;
        if (zE || num != null) {
            bVarC.t(serialDescriptor, 4, p153r8.K.f26915a, num);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        String str = value.f20346f;
        if (zE2 || str != null) {
            bVarC.t(serialDescriptor, 5, p153r8.p0.f26988a, str);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        Boolean bool = value.g;
        if (zE3 || bool != null) {
            bVarC.t(serialDescriptor, 6, C2696g.f26961a, bool);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        String str2 = value.f20347h;
        if (zE4 || str2 != null) {
            bVarC.t(serialDescriptor, 7, p153r8.p0.f26988a, str2);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
