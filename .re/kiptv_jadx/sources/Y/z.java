package Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f11023a = kotlin.jvm.internal.m.a(android.os.Build.DEVICE, "layoutlib");

    public static final Y.r a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof Y.r) {
                return (Y.r) childAt;
            }
        }
        Y.r rVar = new Y.r(viewGroup.getContext());
        viewGroup.addView(rVar);
        return rVar;
    }

    public static final android.view.ViewGroup b(android.view.View view) {
        java.lang.Object obj = view;
        while (!(obj instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = ((android.view.View) obj).getParent();
            if (!(parent instanceof android.view.View)) {
                throw new java.lang.IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (android.view.ViewGroup) obj;
    }
}
