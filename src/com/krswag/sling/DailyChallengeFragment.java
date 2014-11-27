package com.krswag.sling;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;


public class DailyChallengeFragment extends ListFragment
{
    private ListView dailyChallengeList;

    private String[] names = new String[] { "Kartik Rathi",
        "Kaushik Ravikumar", "Kenny Yuan", "Kevin Hart", "Lisa Star",
        "Lyn Brook", "Maria Sharapova" };

    private String[] songs = new String[] { "In da Club", "Counting Stars",
        "Under Pressure", "Problems", "Shake it Off", "Swimming Pools",
        "I'm Different" };


    @Override
    public void onActivityCreated( Bundle savedInstanceState )
    {
        super.onActivityCreated( savedInstanceState );
        LayoutInflater inflater = (LayoutInflater)getActivity().getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        RelativeLayout mContainer = (RelativeLayout)inflater.inflate( R.layout.slingbox_fragment,
            null );
        dailyChallengeList = (ListView)mContainer.findViewById( R.id.dailyChallengeList );
        populateListView();
    }


    private void populateListView()
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.addAll( Arrays.asList( names ) );

        // Create ArrayAdapter using the planet list.
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>( getActivity(),
            R.layout.dailychallenge_custom_list,
            nameList );
        dailyChallengeList.setAdapter( listAdapter );
    }

}
