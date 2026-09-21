package p103m;

/* JADX INFO: renamed from: m.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2593v extends android.widget.ImageButton {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0.w0 f25141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B8.h f25142i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2593v(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        p103m.O0.a(context);
        this.j = false;
        p103m.N0.a(this, getContext());
        Q0.w0 w0Var = new Q0.w0(this);
        this.f25141h = w0Var;
        w0Var.k(attributeSet, i3);
        B8.h hVar = new B8.h(this);
        this.f25142i = hVar;
        hVar.h(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.a();
        }
        B8.h hVar = this.f25142i;
        if (hVar != null) {
            hVar.b();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        p103m.P0 p2;
        B8.h hVar = this.f25142i;
        if (hVar == null || (p2 = (p103m.P0) hVar.f862k) == null) {
            return null;
        }
        return (android.content.res.ColorStateList) p2.f24960c;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        p103m.P0 p2;
        B8.h hVar = this.f25142i;
        if (hVar == null || (p2 = (p103m.P0) hVar.f862k) == null) {
            return null;
        }
        return (android.graphics.PorterDuff.Mode) p2.f24961d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((android.widget.ImageView) this.f25142i.j).getBackground() instanceof android.graphics.drawable.RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B8.h hVar = this.f25142i;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        B8.h hVar = this.f25142i;
        if (hVar != null && drawable != null && !this.j) {
            hVar.f861i = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (hVar != null) {
            hVar.b();
            if (this.j) {
                return;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) hVar.j;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(hVar.f861i);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.j = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        B8.h hVar = this.f25142i;
        android.widget.ImageView imageView = (android.widget.ImageView) hVar.j;
        if (i3 != 0) {
            android.graphics.drawable.Drawable drawableY = com.google.common.util.concurrent.AbstractC1903s.y(imageView.getContext(), i3);
            if (drawableY != null) {
                p103m.AbstractC2569i0.a(drawableY);
            }
            imageView.setImageDrawable(drawableY);
        } else {
            imageView.setImageDrawable(null);
        }
        hVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        B8.h hVar = this.f25142i;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        Q0.w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        B8.h hVar = this.f25142i;
        if (hVar != null) {
            if (((p103m.P0) hVar.f862k) == null) {
                hVar.f862k = new p103m.P0();
            }
            p103m.P0 p2 = (p103m.P0) hVar.f862k;
            p2.f24960c = colorStateList;
            p2.f24959b = true;
            hVar.b();
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        B8.h hVar = this.f25142i;
        if (hVar != null) {
            if (((p103m.P0) hVar.f862k) == null) {
                hVar.f862k = new p103m.P0();
            }
            p103m.P0 p2 = (p103m.P0) hVar.f862k;
            p2.f24961d = mode;
            p2.f24958a = true;
            hVar.b();
        }
    }
}
