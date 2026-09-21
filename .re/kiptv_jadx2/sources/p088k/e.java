package p088k;

import android.view.MenuItem;
import java.lang.reflect.Method;

public final class e implements MenuItem.OnMenuItemClickListener {

    public static final Class[] f24353c = {MenuItem.class};

    public Object f24354a;

    public Method f24355b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f24355b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f24354a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
