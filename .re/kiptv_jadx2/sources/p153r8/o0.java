package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class o0 implements KSerializer {

    public static final o0 f26984a = new o0();

    public static final g0 f26985b = new g0("kotlin.Short", e.f26269m);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Short.valueOf(decoder.A());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26985b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        m.e(encoder, "encoder");
        encoder.g(sShortValue);
    }
}
