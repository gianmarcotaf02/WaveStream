package p088k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.kiptv.tv.R;

public final class b extends ContextWrapper {

    public int f24341a;

    public Resources.Theme f24342b;

    public LayoutInflater f24343c;

    public Resources f24344d;

    public b(Context context, int i3) {
        super(context);
        this.f24341a = i3;
    }

    public final void a() {
        if (this.f24342b == null) {
            this.f24342b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f24342b.setTo(theme);
            }
        }
        this.f24342b.applyStyle(this.f24341a, true);
    }

    @Override
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    public final Resources getResources() {
        if (this.f24344d == null) {
            this.f24344d = super.getResources();
        }
        return this.f24344d;
    }

    @Override
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f24343c == null) {
            this.f24343c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f24343c;
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f24342b;
        if (theme != null) {
            return theme;
        }
        if (this.f24341a == 0) {
            this.f24341a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f24342b;
    }

    @Override
    public final void setTheme(int i3) {
        if (this.f24341a != i3) {
            this.f24341a = i3;
            a();
        }
    }
}
