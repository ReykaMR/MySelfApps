package com.example.a10120766uts.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.a10120766uts.AboutDialog;
import com.example.a10120766uts.R;

/*
    Dikerjakan pada tanggal : 17 Mei 2023
    Dibuat oleh :
    NIM   : 10120766
    Nama  : Reyka Mochammad Raihan
    Kelas : IF-9
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ImageView ivFacebook, ivInstagram, ivTwitter, ivWhatsapp, ivGmail, ivMap;
    TextView tvPhone, tvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        ivFacebook = root.findViewById(R.id.iv_facebook);
        ivInstagram = root.findViewById(R.id.iv_instagram);
        ivTwitter = root.findViewById(R.id.iv_twitter);
        ivWhatsapp = root.findViewById(R.id.iv_whatsapp);
        ivGmail = root.findViewById(R.id.iv_gmail);
        ivMap = root.findViewById(R.id.iv_map);
        tvPhone = root.findViewById(R.id.tv_phone);
        tvAbout = root.findViewById(R.id.tv_about);

        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent();
                fb.setAction(Intent.ACTION_VIEW);
                fb.addCategory(Intent.CATEGORY_BROWSABLE);
                fb.setData(Uri.parse("https://www.facebook.com/reyka.mochr.3"));
                startActivity(fb);
            }
        });

        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig = new Intent();
                ig.setAction(Intent.ACTION_VIEW);
                ig.addCategory(Intent.CATEGORY_BROWSABLE);
                ig.setData(Uri.parse("https://www.instagram.com/reyka_mr/"));
                startActivity(ig);
            }
        });

        ivTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tw = new Intent();
                tw.setAction(Intent.ACTION_VIEW);
                tw.addCategory(Intent.CATEGORY_BROWSABLE);
                tw.setData(Uri.parse("https://twitter.com/"));
                startActivity(tw);
            }
        });

        ivWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wa = new Intent();
                wa.setAction(Intent.ACTION_VIEW);
                wa.addCategory(Intent.CATEGORY_BROWSABLE);
                wa.setData(Uri.parse("https://api.whatsapp.com/send?phone=628882124339"));
                startActivity(wa);
            }
        });

        ivGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gm = new Intent();
                gm.setAction(Intent.ACTION_VIEW);
                gm.addCategory(Intent.CATEGORY_BROWSABLE);
                gm.setData(Uri.parse("mailto:reykamr50@gmail.com"));
                startActivity(gm);
            }
        });

        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent();
                map.setAction(Intent.ACTION_VIEW);
                map.addCategory(Intent.CATEGORY_BROWSABLE);
                map.setData(Uri.parse("https://www.google.com/maps/place/6%C2%B057'04.1%22S+107%C2%B036'17.5%22E/@-6.9511984,107.6047627,20z/data=!4m4!3m3!8m2!3d-6.951139!4d107.604855"));
                startActivity(map);
            }
        });

        tvPhone.setText(" 08882124339");
        Linkify.addLinks(tvPhone, Linkify.PHONE_NUMBERS);

        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutDialog aboutDialog = new AboutDialog();
                aboutDialog.show(getFragmentManager(),"AboutDialogFragment");
            }
        });

        return root;
    }
}