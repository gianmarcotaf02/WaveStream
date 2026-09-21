package p143q8;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import p153r8.C2694e0;
import v8.e;

public interface a {
    char C(C2694e0 c2694e0, int i3);

    float D(SerialDescriptor serialDescriptor, int i3);

    void a(SerialDescriptor serialDescriptor);

    e b();

    Decoder d(C2694e0 c2694e0, int i3);

    long h(SerialDescriptor serialDescriptor, int i3);

    int k(SerialDescriptor serialDescriptor, int i3);

    byte l(C2694e0 c2694e0, int i3);

    boolean o(SerialDescriptor serialDescriptor, int i3);

    String q(SerialDescriptor serialDescriptor, int i3);

    int s(SerialDescriptor serialDescriptor);

    Object u(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj);

    double w(SerialDescriptor serialDescriptor, int i3);

    Object x(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj);

    short y(C2694e0 c2694e0, int i3);
}
