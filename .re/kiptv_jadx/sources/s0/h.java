package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s0.h f27222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0.h f27223i;
    public static final /* synthetic */ s0.h[] j;

    static {
        s0.h hVar = new s0.h("VIEW_APPEAR", 0);
        f27222h = hVar;
        s0.h hVar2 = new s0.h("VIEW_DISAPPEAR", 1);
        f27223i = hVar2;
        s0.h[] hVarArr = {hVar, hVar2};
        j = hVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(hVarArr);
    }

    public static s0.h valueOf(java.lang.String str) {
        return (s0.h) java.lang.Enum.valueOf(s0.h.class, str);
    }

    public static s0.h[] values() {
        return (s0.h[]) j.clone();
    }
}
