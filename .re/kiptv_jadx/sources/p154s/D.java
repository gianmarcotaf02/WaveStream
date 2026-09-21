package p154s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p154s.D f27046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p154s.D f27047i;
    public static final p154s.D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p154s.D[] f27048k;

    static {
        p154s.D d4 = new p154s.D("PreEnter", 0);
        f27046h = d4;
        p154s.D d6 = new p154s.D("Visible", 1);
        f27047i = d6;
        p154s.D d9 = new p154s.D("PostExit", 2);
        j = d9;
        p154s.D[] dArr = {d4, d6, d9};
        f27048k = dArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(dArr);
    }

    public static p154s.D valueOf(java.lang.String str) {
        return (p154s.D) java.lang.Enum.valueOf(p154s.D.class, str);
    }

    public static p154s.D[] values() {
        return (p154s.D[]) f27048k.clone();
    }
}
