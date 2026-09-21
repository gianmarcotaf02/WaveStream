package p193x5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3111d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p193x5.EnumC3111d f31436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p193x5.EnumC3111d f31437i;
    public static final p193x5.EnumC3111d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p193x5.EnumC3111d f31438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p193x5.EnumC3111d f31439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p193x5.EnumC3111d[] f31440m;

    static {
        p193x5.EnumC3111d enumC3111d = new p193x5.EnumC3111d("NONE", 0);
        f31436h = enumC3111d;
        p193x5.EnumC3111d enumC3111d2 = new p193x5.EnumC3111d("SEE_ALL", 1);
        f31437i = enumC3111d2;
        p193x5.EnumC3111d enumC3111d3 = new p193x5.EnumC3111d("PAST_FIRST", 2);
        j = enumC3111d3;
        p193x5.EnumC3111d enumC3111d4 = new p193x5.EnumC3111d("CURRENT", 3);
        f31438k = enumC3111d4;
        p193x5.EnumC3111d enumC3111d5 = new p193x5.EnumC3111d("UPCOMING_FIRST", 4);
        f31439l = enumC3111d5;
        p193x5.EnumC3111d[] enumC3111dArr = {enumC3111d, enumC3111d2, enumC3111d3, enumC3111d4, enumC3111d5};
        f31440m = enumC3111dArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC3111dArr);
    }

    public static p193x5.EnumC3111d valueOf(java.lang.String str) {
        return (p193x5.EnumC3111d) java.lang.Enum.valueOf(p193x5.EnumC3111d.class, str);
    }

    public static p193x5.EnumC3111d[] values() {
        return (p193x5.EnumC3111d[]) f31440m.clone();
    }
}
