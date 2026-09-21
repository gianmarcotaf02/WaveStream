package p095l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class i extends BaseAdapter {

    public final l f24630a;

    public int f24631b = -1;

    public boolean f24632c;

    public final boolean f24633d;

    public final LayoutInflater f24634e;

    public final int f24635f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z6, int i3) {
        this.f24633d = z6;
        this.f24634e = layoutInflater;
        this.f24630a = lVar;
        this.f24635f = i3;
        a();
    }

    public final void a() {
        l lVar = this.f24630a;
        n nVar = lVar.f24655v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((n) arrayList.get(i3)) == nVar) {
                    this.f24631b = i3;
                    return;
                }
            }
        }
        this.f24631b = -1;
    }

    @Override
    public final n getItem(int i3) {
        ArrayList arrayListL;
        l lVar = this.f24630a;
        if (this.f24633d) {
            lVar.i();
            arrayListL = lVar.j;
        } else {
            arrayListL = lVar.l();
        }
        int i9 = this.f24631b;
        if (i9 >= 0 && i3 >= i9) {
            i3++;
        }
        return (n) arrayListL.get(i3);
    }

    @Override
    public final int getCount() {
        ArrayList arrayListL;
        l lVar = this.f24630a;
        if (this.f24633d) {
            lVar.i();
            arrayListL = lVar.j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f24631b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override
    public final long getItemId(int i3) {
        return i3;
    }

    @Override
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f24634e.inflate(this.f24635f, viewGroup, false);
        }
        int i9 = getItem(i3).f24664b;
        int i10 = i3 - 1;
        int i11 = i10 >= 0 ? getItem(i10).f24664b : i9;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f24630a.m() && i9 != i11) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        y yVar = (y) view;
        if (this.f24632c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i3));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
