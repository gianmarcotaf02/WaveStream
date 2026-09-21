package io.ktor.util;

import android.media.AudioFocusRequest;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.nio.file.InvalidPathException;

public abstract class c {
    public static AudioFocusRequest.Builder a() {
        return new AudioFocusRequest.Builder(1);
    }

    public static AutofillManager d(Object obj) {
        return (AutofillManager) obj;
    }

    public static AutofillValue e(Object obj) {
        return (AutofillValue) obj;
    }

    public static Class i() {
        return AutofillManager.class;
    }

    public static InvalidPathException k(String str, String str2) {
        return new InvalidPathException(str, str2);
    }
}
