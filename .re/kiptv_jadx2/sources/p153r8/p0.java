package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class p0 implements KSerializer {

    public static final p0 f26988a = new p0();

    public static final g0 f26989b = new g0("kotlin.String", e.f26270n);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return decoder.m();
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26989b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        String value = (String) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        encoder.F(value);
    }
}
