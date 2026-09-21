package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class C2699j implements KSerializer {

    public static final C2699j f26971a = new C2699j();

    public static final g0 f26972b = new g0("kotlin.Byte", e.g);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Byte.valueOf(decoder.z());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26972b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        m.e(encoder, "encoder");
        encoder.i(bByteValue);
    }
}
