package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.A;

public final class D0 implements KSerializer {

    public static final D0 f26899b = new D0();

    public final C2714z f26900a = new C2714z("kotlin.Unit", A.f22523a);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        this.f26900a.deserialize(decoder);
        return A.f22523a;
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return this.f26900a.getDescriptor();
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        A value = (A) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        this.f26900a.serialize(encoder, value);
    }
}
