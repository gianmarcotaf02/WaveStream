package p188x0;

import A0.d;
import A0.f;
import A0.g;
import A0.i;
import A0.k;
import B0.a;
import B0.b;
import R0.T0;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.kiptv.tv.R;

public final class C3085e implements x {

    public static boolean f31102f = true;

    public final AndroidComposeView f31103a;

    public final Object f31104b = new Object();

    public b f31105c;

    public boolean f31106d;

    public final ComponentCallbacks2C3084d f31107e;

    public C3085e(AndroidComposeView androidComposeView) {
        this.f31103a = androidComposeView;
        ComponentCallbacks2C3084d componentCallbacks2C3084d = new ComponentCallbacks2C3084d(this);
        this.f31107e = componentCallbacks2C3084d;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.f31106d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C3084d);
                this.f31106d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new T0(4, this));
    }

    @Override
    public final void a(d dVar) {
        synchronized (this.f31104b) {
            if (!dVar.f37s) {
                dVar.f37s = true;
                dVar.b();
            }
        }
    }

    @Override
    public final d b() {
        f kVar;
        d dVar;
        synchronized (this.f31104b) {
            try {
                AndroidComposeView androidComposeView = this.f31103a;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i3 >= 29) {
                    kVar = new i();
                } else if (f31102f) {
                    try {
                        kVar = new g(this.f31103a, new r(), new p203z0.b());
                    } catch (Throwable unused) {
                        f31102f = false;
                        kVar = new k(c(this.f31103a));
                    }
                } else {
                    kVar = new k(c(this.f31103a));
                }
                dVar = new d(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final a c(AndroidComposeView androidComposeView) {
        b bVar = this.f31105c;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(androidComposeView.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(bVar2, -1);
        this.f31105c = bVar2;
        return bVar2;
    }
}
