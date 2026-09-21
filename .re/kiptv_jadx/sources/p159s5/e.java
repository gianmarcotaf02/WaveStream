package p159s5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p159s5.e f27274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p159s5.e f27275i;
    public static final p159s5.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p159s5.e[] f27276k;

    static {
        p159s5.e eVar = new p159s5.e("MOVIES", 0);
        f27274h = eVar;
        p159s5.e eVar2 = new p159s5.e("SERIES", 1);
        f27275i = eVar2;
        p159s5.e eVar3 = new p159s5.e("LIVE", 2);
        j = eVar3;
        p159s5.e[] eVarArr = {eVar, eVar2, eVar3};
        f27276k = eVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(eVarArr);
    }

    public static p159s5.e valueOf(java.lang.String str) {
        return (p159s5.e) java.lang.Enum.valueOf(p159s5.e.class, str);
    }

    public static p159s5.e[] values() {
        return (p159s5.e[]) f27276k.clone();
    }
}
