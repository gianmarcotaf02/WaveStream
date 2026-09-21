package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface EbmlProcessor {
    public static final int ELEMENT_TYPE_BINARY = 4;
    public static final int ELEMENT_TYPE_FLOAT = 5;
    public static final int ELEMENT_TYPE_MASTER = 1;
    public static final int ELEMENT_TYPE_STRING = 3;
    public static final int ELEMENT_TYPE_UNKNOWN = 0;
    public static final int ELEMENT_TYPE_UNSIGNED_INT = 2;

    @Target({java.lang.annotation.ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    void binaryElement(int i3, int i9, ExtractorInput extractorInput);

    void endMasterElement(int i3);

    void floatElement(int i3, double d4);

    int getElementType(int i3);

    void integerElement(int i3, long j);

    boolean isLevel1Element(int i3);

    void startMasterElement(int i3, long j, long j9);

    void stringElement(int i3, String str);
}
