package H5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0399q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H5.EnumC0399q f4288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H5.EnumC0399q f4289i;
    public static final /* synthetic */ H5.EnumC0399q[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f4290k;

    static {
        H5.EnumC0399q enumC0399q = new H5.EnumC0399q("MOVIES", 0);
        f4288h = enumC0399q;
        H5.EnumC0399q enumC0399q2 = new H5.EnumC0399q("SERIES", 1);
        f4289i = enumC0399q2;
        H5.EnumC0399q[] enumC0399qArr = {enumC0399q, enumC0399q2};
        j = enumC0399qArr;
        f4290k = com.google.crypto.tink.shaded.protobuf.q0.t(enumC0399qArr);
    }

    public static H5.EnumC0399q valueOf(java.lang.String str) {
        return (H5.EnumC0399q) java.lang.Enum.valueOf(H5.EnumC0399q.class, str);
    }

    public static H5.EnumC0399q[] values() {
        return (H5.EnumC0399q[]) j.clone();
    }
}
