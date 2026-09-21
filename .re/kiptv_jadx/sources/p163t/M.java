package p163t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p163t.M f27494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p163t.M[] f27495i;

    static {
        p163t.M m8 = new p163t.M("Default", 0);
        f27494h = m8;
        p163t.M[] mArr = {m8, new p163t.M("UserInput", 1), new p163t.M("PreventUserInput", 2)};
        f27495i = mArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mArr);
    }

    public static p163t.M valueOf(java.lang.String str) {
        return (p163t.M) java.lang.Enum.valueOf(p163t.M.class, str);
    }

    public static p163t.M[] values() {
        return (p163t.M[]) f27495i.clone();
    }
}
