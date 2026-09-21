package p188x0;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3085e implements p188x0.x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f31102f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f31103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f31104b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B0.b f31105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p188x0.ComponentCallbacks2C3084d f31107e;

    public C3085e(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.f31103a = androidComposeView;
        p188x0.ComponentCallbacks2C3084d componentCallbacks2C3084d = new p188x0.ComponentCallbacks2C3084d(this);
        this.f31107e = componentCallbacks2C3084d;
        if (androidComposeView.isAttachedToWindow()) {
            android.content.Context context = androidComposeView.getContext();
            if (!this.f31106d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C3084d);
                this.f31106d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new R0.T0(4, this));
    }

    @Override // p188x0.x
    public final void a(A0.d dVar) {
        synchronized (this.f31104b) {
            if (!dVar.f37s) {
                dVar.f37s = true;
                dVar.b();
            }
        }
    }

    @Override // p188x0.x
    public final A0.d b() {
        A0.f kVar;
        A0.d dVar;
        synchronized (this.f31104b) {
            try {
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f31103a;
                int i3 = android.os.Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i3 >= 29) {
                    kVar = new A0.i();
                } else if (f31102f) {
                    try {
                        kVar = new A0.g(this.f31103a, new p188x0.r(), new p203z0.b());
                    } catch (java.lang.Throwable unused) {
                        f31102f = false;
                        kVar = new A0.k(c(this.f31103a));
                    }
                } else {
                    kVar = new A0.k(c(this.f31103a));
                }
                dVar = new A0.d(kVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final B0.a c(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        B0.b bVar = this.f31105c;
        if (bVar != null) {
            return bVar;
        }
        B0.b bVar2 = new B0.b(androidComposeView.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(com.kiptv.tv.R.id.hide_graphics_layer_in_inspector_tag, java.lang.Boolean.TRUE);
        androidComposeView.addView(bVar2, -1);
        this.f31105c = bVar2;
        return bVar2;
    }
}
