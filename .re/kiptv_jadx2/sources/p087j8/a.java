package p087j8;

import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p036d8.c;
import p036d8.d;
import p045e8.AbstractC2130m;
import p045e8.C2132o;
import p045e8.r;
import p135p8.e;
import p153r8.g0;

public final class a implements KSerializer {

    public static final a f24333a = new a();

    public static final g0 f24334b = q0.d("kotlinx.datetime.Instant", e.f26270n);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        c cVar = d.Companion;
        String input = decoder.m();
        r format = AbstractC2130m.f21579a;
        cVar.getClass();
        m.e(input, "input");
        m.e(format, "format");
        try {
            return ((C2132o) format.c(input)).a();
        } catch (IllegalArgumentException e6) {
            throw new p036d8.a("Failed to parse an instant from '" + ((Object) input) + '\'', e6);
        }
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f24334b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        d value = (d) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        encoder.F(value.toString());
    }
}
