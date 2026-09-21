package t8;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p153r8.C0;
import p153r8.t0;
import p153r8.w0;
import p153r8.z0;

public abstract class K {

    public static final Set f28592a = p078i6.m.F0(new SerialDescriptor[]{w0.f27016b, z0.f27030b, t0.f27002b, C0.f26898b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f28592a.contains(serialDescriptor);
    }
}
