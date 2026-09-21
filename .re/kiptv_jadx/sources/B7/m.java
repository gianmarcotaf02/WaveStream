package B7;

/* JADX INFO: loaded from: classes4.dex */
public class m implements B7.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.String f841d = O7.q.n1(B7.m.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B7.b f842e = new B7.b("NO_LOCKS", B7.a.f824h);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B7.o f843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B7.a f844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f845c;

    public m(java.lang.String str) {
        this(str, new p166t3.i(3, new java.util.concurrent.locks.ReentrantLock()));
    }

    public static void e(java.lang.AssertionError assertionError) {
        java.lang.StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i3 = 0;
        while (i3 < length) {
            if (!stackTrace[i3].getClassName().startsWith(f841d)) {
                java.util.List listSubList = java.util.Arrays.asList(stackTrace).subList(i3, length);
                assertionError.setStackTrace((java.lang.StackTraceElement[]) listSubList.toArray(new java.lang.StackTraceElement[listSubList.size()]));
            }
            i3++;
        }
        i3 = -1;
        java.util.List listSubList2 = java.util.Arrays.asList(stackTrace).subList(i3, length);
        assertionError.setStackTrace((java.lang.StackTraceElement[]) listSubList2.toArray(new java.lang.StackTraceElement[listSubList2.size()]));
    }

    public final B7.i a(kotlin.jvm.functions.Function0 function0) {
        return new B7.i(this, function0);
    }

    public final B7.e b(p194x6.j jVar) {
        return new B7.e(this, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), jVar, 1);
    }

    public final B7.j c(p194x6.j jVar) {
        return new B7.j(this, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), jVar);
    }

    public B7.l d(java.lang.Object obj, java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append(" (");
        return Y6.f.m(sb, this.f845c, ")");
    }

    public m(java.lang.String str, B7.o oVar) {
        B7.a aVar = B7.a.f825i;
        this.f843a = oVar;
        this.f844b = aVar;
        this.f845c = str;
    }
}
