package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBImages;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBImages {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBImages.Companion INSTANCE = new com.kiptv.core.model.TMDBImages.Companion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20186d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f20187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f20189c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBImages$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBImages;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBImages$$serializer.INSTANCE;
        }
    }

    static {
        com.kiptv.core.model.TMDBImage$$serializer tMDBImage$$serializer = com.kiptv.core.model.TMDBImage$$serializer.INSTANCE;
        f20186d = new kotlinx.serialization.KSerializer[]{new p153r8.C2691d(tMDBImage$$serializer, 0), new p153r8.C2691d(tMDBImage$$serializer, 0), new p153r8.C2691d(tMDBImage$$serializer, 0)};
    }

    public /* synthetic */ TMDBImages(int i3, java.util.List list, java.util.List list2, java.util.List list3) {
        if ((i3 & 1) == 0) {
            this.f20187a = null;
        } else {
            this.f20187a = list;
        }
        if ((i3 & 2) == 0) {
            this.f20188b = null;
        } else {
            this.f20188b = list2;
        }
        if ((i3 & 4) == 0) {
            this.f20189c = null;
        } else {
            this.f20189c = list3;
        }
    }

    public static com.kiptv.core.model.TMDBImage a(com.kiptv.core.model.TMDBImages tMDBImages) {
        java.lang.Object next;
        java.util.List list = tMDBImages.f20187a;
        java.lang.Object obj = null;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                java.lang.String language = java.util.Locale.getDefault().getLanguage();
                if (language.length() == 0) {
                    language = "en";
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    java.lang.String lowerCase = ((com.kiptv.core.model.TMDBImage) obj2).f20180a.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    if (!O7.x.q0(lowerCase, ".svg", false)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    list = arrayList;
                }
                java.util.List listI1 = p078i6.o.I1(list, new com.kiptv.core.model.C1951k(2));
                java.util.Iterator it = listI1.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.TMDBImage) next).f20184e, language));
                com.kiptv.core.model.TMDBImage tMDBImage = (com.kiptv.core.model.TMDBImage) next;
                if (tMDBImage != null) {
                    return tMDBImage;
                }
                for (java.lang.Object obj3 : listI1) {
                    if (kotlin.jvm.internal.m.a(((com.kiptv.core.model.TMDBImage) obj3).f20184e, "en")) {
                        obj = obj3;
                        break;
                    }
                }
                com.kiptv.core.model.TMDBImage tMDBImage2 = (com.kiptv.core.model.TMDBImage) obj;
                return tMDBImage2 == null ? (com.kiptv.core.model.TMDBImage) p078i6.o.j1(listI1) : tMDBImage2;
            }
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBImages)) {
            return false;
        }
        com.kiptv.core.model.TMDBImages tMDBImages = (com.kiptv.core.model.TMDBImages) obj;
        return kotlin.jvm.internal.m.a(this.f20187a, tMDBImages.f20187a) && kotlin.jvm.internal.m.a(this.f20188b, tMDBImages.f20188b) && kotlin.jvm.internal.m.a(this.f20189c, tMDBImages.f20189c);
    }

    public final int hashCode() {
        java.util.List list = this.f20187a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.util.List list2 = this.f20188b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        java.util.List list3 = this.f20189c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBImages(logos=" + this.f20187a + ", posters=" + this.f20188b + ", backdrops=" + this.f20189c + ")";
    }
}
