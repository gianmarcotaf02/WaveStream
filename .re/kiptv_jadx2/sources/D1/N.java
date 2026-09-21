package D1;

import android.view.View;

public abstract class N {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i3) {
        view.setImportantForAutofill(i3);
    }
}
