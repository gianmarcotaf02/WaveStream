package J;

public final class L {

    public static final L f5651h;

    public static final L f5652i;
    public static final L j;

    public static final L[] f5653k;

    static {
        L l2 = new L("Cursor", 0);
        f5651h = l2;
        L l9 = new L("SelectionStart", 1);
        f5652i = l9;
        L l10 = new L("SelectionEnd", 2);
        j = l10;
        L[] lArr = {l2, l9, l10};
        f5653k = lArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(lArr);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f5653k.clone();
    }
}
