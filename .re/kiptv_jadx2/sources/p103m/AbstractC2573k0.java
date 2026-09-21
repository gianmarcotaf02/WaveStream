package p103m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

public abstract class AbstractC2573k0 {

    public static final Method f25070a;

    public static final Method f25071b;

    public static final Method f25072c;

    public static final boolean f25073d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f25070a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f25071b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f25072c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f25073d = true;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}
