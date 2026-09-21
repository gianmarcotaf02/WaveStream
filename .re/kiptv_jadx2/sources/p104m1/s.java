package p104m1;

public final class s {

    public static final s f25189c = new s(2, false);

    public static final s f25190d = new s(1, true);

    public final int f25191a;

    public final boolean f25192b;

    public s(int i3, boolean z6) {
        this.f25191a = i3;
        this.f25192b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f25191a == sVar.f25191a && this.f25192b == sVar.f25192b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25192b) + (Integer.hashCode(this.f25191a) * 31);
    }

    public final String toString() {
        if (equals(f25189c)) {
            return "TextMotion.Static";
        }
        return equals(f25190d) ? "TextMotion.Animated" : "Invalid";
    }
}
