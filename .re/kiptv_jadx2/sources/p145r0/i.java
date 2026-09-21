package p145r0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

public final class i extends AutofillManager$AutofillCallback {

    public static final i f26687a = new i();

    public final void onAutofillEvent(View view, int i3, int i9) {
        String str;
        super.onAutofillEvent(view, i3, i9);
        if (i9 == 1) {
            str = "Autofill popup was shown.";
        } else if (i9 != 2) {
            str = i9 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
