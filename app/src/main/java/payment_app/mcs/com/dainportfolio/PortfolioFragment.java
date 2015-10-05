package payment_app.mcs.com.dainportfolio;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import payment_app.mcs.com.dainportfolio.Models.ApplicationDataModel;
import payment_app.mcs.com.dainportfolio.adapters.ApplicationAdapter;


public class PortfolioFragment extends Fragment {


    public PortfolioFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getView() == null)
            return;


        RecyclerView rvAppList = (RecyclerView) getView().findViewById(R.id.app_list);
        StaggeredGridLayoutManager sgLm = new StaggeredGridLayoutManager
                (2, StaggeredGridLayoutManager.VERTICAL);

        sgLm.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);

        rvAppList.setLayoutManager(sgLm);

        ArrayList<ApplicationDataModel> apps = new ArrayList<>();
        ApplicationDataModel spotify = new ApplicationDataModel();
        spotify.setName("Spotify Streamer");
        spotify.setStatus("Todo");
        spotify.setDate("");
        spotify.setDescription("coming soon...");
        ApplicationDataModel scores = new ApplicationDataModel();
        scores.setName("Scores App");
        scores.setStatus("Todo");
        scores.setDate("");
        scores.setDescription("coming soon...");
        ApplicationDataModel library = new ApplicationDataModel();
        library.setName("Library App");
        library.setStatus("Todo");
        library.setDate("");
        library.setDescription("coming soon...");
        ApplicationDataModel buildItBigger = new ApplicationDataModel();
        buildItBigger.setName("Build it Bigger");
        buildItBigger.setStatus("Todo");
        buildItBigger.setDate("");
        buildItBigger.setDescription("coming soon...");
        ApplicationDataModel xyz = new ApplicationDataModel();
        xyz.setName("XYZ Reader");
        xyz.setStatus("Todo");
        xyz.setDate("");
        xyz.setDescription("coming soon...");
        ApplicationDataModel capStone = new ApplicationDataModel();
        capStone.setName("Capstone: Personal App");
        capStone.setStatus("Todo");
        capStone.setDate("");
        capStone.setDescription("coming soon...");


        apps.add(spotify);
        apps.add(scores);
        apps.add(library);
        apps.add(buildItBigger);
        apps.add(xyz);
        apps.add(capStone);
        ApplicationAdapter applicationAdapter = new ApplicationAdapter(apps, getActivity());

        rvAppList.setAdapter(applicationAdapter);


    }
}
