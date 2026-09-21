package I6;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I6.e f5529h = new I6.e();

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.m.e(entry, "entry");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = java.util.Arrays.toString((boolean[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = java.util.Arrays.toString((char[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = java.util.Arrays.toString((byte[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = java.util.Arrays.toString((short[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = java.util.Arrays.toString((int[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = java.util.Arrays.toString((float[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = java.util.Arrays.toString((long[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = java.util.Arrays.toString((double[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else if (value instanceof java.lang.Object[]) {
            string = java.util.Arrays.toString((java.lang.Object[]) value);
            kotlin.jvm.internal.m.d(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
