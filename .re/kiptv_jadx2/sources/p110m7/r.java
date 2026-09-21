package p110m7;

import java.io.IOException;

public final class r extends IOException {

    public AbstractC2629b f25503h;

    public r(String str) {
        super(str);
        this.f25503h = null;
    }

    public static r a() {
        return new r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
