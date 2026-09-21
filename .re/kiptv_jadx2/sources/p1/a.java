package p1;

import java.util.List;
import p194x6.j;

public abstract class a {
    public static String a(List list, String str, j jVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i3 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i3 & 4) == 0 ? "\n]" : "";
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            i9++;
            if (i9 > 1) {
                sb.append((CharSequence) str);
            }
            if (jVar != null) {
                sb.append((CharSequence) jVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
