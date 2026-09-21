package p068h4;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f22497a;

    public k(java.lang.String str) {
        str.getClass();
        this.f22497a = str;
    }

    public static java.lang.CharSequence c(java.lang.Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    public final void a(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((java.lang.CharSequence) this.f22497a);
                    sb.append(c(it.next()));
                }
            }
        } catch (java.io.IOException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }

    public final java.lang.String b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
