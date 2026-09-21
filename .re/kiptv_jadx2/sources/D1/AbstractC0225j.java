package D1;

import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class AbstractC0225j {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static androidx.core.app.K d(Person person) {
        CharSequence name = person.getName();
        IconCompat iconCompatB = person.getIcon() != null ? IconCompat.b(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
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

    public static List e(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] f(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor g(Context context) {
        return context.getMainExecutor();
    }

    public static int h(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String i(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params o(p103m.Y y) {
        return y.getTextMetricsParams();
    }

    public static int p(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri q(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void r(TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }

    public static void s(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean t(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Person u(androidx.core.app.K k9) {
        Person.Builder name = new Person.Builder().setName(k9.f15998a);
        IconCompat iconCompat = k9.f15999b;
        return name.setIcon(iconCompat != null ? iconCompat.i(null) : null).setUri(k9.f16000c).setKey(k9.f16001d).setBot(k9.f16002e).setImportant(k9.f16003f).build();
    }
}
