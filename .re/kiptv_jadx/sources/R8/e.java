package R8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9085b;

    static {
        int i3;
        java.lang.String[] strArr = {"System.out", "stdout", "sysout"};
        java.lang.String property = java.lang.System.getProperty("slf4j.internal.report.stream");
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
        java.lang.String property2 = java.lang.System.getProperty("slf4j.internal.verbosity");
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

    public static final void a(java.lang.String str) {
        c().println("SLF4J(E): " + str);
    }

    public static final void b(java.lang.String str, java.lang.Throwable th) {
        c().println("SLF4J(E): " + str);
        c().println("SLF4J(E): Reported exception:");
        th.printStackTrace(c());
    }

    public static java.io.PrintStream c() {
        return Z.AbstractC1149h0.c(f9084a) != 1 ? java.lang.System.err : java.lang.System.out;
    }

    public static final void d(java.lang.String str) {
        if (Z.AbstractC1149h0.c(3) >= Z.AbstractC1149h0.c(f9085b)) {
            c().println("SLF4J(W): " + str);
        }
    }
}
