package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.v;

public final class z0 implements KSerializer {

    public static final z0 f27029a = new z0();

    public static final G f27030b = AbstractC2686a0.a("kotlin.ULong", P.f26922a);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return new v(decoder.v(f27030b).n());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27030b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((v) obj).f22553h;
        m.e(encoder, "encoder");
        encoder.y(f27030b).C(j);
    }
}
