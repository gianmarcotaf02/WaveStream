package A4;

/* JADX INFO: loaded from: classes.dex */
public enum O implements com.google.crypto.tink.shaded.protobuf.InterfaceC1930z {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f225h;

    O(int i3) {
        this.f225h = i3;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f225h;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
