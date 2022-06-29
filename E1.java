public class E1 {

    public static void main(String[] args) {

        int compteur2;
        // E1
        for (int compteur = 1; compteur <= 20; compteur++) {

            if(compteur %2 != 0) {

                compteur2 = compteur;
                System.out.println(compteur2);//N'afficher les nombres impairs
            }
        }

    }
}

