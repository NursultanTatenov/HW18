package com.company;

public class Main {

    public static void main(String[] args) {

        Apartment person1=new Apartment("Askar",77);
        Apartment person2=new Apartment("Mairam",74);
        Apartment person3=new Apartment("Bermet",49);
        Apartment person4=new Apartment("Saadat",42);
        Apartment person5=new Apartment("Ilim",38);

        System.out.print("      Akaev's family lives in ");
        System.out.println(Apartment.getAddress("Rublevka"));

        Person [] akaevsFamily={person1,person2,person3,person4,person5};

        System.out.println("The Akaev's family consists of "+akaevsFamily.length +" people");

        for (Person a:akaevsFamily
             ) {
            System.out.println(a);
        }

        Apartment apartment=new Apartment();
        System.out.println("Akaev's "+apartment.utilityPay()+" Apartment");


        Hotel person6=new Hotel("Kurmanbek",72);
        Hotel person7=new Hotel("Tatyana",71);
        Hotel person8=new Hotel("Marat",46);
        Hotel person9=new Hotel("Maksim",44);

        System.out.print("\n      Bakiev's family lives in ");
        System.out.println(Hotel.getAddress("Hotel BELARUS"));

        Person [] bakievsFamily={person6,person7,person8,person9};

        System.out.println("The Bakiev's family consists of "+bakievsFamily.length +" people");

        for (Person a:bakievsFamily
        ) {System.out.println(a);}

        Hotel hotel=new Hotel();
        System.out.println("Bakiev's "+hotel.rentPay()+" Hotel");



        Dormitory person10=new Dormitory("Roza",71);
        Dormitory person11=new Dormitory("Atay",41);

        System.out.print("\n      Otunbaev's family lives in ");
        System.out.println(Dormitory.getAddress(" Dormitory Politeha"));

        Person [] otunbaevsFamily={person10,person11};

        System.out.println("The Otunbaev's family consists of "+otunbaevsFamily.length +" people");

        for (Person a:otunbaevsFamily
        ) {System.out.println(a);}

        Dormitory dormitory=new Dormitory();
        System.out.println("Otunbaev's "+hotel.rentPay()+" Dormitory");








    }
}
