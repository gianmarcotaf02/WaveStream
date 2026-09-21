package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static void a(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, android.content.res.Resources.Theme theme) {
        if (java.util.Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
