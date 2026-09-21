package p162s8;

import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.U;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;
import p153r8.p0;

public final class x implements KSerializer {

    public static final x f27430a = new x();

    public static final w f27431b = w.f27427b;

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        U.e0(decoder);
        return new c((Map) V0.b(p0.f26988a, m.f27417a).deserialize(decoder));
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27431b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        c value = (c) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        U.d0(encoder);
        V0.b(p0.f26988a, m.f27417a).serialize(encoder, value);
    }
}
