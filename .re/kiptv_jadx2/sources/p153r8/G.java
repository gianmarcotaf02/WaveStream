package p153r8;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class G extends C2690c0 {

    public final boolean f26910l;

    public G(String str, D d4) {
        super(str, d4, 1);
        this.f26910l = true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f26945a.equals(serialDescriptor.a())) {
                G g = (G) obj;
                if (g.f26910l && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) g.j.getValue())) {
                    int iF = serialDescriptor.f();
                    int i3 = this.f26947c;
                    if (i3 == iF) {
                        for (int i9 = 0; i9 < i3; i9++) {
                            if (m.a(i(i9).a(), serialDescriptor.i(i9).a()) && m.a(i(i9).c(), serialDescriptor.i(i9).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override
    public final boolean isInline() {
        return this.f26910l;
    }
}
