package p144r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f26669a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f26670b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object[] f26671c = new java.lang.Object[0];

    public static final int a(int i3, int i9, int[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int i10 = i3 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = array[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final int b(long[] array, int i3, long j) {
        kotlin.jvm.internal.m.e(array, "array");
        int i9 = i3 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            long j9 = array[i11];
            if (j9 < j) {
                i10 = i11 + 1;
            } else {
                if (j9 <= j) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final void c(java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        throw new java.lang.IllegalArgumentException(message);
    }

    public static final void d(java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        throw new java.lang.IndexOutOfBoundsException(message);
    }

    public static final void e(java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        throw new java.util.NoSuchElementException(message);
    }
}
