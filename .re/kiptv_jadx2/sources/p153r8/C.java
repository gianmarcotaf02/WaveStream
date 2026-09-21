package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class C implements KSerializer {

    public static final C f26895a = new C();

    public static final g0 f26896b = new g0("kotlin.Float", e.j);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Float.valueOf(decoder.B());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26896b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        m.e(encoder, "encoder");
        encoder.o(fFloatValue);
    }
}
