package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1518z extends java.io.IOException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16269h;

    public static androidx.datastore.preferences.protobuf.C1518z a() {
        return new androidx.datastore.preferences.protobuf.C1518z("Protocol message had invalid UTF-8.");
    }

    public static androidx.datastore.preferences.protobuf.C1517y b() {
        return new androidx.datastore.preferences.protobuf.C1517y("Protocol message tag had invalid wire type.");
    }

    public static androidx.datastore.preferences.protobuf.C1518z c() {
        return new androidx.datastore.preferences.protobuf.C1518z("CodedInputStream encountered a malformed varint.");
    }

    public static androidx.datastore.preferences.protobuf.C1518z d() {
        return new androidx.datastore.preferences.protobuf.C1518z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static androidx.datastore.preferences.protobuf.C1518z e() {
        return new androidx.datastore.preferences.protobuf.C1518z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
