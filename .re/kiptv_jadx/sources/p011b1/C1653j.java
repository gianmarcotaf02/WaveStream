package p011b1;

/* JADX INFO: renamed from: b1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17819a;

    public static java.lang.String a(int i3) {
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

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p011b1.C1653j) {
            return this.f17819a == ((p011b1.C1653j) obj).f17819a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f17819a);
    }

    public final java.lang.String toString() {
        return a(this.f17819a);
    }
}
