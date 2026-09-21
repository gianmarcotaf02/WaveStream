package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
public interface EbmlProcessor {
    public static final int ELEMENT_TYPE_BINARY = 4;
    public static final int ELEMENT_TYPE_FLOAT = 5;
    public static final int ELEMENT_TYPE_MASTER = 1;
    public static final int ELEMENT_TYPE_STRING = 3;
    public static final int ELEMENT_TYPE_UNKNOWN = 0;
    public static final int ELEMENT_TYPE_UNSIGNED_INT = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    void binaryElement(int i3, int i9, androidx.media3.extractor.ExtractorInput extractorInput);

    void endMasterElement(int i3);

    void floatElement(int i3, double d4);

    int getElementType(int i3);

    void integerElement(int i3, long j);

    boolean isLevel1Element(int i3);

    void startMasterElement(int i3, long j, long j9);

    void stringElement(int i3, java.lang.String str);
}
