package payment_app.mcs.com.dainportfolio.Models;

/**
 * Created by ogayle on 03/10/2015.
 */
public class ApplicationDataModel {

    private String name;
    private String description;
    private String status;
    private String date;

    public String getDate() {
        if(date.isEmpty())
            return "--:--";
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
