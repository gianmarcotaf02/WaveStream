package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f25107b = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p103m.r f25108c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p103m.I0 f25109a;

    public static synchronized p103m.r a() {
        try {
            if (f25108c == null) {
                c();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f25108c;
    }

    public static synchronized void c() {
        if (f25108c == null) {
            p103m.r rVar = new p103m.r();
            f25108c = rVar;
            rVar.f25109a = p103m.I0.b();
            p103m.I0 i3 = f25108c.f25109a;
            Z2.C0 c9 = new Z2.C0();
            c9.f12655a = new int[]{2131230796, 2131230794, 2131230720};
            c9.f12656b = new int[]{2131230744, com.kiptv.tv.R.drawable.abc_seekbar_tick_mark_material, com.kiptv.tv.R.drawable.abc_ic_menu_share_mtrl_alpha, com.kiptv.tv.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.kiptv.tv.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.kiptv.tv.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.kiptv.tv.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c9.f12657c = new int[]{2131230793, 2131230795, 2131230737, com.kiptv.tv.R.drawable.abc_text_cursor_material, 2131230790, 2131230791, 2131230792};
            c9.f12658d = new int[]{2131230769, com.kiptv.tv.R.drawable.abc_cab_background_internal_bg, 2131230768};
            c9.f12659e = new int[]{com.kiptv.tv.R.drawable.abc_tab_indicator_material, com.kiptv.tv.R.drawable.abc_textfield_search_material};
            c9.f12660f = new int[]{com.kiptv.tv.R.drawable.abc_btn_check_material, com.kiptv.tv.R.drawable.abc_btn_radio_material, com.kiptv.tv.R.drawable.abc_btn_check_material_anim, com.kiptv.tv.R.drawable.abc_btn_radio_material_anim};
            synchronized (i3) {
                i3.f24926e = c9;
            }
        }
    }

    public static void d(android.graphics.drawable.Drawable drawable, p103m.P0 p2, int[] iArr) {
        android.graphics.PorterDuff.Mode mode = p103m.I0.f24920f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = p2.f24959b;
        if (!z6 && !p2.f24958a) {
            drawable.clearColorFilter();
            return;
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilterE = null;
        android.content.res.ColorStateList colorStateList = z6 ? (android.content.res.ColorStateList) p2.f24960c : null;
        android.graphics.PorterDuff.Mode mode2 = p2.f24958a ? (android.graphics.PorterDuff.Mode) p2.f24961d : p103m.I0.f24920f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = p103m.I0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized android.graphics.drawable.Drawable b(android.content.Context context, int i3) {
        return this.f25109a.c(context, i3);
    }
}
