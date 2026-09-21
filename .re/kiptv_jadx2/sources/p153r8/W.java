package p153r8;

import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p135p8.j;

public final class W implements SerialDescriptor {

    public static final W f26933a = new W();

    @Override
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override
    public final V0 c() {
        return j.f26285i;
    }

    @Override
    public final int e(String name) {
        m.e(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final String g(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    public final List h(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (j.f26285i.hashCode() * 31) - 1818355776;
    }

    @Override
    public final SerialDescriptor i(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    public final boolean j(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
