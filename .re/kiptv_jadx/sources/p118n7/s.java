package p118n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p118n7.r f25935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p118n7.q f25936i;
    public static final /* synthetic */ p118n7.s[] j;

    static {
        p118n7.r rVar = new p118n7.r();
        f25935h = rVar;
        p118n7.q qVar = new p118n7.q();
        f25936i = qVar;
        p118n7.s[] sVarArr = {rVar, qVar};
        j = sVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(sVarArr);
    }

    public static p118n7.s valueOf(java.lang.String str) {
        return (p118n7.s) java.lang.Enum.valueOf(p118n7.s.class, str);
    }

    public static p118n7.s[] values() {
        return (p118n7.s[]) j.clone();
    }

    public abstract java.lang.String a(java.lang.String str);
}
