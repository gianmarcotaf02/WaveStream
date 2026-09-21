package kotlinx.serialization.encoding;

/* JADX INFO: loaded from: classes4.dex */
public interface Encoder {
    default p143q8.b A(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return c(descriptor);
    }

    void C(long j);

    void F(java.lang.String str);

    v8.e b();

    p143q8.b c(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    void e();

    void f(double d4);

    void g(short s9);

    void i(byte b9);

    void j(boolean z6);

    void o(float f9);

    void p(char c9);

    default void r(kotlinx.serialization.KSerializer serializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        if (serializer.getDescriptor().d()) {
            z(serializer, obj);
        } else if (obj == null) {
            e();
        } else {
            z(serializer, obj);
        }
    }

    void v(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3);

    void x(int i3);

    kotlinx.serialization.encoding.Encoder y(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor);

    default void z(kotlinx.serialization.KSerializer serializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(serializer, "serializer");
        serializer.serialize(this, obj);
    }
}
