package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.y;

public final class C0 implements KSerializer {

    public static final C0 f26897a = new C0();

    public static final G f26898b = AbstractC2686a0.a("kotlin.UShort", o0.f26984a);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return new y(decoder.v(f26898b).A());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26898b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        short s9 = ((y) obj).f22556h;
        m.e(encoder, "encoder");
        encoder.y(f26898b).g(s9);
    }
}
