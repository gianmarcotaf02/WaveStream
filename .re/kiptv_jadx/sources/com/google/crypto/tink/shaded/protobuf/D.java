package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class D extends java.io.IOException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19468h;

    public static com.google.crypto.tink.shaded.protobuf.D a() {
        return new com.google.crypto.tink.shaded.protobuf.D("Protocol message contained an invalid tag (zero).");
    }

    public static com.google.crypto.tink.shaded.protobuf.D b() {
        return new com.google.crypto.tink.shaded.protobuf.D("Protocol message had invalid UTF-8.");
    }

    public static com.google.crypto.tink.shaded.protobuf.C c() {
        return new com.google.crypto.tink.shaded.protobuf.C("Protocol message tag had invalid wire type.");
    }

    public static com.google.crypto.tink.shaded.protobuf.D d() {
        return new com.google.crypto.tink.shaded.protobuf.D("CodedInputStream encountered a malformed varint.");
    }

    public static com.google.crypto.tink.shaded.protobuf.D e() {
        return new com.google.crypto.tink.shaded.protobuf.D("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static com.google.crypto.tink.shaded.protobuf.D f() {
        return new com.google.crypto.tink.shaded.protobuf.D("Failed to parse the message.");
    }

    public static com.google.crypto.tink.shaded.protobuf.D g() {
        return new com.google.crypto.tink.shaded.protobuf.D("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
