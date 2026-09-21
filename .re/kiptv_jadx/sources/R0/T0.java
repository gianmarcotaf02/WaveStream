package R0;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8850i;

    public /* synthetic */ T0(int i3, java.lang.Object obj) {
        this.f8849h = i3;
        this.f8850i = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        switch (this.f8849h) {
            case 0:
            case 1:
            case 2:
            case 3:
                break;
            default:
                android.content.Context context = view.getContext();
                p188x0.C3085e c3085e = (p188x0.C3085e) this.f8850i;
                if (!c3085e.f31106d) {
                    context.getApplicationContext().registerComponentCallbacks(c3085e.f31107e);
                    c3085e.f31106d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        boolean z6;
        switch (this.f8849h) {
            case 0:
                R0.AbstractC0813b abstractC0813b = (R0.AbstractC0813b) this.f8850i;
                kotlin.jvm.internal.m.e(abstractC0813b, "<this>");
                java.util.Iterator it = N7.o.m0(abstractC0813b.getParent(), D1.Z.f1991h).iterator();
                while (true) {
                    z6 = false;
                    if (it.hasNext()) {
                        java.lang.Object obj = (android.view.ViewParent) it.next();
                        if (obj instanceof android.view.View) {
                            android.view.View view2 = (android.view.View) obj;
                            kotlin.jvm.internal.m.e(view2, "<this>");
                            java.lang.Object tag = view2.getTag(com.kiptv.tv.R.id.is_pooling_container_tag);
                            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z6 = true;
                            }
                        }
                    }
                }
                if (!z6) {
                    abstractC0813b.c();
                }
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((S7.w0) this.f8850i).e(null);
                break;
            case 2:
                p095l.f fVar = (p095l.f) this.f8850i;
                android.view.ViewTreeObserver viewTreeObserver = fVar.f24604E;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f24604E = view.getViewTreeObserver();
                    }
                    fVar.f24604E.removeGlobalOnLayoutListener(fVar.f24613p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                p095l.C c9 = (p095l.C) this.f8850i;
                android.view.ViewTreeObserver viewTreeObserver2 = c9.f24573v;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c9.f24573v = view.getViewTreeObserver();
                    }
                    c9.f24573v.removeGlobalOnLayoutListener(c9.f24567p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                android.content.Context context = view.getContext();
                p188x0.C3085e c3085e = (p188x0.C3085e) this.f8850i;
                if (c3085e.f31106d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c3085e.f31107e);
                    c3085e.f31106d = false;
                }
                break;
        }
    }

    private final void a(android.view.View view) {
    }

    private final void b(android.view.View view) {
    }

    private final void c(android.view.View view) {
    }

    private final void d(android.view.View view) {
    }
}
