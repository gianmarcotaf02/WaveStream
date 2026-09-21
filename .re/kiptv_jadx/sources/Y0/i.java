package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11038a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof Y0.i) {
            return this.f11038a == ((Y0.i) obj).f11038a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f11038a);
    }

    public final java.lang.String toString() {
        int i3 = this.f11038a;
        if (i3 == 0) {
            return "Button";
        }
        if (i3 == 1) {
            return "Checkbox";
        }
        if (i3 == 2) {
            return "Switch";
        }
        if (i3 == 3) {
            return "RadioButton";
        }
        if (i3 == 4) {
            return "Tab";
        }
        if (i3 == 5) {
            return "Image";
        }
        if (i3 == 6) {
            return "DropdownList";
        }
        if (i3 == 7) {
            return "Picker";
        }
        return i3 == 8 ? "Carousel" : "Unknown";
    }
}
