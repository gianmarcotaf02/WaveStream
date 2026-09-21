package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25180a;

    public static java.lang.String a(int i3) {
        if (i3 == 1) {
            return "Ltr";
        }
        if (i3 == 2) {
            return "Rtl";
        }
        if (i3 == 3) {
            return "Content";
        }
        if (i3 == 4) {
            return "ContentOrLtr";
        }
        if (i3 == 5) {
            return "ContentOrRtl";
        }
        return i3 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p104m1.m) {
            return this.f25180a == ((p104m1.m) obj).f25180a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f25180a);
    }

    public final java.lang.String toString() {
        return a(this.f25180a);
    }
}
