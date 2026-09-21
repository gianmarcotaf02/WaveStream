package p103m;

import B8.h;
import Q0.w0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.common.util.concurrent.AbstractC1903s;

public class C2593v extends ImageButton {

    public final w0 f25141h;

    public final h f25142i;
    public boolean j;

    public C2593v(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        O0.a(context);
        this.j = false;
        N0.a(this, getContext());
        w0 w0Var = new w0(this);
        this.f25141h = w0Var;
        w0Var.k(attributeSet, i3);
        h hVar = new h(this);
        this.f25142i = hVar;
        hVar.h(attributeSet, i3);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.a();
        }
        h hVar = this.f25142i;
        if (hVar != null) {
            hVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        P0 p2;
        h hVar = this.f25142i;
        if (hVar == null || (p2 = (P0) hVar.f862k) == null) {
            return null;
        }
        return (ColorStateList) p2.f24960c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        P0 p2;
        h hVar = this.f25142i;
        if (hVar == null || (p2 = (P0) hVar.f862k) == null) {
            return null;
        }
        return (PorterDuff.Mode) p2.f24961d;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f25142i.j).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h hVar = this.f25142i;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        h hVar = this.f25142i;
        if (hVar != null && drawable != null && !this.j) {
            hVar.f861i = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (hVar != null) {
            hVar.b();
            if (this.j) {
                return;
            }
            ImageView imageView = (ImageView) hVar.j;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(hVar.f861i);
            }
        }
    }

    @Override
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.j = true;
    }

    @Override
    public void setImageResource(int i3) {
        h hVar = this.f25142i;
        ImageView imageView = (ImageView) hVar.j;
        if (i3 != 0) {
            Drawable drawableY = AbstractC1903s.y(imageView.getContext(), i3);
            if (drawableY != null) {
                AbstractC2569i0.a(drawableY);
            }
            imageView.setImageDrawable(drawableY);
        } else {
            imageView.setImageDrawable(null);
        }
        hVar.b();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h hVar = this.f25142i;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f25141h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        h hVar = this.f25142i;
        if (hVar != null) {
            if (((P0) hVar.f862k) == null) {
                hVar.f862k = new P0();
            }
            P0 p2 = (P0) hVar.f862k;
            p2.f24960c = colorStateList;
            p2.f24959b = true;
            hVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        h hVar = this.f25142i;
        if (hVar != null) {
            if (((P0) hVar.f862k) == null) {
                hVar.f862k = new P0();
            }
            P0 p2 = (P0) hVar.f862k;
            p2.f24961d = mode;
            p2.f24958a = true;
            hVar.b();
        }
    }
}
