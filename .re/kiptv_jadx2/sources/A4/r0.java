package A4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1930z;

public enum r0 implements InterfaceC1930z {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    public final int f245h;

    r0(int i3) {
        this.f245h = i3;
    }

    public static r0 a(int i3) {
        if (i3 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i3 == 1) {
            return TINK;
        }
        if (i3 == 2) {
            return LEGACY;
        }
        if (i3 == 3) {
            return RAW;
        }
        if (i3 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f245h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
