package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final java.lang.String TAG = "MotionPhotoXmpParser";
    private static final java.lang.String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final java.lang.String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final java.lang.String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    public static boolean isMotionPhotoXmp(java.lang.String str) {
        if (str == null) {
            return false;
        }
        for (java.lang.String str2 : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            if (str.contains(str2 + "=\"1\"")) {
                return true;
            }
        }
        return false;
    }

    public static androidx.media3.extractor.jpeg.MotionPhotoDescription parse(java.lang.String str) {
        try {
            return parseInternal(str);
        } catch (androidx.media3.common.ParserException | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static androidx.media3.extractor.jpeg.MotionPhotoDescription parseInternal(java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new java.io.StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        p076i4.AbstractC2186b0 motionPhotoV1Directory = p076i4.S0.f22832l;
        long motionPhotoPresentationTimestampUsFromDescription = androidx.media3.common.C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (parseMotionPhotoFlagFromDescription(xmlPullParserNewPullParser)) {
                    motionPhotoPresentationTimestampUsFromDescription = parseMotionPhotoPresentationTimestampUsFromDescription(xmlPullParserNewPullParser);
                    motionPhotoV1Directory = parseMicroVideoOffsetFromDescription(xmlPullParserNewPullParser);
                }
                return null;
            }
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                motionPhotoV1Directory = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "Container", "Item");
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                motionPhotoV1Directory = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (!motionPhotoV1Directory.isEmpty()) {
            return new androidx.media3.extractor.jpeg.MotionPhotoDescription(motionPhotoPresentationTimestampUsFromDescription, motionPhotoV1Directory);
        }
        return null;
    }

    private static p076i4.AbstractC2186b0 parseMicroVideoOffsetFromDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return p076i4.AbstractC2186b0.z(new androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem(androidx.media3.common.MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem(androidx.media3.common.MimeTypes.VIDEO_MP4, "MotionPhoto", java.lang.Long.parseLong(attributeValue), 0L));
            }
        }
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    private static boolean parseMotionPhotoFlagFromDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return java.lang.Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = java.lang.Long.parseLong(attributeValue);
                return j == -1 ? androidx.media3.common.C.TIME_UNSET : j;
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private static p076i4.AbstractC2186b0 parseMotionPhotoV1Directory(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        java.lang.String strO = p121o0.p.o(str, ":Item");
        java.lang.String strO2 = p121o0.p.o(str, ":Directory");
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, strO)) {
                java.lang.String strO3 = p121o0.p.o(str2, ":Mime");
                java.lang.String strO4 = p121o0.p.o(str2, ":Semantic");
                java.lang.String strO5 = p121o0.p.o(str2, ":Length");
                java.lang.String strO6 = p121o0.p.o(str2, ":Padding");
                java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, strO3);
                java.lang.String attributeValue2 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, strO4);
                java.lang.String attributeValue3 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, strO5);
                java.lang.String attributeValue4 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, strO6);
                if (attributeValue == null || attributeValue2 == null) {
                    return p076i4.S0.f22832l;
                }
                yS.c(new androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? java.lang.Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? java.lang.Long.parseLong(attributeValue4) : 0L));
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, strO2));
        return yS.f();
    }
}
