package com.kiptv.core.local.cache;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p078i6.w;
import p153r8.AbstractC2686a0;
import p153r8.C2690c0;
import p153r8.D;
import p153r8.K;
import p153r8.p0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore.Summary.$serializer", "Lr8/D;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public class MovieCollectionStore$Summary$$serializer implements D {
    public static final MovieCollectionStore$Summary$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MovieCollectionStore$Summary$$serializer movieCollectionStore$Summary$$serializer = new MovieCollectionStore$Summary$$serializer();
        INSTANCE = movieCollectionStore$Summary$$serializer;
        C2690c0 c2690c0 = new C2690c0("com.kiptv.core.local.cache.MovieCollectionStore.Summary", movieCollectionStore$Summary$$serializer, 6);
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

    @Override
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = MovieCollectionStore$Summary.g;
        p0 p0Var = p0.f26988a;
        return new KSerializer[]{K.f26915a, p0Var, V0.s(p0Var), V0.s(p0Var), V0.s(p0Var), kSerializerArr[5]};
    }

    @Override
    public final MovieCollectionStore$Summary deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = MovieCollectionStore$Summary.g;
        int i3 = 0;
        int iK = 0;
        String strQ = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
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
                    str = (String) aVarC.u(serialDescriptor, 2, p0.f26988a, str);
                    i3 |= 4;
                    break;
                case 3:
                    str2 = (String) aVarC.u(serialDescriptor, 3, p0.f26988a, str2);
                    i3 |= 8;
                    break;
                case 4:
                    str3 = (String) aVarC.u(serialDescriptor, 4, p0.f26988a, str3);
                    i3 |= 16;
                    break;
                case 5:
                    list = (List) aVarC.x(serialDescriptor, 5, kSerializerArr[5], list);
                    i3 |= 32;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        aVarC.a(serialDescriptor);
        return new MovieCollectionStore$Summary(i3, iK, strQ, str, str2, str3, list);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(Encoder encoder, MovieCollectionStore$Summary value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        bVarC.n(0, value.f19611a, serialDescriptor);
        bVarC.s(serialDescriptor, 1, value.f19612b);
        boolean zE = bVarC.E(serialDescriptor);
        String str = value.f19613c;
        if (zE || str != null) {
            bVarC.t(serialDescriptor, 2, p0.f26988a, str);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        String str2 = value.f19614d;
        if (zE2 || str2 != null) {
            bVarC.t(serialDescriptor, 3, p0.f26988a, str2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        String str3 = value.f19615e;
        if (zE3 || str3 != null) {
            bVarC.t(serialDescriptor, 4, p0.f26988a, str3);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        List list = value.f19616f;
        if (zE4 || !m.a(list, w.f23205h)) {
            bVarC.h(serialDescriptor, 5, MovieCollectionStore$Summary.g[5], list);
        }
        bVarC.a(serialDescriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2686a0.f26940b;
    }
}
