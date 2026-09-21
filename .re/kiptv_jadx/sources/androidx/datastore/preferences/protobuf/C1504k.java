package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1504k extends java.io.IOException {
    public /* synthetic */ C1504k(java.lang.IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1504k(long j, long j9, int i3, java.lang.IndexOutOfBoundsException indexOutOfBoundsException) {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.StringBuilder sbU = p121o0.p.u(j, "Pos: ", ", limit: ");
        sbU.append(j9);
        sbU.append(", len: ");
        sbU.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbU.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504k(java.lang.String str, java.lang.IndexOutOfBoundsException indexOutOfBoundsException, int i3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i3) {
            case 3:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            default:
                break;
        }
    }

    public C1504k(java.io.File file, java.io.File file2, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        super(string);
    }
}
