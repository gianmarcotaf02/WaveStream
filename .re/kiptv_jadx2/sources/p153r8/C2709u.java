package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class C2709u implements KSerializer {

    public static final C2709u f27003a = new C2709u();

    public static final g0 f27004b = new g0("kotlin.Double", e.f26266i);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Double.valueOf(decoder.E());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27004b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        m.e(encoder, "encoder");
        encoder.f(dDoubleValue);
    }
}
