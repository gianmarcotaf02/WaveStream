package p162s8;

import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.U;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import p135p8.e;
import p135p8.g;
import t8.x;

public final class y implements KSerializer {

    public static final y f27432a = new y();

    public static final g f27433b = q0.l("kotlinx.serialization.json.JsonPrimitive", e.f26270n, new SerialDescriptor[0]);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        b bVarI = U.e0(decoder).i();
        if (bVarI instanceof d) {
            return (d) bVarI;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw x.d(M0.p(B.f24540a, bVarI.getClass(), sb), bVarI.toString(), -1);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27433b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        d value = (d) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        U.d0(encoder);
        if (value instanceof JsonNull) {
            encoder.z(u.f27424a, JsonNull.INSTANCE);
        } else {
            encoder.z(s.f27422a, (r) value);
        }
    }
}
