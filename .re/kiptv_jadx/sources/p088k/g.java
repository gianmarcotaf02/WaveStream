package p088k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends android.view.MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.lang.Class[] f24384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f24385f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f24386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f24387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.Context f24388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f24389d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        f24384e = clsArr;
        f24385f = clsArr;
    }

    public g(android.content.Context context) {
        super(context);
        this.f24388c = context;
        java.lang.Object[] objArr = {context};
        this.f24386a = objArr;
        this.f24387b = objArr;
    }

    public static java.lang.Object a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [k.g] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(android.content.res.XmlResourceParser xmlResourceParser, android.util.AttributeSet attributeSet, android.view.Menu menu) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        ?? r9;
        int i3;
        ?? r10;
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        p088k.f fVar = new p088k.f(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r9 = 1;
            i3 = 2;
            if (eventType == 2) {
                java.lang.String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z6 = false;
        boolean z9 = false;
        java.lang.String str = null;
        while (!z6) {
            if (eventType == r9) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType == i3) {
                if (!z9) {
                    java.lang.String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    p088k.g gVar = fVar.f24360E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = gVar.f24388c.obtainStyledAttributes(attributeSet, h.a.f22418p);
                        fVar.f24362b = ObtainStyledAttributes.getResourceId(r9, 0);
                        fVar.f24363c = ObtainStyledAttributes.getInt(3, 0);
                        fVar.f24364d = ObtainStyledAttributes.getInt(4, 0);
                        fVar.f24365e = ObtainStyledAttributes.getInt(5, 0);
                        fVar.f24366f = ObtainStyledAttributes.getBoolean(2, r9);
                        fVar.g = ObtainStyledAttributes.getBoolean(0, r9);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        android.content.Context context = gVar.f24388c;
                        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22419q);
                        fVar.f24368i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        fVar.j = (typedArrayObtainStyledAttributes.getInt(5, fVar.f24363c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, fVar.f24364d) & io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);
                        fVar.f24369k = typedArrayObtainStyledAttributes.getText(7);
                        fVar.f24370l = typedArrayObtainStyledAttributes.getText(8);
                        fVar.f24371m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        java.lang.String string = typedArrayObtainStyledAttributes.getString(9);
                        fVar.f24372n = string == null ? (char) 0 : string.charAt(0);
                        fVar.f24373o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(10);
                        fVar.f24374p = string2 == null ? (char) 0 : string2.charAt(0);
                        fVar.f24375q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            fVar.f24376r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            fVar.f24376r = fVar.f24365e;
                        }
                        fVar.f24377s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        fVar.f24378t = typedArrayObtainStyledAttributes.getBoolean(4, fVar.f24366f);
                        fVar.f24379u = typedArrayObtainStyledAttributes.getBoolean(1, fVar.g);
                        fVar.f24380v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        fVar.y = typedArrayObtainStyledAttributes.getString(12);
                        fVar.f24381w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        fVar.f24382x = typedArrayObtainStyledAttributes.getString(15);
                        java.lang.String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z10 = string3 != null;
                        if (z10 && fVar.f24381w == 0 && fVar.f24382x == null) {
                            fVar.f24383z = (p095l.o) fVar.a(string3, f24385f, gVar.f24387b);
                        } else {
                            if (z10) {
                                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            fVar.f24383z = null;
                        }
                        fVar.f24356A = typedArrayObtainStyledAttributes.getText(17);
                        fVar.f24357B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            fVar.f24359D = p103m.AbstractC2569i0.b(typedArrayObtainStyledAttributes.getInt(19, -1), fVar.f24359D);
                        } else {
                            fVar.f24359D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = com.google.common.util.concurrent.AbstractC1903s.x(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            fVar.f24358C = colorStateList;
                        } else {
                            fVar.f24358C = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        fVar.f24367h = false;
                        xmlResourceParser = xmlResourceParser;
                        r10 = 1;
                    } else if (name2.equals("menu")) {
                        r10 = 1;
                        fVar.f24367h = true;
                        android.view.SubMenu subMenuAddSubMenu = fVar.f24361a.addSubMenu(fVar.f24362b, fVar.f24368i, fVar.j, fVar.f24369k);
                        fVar.b(subMenuAddSubMenu.getItem());
                        xmlResourceParser = xmlResourceParser;
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlResourceParser = xmlResourceParser;
                        r10 = 1;
                        str = name2;
                        z9 = true;
                    }
                }
                r10 = r9;
                z6 = z6;
            } else if (eventType != 3) {
                r10 = r9;
                z6 = z6;
            } else {
                java.lang.String name3 = xmlResourceParser.getName();
                if (z9 && name3.equals(str)) {
                    xmlResourceParser = xmlResourceParser;
                    r10 = r9;
                    z9 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        fVar.f24362b = 0;
                        fVar.f24363c = 0;
                        fVar.f24364d = 0;
                        fVar.f24365e = 0;
                        fVar.f24366f = r9;
                        fVar.g = r9;
                    } else if (name3.equals("item")) {
                        if (!fVar.f24367h) {
                            p095l.o oVar = fVar.f24383z;
                            if (oVar == null || !oVar.f24687b.hasSubMenu()) {
                                fVar.f24367h = r9;
                                fVar.b(fVar.f24361a.add(fVar.f24362b, fVar.f24368i, fVar.j, fVar.f24369k));
                            } else {
                                fVar.f24367h = r9;
                                fVar.b(fVar.f24361a.addSubMenu(fVar.f24362b, fVar.f24368i, fVar.j, fVar.f24369k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r11 = r9;
                        z6 = r11 == true ? 1 : 0;
                        r10 = r11;
                    }
                    r10 = r9;
                    z6 = z6;
                }
            }
            eventType = xmlResourceParser.next();
            r9 = r10;
            i3 = 2;
            z6 = z6;
            z9 = z9;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, android.view.Menu menu) {
        if (!(menu instanceof p095l.l)) {
            super.inflate(i3, menu);
            return;
        }
        android.content.res.XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f24388c.getResources().getLayout(i3);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(layout);
                if (menu instanceof p095l.l) {
                    p095l.l lVar = (p095l.l) menu;
                    if (!lVar.f24649p) {
                        lVar.w();
                        z6 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((p095l.l) menu).v();
                }
                layout.close();
            } catch (java.io.IOException e6) {
                throw new android.view.InflateException("Error inflating menu XML", e6);
            } catch (org.xmlpull.v1.XmlPullParserException e9) {
                throw new android.view.InflateException("Error inflating menu XML", e9);
            }
        } catch (java.lang.Throwable th) {
            if (z6) {
                ((p095l.l) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
