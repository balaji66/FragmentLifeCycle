package com.durga.balaji66.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FragmentOne extends Fragment {

   View view;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(context, "onattach called", Toast.LENGTH_SHORT).show();
    }
    public FragmentOne()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"oncreate called", Toast.LENGTH_SHORT).show();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view= inflater.inflate(R.layout.fragment_fragment_one, container, false);
        Toast.makeText(getActivity(), "oncreateview called", Toast.LENGTH_SHORT).show();
    return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "onactivitycreated called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "onstart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "onresume called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "onpass called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getActivity(), "onsaveinstancestate called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getActivity(), "onstop called", Toast.LENGTH_SHORT).show();
    }
public void onDestroyView()
{
    super.onDestroyView();
    Toast.makeText(getActivity(), "ondestroyview called", Toast.LENGTH_SHORT).show();
}

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "ondestroy called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "ondetach called", Toast.LENGTH_SHORT).show();
    }

}
