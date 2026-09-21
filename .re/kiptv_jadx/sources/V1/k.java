package V1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements android.text.method.TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.text.method.TransformationMethod f10247a;

    public k(android.text.method.TransformationMethod transformationMethod) {
        this.f10247a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        android.text.method.TransformationMethod transformationMethod = this.f10247a;
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

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z6, int i3, android.graphics.Rect rect) {
        android.text.method.TransformationMethod transformationMethod = this.f10247a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i3, rect);
        }
    }
}
