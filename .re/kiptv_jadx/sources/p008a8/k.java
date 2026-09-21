package p008a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p008a8.k f15544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p008a8.k f15545i;
    public static final p008a8.k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p008a8.k f15546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p008a8.k[] f15547l;

    static {
        p008a8.k kVar = new p008a8.k("SUCCESSFUL", 0);
        f15544h = kVar;
        p008a8.k kVar2 = new p008a8.k("REREGISTER", 1);
        f15545i = kVar2;
        p008a8.k kVar3 = new p008a8.k("CANCELLED", 2);
        j = kVar3;
        p008a8.k kVar4 = new p008a8.k("ALREADY_SELECTED", 3);
        f15546k = kVar4;
        p008a8.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f15547l = kVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(kVarArr);
    }

    public static p008a8.k valueOf(java.lang.String str) {
        return (p008a8.k) java.lang.Enum.valueOf(p008a8.k.class, str);
    }

    public static p008a8.k[] values() {
        return (p008a8.k[]) f15547l.clone();
    }
}
