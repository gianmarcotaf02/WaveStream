package p142q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p142q7.m[] f26662h;

    /* JADX INFO: Fake field, exist only in values array */
    p142q7.m EF5;

    static {
        p142q7.m[] mVarArr = {new p142q7.m("COMMON_SUPER_TYPE", 0), new p142q7.m("INTERSECTION_TYPE", 1)};
        f26662h = mVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mVarArr);
    }

    public static p142q7.m valueOf(java.lang.String str) {
        return (p142q7.m) java.lang.Enum.valueOf(p142q7.m.class, str);
    }

    public static p142q7.m[] values() {
        return (p142q7.m[]) f26662h.clone();
    }
}
