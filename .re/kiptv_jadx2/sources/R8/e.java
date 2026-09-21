package R8;

import Z.AbstractC1149h0;
import java.io.PrintStream;

public abstract class e {

    public static final int f9084a;

    public static final int f9085b;

    static {
        int i3;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i9 = 2;
        if (property != null && !property.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    i3 = 1;
                    break;
                } else {
                    if (strArr[i10].equalsIgnoreCase(property)) {
                        i3 = 2;
                        break;
                    }
                    i10++;
                }
            }
        } else {
            i3 = 1;
            break;
        }
        f9084a = i3;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i9 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i9 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i9 = 3;
            }
        }
        f9085b = i9;
    }

    public static final void a(String str) {
        c().println("SLF4J(E): " + str);
    }

    public static final void b(String str, Throwable th) {
        c().println("SLF4J(E): " + str);
        c().println("SLF4J(E): Reported exception:");
        th.printStackTrace(c());
    }

    public static PrintStream c() {
        return AbstractC1149h0.c(f9084a) != 1 ? System.err : System.out;
    }

    public static final void d(String str) {
        if (AbstractC1149h0.c(3) >= AbstractC1149h0.c(f9085b)) {
            c().println("SLF4J(W): " + str);
        }
    }
}
