package p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static java.lang.String a(java.util.List list, java.lang.String str, p194x6.j jVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        java.lang.String str2 = (i3 & 2) != 0 ? "" : "[\n\t";
        java.lang.String str3 = (i3 & 4) == 0 ? "\n]" : "";
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) str2);
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            java.lang.Object obj = list.get(i10);
            i9++;
            if (i9 > 1) {
                sb.append((java.lang.CharSequence) str);
            }
            if (jVar != null) {
                sb.append((java.lang.CharSequence) jVar.invoke(obj));
            } else if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb.append((java.lang.CharSequence) str3);
        return sb.toString();
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException(str);
    }
}
