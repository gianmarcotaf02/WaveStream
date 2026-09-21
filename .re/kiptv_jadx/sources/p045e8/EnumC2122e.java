package p045e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2122e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p045e8.EnumC2122e f21535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p045e8.EnumC2122e[] f21536i;

    /* JADX INFO: Fake field, exist only in values array */
    p045e8.EnumC2122e EF0;

    static {
        p045e8.EnumC2122e enumC2122e = new p045e8.EnumC2122e("AM", 0);
        p045e8.EnumC2122e enumC2122e2 = new p045e8.EnumC2122e("PM", 1);
        f21535h = enumC2122e2;
        p045e8.EnumC2122e[] enumC2122eArr = {enumC2122e, enumC2122e2};
        f21536i = enumC2122eArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2122eArr);
    }

    public static p045e8.EnumC2122e valueOf(java.lang.String str) {
        return (p045e8.EnumC2122e) java.lang.Enum.valueOf(p045e8.EnumC2122e.class, str);
    }

    public static p045e8.EnumC2122e[] values() {
        return (p045e8.EnumC2122e[]) f21536i.clone();
    }
}
