package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x.S f30797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x.S f30798i;
    public static final x.S j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x.S[] f30799k;

    static {
        x.S s9 = new x.S("Yes", 0);
        f30797h = s9;
        x.S s10 = new x.S("No", 1);
        f30798i = s10;
        x.S s11 = new x.S("NotInitialized", 2);
        j = s11;
        x.S[] sArr = {s9, s10, s11};
        f30799k = sArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(sArr);
    }

    public static x.S valueOf(java.lang.String str) {
        return (x.S) java.lang.Enum.valueOf(x.S.class, str);
    }

    public static x.S[] values() {
        return (x.S[]) f30799k.clone();
    }
}
