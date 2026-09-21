package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f22616A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f22617B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f22618C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p072i.d f22619D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f22621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p072i.h f22622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.Window f22623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f22624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.appcompat.app.AlertController$RecycleListView f22625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.view.View f22626f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.widget.Button f22627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f22628i;
    public android.os.Message j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.widget.Button f22629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f22630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.os.Message f22631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public android.widget.Button f22632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f22633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public android.os.Message f22634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.core.widget.NestedScrollView f22635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f22636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f22637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public android.widget.TextView f22638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public android.widget.TextView f22639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public android.view.View f22640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public android.widget.ListAdapter f22641w;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f22643z;
    public boolean g = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22642x = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p072i.ViewOnClickListenerC2181a f22620E = new p072i.ViewOnClickListenerC2181a(0, this);

    public f(android.content.Context context, p072i.h hVar, android.view.Window window) {
        this.f22621a = context;
        this.f22622b = hVar;
        this.f22623c = window;
        p072i.d dVar = new p072i.d();
        dVar.f22615b = new java.lang.ref.WeakReference(hVar);
        this.f22619D = dVar;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f22409e, com.kiptv.tv.R.attr.alertDialogStyle, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f22643z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f22616A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f22617B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f22618C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        hVar.d().c(1);
    }

    public static boolean a(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static android.view.ViewGroup b(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    public final void c(int i3, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        android.os.Message messageObtainMessage = onClickListener != null ? this.f22619D.obtainMessage(i3, onClickListener) : null;
        if (i3 == -3) {
            this.f22633o = charSequence;
            this.f22634p = messageObtainMessage;
        } else if (i3 == -2) {
            this.f22630l = charSequence;
            this.f22631m = messageObtainMessage;
        } else {
            if (i3 != -1) {
                throw new java.lang.IllegalArgumentException("Button does not exist");
            }
            this.f22628i = charSequence;
            this.j = messageObtainMessage;
        }
    }
}
