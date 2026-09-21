package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.http.HttpUrlEncodedKt;
import io.ktor.http.ParametersBuilder;
import io.ktor.http.ParametersKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R.\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lio/github/jan/supabase/storage/ImageTransformation;", "", "<init>", "()V", "", "width", "height", "Lh6/A;", "size", "(II)V", "cover", "contain", "fill", "", "queryString$storage_kt_release", "()Ljava/lang/String;", "queryString", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "getHeight", "setHeight", "value", "quality", "getQuality", "setQuality", "format", "Ljava/lang/String;", "getFormat", "setFormat", "(Ljava/lang/String;)V", "Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "resize", "Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "getResize", "()Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "setResize", "(Lio/github/jan/supabase/storage/ImageTransformation$Resize;)V", "Companion", "Resize", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ImageTransformation {

    public static final Companion INSTANCE = new Companion(null);
    private static final D6.g VALID_QUALITY_RANGE = new D6.g(1, 100, 1);
    private String format;
    private Integer height;
    private Integer quality;
    private Resize resize;
    private Integer width;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/storage/ImageTransformation$Companion;", "", "<init>", "()V", "LD6/g;", "VALID_QUALITY_RANGE", "LD6/g;", "getVALID_QUALITY_RANGE", "()LD6/g;", "getVALID_QUALITY_RANGE$annotations", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        @SupabaseInternal
        public static void getVALID_QUALITY_RANGE$annotations() {
        }

        public final D6.g getVALID_QUALITY_RANGE() {
            return ImageTransformation.VALID_QUALITY_RANGE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/ImageTransformation$Resize;", "", "<init>", "(Ljava/lang/String;I)V", "COVER", "CONTAIN", "FILL", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Resize {
        COVER,
        CONTAIN,
        FILL;

        private static final p126o6.a $ENTRIES = q0.t(values());

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }
    }

    public final void contain() {
        this.resize = Resize.CONTAIN;
    }

    public final void cover() {
        this.resize = Resize.COVER;
    }

    public final void fill() {
        this.resize = Resize.FILL;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getQuality() {
        return this.quality;
    }

    public final Resize getResize() {
        return this.resize;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final String queryString$storage_kt_release() {
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        Integer num = this.width;
        if (num != null) {
            parametersBuilderParametersBuilder$default.append("width", String.valueOf(num.intValue()));
        }
        Integer num2 = this.height;
        if (num2 != null) {
            parametersBuilderParametersBuilder$default.append("height", String.valueOf(num2.intValue()));
        }
        Resize resize = this.resize;
        if (resize != null) {
            String lowerCase = resize.name().toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            parametersBuilderParametersBuilder$default.append("resize", lowerCase);
        }
        Integer num3 = this.quality;
        if (num3 != null) {
            parametersBuilderParametersBuilder$default.append("quality", String.valueOf(num3.intValue()));
        }
        String str = this.format;
        if (str != null) {
            parametersBuilderParametersBuilder$default.append("format", str);
        }
        return HttpUrlEncodedKt.formUrlEncode(parametersBuilderParametersBuilder$default.build());
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setQuality(Integer num) {
        D6.g gVar = VALID_QUALITY_RANGE;
        if (num == null || !gVar.d(num.intValue())) {
            throw new IllegalArgumentException("Quality must be between 1 and 100");
        }
        this.quality = num;
    }

    public final void setResize(Resize resize) {
        this.resize = resize;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    public final void size(int width, int height) {
        this.width = Integer.valueOf(width);
        this.height = Integer.valueOf(height);
    }
}
