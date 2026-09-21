package p118n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p118n7.p f25933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p118n7.p f25934i;
    public static final /* synthetic */ p118n7.p[] j;

    /* JADX INFO: Fake field, exist only in values array */
    p118n7.p EF0;

    static {
        p118n7.p pVar = new p118n7.p("PRETTY", 0);
        p118n7.p pVar2 = new p118n7.p("DEBUG", 1);
        f25933h = pVar2;
        p118n7.p pVar3 = new p118n7.p("NONE", 2);
        f25934i = pVar3;
        p118n7.p[] pVarArr = {pVar, pVar2, pVar3};
        j = pVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(pVarArr);
    }

    public static p118n7.p valueOf(java.lang.String str) {
        return (p118n7.p) java.lang.Enum.valueOf(p118n7.p.class, str);
    }

    public static p118n7.p[] values() {
        return (p118n7.p[]) j.clone();
    }
}
