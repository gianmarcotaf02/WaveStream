package B7;

public final class k {

    public static final k f836h;

    public static final k f837i;
    public static final k j;

    public static final k[] f838k;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        f836h = kVar;
        k kVar2 = new k("COMPUTING", 1);
        f837i = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        j = kVar3;
        f838k = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f838k.clone();
    }
}
