package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import io.sentry.protocol.SentryRuntime;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;
import p153r8.C2709u;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/TMDBEpisode.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/TMDBEpisode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/TMDBEpisode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/TMDBEpisode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public class TMDBEpisode$$serializer implements p153r8.D {
    public static final TMDBEpisode$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TMDBEpisode$$serializer tMDBEpisode$$serializer = new TMDBEpisode$$serializer();
        INSTANCE = tMDBEpisode$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.model.TMDBEpisode", tMDBEpisode$$serializer, 9);
        c2690c0.k("id", false);
        c2690c0.k("name", true);
        c2690c0.k("overview", true);
        c2690c0.k("episode_number", true);
        c2690c0.k("season_number", true);
        c2690c0.k("still_path", true);
        c2690c0.k(SentryRuntime.TYPE, true);
        c2690c0.k("air_date", true);
        c2690c0.k("vote_average", true);
        descriptor = c2690c0;
    }

    private TMDBEpisode$$serializer() {
    }

    @Override
    public final KSerializer[] childSerializers() {
        p153r8.K k9 = p153r8.K.f26915a;
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new KSerializer[]{k9, V0.s(p0Var), V0.s(p0Var), V0.s(k9), V0.s(k9), V0.s(p0Var), V0.s(k9), V0.s(p0Var), V0.s(C2709u.f27003a)};
    }

    @Override
    public final TMDBEpisode deserialize(Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Double d4 = null;
        int i3 = 0;
        int iK = 0;
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
                    str = (String) aVarC.u(serialDescriptor, 1, p153r8.p0.f26988a, str);
                    i3 |= 2;
                    break;
                case 2:
                    str2 = (String) aVarC.u(serialDescriptor, 2, p153r8.p0.f26988a, str2);
                    i3 |= 4;
                    break;
                case 3:
                    num = (Integer) aVarC.u(serialDescriptor, 3, p153r8.K.f26915a, num);
                    i3 |= 8;
                    break;
                case 4:
                    num2 = (Integer) aVarC.u(serialDescriptor, 4, p153r8.K.f26915a, num2);
                    i3 |= 16;
                    break;
                case 5:
                    str3 = (String) aVarC.u(serialDescriptor, 5, p153r8.p0.f26988a, str3);
                    i3 |= 32;
                    break;
                case 6:
                    num3 = (Integer) aVarC.u(serialDescriptor, 6, p153r8.K.f26915a, num3);
                    i3 |= 64;
                    break;
                case 7:
                    str4 = (String) aVarC.u(serialDescriptor, 7, p153r8.p0.f26988a, str4);
                    i3 |= 128;
                    break;
                case 8:
                    d4 = (Double) aVarC.u(serialDescriptor, 8, C2709u.f27003a, d4);
                    i3 |= 256;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new TMDBEpisode(i3, iK, str, str2, num, num2, str3, num3, str4, d4);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, TMDBEpisode value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f20159a, serialDescriptor);
        boolean zE = bVarC.E(serialDescriptor);
        String str = value.f20160b;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 1, p153r8.p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        String str2 = value.f20161c;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 2, p153r8.p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        Integer num = value.f20162d;
        if (zE3 || num != null) {
            bVarC.t(serialDescriptor, 3, p153r8.K.f26915a, num);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        Integer num2 = value.f20163e;
        if (zE4 || num2 != null) {
            bVarC.t(serialDescriptor, 4, p153r8.K.f26915a, num2);
        }
        boolean zE5 = bVarC.E(serialDescriptor);
        String str3 = value.f20164f;
        if (zE5 || str3 != null) {
            bVarC.t(serialDescriptor, 5, p153r8.p0.f26988a, str3);
        }
        boolean zE6 = bVarC.E(serialDescriptor);
        Integer num3 = value.g;
        if (zE6 || num3 != null) {
            bVarC.t(serialDescriptor, 6, p153r8.K.f26915a, num3);
        }
        boolean zE7 = bVarC.E(serialDescriptor);
        String str4 = value.f20165h;
        if (zE7 || str4 != null) {
            bVarC.t(serialDescriptor, 7, p153r8.p0.f26988a, str4);
        }
        boolean zE8 = bVarC.E(serialDescriptor);
        Double d4 = value.f20166i;
        if (zE8 || d4 != null) {
            bVarC.t(serialDescriptor, 8, C2709u.f27003a, d4);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
