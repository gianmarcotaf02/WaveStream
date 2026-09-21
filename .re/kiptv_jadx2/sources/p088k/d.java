package p088k;

import N6.i0;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p095l.A;

public final class d extends ActionMode {

    public final Context f24351a;

    public final i0 f24352b;

    public d(Context context, i0 i0Var) {
        this.f24351a = context;
        this.f24352b = i0Var;
    }

    @Override
    public final void finish() {
        this.f24352b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f24352b.c();
    }

    @Override
    public final Menu getMenu() {
        return new A(this.f24351a, this.f24352b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f24352b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f24352b.g();
    }

    @Override
    public final Object getTag() {
        return this.f24352b.j;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f24352b.h();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f24352b.f7399i;
    }

    @Override
    public final void invalidate() {
        this.f24352b.i();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f24352b.j();
    }

    @Override
    public final void setCustomView(View view) {
        this.f24352b.l(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f24352b.o(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f24352b.j = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f24352b.q(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z6) {
        this.f24352b.r(z6);
    }

    @Override
    public final void setSubtitle(int i3) {
        this.f24352b.n(i3);
    }

    @Override
    public final void setTitle(int i3) {
        this.f24352b.p(i3);
    }
}
