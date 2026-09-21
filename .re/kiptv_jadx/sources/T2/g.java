package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final T2.g f9736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final T2.g f9737i;
    public static final /* synthetic */ T2.g[] j;

    static {
        T2.g gVar = new T2.g("FILL", 0);
        f9736h = gVar;
        T2.g gVar2 = new T2.g("FIT", 1);
        f9737i = gVar2;
        T2.g[] gVarArr = {gVar, gVar2};
        j = gVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(gVarArr);
    }

    public static T2.g valueOf(java.lang.String str) {
        return (T2.g) java.lang.Enum.valueOf(T2.g.class, str);
    }

    public static T2.g[] values() {
        return (T2.g[]) j.clone();
    }
}
