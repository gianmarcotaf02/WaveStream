package D;

import com.kiptv.core.model.ContentTypeSettings;

public final class h implements p194x6.j {

    public final int f1691h;

    public final Object f1692i;

    public h(int i3, Object obj) {
        this.f1691h = i3;
        this.f1692i = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1691h) {
            case 0:
                ((Integer) obj).intValue();
                return this.f1692i;
            default:
                ContentTypeSettings it = (ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return ContentTypeSettings.a(it, null, null, this.f1692i, null, "custom", null, null, null, null, null, null, null, null, null, 16363);
        }
    }
}
