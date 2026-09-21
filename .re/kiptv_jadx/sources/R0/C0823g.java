package R0;

/* JADX INFO: renamed from: R0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0823g extends R0.AbstractC0815c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static R0.C0823g f8910c;

    @Override // R0.AbstractC0815c
    public final int[] g(int i3) {
        int length = k().length();
        if (length <= 0 || i3 >= length) {
            return null;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < length && k().charAt(i3) == '\n' && (k().charAt(i3) == '\n' || (i3 != 0 && k().charAt(i3 - 1) != '\n'))) {
            i3++;
        }
        if (i3 >= length) {
            return null;
        }
        int i9 = i3 + 1;
        while (i9 < length && !q(i9)) {
            i9++;
        }
        return j(i3, i9);
    }

    @Override // R0.AbstractC0815c
    public final int[] o(int i3) {
        int length = k().length();
        if (length <= 0 || i3 <= 0) {
            return null;
        }
        if (i3 > length) {
            i3 = length;
        }
        while (i3 > 0 && k().charAt(i3 - 1) == '\n' && !q(i3)) {
            i3--;
        }
        if (i3 <= 0) {
            return null;
        }
        int i9 = i3 - 1;
        while (i9 > 0 && (k().charAt(i9) == '\n' || (i9 != 0 && k().charAt(i9 - 1) != '\n'))) {
            i9--;
        }
        return j(i9, i3);
    }

    public final boolean q(int i3) {
        if (i3 <= 0 || k().charAt(i3 - 1) == '\n') {
            return false;
        }
        return i3 == k().length() || k().charAt(i3) == '\n';
    }
}
