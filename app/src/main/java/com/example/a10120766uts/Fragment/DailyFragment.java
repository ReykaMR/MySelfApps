package com.example.a10120766uts.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10120766uts.Adapter.DailyAdapter;
import com.example.a10120766uts.Adapter.FriendlistAdapter;
import com.example.a10120766uts.Model.DailyModel;
import com.example.a10120766uts.Model.FriendlistModel;
import com.example.a10120766uts.R;

import java.util.ArrayList;

/*
    Dikerjakan pada tanggal : 14 Mei 2023
    Dibuat oleh :
    NIM   : 10120766
    Nama  : Reyka Mochammad Raihan
    Kelas : IF-9
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
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

    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.daily_banguntidur, "Bangun Pagi", "bangun tidur maks jam 08.00");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.daily_makan, "Sarapan", "makan yang ada");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.daily_olahraga, "Olahraga", "olahraga saat mau saja");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.daily_kuliahonline, "Kuliah Online", "mengikuti pembelajaran online wajib!");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.daily_risetrobotik, "Riset", "belajar dari hal-hal yang berada di sekitar kita");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.daily_santai, "Istirahat", "mendengarkan lagu");
        dailyModel.add(daily6);
        DailyModel daily7 = new DailyModel(R.drawable.daily_weekend, "Akhir Pekan", "bersantai bersama keluarga dan pasangan");
        dailyModel.add(daily7);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.friend1, "Raafi");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.frienddefault, "Rafa");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.friend3, "Raziq");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.frienddefault, "Al");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.friend5, "Naura");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.friend6, "Ica");
        friendlistModel.add(friendlist6);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}