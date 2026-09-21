package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class C2696g implements KSerializer {

    public static final C2696g f26961a = new C2696g();

    public static final g0 f26962b = new g0("kotlin.Boolean", e.f26264f);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Boolean.valueOf(decoder.e());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26962b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m.e(encoder, "encoder");
        encoder.j(zBooleanValue);
    }
}
