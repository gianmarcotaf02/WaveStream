package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.t;

public final class w0 implements KSerializer {

    public static final w0 f27015a = new w0();

    public static final G f27016b = AbstractC2686a0.a("kotlin.UInt", K.f26915a);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return new t(decoder.v(f27016b).j());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27016b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        int i3 = ((t) obj).f22551h;
        m.e(encoder, "encoder");
        encoder.y(f27016b).x(i3);
    }
}
