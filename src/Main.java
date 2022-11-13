import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocationData[] locationData = LocationData.values();
        for (LocationData locationDatum : locationData) {
            System.out.println(locationDatum.toString() + " ip: " + locationDatum.getIp());
        }

        Products[] products = Products.values();
        for (Products product : products) {
//            do some test
//            getProductUrl()
            System.out.println("my autest take url" + product.PROD_URL);
            System.out.println("my product location is: " + product.PR_LOCATION);
        }

        Products pr1 = Products.valueOf(Products.P1.name());
        Products pr2 = Products.valueOf(Products.P2.name());
        Products pr3 = Products.valueOf(Products.P3.name());

        checkProduct(pr1);
        checkProduct(pr2);
        checkProduct(pr3);



//        LocationData location = LocationData.valueOf(LocationData.GBR.name());
//        System.out.println("City: " + location.getCity() + " ip: " + location.getIp());
//
//        switch (locationData[0]) {
//            case GBR:
//                System.out.println("gbr");
//                break;
//            case AUS:
//                System.out.println("aus");
//        }
    }

    public static final String checkProduct(Products productName) {
        switch (productName) {
            case P1:
            System.out.println("This is case one");
                return "This is case one. Make additional check";
            case P2:
                System.out.println("do this for product 2");
                return "do this for product 2. Absent additional event";
            default:
                return "I do this for all another products";
        }
    }

    enum Products {
        P1("p1Url", "s", "n1"),
        P2("p2Url", "s", "n2"),
        P3("p3Url", "s", "n3"),
        P4("p4Url", "s", "n4");

        private final String PROD_URL;
        private final String STAGE_URL;
        private final String PR_LOCATION;

        Products(String prod, String stage, String location) {
            PROD_URL = prod;
            STAGE_URL = stage;
            PR_LOCATION = location;
        }
    }

    enum LocationData {
        GBR("London", "213.171.197.181"),
        USA("New York", "69.147.251.50"),
        AUS("Sydney", "223.252.33.75"),
        NZL("New Roads", "49.50.242.137"),
        IRL("Dublin", "176.34.184.134"),
        BRA("Brasilia", "81.95.121.251");

        private final String city;
        private final String ip;

        LocationData(String city, String ip) {
            this.city = city;
            this.ip = ip;
        }

        public String getCity() {
            return this.city;
        }

        public String getIp() {
            return this.ip;
        }
    }
}