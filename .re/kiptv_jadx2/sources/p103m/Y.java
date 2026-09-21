package p103m;

import B1.b;
import D1.C;
import E8.l;
import F1.d;
import Q0.w0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.D;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p008a8.c;
import p199y3.e;

public class Y extends TextView {

    public final w0 f24983h;

    public final U f24984i;
    public final C2601z j;

    public C2591u f24985k;

    public boolean f24986l;

    public c f24987m;

    public Future f24988n;

    public Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2591u getEmojiTextViewHelper() {
        if (this.f24985k == null) {
            this.f24985k = new C2591u(this);
        }
        return this.f24985k;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.a();
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    public final void g() {
        Future future = this.f24988n;
        if (future == null) {
            return;
        }
        try {
            this.f24988n = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            l.y(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override
    public int getAutoSizeMaxTextSize() {
        if (g1.f25043c) {
            return super.getAutoSizeMaxTextSize();
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            return Math.round(u6.f24973i.f25030e);
        }
        return -1;
    }

    @Override
    public int getAutoSizeMinTextSize() {
        if (g1.f25043c) {
            return super.getAutoSizeMinTextSize();
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            return Math.round(u6.f24973i.f25029d);
        }
        return -1;
    }

    @Override
    public int getAutoSizeStepGranularity() {
        if (g1.f25043c) {
            return super.getAutoSizeStepGranularity();
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            return Math.round(u6.f24973i.f25028c);
        }
        return -1;
    }

    @Override
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f25043c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        U u6 = this.f24984i;
        return u6 != null ? u6.f24973i.f25031f : new int[0];
    }

    @Override
    public int getAutoSizeTextType() {
        if (g1.f25043c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            return u6.f24973i.f25026a;
        }
        return 0;
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return l.Q(super.getCustomSelectionActionModeCallback());
    }

    @Override
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public V getSuperCaller() {
        if (this.f24987m == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f24987m = new X(this);
            } else if (i3 >= 28) {
                this.f24987m = new W(this);
            } else if (i3 >= 26) {
                this.f24987m = new c(11, this);
            }
        }
        return this.f24987m;
    }

    public ColorStateList getSupportBackgroundTintList() {
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f24984i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f24984i.e();
    }

    @Override
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        C2601z c2601z;
        if (Build.VERSION.SDK_INT >= 28 || (c2601z = this.j) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2601z.f25154c;
        return textClassifier == null ? P.a((TextView) c2601z.f25153b) : textClassifier;
    }

    public b getTextMetricsParamsCompat() {
        return l.y(this);
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f24984i.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            d.a(editorInfo, getText());
        }
        AbstractC1909d.d0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
        U u6 = this.f24984i;
        if (u6 == null || g1.f25043c) {
            return;
        }
        u6.f24973i.a();
    }

    @Override
    public void onMeasure(int i3, int i9) {
        g();
        super.onMeasure(i3, i9);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i9, int i10) {
        super.onTextChanged(charSequence, i3, i9, i10);
        U u6 = this.f24984i;
        if (u6 == null || g1.f25043c) {
            return;
        }
        C2559d0 c2559d0 = u6.f24973i;
        if (c2559d0.f()) {
            c2559d0.a();
        }
    }

    @Override
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i9, int i10, int i11) {
        if (g1.f25043c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i9, i10, i11);
            return;
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.h(i3, i9, i10, i11);
        }
    }

    @Override
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (g1.f25043c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.i(iArr, i3);
        }
    }

    @Override
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (g1.f25043c) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.j(i3);
        }
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((e) getEmojiTextViewHelper().f25139b.f27782i).v(inputFilterArr));
    }

    @Override
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().H(i3);
        } else {
            l.J(this, i3);
        }
    }

    @Override
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().y(i3);
        } else {
            l.K(this, i3);
        }
    }

    @Override
    public void setLineHeight(int i3) {
        l.L(this, i3);
    }

    public void setPrecomputedText(B1.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        l.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f24984i;
        u6.k(colorStateList);
        u6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f24984i;
        u6.l(mode);
        u6.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.g(context, i3);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        C2601z c2601z;
        if (Build.VERSION.SDK_INT >= 28 || (c2601z = this.j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2601z.f25154c = textClassifier;
        }
    }

    public void setTextFuture(Future<B1.c> future) {
        this.f24988n = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b bVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bVar.f584b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(bVar.f583a);
        setBreakStrategy(bVar.f585c);
        setHyphenationFrequency(bVar.f586d);
    }

    @Override
    public final void setTextSize(int i3, float f9) {
        boolean z6 = g1.f25043c;
        if (z6) {
            super.setTextSize(i3, f9);
            return;
        }
        U u6 = this.f24984i;
        if (u6 == null || z6) {
            return;
        }
        C2559d0 c2559d0 = u6.f24973i;
        if (c2559d0.f()) {
            return;
        }
        c2559d0.g(f9, i3);
    }

    @Override
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typefaceCreate;
        if (this.f24986l) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            D d4 = p182w1.d.f29765a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i3);
        }
        this.f24986l = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f24986l = false;
        }
    }

    public Y(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        O0.a(context);
        this.f24986l = false;
        this.f24987m = null;
        N0.a(this, getContext());
        w0 w0Var = new w0(this);
        this.f24983h = w0Var;
        w0Var.k(attributeSet, i3);
        U u6 = new U(this);
        this.f24984i = u6;
        u6.f(attributeSet, i3);
        u6.b();
        C2601z c2601z = new C2601z();
        c2601z.f25153b = this;
        this.j = c2601z;
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    @Override
    public final void setLineHeight(int i3, float f9) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            getSuperCaller().J(i3, f9);
        } else if (i9 >= 34) {
            C.l(this, i3, f9);
        } else {
            l.L(this, Math.round(TypedValue.applyDimension(i3, f9, getResources().getDisplayMetrics())));
        }
    }

    @Override
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC1903s.y(context, i3) : null, i9 != 0 ? AbstractC1903s.y(context, i9) : null, i10 != 0 ? AbstractC1903s.y(context, i10) : null, i11 != 0 ? AbstractC1903s.y(context, i11) : null);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC1903s.y(context, i3) : null, i9 != 0 ? AbstractC1903s.y(context, i9) : null, i10 != 0 ? AbstractC1903s.y(context, i10) : null, i11 != 0 ? AbstractC1903s.y(context, i11) : null);
        U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }
}
