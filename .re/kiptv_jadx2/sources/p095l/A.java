package p095l;

import R0.AbstractC0815c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p136q.S;
import p197y1.a;

public class A extends AbstractC0815c implements Menu {

    public final l f24559c;

    public A(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24559c = lVar;
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return i(this.f24559c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i3, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f24559c.addIntentOptions(i3, i9, i10, componentName, intentArr, intent, i11, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = i(menuItemArr2[i12]);
            }
        }
        return iAddIntentOptions;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f24559c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        S s9 = (S) this.f8883b;
        if (s9 != null) {
            s9.clear();
        }
        this.f24559c.clear();
    }

    @Override
    public final void close() {
        this.f24559c.close();
    }

    @Override
    public final MenuItem findItem(int i3) {
        return i(this.f24559c.findItem(i3));
    }

    @Override
    public final MenuItem getItem(int i3) {
        return i(this.f24559c.getItem(i3));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f24559c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.f24559c.isShortcutKey(i3, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i3, int i9) {
        return this.f24559c.performIdentifierAction(i3, i9);
    }

    @Override
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i9) {
        return this.f24559c.performShortcut(i3, keyEvent, i9);
    }

    @Override
    public final void removeGroup(int i3) {
        if (((S) this.f8883b) != null) {
            int i9 = 0;
            while (true) {
                S s9 = (S) this.f8883b;
                if (i9 >= s9.j) {
                    break;
                }
                if (((a) s9.e(i9)).getGroupId() == i3) {
                    ((S) this.f8883b).g(i9);
                    i9--;
                }
                i9++;
            }
        }
        this.f24559c.removeGroup(i3);
    }

    @Override
    public final void removeItem(int i3) {
        if (((S) this.f8883b) != null) {
            int i9 = 0;
            while (true) {
                S s9 = (S) this.f8883b;
                if (i9 >= s9.j) {
                    break;
                }
                if (((a) s9.e(i9)).getItemId() == i3) {
                    ((S) this.f8883b).g(i9);
                    break;
                }
                i9++;
            }
        }
        this.f24559c.removeItem(i3);
    }

    @Override
    public final void setGroupCheckable(int i3, boolean z6, boolean z9) {
        this.f24559c.setGroupCheckable(i3, z6, z9);
    }

    @Override
    public final void setGroupEnabled(int i3, boolean z6) {
        this.f24559c.setGroupEnabled(i3, z6);
    }

    @Override
    public final void setGroupVisible(int i3, boolean z6) {
        this.f24559c.setGroupVisible(i3, z6);
    }

    @Override
    public final void setQwertyMode(boolean z6) {
        this.f24559c.setQwertyMode(z6);
    }

    @Override
    public final int size() {
        return this.f24559c.size();
    }

    @Override
    public final SubMenu addSubMenu(int i3) {
        return this.f24559c.addSubMenu(i3);
    }

    @Override
    public final MenuItem add(int i3) {
        return i(this.f24559c.add(i3));
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i9, int i10, CharSequence charSequence) {
        return this.f24559c.addSubMenu(i3, i9, i10, charSequence);
    }

    @Override
    public final MenuItem add(int i3, int i9, int i10, CharSequence charSequence) {
        return i(this.f24559c.a(i3, i9, i10, charSequence));
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i9, int i10, int i11) {
        return this.f24559c.addSubMenu(i3, i9, i10, i11);
    }

    @Override
    public final MenuItem add(int i3, int i9, int i10, int i11) {
        return i(this.f24559c.add(i3, i9, i10, i11));
    }
}
