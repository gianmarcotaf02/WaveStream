package androidx.media3.common;

import android.view.ViewGroup;
import com.google.common.util.concurrent.J;

public interface ViewProvider {
    J getView(ViewGroup viewGroup);
}
