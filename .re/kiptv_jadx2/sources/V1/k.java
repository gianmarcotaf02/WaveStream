package V1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class k implements TransformationMethod {

    public final TransformationMethod f10247a;

    public k(TransformationMethod transformationMethod) {
        this.f10247a = transformationMethod;
    }

    @Override
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f10247a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || T1.j.a().c() != 1) {
            return charSequence;
        }
        T1.j jVarA = T1.j.a();
        jVarA.getClass();
        return jVarA.g(0, charSequence.length(), 0, charSequence);
    }

    @Override
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f10247a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i3, rect);
        }
    }
}
