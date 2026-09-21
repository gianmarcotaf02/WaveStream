package p072i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import p095l.m;

public class g {

    public final c f22644a;

    public final int f22645b;

    public g(Context context) {
        this(context, h.h(context, 0));
    }

    public h create() {
        c cVar = this.f22644a;
        h hVar = new h(cVar.f22601a, this.f22645b);
        View view = cVar.f22605e;
        f fVar = hVar.f22648m;
        if (view != null) {
            fVar.f22640v = view;
        } else {
            CharSequence charSequence = cVar.f22604d;
            if (charSequence != null) {
                fVar.f22624d = charSequence;
                TextView textView = fVar.f22638t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f22603c;
            if (drawable != null) {
                fVar.f22636r = drawable;
                ImageView imageView = fVar.f22637s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f22637s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f22606f;
        if (charSequence2 != null) {
            fVar.c(-1, charSequence2, cVar.g);
        }
        CharSequence charSequence3 = cVar.f22607h;
        if (charSequence3 != null) {
            fVar.c(-2, charSequence3, cVar.f22608i);
        }
        if (cVar.f22609k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f22602b.inflate(fVar.f22643z, (ViewGroup) null);
            int i3 = cVar.f22612n ? fVar.f22616A : fVar.f22617B;
            Object obj = cVar.f22609k;
            ?? eVar = obj;
            if (obj == null) {
                eVar = new e(cVar.f22601a, i3, R.id.text1, null);
            }
            fVar.f22641w = eVar;
            fVar.f22642x = cVar.f22613o;
            if (cVar.f22610l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2182b(cVar, fVar));
            }
            if (cVar.f22612n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f22625e = alertController$RecycleListView;
        }
        View view2 = cVar.f22611m;
        if (view2 != null) {
            fVar.f22626f = view2;
            fVar.g = false;
        }
        hVar.setCancelable(true);
        hVar.setCanceledOnTouchOutside(true);
        hVar.setOnCancelListener(null);
        hVar.setOnDismissListener(null);
        m mVar = cVar.j;
        if (mVar != null) {
            hVar.setOnKeyListener(mVar);
        }
        return hVar;
    }

    public Context getContext() {
        return this.f22644a.f22601a;
    }

    public g setNegativeButton(int i3, DialogInterface.OnClickListener onClickListener) {
        c cVar = this.f22644a;
        cVar.f22607h = cVar.f22601a.getText(i3);
        cVar.f22608i = onClickListener;
        return this;
    }

    public g setPositiveButton(int i3, DialogInterface.OnClickListener onClickListener) {
        c cVar = this.f22644a;
        cVar.f22606f = cVar.f22601a.getText(i3);
        cVar.g = onClickListener;
        return this;
    }

    public g setTitle(CharSequence charSequence) {
        this.f22644a.f22604d = charSequence;
        return this;
    }

    public g setView(View view) {
        this.f22644a.f22611m = view;
        return this;
    }

    public g(Context context, int i3) {
        this.f22644a = new c(new ContextThemeWrapper(context, h.h(context, i3)));
        this.f22645b = i3;
    }
}
