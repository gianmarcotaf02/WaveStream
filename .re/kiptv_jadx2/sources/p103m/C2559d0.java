package p103m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class C2559d0 {

    public static final RectF f25024l = new RectF();

    public static final ConcurrentHashMap f25025m = new ConcurrentHashMap();

    public int f25026a = 0;

    public boolean f25027b = false;

    public float f25028c = -1.0f;

    public float f25029d = -1.0f;

    public float f25030e = -1.0f;

    public int[] f25031f = new int[0];
    public boolean g = false;

    public TextPaint f25032h;

    public final TextView f25033i;
    public final Context j;

    public final C2553a0 f25034k;

    public C2559d0(TextView textView) {
        this.f25033i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f25034k = new C2555b0();
        } else {
            this.f25034k = new C2553a0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f25025m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
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
                RectF rectF = f25024l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f25033i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f25027b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f25031f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i9 = 0;
        int i10 = 1;
        while (i10 <= i3) {
            int i11 = (i10 + i3) / 2;
            int i12 = this.f25031f[i11];
            TextView textView = this.f25033i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f25032h;
            if (textPaint == null) {
                this.f25032h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f25032h.set(textView.getPaint());
            this.f25032h.setTextSize(i12);
            StaticLayout staticLayoutA = Z.a(charSequence, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f25033i, this.f25032h, this.f25034k);
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
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i3, f9, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f25033i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f25027b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
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
                int iFloor = ((int) Math.floor((this.f25030e - this.f25029d) / this.f25028c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i3 = 0; i3 < iFloor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f25028c) + this.f25029d);
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
        return !(this.f25033i instanceof C2589t);
    }

    public final void k(float f9, float f10, float f11) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
        }
        if (f10 <= f9) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f25026a = 1;
        this.f25029d = f9;
        this.f25030e = f10;
        this.f25028c = f11;
        this.g = false;
    }
}
