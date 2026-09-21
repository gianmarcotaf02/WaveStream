package p103m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class AbstractC2579n0 {

    public static final Field f25085a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f25085a = declaredField;
    }
}
