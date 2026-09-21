package p087j8;

import com.google.crypto.tink.shaded.protobuf.q0;
import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p036d8.j;
import p036d8.k;
import p036d8.n;
import p045e8.m0;
import p045e8.n0;
import p070h6.p;
import p135p8.e;
import p153r8.g0;

public final class d implements KSerializer {

    public static final d f24339a = new d();

    public static final g0 f24340b = q0.d("kotlinx.datetime.UtcOffset", e.f26270n);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        j jVar = k.Companion;
        String input = decoder.m();
        p pVar = n0.f21582a;
        m0 format = (m0) pVar.getValue();
        jVar.getClass();
        m.e(input, "input");
        m.e(format, "format");
        if (format == ((m0) pVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) n.f21311a.getValue();
            m.d(dateTimeFormatter, "access$getIsoFormat(...)");
            return n.a(input, dateTimeFormatter);
        }
        if (format == ((m0) n0.f21583b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) n.f21312b.getValue();
            m.d(dateTimeFormatter2, "access$getIsoBasicFormat(...)");
            return n.a(input, dateTimeFormatter2);
        }
        if (format != ((m0) n0.f21584c.getValue())) {
            return (k) format.c(input);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) n.f21313c.getValue();
        m.d(dateTimeFormatter3, "access$getFourDigitsFormat(...)");
        return n.a(input, dateTimeFormatter3);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f24340b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        k value = (k) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        encoder.F(value.toString());
    }
}
