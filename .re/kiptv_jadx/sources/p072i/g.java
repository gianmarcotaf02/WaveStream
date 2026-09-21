package p072i;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p072i.c f22644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22645b;

    public g(android.content.Context context) {
        this(context, p072i.h.h(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public p072i.h create() {
        p072i.c cVar = this.f22644a;
        p072i.h hVar = new p072i.h(cVar.f22601a, this.f22645b);
        android.view.View view = cVar.f22605e;
        p072i.f fVar = hVar.f22648m;
        if (view != null) {
            fVar.f22640v = view;
        } else {
            java.lang.CharSequence charSequence = cVar.f22604d;
            if (charSequence != null) {
                fVar.f22624d = charSequence;
                android.widget.TextView textView = fVar.f22638t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            android.graphics.drawable.Drawable drawable = cVar.f22603c;
            if (drawable != null) {
                fVar.f22636r = drawable;
                android.widget.ImageView imageView = fVar.f22637s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f22637s.setImageDrawable(drawable);
                }
            }
        }
        java.lang.CharSequence charSequence2 = cVar.f22606f;
        if (charSequence2 != null) {
            fVar.c(-1, charSequence2, cVar.g);
        }
        java.lang.CharSequence charSequence3 = cVar.f22607h;
        if (charSequence3 != null) {
            fVar.c(-2, charSequence3, cVar.f22608i);
        }
        if (cVar.f22609k != null) {
            androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView = (androidx.appcompat.app.AlertController$RecycleListView) cVar.f22602b.inflate(fVar.f22643z, (android.view.ViewGroup) null);
            int i3 = cVar.f22612n ? fVar.f22616A : fVar.f22617B;
            java.lang.Object obj = cVar.f22609k;
            ?? eVar = obj;
            if (obj == null) {
                eVar = new p072i.e(cVar.f22601a, i3, android.R.id.text1, null);
            }
            fVar.f22641w = eVar;
            fVar.f22642x = cVar.f22613o;
            if (cVar.f22610l != null) {
                alertController$RecycleListView.setOnItemClickListener(new p072i.C2182b(cVar, fVar));
            }
            if (cVar.f22612n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f22625e = alertController$RecycleListView;
        }
        android.view.View view2 = cVar.f22611m;
        if (view2 != null) {
            fVar.f22626f = view2;
            fVar.g = false;
        }
        hVar.setCancelable(true);
        hVar.setCanceledOnTouchOutside(true);
        hVar.setOnCancelListener(null);
        hVar.setOnDismissListener(null);
        p095l.m mVar = cVar.j;
        if (mVar != null) {
            hVar.setOnKeyListener(mVar);
        }
        return hVar;
    }

    public android.content.Context getContext() {
        return this.f22644a.f22601a;
    }

    public p072i.g setNegativeButton(int i3, android.content.DialogInterface.OnClickListener onClickListener) {
        p072i.c cVar = this.f22644a;
        cVar.f22607h = cVar.f22601a.getText(i3);
        cVar.f22608i = onClickListener;
        return this;
    }

    public p072i.g setPositiveButton(int i3, android.content.DialogInterface.OnClickListener onClickListener) {
        p072i.c cVar = this.f22644a;
        cVar.f22606f = cVar.f22601a.getText(i3);
        cVar.g = onClickListener;
        return this;
    }

    public p072i.g setTitle(java.lang.CharSequence charSequence) {
        this.f22644a.f22604d = charSequence;
        return this;
    }

    public p072i.g setView(android.view.View view) {
        this.f22644a.f22611m = view;
        return this;
    }

    public g(android.content.Context context, int i3) {
        this.f22644a = new p072i.c(new android.view.ContextThemeWrapper(context, p072i.h.h(context, i3)));
        this.f22645b = i3;
    }
}
