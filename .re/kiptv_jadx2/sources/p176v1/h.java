package p176v1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class h {

    public final ColorStateList f29131a;

    public final Configuration f29132b;

    public final int f29133c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f29131a = colorStateList;
        this.f29132b = configuration;
        this.f29133c = theme == null ? 0 : theme.hashCode();
    }
}
