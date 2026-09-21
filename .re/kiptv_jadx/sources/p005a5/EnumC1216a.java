package p005a5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1216a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p005a5.EnumC1216a[] f14188h;

    /* JADX INFO: Fake field, exist only in values array */
    p005a5.EnumC1216a EF5;

    static {
        p005a5.EnumC1216a[] enumC1216aArr = {new p005a5.EnumC1216a("InvalidToken", 0), new p005a5.EnumC1216a("UserNotFound", 1), new p005a5.EnumC1216a("NetworkError", 2), new p005a5.EnumC1216a("UserAlreadyRegistered", 3)};
        f14188h = enumC1216aArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1216aArr);
    }

    public static p005a5.EnumC1216a valueOf(java.lang.String str) {
        return (p005a5.EnumC1216a) java.lang.Enum.valueOf(p005a5.EnumC1216a.class, str);
    }

    public static p005a5.EnumC1216a[] values() {
        return (p005a5.EnumC1216a[]) f14188h.clone();
    }
}
