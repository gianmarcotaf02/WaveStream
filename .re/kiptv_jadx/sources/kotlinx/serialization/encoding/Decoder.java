package kotlinx.serialization.encoding;

/* JADX INFO: loaded from: classes4.dex */
public interface Decoder {
    short A();

    float B();

    double E();

    p143q8.a c(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    boolean e();

    char f();

    int g(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    int j();

    java.lang.String m();

    long n();

    default java.lang.Object p(kotlinx.serialization.KSerializer deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    boolean r();

    kotlinx.serialization.encoding.Decoder v(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    byte z();
}
