package com.krswag.sling;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;


public class SlingBoxFragment extends ListFragment
{
    ListView inbox;

    private String[] names = new String[] { "Kartik Rathi",
        "Kaushik Ravikumar", "Kenny Yuan", "Kevin Hart", "Lisa Star",
        "Lyn Brook", "Maria Sharapova" };


    @Override
    public void onActivityCreated( Bundle savedInstanceState )
    {
        super.onActivityCreated( savedInstanceState );
        LayoutInflater inflater = (LayoutInflater)getActivity().getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        RelativeLayout mContainer = (RelativeLayout)inflater.inflate( R.layout.slingbox_fragment,
            null );
        inbox = (ListView)mContainer.findViewById( R.id.inbox );
        populateListView();
    }


    private void populateListView()
    {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.addAll( Arrays.asList( names ) );

        // Create ArrayAdapter using the planet list.
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>( getActivity(),
            R.layout.inbox_custom_list,
            nameList );
        inbox.setAdapter( listAdapter );

    }

}
