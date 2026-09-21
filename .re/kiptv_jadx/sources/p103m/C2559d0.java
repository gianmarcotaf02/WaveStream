package p103m;

/* JADX INFO: renamed from: m.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2559d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final android.graphics.RectF f25024l = new android.graphics.RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f25025m = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25026a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25027b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f25028c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25029d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25030e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f25031f = new int[0];
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f25032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f25033i;
    public final android.content.Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p103m.C2553a0 f25034k;

    public C2559d0(android.widget.TextView textView) {
        this.f25033i = textView;
        this.j = textView.getContext();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.f25034k = new p103m.C2555b0();
        } else {
            this.f25034k = new p103m.C2553a0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            java.util.Arrays.sort(iArr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i3)) < 0) {
                    arrayList.add(java.lang.Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr2[i9] = ((java.lang.Integer) arrayList.get(i9)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static java.lang.reflect.Method d(java.lang.String str) {
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f25025m;
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = android.widget.TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (java.lang.Exception e6) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static java.lang.Object e(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (java.lang.Exception e6) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f25027b) {
                if (this.f25033i.getMeasuredHeight() <= 0 || this.f25033i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f25034k.b(this.f25033i) ? 1048576 : (this.f25033i.getMeasuredWidth() - this.f25033i.getTotalPaddingLeft()) - this.f25033i.getTotalPaddingRight();
                int height = (this.f25033i.getHeight() - this.f25033i.getCompoundPaddingBottom()) - this.f25033i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = f25024l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f25033i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            this.f25027b = true;
        }
    }

    public final int c(android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        int length = this.f25031f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i9 = 0;
        int i10 = 1;
        while (i10 <= i3) {
            int i11 = (i10 + i3) / 2;
            int i12 = this.f25031f[i11];
            android.widget.TextView textView = this.f25033i;
            java.lang.CharSequence text = textView.getText();
            android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
            java.lang.CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            android.text.TextPaint textPaint = this.f25032h;
            if (textPaint == null) {
                this.f25032h = new android.text.TextPaint();
            } else {
                textPaint.reset();
            }
            this.f25032h.set(textView.getPaint());
            this.f25032h.setTextSize(i12);
            android.text.StaticLayout staticLayoutA = p103m.Z.a(charSequence, (android.text.Layout.Alignment) e("getLayoutAlignment", textView, android.text.Layout.Alignment.ALIGN_NORMAL), java.lang.Math.round(rectF.right), maxLines, this.f25033i, this.f25032h, this.f25034k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i13 = i11 + 1;
                i9 = i10;
                i10 = i13;
            } else {
                i9 = i11 - 1;
                i3 = i9;
            }
        }
        return this.f25031f[i9];
    }

    public final boolean f() {
        return j() && this.f25026a != 0;
    }

    public final void g(float f9, int i3) {
        android.content.Context context = this.j;
        float fApplyDimension = android.util.TypedValue.applyDimension(i3, f9, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        android.widget.TextView textView = this.f25033i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f25027b = false;
                try {
                    java.lang.reflect.Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (java.lang.Exception e6) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f25026a == 1) {
            if (!this.g || this.f25031f.length == 0) {
                int iFloor = ((int) java.lang.Math.floor((this.f25030e - this.f25029d) / this.f25028c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i3 = 0; i3 < iFloor; i3++) {
                    iArr[i3] = java.lang.Math.round((i3 * this.f25028c) + this.f25029d);
                }
                this.f25031f = b(iArr);
            }
            this.f25027b = true;
        } else {
            this.f25027b = false;
        }
        return this.f25027b;
    }

    public final boolean i() {
        int[] iArr = this.f25031f;
        int length = iArr.length;
        boolean z6 = length > 0;
        this.g = z6;
        if (z6) {
            this.f25026a = 1;
            this.f25029d = iArr[0];
            this.f25030e = iArr[length - 1];
            this.f25028c = -1.0f;
        }
        return z6;
    }

    public final boolean j() {
        return !(this.f25033i instanceof p103m.C2589t);
    }

    public final void k(float f9, float f10, float f11) {
        if (f9 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
        }
        if (f10 <= f9) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f25026a = 1;
        this.f25029d = f9;
        this.f25030e = f10;
        this.f25028c = f11;
        this.g = false;
    }
}
