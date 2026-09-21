package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Y implements KSerializer {

    public final KSerializer f26936a;

    public final j0 f26937b;

    public Y(KSerializer serializer) {
        m.e(serializer, "serializer");
        this.f26936a = serializer;
        this.f26937b = new j0(serializer.getDescriptor());
    }

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        if (decoder.r()) {
            return decoder.p(this.f26936a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Y.class == obj.getClass() && m.a(this.f26936a, ((Y) obj).f26936a);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return this.f26937b;
    }

    public final int hashCode() {
        return this.f26936a.hashCode();
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        m.e(encoder, "encoder");
        if (obj != null) {
            encoder.z(this.f26936a, obj);
        } else {
            encoder.e();
        }
    }
}
