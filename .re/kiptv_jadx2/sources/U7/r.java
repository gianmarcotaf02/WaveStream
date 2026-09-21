package U7;

public final class r {

    public static final q f10218b = new q();

    public final Object f10219a;

    public static final Throwable a(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f10217a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof q) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return kotlin.jvm.internal.m.a(this.f10219a, ((r) obj).f10219a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10219a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10219a;
        if (obj instanceof p) {
            return ((p) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
