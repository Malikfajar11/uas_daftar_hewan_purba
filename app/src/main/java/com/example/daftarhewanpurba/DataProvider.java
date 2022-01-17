package com.example.daftarhewanpurba;
import android.content.Context;

import com.example.daftarhewanpurba.model.Burung;
import com.example.daftarhewanpurba.model.Gajah;
import com.example.daftarhewanpurba.model.Hewan;
import com.example.daftarhewanpurba.model.Ikan;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Gajah> initDataGajah(Context ctx) {
        List<Gajah> gajahs = new ArrayList<>();
        gajahs.add(new Gajah(ctx.getString(R.string.string_american_mastodon_nama), ctx.getString(R.string.string_american_mastodon_asal),
                ctx.getString(R.string.string_american_mastodon_deskripsi), R.drawable.gajah1));
        gajahs.add(new Gajah(ctx.getString(R.string.string_amebelodon_nama), ctx.getString(R.string.string_amebelodon_asal),
                ctx.getString(R.string.string_amebelodon_deskripsi), R.drawable.gajah2));
        gajahs.add(new Gajah(ctx.getString(R.string.string_mammoth_berbulu_nama), ctx.getString(R.string.string_mammoth_berbulu_asal),
                ctx.getString(R.string.string_mammoth_berbulu_deskripsi), R.drawable.gajah3));
        gajahs.add(new Gajah(ctx.getString(R.string.string_deinotherium_nama), ctx.getString(R.string.string_deinotherium_asal),
                ctx.getString(R.string.string_deinotherium_deskripsi), R.drawable.gajah4));
        gajahs.add(new Gajah(ctx.getString(R.string.string_palaeomastodon_nama), ctx.getString(R.string.string_palaeomastodon_asal),
                ctx.getString(R.string.string_palaeomastodon_deskripsi), R.drawable.gajah5));
        gajahs.add(new Gajah(ctx.getString(R.string.string_stegomastodon_nama), ctx.getString(R.string.string_stegomastodon_asal),
                ctx.getString(R.string.string_stegomastodon_deskripsi), R.drawable.gajah6));
        return gajahs;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.string_andalgalornis_nama), ctx.getString(R.string.string_andalgalornis_asal),
                ctx.getString(R.string.string_andalgalornis_deskripsi), R.drawable.burung1));
        burungs.add(new Burung(ctx.getString(R.string.string_titanis_nama), ctx.getString(R.string.string_titanis_asal),
                ctx.getString(R.string.string_titanis_deskripsi), R.drawable.burung2));
        burungs.add(new Burung(ctx.getString(R.string.string_phorusracos_nama), ctx.getString(R.string.string_phorusracos_asal),
                ctx.getString(R.string.string_phorusracos_deskripsi), R.drawable.burung3));
        burungs.add(new Burung(ctx.getString(R.string.string_gastornis_nama), ctx.getString(R.string.string_gastornis_asal),
                ctx.getString(R.string.string_gastornis_deskripsi), R.drawable.burung4));
        burungs.add(new Burung(ctx.getString(R.string.string_argentavis_nama), ctx.getString(R.string.string_argentavis_asal),
                ctx.getString(R.string.string_argentavis_deskripsi), R.drawable.burung5));
        burungs.add(new Burung(ctx.getString(R.string.string_kelenken_nama), ctx.getString(R.string.string_kelenken_asal),
                ctx.getString(R.string.string_kelenken_deskripsi), R.drawable.burung3));
        return burungs;
    }

        private static List<Ikan> initDataIkan(Context ctx){
            List<Ikan> ikans = new ArrayList<>();
            ikans.add(new Ikan(ctx.getString(R.string.string_lancetfish_nama), ctx.getString(R.string.string_lancetfish_asal),
                    ctx.getString(R.string.string_lancetfish_deskripsi), R.drawable.ikan1));
            ikans.add(new Ikan(ctx.getString(R.string.string_arwana_nama), ctx.getString(R.string.string_arwana_asal),
                    ctx.getString(R.string.string_arwana_deskripsi), R.drawable.ikan2));
            ikans.add(new Ikan(ctx.getString(R.string.string_frilled_shark_nama), ctx.getString(R.string.string_frilled_shark_asal),
                    ctx.getString(R.string.string_frilled_shark_deskripsi), R.drawable.ikan3));
            ikans.add(new Ikan(ctx.getString(R.string.string_sturgeon_nama), ctx.getString(R.string.string_sturgeon_asal),
                    ctx.getString(R.string.string_sturgeon_deskripsi), R.drawable.ikan4));
            ikans.add(new Ikan(ctx.getString(R.string.string_sawfish_nama), ctx.getString(R.string.string_sawfish_asal),
                    ctx.getString(R.string.string_sawfish_deskripsi), R.drawable.ikan5));
            ikans.add(new Ikan(ctx.getString(R.string.string_coelacanthh_nama), ctx.getString(R.string.string_coelacanthh_asal),
                    ctx.getString(R.string.string_coelacanthh_deskripsi), R.drawable.ikan6));

            return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataGajah(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
