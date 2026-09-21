package L0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L0.c f7044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L0.c f7045i;
    public static final /* synthetic */ L0.c[] j;

    static {
        L0.c cVar = new L0.c("Lsq2", 0);
        f7044h = cVar;
        L0.c cVar2 = new L0.c("Impulse", 1);
        f7045i = cVar2;
        L0.c[] cVarArr = {cVar, cVar2};
        j = cVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(cVarArr);
    }

    public static L0.c valueOf(java.lang.String str) {
        return (L0.c) java.lang.Enum.valueOf(L0.c.class, str);
    }

    public static L0.c[] values() {
        return (L0.c[]) j.clone();
    }
}
