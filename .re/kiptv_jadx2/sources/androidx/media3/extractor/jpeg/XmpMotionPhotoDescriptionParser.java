package androidx.media3.extractor.jpeg;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.XmlPullParserUtil;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Y;
import p076i4.Z;
import p121o0.p;

final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    public static boolean isMotionPhotoXmp(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            if (str.contains(str2 + "=\"1\"")) {
                return true;
            }
        }
        return false;
    }

    public static MotionPhotoDescription parse(String str) {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static MotionPhotoDescription parseInternal(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        Z z6 = AbstractC2186b0.f22868i;
        AbstractC2186b0 motionPhotoV1Directory = S0.f22832l;
        long motionPhotoPresentationTimestampUsFromDescription = C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (parseMotionPhotoFlagFromDescription(xmlPullParserNewPullParser)) {
                    motionPhotoPresentationTimestampUsFromDescription = parseMotionPhotoPresentationTimestampUsFromDescription(xmlPullParserNewPullParser);
                    motionPhotoV1Directory = parseMicroVideoOffsetFromDescription(xmlPullParserNewPullParser);
                }
                return null;
            }
            if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                motionPhotoV1Directory = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                motionPhotoV1Directory = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (!motionPhotoV1Directory.isEmpty()) {
            return new MotionPhotoDescription(motionPhotoPresentationTimestampUsFromDescription, motionPhotoV1Directory);
        }
        return null;
    }

    private static AbstractC2186b0 parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return AbstractC2186b0.z(new MotionPhotoDescription.ContainerItem(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        Z z6 = AbstractC2186b0.f22868i;
        return S0.f22832l;
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = Long.parseLong(attributeValue);
                return j == -1 ? C.TIME_UNSET : j;
            }
        }
        return C.TIME_UNSET;
    }

    private static AbstractC2186b0 parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        Y yS = AbstractC2186b0.s();
        String strO = p.o(str, ":Item");
        String strO2 = p.o(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, strO)) {
                String strO3 = p.o(str2, ":Mime");
                String strO4 = p.o(str2, ":Semantic");
                String strO5 = p.o(str2, ":Length");
                String strO6 = p.o(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO6);
                if (attributeValue == null || attributeValue2 == null) {
                    return S0.f22832l;
                }
                yS.c(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, strO2));
        return yS.f();
    }
}
