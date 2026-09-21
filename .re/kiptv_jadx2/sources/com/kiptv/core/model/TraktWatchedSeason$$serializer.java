package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TraktWatchedSeason.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TraktWatchedSeason;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TraktWatchedSeason;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TraktWatchedSeason;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public class TraktWatchedSeason$$serializer implements p153r8.D {
    public static final TraktWatchedSeason$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TraktWatchedSeason$$serializer traktWatchedSeason$$serializer = new TraktWatchedSeason$$serializer();
        INSTANCE = traktWatchedSeason$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.model.TraktWatchedSeason", traktWatchedSeason$$serializer, 2);
        c2690c0.k("number", false);
        c2690c0.k("episodes", true);
        descriptor = c2690c0;
    }

    private TraktWatchedSeason$$serializer() {
    }

    @Override
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p153r8.K.f26915a, V0.s(TraktWatchedSeason.f20548c[1])};
    }

    @Override
    public final TraktWatchedSeason deserialize(Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = TraktWatchedSeason.f20548c;
        List list = null;
        boolean z6 = true;
        int i3 = 0;
        int iK = 0;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                iK = aVarC.k(serialDescriptor, 0);
                i3 |= 1;
            } else {
                if (iS != 1) {
                    throw new p119n8.m(iS);
                }
                list = (List) aVarC.u(serialDescriptor, 1, kSerializerArr[1], list);
                i3 |= 2;
            }
        }
        aVarC.a(serialDescriptor);
        return new TraktWatchedSeason(i3, iK, list);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, TraktWatchedSeason value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f20549a, serialDescriptor);
        boolean zE = bVarC.E(serialDescriptor);
        List list = value.f20550b;
        if (zE || list != null) {
            bVarC.t(serialDescriptor, 1, TraktWatchedSeason.f20548c[1], list);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
