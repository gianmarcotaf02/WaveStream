package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBCastMember.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBCastMember;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBCastMember;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBCastMember;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public class TMDBCastMember$$serializer implements p153r8.D {
    public static final TMDBCastMember$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TMDBCastMember$$serializer tMDBCastMember$$serializer = new TMDBCastMember$$serializer();
        INSTANCE = tMDBCastMember$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.model.TMDBCastMember", tMDBCastMember$$serializer, 5);
        c2690c0.k("id", false);
        c2690c0.k("name", false);
        c2690c0.k("character", true);
        c2690c0.k("profile_path", true);
        c2690c0.k("order", true);
        descriptor = c2690c0;
    }

    private TMDBCastMember$$serializer() {
    }

    @Override
    public final KSerializer[] childSerializers() {
        p153r8.K k9 = p153r8.K.f26915a;
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new KSerializer[]{k9, p0Var, V0.s(p0Var), V0.s(p0Var), V0.s(k9)};
    }

    @Override
    public final TMDBCastMember deserialize(Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        int iK = 0;
        Integer num = null;
        String strQ = null;
        String str = null;
        String str2 = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                iK = aVarC.k(serialDescriptor, 0);
                i3 |= 1;
            } else if (iS == 1) {
                strQ = aVarC.q(serialDescriptor, 1);
                i3 |= 2;
            } else if (iS == 2) {
                str = (String) aVarC.u(serialDescriptor, 2, p153r8.p0.f26988a, str);
                i3 |= 4;
            } else if (iS == 3) {
                str2 = (String) aVarC.u(serialDescriptor, 3, p153r8.p0.f26988a, str2);
                i3 |= 8;
            } else {
                if (iS != 4) {
                    throw new p119n8.m(iS);
                }
                num = (Integer) aVarC.u(serialDescriptor, 4, p153r8.K.f26915a, num);
                i3 |= 16;
            }
        }
        aVarC.a(serialDescriptor);
        return new TMDBCastMember(i3, iK, num, strQ, str, str2);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, TMDBCastMember value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f20122a, serialDescriptor);
        bVarC.s(serialDescriptor, 1, value.f20123b);
        boolean zE = bVarC.E(serialDescriptor);
        String str = value.f20124c;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 2, p153r8.p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        String str2 = value.f20125d;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 3, p153r8.p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        Integer num = value.f20126e;
        if (zE3 || num != null) {
            bVarC.t(serialDescriptor, 4, p153r8.K.f26915a, num);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
