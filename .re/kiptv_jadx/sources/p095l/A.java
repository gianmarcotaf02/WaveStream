package p095l;

/* JADX INFO: loaded from: classes.dex */
public class A extends R0.AbstractC0815c implements android.view.Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p095l.l f24559c;

    public A(android.content.Context context, p095l.l lVar) {
        super(context);
        if (lVar == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24559c = lVar;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return i(this.f24559c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i9, int i10, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i11, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f24559c.addIntentOptions(i3, i9, i10, componentName, intentArr, intent, i11, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = i(menuItemArr2[i12]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return this.f24559c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        p136q.S s9 = (p136q.S) this.f8883b;
        if (s9 != null) {
            s9.clear();
        }
        this.f24559c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f24559c.close();
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i3) {
        return i(this.f24559c.findItem(i3));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i3) {
        return i(this.f24559c.getItem(i3));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f24559c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, android.view.KeyEvent keyEvent) {
        return this.f24559c.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i9) {
        return this.f24559c.performIdentifierAction(i3, i9);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, android.view.KeyEvent keyEvent, int i9) {
        return this.f24559c.performShortcut(i3, keyEvent, i9);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        if (((p136q.S) this.f8883b) != null) {
            int i9 = 0;
            while (true) {
                p136q.S s9 = (p136q.S) this.f8883b;
                if (i9 >= s9.j) {
                    break;
                }
                if (((p197y1.a) s9.e(i9)).getGroupId() == i3) {
                    ((p136q.S) this.f8883b).g(i9);
                    i9--;
                }
                i9++;
            }
        }
        this.f24559c.removeGroup(i3);
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        if (((p136q.S) this.f8883b) != null) {
            int i9 = 0;
            while (true) {
                p136q.S s9 = (p136q.S) this.f8883b;
                if (i9 >= s9.j) {
                    break;
                }
                if (((p197y1.a) s9.e(i9)).getItemId() == i3) {
                    ((p136q.S) this.f8883b).g(i9);
                    break;
                }
                i9++;
            }
        }
        this.f24559c.removeItem(i3);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z6, boolean z9) {
        this.f24559c.setGroupCheckable(i3, z6, z9);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z6) {
        this.f24559c.setGroupEnabled(i3, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z6) {
        this.f24559c.setGroupVisible(i3, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f24559c.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f24559c.size();
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i3) {
        return this.f24559c.addSubMenu(i3);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i3) {
        return i(this.f24559c.add(i3));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i3, int i9, int i10, java.lang.CharSequence charSequence) {
        return this.f24559c.addSubMenu(i3, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i3, int i9, int i10, java.lang.CharSequence charSequence) {
        return i(this.f24559c.a(i3, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i3, int i9, int i10, int i11) {
        return this.f24559c.addSubMenu(i3, i9, i10, i11);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i3, int i9, int i10, int i11) {
        return i(this.f24559c.add(i3, i9, i10, i11));
    }
}
