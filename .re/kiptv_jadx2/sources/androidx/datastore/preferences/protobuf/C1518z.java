package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class C1518z extends IOException {

    public boolean f16269h;

    public static C1518z a() {
        return new C1518z("Protocol message had invalid UTF-8.");
    }

    public static C1517y b() {
        return new C1517y("Protocol message tag had invalid wire type.");
    }

    public static C1518z c() {
        return new C1518z("CodedInputStream encountered a malformed varint.");
    }

    public static C1518z d() {
        return new C1518z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1518z e() {
        return new C1518z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
