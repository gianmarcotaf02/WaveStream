package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements p095l.y, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p095l.n f15646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f15647i;
    public android.widget.RadioButton j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.widget.TextView f15648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.widget.CheckBox f15649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.widget.TextView f15650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f15651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f15652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f15653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f15654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.content.Context f15656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15657t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f15658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f15659v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public android.view.LayoutInflater f15660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15661x;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        j1.l lVarS = j1.l.s(getContext(), attributeSet, h.a.f22420r, com.kiptv.tv.R.attr.listMenuViewStyle);
        this.f15654q = lVarS.l(5);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) lVarS.j;
        this.f15655r = typedArray.getResourceId(1, -1);
        this.f15657t = typedArray.getBoolean(7, false);
        this.f15656s = context;
        this.f15658u = lVarS.l(8);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.kiptv.tv.R.attr.dropDownListViewStyle, 0);
        this.f15659v = typedArrayObtainStyledAttributes.hasValue(0);
        lVarS.u();
        typedArrayObtainStyledAttributes.recycle();
    }

    private android.view.LayoutInflater getInflater() {
        if (this.f15660w == null) {
            this.f15660w = android.view.LayoutInflater.from(getContext());
        }
        return this.f15660w;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        android.widget.ImageView imageView = this.f15651n;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.f15652o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f15652o.getLayoutParams();
        rect.top = this.f15652o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p095l.y
    public final void b(p095l.n nVar) {
        boolean z6;
        int i3;
        java.lang.String string;
        boolean z9;
        this.f15646h = nVar;
        setVisibility(nVar.isVisible() ? 0 : 8);
        setTitle(nVar.f24667e);
        setCheckable(nVar.isCheckable());
        if (nVar.f24674n.o()) {
            if ((nVar.f24674n.n() ? nVar.j : nVar.f24669h) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        nVar.f24674n.n();
        if (z6) {
            p095l.n nVar2 = this.f15646h;
            if (nVar2.f24674n.o()) {
                if ((nVar2.f24674n.n() ? nVar2.j : nVar2.f24669h) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z9 = false;
            }
            i3 = z9 ? 0 : 8;
        }
        if (i3 == 0) {
            android.widget.TextView textView = this.f15650m;
            p095l.n nVar3 = this.f15646h;
            char c9 = nVar3.f24674n.n() ? nVar3.j : nVar3.f24669h;
            if (c9 == 0) {
                string = "";
            } else {
                p095l.l lVar = nVar3.f24674n;
                android.content.res.Resources resources = lVar.f24636a.getResources();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (android.view.ViewConfiguration.get(lVar.f24636a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.kiptv.tv.R.string.abc_prepend_shortcut_label));
                }
                int i9 = lVar.n() ? nVar3.f24671k : nVar3.f24670i;
                p095l.n.c(sb, i9, 65536, resources.getString(com.kiptv.tv.R.string.abc_menu_meta_shortcut_label));
                p095l.n.c(sb, i9, 4096, resources.getString(com.kiptv.tv.R.string.abc_menu_ctrl_shortcut_label));
                p095l.n.c(sb, i9, 2, resources.getString(com.kiptv.tv.R.string.abc_menu_alt_shortcut_label));
                p095l.n.c(sb, i9, 1, resources.getString(com.kiptv.tv.R.string.abc_menu_shift_shortcut_label));
                p095l.n.c(sb, i9, 4, resources.getString(com.kiptv.tv.R.string.abc_menu_sym_shortcut_label));
                p095l.n.c(sb, i9, 8, resources.getString(com.kiptv.tv.R.string.abc_menu_function_shortcut_label));
                if (c9 == '\b') {
                    sb.append(resources.getString(com.kiptv.tv.R.string.abc_menu_delete_shortcut_label));
                } else if (c9 == '\n') {
                    sb.append(resources.getString(com.kiptv.tv.R.string.abc_menu_enter_shortcut_label));
                } else if (c9 != ' ') {
                    sb.append(c9);
                } else {
                    sb.append(resources.getString(com.kiptv.tv.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f15650m.getVisibility() != i3) {
            this.f15650m.setVisibility(i3);
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.f24677q);
    }

    @Override // p095l.y
    public p095l.n getItemData() {
        return this.f15646h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f15654q);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.kiptv.tv.R.id.title);
        this.f15648k = textView;
        int i3 = this.f15655r;
        if (i3 != -1) {
            textView.setTextAppearance(this.f15656s, i3);
        }
        this.f15650m = (android.widget.TextView) findViewById(com.kiptv.tv.R.id.shortcut);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.kiptv.tv.R.id.submenuarrow);
        this.f15651n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f15658u);
        }
        this.f15652o = (android.widget.ImageView) findViewById(com.kiptv.tv.R.id.group_divider);
        this.f15653p = (android.widget.LinearLayout) findViewById(com.kiptv.tv.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i9) {
        if (this.f15647i != null && this.f15657t) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f15647i.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i3, i9);
    }

    public void setCheckable(boolean z6) {
        android.widget.CompoundButton compoundButton;
        android.view.View view;
        if (!z6 && this.j == null && this.f15649l == null) {
            return;
        }
        if ((this.f15646h.f24684x & 4) != 0) {
            if (this.j == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.kiptv.tv.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                this.j = radioButton;
                android.widget.LinearLayout linearLayout = this.f15653p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
            view = this.f15649l;
        } else {
            if (this.f15649l == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.kiptv.tv.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                this.f15649l = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f15653p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f15649l;
            view = this.j;
        }
        if (z6) {
            compoundButton.setChecked(this.f15646h.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox2 = this.f15649l;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        android.widget.RadioButton radioButton2 = this.j;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        android.widget.CompoundButton compoundButton;
        if ((this.f15646h.f24684x & 4) != 0) {
            if (this.j == null) {
                android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(com.kiptv.tv.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
                this.j = radioButton;
                android.widget.LinearLayout linearLayout = this.f15653p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
        } else {
            if (this.f15649l == null) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(com.kiptv.tv.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
                this.f15649l = checkBox;
                android.widget.LinearLayout linearLayout2 = this.f15653p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f15649l;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f15661x = z6;
        this.f15657t = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        android.widget.ImageView imageView = this.f15652o;
        if (imageView != null) {
            imageView.setVisibility((this.f15659v || !z6) ? 8 : 0);
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f15646h.f24674n.getClass();
        boolean z6 = this.f15661x;
        if (z6 || this.f15657t) {
            android.widget.ImageView imageView = this.f15647i;
            if (imageView == null && drawable == null && !this.f15657t) {
                return;
            }
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) getInflater().inflate(com.kiptv.tv.R.layout.abc_list_menu_item_icon, (android.view.ViewGroup) this, false);
                this.f15647i = imageView2;
                android.widget.LinearLayout linearLayout = this.f15653p;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f15657t) {
                this.f15647i.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView3 = this.f15647i;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f15647i.getVisibility() != 0) {
                this.f15647i.setVisibility(0);
            }
        }
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f15648k.getVisibility() != 8) {
                this.f15648k.setVisibility(8);
            }
        } else {
            this.f15648k.setText(charSequence);
            if (this.f15648k.getVisibility() != 0) {
                this.f15648k.setVisibility(0);
            }
        }
    }
}
