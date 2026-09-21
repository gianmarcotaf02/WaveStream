package M4;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f7131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7132i;

    b(int[] iArr, int i3) {
        this.f7131h = iArr;
        this.f7132i = i3;
    }

    public final int a(M4.c cVar) {
        char c9;
        int i3 = cVar.f7134a;
        if (i3 <= 9) {
            c9 = 0;
        } else {
            c9 = i3 <= 26 ? (char) 1 : (char) 2;
        }
        return this.f7131h[c9];
    }
}
