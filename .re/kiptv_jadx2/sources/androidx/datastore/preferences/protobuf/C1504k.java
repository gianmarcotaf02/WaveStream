package androidx.datastore.preferences.protobuf;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class C1504k extends IOException {
    public C1504k(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public C1504k(long j, long j9, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbU = p121o0.p.u(j, "Pos: ", ", limit: ");
        sbU.append(j9);
        sbU.append(", len: ");
        sbU.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbU.toString()), indexOutOfBoundsException);
    }

    public C1504k(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i3) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i3) {
            case 3:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            default:
                break;
        }
    }

    public C1504k(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        super(string);
    }
}
