package H4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.TimeZone f4017a = j$.util.DesugarTimeZone.getTimeZone("UTC");

    public static void a(java.lang.StringBuilder sb, int i3, int i9) {
        java.lang.String string = java.lang.Integer.toString(i3);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }
}
