package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public class D extends IOException {

    public boolean f19468h;

    public static D a() {
        return new D("Protocol message contained an invalid tag (zero).");
    }

    public static D b() {
        return new D("Protocol message had invalid UTF-8.");
    }

    public static C c() {
        return new C("Protocol message tag had invalid wire type.");
    }

    public static D d() {
        return new D("CodedInputStream encountered a malformed varint.");
    }

    public static D e() {
        return new D("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static D f() {
        return new D("Failed to parse the message.");
    }

    public static D g() {
        return new D("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
