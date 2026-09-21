package B7;

import O7.q;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

public class m implements p {

    public static final String f841d = q.n1(m.class.getCanonicalName(), ".", "");

    public static final b f842e = new b("NO_LOCKS", a.f824h);

    public final o f843a;

    public final a f844b;

    public final String f845c;

    public m(String str) {
        this(str, new p166t3.i(3, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i3 = 0;
        while (i3 < length) {
            if (!stackTrace[i3].getClassName().startsWith(f841d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i3, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i3++;
        }
        i3 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i3, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final i a(Function0 function0) {
        return new i(this, function0);
    }

    public final e b(p194x6.j jVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), jVar, 1);
    }

    public final j c(p194x6.j jVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), jVar);
    }

    public l d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return Y6.f.m(sb, this.f845c, ")");
    }

    public m(String str, o oVar) {
        a aVar = a.f825i;
        this.f843a = oVar;
        this.f844b = aVar;
        this.f845c = str;
    }
}
