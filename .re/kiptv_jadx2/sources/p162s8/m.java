package p162s8;

import com.google.common.util.concurrent.U;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import p135p8.c;
import p135p8.g;
import q5.i;

public final class m implements KSerializer {

    public static final m f27417a = new m();

    public static final g f27418b = q0.k("kotlinx.serialization.json.JsonElement", c.g, new SerialDescriptor[0], new i(12));

    @Override
    public final Object deserialize(Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return U.e0(decoder).i();
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27418b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        b value = (b) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        U.d0(encoder);
        if (value instanceof d) {
            encoder.z(y.f27432a, value);
        } else if (value instanceof kotlinx.serialization.json.c) {
            encoder.z(x.f27430a, value);
        } else {
            if (!(value instanceof a)) {
                throw new I3.b();
            }
            encoder.z(g.f27395a, value);
        }
    }
}
