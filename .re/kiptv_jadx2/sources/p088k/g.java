package p088k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.common.util.concurrent.AbstractC1903s;
import h.a;
import io.ktor.network.sockets.DatagramKt;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p095l.l;
import p095l.o;
import p103m.AbstractC2569i0;

public final class g extends MenuInflater {

    public static final Class[] f24384e;

    public static final Class[] f24385f;

    public final Object[] f24386a;

    public final Object[] f24387b;

    public final Context f24388c;

    public Object f24389d;

    static {
        Class[] clsArr = {Context.class};
        f24384e = clsArr;
        f24385f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f24388c = context;
        Object[] objArr = {context};
        this.f24386a = objArr;
        this.f24387b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r9;
        int i3;
        ?? r10;
        ColorStateList colorStateList;
        int resourceId;
        f fVar = new f(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r9 = 1;
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z6 = false;
        boolean z9 = false;
        String str = null;
        while (!z6) {
            if (eventType == r9) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i3) {
                if (!z9) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    g gVar = fVar.f24360E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = gVar.f24388c.obtainStyledAttributes(attributeSet, a.f22418p);
                        fVar.f24362b = ObtainStyledAttributes.getResourceId(r9, 0);
                        fVar.f24363c = ObtainStyledAttributes.getInt(3, 0);
                        fVar.f24364d = ObtainStyledAttributes.getInt(4, 0);
                        fVar.f24365e = ObtainStyledAttributes.getInt(5, 0);
                        fVar.f24366f = ObtainStyledAttributes.getBoolean(2, r9);
                        fVar.g = ObtainStyledAttributes.getBoolean(0, r9);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = gVar.f24388c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22419q);
                        fVar.f24368i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        fVar.j = (typedArrayObtainStyledAttributes.getInt(5, fVar.f24363c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, fVar.f24364d) & DatagramKt.MAX_DATAGRAM_SIZE);
                        fVar.f24369k = typedArrayObtainStyledAttributes.getText(7);
                        fVar.f24370l = typedArrayObtainStyledAttributes.getText(8);
                        fVar.f24371m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        fVar.f24372n = string == null ? (char) 0 : string.charAt(0);
                        fVar.f24373o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
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
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z10 = string3 != null;
                        if (z10 && fVar.f24381w == 0 && fVar.f24382x == null) {
                            fVar.f24383z = (o) fVar.a(string3, f24385f, gVar.f24387b);
                        } else {
                            if (z10) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            fVar.f24383z = null;
                        }
                        fVar.f24356A = typedArrayObtainStyledAttributes.getText(17);
                        fVar.f24357B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            fVar.f24359D = AbstractC2569i0.b(typedArrayObtainStyledAttributes.getInt(19, -1), fVar.f24359D);
                        } else {
                            fVar.f24359D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1903s.x(context, resourceId)) == null) {
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
                        SubMenu subMenuAddSubMenu = fVar.f24361a.addSubMenu(fVar.f24362b, fVar.f24368i, fVar.j, fVar.f24369k);
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
                String name3 = xmlResourceParser.getName();
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
                            o oVar = fVar.f24383z;
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

    @Override
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof l)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z6 = false;
        try {
            try {
                layout = this.f24388c.getResources().getLayout(i3);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof l) {
                    l lVar = (l) menu;
                    if (!lVar.f24649p) {
                        lVar.w();
                        z6 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z6) {
                    ((l) menu).v();
                }
                layout.close();
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z6) {
                ((l) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
