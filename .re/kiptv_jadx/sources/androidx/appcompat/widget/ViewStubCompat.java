package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15778i;
    public java.lang.ref.WeakReference j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.view.LayoutInflater f15779k;

    public ViewStubCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15777h = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22427z, 0, 0);
        this.f15778i = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f15777h = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final android.view.View a() {
        android.view.ViewParent parent = getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f15777h == 0) {
            throw new java.lang.IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        android.view.LayoutInflater layoutInflaterFrom = this.f15779k;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        }
        android.view.View viewInflate = layoutInflaterFrom.inflate(this.f15777h, viewGroup, false);
        int i3 = this.f15778i;
        if (i3 != -1) {
            viewInflate.setId(i3);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.j = new java.lang.ref.WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f15778i;
    }

    public android.view.LayoutInflater getLayoutInflater() {
        return this.f15779k;
    }

    public int getLayoutResource() {
        return this.f15777h;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f15778i = i3;
    }

    public void setLayoutInflater(android.view.LayoutInflater layoutInflater) {
        this.f15779k = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f15777h = i3;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        java.lang.ref.WeakReference weakReference = this.j;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            if (view == null) {
                throw new java.lang.IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            a();
        }
    }

    public void setOnInflateListener(p103m.e1 e1Var) {
    }
}
