package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class H implements D {

    public final KSerializer f26911a;

    public H(KSerializer kSerializer) {
        this.f26911a = kSerializer;
    }

    @Override
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f26911a};
    }

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        throw new IllegalStateException("unsupported");
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        m.e(encoder, "encoder");
        throw new IllegalStateException("unsupported");
    }
}
