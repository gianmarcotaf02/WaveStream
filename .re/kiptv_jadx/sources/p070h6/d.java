package p070h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p070h6.d f22529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p070h6.d[] f22530i;

    static {
        p070h6.d dVar = new p070h6.d("WARNING", 0);
        f22529h = dVar;
        p070h6.d[] dVarArr = {dVar, new p070h6.d("ERROR", 1), new p070h6.d("HIDDEN", 2)};
        f22530i = dVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dVarArr);
    }

    public static p070h6.d valueOf(java.lang.String str) {
        return (p070h6.d) java.lang.Enum.valueOf(p070h6.d.class, str);
    }

    public static p070h6.d[] values() {
        return (p070h6.d[]) f22530i.clone();
    }
}
