package p118n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p118n7.o f25930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p118n7.o f25931i;
    public static final p118n7.o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p118n7.o[] f25932k;

    static {
        p118n7.o oVar = new p118n7.o("ALL", 0);
        f25930h = oVar;
        p118n7.o oVar2 = new p118n7.o("ONLY_NON_SYNTHESIZED", 1);
        f25931i = oVar2;
        p118n7.o oVar3 = new p118n7.o("NONE", 2);
        j = oVar3;
        p118n7.o[] oVarArr = {oVar, oVar2, oVar3};
        f25932k = oVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(oVarArr);
    }

    public static p118n7.o valueOf(java.lang.String str) {
        return (p118n7.o) java.lang.Enum.valueOf(p118n7.o.class, str);
    }

    public static p118n7.o[] values() {
        return (p118n7.o[]) f25932k.clone();
    }
}
