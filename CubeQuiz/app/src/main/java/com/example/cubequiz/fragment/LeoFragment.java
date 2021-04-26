package com.example.cubequiz.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cubequiz.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeoFragment extends Fragment
{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button btngitLeo;
    View vistaL;

    public LeoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LeoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LeoFragment newInstance(String param1, String param2) {
        LeoFragment fragment = new LeoFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vistaL = inflater.inflate(R.layout.fragment_leo, container, false);

        btngitLeo = (Button) vistaL.findViewById(R.id.gitLeo);

        btngitLeo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirGitL();
            }
        });
        return vistaL;
    }

    private void abrirGitL()
    {
        Intent janela = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/leoangonese"));
        startActivity(janela);
    }
}