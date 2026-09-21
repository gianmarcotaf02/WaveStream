package K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static java.lang.String a(int i3) {
        if (i3 == 1) {
            return "Touch";
        }
        if (i3 == 2) {
            return "Mouse";
        }
        if (i3 != 3) {
            return i3 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }
}
