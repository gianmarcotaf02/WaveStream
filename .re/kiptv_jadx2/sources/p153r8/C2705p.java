package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p135p8.e;

public final class C2705p implements KSerializer {

    public static final C2705p f26986a = new C2705p();

    public static final g0 f26987b = new g0("kotlin.Char", e.f26265h);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return Character.valueOf(decoder.f());
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f26987b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        m.e(encoder, "encoder");
        encoder.p(cCharValue);
    }
}
