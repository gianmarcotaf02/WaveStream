package p072i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p136q.S;

public final class y {

    public static final Class[] f22732b = {Context.class, AttributeSet.class};

    public static final int[] f22733c = {R.attr.onClick};

    public static final int[] f22734d = {R.attr.accessibilityHeading};

    public static final int[] f22735e = {R.attr.accessibilityPaneTitle};

    public static final int[] f22736f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};

    public static final S f22737h = new S(0);

    public final Object[] f22738a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String strConcat;
        S s9 = f22737h;
        Constructor constructor = (Constructor) s9.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f22732b);
            s9.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f22738a);
    }
}
