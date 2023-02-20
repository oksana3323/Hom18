public class Main {
    public static void main(String[] args) {
        Family[] family1 = {new Family("Oksana"),
                new Family("Aizat"),
                new Family("Sanjar"),
                new Family("Ernazar"),
                new Family("Erbol")};
        House house = new House("Saidilkan", family1, 123, 40.65, 25);
        System.out.println(house.toString());
        house.expenditure();

        Family[]family2 = {new Family("Gulmira"),
        new Family("Aibek"),
        new Family("Maksat"),
        new Family("Kairat")};
          Apartment apartment= new Apartment("Sydygalievy",family2,102,30,15,
                  20000);
        System.out.println(apartment.toString());
       apartment.expenditure();

        Family[] family3={new Family("Adilet"),
     new Family("Davran")};

    Hotel notel=new Hotel("Manas",family3,123,15,6,6000);
        System.out.println(notel.toString());
    notel.expenditure();
    }



    }


