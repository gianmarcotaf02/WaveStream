package g1;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

public class n extends m {
    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        S.y yVar = this.f21832b;
        if (yVar != null) {
            return yVar.commitContent(inputContentInfo, i3, bundle);
        }
        return false;
    }
}
