package kotlinx.serialization.encoding;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p143q8.a;

public interface Decoder {
    short A();

    float B();

    double E();

    a c(SerialDescriptor serialDescriptor);

    boolean e();

    char f();

    int g(SerialDescriptor serialDescriptor);

    int j();

    String m();

    long n();

    default Object p(KSerializer deserializer) {
        m.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    boolean r();

    Decoder v(SerialDescriptor serialDescriptor);

    byte z();
}
