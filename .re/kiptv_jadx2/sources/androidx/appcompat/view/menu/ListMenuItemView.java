package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.kiptv.tv.R;
import h.a;
import j1.l;
import p095l.n;
import p095l.y;

public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    public n f15646h;

    public ImageView f15647i;
    public RadioButton j;

    public TextView f15648k;

    public CheckBox f15649l;

    public TextView f15650m;

    public ImageView f15651n;

    public ImageView f15652o;

    public LinearLayout f15653p;

    public final Drawable f15654q;

    public final int f15655r;

    public final Context f15656s;

    public boolean f15657t;

    public final Drawable f15658u;

    public final boolean f15659v;

    public LayoutInflater f15660w;

    public boolean f15661x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l lVarS = l.s(getContext(), attributeSet, a.f22420r, R.attr.listMenuViewStyle);
        this.f15654q = lVarS.l(5);
        TypedArray typedArray = (TypedArray) lVarS.j;
        this.f15655r = typedArray.getResourceId(1, -1);
        this.f15657t = typedArray.getBoolean(7, false);
        this.f15656s = context;
        this.f15658u = lVarS.l(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f15659v = typedArrayObtainStyledAttributes.hasValue(0);
        lVarS.u();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f15660w == null) {
            this.f15660w = LayoutInflater.from(getContext());
        }
        return this.f15660w;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f15651n;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f15652o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15652o.getLayoutParams();
        rect.top = this.f15652o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override
    public final void b(n nVar) {
        boolean z6;
        int i3;
        String string;
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
            n nVar2 = this.f15646h;
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
            TextView textView = this.f15650m;
            n nVar3 = this.f15646h;
            char c9 = nVar3.f24674n.n() ? nVar3.j : nVar3.f24669h;
            if (c9 == 0) {
                string = "";
            } else {
                p095l.l lVar = nVar3.f24674n;
                Resources resources = lVar.f24636a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(lVar.f24636a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i9 = lVar.n() ? nVar3.f24671k : nVar3.f24670i;
                n.c(sb, i9, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                n.c(sb, i9, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                n.c(sb, i9, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                n.c(sb, i9, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                n.c(sb, i9, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                n.c(sb, i9, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c9 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c9 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c9 != ' ') {
                    sb.append(c9);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
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

    @Override
    public n getItemData() {
        return this.f15646h;
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f15654q);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f15648k = textView;
        int i3 = this.f15655r;
        if (i3 != -1) {
            textView.setTextAppearance(this.f15656s, i3);
        }
        this.f15650m = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f15651n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f15658u);
        }
        this.f15652o = (ImageView) findViewById(R.id.group_divider);
        this.f15653p = (LinearLayout) findViewById(R.id.content);
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        if (this.f15647i != null && this.f15657t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f15647i.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i3, i9);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.j == null && this.f15649l == null) {
            return;
        }
        if ((this.f15646h.f24684x & 4) != 0) {
            if (this.j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.j = radioButton;
                LinearLayout linearLayout = this.f15653p;
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
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f15649l = checkBox;
                LinearLayout linearLayout2 = this.f15653p;
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
        CheckBox checkBox2 = this.f15649l;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.j;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f15646h.f24684x & 4) != 0) {
            if (this.j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.j = radioButton;
                LinearLayout linearLayout = this.f15653p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
        } else {
            if (this.f15649l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f15649l = checkBox;
                LinearLayout linearLayout2 = this.f15653p;
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
        ImageView imageView = this.f15652o;
        if (imageView != null) {
            imageView.setVisibility((this.f15659v || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f15646h.f24674n.getClass();
        boolean z6 = this.f15661x;
        if (z6 || this.f15657t) {
            ImageView imageView = this.f15647i;
            if (imageView == null && drawable == null && !this.f15657t) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f15647i = imageView2;
                LinearLayout linearLayout = this.f15653p;
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
            ImageView imageView3 = this.f15647i;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f15647i.getVisibility() != 0) {
                this.f15647i.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
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
