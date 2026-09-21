package kotlinx.serialization.encoding;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p143q8.b;
import v8.e;

public interface Encoder {
    default b A(SerialDescriptor descriptor) {
        m.e(descriptor, "descriptor");
        return c(descriptor);
    }

    void C(long j);

    void F(String str);

    e b();

    b c(SerialDescriptor serialDescriptor);

    void e();

    void f(double d4);

    void g(short s9);

    void i(byte b9);

    void j(boolean z6);

    void o(float f9);

    void p(char c9);

    default void r(KSerializer serializer, Object obj) {
        m.e(serializer, "serializer");
        if (serializer.getDescriptor().d()) {
            z(serializer, obj);
        } else if (obj == null) {
            e();
        } else {
            z(serializer, obj);
        }
    }

    void v(SerialDescriptor serialDescriptor, int i3);

    void x(int i3);

    Encoder y(SerialDescriptor serialDescriptor);

    default void z(KSerializer serializer, Object obj) {
        m.e(serializer, "serializer");
        serializer.serialize(this, obj);
    }
}
