package X4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final X4.b f10859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final X4.b f10860i;
    public static final /* synthetic */ X4.b[] j;

    static {
        X4.b bVar = new X4.b("MOVIE", 0);
        f10859h = bVar;
        X4.b bVar2 = new X4.b("TV", 1);
        f10860i = bVar2;
        X4.b[] bVarArr = {bVar, bVar2};
        j = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static X4.b valueOf(java.lang.String str) {
        return (X4.b) java.lang.Enum.valueOf(X4.b.class, str);
    }

    public static X4.b[] values() {
        return (X4.b[]) j.clone();
    }
}
