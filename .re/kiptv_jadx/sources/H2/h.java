package H2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H2.h f3886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final H2.h f3887i;
    public static final H2.h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H2.h f3888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ H2.h[] f3889l;

    static {
        H2.h hVar = new H2.h("MEMORY_CACHE", 0);
        f3886h = hVar;
        H2.h hVar2 = new H2.h("MEMORY", 1);
        f3887i = hVar2;
        H2.h hVar3 = new H2.h("DISK", 2);
        j = hVar3;
        H2.h hVar4 = new H2.h("NETWORK", 3);
        f3888k = hVar4;
        H2.h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        f3889l = hVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(hVarArr);
    }

    public static H2.h valueOf(java.lang.String str) {
        return (H2.h) java.lang.Enum.valueOf(H2.h.class, str);
    }

    public static H2.h[] values() {
        return (H2.h[]) f3889l.clone();
    }
}
