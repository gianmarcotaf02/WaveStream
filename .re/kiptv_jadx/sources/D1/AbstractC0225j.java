package D1;

/* JADX INFO: renamed from: D1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0225j {
    public static void a(android.app.Notification.Builder builder, android.app.Person person) {
        builder.addPerson(person);
    }

    public static android.os.Handler b(android.os.Looper looper) {
        return android.os.Handler.createAsync(looper);
    }

    public static android.os.Handler c(android.os.Looper looper) {
        return android.os.Handler.createAsync(looper);
    }

    public static androidx.core.app.K d(android.app.Person person) {
        java.lang.CharSequence name = person.getName();
        androidx.core.graphics.drawable.IconCompat iconCompatB = person.getIcon() != null ? androidx.core.graphics.drawable.IconCompat.b(person.getIcon()) : null;
        java.lang.String uri = person.getUri();
        java.lang.String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        androidx.core.app.K k9 = new androidx.core.app.K();
        k9.f15998a = name;
        k9.f15999b = iconCompatB;
        k9.f16000c = uri;
        k9.f16001d = key;
        k9.f16002e = zIsBot;
        k9.f16003f = zIsImportant;
        return k9;
    }

    public static java.util.List e(android.view.DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static java.lang.String[] f(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static java.util.concurrent.Executor g(android.content.Context context) {
        return context.getMainExecutor();
    }

    public static int h(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResId();
    }

    public static java.lang.String i(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResPackage();
    }

    public static int j(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int k(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int l(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int m(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int n(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static android.text.PrecomputedText.Params o(p103m.Y y) {
        return y.getTextMetricsParams();
    }

    public static int p(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getType();
    }

    public static android.net.Uri q(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getUri();
    }

    public static void r(android.widget.TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }

    public static void s(android.app.Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean t(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static android.app.Person u(androidx.core.app.K k9) {
        android.app.Person.Builder name = new android.app.Person.Builder().setName(k9.f15998a);
        androidx.core.graphics.drawable.IconCompat iconCompat = k9.f15999b;
        return name.setIcon(iconCompat != null ? iconCompat.i(null) : null).setUri(k9.f16000c).setKey(k9.f16001d).setBot(k9.f16002e).setImportant(k9.f16003f).build();
    }
}
