package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;
import com.google.android.gms.internal.play_billing.M0;

public final class IncorrectFragmentationSniffFailure implements SniffFailure {
    public static final IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new IncorrectFragmentationSniffFailure(true);
    public static final IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    private IncorrectFragmentationSniffFailure(boolean z6) {
        this.fileIsFragmented = z6;
    }

    public String toString() {
        return M0.o(new StringBuilder("IncorrectFragmentation{expected="), !this.fileIsFragmented, "}");
    }
}
