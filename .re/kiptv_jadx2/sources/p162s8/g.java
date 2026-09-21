package p162s8;

import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.U;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;

public final class g implements KSerializer {

    public static final g f27395a = new g();

    public static final f f27396b = f.f27392b;

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        U.e0(decoder);
        return new a((List) V0.a(m.f27417a).deserialize(decoder));
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27396b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        a value = (a) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        U.d0(encoder);
        V0.a(m.f27417a).serialize(encoder, value);
    }
}
