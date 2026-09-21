package p011b1;

public final class C1653j {

    public final int f17819a;

    public static String a(int i3) {
        if (i3 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i3 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i3 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1653j) {
            return this.f17819a == ((C1653j) obj).f17819a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17819a);
    }

    public final String toString() {
        return a(this.f17819a);
    }
}
