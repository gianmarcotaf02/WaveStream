package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class K implements KSerializer {

    public static final K f26915a = new K();

    public static final g0 f26916b = new g0("kotlin.Int", e.f26267k);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Integer.valueOf(decoder.j());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26916b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        m.e(encoder, "encoder");
        encoder.x(iIntValue);
    }
}
