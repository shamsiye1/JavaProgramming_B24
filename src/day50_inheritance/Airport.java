package day50_inheritance;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket= new FlightTicket("private jet","new york","florida");

       // we cannot access directly
       // ticket.type;
       // ticket.departLocation;
       // ticket.arriveLocation;

        System.out.println(ticket.getType());
        System.out.println(ticket.getDepartLocation());
        System.out.println(ticket.getArriveLocation());


    }
}
