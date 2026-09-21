package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p119n8.j;

public final class X implements KSerializer {

    public static final X f26934a = new X();

    public static final W f26935b = W.f26933a;

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        throw new j("'kotlin.Nothing' does not have instances");
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26935b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        Void value = (Void) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new j("'kotlin.Nothing' cannot be serialized");
    }
}
