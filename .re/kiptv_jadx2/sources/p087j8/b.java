package p087j8;

import com.google.crypto.tink.shaded.protobuf.q0;
import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p036d8.a;
import p036d8.f;
import p036d8.g;
import p045e8.AbstractC2118a;
import p045e8.K;
import p070h6.p;
import p135p8.e;
import p153r8.g0;

public final class b implements KSerializer {

    public static final b f24335a = new b();

    public static final g0 f24336b = q0.d("kotlinx.datetime.LocalDate", e.f26270n);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        p036d8.e eVar = g.Companion;
        String input = decoder.m();
        int i3 = f.f21304a;
        p pVar = K.f21509a;
        AbstractC2118a format = (AbstractC2118a) pVar.getValue();
        eVar.getClass();
        m.e(input, "input");
        m.e(format, "format");
        if (format != ((AbstractC2118a) pVar.getValue())) {
            return (g) format.c(input);
        }
        try {
            return new g(LocalDate.parse(input));
        } catch (DateTimeParseException e6) {
            throw new a(e6);
        }
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f24336b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        g value = (g) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        encoder.F(value.toString());
    }
}
