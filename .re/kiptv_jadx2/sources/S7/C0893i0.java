package S7;

import java.util.concurrent.CancellationException;

public final class C0893i0 extends CancellationException implements InterfaceC0904u {

    public final transient p0 f9587h;

    public C0893i0(String str, Throwable th, p0 p0Var) {
        super(str);
        this.f9587h = p0Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override
    public final Throwable createCopy() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0893i0)) {
            return false;
        }
        C0893i0 c0893i0 = (C0893i0) obj;
        if (!kotlin.jvm.internal.m.a(c0893i0.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c0893i0.f9587h;
        if (obj2 == null) {
            obj2 = s0.f9618h;
        }
        Object obj3 = this.f9587h;
        if (obj3 == null) {
            obj3 = s0.f9618h;
        }
        return kotlin.jvm.internal.m.a(obj2, obj3) && kotlin.jvm.internal.m.a(c0893i0.getCause(), getCause());
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.m.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f9587h;
        if (obj == null) {
            obj = s0.f9618h;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f9587h;
        if (obj == null) {
            obj = s0.f9618h;
        }
        sb.append(obj);
        return sb.toString();
    }
}
