package p103m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p072i.c;
import p072i.g;
import p072i.h;

public final class H implements N, DialogInterface.OnClickListener {

    public h f24915h;

    public I f24916i;
    public CharSequence j;

    public final O f24917k;

    public H(O o8) {
        this.f24917k = o8;
    }

    @Override
    public final boolean a() {
        h hVar = this.f24915h;
        if (hVar != null) {
            return hVar.isShowing();
        }
        return false;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final void c(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final CharSequence d() {
        return this.j;
    }

    @Override
    public final void dismiss() {
        h hVar = this.f24915h;
        if (hVar != null) {
            hVar.dismiss();
            this.f24915h = null;
        }
    }

    @Override
    public final Drawable f() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i3) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i3, int i9) {
        if (this.f24916i == null) {
            return;
        }
        O o8 = this.f24917k;
        g gVar = new g(o8.getPopupContext());
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            gVar.setTitle(charSequence);
        }
        I i10 = this.f24916i;
        int selectedItemPosition = o8.getSelectedItemPosition();
        c cVar = gVar.f22644a;
        cVar.f22609k = i10;
        cVar.f22610l = this;
        cVar.f22613o = selectedItemPosition;
        cVar.f22612n = true;
        h hVarCreate = gVar.create();
        this.f24915h = hVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = hVarCreate.f22648m.f22625e;
        alertController$RecycleListView.setTextDirection(i3);
        alertController$RecycleListView.setTextAlignment(i9);
        this.f24915h.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f24916i = (I) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        O o8 = this.f24917k;
        o8.setSelection(i3);
        if (o8.getOnItemClickListener() != null) {
            o8.performItemClick(null, i3, this.f24916i.getItemId(i3));
        }
        dismiss();
    }
}
