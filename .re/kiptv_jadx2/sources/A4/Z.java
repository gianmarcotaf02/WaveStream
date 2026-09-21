package A4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1930z;

public enum Z implements InterfaceC1930z {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    public final int f238h;

    Z(int i3) {
        this.f238h = i3;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f238h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
