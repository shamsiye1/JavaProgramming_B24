package day50_inheritance;

public class FlightTicket {

   private String type;
    private String departLocation;
    private String arriveLocation;

    public FlightTicket(String type, String departLocation, String arriveLocation){
        setType(type);
       // this.type=type;
        this.arriveLocation=arriveLocation;
        this.departLocation=departLocation;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if (type.equals("first") || type.equals("business") || type.equals("economy")){
            this.type = type;
        }

    }

    public String getDepartLocation() {
        return departLocation;
    }

    public void setDepartLocation(String departLocation) {
        this.departLocation = departLocation;
    }

    public String getArriveLocation() {
        return arriveLocation;
    }

    public void setArriveLocation(String arriveLocation) {
        this.arriveLocation = arriveLocation;
    }
}
