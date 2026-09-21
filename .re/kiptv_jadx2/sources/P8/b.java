package P8;

public interface b {
    boolean a();

    boolean b();

    void c(String str, Throwable th);

    boolean d();

    boolean e();

    boolean f();

    void g(String str);

    String getName();

    void h(String str);

    void i(String str);

    default boolean j(int i3) {
        char c9;
        String str;
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
        StringBuilder sb = new StringBuilder("Level [");
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
        throw new IllegalArgumentException(sb.toString());
    }
}
