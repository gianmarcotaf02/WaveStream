package Y;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class z {

    public static final boolean f11023a = kotlin.jvm.internal.m.a(Build.DEVICE, "layoutlib");

    public static final r a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof r) {
                return (r) childAt;
            }
        }
        r rVar = new r(viewGroup.getContext());
        viewGroup.addView(rVar);
        return rVar;
    }

    public static final ViewGroup b(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
