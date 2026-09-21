package E5;

public final class T implements U {

    public final boolean f2939a;

    public final boolean f2940b;

    public T(boolean z6, boolean z9) {
        this.f2939a = z6;
        this.f2940b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t9 = (T) obj;
        return this.f2939a == t9.f2939a && this.f2940b == t9.f2940b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2940b) + (Boolean.hashCode(this.f2939a) * 31);
    }

    public final String toString() {
        return "Selected(forceReload=" + this.f2939a + ", epgOnly=" + this.f2940b + ")";
    }
}
