package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f24943a = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f24944b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f24945c = {android.R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f24946d = {android.R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f24947e = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f24948f = new int[0];
    public static final int[] g = new int[1];

    public static void a(android.view.View view, android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.a.j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                android.util.Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(android.content.Context context, int i3) {
        android.content.res.ColorStateList colorStateListD = d(context, i3);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f24944b, colorStateListD.getDefaultColor());
        }
        java.lang.ThreadLocal threadLocal = f24943a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f9 = typedValue.getFloat();
        int iC = c(context, i3);
        int iRound = java.lang.Math.round(android.graphics.Color.alpha(iC) * f9);
        java.lang.ThreadLocal threadLocal2 = p182w1.a.f29758a;
        if (iRound < 0 || iRound > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (iC & 16777215) | (iRound << 24);
    }

    public static int c(android.content.Context context, int i3) {
        int[] iArr = g;
        iArr[0] = i3;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static android.content.res.ColorStateList d(android.content.Context context, int i3) {
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        int[] iArr = g;
        iArr[0] = i3;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = com.google.common.util.concurrent.AbstractC1903s.x(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
