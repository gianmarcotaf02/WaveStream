package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class H implements p103m.N, android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p072i.h f24915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p103m.I f24916i;
    public java.lang.CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p103m.O f24917k;

    public H(p103m.O o8) {
        this.f24917k = o8;
    }

    @Override // p103m.N
    public final boolean a() {
        p072i.h hVar = this.f24915h;
        if (hVar != null) {
            return hVar.isShowing();
        }
        return false;
    }

    @Override // p103m.N
    public final int b() {
        return 0;
    }

    @Override // p103m.N
    public final void c(int i3) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p103m.N
    public final java.lang.CharSequence d() {
        return this.j;
    }

    @Override // p103m.N
    public final void dismiss() {
        p072i.h hVar = this.f24915h;
        if (hVar != null) {
            hVar.dismiss();
            this.f24915h = null;
        }
    }

    @Override // p103m.N
    public final android.graphics.drawable.Drawable f() {
        return null;
    }

    @Override // p103m.N
    public final void i(java.lang.CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // p103m.N
    public final void j(android.graphics.drawable.Drawable drawable) {
        android.util.Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p103m.N
    public final void k(int i3) {
        android.util.Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p103m.N
    public final void l(int i3) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p103m.N
    public final void m(int i3, int i9) {
        if (this.f24916i == null) {
            return;
        }
        p103m.O o8 = this.f24917k;
        p072i.g gVar = new p072i.g(o8.getPopupContext());
        java.lang.CharSequence charSequence = this.j;
        if (charSequence != null) {
            gVar.setTitle(charSequence);
        }
        p103m.I i10 = this.f24916i;
        int selectedItemPosition = o8.getSelectedItemPosition();
        p072i.c cVar = gVar.f22644a;
        cVar.f22609k = i10;
        cVar.f22610l = this;
        cVar.f22613o = selectedItemPosition;
        cVar.f22612n = true;
        p072i.h hVarCreate = gVar.create();
        this.f24915h = hVarCreate;
        androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView = hVarCreate.f22648m.f22625e;
        alertController$RecycleListView.setTextDirection(i3);
        alertController$RecycleListView.setTextAlignment(i9);
        this.f24915h.show();
    }

    @Override // p103m.N
    public final int n() {
        return 0;
    }

    @Override // p103m.N
    public final void o(android.widget.ListAdapter listAdapter) {
        this.f24916i = (p103m.I) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
        p103m.O o8 = this.f24917k;
        o8.setSelection(i3);
        if (o8.getOnItemClickListener() != null) {
            o8.performItemClick(null, i3, this.f24916i.getItemId(i3));
        }
        dismiss();
    }
}
