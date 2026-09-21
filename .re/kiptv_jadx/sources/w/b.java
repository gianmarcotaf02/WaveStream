package w;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p089k0.e f29714a = new p089k0.e(-1571120048, new w.a(), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p089k0.e f29715b = new p089k0.e(-1455401925, new J.C0535b(7), false);

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r3 - r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(boolean z6, int i3, int i9, int i10) {
        if (i9 >= i10) {
            if (z6) {
                return 0;
            }
            return i10 - i9;
        }
        if (z6) {
            if (z6) {
                if (z6) {
                    return i10 - i9;
                }
                return 0;
            }
            if (z6) {
                return 0;
            }
            return i10 - i9;
        }
        if (z6 ? i10 - i9 <= i3 : i9 > i3) {
            if (z6) {
                return 0;
            }
            return i10 - i9;
        }
        if (z6) {
            return i3 - i9;
        }
        return i3;
    }
}
