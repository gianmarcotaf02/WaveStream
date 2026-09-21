package p153r8;

import kotlinx.serialization.descriptors.SerialDescriptor;

public final class C2689c extends M {

    public final int f26944b;

    public C2689c(SerialDescriptor serialDescriptor, int i3) {
        super(serialDescriptor);
        this.f26944b = i3;
    }

    @Override
    public final String a() {
        switch (this.f26944b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
