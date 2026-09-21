package P8;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    boolean a();

    boolean b();

    void c(java.lang.String str, java.lang.Throwable th);

    boolean d();

    boolean e();

    boolean f();

    void g(java.lang.String str);

    java.lang.String getName();

    void h(java.lang.String str);

    void i(java.lang.String str);

    default boolean j(int i3) {
        char c9;
        java.lang.String str;
        if (i3 == 1) {
            c9 = '(';
        } else if (i3 == 2) {
            c9 = 30;
        } else if (i3 == 3) {
            c9 = 20;
        } else if (i3 == 4) {
            c9 = '\n';
        } else {
            if (i3 != 5) {
                throw null;
            }
            c9 = 0;
        }
        if (c9 == 0) {
            return f();
        }
        if (c9 == '\n') {
            return b();
        }
        if (c9 == 20) {
            return e();
        }
        if (c9 == 30) {
            return a();
        }
        if (c9 == '(') {
            return d();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Level [");
        if (i3 == 1) {
            str = "ERROR";
        } else if (i3 == 2) {
            str = "WARN";
        } else if (i3 == 3) {
            str = "INFO";
        } else if (i3 != 4) {
            str = i3 != 5 ? "null" : "TRACE";
        } else {
            str = "DEBUG";
        }
        sb.append(str);
        sb.append("] not recognized.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
