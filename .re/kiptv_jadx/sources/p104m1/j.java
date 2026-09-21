package p104m1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p104m1.j f25173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p104m1.j f25174i;
    public static final /* synthetic */ p104m1.j[] j;

    static {
        p104m1.j jVar = new p104m1.j("Ltr", 0);
        f25173h = jVar;
        p104m1.j jVar2 = new p104m1.j("Rtl", 1);
        f25174i = jVar2;
        p104m1.j[] jVarArr = {jVar, jVar2};
        j = jVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(jVarArr);
    }

    public static p104m1.j valueOf(java.lang.String str) {
        return (p104m1.j) java.lang.Enum.valueOf(p104m1.j.class, str);
    }

    public static p104m1.j[] values() {
        return (p104m1.j[]) j.clone();
    }
}
