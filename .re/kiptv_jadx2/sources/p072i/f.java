package p072i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kiptv.tv.R;
import h.a;
import java.lang.ref.WeakReference;

public final class f {

    public final int f22616A;

    public final int f22617B;

    public final boolean f22618C;

    public final d f22619D;

    public final Context f22621a;

    public final h f22622b;

    public final Window f22623c;

    public CharSequence f22624d;

    public AlertController$RecycleListView f22625e;

    public View f22626f;

    public Button f22627h;

    public CharSequence f22628i;
    public Message j;

    public Button f22629k;

    public CharSequence f22630l;

    public Message f22631m;

    public Button f22632n;

    public CharSequence f22633o;

    public Message f22634p;

    public NestedScrollView f22635q;

    public Drawable f22636r;

    public ImageView f22637s;

    public TextView f22638t;

    public TextView f22639u;

    public View f22640v;

    public ListAdapter f22641w;
    public final int y;

    public final int f22643z;
    public boolean g = false;

    public int f22642x = -1;

    public final ViewOnClickListenerC2181a f22620E = new ViewOnClickListenerC2181a(0, this);

    public f(Context context, h hVar, Window window) {
        this.f22621a = context;
        this.f22622b = hVar;
        this.f22623c = window;
        d dVar = new d();
        dVar.f22615b = new WeakReference(hVar);
        this.f22619D = dVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f22409e, R.attr.alertDialogStyle, 0);
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

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i3, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f22619D.obtainMessage(i3, onClickListener) : null;
        if (i3 == -3) {
            this.f22633o = charSequence;
            this.f22634p = messageObtainMessage;
        } else if (i3 == -2) {
            this.f22630l = charSequence;
            this.f22631m = messageObtainMessage;
        } else {
            if (i3 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f22628i = charSequence;
            this.j = messageObtainMessage;
        }
    }
}
