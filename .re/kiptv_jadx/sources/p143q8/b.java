package p143q8;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    void B(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, double d4);

    void D(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, long j);

    default boolean E(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return true;
    }

    void a(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    void d(p153r8.C2694e0 c2694e0, int i3, char c9);

    void h(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, kotlinx.serialization.KSerializer kSerializer, java.lang.Object obj);

    void k(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, float f9);

    void l(p153r8.C2694e0 c2694e0, int i3, byte b9);

    void m(p153r8.C2694e0 c2694e0, int i3, short s9);

    void n(int i3, int i9, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    void q(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, boolean z6);

    void s(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, java.lang.String str);

    void t(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3, kotlinx.serialization.KSerializer kSerializer, java.lang.Object obj);

    kotlinx.serialization.encoding.Encoder u(p153r8.C2694e0 c2694e0, int i3);
}
