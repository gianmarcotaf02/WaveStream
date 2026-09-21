package H5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H5.M f4111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H5.M f4112i;
    public static final H5.M j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H5.M f4113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final H5.M f4114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final H5.M f4115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ H5.M[] f4116n;

    static {
        H5.M m8 = new H5.M("ALL", 0);
        f4111h = m8;
        H5.M m9 = new H5.M("MOVIES", 1);
        f4112i = m9;
        H5.M m10 = new H5.M("SERIES", 2);
        j = m10;
        H5.M m11 = new H5.M("CHANNELS", 3);
        f4113k = m11;
        H5.M m12 = new H5.M("PEOPLE", 4);
        f4114l = m12;
        H5.M m13 = new H5.M("PROGRAMS", 5);
        f4115m = m13;
        H5.M[] mArr = {m8, m9, m10, m11, m12, m13};
        f4116n = mArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mArr);
    }

    public static H5.M valueOf(java.lang.String str) {
        return (H5.M) java.lang.Enum.valueOf(H5.M.class, str);
    }

    public static H5.M[] values() {
        return (H5.M[]) f4116n.clone();
    }
}
