package p087j8;

import com.google.crypto.tink.shaded.protobuf.q0;
import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p036d8.a;
import p036d8.h;
import p036d8.i;
import p045e8.M;
import p045e8.N;
import p070h6.p;
import p135p8.e;
import p153r8.g0;

public final class c implements KSerializer {

    public static final c f24337a = new c();

    public static final g0 f24338b = q0.d("kotlinx.datetime.LocalTime", e.f26270n);

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        h hVar = i.Companion;
        String input = decoder.m();
        p pVar = N.f21514a;
        M format = (M) pVar.getValue();
        hVar.getClass();
        m.e(input, "input");
        m.e(format, "format");
        if (format != ((M) pVar.getValue())) {
            return (i) format.c(input);
        }
        try {
            return new i(LocalTime.parse(input));
        } catch (DateTimeParseException e6) {
            throw new a(e6);
        }
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f24338b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        i value = (i) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        encoder.F(value.toString());
    }
}
