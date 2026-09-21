package A4;

/* JADX INFO: loaded from: classes.dex */
public enum r0 implements com.google.crypto.tink.shaded.protobuf.InterfaceC1930z {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f245h;

    r0(int i3) {
        this.f245h = i3;
    }

    public static A4.r0 a(int i3) {
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
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
