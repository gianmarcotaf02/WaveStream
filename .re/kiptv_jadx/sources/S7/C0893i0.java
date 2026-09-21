package S7;

/* JADX INFO: renamed from: S7.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0893i0 extends java.util.concurrent.CancellationException implements S7.InterfaceC0904u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient S7.p0 f9587h;

    public C0893i0(java.lang.String str, java.lang.Throwable th, S7.p0 p0Var) {
        super(str);
        this.f9587h = p0Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // S7.InterfaceC0904u
    public final /* bridge */ /* synthetic */ java.lang.Throwable createCopy() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S7.C0893i0)) {
            return false;
        }
        S7.C0893i0 c0893i0 = (S7.C0893i0) obj;
        if (!kotlin.jvm.internal.m.a(c0893i0.getMessage(), getMessage())) {
            return false;
        }
        java.lang.Object obj2 = c0893i0.f9587h;
        if (obj2 == null) {
            obj2 = S7.s0.f9618h;
        }
        java.lang.Object obj3 = this.f9587h;
        if (obj3 == null) {
            obj3 = S7.s0.f9618h;
        }
        return kotlin.jvm.internal.m.a(obj2, obj3) && kotlin.jvm.internal.m.a(c0893i0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        java.lang.String message = getMessage();
        kotlin.jvm.internal.m.b(message);
        int iHashCode = message.hashCode() * 31;
        java.lang.Object obj = this.f9587h;
        if (obj == null) {
            obj = S7.s0.f9618h;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        java.lang.Object obj = this.f9587h;
        if (obj == null) {
            obj = S7.s0.f9618h;
        }
        sb.append(obj);
        return sb.toString();
    }
}
