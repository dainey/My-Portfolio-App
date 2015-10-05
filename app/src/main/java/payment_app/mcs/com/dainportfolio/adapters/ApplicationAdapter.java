package payment_app.mcs.com.dainportfolio.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.zip.Inflater;

import payment_app.mcs.com.dainportfolio.Models.ApplicationDataModel;
import payment_app.mcs.com.dainportfolio.Models.ApplicationViewModel;
import payment_app.mcs.com.dainportfolio.R;

/**
 * Created by ogayle on 03/10/2015.
 */
public class ApplicationAdapter extends RecyclerView.Adapter<ApplicationViewModel> {


    private ArrayList<ApplicationDataModel> myApps;
    private Context mContext;

    public ApplicationAdapter(ArrayList<ApplicationDataModel> apps, Context _context) {
        myApps = new ArrayList<>();
        if (apps != null)
            myApps = apps;

        mContext = _context;
    }

    @Override
    public int getItemCount() {
        return myApps.size();
    }

    @Override
    public ApplicationViewModel onCreateViewHolder(ViewGroup parent, int viewType) {
        View appView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_app_summary, parent, false);
        return new ApplicationViewModel(appView);
    }

    @Override
    public void onBindViewHolder(ApplicationViewModel holder, final int position) {
        holder.setAppName(myApps.get(position).getName());
        holder.setDescription(myApps.get(position).getDescription());
        holder.setDate(myApps.get(position).getDate());

        switch (myApps.get(position).getStatus()) {
            case "Todo":
                holder.setStatusDrawable(R.drawable.ic_action_new_event);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    mContext.getResources().getColor(R.color.colorAccent, mContext.getTheme());
                else
                    mContext.getResources().getColor(R.color.colorAccent);
                break;
            case "In-Progress":
                holder.setStatusDrawable(R.drawable.ic_action_refresh);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    mContext.getResources().getColor(R.color.additionalAccentColor, mContext.getTheme());
                else
                    mContext.getResources().getColor(R.color.additionalAccentColor);
                break;
            case "Done":
                holder.setStatusDrawable(R.drawable.ic_action_accept);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    mContext.getResources().getColor(R.color.primaryColorDark, mContext.getTheme());
                else
                    mContext.getResources().getColor(R.color.primaryColorDark);
                break;
        }
        holder.setStatus(myApps.get(position).getStatus());

        holder.containerRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, String.format("Will launch %s or go to details to launch %s! ", myApps.get(position).getName(), myApps.get(position).getName()), Snackbar.LENGTH_SHORT)
                        .setAction("Launch", null).show();
            }
        });
    }
}
