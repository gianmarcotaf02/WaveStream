package A4;

import com.google.crypto.tink.shaded.protobuf.InterfaceC1930z;

public enum O implements InterfaceC1930z {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    public final int f225h;

    O(int i3) {
        this.f225h = i3;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f225h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
