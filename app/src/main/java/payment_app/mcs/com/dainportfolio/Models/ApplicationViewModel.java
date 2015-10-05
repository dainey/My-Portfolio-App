package payment_app.mcs.com.dainportfolio.Models;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import payment_app.mcs.com.dainportfolio.R;

/**
 * Created by ogayle on 03/10/2015.
 */
public class ApplicationViewModel extends RecyclerView.ViewHolder {

    TextView appName;
    TextView status;
    TextView description;
    TextView date;
    public View containerRef;


    public ApplicationViewModel(View itemView) {
        super(itemView);

        appName = (TextView) itemView.findViewById(R.id.app_name);
        status = (TextView) itemView.findViewById(R.id.app_status);
        description = (TextView) itemView.findViewById(R.id.app_short_description);
        date = (TextView) itemView.findViewById(R.id.app_completed_date);
        containerRef = itemView;
    }

    public void setAppName(String appName) {
        this.appName.setText(appName);
    }

    public void setDate(String date) {
        this.date.setText(date);
    }

    public void setDescription(String description) {
        this.description.setText(description);
    }

    public void setStatus(String status) {
        this.status.setText(status);
    }

    public void setStatusDrawable(int statusDrawableId) {
        this.status.setCompoundDrawablesWithIntrinsicBounds(statusDrawableId, 0, 0, 0);
    }

    public void setStatusColor(int statusColorId) {
        this.status.setTextColor(statusColorId);
    }
}
