package p162s8;

import com.google.common.util.concurrent.U;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import p135p8.g;
import p135p8.i;
import t8.s;

public final class u implements KSerializer {

    public static final u f27424a = new u();

    public static final g f27425b = q0.l("kotlinx.serialization.json.JsonNull", i.f26282f, new SerialDescriptor[0]);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        U.e0(decoder);
        if (decoder.r()) {
            throw new s("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27425b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        U.d0(encoder);
        encoder.e();
    }
}
