package p143q8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p153r8.C2694e0;

public interface b {
    void B(SerialDescriptor serialDescriptor, int i3, double d4);

    void D(SerialDescriptor serialDescriptor, int i3, long j);

    default boolean E(SerialDescriptor descriptor) {
        m.e(descriptor, "descriptor");
        return true;
    }

    void a(SerialDescriptor serialDescriptor);

    void d(C2694e0 c2694e0, int i3, char c9);

    void h(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj);

    void k(SerialDescriptor serialDescriptor, int i3, float f9);

    void l(C2694e0 c2694e0, int i3, byte b9);

    void m(C2694e0 c2694e0, int i3, short s9);

    void n(int i3, int i9, SerialDescriptor serialDescriptor);

    void q(SerialDescriptor serialDescriptor, int i3, boolean z6);

    void s(SerialDescriptor serialDescriptor, int i3, String str);

    void t(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj);

    Encoder u(C2694e0 c2694e0, int i3);
}
