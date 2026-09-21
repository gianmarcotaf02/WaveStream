package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.r;

public final class t0 implements KSerializer {

    public static final t0 f27001a = new t0();

    public static final G f27002b = AbstractC2686a0.a("kotlin.UByte", C2699j.f26971a);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return new r(decoder.v(f27002b).z());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f27002b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        byte b9 = ((r) obj).f22549h;
        m.e(encoder, "encoder");
        encoder.y(f27002b).i(b9);
    }
}
