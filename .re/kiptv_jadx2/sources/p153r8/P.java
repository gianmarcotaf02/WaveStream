package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class P implements KSerializer {

    public static final P f26922a = new P();

    public static final g0 f26923b = new g0("kotlin.Long", e.f26268l);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Long.valueOf(decoder.n());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26923b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        m.e(encoder, "encoder");
        encoder.C(jLongValue);
    }
}
